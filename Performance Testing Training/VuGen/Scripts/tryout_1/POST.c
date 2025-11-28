POST()
{
	web_set_sockets_option("SSL_VERSION","TLS1.2");
	web_add_header("Content-Type","application/json");
	web_add_header("accept","*/*");
	
	web_add_header("x-api-key","reqres-free-v1");
	
	web_reg_save_param_json(
		"ParamName=Name",
		"QueryString=$.name",
		SEARCH_FILTERS,
		LAST);
	
	lr_start_transaction("API_101_POST");
	
	web_custom_request("web_custom_request",
		"URL=https://reqres.in/api/users",
		"Method=POST",
		"TargetFrame=",
		"Resource=0",
		"Referer=",
		"Body={"
    "\"name\": \"morpheus\","
    "\"job\": \"leader\""
"}",
		LAST);
	
	
	if(strcmp(lr_eval_string("{Name}"),"morpheus") == 0){
		lr_end_transaction("API_101_POST",LR_PASS);
		lr_vuser_status_message("PASSED");
	}else{
		lr_end_transaction("API_101_POST",LR_FAIL);
		lr_vuser_status_message("FAILED!!!");
	}


	return 0;
}
