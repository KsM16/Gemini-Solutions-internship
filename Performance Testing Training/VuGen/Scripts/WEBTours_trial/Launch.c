Launch()
{

//	lr_start_transaction("Login");
//
//	
//
		web_set_sockets_option("SSL_VERSION", "AUTO");
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

//	lr_think_time(166);

	
	
//	lr_think_time(51);

//	lr_start_transaction("Click_Flights");

//	web_image("Search Flights Button", 
//		"Alt=Search Flights Button", 
//		"Snapshot=t3.inf", 
//		LAST);

//	lr_end_transaction("Click_Flights",LR_AUTO);

//	lr_think_time(137);

//	lr_start_transaction("Click_Continue_1");

//	web_submit_form("reservations.pl", 
//		"Snapshot=t4.inf", 
//		ITEMDATA, 
//		"Name=depart", "Value=Frankfurt", ENDITEM, 
//		"Name=departDate", "Value=09/22/2025", ENDITEM, 
//		"Name=arrive", "Value=Denver", ENDITEM, 
//		"Name=returnDate", "Value=09/25/2025", ENDITEM, 
//		"Name=numPassengers", "Value=1", ENDITEM, 
//		"Name=roundtrip", "Value=<OFF>", ENDITEM, 
//		"Name=seatPref", "Value=Window", ENDITEM, 
//		"Name=seatType", "Value=Business", ENDITEM, 
//		LAST);

//	lr_end_transaction("Click_Continue_1",LR_AUTO);
//
//	lr_think_time(47);

//	lr_start_transaction("Click_Continue_2");

//	web_submit_form("reservations.pl_2", 
//		"Snapshot=t5.inf", 
//		ITEMDATA, 
//		"Name=outboundFlight", "Value=102;529;09/22/2025", ENDITEM, 
//		"Name=reserveFlights.x", "Value=53", ENDITEM, 
//		"Name=reserveFlights.y", "Value=10", ENDITEM, 
//		LAST);

//	lr_end_transaction("Click_Continue_2",LR_AUTO);

//	lr_think_time(79);

//	lr_start_transaction("Click_Continue_3");

//	web_submit_form("reservations.pl_3", 
//		"Snapshot=t6.inf", 
//		ITEMDATA, 
//		"Name=firstName", "Value=Jojo", ENDITEM, 
//		"Name=lastName", "Value=Bean", ENDITEM, 
//		"Name=address1", "Value=ABC", ENDITEM, 
//		"Name=address2", "Value=XYZ", ENDITEM, 
//		"Name=pass1", "Value=Jojo Bean", ENDITEM, 
//		"Name=creditCard", "Value=", ENDITEM, 
//		"Name=expDate", "Value=", ENDITEM, 
//		"Name=saveCC", "Value=<OFF>", ENDITEM, 
//		LAST);

//	lr_end_transaction("Click_Continue_3",LR_AUTO);
//
//	lr_think_time(57);

//	lr_start_transaction("Click_Itinerary");

//	web_image("Itinerary Button", 
//		"Alt=Itinerary Button", 
//		"Snapshot=t7.inf", 
//		LAST);

//	lr_end_transaction("Click_Itinerary",LR_AUTO);
//
//	lr_think_time(52);
//
//	lr_start_transaction("Click_SignOff");

//	web_image("SignOff Button", 
//		"Alt=SignOff Button", 
//		"Snapshot=t8.inf", 
//		LAST);

//	lr_end_transaction("Click_SignOff",LR_AUTO);

	return 0;
}