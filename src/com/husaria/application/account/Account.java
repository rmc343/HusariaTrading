package com.husaria.application.account;

import com.husaria.application.tradable.position.Portfolio;
import com.husaria.toolkit.IPrintable;

import java.util.Date;
import java.util.HashMap;

/**
 * Created by Owner on 8/11/2018.
 */
public abstract class Account implements IPrintable {

    //==================================================================================================================
    // Instance Variable(s)
    //==================================================================================================================

    //------------------------------------------------------------------------------------------------------------------
    // Personal Information
    private String firstName;
    private String lastName;
    private Date birthday;
    private Address address;


    //------------------------------------------------------------------------------------------------------------------
    // Login Information
    private String username;
    private String password;
    private long createdDate;


    //------------------------------------------------------------------------------------------------------------------
    // Equity
    private Portfolio portfolio;
    private HashMap<String,Bank> bankingInformation;


    //==================================================================================================================
    // Constructor(s)
    //==================================================================================================================

    //==================================================================================================================
    // Getter(s)& Setter(s)
    //==================================================================================================================

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public long getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(long createdDate) {
        this.createdDate = createdDate;
    }

    public Portfolio getPortfolio() {
        return portfolio;
    }

    public void setPortfolio(Portfolio portfolio) {
        this.portfolio = portfolio;
    }

    public Bank getBankingInformation(String bankName) {

        if(bankingInformation != null && bankingInformation.containsKey(bankName)){
            return bankingInformation.get(bankName);
        }else{
            return null;
        }

    }
    public void setBankingInformation(String bankName, Bank bank) {

        if(bankingInformation != null) {
            bankingInformation.put(bankName, bank);
        }
    }


    //==================================================================================================================
    // Public Functions(s)
    //==================================================================================================================


    //==================================================================================================================
    // Private Functions(s)
    //==================================================================================================================





}//****************************************************END OF FILE*****************************************************/

