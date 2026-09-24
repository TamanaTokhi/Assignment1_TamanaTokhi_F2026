package com.TamanaTokhi.week1.assign1;

import java.util.Scanner;

public class LiterstTogallons {

	public void convert() {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter volume in liters: ");
        double liters = sc.nextDouble();

        double gallons = liters * 0.264172;

        System.out.println("Volume in gallons: " + gallons);
        
        sc.close();
    }

}
