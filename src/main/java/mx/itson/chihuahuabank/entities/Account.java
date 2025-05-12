
package mx.itson.chihuahuabank.entities;

// @authors: Andrey, 02, 03, 04

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import java.util.List;


public class Account
{

    /**
     * @return the product
     */
    public String getProduct() {
        return product;
    }

    /**
     * @param product the product to set
     */
    public void setProduct(String product) {
        this.product = product;
    }

    /**
     * @return the accountNumber
     */
    public String getAccountNumber() {
        return accountNumber;
    }

    /**
     * @param accountNumber the accountNumber to set
     */
    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    /**
     * @return the currency
     */
    public String getCurrency() {
        return currency;
    }

    /**
     * @param currency the currency to set
     */
    public void setCurrency(String currency) {
        this.currency = currency;
    }

    /**
     * @return the accountHolder
     */
    public AccountHolder getAccountHolder() {
        return accountHolder;
    }

    /**
     * @param accountHolder the accountHolder to set
     */
    public void setAccountHolder(AccountHolder accountHolder) {
        this.accountHolder = accountHolder;
    }

    /**
     * @return the transactions
     */
    public List<Transaction> getTransactions() {
        return transactions;
    }

    /**
     * @param transactions the transactions to set
     */
    public void setTransactions(List<Transaction> transactions) {
        this.transactions = transactions;
    }
    
    private String product;
    @SerializedName ("account-number")
    private String accountNumber;
    private String currency;
    @SerializedName ("account-holder")
    private AccountHolder accountHolder;
    private List<Transaction> transactions;
    
    /*
    
    */
    public static Account deserialize(String json){
    Account a = new Account();
    try{
        Gson gson = new Gson();
        a = gson.fromJson(json, Account.class);
    } catch (Exception ex){
        System.err.println("Error: " + ex.getMessage());
    } return a;  
    }
    public static Account interes(double porcentaje){
        //TODO logica para calcular interes diario
        return null;
        //TODO logica para calcular interes diario
       
    }
}
/*
=== Titulo
"product":"Cuenta de nómina",

=== Detalles de la cuenta
"account-number":"69740214082"
"currency":"MXN"

=== Titular
"name":"Yolanda Saldívar"
"code":"36859941"
"taxpayer-id":"SAY690205ER9"

=== Direccion del titular
"address":"Calle Miguel Hidalgo #52"
"city":"Empalme, Sonora"
"zip-code":"85400"

=== Aqui iria la tabla con todas las transacciones :))
*/