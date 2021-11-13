package com.bridgelabs.AddressBook;

	import java.util.ArrayList;
	import java.util.Iterator;
	import java.util.Scanner;

	public class AddressBook3 {

		String firstName;
		String lastName;
		String address;
		String city;
		String state;
		String zip;
		String phoneNumber;
		String email;
		int members = 0;

		public AddressBook3(String firstName, String lastName, String address, String city, String state, String zip,
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

		public static void main(String[] args) {

			System.out.println("Welcome to prasad's Address Book");
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

			AddressBook3 member1 = new AddressBook3(fName, lName, add, c, s, p, pN, eid);

			// creating array list

			ArrayList<AddressBook3> al = new ArrayList<AddressBook3>();
			al.add(member1);

			// Getting Iterator

			Iterator itr = al.iterator();

			// traversing elements of Array List Object

			while (itr.hasNext()) {
				AddressBook3 ab = (AddressBook3) itr.next();
				System.out.println("\n............................................\n");
				System.out.println(ab.firstName + "" + ab.lastName + "\n" + ab.address + "\n" + ab.city + "\n" + ab.state
						+ "\n" + ab.zip + "\n" + ab.phoneNumber + "\n" + ab.email + "\n");
			}

			System.out.println("Enter the contact Name to edit:");
			String name = sc.nextLine();
			for (AddressBook3 contact : al) {
				if (contact.firstName.equals(name)){
					System.out.println("\n............................................\n");
					System.out.println("Edit the contact details");
					Scanner sc1 = new Scanner(System.in);
					System.out.print("First Name:");
					String fName1 = sc.nextLine();
					System.out.print("Last Name:");
					String lName1 = sc.nextLine();
					System.out.print("Enter Address:");
					String add1 = sc.nextLine();
					System.out.print("Enter City:");
					String c1 = sc.nextLine();
					System.out.print("Enter State:");
					String s1 = sc.nextLine();
					System.out.print("Enter ZIP:");
					String p1 = sc.nextLine();
					System.out.print("Enter PhoneNumber:");
					String pN1 = sc.nextLine();
					System.out.print("Enter email id:");
					String eid1 = sc.nextLine();
					AddressBook3 member2 = new AddressBook3(fName1, lName1, add1, c1, s1, p1, pN1, eid1);
					
					al.set(0, member2);
					

				}
				System.out.println("\nEdited contact details\n");
				while (itr.hasNext()) {
					AddressBook3 ab = (AddressBook3) itr.next();
					System.out.println("\n............................................\n");
					System.out.println(ab.firstName + "" + ab.lastName + "\n" + ab.address + "\n" + ab.city + "\n" + ab.state
							+ "\n" + ab.zip + "\n" + ab.phoneNumber + "\n" + ab.email + "\n");
				}
			}

		}
	}



