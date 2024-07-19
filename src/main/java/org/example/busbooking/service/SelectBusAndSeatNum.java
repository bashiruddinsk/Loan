package org.example.busbooking.service;

import org.example.busbooking.model.BusBooking;

public class SelectBusAndSeatNum {
    public BusBooking selectBusAndSeatNum(BusBooking busBooking, String busType,int seatNum[]) {

        for (int i = 0; i < busBooking.busRouteDetails.busList.size(); i++) {
            if (busBooking.busRouteDetails.busList.get(i).busType.equals(busType)) {
                busBooking.busDetails=busBooking.busRouteDetails.busList.get(i);
                busBooking.busDetails.seatNO=seatNum;
                return  busBooking;
            }

        }
        return busBooking;
    }
}
