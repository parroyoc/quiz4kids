
function CreateQuestion(topic, level) {
    console.log('createQuestion');
    var htmlQuestion = GetHtmlForQuestion(topic, level);
    $("#question").html(htmlQuestion);
}

function GetHtmlForQuestion(topic, level) {
    console.log('GetHtmlForQuestion');
	if (topic == 'maths') {
		return GetHtmlForAritmethicQuestion(level);
	}
	if (topic == 'pattern') {
		return GetHtmlForPatternQuestion(level);
	}
	if (topic == 'language') {
		return GetHtmlForLanguageQuestion(level);
	}
	if (topic == 'geography') {
		return GetHtmlForGeographyQuestion(level);
	}
	if (topic == 'time') {
		return GetHtmlForTimeQuestion(level);
	}
	if (topic == 'serie') {
		return GetHtmlForSerieQuestion(level);
	}
	if (topic == 'question_language') {
		return GetHtmlForQuestionLanguageQuestion(level);
	}
}

function GetHtmlForAritmethicQuestion(level) {
    console.log('GetHtmlForAritmethicQuestion');
	var html = '<div class="aritmetic">'
	html = html + '<p class="number">14</p>';
	html = html + '<p class="operator">+</p>';
	html = html + '<p class="number">5</p>';
	html = html + '<p class="operator">=</p>';
	html = html + '<p class="question">?</p>';
	html = html + '<br/>';
	html = html + '<input type="submit" id="solution1" class="solution" value="18"/>';
	html = html + '<input type="submit" id="solution2" class="solution" value="20"/>';
	html = html + '<input type="submit" id="solution2" class="solution" value="19"/>';
	html = html + '<input type="submit" id="solution2" class="solution" value="21"/>';
	html = html + '</div>'
	return html;
}

function GetHtmlForLanguageQuestion(level) {
    console.log('GetHtmlForLanguageQuestion');
	var html = '<div class="language">'
	html = html + '<p class="question">Select a synonym for</p>';
	html = html + '<br/>';
	html = html + '<p class="word">Funny</p>';
	html = html + '<br/>';
	html = html + '<input type="submit" id="solution1" class="solution" value="Joyful"/>';
	html = html + '<input type="submit" id="solution2" class="solution" value="Sad"/>';
	html = html + '<input type="submit" id="solution2" class="solution" value="Nice"/>';
	html = html + '<input type="submit" id="solution2" class="solution" value="Sparkly"/>';
	html = html + '</div>'
	return html;
}

function GetHtmlForPatternQuestion(level) {
    console.log('GetHtmlForPatternQuestion');
	var html = '<div class="pattern">'
	html = html + '<p class="question">What\'s next?</p>';
	html = html + '<br/>';
	html = html + '<div class="shapeBig"><div class="circle1"/></div>';
	html = html + '<div class="shapeBig"><div class="triangle1"/></div>';
	html = html + '<div class="shapeBig"><div class="square1"/></div>';
	html = html + '<div class="shapeBig"><div class="circle1"/></div>';
	html = html + '<div class="shapeBig"><div class="triangle1"/></div>';
	html = html + '<br/>';
	html = html + '<div class="solution"><div class="shapeSmall"><div class="square1"/></div></div>';
	html = html + '<div class="solution"><div class="shapeSmall"><div class="triangle1"/></div></div>';
	html = html + '<div class="solution"><div class="shapeSmall"><div class="circle1"/></div></div>';
	html = html + '<div class="solution"><div class="shapeSmall"><div class="square2"/></div></div>';
	html = html + '</div>'
	return html;
}

function GetHtmlForGeographyQuestion(level) {
    console.log('GetHtmlForGeographyQuestion');
	var html = '<div class="geography">'
	html = html + '<p class="question">Where is Spain?</p>';
	html = html + '<br/>';
	html = html + '<div class="worldMap">';
	html = html + '<div class="locationMap" style="top:79px;left:417px;"><div class="location1"/></div>';
	html = html + '<div class="locationMap" style="top:93px;left:280px;"><div class="location2"/></div>';
	html = html + '<div class="locationMap" style="top:110px;left:630px;"><div class="location3"/></div>';
	html = html + '<div class="locationMap" style="top:200px;left:340px;"><div class="location4"/></div>';
	html = html + '</div>';
	html = html + '<br/>';
	html = html + '<div class="solution"><div class="locationQuestion"><div class="location1"/></div></div>';
	html = html + '<div class="solution"><div class="locationQuestion"><div class="location2"/></div></div>';
	html = html + '<div class="solution"><div class="locationQuestion"><div class="location3"/></div></div>';
	html = html + '<div class="solution"><div class="locationQuestion"><div class="location4"/></div></div>';
	html = html + '</div>'
	return html;
}

function GetHtmlForTimeQuestion(level) {
    console.log('GetHtmlForTimeQuestion');
	var html = '<div class="time">'
	html = html + '<p class="question">Which clock displays 5:30?</p>';
	html = html + '<br/>';
	html = html + '<div class="clock"><div class="hours" style="transform: translate(100px,96px) rotate(75deg); transform-origin: center left;"/><div class="minutes" style="transform: translate(100px,93px) rotate(90deg); transform-origin: center left;"/></div>';
	html = html + '<div class="clock"><div class="hours" style="transform: translate(100px,96px) rotate(65deg); transform-origin: center left;"/><div class="minutes" style="transform: translate(100px,93px) rotate(-30deg); transform-origin: center left;"/></div>';
	html = html + '<div class="clock"><div class="hours" style="transform: translate(100px,96px) rotate(-65deg); transform-origin: center left;"/><div class="minutes" style="transform: translate(100px,93px) rotate(180deg); transform-origin: center left;"/></div>';
	html = html + '<div class="clock"><div class="hours" style="transform: translate(100px,96px) rotate(-30deg); transform-origin: center left;"/><div class="minutes" style="transform: translate(100px,93px) rotate(100deg); transform-origin: center left;"/></div>';
	html = html + '<br/>';
	html = html + '<input type="submit" id="solution1" class="solution" value="a"/>';
	html = html + '<input type="submit" id="solution2" class="solution" value="b"/>';
	html = html + '<input type="submit" id="solution2" class="solution" value="c"/>';
	html = html + '<input type="submit" id="solution2" class="solution" value="d"/>';
	return html;
}

function GetHtmlForSerieQuestion(level) {
    console.log('GetHtmlForSerieQuestion');
	var html = '<div class="serie">'
	html = html + '<p class="question">What goes next?</p>';
	html = html + '<br/>';
	html = html + '<p class="item">1</p>';
	html = html + '<p class="separator">,</p>';
	html = html + '<p class="item">3</p>';
	html = html + '<p class="separator">,</p>';
	html = html + '<p class="item">5</p>';
	html = html + '<p class="separator">,</p>';
	html = html + '<p class="next">?</p>';
	html = html + '<br/>';
	html = html + '<input type="submit" id="solution1" class="solution" value="6"/>';
	html = html + '<input type="submit" id="solution2" class="solution" value="7"/>';
	html = html + '<input type="submit" id="solution2" class="solution" value="9"/>';
	html = html + '<input type="submit" id="solution2" class="solution" value="12"/>';
	html = html + '</div>'
	return html;
}

function GetHtmlForQuestionLanguageQuestion(level) {
    console.log('GetHtmlForQuestionLanguageQuestion');
	var html = '<div class="general_question">'
	html = html + '<p class="title">Which word is the verb?</p>';
	html = html + '<br/>';
	html = html + '<p class="question">Elvira joins Elisa in the park</p>';
	html = html + '<br/>';
	html = html + '<input type="submit" id="solution1" class="solution" value="Elvira"/>';
	html = html + '<input type="submit" id="solution2" class="solution" value="joins"/>';
	html = html + '<input type="submit" id="solution2" class="solution" value="Elisa"/>';
	html = html + '<input type="submit" id="solution2" class="solution" value="park"/>';
	html = html + '</div>'
	return html;
}
