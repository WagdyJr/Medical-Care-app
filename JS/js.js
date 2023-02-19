// Get the modal
var modal = document.getElementById('docsignin');
var modal1 = document.getElementById('patsignin');
var modal2 = document.getElementById('patsignup');
var modal3= document.getElementById('docsignup');

// When the user clicks anywhere outside of the modal, close it
window.onclick = function(event) {
    if (event.target == modal) 
        modal.style.display = "none";
    if (event.target == modal1) 
        modal1.style.display = "none";
    if (event.target == modal2) 
        modal2.style.display = "none";
    if (event.target == modal3) 
      modal3.style.display = "none";
}
//Back to top buttom
mybutton = document.getElementById("myBtn");
window.onscroll = function() {
	scrollFunction()
};

function scrollFunction() {
  if (document.documentElement.scrollTop > 50) {
    mybutton.style.display = "block";
  } else {
    mybutton.style.display = "none";
  }
}

function topFunction() {
	window.scrollTo({top: 0, behavior: 'smooth'});
}
