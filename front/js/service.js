/* service.js - Service layer */

var lang="ES";
var serviceUrl = "http://localhost:8080";

function SetDocumentTitle() {
    console.log('SetDocumentTitle for sessionId ' + sessionId);
    var userInfo = _GetUserInfo(_SetDocumentTitleCallBack);
}

function _SetDocumentTitleCallBack(result) {
    console.log('_GetUserNameCallBack with ' + result);
    var data = jQuery.parseJSON(result);
    userName = data['Name'];
    userPhoto = "photo" + data['Id'];
    $("#userOptionsButton").css('background-image', 'url(' + baseURLphoto + userPhoto + '.png)');
    $("#userStatus").html(data['Daring'] + " daring " + data['Done'] + " done");
    console.log('name is ' + userName);
    document.title = userName + " at ItDares.com";
}

function GetHtmlForQuestion(callback, target, topic, level){
    console.log('GetHtmlForQuestion for sessionId ' + sessionId + ' topic ' + topic + ' level ' + level);
    _ServiceJsonCall(serviceUrl + "/question/generateQuestion/" + sessionId + "/" + topic + "/" + level, function (result) { _GetHtmlForQuestionCallBack(result, target, topic, level, callback) });
}

function _GetHtmlForQuestionCallBack(result, target, topic, level, callback) {
    callback(target, result['html']);
}


/* PRIVATE FUNCTIONS */

function _ServiceJsonCall(url, callback) {
    console.log('_ServiceCall with ' + url);
    $.ajax({
        type: "GET",
        url: url,
        contentType: "application/json; charset=utf-8",
        headers: {'Access-Control-Allow-Origin': '*'},
        dataType: "json",
        success: callback
    });
}
