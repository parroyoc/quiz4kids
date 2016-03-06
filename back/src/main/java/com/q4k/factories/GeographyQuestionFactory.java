package com.q4k.factories;

import com.q4k.Question;

public class GeographyQuestionFactory implements IQuestionFactory {

	@Override
	public Question generateQuestion(int level) {
		StringBuilder html = new StringBuilder("<div class='geography'>");
		html.append("<p class='question'>Where is Spain?</p>")
			.append("<br/>")
			.append("<div class='worldMap'>")
			.append("<div class='locationMap' style='top:79px;left:417px;'><div class='location1'/></div>")
			.append("<div class='locationMap' style='top:93px;left:280px;'><div class='location2'/></div>")
			.append("<div class='locationMap' style='top:110px;left:630px;'><div class='location3'/></div>")
			.append("<div class='locationMap' style='top:200px;left:340px;'><div class='location4'/></div>")
			.append("</div>")
			.append("<br/>")
			.append("<div class='solution'><div class='locationQuestion'><div class='location1'/></div></div>")
			.append("<div class='solution'><div class='locationQuestion'><div class='location2'/></div></div>")
			.append("<div class='solution'><div class='locationQuestion'><div class='location3'/></div></div>")
			.append("<div class='solution'><div class='locationQuestion'><div class='location4'/></div></div>")
			.append("</div>");
		return new Question(QuestionFactory.GEOGRAPHY, html.toString());
	}
}