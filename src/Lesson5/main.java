package Lesson5;

import java.sql.Time;
import java.util.Date;

public class main {
    public static void main(String[] args) {
        Customer customer = new Customer("C001", "gaidys", "Obuolys", "21 dumb street", "kalabybiskis", "52 dfb");
        Route route = new Route("R001", "New York", "Los Angeles", "Chicago", "Denver", "LA");
        Flight flight = new Flight("F001", "2024-12-01", "10:00", "2024-10-12", "12:32", 200, route);
        Booking booking = new Booking("359", 1, 1,1,customer, flight);
        saveToFile(customer);
        saveToFile(route);
        saveToFile(flight);
        saveToFile(booking);
    }

    public static void saveToFile(savetocsv csvfile) {
        csvfile.saveToCsv();
    }
}
