package org.example.busbooking;

import org.example.busbooking.model.BusAvailability;
import org.example.busbooking.model.BusBooking;
import org.example.busbooking.model.Ticket;
import org.example.busbooking.service.AddPassengerDetails;
import org.example.busbooking.service.MakePaymentToGetTicket;
import org.example.busbooking.service.SearchBus;
import org.example.busbooking.service.SelectBusAndSeatNum;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import java.util.Scanner;

class TicketBookingTest {
    @Test
    public void searchBusTicket() {
        BusAvailability busAvailability = new BusAvailability("hyderabad", "bangalore", "19-07-2024", "20-07-2024");
        BusBooking busBooking = new BusBooking();
        busBooking.busAvailability = busAvailability;

        SearchBus searchBus = new SearchBus();

        busBooking = searchBus.routeList(busAvailability, busBooking);

        Assertions.assertTrue(busBooking.busRouteDetails.isBusAvailable);
    }

    @Test
    public void selectBusSeatNum() {
        BusAvailability busAvailability = new BusAvailability("hyderabad", "bangalore", "19-07-2024", "20-07-2024");
        BusBooking busBooking = new BusBooking();

        SearchBus searchBus = new SearchBus();

        busBooking.busAvailability = busAvailability;

        busBooking = searchBus.routeList(busAvailability, busBooking);

        SelectBusAndSeatNum selectBusAndSeatNum = new SelectBusAndSeatNum();
        int[] seatNum = {7, 8};
        busBooking = selectBusAndSeatNum.selectBusAndSeatNum(busBooking, "AcSleeper", seatNum);

        Assertions.assertNotNull(busBooking.busDetails);
    }

    @Test
    public void isPassengerDetailsAdded() {
        BusAvailability busAvailability = new BusAvailability("hyderabad", "bangalore", "19-07-2024", "20-07-2024");
        BusBooking busBooking = new BusBooking();

        SearchBus searchBus = new SearchBus();

        busBooking.busAvailability = busAvailability;

        busBooking = searchBus.routeList(busAvailability, busBooking);

        SelectBusAndSeatNum selectBusAndSeatNum = new SelectBusAndSeatNum();
        int[] seatNum = {7, 8};
        busBooking = selectBusAndSeatNum.selectBusAndSeatNum(busBooking, "AcSleeper", seatNum);

        AddPassengerDetails addPassengerDetails = new AddPassengerDetails();
        busBooking = addPassengerDetails.addPassengerDetails(busBooking);

        Assertions.assertNotNull(busBooking.passengerDetails);
    }

    @Test
    public void makePaymentToGetTicket() {
        BusAvailability busAvailability = new BusAvailability("hyderabad", "bangalore", "19-07-2024", "20-07-2024");
        BusBooking busBooking = new BusBooking();
        busBooking.busAvailability = busAvailability;
        SearchBus searchBus = new SearchBus();
        busBooking = searchBus.routeList(busAvailability, busBooking);

        SelectBusAndSeatNum selectBusAndSeatNum = new SelectBusAndSeatNum();
        int[] seatNum = {7, 8};
        busBooking = selectBusAndSeatNum.selectBusAndSeatNum(busBooking, "AcSleeper", seatNum);

        AddPassengerDetails addPassengerDetails = new AddPassengerDetails();
        busBooking = addPassengerDetails.addPassengerDetails(busBooking);

        MakePaymentToGetTicket makePaymentToGetTicket = new MakePaymentToGetTicket();
        double payAmount = busBooking.busDetails.price * busBooking.busDetails.seatNO.length;
        Ticket ticket = makePaymentToGetTicket.ticket(busBooking, payAmount);

        System.out.println(ticket.toString());
        Assertions.assertNotNull(ticket);
    }



}