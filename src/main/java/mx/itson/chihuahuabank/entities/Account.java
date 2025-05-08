
package mx.itson.chihuahuabank.entities;

// @authors: Andrey, 02, 03, 04

import com.google.gson.annotations.SerializedName;
import java.util.List;


public class Account
{
    
    private String product;
    @SerializedName ("account-number")
    private String accountNumber;
    private String currency;
    @SerializedName ("account-holder")
    private AccountHolder accountHolder;
    private List<Transaction> transactions;
    
}
