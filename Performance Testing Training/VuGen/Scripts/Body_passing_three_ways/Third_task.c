Third_task()
{
	
	    
    lr_save_string("101", "myString");

     
    int myNumber = atoi(lr_eval_string("{myString}"));
    lr_output_message("Number value: %d", myNumber);

     
    char jsonBody[200];
    sprintf(jsonBody, "{ \"name\": \"TestUser\", \"job\": \"Tester\", \"id\": %d }", myNumber);

    lr_output_message("JSON Body: %s", jsonBody);

    
    web_custom_request("CreateUser",
        "URL=https://reqres.in/api/users",
        "Method=POST",
        "TargetFrame=",
        "Resource=0",
        "RecContentType=application/json",
        "Mode=HTTP",
        "EncType=application/json",
        "BodyBinary={jsonBody}",
        LAST
    );

 
    lr_output_message("Response: %s", lr_eval_string("{CreateUser}"));
	return 0;
}

