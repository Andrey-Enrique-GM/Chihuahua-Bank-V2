/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.itson.chihuahuabank.entities;

import java.text.DecimalFormat;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author Andrey
 */
public class InterestRateManager
{
    
    private double interestRate = 0;

    public void promptAndSetInterestRate(JLabel label) {
        String input = JOptionPane.showInputDialog("Enter daily interest rate (%):");
        if (input != null && !input.isEmpty()) {
            try {
                interestRate = Double.parseDouble(input);
                // hasta 18 decimales sin notacion cientifica
                DecimalFormat df = new DecimalFormat("#.################");
                label.setText("Interest Rate: " + df.format(interestRate));
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(null, "Please enter a valid number.");
            }
        }
    }
    
    // metodo para conseguir la tasa de interes
    public double getInterestRate() {
        return interestRate;
    }
    
}
