package pages;

import com.microsoft.playwright.Page;

public class LoginPage {
	
	private Page page;
	
	private final String usernameTextbox="locator(\"input[name=\\\"username\\\"]\")";
	private final String passwordTextbox="locator(\"input[name=\\\"password\\\"]\")";
	private final String loginButton="getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName(\"Log In\"))";
	
	public LoginPage(Page page) {
		this.page=page;
	}
	

	public void addUsername(String username) {
		page.fill(usernameTextbox, username);
	}
	
	public void addPassword(String password) {
		page.fill(passwordTextbox, password);
	}
	
	public void clickLoginButton() {
		page.click(loginButton);
		
	}
	
	public void login(String username,String password) {
		page.fill(usernameTextbox,username);
		page.fill(passwordTextbox,username);
		page.click(loginButton);
	}
	
}
