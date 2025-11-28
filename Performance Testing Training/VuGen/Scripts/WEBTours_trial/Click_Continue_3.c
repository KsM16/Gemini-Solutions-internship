Click_Continue_3()
{
	
		web_submit_form("reservations.pl_3", 
		"Snapshot=t6.inf", 
		ITEMDATA, 
		"Name=firstName", "Value=Jojo", ENDITEM, 
		"Name=lastName", "Value=Bean", ENDITEM, 
		"Name=address1", "Value=ABC", ENDITEM, 
		"Name=address2", "Value=XYZ", ENDITEM, 
		"Name=pass1", "Value=Jojo Bean", ENDITEM, 
		"Name=creditCard", "Value=", ENDITEM, 
		"Name=expDate", "Value=", ENDITEM, 
		"Name=saveCC", "Value=<OFF>", ENDITEM, 
		LAST);
	return 0;
}
