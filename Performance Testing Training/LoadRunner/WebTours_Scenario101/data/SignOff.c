SignOff()
{

	web_add_header("Accept-Language", 
		"en-US,en;q=0.9");

	lr_think_time(31);

	web_url("welcome.pl_3", 
		"URL=http://localhost:1080/cgi-bin/welcome.pl?signOff=1", 
		"TargetFrame=", 
		"Resource=0", 
		"RecContentType=text/html", 
		"Referer=http://localhost:1080/cgi-bin/nav.pl?page=menu&in=itinerary", 
		"Snapshot=t8.inf", 
		"Mode=HTML", 
		LAST);

	return 0;
}