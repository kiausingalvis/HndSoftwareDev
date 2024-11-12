package Lesson5;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Flight extends savetocsv{
    private String flightID;
    private String departureDate;
    private String departureTime;
    private String arrivalDate;
    private String arrivalTime;
    private int capacity;
    private Route routeid;

    //primary key = flightID
    public Flight(String flightID, String departureDate, String departureTime, String arrivalDate, String arrivalTime, int capacity, Route routeid){
        this.flightID = flightID;
        this.departureDate = departureDate;
        this.departureTime = departureTime;
        this.routeid = routeid;
        this.arrivalDate = arrivalDate;
        this.arrivalTime = arrivalTime;
        this.capacity = capacity;
    }

    //get flight data
    public String getFlightID() {
        return flightID;
    }
    public String getDepartureDate() {
        return departureDate;
    }
    public String getDepartureTime() {
        return departureTime;
    }
    public Route getRouteid() {
        return routeid;
    }
    public String getArrivalDate() {
        return arrivalDate;
    }
    public String getArrivalTime() {
        return arrivalTime;
    }
    public int getCapacity() {
        return capacity;
    }

    //set flight data
    public void setFlightID(String flightID) {
        this.flightID = flightID;
    }
    public void setArrivalDate(String arrivalDate) {
        this.arrivalDate = arrivalDate;
    }
    public void setArrivalTime(String arrivalTime) {
        this.arrivalTime = arrivalTime;
    }
    public void setDepartureDate(String departureDate) {
        this.departureDate = departureDate;
    }
    public void setDepartureTime(String departureTime) {
        this.departureTime = departureTime;
    }
    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
    public void setRouteid(Route routeid) {
        this.routeid = routeid;
    }
    @Override
    public void saveToCsv() {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("flights.csv", true))) {
            writer.write(flightID + "," + departureDate + "," + departureTime + "," + arrivalDate + "," + arrivalTime + ","
                    + capacity + "," + routeid.getRouteID());
            writer.newLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
