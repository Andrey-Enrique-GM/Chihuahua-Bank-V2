
package mx.itson.chihuahuabank.entities;

// @authors: Andrey, 02, 03, 04

import com.google.gson.annotations.SerializedName;


public class AccountHolder
{
    
    private String code;
    private String name;
    private String address;
    private String city;
    @SerializedName ("taxpayer-id")
    private String taxpayerId;
    @SerializedName ("zip-code")
    private String zipCode;
    
}
