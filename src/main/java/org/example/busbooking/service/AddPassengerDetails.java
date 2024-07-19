package org.example.busbooking.service;

import org.example.busbooking.model.Bus;
import org.example.busbooking.model.BusBooking;
import org.example.busbooking.model.Passenger;
import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.List;

public class AddPassengerDetails {
    public BusBooking addPassengerDetails(BusBooking busBooking)
    {

        if (busBooking.busDetails!=null)
        {
            busBooking.passengerDetails=new ArrayList<>();
            Passenger passenger1=new Passenger();
            passenger1.passengerName="Bashir";
            passenger1.mobileNumber=9611578479L;
            passenger1.age=24;
            passenger1.gender="Male";


            Passenger passenger2=new Passenger();
            passenger2.passengerName="Rakesh";
            passenger2.mobileNumber=8765678765L;
            passenger2.age=45;
            passenger2.gender="Male";
            busBooking.passengerDetails.add(passenger1);
            busBooking.passengerDetails.add(passenger2);
            return busBooking;
        }
        return busBooking;
    }

}
