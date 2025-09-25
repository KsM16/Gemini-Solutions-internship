Diff_file_20_times()
{
	web_set_sockets_option("SSL_VERSION","TLS1.2");

    web_add_header("Content-Type","application/json");
    web_add_header("accept","*/*");
    web_add_header("x-api-key","reqres-free-v1");
	
	int i;

    for (i=1; i<=20; i++)
    {
        char *currentFile = lr_eval_string("{FileParam}");

        lr_start_transaction(lr_eval_string("Upload_{FileParam}"));

        web_custom_request("Upload_File",
            "URL=https://reqres.in/api/users",
            "Method=POST",
            "Resource=0",
            "EncType=application/json",
            "Body={\"name\":\"{FileParam}\", \"job\":\"uploader\"}",
            LAST);

        lr_output_message("Uploaded File from parameter: %s", currentFile);

        lr_end_transaction(lr_eval_string("Upload_{FileParam}"), LR_AUTO);
    }
	return 0;
}

