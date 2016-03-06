
function CreateQuestion(target, topic, level) {
    console.log('createQuestion');
    var htmlQuestion = GetHtmlForQuestion(_RenderQuestion, target, topic, level);
}

function _RenderQuestion(target, html) {
	console.log('_RenderQuestion with ' + html);
	$(target).html(html);
}

