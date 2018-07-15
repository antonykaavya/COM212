/* 
Kaavya Antony
3/5/16
COM 212
Programming Assignment 1: Array of 5 Students
*/

import java.util.Scanner;

//uses the information from the file Student.java
public class studentArray {
	
	//creates the function createStudent to create Student objects
	//adds student objects to the array, studentArray
	public static void fillArray(Student[] students){
		Scanner s = new Scanner(System.in);
		for (int studentNum = 0; studentNum < 5; studentNum++) {
			System.out.println("Enter student name: ");
			String studentName = s.next();
			System.out.println("Enter student grade: ");
			int studentGrade = s.nextInt();
			Student student = new Student(studentName, studentGrade);
			s.nextLine();
			students[studentNum] = student;
		}
	}

	//main function 
	public static void main(String[] args) {
		//creates an empty array list named studentArray
		Student[] students;
		students = new Student[5];
		fillArray(students);
	}
}