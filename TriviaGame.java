import java.util.*;
public class TriviaGame {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Question question1 = new Question();
		Question question2 = new Question();
		Question question3 = new Question();
		Question question4 = new Question();
		Question question5 = new Question();
		Question question6 = new Question();
		Question question7 = new Question();
		Question question8 = new Question();
		Question question9 = new Question();
		Question question10 = new Question();
		
		String q1 = "The Japanese horror author Junji Ito did NOT write which of the following works?";
		question1.setTriviaQuestion(q1);
		String q1An1 = "Uzumaki";
		question1.setAnswer1(q1An1); //answer one
		String q1An2 = "The Drifting Classroom";
		question1.setAnswer2(q1An2); //answer two
		String q1An3 = "Gyo";
		question1.setAnswer3(q1An3); //answer three
		String q1An4 = "Tomie";
		question1.setAnswer4(q1An4);  //answer four
		int rightA1 = 2;
		question1.setNumCorrect(rightA1);
		
		String q2 = "What role has made Amal Alamuddin famous?";
		question2.setTriviaQuestion(q2);
		String q2An1 = "Sybil Branson on Downton Abbey";
		question2.setAnswer1(q2An1); //answer one
		String q2An2 = "Benedict Cumberbatch's wife";
		question2.setAnswer2(q2An2); //answer two
		String q2An3 = "George Clooney's wife";
		question2.setAnswer3(q2An3); //answer three
		String q2An4 = "The Bond girl in 2012's Spectre";
		question2.setAnswer4(q2An4); //answer four
		int rightA2 = 3;
		question2.setNumCorrect(rightA2);
		
		String q3 = "The AMC series The Walking Dead features what supernatural element?";
		question3.setTriviaQuestion(q3);
		String q3An1 = "Zombies";
		question3.setAnswer1(q3An1); //answer one
		String q3An2 = "Vampires";
		question3.setAnswer2(q3An2); //answer two
		String q3An3 = "Demons";
		question3.setAnswer3(q3An3); //answer three
		String q3An4 = "Ghosts";
		question3.setAnswer4(q3An4); //answer four
		int rightA3 = 1;
		question3.setNumCorrect(rightA3);
		
		String q4 = "What Netflix series stars Kevin Spacey?";
		question4.setTriviaQuestion(q4);
		String q4An1 = "Agent Carter";
		question4.setAnswer1(q4An1); //answer one
		String q4An2 = "Scandal";
		question4.setAnswer2(q4An2); //answer two
		String q4An3 = "Veep";
		question4.setAnswer3(q4An3); //answer three
		String q4An4 = "House of Cards";
		question4.setAnswer4(q4An4); //answer four
		int rightA4 = 4;
		question4.setNumCorrect(rightA4);
		
		String q5 = "How did Gwyneth Paltrow describe the end of her marriage in 2015?";
		question5.setTriviaQuestion(q5);
		String q5An1 = "An adoring adieu";
		question5.setAnswer1(q5An1); //answer one
		String q5An2 = "A sensitive separation";
		question5.setAnswer2(q5An2); //answer two
		String q5An3 = "A purposeful parting";
		question5.setAnswer3(q5An3); //answer three
		String q5An4 = "A conscious uncoupling";
		question5.setAnswer4(q5An4); //answer four
		int rightA5 = 4;
		question5.setNumCorrect(rightA5);
		
		String q6 = "Who is Anastasia Steele?";
		question6.setTriviaQuestion(q6);
		String q6An1 = "The star of the Hunger Games movies";
		question6.setAnswer1(q6An1); //answer one
		String q6An2 = "A character in the series Intensity";
		question6.setAnswer2(q6An2); //answer two
		String q6An3 = "A character in Fifty Shades of Grey";
		question6.setAnswer3(q6An3); //answer three
		String q6An4 = "The star of Jane the Virgin";
		question6.setAnswer4(q6An4); //answer four
		int rightA6 = 3;
		question6.setNumCorrect(rightA6);
		
		String q7 = "In which Star Wars film do Ewoks appear?";
		question7.setTriviaQuestion(q7);
		String q7An1 = "A New Hope";
		question7.setAnswer1(q7An1); //answer one
		String q7An2 = "The Empire Strikes Back";
		question7.setAnswer2(q7An2); //answer two
		String q7An3 = "Return of the Jedi";
		question7.setAnswer3(q7An3); //answer three
		String q7An4 = "The Phantom Menace";
		question7.setAnswer4(q7An4); //answer four
		int rightA7 = 3;
		question7.setNumCorrect(rightA7);
		
		String q8 = "Who of the following is not a member of One Direction?";
		question8.setTriviaQuestion(q8);
		String q8An1 = "Niall";
		question8.setAnswer1(q8An1); //answer one
		String q8An2 = "Harry";
		question8.setAnswer2(q8An2); //answer two
		String q8An3 = "James";
		question8.setAnswer3(q8An3); //answer three
		String q8An4 = "Louis";
		question8.setAnswer4(q8An4); //answer four
		int rightA8 = 3;
		question8.setNumCorrect(rightA8);
		
		String q9 = "What is the highest grossing movie of all time?";
		question9.setTriviaQuestion(q9);
		String q9An1 = "Jurassic Park";
		question9.setAnswer1(q9An1); //answer one
		String q9An2 = "Titanic";
		question9.setAnswer2(q9An2); //answer two
		String q9An3 = "Frozen";
		question9.setAnswer3(q9An3); //answer three
		String q9An4 = "Avatar";
		question9.setAnswer4(q9An4); //answer four
		int rightA9 = 4;
		question9.setNumCorrect(rightA9);
		
		String q10 = "What is the name of Caitlyn Jenner's E! mini-series?";
		question10.setTriviaQuestion(q10);
		String q10An1 = "Keeping Up With Cait";
		question10.setAnswer1(q10An1); //answer one
		String q10An2 = "Coming Out Cait";
		question10.setAnswer2(q10An2); //answer two
		String q10An3 = "Call Me Cait";
		question10.setAnswer3(q10An3); //answer three
		String q10An4 = "I Am Cait";
		question10.setAnswer4(q10An4); //answer four
		int rightA10 = 4;
		question10.setNumCorrect(rightA10);
		
		ArrayList<Question> myArray = new ArrayList<>();
		myArray.add(question1);
		myArray.add(question2);
		myArray.add(question3);
		myArray.add(question4);
		myArray.add(question5);
		myArray.add(question6);
		myArray.add(question7);
		myArray.add(question8);
		myArray.add(question9);
		myArray.add(question10);
		
		int numWinsOne = 0; //the number of questions player one has answered correctly
		System.out.println("Player one will go first.");
		System.out.println();
		
		//question one
		System.out.println(myArray.get(0).getTriviaQuestion());
		System.out.println("1. " + myArray.get(0).getAnswer1());
		System.out.println("2. " + myArray.get(0).getAnswer2());
		System.out.println("3. " + myArray.get(0).getAnswer3());
		System.out.println("4. " + myArray.get(0).getAnswer4());
		int userAnswer;
		System.out.print("Enter your answer: ");
		userAnswer = scan.nextInt();
		scan.nextLine();
		while(userAnswer > 4 || userAnswer < 1) {
			System.out.println("Error. Please enter a number between 1 and 4.");
			System.out.print("Enter your answer: ");
			userAnswer = scan.nextInt();
			scan.nextLine();
		}
		if(userAnswer == myArray.get(0).getNumCorrect()) {
			System.out.println("Correct!");
			numWinsOne += 1; 
		}
		else {
			System.out.println("Sorry, that is incorrect.");
			System.out.println("The correct answer was number " + myArray.get(0).getNumCorrect());
		}
		System.out.println();		
		//question two
		System.out.println(myArray.get(1).getTriviaQuestion());
		System.out.println("1. " + myArray.get(1).getAnswer1());
		System.out.println("2. " + myArray.get(1).getAnswer2());
		System.out.println("3. " + myArray.get(1).getAnswer3());
		System.out.println("4. " + myArray.get(1).getAnswer4());
		System.out.print("Enter your answer: ");
		userAnswer = scan.nextInt();
		scan.nextLine();
		while(userAnswer > 4 || userAnswer < 1) {
			System.out.println("Error. Please enter a number between 1 and 4.");
			System.out.print("Enter your answer: ");
			userAnswer = scan.nextInt();
			scan.nextLine();
		}
		if(userAnswer == myArray.get(1).getNumCorrect()) {
			System.out.println("Correct!");
			numWinsOne += 1; 
		}
		else {
			System.out.println("Sorry, that is incorrect.");
			System.out.println("The correct answer was number " + myArray.get(1).getNumCorrect());
		}
		System.out.println();
		//question three
		System.out.println(myArray.get(2).getTriviaQuestion());
		System.out.println("1. " + myArray.get(2).getAnswer1());
		System.out.println("2. " + myArray.get(2).getAnswer2());
		System.out.println("3. " + myArray.get(2).getAnswer3());
		System.out.println("4. " + myArray.get(2).getAnswer4());
		System.out.print("Enter your answer: ");
		userAnswer = scan.nextInt();
		scan.nextLine();
		while(userAnswer > 4 || userAnswer < 1) {
			System.out.println("Error. Please enter a number between 1 and 4.");
			System.out.print("Enter your answer: ");
			userAnswer = scan.nextInt();
			scan.nextLine();
		}
		if(userAnswer == myArray.get(2).getNumCorrect()) {
			System.out.println("Correct!");
			numWinsOne += 1; 
		}
		else {
			System.out.println("Sorry, that is incorrect.");
			System.out.println("The correct answer was number " + myArray.get(2).getNumCorrect());
		}
		System.out.println();
		//question four
		System.out.println(myArray.get(3).getTriviaQuestion());
		System.out.println("1. " + myArray.get(3).getAnswer1());
		System.out.println("2. " + myArray.get(3).getAnswer2());
		System.out.println("3. " + myArray.get(3).getAnswer3());
		System.out.println("4. " + myArray.get(3).getAnswer4());
		System.out.print("Enter your answer: ");
		userAnswer = scan.nextInt();
		scan.nextLine();
		while(userAnswer > 4 || userAnswer < 1) {
			System.out.println("Error. Please enter a number between 1 and 4.");
			System.out.print("Enter your answer: ");
			userAnswer = scan.nextInt();
			scan.nextLine();
		}
		if(userAnswer == myArray.get(3).getNumCorrect()) {
			System.out.println("Correct!");
			numWinsOne += 1; 
		}
		else {
			System.out.println("Sorry, that is incorrect.");
			System.out.println("The correct answer was number " + myArray.get(3).getNumCorrect());
		}
		System.out.println();
		//question five
		System.out.println(myArray.get(4).getTriviaQuestion());
		System.out.println("1. " + myArray.get(4).getAnswer1());
		System.out.println("2. " + myArray.get(4).getAnswer2());
		System.out.println("3. " + myArray.get(4).getAnswer3());
		System.out.println("4. " + myArray.get(4).getAnswer4());
		System.out.print("Enter your answer: ");
		userAnswer = scan.nextInt();
		scan.nextLine();
		while(userAnswer > 4 || userAnswer < 1) {
			System.out.println("Error. Please enter a number between 1 and 4.");
			System.out.print("Enter your answer: ");
			userAnswer = scan.nextInt();
			scan.nextLine();
		}
		if(userAnswer == myArray.get(4).getNumCorrect()) {
			System.out.println("Correct!");
			numWinsOne += 1; 
		}
		else {
			System.out.println("Sorry, that is incorrect.");
			System.out.println("The correct answer was number " + myArray.get(4).getNumCorrect());
		}
		System.out.println("Player one's round is finished.");
		System.out.println("Final score for player one: " + numWinsOne);
		
		System.out.println();
		int numWinsTwo = 0;
		System.out.println("Player two's turn.");
		//question six
		System.out.println(myArray.get(5).getTriviaQuestion());
		System.out.println("1. " + myArray.get(5).getAnswer1());
		System.out.println("2. " + myArray.get(5).getAnswer2());
		System.out.println("3. " + myArray.get(5).getAnswer3());
		System.out.println("4. " + myArray.get(5).getAnswer4());
		System.out.print("Enter your answer: ");
		userAnswer = scan.nextInt();
		scan.nextLine();
		while(userAnswer > 4 || userAnswer < 1) {
			System.out.println("Error. Please enter a number between 1 and 4.");
			System.out.print("Enter your answer: ");
			userAnswer = scan.nextInt();
			scan.nextLine();
		}
		if(userAnswer == myArray.get(5).getNumCorrect()) {
			System.out.println("Correct!");
			numWinsTwo += 1; 
		}
		else {
			System.out.println("Sorry, that is incorrect.");
			System.out.println("The correct answer was number " + myArray.get(5).getNumCorrect());
		}
		//question seven
		System.out.println();
		System.out.println(myArray.get(6).getTriviaQuestion());
		System.out.println("1. " + myArray.get(6).getAnswer1());
		System.out.println("2. " + myArray.get(6).getAnswer2());
		System.out.println("3. " + myArray.get(6).getAnswer3());
		System.out.println("4. " + myArray.get(6).getAnswer4());
		System.out.print("Enter your answer: ");
		userAnswer = scan.nextInt();
		scan.nextLine();
		while(userAnswer > 4 || userAnswer < 1) {
			System.out.println("Error. Please enter a number between 1 and 4.");
			System.out.print("Enter your answer: ");
			userAnswer = scan.nextInt();
			scan.nextLine();
		}
		if(userAnswer == myArray.get(6).getNumCorrect()) {
			System.out.println("Correct!");
			numWinsTwo += 1; 
		}
		else {
			System.out.println("Sorry, that is incorrect.");
			System.out.println("The correct answer was number " + myArray.get(6).getNumCorrect());
		}
		//question eight
		System.out.println();
		System.out.println(myArray.get(7).getTriviaQuestion());
		System.out.println("1. " + myArray.get(7).getAnswer1());
		System.out.println("2. " + myArray.get(7).getAnswer2());
		System.out.println("3. " + myArray.get(7).getAnswer3());
		System.out.println("4. " + myArray.get(7).getAnswer4());
		System.out.print("Enter your answer: ");
		userAnswer = scan.nextInt();
		scan.nextLine();
		while(userAnswer > 4 || userAnswer < 1) {
			System.out.println("Error. Please enter a number between 1 and 4.");
			System.out.print("Enter your answer: ");
			userAnswer = scan.nextInt();
			scan.nextLine();
		}
		if(userAnswer == myArray.get(7).getNumCorrect()) {
			System.out.println("Correct!");
			numWinsTwo += 1; 
		}
		else {
			System.out.println("Sorry, that is incorrect.");
			System.out.println("The correct answer was number " + myArray.get(7).getNumCorrect());
		}
		//question nine
		System.out.println();
		System.out.println(myArray.get(8).getTriviaQuestion());
		System.out.println("1. " + myArray.get(8).getAnswer1());
		System.out.println("2. " + myArray.get(8).getAnswer2());
		System.out.println("3. " + myArray.get(8).getAnswer3());
		System.out.println("4. " + myArray.get(8).getAnswer4());
		System.out.print("Enter your answer: ");
		userAnswer = scan.nextInt();
		scan.nextLine();
		while(userAnswer > 4 || userAnswer < 1) {
			System.out.println("Error. Please enter a number between 1 and 4.");
			System.out.print("Enter your answer: ");
			userAnswer = scan.nextInt();
			scan.nextLine();
		}
		if(userAnswer == myArray.get(8).getNumCorrect()) {
			System.out.println("Correct!");
			numWinsTwo += 1; 
		}
		else {
			System.out.println("Sorry, that is incorrect.");
			System.out.println("The correct answer was number " + myArray.get(8).getNumCorrect());
		}
		//question ten
		System.out.println();
		System.out.println(myArray.get(9).getTriviaQuestion());
		System.out.println("1. " + myArray.get(9).getAnswer1());
		System.out.println("2. " + myArray.get(9).getAnswer2());
		System.out.println("3. " + myArray.get(9).getAnswer3());
		System.out.println("4. " + myArray.get(9).getAnswer4());
		System.out.print("Enter your answer: ");
		userAnswer = scan.nextInt();
		scan.nextLine();
		while(userAnswer > 4 || userAnswer < 1) {
			System.out.println("Error. Please enter a number between 1 and 4.");
			System.out.print("Enter your answer: ");
			userAnswer = scan.nextInt();
			scan.nextLine();
		}
		if(userAnswer == myArray.get(9).getNumCorrect()) {
			System.out.println("Correct!");
			numWinsTwo += 1; 
		}
		else {
			System.out.println("Sorry, that is incorrect.");
			System.out.println("The correct answer was number " + myArray.get(9).getNumCorrect());
		}
		System.out.println("Player two's round is finished.");
		System.out.println("Final score for player two: " + numWinsTwo);
		if(numWinsOne > numWinsTwo) {
			System.out.println("Player one is the winner!");
		}
		else if(numWinsTwo > numWinsOne) {
			System.out.println("Player two is the winner!");
		}
		else {
			System.out.println("Player one and player two are tied.");
		}
	}
}