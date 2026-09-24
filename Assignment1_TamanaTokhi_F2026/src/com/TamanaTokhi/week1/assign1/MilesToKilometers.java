package com.TamanaTokhi.week1.assign1;
import java.util.Scanner;
public class MilesToKilometers {

	 public void convert() {

	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter distance in miles: ");
	        double miles = sc.nextDouble();
	        double KM = miles * 1.60934;
	        System.out.println("Distance in kilometers: " + KM);
	        sc.close();
	    }

}
