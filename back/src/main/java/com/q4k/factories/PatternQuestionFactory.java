package com.q4k.factories;

import com.q4k.Question;

public class PatternQuestionFactory implements IQuestionFactory {

	@Override
	public Question generateQuestion(int level) {
		StringBuilder html = new StringBuilder("<div class='pattern'>");
		html.append("<p class='question'>What's next?</p>")
			.append("<br/>")
			.append("<div class='shapeBig'><div class='circle1'/></div>")
			.append("<div class='shapeBig'><div class='triangle1'/></div>")
			.append("<div class='shapeBig'><div class='square1'/></div>")
			.append("<div class='shapeBig'><div class='circle1'/></div>")
			.append("<div class='shapeBig'><div class='triangle1'/></div>")
			.append("<br/>")
			.append("<div class='solution'><div class='shapeSmall'><div class='square1'/></div></div>")
			.append("<div class='solution'><div class='shapeSmall'><div class='triangle1'/></div></div>")
			.append("<div class='solution'><div class='shapeSmall'><div class='circle1'/></div></div>")
			.append("<div class='solution'><div class='shapeSmall'><div class='square2'/></div></div>")
			.append("</div>");
		return new Question(QuestionFactory.PATTERN, html.toString());
	}
}