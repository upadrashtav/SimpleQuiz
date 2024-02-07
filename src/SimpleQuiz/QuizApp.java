package SimpleQuiz;

import java.util.Scanner;

public class QuizApp {

	
		static int maxScore = 3;
		static int finalScore = 0;
		
		public static void main(String[] args) {
		String q1 = "1. Who invented Java Programming?\n" +
					"A. Guido Van Rossum \n" +
					"B. James Gosling \n" +
					"C. Dennis Ritche \n" +
					"D. Grady Booch\n";
		String a1 = "B";
		
		giveQuiz(q1,a1);
		
		String q2 = "2.  What is the extention of java code files?\n" +
					"A. .txt \n" +
					"B. .class \n" +
					"C. .java \n" +
					"D. .jvm \n";
		
		String a2 = "C";
		
		giveQuiz(q2,a2);
		
		String q3 = "3. Which of these cannot be used as a variable name in java? \n" +
					"A.  Keyword \n" +
					"B.  Identifier \n" +
					"C.  Identifier and Keyword \n" +
					"D.  None of the above \n";
		
		String a3 = "A";
		
		giveQuiz(q3,a3);
		
		System.out.println("Your Final Score is: " + finalScore + " / " + maxScore);
	}
		
	private static void giveQuiz(String qstn, String ans) {
		
		Scanner input = new Scanner(System.in);
		System.out.println(qstn);
		String answer = input.nextLine();
		if (answer.equalsIgnoreCase(ans)) {
			System.out.println("That's correct\n");
			finalScore += 1;
		}		
		
	}

}
