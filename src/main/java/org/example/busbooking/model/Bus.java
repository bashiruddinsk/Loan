package org.example.busbooking.model;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Bus {
    public String fromRoute;
    public String toRoute;
    public String fromDate;
    public String toDate;
    public String startTime;
    public String endTime;
    public double price;
    public String busType;
    public String serviceNumber;
    public int []seatNO;



    public Bus() {
    }

    public Bus(String fromRoute, String toRoute, String fromDate, String toDate, String startTime, String endTime, double price, String busType, String serviceNumber) {
        this.fromRoute = fromRoute;
        this.toRoute = toRoute;
        this.fromDate = fromDate;
        this.toDate = toDate;
        this.startTime = startTime;
        this.endTime = endTime;
        this.price = price;
        this.busType = busType;
        this.serviceNumber = serviceNumber;
    }

    @Override
    public String toString() {
        return "Bus{" +
                "fromRoute='" + fromRoute + '\'' +
                ", toRoute='" + toRoute + '\'' +
                ", fromDate='" + fromDate + '\'' +
                ", toDate='" + toDate + '\'' +
                ", startTime='" + startTime + '\'' +
                ", endTime='" + endTime + '\'' +
                ", price=" + price +
                ", busType='" + busType + '\'' +
                ", serviceNumber='" + serviceNumber + '\'' +
                ", seatNO=" + Arrays.toString(seatNO) +
                '}';
    }
}
