
package mx.itson.chihuahuabank.entities;

// @authors: Andrey, 02, 03, 04

import mx.itson.chihuahuabank.enums.TransactionType;


public class Transaction
{
    
    // yyyy-MM-dd
    private String date;
    private String description;
    private String reference;
    private double amount;
    private TransactionType type;
    
}
