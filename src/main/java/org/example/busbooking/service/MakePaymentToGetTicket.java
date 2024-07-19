package org.example.busbooking.service;

import org.example.busbooking.model.BusBooking;
import org.example.busbooking.model.Ticket;

import java.util.UUID;

public class MakePaymentToGetTicket {
    public Ticket ticket(BusBooking busBooking,double amount)
    {
        Ticket ticket=null;

        if(busBooking.busDetails.price==amount){
            ticket =new Ticket();
            ticket.ticketNumber= UUID.randomUUID().toString();
            ticket.pnr=UUID.randomUUID().toString();
            ticket.busBooking=busBooking;
            System.out.println("payment successFull");
            return ticket;
        }
        System.out.println("payment unSuccessFull");
        return null;
    }
}
