/* service.js - Service layer */

var sessionId;

function GetSessionId() {
    var match = RegExp('[?&]sessionId=([^&]*)').exec(window.location.search);
    sessionId = match && decodeURIComponent(match[1].replace(/\+/g, ' '));
    console.log('Session retrieved is ' + sessionId);
	var loginStatus = 'Logged in as Pablo'; // TODO
	$("#login").html(loginStatus);
    return sessionId;
}

function Login(login, pwd) {
    console.log('Login with ' + login + ', ' + pwd);
    _ServiceJsonCall(serviceUrl + "/Login?u=" + login + "&p=" + pwd, _LoginCallBack);
}

function _LoginCallBack(result) {
    console.log('_loginCallBack with ' + result);
    var data = jQuery.parseJSON(result);
    var sessionId = data['SessionId'];
    console.log('SessionId is ' + sessionId);
    if (sessionId == null || sessionId == "0") {
        console.log('Login incorrecto, mostrar algo');
        $('#password').val('');
    }
    else {
        window.location.replace("index.html?sessionId=" + sessionId);
    }
}

function Register(login) {
    console.log('Register with ' + login);
    window.location.replace("index.html?sessionId=222222222222222222222");
    // TODO
}

function Logout() {
    console.log('Logout for sessionId ' + sessionId);
    _ServiceJsonCall(serviceUrl + "/Logout?sessionid=" + sessionId, null);
	var loginStatus = 'Log in'; // TODO
	$("#login").html(loginStatus);
}
