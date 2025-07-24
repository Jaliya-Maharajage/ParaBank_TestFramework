package tests;

import org.testng.annotations.Test;

import com.microsoft.playwright.Page;
import com.microsoft.playwright.options.AriaRole;

import base.BaseTest;

public class UpdateUserTest extends BaseTest {

	@Test
	public void test() {
		page.navigate("https://parabank.parasoft.com/parabank/index.htm");
	
		page.locator("input[name=\"username\"]").click();
		test.info("Login to the System with Current User");
		page.locator("input[name=\"username\"]").fill("Ana_Fernandxyz");
		page.locator("input[name=\"password\"]").click();
		page.locator("input[name=\"password\"]").fill("PassworD.181");
		page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Log In")).click();
		test.info("UPDATE the User with New Details");
		page.getByRole(AriaRole.LINK, new Page.GetByRoleOptions().setName("Update Contact Info")).click();
		page.locator("[id=\"customer.lastName\"]").click();
		page.locator("[id=\"customer.lastName\"]").fill("Prasa");
		page.locator("[id=\"customer.address.street\"]").click();
		page.locator("[id=\"customer.address.street\"]").fill("100G,kudamaduwa road, kesbewa");
		page.locator("[id=\"customer.address.zipCode\"]").click();
		page.locator("[id=\"customer.address.zipCode\"]").fill("10340");
		test.info("Click Update Button to UPDATE new Details");
		page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Update Profile")).click();
		test.info("User Successfully Updated!");
		page.getByRole(AriaRole.LINK, new Page.GetByRoleOptions().setName("Accounts Overview")).click();
		test.info("Logout From the ParaBank");
		page.getByRole(AriaRole.LINK, new Page.GetByRoleOptions().setName("Log Out")).click();

	}

}
