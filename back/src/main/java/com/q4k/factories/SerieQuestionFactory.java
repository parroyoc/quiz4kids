package com.q4k.factories;

import com.q4k.Question;

public class SerieQuestionFactory implements IQuestionFactory {

	@Override
	public Question generateQuestion(int level) {
		StringBuilder html = new StringBuilder("<div class='serie'>");
		html.append("<p class='question'>What goes next?</p>")
			.append("<br/>")
			.append("<p class='item'>1</p>")
			.append("<p class='separator'>,</p>")
			.append("<p class='item'>3</p>")
			.append("<p class='separator'>,</p>")
			.append("<p class='item'>5</p>")
			.append("<p class='separator'>,</p>")
			.append("<p class='next'>?</p>")
			.append("<br/>")
			.append("<input type='submit' id='solution1' class='solution' value='6'/>")
			.append("<input type='submit' id='solution2' class='solution' value='7'/>")
			.append("<input type='submit' id='solution3' class='solution' value='9'/>")
			.append("<input type='submit' id='solution4' class='solution' value='12'/>")
			.append("</div>");
		return new Question(QuestionFactory.SERIE, html.toString());
	}
}
