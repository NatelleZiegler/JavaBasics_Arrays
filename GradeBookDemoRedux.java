/*
	This version differs from the initial version of GradeBook in that it
	drops the lowest score for each student. Thus, the student's final average
	is the average of their three highest grades in the course.
*/

import java.util.*;
public class GradeBookDemoRedux {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String[] students = new String[5];
		for(int i = 0; i < 5; i++) {
			System.out.print("Enter the name of student number " + (i + 1) + ": ");
			students[i] = scan.nextLine();
		}
		GradeBookRedux myGrades = new GradeBookRedux();
		myGrades.setNames(students);
		
		//This next section of the code asks the user to input 4 test grades for each student
		
		//getting the grades for student number 1
		System.out.println("Enter the grades that " + students[0] + " received on their four tests:");
		double[] studentOne = new double[4];
		for(int i = 0; i < 4; i++) {
			System.out.print("Grade " + (i + 1) + " : ");
			studentOne[i] = scan.nextDouble();
			scan.nextLine();
			while(studentOne[i] < 0 || studentOne[i] > 100) {
				if(studentOne[i] < 0) {
					System.out.println("Your students cannot receive a grade of less than 0.");
					System.out.print("Grade " + (i + 1) + " : ");
				}
				else {
					System.out.println("Your students cannot receive a grade over 100.");
					System.out.print("Grade " + (i + 1) + " : ");
				}
				studentOne[i] = scan.nextDouble();
				scan.nextLine();
			}
		}
		myGrades.setStudent1(studentOne);
		
		//getting the grades for student number 2
		System.out.println("Enter the grades that " + students[1] + " received on their four tests.");
		double[] studentTwo = new double[4];
		for(int i = 0; i < 4; i++) {
			System.out.print("Grade " + (i + 1) + " : ");
			studentTwo[i] = scan.nextDouble();
			scan.nextLine();
			while(studentTwo[i] < 0 || studentTwo[i] > 100) {
				if(studentTwo[i] < 0) {
					System.out.println("Your students cannot receive a grade of less than 0.");
					System.out.print("Grade " + (i + 1) + " : ");
				}
				else {
					System.out.println("Your students cannot receive a grade over 100.");
					System.out.print("Grade " + (i + 1) + " : ");
				}
				studentTwo[i] = scan.nextDouble();
				scan.nextLine();
			}
		}
		myGrades.setStudent2(studentTwo);
		
		//getting the grades for student number 3
		System.out.println("Enter the grades that " + students[2] + " received on their four tests.");
		double[] studentThree = new double[4];
		for(int i = 0; i < 4; i++) {
			System.out.print("Grade " + (i + 1) + " : ");
			studentThree[i] = scan.nextDouble();
			scan.nextLine();
			while(studentThree[i] < 0 || studentThree[i] > 100) {
				if(studentThree[i] < 0) {
					System.out.println("Your students cannot receive a grade of less than 0.");
					System.out.print("Grade " + (i + 1) + " : ");
				}
				else {
					System.out.println("Your students cannot receive a grade over 100.");
					System.out.print("Grade " + (i + 1) + " : ");
				}
				studentThree[i] = scan.nextDouble();
				scan.nextLine();
			}
		}
		myGrades.setStudent3(studentThree);
		
		//getting the grades for student number 4
		System.out.println("Enter the grades that " + students[3] + " received on their four tests.");
		double[] studentFour = new double[4];
		for(int i = 0; i < 4; i++) {
			System.out.print("Grade " + (i + 1) + " : ");
			studentFour[i] = scan.nextDouble();
			scan.nextLine();
			while(studentFour[i] < 0 || studentFour[i] > 100) {
				if(studentFour[i] < 0) {
					System.out.println("Your students cannot receive a grade of less than 0.");
					System.out.print("Grade " + (i + 1) + " : ");
				}
				else {
					System.out.println("Your students cannot receive a grade over 100.");
					System.out.print("Grade " + (i + 1) + " : ");
				}
				studentFour[i] = scan.nextDouble();
				scan.nextLine();
			}
		}
		myGrades.setStudent4(studentFour);
		
		//getting the grades for student number 5
		System.out.println("Enter the grades that " + students[4] + " received on their four tests.");
		double[] studentFive = new double[4];
		for(int i = 0; i < 4; i++) {
			System.out.print("Grade " + (i + 1) + " : ");
			studentFive[i] = scan.nextDouble();
			scan.nextLine();
			while(studentFive[i] < 0 || studentFive[i] > 100) {
				if(studentFive[i] < 0) {
					System.out.println("Your students cannot receive a grade of less than 0.");
					System.out.print("Grade " + (i + 1) + " : ");
				}
				else {
					System.out.println("Your students cannot receive a grade over 100.");
					System.out.print("Grade " + (i + 1) + " : ");
				}
				studentFive[i] = scan.nextDouble();
				scan.nextLine();
			}
		}
		myGrades.setStudent4(studentFour);
		
		System.out.println("\nThe lowest test score for each student has been dropped.\n");
		
		String nameA, nameB, nameC, nameD, nameE; //the names of the five students
		double avgA, avgB, avgC, avgD, avgE; //the average test scores of the five students
		char gradeA, gradeB, gradeC, gradeD, gradeE; //the final letter grades of the five students
		
		//retrieve the info for student number 1
		nameA = myGrades.getStudentName(0);
		avgA = myGrades.averageTest(studentOne);
		gradeA = myGrades.letterGrader(avgA);
		
		//display the info for student number 1
		System.out.print(nameA + " had an average test score of ");
		System.out.printf("%.2f which corresponds to a letter grade of ", avgA);
		System.out.println(gradeA + ".");
		
		//retrieve the info for student number 2
		nameB = myGrades.getStudentName(1);
		avgB = myGrades.averageTest(studentTwo);
		gradeB = myGrades.letterGrader(avgB);
		
		//display the info for student number 2
		System.out.print(nameB + " had an average test score of ");
		System.out.printf("%.2f which corresponds to a letter grade of ", avgB);
		System.out.println(gradeB + ".");
		
		//retrieve the info for student number 3
		nameC = myGrades.getStudentName(2);
		avgC = myGrades.averageTest(studentThree);
		gradeC = myGrades.letterGrader(avgC);
		
		//display the info for student number 3
		System.out.print(nameC + " had an average test score of ");
		System.out.printf("%.2f which corresponds to a letter grade of ", avgC);
		System.out.println(gradeC + ".");
		
		//retrieve the info for student number 4
		nameD = myGrades.getStudentName(3);
		avgD = myGrades.averageTest(studentFour);
		gradeD = myGrades.letterGrader(avgD);
		
		//display the info for student number 4
		System.out.print(nameD + " had an average test score of ");
		System.out.printf("%.2f which corresponds to a letter grade of ", avgD);
		System.out.println(gradeD + ".");
		
		//retrieve the info for student number 5
		nameE = myGrades.getStudentName(4);
		avgE = myGrades.averageTest(studentFive);
		gradeE = myGrades.letterGrader(avgE);
		
		//display the info for student number 5
		System.out.print(nameE + " had an average test score of ");
		System.out.printf("%.2f which corresponds to a letter grade of ", avgE);
		System.out.println(gradeE + ".");
		
		}
	}