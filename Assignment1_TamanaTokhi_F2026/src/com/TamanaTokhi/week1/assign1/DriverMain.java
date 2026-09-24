package com.TamanaTokhi.week1.assign1;

public class DriverMain {

	public static void main(String[] args) {
		
		   GradeCalculation grade = new GradeCalculation();
	        MilesToKilometers miles = new MilesToKilometers();
	        LiterstTogallons liters = new LiterstTogallons();
	        CADToUSD cad = new CADToUSD();

	        System.out.println("PART A: GRADE CALCULATION");
	        grade.GradeCalc();

	        System.out.println();
	        System.out.println("PART B: MILES TO KILOMETERS");
	        miles.convert();

	        System.out.println();
	        System.out.println("PART C: LITERS TO GALLONS");
	        liters.convert();

	        System.out.println();
	        System.out.println("PART D: CAD TO USD");
	        cad.convert();
	        
	        
	}

}
