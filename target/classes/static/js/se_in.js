// JavaScript Document


$(function(){ 
	$.divselect("#divselect","#inputselect"); 
	});

	jQuery.divselect = function(divselectid,inputselectid) { 
	var inputselect = $(inputselectid); 
	$(divselectid+" .my-select").click(function(){ 
	var ul = $(divselectid+" ul"); 
	if(ul.css("display")=="none"){ 
	ul.slideDown("fast"); 
	}else{ 
	ul.slideUp("fast"); 
	} 
	}); 
	$(divselectid+" ul li").click(function(){ 
	var txt = $(this).text(); 
	$(divselectid+" .my-select").html(txt); 
	var value = $(this).attr("selectid"); 
	inputselect.val(value); 
	$(divselectid+" ul").hide(); 
	 
	}); 
	};