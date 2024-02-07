package SimpleQuiz;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Question {
	private String qstn;
	private List<String> choices;
	private String answer;
	
	public Question(String qstn, String[] choices, String answer) {
		this.qstn = qstn;
		this.choices = new ArrayList<String>();
		for (int i= 0; i < choices.length; i++) {
			this.choices.add(choices[i]);
		}
		//Ensure each game displays questions in different order
		Collections.shuffle(this.choices);
		this.answer = answer;
	}
	public String getQuestion() {
		return qstn;
	}
	public List<String> getChoices(){
		return choices;
	}
	public String getAnswer() {
		return answer;
	}
}

