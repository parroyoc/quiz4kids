package com.q4k.factories;

import com.q4k.Question;

public class QuestionLanguageQuestionFactory implements IQuestionFactory {

	@Override
	public Question generateQuestion(int level) {
		StringBuilder html = new StringBuilder("<div class='general_question'>");
		html.append("<p class='title'>Which word is the verb?</p>")
			.append("<br/>")
			.append("<p class='question'>Elvira joins Elisa in the park</p>")
			.append("<br/>")
			.append("<input type='submit' id='solution1' class='solution' value='Elvira'/>")
			.append("<input type='submit' id='solution2' class='solution' value='joins'/>")
			.append("<input type='submit' id='solution3' class='solution' value='Elisa'/>")
			.append("<input type='submit' id='solution4' class='solution' value='park'/>")
			.append("</div>");
		return new Question(QuestionFactory.QUESTION_LANGUAGE, html.toString());
	}
}