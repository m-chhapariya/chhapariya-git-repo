$(document).ready(function() {
	$('#sliderhtml').load("/views/slider.html");
	$('#contentDiv').load("/views/article-content.html");
});

$('.sign-anchor').on('click', function (e) {
	// When the user clicks anywhere outside of the modal, close it
	$('#signupform').show();
	$('#fullpage').fadeTo("fast", 0.3);
});

$('.contact-us').on('click', function (e) {
	$('#contact-div').show();
	$('#fullpage').fadeTo("fast", 0.3);
});

