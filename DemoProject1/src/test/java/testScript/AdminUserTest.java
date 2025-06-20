package testScript;

import org.testng.annotations.Test;

import pages.AdminUserPage;
import pages.LoginPage;
import utilities.FakerUtility;

public class AdminUserTest extends Base{
	
	@Test
	public void addAdmin() {
		
		String username = "admin";
		String password = "admin";
		LoginPage loginpage = new LoginPage(driver);
		loginpage.enterTheUsername(username);
		loginpage.enterThePassword(password);
		loginpage.clickTheSignin();
		AdminUserPage adminuserpage = new AdminUserPage(driver);
		//String adminusername = "Hey";
		//String adminpassword = "pass";
	FakerUtility fakerutility = new FakerUtility();
	String adminusername = fakerutility.creatARandomFirstName();
	String adminpassword = fakerutility.creatARandomFirstName();
		adminuserpage.clickMoreInfo();
		adminuserpage.clickNewAdmin();
		adminuserpage.giveAdminName(adminusername);
		adminuserpage.giveAdminPass(adminpassword);
		adminuserpage.admintype();
		adminuserpage.saveAdmin();
	}
	

}
