package tests;

import org.testng.annotations.Test;

import com.microsoft.playwright.Page;
import com.microsoft.playwright.options.AriaRole;
import base.BaseTest;

public class LoginTest extends BaseTest {

	@Test
	public void test() {
		page.navigate("https://parabank.parasoft.com/parabank/index.htm");
		//-in here we check invalid Username and Password both, but this Parabank site has a issue, it does not validate this scenario.FYI
		/* 
		 * page.locator("input[name=\"username\"]").click();
		 * page.locator("input[name=\"username\"]").fill("wrongname");
		 * page.locator("input[name=\"password\"]").click();
		 * page.locator("input[name=\"password\"]").fill("badbad");
		 * page.getByRole(AriaRole.BUTTON, new
		 * Page.GetByRoleOptions().setName("Log In")).click();
		 */
		page.locator("input[name=\"username\"]").click();
		test.info("Check for invalid Username Only option");
		page.locator("input[name=\"username\"]").fill("usernameonly");
		page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Log In")).click();
		page.locator("input[name=\"password\"]").click();
		test.info("Check for invalid Password Only option");
		page.locator("input[name=\"password\"]").fill("passwordonly");
		page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Log In")).click();
		page.locator("input[name=\"username\"]").click();
		test.info("Check for valid Username and Password");
		page.locator("input[name=\"username\"]").fill("Ana_Fernandxyz");
		page.locator("input[name=\"password\"]").click();
		page.locator("input[name=\"password\"]").fill("PassworD.181");
		test.info("Login to the ParaBank");
		page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Log In")).click();
		test.info("User Successfully logged in!");
		test.info("Logout From the ParaBank");
		page.getByRole(AriaRole.LINK, new Page.GetByRoleOptions().setName("Log Out")).click();
		
		
	}

}
