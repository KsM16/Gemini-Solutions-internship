	

	GET()
{
		web_set_sockets_option("SSL_VERSION","TLS1.2");
		web_reg_save_param_json(
		"ParamName=Id",
		"QueryString=$.data.id",
		SEARCH_FILTERS,
		LAST);

		lr_start_transaction("API_101_GET");
		
		web_custom_request("web_custom_request",
		"URL=https://reqres.in/api/users/2",
		"Method=GET",
		"TargetFrame=",
		"Resource=0",
		"Referer=",
		"Body=",
		LAST);
		
		if (atoi(lr_eval_string("{Id}")) == 2){
			lr_end_transaction("API_101_GET",LR_PASS);
			lr_vuser_status_message("GET request is PASSED");
		}else{
			lr_end_transaction("API_101_GET",LR_FAIL);
			lr_error_message("FAULED");
		}
		 
	return 0;
}
