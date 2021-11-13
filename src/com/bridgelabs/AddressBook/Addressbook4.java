package com.bridgelabs.AddressBook;

import java.util.*;

public class Addressbook4 {
	String firstName;
	String lastName;
	String address;
	String city;
	String state;
	String zip;
	String phoneNumber;
	String email;

	public List<Contact> Addressbook4 = new ArrayList<>();
	public Addressbook4() {
		Addressbook4 = new ArrayList<Contact>();
	}
	Scanner sc = new Scanner(System.in);
	Iterator itr = Addressbook4.iterator();

	public void add(Contact contact) {
		Addressbook4.add(contact);
	}

	void addPerson() {
		Contact person = new Contact();
		System.out.print("First Name:");
		firstName = sc.nextLine();
		person.setFirstName(firstName);
		System.out.print("Last Name:");
		lastName = sc.nextLine();
		person.setLastName(lastName);
		System.out.print("Enter Address:");
		address = sc.nextLine();
		person.setAddress(address);
		System.out.print("Enter City:");
		city = sc.nextLine();
		person.setCity(city);
		System.out.print("Enter State:");
		state = sc.nextLine();
		person.setState(state);
		System.out.print("Enter ZIP:");
		zip = sc.nextLine();
		person.setZip(zip);
		System.out.print("Enter PhoneNumber:");
		phoneNumber = sc.nextLine();
		person.setPhoneNumber(phoneNumber);
		System.out.print("Enter email id:");
		email = sc.nextLine();
		person.setEmail(email);

		Addressbook4.add(new Contact(firstName, lastName, address, city, state, zip, phoneNumber, email));
	}

	void display() {
		
		for (Contact ab : Addressbook4)  {
			
			System.out.println("\n............................................\n");
			System.out.println(ab.getFirstName()+"\n" + "" + ab.getLastName() + "\n" + ab.getAddress() + "\n" + ab.getCity() + "\n" + ab.getState()
					+ "\n" + ab.getZip() + "\n" + ab.getPhoneNumber() + "\n" + ab.getEmail() + "\n");
		}
	}

	public int getIndex(String firstName) {
		int index = -1;
		for (int i = 0; i < Addressbook4.size();i++) {
			if (firstName.equals(Addressbook4.get(i).getFirstName()))
				return i;
		}
		return index;
	}

	public void editContact(int i) {

		System.out.print("First Name:");
		firstName = sc.nextLine();
		System.out.print("Last Name:");
		lastName = sc.nextLine();
		System.out.print("Enter Address:");
		address = sc.nextLine();
		System.out.print("Enter City:");
		city = sc.nextLine();
		System.out.print("Enter State:");
		state = sc.nextLine();
		System.out.print("Enter ZIP:");
		zip = sc.nextLine();
		System.out.print("Enter PhoneNumber:");
		phoneNumber = sc.nextLine();
		System.out.print("Enter email id:");
		email = sc.nextLine();

		Addressbook4.set(i, new Contact(firstName, lastName, address, city, state, zip, phoneNumber, email));

	}

	public void deleteContact(int i) {
		Addressbook4.remove(i);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Addressbook4 ab = new Addressbook4();
		int choice;
		char c;
		System.out.println("Welcome to prasad's AddressBook");
		do {
			System.out.println("Enter \n1.Add details \n2.Update details \n3.Delete details" + 
												"\n4.Show members \n5.");
			choice = sc.nextInt();
			switch (choice) {
				case 1:
					ab.addPerson();
					break;
				case 2:
					System.out.println("Enter your first name to edit person details:");
					String fName = sc.next();
					int i = ab.getIndex(fName);
					ab.editContact(i);
					break;
				case 3:
					System.out.println("Enter your first name to delete person details:");
					String fNameDelete = sc.next();
					int delete = ab.getIndex(fNameDelete);
					ab.deleteContact(delete);
					break;
				case 4:
					ab.display();
					break;
				case 5:
					System.out.println("No of person details in your AddressBook:" + new Contact().members);
					System.exit(0);
					
			}
			System.out.println("Do you Want to continue(Y/N):");
			c = sc.next().charAt(0);
			
		}while(c == 'Y' || c == 'y' );
		sc.close();
		
	}
}
