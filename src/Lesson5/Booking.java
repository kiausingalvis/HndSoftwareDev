package Lesson5;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Booking extends savetocsv{
    private String bookingNo;
    private int adultTicket;
    private int childTicket;
    private int concessionTicket;
    private Customer customerID;
    private Flight flightID;
    
    //primary key bookingNo, foreign key = Customer, Flight
    public Booking(String bookingNo, int adultTicket, int childTicket, int concessionTicket, Customer customerID, Flight flightID){
        this.bookingNo = bookingNo;
        this.adultTicket = adultTicket;
        this.childTicket = childTicket;
        this.concessionTicket = concessionTicket;
        this.customerID = customerID;
        this.flightID = flightID;
    }

    //get booking data
    public String getBookingNo() {
        return bookingNo;
    }
    public int getAdultTicket() {
        return adultTicket;
    }
    public int getChildTicket() {
        return childTicket;
    }
    public int getConcessionTicket() {
        return concessionTicket;
    }
    public Customer getCustomerID() {
        return customerID;
    }
    public Flight getFlightID() {
        return flightID;
    }

    //set booking data
    public void setBookingNo(String bookingNo) {
        this.bookingNo = bookingNo;
    }
    public void setAdultTicket(int adultTicket) {
        this.adultTicket = adultTicket;
    }
    public void setChildTicket(int childTicket) {
        this.childTicket = childTicket;
    }
    public void setConcessionTicket(int concessionTicket) {
        this.concessionTicket = concessionTicket;
    }
    public void setCustomerID(Customer customerID) {
        this.customerID = customerID;
    }
    public void setFlightID(Flight flightID) {
        this.flightID = flightID;
    }

    @Override
    public void saveToCsv() {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("bookings.csv", true))) {
            writer.write(bookingNo + "," + adultTicket + "," + childTicket + "," + concessionTicket + ","
                    + customerID.getCustomerID() + "," + flightID.getFlightID());
            writer.newLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
