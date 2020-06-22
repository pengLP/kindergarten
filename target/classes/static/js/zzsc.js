var flag=1;
$('#rightArrow').click(function(){
	if(flag==1){
		$("#floatDivBoxs").animate({right: '-200px'},300);
		$(this).animate({right: '-5px'},300);
		$(this).css('background-position','-50px 0');
		flag=0;
	}else{
		$("#floatDivBoxs").animate({right: '0'},300);
		$(this).animate({right: '200px'},300);
		$(this).css('background-position','0px 0');
		flag=1;
	}
});



var flag=1;
$('#righthk').click(function(){
	if(flag==1){
		$("#floaB").animate({left: '-200px'},300);
		$(this).animate({left: '-5px'},300);
		$(this).css('background-position','-50px 0');
		flag=0;
	}else{
		$("#floaB").animate({left: '0'},300);
		$(this).animate({left: '200px'},300);
		$(this).css('background-position','0px 0');
		flag=1;
	}
});