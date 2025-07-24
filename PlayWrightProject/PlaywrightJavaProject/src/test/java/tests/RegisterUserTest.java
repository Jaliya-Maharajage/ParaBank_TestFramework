package tests;

import org.testng.annotations.Test;

import com.microsoft.playwright.Page;
import com.microsoft.playwright.options.AriaRole;

import base.BaseTest;

public class RegisterUserTest extends BaseTest {
	@Test
	public void test() {
		test.info("Navigating to Login Page ParaBank");
		page.navigate("https://parabank.parasoft.com/parabank/index.htm");
		test.info("Click Register Link Button");
		page.getByRole(AriaRole.LINK, new Page.GetByRoleOptions().setName("Register")).click();
		test.info("Fill User Details to CREATE a New User");
		page.locator("[id=\"customer.firstName\"]").fill("Prasanna");
		page.locator("[id=\"customer.lastName\"]").fill("Maharajage");
		page.locator("[id=\"customer.address.street\"]").fill("181, piliyandala road, piliyandala");
		page.locator("[id=\"customer.address.city\"]").fill("piliyandala");
		page.locator("[id=\"customer.address.state\"]").fill("colombo");
		page.locator("[id=\"customer.address.zipCode\"]").fill("10300");
		page.locator("[id=\"customer.phoneNumber\"]").fill("+94761609095");
		page.locator("[id=\"customer.ssn\"]").fill("123123123");
		test.info("Define a Usename for New User");
		page.locator("[id=\"customer.username\"]").fill("Ana_Fernandxyz");
		test.info("Define a Password for New User");
		page.locator("[id=\"customer.password\"]").fill("PassworD.181");
		test.info("Re-Enter Password for New User");
		page.locator("#repeatedPassword").fill("PassworD.181");
		page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Register")).click();
		test.info("User Successfully Created!");
		test.info("Logout From the ParaBank");
		page.getByRole(AriaRole.LINK, new Page.GetByRoleOptions().setName("Log Out")).click();
	}

}
