package com.csi.controller;

import java.util.Scanner;

import com.csi.model.Customer;
import com.csi.service.CustomerService;

public class CusromerController {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		boolean status = true;

		CustomerService customerService = new CustomerService();
		do {

			System.out.println("\n Please enter Acc No & Password: ");

			long customerAccountNumber = scanner.nextLong();

			String customerPassword = scanner.next();

			Customer customer = new Customer(12345, "SHWETA@123");

			if (customer.getCustAccountNumber() == customerAccountNumber
					&& customer.getCustPassword().equals(customerPassword)) {

				System.out.println("WELCOME TO INDIAN BANK");
				status = false;
			} else {
				System.out.println("Oops Please try again !!!");
			}

		} while (status);

		do {

			System.out.println("\n Please enter your choice: \n 1. Deposite \n 2. Withdraw \n 3. Transfer \n 4. Logout");

			int ch = scanner.nextInt();

			switch (ch) {
			case 1: {// Deposite
				
				customerService.depositeMoney();

				break;
			}
			case 2: {// Withdraw

				customerService.withdrawMoney();
				
				break;
			}
			case 3: {// Transfer

				customerService.transferMoney();
				
				break;
			}
			case 4: {// logout

				customerService.logout();
				
				break;
			}
			default:
				System.out.println("Invalid Choice.");
				break;
			}
		} while (true);

	}
}
