package com.qa.week3.day2.parameter;

public class Taxes {

	public static double percentage(double x) {
		double tax=0;	
		if(x<=14999) {
			tax=0;
			
			}
		else if(x<=19999) {
			tax=0.1*(x-15000);
			
			}
		else if(x<=29999) {
			tax=(0.15*(x-20000))+(0.1*(19999-15000));
			
			}
		else if(x<=44999) {
			tax=(0.2*(x-30000))+(0.15*(29999-20000))+(0.1*(19999-15000));
			
			}
		else {
			tax=(0.25*(x-45000))+(0.2*(44999-30000))+(0.15*(29999-20000))+(0.1*(19999-15000));
			
			}
		return tax/x*100;
		

	}
	

	
	public static double taxedPayed(double x) {
		double tax=0;	
		if(x<=14999) {
			tax=0;
			
			}
		else if(x<=19999) {
			tax=0.1*(x-15000);
			
			}
		else if(x<=29999) {
			tax=(0.15*(x-20000))+(0.1*(19999-15000));
			
			}
		else if(x<=44999) {
			tax=(0.2*(x-30000))+(0.15*(29999-20000))+(0.1*(19999-15000));
			
			}
		else {
			tax=(0.25*(x-45000))+(0.2*(44999-30000))+(0.15*(29999-20000))+(0.1*(19999-15000));
			
			}
		return tax;
		

	}
	public static double method3(double x, double y) {
		return x/100*y;
	}
	public static double combine(double x) {
		System.out.println("percentage taxed " + percentage(x) + "%");
		System.out.print("Taxed ammount £");
		return method3(percentage(x),x);
	}
}
