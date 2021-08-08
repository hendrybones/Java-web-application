package com.pluralsight.calcengine;

public class TicketCounter {
    private int availableSeat=3;
    public synchronized void bookTicket(String pName, int numberOfSeats){
        if ((availableSeat>=numberOfSeats) && (numberOfSeats>0)){
            System.out.println("Hi,"+pName+" :"+numberOfSeats+ "seats booked successfully");
            availableSeat=availableSeat-numberOfSeats;
        }
        else {
            System.out.println("Hi," +pName+ " : seats not available" );
        }
    }
}
