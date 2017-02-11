public class Question {
	private String triviaQuestion;
	private String answer1;
	private String answer2;
	private String answer3;
	private String answer4;
	private int numCorrect; //the number of the correct answer for the question
	
	//constructor
	public Question() {
		triviaQuestion = "";
		answer1 = "";
		answer2 = "";
		answer3 = "";
		answer4 = "";
		numCorrect = 0;
	}
	
	//accessors
	public String getTriviaQuestion() {
		return triviaQuestion;
	}
	
	public String getAnswer1() {
		return answer1;
	}
	
	public String getAnswer2() {
		return answer2;
	}
	
	public String getAnswer3() {
		return answer3;
	}
	
	public String getAnswer4() {
		return answer4;
	}
	
	public int getNumCorrect() {
		return numCorrect;
	}
	
	//mutator methods
	public void setTriviaQuestion(String question) {
		triviaQuestion = question;
	}
	
	public void setAnswer1(String an1) {
		answer1 = an1;
	}
	
	public void setAnswer2(String an2) {
		answer2 = an2;
	}
	
	public void setAnswer3(String an3) {
		answer3 = an3;
	}
	
	public void setAnswer4(String an4) {
		answer4 = an4;
	}
	
	public void setNumCorrect(int correct) {
		numCorrect = correct;
	}
}