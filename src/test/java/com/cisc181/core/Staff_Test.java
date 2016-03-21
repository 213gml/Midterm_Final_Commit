package com.cisc181.core;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.Calendar;

import org.junit.BeforeClass;
import org.junit.Test;

import com.cisc181.exceptions.PersonException;

public class Staff_Test {

	@BeforeClass
	public static void setup() {
	}
	
	@Test
	public void testOne() {
		
		ArrayList<Staff> StaffArray = new ArrayList<Staff>();
		
		Staff StaffOne = new Staff(null);
		StaffOne.setSalary(56000.00);
		StaffArray.add(StaffOne);
		
		Staff StaffTwo = new Staff(null);
		StaffTwo.setSalary(67500.00);
		StaffArray.add(StaffTwo);
		
		Staff StaffThree = new Staff(null);
		StaffThree.setSalary(75000.00);
		StaffArray.add(StaffThree);
		
		Staff StaffFour = new Staff(null);
		StaffFour.setSalary(49000.00);
		StaffArray.add(StaffFour);
		
		Staff StaffFive = new Staff(null);
		StaffFive.setSalary(100000.00);
		StaffArray.add(StaffFive);
		
		double SalaryOne = StaffOne.getSalary();
		double SalaryTwo = StaffTwo.getSalary();
		double SalaryThree = StaffThree.getSalary();
		double SalaryFour = StaffFour.getSalary();
		double SalaryFive = StaffFive.getSalary();
		
		double Total = SalaryOne + SalaryTwo + SalaryThree + SalaryFour + SalaryFive;
		double AverageSalary = Total / StaffArray.size();
		
		assertEquals(69500.00, AverageSalary, 0);
		
	}	
	
	@Test
	public void testTwo() {
		
		byte invalidPhone = 0;
		
		Staff StaffOne = new Staff(null);
		
		try {
			StaffOne.setPhone("5555555");
		} catch (PersonException e) {
			invalidPhone = 1;
		}
		
		assertTrue(invalidPhone == 1);
		
	}
	
	@Test
	public void testThree() {
		
		byte invalidDOB = 0;
		
		Calendar testCalendar = Calendar.getInstance();
		testCalendar.set(1776, 12, 12);
		
		Staff StaffOne = new Staff(null);
		
		try {
			StaffOne.setDOB(testCalendar.getTime());
		} catch (PersonException e) {
			invalidDOB = 1;
		}
		
		assertTrue(invalidDOB == 1);
		
	}

}
