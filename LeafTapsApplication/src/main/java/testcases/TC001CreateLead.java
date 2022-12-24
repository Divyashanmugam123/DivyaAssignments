package testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import base.BaseClass;
import pages.LoginPage;

public class TC001CreateLead extends BaseClass{
	
	@BeforeClass
	public void setdata()
	{
		fileName ="CreateLead";
		sheetIndex=0;
	}
	@Test(dataProvider="fetchData")
	public void runCreateLead(String cName, String fName, String lName)
	{
	new LoginPage(driver)
	.enterUserName()
	.enterPassword()
	.clickLogin()
	.clickCRMSFA()
	.clickLeads()
	.clickCreateLead()
	.enterCompanyName(cName)
	.enterFirstName(fName)
	.enterLastName(lName)
	.clickCreate()
	.verifyLead();
	}

}
