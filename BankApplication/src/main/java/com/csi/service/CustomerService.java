package com.csi.service;

import java.util.Scanner;

public class CustomerService {

	int amount, otp, generatedOTP, customerAccountBalance = 10000;

	Scanner scanner = new Scanner(System.in);

	public void depositeMoney() {

		System.out.println("\n Before Deposite Acc Balance: " + customerAccountBalance);

		System.out.println("\n Enter amount for deposite: ");

		amount = scanner.nextInt();

		customerAccountBalance += amount;

		System.out.println("After deposite total Acc balance: " + customerAccountBalance);
	}

	public void withdrawMoney() {

		System.out.println("\n Before withdraw Acc Balance; " + customerAccountBalance);

		System.out.println("\n Please enter amount for withdraw: ");

		amount = scanner.nextInt();

		if (customerAccountBalance > amount) {

			customerAccountBalance -= amount;

			System.out.println("\n After withdraw Total Acc Balance: " + customerAccountBalance);

		} else {

			System.out.println("Insufficient Fund");
		}
	}

	public void transferMoney() {

		System.out.println("\n Before transfer Acc balance: " + customerAccountBalance);

		System.out.println("\n Please enter amount for transfer: ");

		amount = scanner.nextInt();

		if (customerAccountBalance > amount) {

			otp=generateOTP();
			System.out.println("\n Please enter OTP: "+ otp);
			
			generatedOTP=scanner.nextInt();
			
			if (otp==generatedOTP) {
				
				customerAccountBalance-=amount;
				
				System.out.println("\n Amount Transfer Successfully");
				
				System.out.println("\n After Transfer Total Acc Balance: "+ customerAccountBalance);
				
			}
			else {
				System.out.println("Invalid OTP");
			}
		}
	}

	public void logout() {

		System.out.println("Logout Successfully");
		System.exit(0);

	}

	public int generateOTP() {

		return (int) (Math.random() * 9000) + 1000;

	}
}
