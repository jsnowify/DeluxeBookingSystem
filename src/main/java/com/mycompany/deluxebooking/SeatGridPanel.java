package com.mycompany.deluxebooking;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class SeatGridPanel extends JPanel {
    private JButton selectedButton;
    private String selectedSeat;
    private final ActionListener listener;
    private static final double UNAVAILABLE_PROB = 0.2; // 20% seats start unavailable

    /**
     * @param rows     number of seat‐rows (e.g. 5)
     * @param cols     number of seat‐columns (e.g. 5)
     * @param listener will be called with ActionEvent.getActionCommand()==seatCode
     */
    public SeatGridPanel(int rows, int cols, ActionListener listener) {
        this.listener = listener;
        setLayout(new GridLayout(rows, cols, 10, 10));
        setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        initSeats(rows, cols);
    }

    private void initSeats(int rows, int cols) {
        Random rand = new Random();
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                String code = String.format("%c%d", 'A' + i, j + 1);
                JButton btn = new JButton(code);
                btn.setPreferredSize(new Dimension(60, 60));
                btn.setOpaque(true);
                btn.setBorder(BorderFactory.createLineBorder(Color.BLACK));

                if (rand.nextDouble() < UNAVAILABLE_PROB) {
                    btn.setBackground(Color.RED);
                    btn.setEnabled(false);
                } else {
                    btn.setBackground(new Color(102, 255, 102));
                    btn.addActionListener(e -> selectSeat(btn, code));
                }

                add(btn);
            }
        }
    }

    private void selectSeat(JButton btn, String code) {

        if (selectedButton != null) {
            selectedButton.setBackground(new Color(102, 255, 102));
        }
        selectedButton = btn;
        selectedSeat = code;
        btn.setBackground(Color.YELLOW);

        listener.actionPerformed(new ActionEvent(this, ActionEvent.ACTION_PERFORMED, code));
    }

    /** @return the code of the selected seat, or null if none yet */
    public String getSelectedSeat() {
        return selectedSeat;
    }

    /** @return the JButton instance for the selected seat */
    public JButton getSelectedButton() {
        return selectedButton;
    }
}
