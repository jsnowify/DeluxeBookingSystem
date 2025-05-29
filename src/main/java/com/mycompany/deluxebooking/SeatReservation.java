package com.mycompany.deluxebooking;

import javax.swing.*;
import javax.swing.border.TitledBorder;
import java.awt.*;
import java.util.LinkedList;
import java.util.Queue;

public class SeatReservation extends JFrame {
    private final Flight flight;
    private final SeatGridPanel gridPanel;
    private final JLabel selectedSeatLabel = new JLabel("-");
    private final JButton continueButton = new JButton("Continue");
    private final JButton joinListButton = new JButton("Join Waiting List");
    private final JButton viewWaitingListButton = new JButton("View Waiting List");

    // Global waiting list queue
    private static final Queue<WaitingRequest> waitingQueue = new LinkedList<>();

    public SeatReservation(Flight flight) {
        this.flight = flight;
        setTitle("Seat Reservation");
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        gridPanel = new SeatGridPanel(5, 5, e -> onSeatSelected(e.getActionCommand()));
        initComponents();

        pack();
        setLocationRelativeTo(null);
    }

    private void initComponents() {
        // Header
        JLabel header = new JLabel("Choose available seats", SwingConstants.CENTER);
        header.setFont(new Font("Inter", Font.BOLD, 24));
        JPanel north = new JPanel(new BorderLayout());
        north.add(header, BorderLayout.NORTH);
        north.add(new JLabel("Seats"), BorderLayout.SOUTH);

        // Summary Panel
        JPanel summary = new JPanel(new GridLayout(4, 2, 5, 5));
        summary.setBorder(BorderFactory.createTitledBorder(
            BorderFactory.createEtchedBorder(),
            "Payment & Confirmation",
            TitledBorder.LEFT, TitledBorder.TOP,
            new Font("Inter", Font.BOLD, 16)
        ));
        summary.add(new JLabel("Flight:"));        summary.add(new JLabel(flight.getFlightNumber()));
        summary.add(new JLabel("Time:"));          summary.add(new JLabel(flight.getDepartureTime() + " – " + flight.getArrivalTime()));
        summary.add(new JLabel("Selected seat:")); summary.add(selectedSeatLabel);
        summary.add(new JLabel("Total Price:"));   summary.add(new JLabel(flight.getPrice()));

        // Buttons
        continueButton.setEnabled(false);
        continueButton.addActionListener(e -> onContinue());

        joinListButton.setEnabled(!gridPanel.hasAvailableSeats());
        joinListButton.addActionListener(e -> onJoinWaitingList());

        viewWaitingListButton.addActionListener(e -> showWaitingListDialog());

        JPanel btnPanel = new JPanel(new FlowLayout(FlowLayout.RIGHT, 10, 0));
        btnPanel.add(viewWaitingListButton);
        btnPanel.add(joinListButton);
        btnPanel.add(continueButton);

        JPanel south = new JPanel(new BorderLayout());
        south.setBorder(BorderFactory.createEmptyBorder(0, 10, 10, 10));
        south.add(summary, BorderLayout.WEST);
        south.add(btnPanel, BorderLayout.EAST);

        // Layout
        Container cp = getContentPane();
        cp.setLayout(new BorderLayout());
        cp.add(north, BorderLayout.NORTH);
        cp.add(gridPanel, BorderLayout.CENTER);
        cp.add(south, BorderLayout.SOUTH);
    }

    private void onSeatSelected(String seatCode) {
        selectedSeatLabel.setText(seatCode);
        continueButton.setEnabled(true);
    }

    private void onContinue() {
        String seat = gridPanel.getSelectedSeat();
    PaymentDialog pay = new PaymentDialog(this, flight.getPrice(), seat);
    pay.setVisible(true);

    if (!pay.isPaid()) return;

    // Mark reserved
    JButton btn = gridPanel.getSelectedButton();
    btn.setBackground(Color.RED);
    btn.setEnabled(false);

    // --- START: Add this code to update seat availability ---
    String flightNumber = flight.getFlightNumber(); // Get the flight number
    if (SearchFlight.seatAvailabilityMap.containsKey(flightNumber)) {
        int currentSeats = SearchFlight.seatAvailabilityMap.get(flightNumber);
        if (currentSeats > 0) {
            SearchFlight.seatAvailabilityMap.put(flightNumber, currentSeats - 1);
        }
    }
    // --- END: Added code ---

    JOptionPane.showMessageDialog(
        this,
        "✅ Booking confirmed!\n" +
        "Flight: " + flight.getFlightNumber() + "\n" +
        "Seat:   " + seat + "\n" +
        "Paid:   " + flight.getPrice()
    );

    // Enable waiting list if all booked
    joinListButton.setEnabled(!gridPanel.hasAvailableSeats());
    }

    private void onJoinWaitingList() {
        String name = JOptionPane.showInputDialog(this, "Enter your name to join the waiting list:");
        if (name != null && !name.trim().isEmpty()) {
            waitingQueue.offer(new WaitingRequest(flight.getFlightNumber(), name.trim()));
            JOptionPane.showMessageDialog(
                this,
                "You’ve been added to the waiting list.\nPosition: " + waitingQueue.size()
            );
            joinListButton.setEnabled(false);
        }
    }

    private void showWaitingListDialog() {
        if (waitingQueue.isEmpty()) {
            JOptionPane.showMessageDialog(this, "The waiting list is currently empty.");
            return;
        }

        StringBuilder listBuilder = new StringBuilder("<html><h3>Waiting List</h3><ul>");
        int position = 1;
        for (WaitingRequest req : waitingQueue) {
            listBuilder.append("<li>")
                       .append("Position ").append(position++)
                       .append(": ").append(req.userName)
                       .append(" (Flight ").append(req.flightNumber).append(")")
                       .append("</li>");
        }
        listBuilder.append("</ul></html>");

        JLabel content = new JLabel(listBuilder.toString());
        JScrollPane scrollPane = new JScrollPane(content);
        scrollPane.setPreferredSize(new Dimension(400, 250));

        JOptionPane.showMessageDialog(this, scrollPane, "Waiting List", JOptionPane.INFORMATION_MESSAGE);
    }

    public static void processWaitingList() {
        if (waitingQueue.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Waiting list is empty.");
            return;
        }
        WaitingRequest req = waitingQueue.poll();
        JOptionPane.showMessageDialog(
            null,
            "Notifying " + req.userName +
            " that seats are available on flight " + req.flightNumber
        );
    }

    private static class WaitingRequest {
        final String flightNumber;
        final String userName;

        WaitingRequest(String flightNumber, String userName) {
            this.flightNumber = flightNumber;
            this.userName = userName;
        }
    }
}
