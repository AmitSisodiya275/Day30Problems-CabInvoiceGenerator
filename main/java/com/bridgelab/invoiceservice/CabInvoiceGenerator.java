package com.bridgelab.invoiceservice;

public class CabInvoiceGenerator {

	static final int COST_PER_KILOMETER = 10;
	static final int COST_PER_MINUTE = 1;

	public double invoiceGenerator(double distance, int time) {
		double fare = (distance * COST_PER_KILOMETER) + time * COST_PER_MINUTE;
		if (fare < 5) {
			fare = 5;
			return fare;
		}
		return fare;
	}

	public double invoiceGenerator(Ride[] rides) {
		double totalFare = 0;
		for (Ride ride : rides) {
			totalFare += invoiceGenerator(ride.distance, ride.time);
		}
		return totalFare;
	}
}
