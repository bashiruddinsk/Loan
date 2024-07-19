package org.example.busbooking;

import org.example.busbooking.model.BusAvailability;
import org.example.busbooking.model.BusBooking;
import org.example.busbooking.model.Passenger;
import org.example.busbooking.model.Ticket;
import org.example.busbooking.service.AddPassengerDetails;
import org.example.busbooking.service.MakePaymentToGetTicket;
import org.example.busbooking.service.SearchBusTicket;
import org.example.busbooking.service.SelectBusAndSeatNum;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TicketBookingTest {
    @Test
    public void searchBusTicket()
    {
        BusAvailability busAvailability =new BusAvailability("hyderabad","bangalore","19-07-2024","20-07-2024");
        BusBooking busBooking=new BusBooking();

        SearchBusTicket searchBusTicket=new SearchBusTicket();

        busBooking.busAvailability = busAvailability;

        busBooking=searchBusTicket.routeList(busAvailability,busBooking);

        Assertions.assertTrue(busBooking.busRouteDetails.isBusAvailable);
    }
    @Test
    public void selectBusSeatNum()
    {
        BusAvailability busAvailability =new BusAvailability("hyderabad","bangalore","19-07-2024","20-07-2024");
        BusBooking busBooking=new BusBooking();

        SearchBusTicket searchBusTicket=new SearchBusTicket();

        busBooking.busAvailability = busAvailability;

        busBooking=searchBusTicket.routeList(busAvailability,busBooking);

        SelectBusAndSeatNum selectBusAndSeatNum =new SelectBusAndSeatNum();
        int seatNum[]={7,8};
        busBooking= selectBusAndSeatNum.selectBusAndSeatNum(busBooking,"AcSleeper",seatNum);

        Assertions.assertNotNull(busBooking.busDetails);
    }
    @Test
    public void isPassengerDetailsAdded()
    {
        BusAvailability busAvailability =new BusAvailability("hyderabad","bangalore","19-07-2024","20-07-2024");
        BusBooking busBooking=new BusBooking();

        SearchBusTicket searchBusTicket=new SearchBusTicket();

        busBooking.busAvailability = busAvailability;

        busBooking=searchBusTicket.routeList(busAvailability,busBooking);

        SelectBusAndSeatNum selectBusAndSeatNum =new SelectBusAndSeatNum();
        int seatNum[]={7,8};
        busBooking= selectBusAndSeatNum.selectBusAndSeatNum(busBooking,"AcSleeper",seatNum);

        AddPassengerDetails addPassengerDetails=new AddPassengerDetails();
        busBooking=addPassengerDetails.addPassengerDetails(busBooking);

        Assertions.assertNotNull(busBooking.passengerDetails.get(0));
    }
    @Test
    public void makePaymentToGetTicket()
    {
        BusAvailability busAvailability =new BusAvailability("hyderabad","bangalore","19-07-2024","20-07-2024");
        BusBooking busBooking=new BusBooking();

        SearchBusTicket searchBusTicket=new SearchBusTicket();

        busBooking.busAvailability = busAvailability;

        busBooking=searchBusTicket.routeList(busAvailability,busBooking);

        SelectBusAndSeatNum selectBusAndSeatNum =new SelectBusAndSeatNum();
        int seatNum[]={7,8};
        busBooking= selectBusAndSeatNum.selectBusAndSeatNum(busBooking,"AcSleeper",seatNum);

        AddPassengerDetails addPassengerDetails=new AddPassengerDetails();
        busBooking=addPassengerDetails.addPassengerDetails(busBooking);

        MakePaymentToGetTicket makePaymentToGetTicket=new MakePaymentToGetTicket();
        double payAmount=busBooking.busDetails.price*busBooking.busDetails.seatNO.length;
        Ticket ticket=makePaymentToGetTicket.ticket(busBooking,payAmount);

        System.out.println(ticket.toString());
        Assertions.assertNotNull(ticket);
    }

}
