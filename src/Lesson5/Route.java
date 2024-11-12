package Lesson5;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Route extends savetocsv{
    private String routeID;
    private String routeName;
    private String departFrom;
    private String arriveAt;
    private String midStopOne;
    private String midStopTwo;

    //primary key = routeID
    public Route(String routeID, String routeName, String departFrom, String arriveAt, String midStopOne, String midStopTwo){
        this.routeID = routeID;
        this.routeName=routeName;
        this.departFrom = departFrom;
        this.arriveAt = arriveAt;
        this.midStopOne = midStopOne;
        this.midStopTwo = midStopTwo;
    }

    //get route data
    public String getRouteID() {
        return routeID;
    }
    public String getRouteName() {
        return routeName;
    }
    public String getDepartFrom() {
        return departFrom;
    }
    public String getArriveAt() {
        return arriveAt;
    }
    public String getMidStopOne() {
        return midStopOne;
    }
    public String getMidStopTwo() {
        return midStopTwo;
    }

    //set route data
    public void setRouteID(String routeID) {
        this.routeID = routeID;
    }
    public void setRouteName(String routeName) {
        this.routeName = routeName;
    }
    public void setDepartFrom(String departFrom) {
        this.departFrom = departFrom;
    }
    public void setArriveAt(String arriveAt) {
        this.arriveAt = arriveAt;
    }
    public void setMidStopOne(String midStopOne) {
        this.midStopOne = midStopOne;
    }
    public void setMidStopTwo(String midStopTwo) {
        this.midStopTwo = midStopTwo;
    }

    @Override
    public void saveToCsv() {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("routes.csv", true))) {
            writer.write(routeID + "," + departFrom + "," + arriveAt + "," + midStopOne + "," + midStopTwo);
            writer.newLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
