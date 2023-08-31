package Stepsinfo;

import static org.junit.Assert.fail;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class EbayHome_Steps {
	WebDriver driver;

	public EbayHome_Steps(common_steps comsteps) {
		this.driver = comsteps.driver();

	}

	@Given("I am on ebay home page")
	public void i_am_on_ebay_home_page() {
		driver.get("https://www.ebay.com/");
	}

	@When("I click on Advanced Link")
	public void i_click_on_advanced_link() {
		driver.findElement(By.xpath("//*[text()='Advanced']")).click();
	}

	@Then("I navigate to the advanced search page")
	public void i_navigate_to_the_advanced_search_page() {
		String url = "https://www.ebay.com/sch/ebayadvsearch";
		// assertEquals(url,driver.getCurrentUrl());
		if (!url.equals(driver.getCurrentUrl())) {
			fail("Page not navigating");
		}
	}

	@When("I search for {string} on search bar")
	public void i_search_for_iphone_on_search_bar(String str) {

		driver.findElement(By.xpath("//*[@placeholder='Search for anything']")).sendKeys(str);
		driver.findElement(By.xpath("//*[@id='gh-btn']")).click();

	}

	@Then("I validate the count of search results is greater than {int}")
	public void i_validate_the_count_of_search_results(int count) {
		String itemcount = driver
				.findElement(By.xpath("//*[@class='srp-controls__count-heading']//span[1][@class='BOLD']")).getText();
		String count2 = itemcount.replaceAll(",", "");
		int Itemcount = Integer.parseInt(count2);
		if (Itemcount <= count) {
			fail("The searched product count is not appropriate");
		}
		System.out.println(itemcount);

	}

	@When("I search for {string} on search bar from {string} category")
	public void i_search_for_on_search_bar_from_category(String string, String string2) {
		WebElement categories = driver.findElement(By.className("gh-sb"));
		Select select = new Select(categories);
		select.selectByVisibleText(string2);
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.findElement(By.xpath("//*[@placeholder='Search for anything']")).sendKeys(string);
		driver.findElement(By.xpath("//*[@id='gh-btn']")).click();

	}

	@When("I click on {string}")
	public void i_click_on(String string) throws Exception {
		driver.findElement(By.linkText(string)).click();
		// Thread.sleep(2000);
		//b/Health-Beauty/26395/bn_1865479
	}

	@Then("I validate that page navigates to {string} and title contains {string}")
	public void i_validate_that_page_navigates_to_and_title_contains(String url, String title) {
		String actualurl = driver.getCurrentUrl();
		String actualtitle = driver.getTitle();
		if (!actualurl.contains(url)) 
		{
			fail("Original url : " + actualurl);
		}
		if (!actualtitle.contains(title)) 
		{
			fail("Original title : " + actualtitle);

		}
	}

}
