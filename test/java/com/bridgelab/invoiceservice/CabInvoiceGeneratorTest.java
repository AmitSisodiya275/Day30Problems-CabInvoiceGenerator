package com.bridgelab.invoiceservice;


import org.junit.Test;

import junit.framework.Assert;



public class CabInvoiceGeneratorTest {

	@Test
	public void whenGivenDistanceAndTimeShouldReturnFare() {
		CabInvoiceGenerator invoiceService = new CabInvoiceGenerator();
		Double fare = invoiceService.invoiceGenerator(10, 5);
		Assert.assertEquals(105.0, fare);
	}
	
	@Test 
	public void whenActualFareIsLessThan5ShouldReturnMinimumFare5Rs() {
		CabInvoiceGenerator invoiceService = new CabInvoiceGenerator();
		Double fare = invoiceService.invoiceGenerator(0.1, 1);
		Assert.assertEquals(5.0, fare);
	}
}
