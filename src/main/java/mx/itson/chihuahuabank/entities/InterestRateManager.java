
package mx.itson.chihuahuabank.entities;

// @author Andrey

public class InterestRateManager
{
    // The daily interest rate used for calculating interest accrual on account balances.
    private double dailyInterestRate;

    /**
    * Sets the daily interest rate.
    *
    * @param rate the interest rate to be applied daily (e.g., 0.0015 for 0.15%)
    */
    public void setDailyInterestRate(double rate) {
        this.dailyInterestRate = rate;
    }

    /**
    * Returns the currently set daily interest rate.
    *
    * @return the daily interest rate
    */
    public double getDailyInterestRate() {
        return dailyInterestRate;
    }
    
}
