Itinerary()
{

	web_add_header("Accept-Language", 
		"en-US,en;q=0.9");

	lr_think_time(20);

	web_url("welcome.pl_2", 
		"URL=http://localhost:1080/cgi-bin/welcome.pl?page=itinerary", 
		"TargetFrame=", 
		"Resource=0", 
		"RecContentType=text/html", 
		"Referer=http://localhost:1080/cgi-bin/nav.pl?page=menu&in=flights", 
		"Snapshot=t7.inf", 
		"Mode=HTML", 
		LAST);

	return 0;
}
