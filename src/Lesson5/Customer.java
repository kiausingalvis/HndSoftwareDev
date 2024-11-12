package Lesson5;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Customer extends savetocsv{
    private String customerID;
    private String firstName;
    private String lastName;
    private String street;
    private String town;
    private String postcode;

    //primary key = customerID
    public Customer(String customerID, String firstName, String lastName, String street, String town, String postcode){
        this.customerID = customerID;
        this.firstName = firstName;
        this.lastName = lastName;
        this.street = street;
        this.town = town;
        this.postcode = postcode;
    }
    //get customer data
    public String getCustomerID() {
        return customerID;
    }
    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public String getStreet() {
        return street;
    }
    public String getTown() {
        return town;
    }
    public String getPostcode() {
        return postcode;
    }

    //set customer data
    public void setCustomerID(String customerID) {
        this.customerID = customerID;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public void setStreet(String street) {
        this.street = street;
    }
    public void setTown(String town) {
        this.town = town;
    }
    public void setPostcode(String postcode) {
        this.postcode = postcode;
    }

    @Override
    public void saveToCsv() {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("customers.csv", true))) {
            writer.write(customerID + "," + firstName + "," + lastName + "," + street + "," + town + "," + postcode);
            writer.newLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
