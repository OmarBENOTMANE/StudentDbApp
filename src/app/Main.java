package app;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		System.out.println("enter number of new students to enroll");
		Scanner in = new Scanner(System.in);
		int numStudents = in.nextInt();
		Student[] students = new Student[numStudents];
		for (int n = 0 ; n < numStudents; n++) {
			students[n] = new Student();
			students[n].enroll();
		students[n].payTuition();
		}
		System.out.println("list of students : ");
		for (int n = 0 ; n < numStudents; n++) {
		System.out.println(students[n].toString());}
		
		
		
	}

}
