
package mx.itson.chihuahuabank.entities;

// @authors: Andrey, 02, 03, 04

import com.google.gson.annotations.SerializedName;


public class AccountHolder
{

    /**
     * @return the code
     */
    public String getCode() {
        return code;
    }

    /**
     * @param code the code to set
     */
    public void setCode(String code) {
        this.code = code;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the address
     */
    public String getAddress() {
        return address;
    }

    /**
     * @param address the address to set
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * @return the city
     */
    public String getCity() {
        return city;
    }

    /**
     * @param city the city to set
     */
    public void setCity(String city) {
        this.city = city;
    }

    /**
     * @return the taxpayerId
     */
    public String getTaxpayerId() {
        return taxpayerId;
    }

    /**
     * @param taxpayerId the taxpayerId to set
     */
    public void setTaxpayerId(String taxpayerId) {
        this.taxpayerId = taxpayerId;
    }

    /**
     * @return the zipCode
     */
    public String getZipCode() {
        return zipCode;
    }

    /**
     * @param zipCode the zipCode to set
     */
    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }
    
    private String code;
    private String name;
    private String address;
    private String city;
    @SerializedName ("taxpayer-id")
    private String taxpayerId;
    @SerializedName ("zip-code")
    private String zipCode;
    
}
