package org.jtalks.tests.jcommune.tests.pm;

import org.jtalks.tests.jcommune.assertion.Exsistence;
import org.jtalks.tests.jcommune.common.JCommuneSeleniumTest;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import utils.CollectionHelp;

import static org.jtalks.tests.jcommune.assertion.Exsistence.assertElementExistsBySelector;
import static org.jtalks.tests.jcommune.pages.PMPage.*;

/**
 * @author yacov
 */
public class JC165DeleteOneMessageInInbox extends JCommuneSeleniumTest {

    @BeforeMethod(alwaysRun = true)
    @Parameters({"app-url", "uUsername", "uPassword"})
    public void setupCase(String appUrl, String username, String password) {
        driver.get(appUrl);
        signIn(username, password);
    }

    @Test
    public void deleteMessageInInbox() {
        pmPage.getPmInboxLink().click();   //Enter to Inbox
        CollectionHelp.getFirstWebElementFromCollection(pmPage.getInboxCheckboxes()).click();  //Click on the checkbox of the first message
        pmPage.getDelButton().click();  //Click on 'Delete' button
        assertElementExistsBySelector(driver, PM_DEL_DIALOG);   //Control that Alert Message appears
        pmPage.getPmDelMesButtonCancel().click();   //Click on 'Cancel'
        pmPage.assertOneOfPmMessagesIsChecked(driver);

        pmPage.getDelButton().click();   //Click again on 'Delete' button
        assertElementExistsBySelector(driver, PM_DEL_DIALOG);      //Control that Alert Message appears
        pmPage.getPmDelMesButtonOK().click(); //Click on 'OK' button of Alert Message
        Exsistence.assertionNotExistBySelector(driver, PM_CHECKED_UNREAD_CHECKBOX); //Control, that there is no more checked message on Inbox

    }

    @AfterMethod(alwaysRun = true)
    @Parameters({"app-url"})
    public void destroy(String appUrl) {
        logOut(appUrl);
    }


}