package elements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Stepsinfo.common_steps;

public class ebayadvancedsearch_elements extends common_steps
{
	
@FindBy(xpath ="//*[@id='gh-la']")
public WebElement ebaylogo;
@FindBy(id="_nkw")
public WebElement keyword;
@FindBy(id="_ex_kw")
public WebElement exclude;
@FindBy(name="_udlo")
public WebElement min;
@FindBy(name="_udhi")
public WebElement max;
@FindBy(xpath="//*[@class='adv-form__actions']/button[text()='Search']")
public WebElement searchbutton;

public ebayadvancedsearch_elements()
{
	PageFactory.initElements(driver, this);
}

}
