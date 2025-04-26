package com.mycompany.deluxebooking;

import javax.swing.*;
import java.awt.*;

public class PaymentDialog extends JDialog {
    private boolean paid = false;

    /**
     * @param owner    the parent frame (modal)
     * @param price    the flight price string
     * @param seatCode the selected seat code
     */
    public PaymentDialog(Frame owner, String price, String seatCode) {
        super(owner, "Payment", true);
        initUI(price, seatCode);
        pack();
        setLocationRelativeTo(owner);
    }

    private void initUI(String price, String seatCode) {
        JLabel msg = new JLabel(
            "<html><body style='padding:10px;'>"
          + "You are booking <b>seat " + seatCode + "</b><br>"
          + "Price: <b>" + price + "</b><br><br>"
          + "Proceed to pay?"
          + "</body></html>"
        );
        msg.setFont(new Font("Inter", Font.PLAIN, 14));

        JButton payBtn = new JButton("Pay Now");
        JButton cancelBtn = new JButton("Cancel");

        payBtn.addActionListener(e -> {
            paid = true;
            dispose();
        });
        cancelBtn.addActionListener(e -> dispose());

        JPanel btnPanel = new JPanel(new FlowLayout(FlowLayout.RIGHT, 10, 0));
        btnPanel.add(cancelBtn);
        btnPanel.add(payBtn);

        getContentPane().setLayout(new BorderLayout(10, 10));
        getContentPane().add(msg, BorderLayout.CENTER);
        getContentPane().add(btnPanel, BorderLayout.SOUTH);
    }

    /** @return true if the user clicked “Pay Now” */
    public boolean isPaid() {
        return paid;
    }
}
