package com.exception;

 import utils.CheckValidations;

import java.util.Scanner;

public class TestException {

	public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
          
        	System.err.println("Enter the Speed of Car.!");
        	CheckValidations.validateSpeed(sc.nextInt());
        	System.out.println("END.");
         	
        }
        
        catch(Exception e) {
        	System.out.println(e.getMessage());
        	System.out.println(e);
        	e.printStackTrace();
        }
        
	}

}
