//   *****************************************************************************************************************************************
//   ****   PLEASE NOTE: This is a READ-ONLY representation of the actual script. For editing please press the "Develop Script" button.   ****
//   *****************************************************************************************************************************************

Action()
{
	truclient_step("1", "Verify [Choose an object]", "snapshot=Action_1.inf");
	lr_start_transaction("WebTourLaunch");
	truclient_step("2", "Reload current page", "snapshot=Action_2.inf");
	lr_end_transaction("WebTourLaunch",0);
	truclient_step("3", "Wait until Login button exists", "snapshot=Action_3.inf");
	truclient_step("4", "Click on Username textbox", "snapshot=Action_4.inf");
	truclient_step("5", "Type TC.getParam(name['username']); in Username textbox", "snapshot=Action_5.inf");
	truclient_step("6", "Type ******** in Password passwordbox", "snapshot=Action_6.inf");
	lr_start_transaction("Click_Login");
	truclient_step("7", "Click on Login button", "snapshot=Action_7.inf");
	truclient_step("8", "Wait until Search Flights Button image exists", "snapshot=Action_8.inf");
	lr_end_transaction("Click_Login",0);
	lr_start_transaction("Click_Flights");
	truclient_step("9", "Click on Search Flights Button image", "snapshot=Action_9.inf");
	truclient_step("10", "Wait until Departure City gridcell exists", "snapshot=Action_10.inf");
	lr_end_transaction("Click_Flights",0);
	truclient_step("11", "Select deaprtCity from Departure City listbox", "snapshot=Action_11.inf");
	truclient_step("12", "Select arriveCity from Arrival City listbox", "snapshot=Action_12.inf");
	truclient_step("13", "Type departDate in 09/23/2025 textbox", "snapshot=Action_13.inf");
	truclient_step("14", "Type returnDate in 09/23/2025 textbox", "snapshot=Action_14.inf");
	truclient_step("15", "Click on 1 textbox", "snapshot=Action_15.inf");
	truclient_step("16", "Type 6 in 1 textbox", "snapshot=Action_16.inf");
	truclient_step("17", "Click on AisleAisle label", "snapshot=Action_17.inf");
	truclient_step("18", "Click on FirstFirst label", "snapshot=Action_18.inf");
	lr_start_transaction("Click_FinfFlights");
	truclient_step("19", "Click on findFlights button", "snapshot=Action_19.inf");
	truclient_step("20", "Wait until [object HTMLFontElement] decorator exists", "snapshot=Action_20.inf");
	lr_end_transaction("Click_FinfFlights",0);
	truclient_step("21", "Click on 981;1793;09/22/2025 radio", "snapshot=Action_21.inf");
	truclient_step("22", "Click on reserveFlights button", "snapshot=Action_22.inf");
	lr_start_transaction("Payment_Details");
	truclient_step("23", "Click on Street Address textbox", "snapshot=Action_23.inf");
	truclient_step("24", "Type ABC in Street Address textbox", "snapshot=Action_24.inf");
	truclient_step("25", "Type XYZ in City/State/Zip textbox", "snapshot=Action_25.inf");
	lr_end_transaction("Payment_Details",0);
	truclient_step("26", "Click on buyFlights button", "snapshot=Action_26.inf");
	lr_start_transaction("Click_Itinerary");
	truclient_step("27", "Click on Itinerary Button image", "snapshot=Action_27.inf");
	truclient_step("28", "Wait until [object HTMLFontElement] decorator exists", "snapshot=Action_28.inf");
	lr_end_transaction("Click_Itinerary",0);
	truclient_step("29", "Click on SignOff Button image", "snapshot=Action_29.inf");

	return 0;
}
