package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends PageBase {

	public HomePage(WebDriver driver) {
		super(driver);
	}


	@FindBy(name = "q")
	WebElement SearchBox;


	@FindBy(name = "btnK")
	WebElement Searchbtn;



	@FindBy(css = "span.lBbtTb.z1asCe.rzyADb")
	WebElement RemoveEntereddata;


	@FindBy(className = "dQuYle")
	WebElement keyboardbtn;


	
	public void UserCanSearch(String Searchvalue)
	{
		SearchBox.click();
		SearchBox.sendKeys(Searchvalue);
		Searchbtn.submit();


	}


	public void DeleteEntereddata (String searchvalue)
	{
		SearchBox.click();
		SearchBox.sendKeys(searchvalue);
		RemoveEntereddata.click();

	}

	public void EnteredInvaludValue(String searchvalue)
	{
		SearchBox.click();
		SearchBox.sendKeys(searchvalue);
		SearchBox.submit();
	}

	public void PressOnSearchBtn() 
	{
		Searchbtn.submit();
	}

	

}
