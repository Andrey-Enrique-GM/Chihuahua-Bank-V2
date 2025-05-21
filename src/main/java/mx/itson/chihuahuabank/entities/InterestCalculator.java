
package mx.itson.chihuahuabank.entities;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Comparator;
import java.util.Date;
import java.util.List;
import mx.itson.chihuahuabank.enums.TransactionType;

// @author Andrey

public class InterestCalculator {
    
    public static List<Transaction> generateTransactionsWithInterest(List<Transaction> original, double rate)
    {
        List<Transaction> result = new ArrayList<>();

        // Sorts the list of transactions by date in ascending order (earliest to latest)
        original.sort(Comparator.comparing(Transaction::getDate));

        double currentBalance = 0;

        for (int i = 0; i < original.size(); i++) {
            Transaction current = original.get(i);
            Date currentDate = current.getDate();

            /*
            If not the first transaction, generate daily interest transactions
            between the previous and current transaction dates.
            */
            if (i > 0) {
                Date previousDate = original.get(i - 1).getDate();
                Calendar cal = Calendar.getInstance();
                cal.setTime(previousDate);

                while (true) {
                    cal.add(Calendar.DAY_OF_MONTH, 1);
                    Date nextDay = cal.getTime();

                    if (!nextDay.before(currentDate)) break;

                    // Calculates the daily interest based on the current balance and interest rate
                    double interest = currentBalance * rate;

                    Transaction interestTransaction = new Transaction();
                    interestTransaction.setDate(nextDay);
                    interestTransaction.setReference("N/A");
                    interestTransaction.setDescription("Daily growth");
                    interestTransaction.setAmount(interest);
                    interestTransaction.setType(TransactionType.ABONO);

                    result.add(interestTransaction);

                    // Updates the current balance by adding the calculated daily interest
                    currentBalance += interest;
                }
            }

            // Adds the current transaction to the result list
            result.add(current);

            /*
            Updates the current balance by adding or subtracting the transaction
            amount depending on its type (credit or debit).
            */
            if (current.getType() == TransactionType.ABONO) {
                currentBalance += current.getAmount();
            } else {
                currentBalance -= current.getAmount();
            }
        }

        return result;
    }
    
}
