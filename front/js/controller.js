
function InitController(){
  console.log('initController');
  
  $("#gotoHome").click(function(){
	  ShowHome();
  });
  $("#gotoRandomQuiz").click(function(){
	  ShowRandomQuiz();
  });
  $("#gotoTopics").click(function(){
	  ShowTopics();
  });
  
  SetLoginStatus();
  
  ShowTopics();
}

function SetLoginStatus() {
	var sessionId = GetSessionId();
	if (sessionId == null) Logout();
}
