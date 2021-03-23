package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.HomePage;
import pages.ResultsPage;

public class SearchFunction extends TestBase
{
	HomePage homeObj;
	ResultsPage resultobj;


	@Test (priority=1)
	public void  SearchReturnSuccessfully()
	{
		homeObj = new HomePage(driver);
		homeObj.UserCanSearch("instabug");

	}

	@Test (priority=2)
	public void RemoveEnteredSearchData()
	{
		homeObj = new HomePage(driver);
		homeObj.DeleteEntereddata("instabug");

	}	

	@Test (priority=3)
	public void SearchReturnInsteadOption()
	{
		homeObj = new HomePage(driver);
		homeObj.EnteredInvaludValue("enstabug");
		resultobj = new ResultsPage(driver);
		Assert.assertTrue(resultobj.Searchinstead.getText().contains("عرض النتائج عن"));;
		resultobj.PressOnCorrectWord();
	}

	@Test (priority=4)
	public void PressonSearchBtnReturnNoResult() 
	{
		homeObj = new HomePage(driver);
		homeObj.PressOnSearchBtn();
	}


	

}
