package org.jtalks.tests.jcommune.tests.profile;

import org.jtalks.tests.jcommune.pages.ProfilePage;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import utils.StringHelp;

import static org.jtalks.tests.jcommune.common.JCommuneSeleniumTest.driver;
import static org.jtalks.tests.jcommune.common.JCommuneSeleniumTest.logOut;
import static org.jtalks.tests.jcommune.common.JCommuneSeleniumTest.signIn;
import static org.testng.Assert.assertEquals;

/**
 * author: erik
 * Date: 09.03.12
 * Time: 20:54
 */
public class JC53ChangeEmailWithoutSaving {
	//TODO uncomment after X servers will be installed
//	ProfilePage profilePage;
//	String currentEmail;
//	String uniqEmail;
//
//	@BeforeMethod(alwaysRun = true)
//	@Parameters({"app-url", "uUsername", "uPassword"})
//	public void setupCase(String appUrl, String username, String password) {
//		driver.get(appUrl);
//		signIn(username, password);
//		profilePage = new ProfilePage(driver);
//		profilePage.getCurrentUserLink().click();
//		uniqEmail = StringHelp.getRandomEmail();
//		currentEmail = profilePage.getEmail().getText();
//		profilePage.getEditProfileButton().click();
//	}
//
//	@AfterMethod(alwaysRun = true)
//	@Parameters({"app-url"})
//	public void destroy(String appUrl) {
//		logOut(appUrl);
//	}
//
//	@Test
//	public void testEmptyEmail() {

//		profilePage.getEmailEditField().clear();
//		profilePage.getEmailEditField().sendKeys(uniqEmail);
//		profilePage.getBackButton().click();
//		assertEquals(profilePage.getEmail().getText(), currentEmail);
//	}
}
