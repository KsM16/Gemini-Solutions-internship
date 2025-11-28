Action()
{

	web_add_auto_header("Accept-Language", 
		"en-US,en;q=0.9");

	web_url("WebTours", 
		"URL=http://localhost:1080/WebTours/", 
		"Resource=0", 
		"RecContentType=text/html", 
		"Referer=", 
		"Snapshot=t1.inf", 
		"Mode=HTML", 
		LAST);

	web_set_sockets_option("SSL_VERSION", "AUTO");

	lr_think_time(58);

	web_submit_form("login.pl", 
		"Snapshot=t2.inf", 
		ITEMDATA, 
		"Name=username", "Value=jojo", ENDITEM, 
		"Name=password", "Value=bean", ENDITEM, 
		LAST);

	web_image("Search Flights Button", 
		"Alt=Search Flights Button", 
		"Snapshot=t3.inf", 
		LAST);

/* Added by Async CodeGen.
ID=Poll_0
ScanType = Recording

The following URLs are considered part of this conversation:
	http://localhost:1080/cgi-bin/reservations.pl

TODO - The following callbacks have been added to AsyncCallbacks.c.
Add your code to the callback implementations as necessary.
	Poll_0_RequestCB
	Poll_0_ResponseCB
 */
	web_reg_async_attributes("ID=Poll_0", 
		"Pattern=Poll", 
		"URL=http://localhost:1080/cgi-bin/reservations.pl", 
		"PollIntervalMs=1000", 
		"RequestCB=Poll_0_RequestCB", 
		"ResponseCB=Poll_0_ResponseCB", 
		LAST);

	web_submit_form("reservations.pl", 
		"Snapshot=t4.inf", 
		ITEMDATA, 
		"Name=depart", "Value=Denver", ENDITEM, 
		"Name=departDate", "Value=09/20/2025", ENDITEM, 
		"Name=arrive", "Value=Denver", ENDITEM, 
		"Name=returnDate", "Value=09/21/2025", ENDITEM, 
		"Name=numPassengers", "Value=1", ENDITEM, 
		"Name=roundtrip", "Value=<OFF>", ENDITEM, 
		"Name=seatPref", "Value=None", ENDITEM, 
		"Name=seatType", "Value=Coach", ENDITEM, 
		LAST);

/* Removed by Async CodeGen.
ID = Poll_0
 */
	/*
 web_submit_form("reservations.pl_2",
		"Snapshot=t5.inf",
		ITEMDATA,
		"Name=outboundFlight", "Value=000;0;09/20/2025", ENDITEM,
		"Name=reserveFlights.x", "Value=64", ENDITEM,
		"Name=reserveFlights.y", "Value=9", ENDITEM,
		LAST); 
	*/

/* Removed by Async CodeGen.
ID = Poll_0
 */
	/*
 web_submit_form("reservations.pl_3",
		"Snapshot=t6.inf",
		ITEMDATA,
		"Name=firstName", "Value=Jojo", ENDITEM,
		"Name=lastName", "Value=Bean", ENDITEM,
		"Name=address1", "Value=", ENDITEM,
		"Name=address2", "Value=", ENDITEM,
		"Name=pass1", "Value=Jojo Bean", ENDITEM,
		"Name=creditCard", "Value=", ENDITEM,
		"Name=expDate", "Value=", ENDITEM,
		"Name=saveCC", "Value=<OFF>", ENDITEM,
		LAST); 
	*/

/* Added by Async CodeGen.
ID = Poll_0
 */
	web_stop_async("ID=Poll_0", 
		LAST);

	web_image("SignOff Button", 
		"Alt=SignOff Button", 
		"Snapshot=t7.inf", 
		LAST);

	return 0;
}