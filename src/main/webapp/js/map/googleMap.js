var myCenter=new google.maps.LatLng(28.629724, 77.436029);
function initialize()
{
	var mapProp = 
	{
		center:myCenter,
		zoom:15,
		mapTypeId:google.maps.MapTypeId.ROADMAP
	};

	var map=new google.maps.Map(document.getElementById("googleMap"),mapProp);

	var marker=new google.maps.Marker(
	{
		position:myCenter,
		title:'Click to zoom'
	});

	marker.setMap(map);

	var infowindow = new google.maps.InfoWindow(
	{
		content:"We Are Here!"
	});

	google.maps.event.addListener(marker, 'click', function()
	{
		infowindow.open(map,marker);
	});
 
	// Zoom to 9 when clicking on marker
	google.maps.event.addListener(marker,'click',function() 
	{
		map.setZoom(20);
		map.setCenter(marker.getPosition());
	});
     
}
google.maps.event.addDomListener(window, 'load', initialize);