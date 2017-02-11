import java.util.*;
public class DriverExamEval {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		char[] examAnswers = new char[20];
		for(int count = 0; count < 20; count++) {
			System.out.print("Enter the student's answer for question " + (count + 1) + ": ");
			String input;
			input = scan.nextLine();
			input = input.toUpperCase();
			examAnswers[count] = input.charAt(0);
			while(examAnswers[count] != 'A' && examAnswers[count] != 'B' && examAnswers[count] != 'C' && examAnswers[count] != 'D') {
				System.out.println("Please only input A, B, C, or D.");
				System.out.print("Enter the student's answer for question " + (count + 1) + ": ");
				input = scan.nextLine();
				input = input.toUpperCase();
				examAnswers[count] = input.charAt(0);
			}
		}
		
		DriverExam test = new DriverExam();
		test.setStudentAnswers(examAnswers);
		boolean pass = test.passed();
		if(pass == true) {
			System.out.println("The student passed the test!");
		}
		else {
			System.out.println("The student did not pass the test.");
		}
		int totalRight, totalWrong;
		totalRight = test.totalCorrect();
		totalWrong = test.totalIncorrect();
		System.out.println("The student answered " + totalRight + " answers correctly and " + totalWrong 
		+ " answers incorrectly.");
		int [] wrongNumbers = new int[totalWrong];
		wrongNumbers = test.questionsMissed(totalWrong);
		System.out.println("The questions the student missed were: ");
		for(int i = 0; i < wrongNumbers.length; i++) {
			System.out.println(wrongNumbers[i]);
		}
	}
}