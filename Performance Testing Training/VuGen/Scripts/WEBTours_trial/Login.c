Login()
{
//	web_set_sockets_option("SSL_VERSION", "AUTO");
	
	web_submit_form("login.pl", 
		"Snapshot=t2.inf", 
		ITEMDATA, 
		"Name=username", "Value=jojo", ENDITEM, 
		"Name=password", "Value=bean", ENDITEM, 
		LAST);

//	lr_end_transaction("Login",LR_AUTO);
	return 0;
}
