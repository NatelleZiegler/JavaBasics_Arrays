public class GradeBook {
	private String[] names = new String[5]; //holds five students' names
	private char[] letterGrades = new char[5]; //holds student grades
	//the next five arrays each hold the scores of four tests for our five students
	private double[] student1 = new double[4];
	private double[] student2 = new double[4];
	private double[] student3 = new double[4];
	private double[] student4 = new double[4];
	private double[] student5 = new double[4];
	
	//mutator methods
	public void setNames(String[] studentNames) {
		names = studentNames;
	}
	
	public void setLetterGrades(char[] grades) {
		letterGrades = grades;
	}
	
	public void setStudent1(double[] studentA) {
		student1 = studentA;
	}
	
	public void setStudent2(double[] studentB) {
		student2 = studentB;
	}
	
	public void setStudent3(double[] studentC) {
		student3 = studentC;
	}
	
	public void setStudent4(double[] studentD) {
		student4 = studentD;
	}
	
	public void setStudent5(double[] studentE) {
		student5 = studentE;
	}
	
	//accessor methods
	public String[] getNames() {
		return names;
	}
	
	public char[] getLetterGrades() {
		return letterGrades;
	}
	
	public double[] getStudent1() {
		return student1;
	}
	
	public double[] getStudent2() {
		return student2;
	}
	
	public double[] getStudent3() {
		return student3;
	}
	
	public double[] getStudent4() {
		return student4;
	}
	
	public double[] getStudent5() {
		return student5;
	}
	
	/**
		The averageTest method calculates the average of all a student's test scores.
		
		@param userScores An array of user test scores.
		@return average The student's test average.
	*/
	public double averageTest(double[] userScores) {
		double average;
		double total = 0;
		for(int i = 0; i < 4; i++) {
			total += userScores[i];
		}
		average = total / 4;
		return average;
	}
	
	/**
		The getStudentName method returns a specific student name as a String.
		
		@param num The index number locating the student in the names array.
		@return name The student's name.
	*/
	public String getStudentName(int num) {
		String name;
		name = names[num];
		return name;
	}
	/**
		The letterGrader method assigns a student a letter grade based on their average
		performance in the course.
		
		@param courseScore The student's average test grade for the course
		@return courseGrade The letter grade associated with a student's average test score.
	*/
	public char letterGrader(double courseScore) {
		char courseGrade;
		if(courseScore >= 90 && courseScore <= 100) {
			courseGrade = 'A';
		}
		else if(courseScore >= 80 && courseScore < 90) {
			courseGrade = 'B';
		}
		else if(courseScore >= 69 && courseScore < 80) {
			courseGrade = 'C';
		}
		else if(courseScore >= 60 && courseScore < 70) {
			courseGrade = 'D';
		}
		else {
			courseGrade = 'F';
		}
		return courseGrade;
	}
}