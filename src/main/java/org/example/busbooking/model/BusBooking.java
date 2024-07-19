package org.example.busbooking.model;

import java.util.List;

public class BusBooking {

    public Route busRouteDetails;
    public List<Passenger> passengerDetails ;
    public BusAvailability busAvailability;
    public Bus busDetails;

    @Override
    public String toString() {
        return "BusBooking{" +
                "busRouteDetails=" + busRouteDetails +
                ", passengerDetails=" + passengerDetails +
                ", busAvailabity=" + busAvailability +
                '}';
    }
}
