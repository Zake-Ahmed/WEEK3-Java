package com.qa.helloworld;

public class HelloWorld {
	public static void printMessage() {
		System.out.println("HELLOWORLD!!!!!!!");
	}
	public static void printMessage1() {
		String M1="HELLO--WORLD!!";
		System.out.println(M1);
				
	}
    public static void printMessage2(String M2) {
    	System.out.println(M2);
		
	}
    public static void printArray(String[] array) {
    	for (String i : array){
		    System.out.print(i);
    	}
    }
	public static void main(String[] args) {
		printMessage();
		printMessage1();
		printMessage2("HELLO---WORLD!!!");
		stretchGoal();
		String [] items = {"nodk ","qedaf ", "daref " };
		printArray(items);
		
		
		}
					
	public static void stretchGoal() {
		printMessage1();
	}
	
		
		
	

}
