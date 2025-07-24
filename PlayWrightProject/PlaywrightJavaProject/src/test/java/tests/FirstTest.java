package tests;



import org.testng.annotations.Test;



import base.BaseTest;

public class FirstTest extends BaseTest {

	@Test
	public void verifyTitle() {
		page.navigate("https://parabank.parasoft.com/parabank/index.htm");
		// Optional: Handle cookie popup assertion
		if (page.isVisible("button:has-text('Accept all')")) {
			page.click("button:has-text('Accept all')");
		}
		System.out.println("The Page Title is:--" + page.title());

	}

}
