$(document).ready(function() {
	$('#sliderhtml').load("/views/slider.html");
	$('#contentDiv').load("/views/article-content.html");
	$('#signupform').hide();
});

$(document).ready(function(){
	$('.sign-anchor').on('click', function (e) {
		// When the user clicks anywhere outside of the modal, close it
		$('#signupform').show();
		$('#fullpage').fadeTo("fast", 0.4);;
	});
});