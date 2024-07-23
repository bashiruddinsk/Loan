package org.example.busbooking.model;

import java.util.List;

public class Ticket {
    public String ticketNumber;
    public Bus busDetails;
    public String pnr;
    public List<Passenger> passengerList;
    public double totalTicketPrice;


    @Override
    public String toString() {
        return "Ticket{" +
                "ticketNumber='" + ticketNumber + '\'' +
                ", busDetails=" + busDetails +
                ", pnr='" + pnr + '\'' +
                ", passengerList=" + passengerList +
                ", totalTicketPrice=" + totalTicketPrice +
                '}';
    }
}
