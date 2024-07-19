package org.example.busbooking.model;

public class Passenger {

    public String passengerName;
    public long mobileNumber;
    public int age;
    public String gender;

    @Override
    public String toString() {
        return "Passenger{" +
                "passengerName='" + passengerName + '\'' +
                ", mobileNumber=" + mobileNumber +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                '}';
    }
}
