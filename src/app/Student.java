package app;

import java.util.Scanner;

public class Student {

	String first;
	String last;
	String stdtID;
	int gradeLevel;
	String courses = "-";
	private static int coursPrice = 600;
	int tuitionBalance;
	String status;
	private static int id = 1000;

	public Student() {

		Scanner in = new Scanner(System.in);
		System.out.println("Enter Student first name ");
		this.first = in.nextLine();
		System.out.println("Enter Student last name ");
		this.last = in.nextLine();
		System.out.println("Enter Student grade level ");
		this.gradeLevel = in.nextInt();
		System.out.println("Student name is: " + first + " " + last + "\n" + "grade level is: " + gradeLevel);
		setStdtID();
		System.out.println("student id is: " + stdtID);

	}

	// generate id
	public void setStdtID() {
		id++;
		this.stdtID = gradeLevel + "" + id;
	}

	public void enroll() {
		do {
			System.out.print("Enter courses to enroll or insert Q to quit ");
			Scanner in = new Scanner(System.in);
			String course = in.nextLine();
			if (!course.equals("Q")) {
				courses = courses + "\n" + course;
				tuitionBalance = tuitionBalance + coursPrice;
			} else {
				System.out.println("done");
				break;
			}
		} while (1 != 0);
		System.out.println("courses are: " + courses);
		System.out.println("tuition balance: " + tuitionBalance);
	}

	public void viewBalance() {
		System.out.println("your balance is: $" + tuitionBalance);
	}

	public void payTuition() {
		viewBalance();
		System.out.println("enter your payment: ");
		Scanner in = new Scanner(System.in);
		int payment = in.nextInt();
		tuitionBalance = tuitionBalance - payment;
		System.out.println("thank you for your payment of $" + payment);
		viewBalance();
	}

	@Override
	public String toString() {
		return "Student [name= " + first + " " + last + ", stdtID=" + stdtID + ", gradeLevel=" + gradeLevel + "]";
	}
	
}
