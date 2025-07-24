Hi There,
I am Jaliya Maharajage, This is a Really simple but effective Automation Project. Please feel Free to Use this and test out.
Playwright Automation Project and API Suite is in this repo. Please feel free to clone/fork and Test!!! *for API Jason file is provided in repo.

How To Run This-
Run testing.xml file as TestNG Suite. This will Start Browser and Run 3 Test scenarios- RegisterUserTest, LoginTest, UpdateUsetTest.
If you add a new Test class, update it in the testing.xml and build and run.

*Please Change Username after 1st Run to a unique name in 
-LoginTest.java> codeline 33> [page.locator("input[name=\"username\"]").fill("add a unique name here");]
-RegisterUserTest.java> codeline 27> [page.locator("[id=\"customer.username\"]").fill("add a unique name here");]
-UpdateUserTesy.java> codeline 18> [page.locator("input[name=\"username\"]").fill("add a unique name here");]
, since this demo site is not provide a DELETE option.

additional setup steps-
JAVA_HOME
PATH
MAVEN_HOME
PATH
should be set in your PC.

Used Techstack-
Java
PlayWright
TestNG
Maven
ExtentReports
(all dependencies are mentioned and added in pom.xml)

This Test Automation Framework will,
LOGIN USER,
UPDATE USER,
REGISTER USER,
Check for Assertions Such as 'Cookies Accept'.
'DELETE USER' function is not available here in this web site. But can be easily implemented.

Outputs-
Generate 'ExtentReport.html' file about Test suite results. Where you can see PASSED and FAILED Test Scenarios. 
Also can check 'index.htm' for Playwright default report generated file.

Hope this Will helped you to setup project.
Happy Testing!
Cheers!

