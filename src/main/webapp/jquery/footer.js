$(document).ready(function()
		{
			$(".scrollup").fadeOut();
			$(window).on("scroll",function()
			{
				if ($(this).scrollTop() > 100)
				{
					$('.scrollup').fadeIn();
				} 
				else 
				{
					$('.scrollup').fadeOut();
				}
			});
			$('.scrollup').click(function()
			{
				$("html, body").animate({ scrollTop: 0 }, 600);
				return false;
			});
		});