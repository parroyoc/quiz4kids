
function ShowHome() {
    console.log('ShowHome');

	$('.carousel').carousel({
		interval: 5000 
	})

	$("#home").show();
	$("#random").hide();
	$("#topics").hide();
}
