package org.example.busbooking.model;

public class BusAvailability {
    public String fromLocation;
    public String toLocation;
    public String fromDate;
    public String toDate;


    public BusAvailability(String fromLocation, String toLocation, String fromDate, String toDate) {
        this.fromLocation = fromLocation;
        this.toLocation = toLocation;
        this.fromDate = fromDate;
        this.toDate = toDate;
    }
}
