package com.TamanaTokhi.week1.assign1;
import java.util.Scanner;

/**
 * author :Tamana
 * since September 21,2026
 * This code converts currency 
 * 
 * */
public class CADToUSD {

	  public void convert() {

	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter amount in CAD: ");
	        double cad = sc.nextDouble();
	        double exchangeRate = 0.73;
	        double usd = cad * exchangeRate;
	        System.out.println("Amount in USD: " + usd);
	        sc.close();
	        
	    }

}
