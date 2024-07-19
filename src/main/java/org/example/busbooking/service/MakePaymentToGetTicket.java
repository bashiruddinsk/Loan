package org.example.busbooking.service;

import org.example.busbooking.model.BusBooking;
import org.example.busbooking.model.Ticket;

import java.util.ArrayList;
import java.util.UUID;

public class MakePaymentToGetTicket {
    public Ticket ticket(BusBooking busBooking,double amount)
    {
        Ticket ticket=null;
        if(busBooking.busDetails.price*busBooking.busDetails.seatNO.length==amount){
            ticket =new Ticket();
            ticket.passengerList=new ArrayList<>();
            ticket.ticketNumber= UUID.randomUUID().toString();
            ticket.pnr=UUID.randomUUID().toString();
            ticket.busDetails=busBooking.busDetails;
            ticket.passengerList=busBooking.passengerDetails;
            ticket.totalTicketPrice=busBooking.busDetails.price*busBooking.busDetails.seatNO.length;
            System.out.println("payment successFull");
            return ticket;
        }
        System.out.println("payment unSuccessFull");
        return null;
    }
}
