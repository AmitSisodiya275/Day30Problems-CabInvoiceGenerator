package com.bridgelab.invoiceservice;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CabInvoiceGeneratorTest {

	@Test
	public void whenGivenDistanceAndTimeShouldReturnFare() {
		CabInvoiceGenerator invoiceService = new CabInvoiceGenerator();
		Double fare = invoiceService.invoiceGenerator(10, 5);
		assertEquals(105.0, fare, 0.0);
	}

	@Test
	public void whenActualFareIsLessThan5ShouldReturnMinimumFare5Rs() {
		CabInvoiceGenerator invoiceService = new CabInvoiceGenerator();
		Double fare = invoiceService.invoiceGenerator(0.1, 1);
		assertEquals(5.0, fare, 0.0);
	}

	@Test
	public void whenGivenMultipleRidesShouldReturnAggrigateFare() {
		CabInvoiceGenerator invoiceService = new CabInvoiceGenerator();
		Ride[] rides = { new Ride(10, 5), new Ride(0.1, 1) };
		double fare = invoiceService.invoiceGenerator(rides);
		assertEquals(110.0, fare, 0.0);
	}
}
