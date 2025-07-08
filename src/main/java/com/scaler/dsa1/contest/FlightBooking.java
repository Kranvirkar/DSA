package com.scaler.dsa1.contest;

public class FlightBooking {

    /*There are B flights labelled from 1 to B.
    You are given a 2-D array of flight bookings A where A[i] represents a booking for flights
     Numbers from A[i][0] A[i][1] (inclusive) with A[i][2] seats reserved for each flight in the
      range.
    Written an array of a length B, where each element at index, I is the total number of seats
    reserved for flights
    Note for example is  A[i]={2,4,3} that means in every flight from range 2 to 4, 3 seats are reserved
            Input
    A= [[1,2,10],[2,3,20],[2,5,25]]
    B=5
    Output [10,55,45,25,25] */
    public static void main(String[] args) {
        int[][] bookings = {{1, 2, 10}, {2, 3, 20}, {2, 5, 25}};
        int B = 5;
        int[] result = corpFlightBookings(bookings, B);

        // Print the result
        for (int seats : result) {
            System.out.print(seats + " ");
        }
    }

    public static int[] corpFlightBookings(int[][] bookings, int B) {
        int[] seats = new int[B];

        // Apply the booking information
        for (int[] booking : bookings) {
            int start = booking[0] - 1;
            int end = booking[1] - 1;
            int seatsToAdd = booking[2];

            seats[start] += seatsToAdd;
            if (end + 1 < B) {
                seats[end + 1] -= seatsToAdd;
            }
        }

        // Calculate the total seats for each flight
        for (int i = 1; i < B; i++) {
            seats[i] += seats[i - 1];
        }

        return seats;
    }
}
