package com.bridgelabs.AddressBook;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class AddressBook {

	String firstName;
	private String lastName;
	private String address;
	String city;
	private String state;
	private String zip;
	private String phoneNumber;
	private String email;
	private static int members = 0;

	public AddressBook(String firstName, String lastName, String address, String city, String state, String zip,
			String phoneNumber, String email) {

		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
		this.city = city;
		this.state = state;
		this.zip = zip;
		this.phoneNumber = phoneNumber;
		this.email = email;
		members++;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getSecondName() {
		return lastName;
	}

	public String getAddress() {
		return address;
	}

	public String getCity() {
		return city;
	}

	public String getState() {
		return state;
	}

	public String getZip() {
		return zip;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public String getEmail() {
		return email;
	}

	public static void main(String[] args) {

		System.out.println("Welcome to prasad`s Address Book");
		Scanner sc = new Scanner(System.in);
		System.out.print("First Name:");
		String fName = sc.nextLine();
		System.out.print("Last Name:");
		String lName = sc.nextLine();
		System.out.print("Enter Address:");
		String add = sc.nextLine();
		System.out.print("Enter City:");
		String c = sc.nextLine();
		System.out.print("Enter State:");
		String s = sc.nextLine();
		System.out.print("Enter ZIP:");
		String p = sc.nextLine();
		System.out.print("Enter PhoneNumber:");
		String pN = sc.nextLine();
		System.out.print("Enter email id:");
		String eid = sc.nextLine();

		AddressBook member1 = new AddressBook(fName, lName, add, c, s, p, pN, eid);

		// creating array list

		ArrayList<AddressBook> al = new ArrayList<AddressBook>();
		al.add(member1);

		// Getting Iterator

		Iterator itr = al.iterator();

		// traversing elements of Array List Object

		while (itr.hasNext()) {
			AddressBook ab = (AddressBook) itr.next();
			System.out.println(ab.firstName + "" + ab.lastName + "\n" + ab.address + "\n" + ab.city + "\n" + ab.state
					+ "\n" + ab.zip + "\n" + ab.phoneNumber + "\n" + ab.email);
		}

	}

}
