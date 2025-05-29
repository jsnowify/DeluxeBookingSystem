package com.mycompany.deluxebooking;

import javax.swing.*;
import javax.swing.border.*;
import java.awt.*;
import java.text.ParseException;
import javax.swing.text.MaskFormatter;

public class PaymentDialog extends JDialog {
    private boolean paid = false;

    private final JTextField cardNumberField = new JTextField();
    private final JFormattedTextField expiryField;
    private final JPasswordField cvvField = new JPasswordField();

    public PaymentDialog(Frame owner, String price, String seatCode) {
        super(owner, "Secure Payment", true);

        // Mask MM/YY
        MaskFormatter mf = null;
        try {
            mf = new MaskFormatter("##/##");
            mf.setPlaceholderCharacter('_');
        } catch (ParseException ignored) {}
        expiryField = new JFormattedTextField(mf);

        initUI(price, seatCode);
        pack();
        setResizable(false);
        setLocationRelativeTo(owner);
    }

    private void initUI(String price, String seatCode) {
        getContentPane().setLayout(new BorderLayout(10, 10));
        getContentPane().setBackground(Color.WHITE);

        // --- HEADER ---
        JLabel title = new JLabel("Enter Payment Details");
        title.setFont(new Font("Inter", Font.BOLD, 18));
        title.setBorder(new EmptyBorder(15, 20, 5, 0));

        // --- MAIN PANEL ---
        JPanel mainPanel = new JPanel(new GridBagLayout());
        mainPanel.setBorder(new EmptyBorder(10, 25, 10, 25));
        mainPanel.setBackground(Color.WHITE);
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(10, 5, 10, 5);
        gbc.anchor = GridBagConstraints.WEST;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.gridx = 0;

        // Row 0: Seat
        gbc.gridy = 0;
        mainPanel.add(new JLabel("Seat Code:"), gbc);
        gbc.gridx = 1;
        mainPanel.add(new JLabel(seatCode), gbc);

        // Row 1: Price
        gbc.gridx = 0; gbc.gridy++;
        mainPanel.add(new JLabel("Ticket Price:"), gbc);
        gbc.gridx = 1;
        mainPanel.add(new JLabel(price), gbc);

        // Row 2: Card Number
        gbc.gridx = 0; gbc.gridy++;
        mainPanel.add(new JLabel("Card Number:"), gbc);
        gbc.gridx = 1;
        cardNumberField.setColumns(16);
        mainPanel.add(cardNumberField, gbc);

        // Row 3: Expiry
        gbc.gridx = 0; gbc.gridy++;
        mainPanel.add(new JLabel("Expiry (MM/YY):"), gbc);
        gbc.gridx = 1;
        expiryField.setColumns(5);
        mainPanel.add(expiryField, gbc);

        // Row 4: CVV
        gbc.gridx = 0; gbc.gridy++;
        mainPanel.add(new JLabel("CVV:"), gbc);
        gbc.gridx = 1;
        cvvField.setColumns(3);
        mainPanel.add(cvvField, gbc);

        // --- BUTTON PANEL ---
        JButton payBtn = new JButton("Pay Now");
        JButton cancelBtn = new JButton("Cancel");
        payBtn.setPreferredSize(new Dimension(110, 35));
        cancelBtn.setPreferredSize(new Dimension(110, 35));

        payBtn.addActionListener(e -> onPay());
        cancelBtn.addActionListener(e -> dispose());

        JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.RIGHT, 15, 10));
        buttonPanel.setBackground(Color.WHITE);
        buttonPanel.add(cancelBtn);
        buttonPanel.add(payBtn);

        // Add to dialog
        getContentPane().add(title, BorderLayout.NORTH);
        getContentPane().add(mainPanel, BorderLayout.CENTER);
        getContentPane().add(buttonPanel, BorderLayout.SOUTH);
    }

    private void onPay() {
        if (cardNumberField.getText().trim().length() < 12 ||
            expiryField.getText().contains("_") ||
            cvvField.getPassword().length < 3) {

            JOptionPane.showMessageDialog(
                this,
                "Please complete all fields correctly.",
                "Payment Error",
                JOptionPane.WARNING_MESSAGE
            );
            return;
        }

        // Simulated payment logic
        paid = true;
        dispose();
    }

    public boolean isPaid() {
        return paid;
    }
}
