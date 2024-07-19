package org.example.busbooking.service;

import org.example.busbooking.model.Bus;
import org.example.busbooking.model.BusAvailability;
import org.example.busbooking.model.BusBooking;
import org.example.busbooking.model.Route;

import java.util.ArrayList;
import java.util.List;

public class SearchBusTicket {

    public BusBooking routeList(BusAvailability busAvailability, BusBooking busBooking)
    {

       if (busAvailability.fromLocation.equals("hyderabad")&& busAvailability.toLocation.equals("bangalore")) {
           List<Bus> routeList1=new ArrayList<>();
           Bus hyderabadTOBangalore = new Bus
                   ("hyderabad", "bangalore", "19-07-2024", "20-07-2024", "20:30pm", "9:00am", 1500, "SuperLuxury", "1401");

           Bus hyderabadTOBangalore1 = new Bus
                   ("hyderabad", "bangalore", "19-07-2024", "20-07-2024", "17:30pm", "8:00am", 2000, "AcSleeper", "1402");

           routeList1.add(hyderabadTOBangalore);
           routeList1.add(hyderabadTOBangalore1);
           busBooking.busRouteDetails= new Route();
           busBooking.busRouteDetails.busList = routeList1;
           busBooking.busRouteDetails.isBusAvailable=true;
           return busBooking;

       }else if (busAvailability.fromLocation.equals("vijayawada")&& busAvailability.toLocation.equals("pune")) {
           List<Bus> routeList1=new ArrayList<>();
            Bus hyderabadTOBangalore = new Bus
                    ("vijayawada", "pune", "20-07-2024", "21-07-2024", "21:30pm", "10:00am", 1500, "SemiSleeper", "1641");

            Bus hyderabadTOBangalore1 = new Bus
                    ("vijayawada", "pune", "20-07-2024", "21-07-2024", "5:30am", "12:00pm", 2000, "AcSleeper", "1642");

            routeList1.add(hyderabadTOBangalore);
            routeList1.add(hyderabadTOBangalore1);
            busBooking.busRouteDetails= new Route();
            busBooking.busRouteDetails.busList = routeList1;
            busBooking.busRouteDetails.isBusAvailable=true;
            return  busBooking;

        }
       return busBooking;
    }
}
