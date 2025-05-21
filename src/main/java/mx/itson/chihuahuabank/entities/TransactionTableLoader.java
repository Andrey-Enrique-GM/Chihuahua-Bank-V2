
package mx.itson.chihuahuabank.entities;

import java.text.SimpleDateFormat;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import mx.itson.chihuahuabank.enums.TransactionType;

// @author Andrey

public class TransactionTableLoader
{
    
    /**
    * Loads a list of {@link Transaction} objects into a {@link DefaultTableModel},
    * sorting them by date and calculating a running balance.
    *
    * This method clears the existing rows in the table model, sorts the transactions
    * by date in ascending order, and then adds each transaction as a new row with formatted
    * date, reference, description, charge (if applicable), deposit (if applicable), and
    * the running balance.
    *
    * @param model the {@code DefaultTableModel} to populate with transaction data.
    * @param transactions the list of {@code Transaction} objects to be displayed.
    */
    public static void loadTransactionsIntoTable(DefaultTableModel model, List<Transaction> transactions) {
        // Clear the table model
        model.setRowCount(0);
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd 'de 'MMMM' de 'yyyy");

        // Sort transactions by date in ascending order
        Collections.sort(transactions, Comparator.comparing(Transaction::getDate));
        
        // saldo inicial en 0
        double balance = 0;
        
        for (Transaction t : transactions) {
            // Format the date, or provide a fallback if it's null
            String formattedDate = (t.getDate() != null) ? dateFormat.format(t.getDate()) : "Date not available";
            
            String charge = "";
            String deposit = "";
            
            // Determine type of transaction and update balance accordingly
            if (t.getType() == TransactionType.CARGO) {
                charge = String.valueOf(t.getAmount());
                balance -= t.getAmount();   // Subtract charges
            } else if (t.getType() == TransactionType.ABONO) {
                deposit = String.valueOf(t.getAmount());
                balance += t.getAmount();   // Add deposits
            }
            
            // Add the transaction data as a new row in the table model
            model.addRow(new Object[] {
                formattedDate,
                t.getReference(),
                t.getDescription(),
                charge,
                deposit,
                String.format("%.2f", balance)});  // Format balance to 2 decimal places
        }
    }
    
}
