package Stepsinfo;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class EbayAdvancedSearch_Steps 
{
	 WebDriver driver;
	
	public EbayAdvancedSearch_Steps(common_steps comsteps)
	 {
		
			this.driver=comsteps.driver();
	 }

	@Given("I am on Ebay Advanced Search page")
	public void i_am_on_ebay_advanced_search_page() 
	{
		driver.get("https://www.ebay.com/sch/ebayadvsearch");
	}
	@When("I click on Ebay logo")
	public void i_click_on_ebay_logo() 
	{
      driver.findElement(By.xpath("//*[@id='gh-la']")).click();		
	}
	@Then("I am navigated to Ebay Home Page")
	public void i_am_navigated_to_ebay_home_page() 
	{
		String originalurl="https://www.ebay.com/";
	    assertEquals(originalurl,driver.getCurrentUrl());
	}
	@When("I do an advanced search")
	public void i_do_an_advanced_search(DataTable dataTable) throws Exception 
	{
	    driver.findElement(By.id("_nkw")).sendKeys(dataTable.cell(1, 0));
	    driver.findElement(By.id("_ex_kw")).sendKeys(dataTable.cell(1, 1));
	    driver.findElement(By.name("_udlo")).sendKeys(dataTable.cell(1, 2));
	    driver.findElement(By.name("_udhi")).sendKeys(dataTable.cell(1, 3));
	    driver.findElement(By.xpath("//*[@class='adv-form__actions']/button[text()='Search']")).click();
	
	}
}
