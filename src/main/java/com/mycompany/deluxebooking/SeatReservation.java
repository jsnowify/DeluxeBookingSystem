package com.mycompany.deluxebooking;

import javax.swing.*;
import javax.swing.border.TitledBorder;
import java.awt.*;

public class SeatReservation extends JFrame {
    private final Flight flight;
    private final SeatGridPanel gridPanel;
    private final JLabel selectedSeatLabel = new JLabel("-");
    private final JButton continueButton = new JButton("Continue");

    public SeatReservation(Flight flight) {
        this.flight = flight;
        setTitle("Seat Reservation");
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        // build UI
        gridPanel = new SeatGridPanel(5, 5, e -> onSeatSelected(e.getActionCommand()));
        initComponents();

        pack();
        setLocationRelativeTo(null);
    }

    private void initComponents() {
        // — Header —
        JLabel header = new JLabel("Choose available seats", SwingConstants.CENTER);
        header.setFont(new Font("Inter", Font.BOLD, 24));
        JPanel north = new JPanel(new BorderLayout());
        north.add(header, BorderLayout.NORTH);
        north.add(new JLabel("Seats"), BorderLayout.SOUTH);

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

        continueButton.setEnabled(false);
        continueButton.addActionListener(e -> onContinue());

        JPanel south = new JPanel(new BorderLayout());
        south.setBorder(BorderFactory.createEmptyBorder(0, 10, 10, 10));
        south.add(summary, BorderLayout.WEST);
        south.add(continueButton, BorderLayout.EAST);

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
        if (!pay.isPaid()) {
            return;
        }

        JButton btn = gridPanel.getSelectedButton();
        btn.setBackground(Color.RED);
        btn.setEnabled(false);

        JOptionPane.showMessageDialog(
            this,
            "✅ Booking confirmed!\n"
          + "Flight: " + flight.getFlightNumber() + "\n"
          + "Seat:   " + seat + "\n"
          + "Paid:   " + flight.getPrice()
        );

        dispose();
    }
}
