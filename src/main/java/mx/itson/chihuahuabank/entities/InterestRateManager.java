/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.itson.chihuahuabank.entities;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import mx.itson.chihuahuabank.enums.TransactionType;

/**
 *
 * @author Andrey
 */
public class InterestRateManager
{
    // ESTO MUESTRA LA TASA DE INTERES EN UN JLABEL
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
    
    /*============================
    // ESTO HACE LA GENERACION DE TODOS LOS DIAS FALTANTES DEL JSON Y CALCULA EL INTERES DIARIO
    private double dailyInterestRate;
    private static final SimpleDateFormat DATE_FORMAT = new SimpleDateFormat("dd 'de 'MMMM' de 'yyyy");

    /**
     * Muestra un diálogo para ingresar la tasa diaria y actualiza el JLabel.
     */
    /*===================================
    public void promptAndSetInterestRate(JLabel,lblInterestRate) {
        String input = JOptionPane.showInputDialog(null, "Ingresa la tasa de interés diario (por ejemplo, 0.0004):");
        if (input == null || input.trim().isEmpty()) {
            return; // usuario canceló o no ingresó nada
        }
        try {
            dailyInterestRate = Double.parseDouble(input);
            lblInterestRate.setText(input);
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "Formato de tasa inválido.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    /**
     * Llena los días faltantes entre transacciones según la tasa diaria.
     *
     * @param transactions Lista original de transacciones sin días intermedios.
     * @return Nueva lista con las transacciones originales y las de crecimiento diario.
     */
    /*==============================
    public List<Transaction> fillMissingDays(List<Transaction> transactions) {
        if (transactions == null || transactions.isEmpty()) {
            return Collections.emptyList();
        }

        // Aseguramos orden por fecha
        List<Transaction> sorted = new ArrayList<>(transactions);
        Collections.sort(sorted, Comparator.comparing(Transaction::getDate));

        List<Transaction> result = new ArrayList<>();
        double balance = 0;
        Date prevDate = null;

        for (Transaction t : sorted) {
            if (prevDate != null) {
                Calendar cal = Calendar.getInstance();
                cal.setTime(prevDate);
                cal.add(Calendar.DAY_OF_MONTH, 1);
                Date nextExpected = cal.getTime();

                // Insertar días faltantes
                while (nextExpected.before(t.getDate())) {
                    double interestAmount = balance * dailyInterestRate;
                    balance += interestAmount;

                    Transaction growth = new Transaction();
                    growth.setDate(nextExpected);
                    growth.setReference("N/A");
                    growth.setDescription("Crecimiento diario");
                    growth.setType(TransactionType.ABONO);
                    growth.setAmount(interestAmount);

                    result.add(growth);

                    // avanzar un día más
                    cal.add(Calendar.DAY_OF_MONTH, 1);
                    nextExpected = cal.getTime();
                }
            }

            // Procesar la transacción original
            if (t.getType() == TransactionType.CARGO) {
                balance -= t.getAmount();
            } else if (t.getType() == TransactionType.ABONO) {
                balance += t.getAmount();
            }
            result.add(t);
            prevDate = t.getDate();
        }

        return result;
    }
    ========================*/
    
}
