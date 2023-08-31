package elements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Stepsinfo.common_steps;

public class ebayhomepage_elements extends common_steps
{
@FindBy(xpath="//*[text()='Advanced']")
public WebElement advancedlink;
@FindBy(xpath="//*[@placeholder='Search for anything']")
public WebElement searchbar;
@FindBy(xpath="//*[@id='gh-btn']")
public WebElement searchbutton;
@FindBy(xpath="//*[@class='srp-controls__count-heading']//span[1][@class='BOLD']")
public WebElement itemcount;

public ebayhomepage_elements()
{
	PageFactory.initElements(driver, this);
}
}
