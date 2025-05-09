
package mx.itson.chihuahuabank.entities;

// @authors: Andrey, 02, 03, 04

import com.google.gson.Gson;
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
    
     public static Account deserialize(String json){
    Account A = new Account();
    try{
        Gson gson = new Gson();
        A = gson.fromJson(json, Account.class);
    }catch (Exception ex){
        System.err.println("Error "+ ex.getMessage());
    } return A;
        
    }
}
