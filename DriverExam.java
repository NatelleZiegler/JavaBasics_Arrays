public class DriverExam {
	private char[] answers = {'B', 'D', 'A', 'A', 'C', 'A', 'B', 'A', 'C', 'D', 'B', 'C', 'D', 'A', 'D', 'C', 'C', 'B', 'D', 'A'};
	private char[] studentAnswers = new char[20];
	
	//mutator
	public void setStudentAnswers(char[] student) {
		studentAnswers = student;
	}
	
	/**
		The passed method evaluates the students answers to determine if they have passed the exam.
		
		@return pass A boolean value that is "true" if a user has passed.
	*/
	public boolean passed() {
		boolean pass = false; //will be changed to true if user passed exam
		int numCorrect = 0; //counter variable that will accumulate the total number of correct answers
		for(int i = 0; i < 20; i++) {
			if(answers[i] == studentAnswers[i]) {
				numCorrect += 1;
			}
		}
		if(numCorrect >= 15) {
			pass = true;
		}
		return pass;
	}
	
	/**
		The totalCorrect method calculates and returns the number of answers the user got correct.
		
		@return numberCorrect The number of answers the users answered correctly.
	*/
	public int totalCorrect() {
		int numberCorrect = 0;
		for(int i = 0; i < 20; i++) {
			if(answers[i] == studentAnswers[i]) {
				numberCorrect += 1;
			}
		}
		return numberCorrect;
	}
	
	/**
		The totalIncorrect method calculates and returns the number of answers the user got
		incorrect.
		
		@return numberIncorrect The number of answers the user answered incorrectly.
	*/
	public int totalIncorrect() {
		int numberIncorrect = 0;
		for(int i = 0; i < 20; i++) {
			if(answers[i] != studentAnswers[i]) {
				numberIncorrect += 1;
			}
		}
		return numberIncorrect;
	}
	
	/**
		The questions missed method returns an array of numbers corresponding to the question
		numbers of the user's incorrect answers.
		
		@param numWrong The total number of questions the user answered incorrectly.
		@return wrongQuestions The problem numbers the user answered incorrectly.
	*/
	public int[] questionsMissed(int numWrong) {
		int[] wrongQuestions = new int[numWrong];
		int index = 0;
		do {
			for(int i = 0; i < 20; i++) {
				if(answers[i] != studentAnswers[i]) {
					wrongQuestions[index] = i + 1;
					index += 1;	
				}
			}
		} while(index != numWrong);
		return wrongQuestions;
	}
}