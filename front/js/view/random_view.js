
function ShowRandomQuiz() {
    console.log('ShowRandomQuiz');

	CreateQuestion('#questionRandom', GetRandomTopic(), GetRandomLevel());
	
	$("#home").hide();
	$("#random").show();
	$("#topics").hide();
}

function GetRandomTopic() {
	var random = Math.random();
    if (random > 0.9) { return 'time'; }
    if (random > 0.8) { return 'geography'; }
    else if (random > 0.7) { return 'serie'; }
    else if (random > 0.6) { return 'pattern'; }
    else if (random > 0.5) { return 'question_language'; }
    else if (random > 0.1) { return 'arithmetic'; }
    else { return 'language'; }
}

function GetRandomLevel() {
    return 3;
}
