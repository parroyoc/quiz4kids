package com.q4k.factories;

import com.q4k.Question;

public class ArithmeticQuestionFactory implements IQuestionFactory {

	@Override
	public Question generateQuestion(int level) {
		StringBuilder html = new StringBuilder("<div class='arithmetic'>");
		html.append("<p class='number'>15</p>")
			.append("<p class='operator'>+</p>")
			.append("<p class='number'>4</p>")
			.append("<p class='operator'>=</p>")
			.append("<p class='question'>?</p>")
			.append("<br/>")
			.append("<input type='submit' id='solution1' class='solution' value='18'/>")
			.append("<input type='submit' id='solution2' class='solution' value='20'/>")
			.append("<input type='submit' id='solution3' class='solution' value='19'/>")
			.append("<input type='submit' id='solution4' class='solution' value='21'/>")
			.append("</div>");
		return new Question(QuestionFactory.ARITHMETIC, html.toString());
	}

}
