$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Adactin.feature");
formatter.feature({
  "line": 1,
  "name": "Hotel Booking in Adactin Application",
  "description": "",
  "id": "hotel-booking-in-adactin-application",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 3,
  "name": "Login Page",
  "description": "",
  "id": "hotel-booking-in-adactin-application;login-page",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 2,
      "name": "@smokeTest"
    }
  ]
});
formatter.step({
  "line": 4,
  "name": "User Launch the Application",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "User Enter The \"\u003cusername\u003e\" In UserName Field",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "User Enter The \"\u003cpassword\u003e\" In Password Field",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "User Click the Login Button",
  "keyword": "Then "
});
formatter.examples({
  "line": 8,
  "name": "",
  "description": "",
  "id": "hotel-booking-in-adactin-application;login-page;",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ],
      "line": 9,
      "id": "hotel-booking-in-adactin-application;login-page;;1"
    },
    {
      "cells": [
        "AAA",
        "123"
      ],
      "line": 10,
      "id": "hotel-booking-in-adactin-application;login-page;;2"
    },
    {
      "cells": [
        "BALAJIDS",
        "13TY8X"
      ],
      "line": 11,
      "id": "hotel-booking-in-adactin-application;login-page;;3"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 10,
  "name": "Login Page",
  "description": "",
  "id": "hotel-booking-in-adactin-application;login-page;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 2,
      "name": "@smokeTest"
    }
  ]
});
formatter.step({
  "line": 4,
  "name": "User Launch the Application",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "User Enter The \"AAA\" In UserName Field",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "User Enter The \"123\" In Password Field",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "User Click the Login Button",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.user_Launch_the_Application()"
});
formatter.result({
  "duration": 18018876100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "AAA",
      "offset": 16
    }
  ],
  "location": "StepDefinition.user_Enter_The_In_UserName_Field(String)"
});
formatter.result({
  "duration": 821882700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "123",
      "offset": 16
    }
  ],
  "location": "StepDefinition.user_Enter_The_In_Password_Field(String)"
});
formatter.result({
  "duration": 150064600,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_Click_the_Login_Button()"
});
formatter.result({
  "duration": 730050900,
  "status": "passed"
});
formatter.scenario({
  "line": 11,
  "name": "Login Page",
  "description": "",
  "id": "hotel-booking-in-adactin-application;login-page;;3",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 2,
      "name": "@smokeTest"
    }
  ]
});
formatter.step({
  "line": 4,
  "name": "User Launch the Application",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "User Enter The \"BALAJIDS\" In UserName Field",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "User Enter The \"13TY8X\" In Password Field",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "User Click the Login Button",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.user_Launch_the_Application()"
});
formatter.result({
  "duration": 617595800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "BALAJIDS",
      "offset": 16
    }
  ],
  "location": "StepDefinition.user_Enter_The_In_UserName_Field(String)"
});
formatter.result({
  "duration": 212939100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "13TY8X",
      "offset": 16
    }
  ],
  "location": "StepDefinition.user_Enter_The_In_Password_Field(String)"
});
formatter.result({
  "duration": 127208800,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_Click_the_Login_Button()"
});
formatter.result({
  "duration": 1580886900,
  "status": "passed"
});
formatter.scenario({
  "line": 13,
  "name": "Search Hotel Page",
  "description": "",
  "id": "hotel-booking-in-adactin-application;search-hotel-page",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 12,
      "name": "@sanityTest"
    }
  ]
});
formatter.step({
  "line": 14,
  "name": "User Select The Particular Country Location In The Location\u0027s Drop Down Box",
  "keyword": "When "
});
formatter.step({
  "line": 15,
  "name": "User Select The Particlar Hotel In The Hotel\u0027s Drop Down Box",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "User Select The Particular Roomtype In The Roomtype\u0027s Drop Down Box",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "User Select The Particular Number Of Rooms In The Number Of Room\u0027s  Drop Down Box",
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "User Select The Particular Check In Date In The Check In Date\u0027s  Drop Down Box",
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "User Select The Particular Check Out Date In The Check Out Date\u0027s  Drop Down Box",
  "keyword": "And "
});
formatter.step({
  "line": 20,
  "name": "User Select The Particular Adults per Room In The Adults per Room\u0027s  Drop Down Box",
  "keyword": "And "
});
formatter.step({
  "line": 21,
  "name": "User Select The Children per Room In The Children per Room\u0027s  Drop Down Box",
  "keyword": "And "
});
formatter.step({
  "line": 22,
  "name": "User Click the Search Button It\u0027s Navigate The Select Hotel Page",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.user_Select_The_Particular_Country_Location_In_The_Location_s_Drop_Down_Box()"
});
formatter.result({
  "duration": 303772000,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_Select_The_Particlar_Hotel_In_The_Hotel_s_Drop_Down_Box()"
});
formatter.result({
  "duration": 186671700,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_Select_The_Particular_Roomtype_In_The_Roomtype_s_Drop_Down_Box()"
});
formatter.result({
  "duration": 181856600,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_Select_The_Particular_Number_Of_Rooms_In_The_Number_Of_Room_s_Drop_Down_Box()"
});
formatter.result({
  "duration": 112410000,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_Select_The_Particular_Check_In_Date_In_The_Check_In_Date_s_Drop_Down_Box()"
});
formatter.result({
  "duration": 163849700,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_Select_The_Particular_Check_Out_Date_In_The_Check_Out_Date_s_Drop_Down_Box()"
});
formatter.result({
  "duration": 192739100,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_Select_The_Particular_Adults_per_Room_In_The_Adults_per_Room_s_Drop_Down_Box()"
});
formatter.result({
  "duration": 125952000,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_Select_The_Children_per_Room_In_The_Children_per_Room_s_Drop_Down_Box()"
});
formatter.result({
  "duration": 129152300,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_Click_the_Search_Button_It_s_Navigate_The_Select_Hotel_Page()"
});
formatter.result({
  "duration": 1184043900,
  "status": "passed"
});
formatter.scenario({
  "line": 24,
  "name": "Select Hotel Page",
  "description": "",
  "id": "hotel-booking-in-adactin-application;select-hotel-page",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 23,
      "name": "@sanityTest"
    }
  ]
});
formatter.step({
  "line": 25,
  "name": "User Select The Hotel With Search Hotel Page Clarification",
  "keyword": "When "
});
formatter.step({
  "line": 26,
  "name": "User Click the Continue Button It\u0027s Navigate The Select Book A Hotel Page",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.user_Select_The_Hotel_With_Search_Hotel_Page_Clarification()"
});
formatter.result({
  "duration": 114915600,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_Click_the_Continue_Button_It_s_Navigate_The_Select_Book_A_Hotel_Page()"
});
formatter.result({
  "duration": 1207774800,
  "status": "passed"
});
formatter.scenario({
  "line": 28,
  "name": "Book A Hotel Page",
  "description": "",
  "id": "hotel-booking-in-adactin-application;book-a-hotel-page",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 27,
      "name": "@stopTest"
    }
  ]
});
formatter.step({
  "line": 29,
  "name": "User Enter The First Name in In The First Name Field",
  "keyword": "When "
});
formatter.step({
  "line": 30,
  "name": "User Enter The Last Name in In The Last Name Field",
  "keyword": "And "
});
formatter.step({
  "line": 31,
  "name": "User Enter The Billing Address in In Billing Address Field",
  "keyword": "And "
});
formatter.step({
  "line": 32,
  "name": "User Enter The Credit Card No in In Credit Card No Field",
  "keyword": "And "
});
formatter.step({
  "line": 33,
  "name": "User Enter The Credit Card No in In Credit Card No Field",
  "keyword": "And "
});
formatter.step({
  "line": 34,
  "name": "User Select The Particular Credit Card Type  In the Credit Card Type\u0027s  Drop Down Box",
  "keyword": "And "
});
formatter.step({
  "line": 35,
  "name": "User Select The Particular Credit Card Expiry Date And Month  In the Credit Card Expiry Date And Month\u0027s  Drop Down Box",
  "keyword": "And "
});
formatter.step({
  "line": 36,
  "name": "User Select The Particular Credit Card Expiry Year In the Credit Card Expiry Year  Drop Down Box",
  "keyword": "And "
});
formatter.step({
  "line": 37,
  "name": "User Enter The CVV Number in In TheCVV Number\u0027s Field",
  "keyword": "And "
});
formatter.step({
  "line": 38,
  "name": "User Click the Book Now  Button",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.user_Enter_The_First_Name_in_In_The_First_Name_Field()"
});
formatter.result({
  "duration": 268224600,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_Enter_The_Last_Name_in_In_The_Last_Name_Field()"
});
formatter.result({
  "duration": 214388600,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_Enter_The_Billing_Address_in_In_Billing_Address_Field()"
});
formatter.result({
  "duration": 140232000,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_Enter_The_Credit_Card_No_in_In_Credit_Card_No_Field()"
});
formatter.result({
  "duration": 214218100,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_Enter_The_Credit_Card_No_in_In_Credit_Card_No_Field()"
});
formatter.result({
  "duration": 70820500,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_Select_The_Particular_Credit_Card_Type_In_the_Credit_Card_Type_s_Drop_Down_Box()"
});
formatter.result({
  "duration": 221822200,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_Select_The_Particular_Credit_Card_Expiry_Date_And_Month_In_the_Credit_Card_Expiry_Date_And_Month_s_Drop_Down_Box()"
});
formatter.result({
  "duration": 182015700,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_Select_The_Particular_Credit_Card_Expiry_Year_In_the_Credit_Card_Expiry_Year_Drop_Down_Box()"
});
formatter.result({
  "duration": 175071900,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_Enter_The_CVV_Number_in_In_TheCVV_Number_s_Field()"
});
formatter.result({
  "duration": 124511700,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_Click_the_Book_Now_Button()"
});
formatter.result({
  "duration": 6127966100,
  "status": "passed"
});
formatter.scenario({
  "line": 40,
  "name": "Booking Confirmation Page",
  "description": "",
  "id": "hotel-booking-in-adactin-application;booking-confirmation-page",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 39,
      "name": "@regressionTest"
    }
  ]
});
formatter.step({
  "line": 42,
  "name": "User Click the LogOut Button",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.user_Click_the_LogOut_Button()"
});
formatter.result({
  "duration": 1777766500,
  "status": "passed"
});
});