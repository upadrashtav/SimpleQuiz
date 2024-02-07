package SimpleQuiz;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class QuestionBank {

	private ArrayList<Question> questionSet;
	
	public QuestionBank() {
		questionSet = new ArrayList<Question>();
		String q = "Who invented Java Programming?\n";
		String[] ac = {"Guido Van Rossum", "James Gosling", "Dennis Ritche", "Grady Booch"};
		String a = 	"James Gosling";
		questionSet.add(new Question(q, ac, a));
		
		q = "What is the extention of java code files?";
		ac = new String[]{".txt", ".class", ".java", ".jvm"};
		a = ".java";
		questionSet.add(new Question(q,ac,a));
		
		q = "Which of these cannot be used as a variable name in java?";
		ac = new String[] {"Keyword", "Identifier", "Identifier and Keyword", "None of the above"};
		a = "Keyword";
		questionSet.add(new Question(q,ac,a));
		
		Collections.shuffle(questionSet, new Random());
	}
	
	public void start() {
		Scanner scan = new Scanner(System.in);
		int numCorrect = 0;
		//Show questions from questionSET
		for (int qst = 0; qst < questionSet.size(); qst++) {
			System.out.println(questionSet.get(qst).getQuestion());
			int numChoices = questionSet.get(qst).getChoices().size();
			//show choices from questions in questionSet
			for (int choice = 0; choice < numChoices; choice++) {
				//Show one choice at a time from choice collection for a question (qst)
				System.out.println(choice + 1 + ": " + questionSet.get(qst).getChoices().get(choice));
			}
			int playerAnswer = scan.nextInt();
			List<String> choiceSet = questionSet.get(qst).getChoices();
			String correctAnswer = questionSet.get(qst).getAnswer();
			int correctAnswerIndex = choiceSet.indexOf(correctAnswer);
			
			if (playerAnswer == correctAnswerIndex + 1) {
				numCorrect += 1;
			}
		}
		scan.close();
		System.out.println("Your score is: " + numCorrect + " / " + questionSet.size());
	}
}