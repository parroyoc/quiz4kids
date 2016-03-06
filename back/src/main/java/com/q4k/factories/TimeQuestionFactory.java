package com.q4k.factories;

import com.q4k.Question;

public class TimeQuestionFactory implements IQuestionFactory {

	@Override
	public Question generateQuestion(int level) {
		StringBuilder html = new StringBuilder("<div class='time'>");
		html.append("<p class='question'>Which clock displays 5:30?</p>")
			.append("<br/>")
			.append("<div class='clock'><div class='hours' style='transform: translate(100px,96px) rotate(75deg); transform-origin: center left;'/><div class='minutes' style='transform: translate(100px,93px) rotate(90deg); transform-origin: center left;'/></div>")
			.append("<div class='clock'><div class='hours' style='transform: translate(100px,96px) rotate(65deg); transform-origin: center left;'/><div class='minutes' style='transform: translate(100px,93px) rotate(30deg); transform-origin: center left;'/></div>")
			.append("<div class='clock'><div class='hours' style='transform: translate(100px,96px) rotate(-65deg); transform-origin: center left;'/><div class='minutes' style='transform: translate(100px,93px) rotate(180deg); transform-origin: center left;'/></div>")
			.append("<div class='clock'><div class='hours' style='transform: translate(100px,96px) rotate(-30deg); transform-origin: center left;'/><div class='minutes' style='transform: translate(100px,93px) rotate(100deg); transform-origin: center left;'/></div>")
			.append("<br/>")
			.append("<input type='submit' id='solution1' class='solution' value='a'/>")
			.append("<input type='submit' id='solution2' class='solution' value='b'/>")
			.append("<input type='submit' id='solution3' class='solution' value='c'/>")
			.append("<input type='submit' id='solution4' class='solution' value='d'/>")
			.append("</div>");
		return new Question(QuestionFactory.TIME, html.toString());
	}
}
