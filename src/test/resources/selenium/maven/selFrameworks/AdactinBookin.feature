
 @tag
    Feature: User tests the functionality of Adactin hotel bookig url
    
  @tag1
      Scenario Outline: user enters login details and checks the function
        Given user enters username and password and logs in "<username>" and "<password>"
        And user enters location hotel roomtype roomno "<location>","<hotel>","<roomtype>" and "<roomno>"
        When also enters indate outdate adults childrens and submits "<indate>","<outdate>","<adults>" and "<childrens>"
        And enters fname lname and address "<fname>","<lname>" and "<address>"
        And also enters cardno cardtype expmonth expyear cvv and books "<cardno>","<cardtype>","<expmonth>","<expyear>" and "<cvv>"
        Then prints booking id and clicks itenary
        And user selects all the bookins and cancel it

	    Examples: 
	     |username|password|location|hotel|roomtype|roomno|indate|outdate|adults|childrens|fname|lname|address|cardno|cardtype|expmonth|expyear|cvv|
			 |Pubg12345|1234567890|Sydney|Hotel Creek|Double|1|07/06/2019|09/06/2019|2||Pepper|potts|Brittany|1234567890098765|AMEX|2|2020|1122|
