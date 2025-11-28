Click_Continue_2()
{
	web_submit_form("reservations.pl_2", 
		"Snapshot=t5.inf", 
		ITEMDATA, 
		"Name=outboundFlight", "Value=102;529;09/22/2025", ENDITEM, 
		"Name=reserveFlights.x", "Value=53", ENDITEM, 
		"Name=reserveFlights.y", "Value=10", ENDITEM, 
		LAST);
	
	return 0;
}
