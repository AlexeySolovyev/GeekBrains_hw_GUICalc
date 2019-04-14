package CalculatorGUI;

import javax.swing.*;

    class TestCalculator {
        public static void main(String[] args) {
            Calculator g = new Calculator("Калькулятор");
            g.setVisible(true);
            g.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            g.setSize(290, 270);
            g.setResizable(false);
            g.setLocationRelativeTo(null);
        }
    }

