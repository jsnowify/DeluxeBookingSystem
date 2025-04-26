/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.deluxebooking;

/**
 *
 * @author joshu
 */
// Flight.java
public class Flight {
    private String airline;
    private String flightNumber;
    private String from;
    private String to;
    private String departureTime;
    private String arrivalTime;
    private String price;

    public Flight(String airline, String flightNumber, String from, String to, String departureTime, String arrivalTime, String price) {
        this.airline = airline;
        this.flightNumber = flightNumber;
        this.from = from;
        this.to = to;
        this.departureTime = departureTime;
        this.arrivalTime = arrivalTime;
        this.price = price;
    }

    public String getAirline() { return airline; }
    public String getFlightNumber() { return flightNumber; }
    public String getFrom() { return from; }
    public String getTo() { return to; }
    public String getDepartureTime() { return departureTime; }
    public String getArrivalTime() { return arrivalTime; }
    public String getPrice() { return price; }
}
