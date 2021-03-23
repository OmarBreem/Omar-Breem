package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ResultsPage extends HomePage {

	public ResultsPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(css = "span.gL9Hy")
	public	WebElement Searchinstead;

	@FindBy(id = "fprsl")
	WebElement correctword;
	
	public void PressOnCorrectWord()
	{
		correctword.click();
	}
}
