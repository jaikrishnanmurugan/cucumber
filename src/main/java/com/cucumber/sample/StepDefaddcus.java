package com.cucumber.sample;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefaddcus {
	WebDriver driver;

	@Given("The user is in telecome home page")
	public void the_user_is_in_telecome_home_page() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\user\\eclipse-workspace\\CucumberSample\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://www.demo.guru99.com/telecom/index.html");
		driver.manage().window().maximize();
	}

	@Given("The user click on add customer")
	public void the_user_click_on_add_customer() {
		driver.findElement(By.xpath("(//a[text()='Add Customer'])[1]")).click();
	}

	@When("The user is filling all the fields")
	public void the_user_is_filling_all_the_fields() {
		driver.findElement(By.xpath("//label[text()='Done']")).click();
		driver.findElement(By.id("fname")).sendKeys("karthi");
		driver.findElement(By.id("lname")).sendKeys("vinay");
		driver.findElement(By.id("email")).sendKeys("rajkhanna@gmail.com");
		driver.findElement(By.xpath("//textarea[@id='message']")).sendKeys("tiruchendhur");
		driver.findElement(By.xpath("//input[@id='telephoneno']")).sendKeys("23776897");

	}

	@When("The userclick on the submit button")
	public void the_userclick_on_the_submit_button() {
		driver.findElement(By.xpath("//input[@value='Submit']")).click();

	}

	@Then("The user should see the id is generated")
	public void the_user_should_see_the_id_is_generated() {
		Assert.assertTrue(driver.findElement(By.xpath("(//td[@align='center'])[2]")).isDisplayed());
	}

	public static void main(String[] args) {

	}
}
