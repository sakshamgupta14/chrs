$(document).ready(function()
		{
			$(window).on("scroll",function()
			{
				if($(window).scrollTop() > 140)
					{
						$("#mynavbar").css('position','fixed');
						$("#mynavbar").css('top','0px');
						$("#mynavbar").css('width','100%');
					}
				else if($(window).scrollTop() < 140)
					{
						$("#mynavbar").css('position','relative');
					}
	
			});	


		});