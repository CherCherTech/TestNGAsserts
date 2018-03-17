# Assertions in TestNG : Selenium Webdriver.

Assert class is pesent in <b>org.testng.Assert</b> class in TestNG under <b>Selenium webdriver</b>, this assert also known as Hard assert.

Hard assert compares two items and results in pass or fail. But incase if the assert is failed then the code after the assert statement will not be executed and because of this only we are calling it as Hard Assert.

All the method present in Assert class are static methods so we can access all the methods using class reference, so no need to create object

<b>Special Condition for Asserts :</b> Asserts must be inside @Test method only, if we write assert statement inside a normal method or inside a main method then TestNG will not consider the failure or pass. Below image shows the example of failure and pass 


You can read more on <a href='http://chercher.tech/java/testng-assertions-selenium-webdriver' title='testng assertion'><b>TestNG assertion in Selenium Webdriver</b></a>
