package com.example.madhu.util;

import java.io.IOException;
import java.io.Writer;
import java.util.Iterator;
import java.util.List;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVPrinter;

import com.example.madhu.model.Customer;

public class CsvFileGenerator {
	
	public void writeCustomerToCsv(List<Customer> cust,Writer write) {
		try {
			CSVPrinter print = new CSVPrinter(write,CSVFormat.DEFAULT);
			for (Customer customer : cust) {
				print.printRecord(customer.getId(),customer.getFirstName(),customer.getLastName());
//						customer.getStreetaddress(),customer.getStreetaddressline(),customer.getCity(),
//						customer.getState(),customer.getPostal(),customer.getPhonenumber(),customer.getEmail(),
//						customer.getHowdidyouhereaboutus(),customer.getFeedbackaboutus(),customer.getSuggestionsifanyforfurtherimprovement(),
//						customer.getWillyoubewillingtorecommendus()
				
			}
			
		}catch(IOException e) {
		e.printStackTrace();
	}
		}

}
