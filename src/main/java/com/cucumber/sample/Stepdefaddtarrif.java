package com.cucumber.sample;

import java.util.List;
import java.util.Map;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;

public class Stepdefaddtarrif {
 /* //Using List
	WebDriver driver;

	@Given("The user is in telecom home page")
	public void the_user_is_in_telecom_home_page() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\user\\eclipse-workspace\\CucumberSample\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://www.demo.guru99.com/telecom/index.html");
		driver.manage().window().maximize();
	}

	@Given("The user click on the add tarrif plan")
	public void the_user_click_on_the_add_tarrif_plan() {
		driver.findElement(By.xpath("//a[text()='Add Tariff Plan']")).click();
	}

	@When("The user is filling all the field")
	public void the_user_is_filling_all_the_field(DataTable cusDetails) {
		List<String> cusdetail = cusDetails.asList(String.class);
		driver.findElement(By.id("rental1")).sendKeys(cusdetail.get(0));
		driver.findElement(By.id("local_minutes")).sendKeys(cusdetail.get(1));
		driver.findElement(By.id("inter_minutes")).sendKeys(cusdetail.get(2));
		driver.findElement(By.id("sms_pack")).sendKeys(cusdetail.get(3));
		driver.findElement(By.id("sms_charges")).sendKeys(cusdetail.get(6));
		driver.findElement(By.id("inter_charges")).sendKeys(cusdetail.get(5));
		driver.findElement(By.id("minutes_charges")).sendKeys(cusdetail.get(4));
	}

	@When("The user click on the submit button")
	public void the_user_click_on_the_submit_button() {
		driver.findElement(By.name("submit")).click();
	}

	@Then("The user should see plan has been added")
	public void the_user_should_see_plan_has_been_added() {
		Assert.assertTrue(
				driver.findElement(By.xpath("//h2[text()='Congratulation you add Tariff Plan']")).isDisplayed());
	}*/

    //Using MAP
	WebDriver driver;

	@Given("The user is in telecom home page")
	public void the_user_is_in_telecom_home_page() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\user\\eclipse-workspace\\CucumberSample\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://www.demo.guru99.com/telecom/index.html");
		driver.manage().window().maximize();
	}

	@Given("The user click on the add tarrif plan")
	public void the_user_click_on_the_add_tarrif_plan() {
		driver.findElement(By.xpath("//a[text()='Add Tariff Plan']")).click();
	}

	@When("The user is filling all the field")
	public void the_user_is_filling_all_the_field(DataTable cusDetails) {
		Map<String, String> cusDetail = cusDetails.asMap(String.class, String.class);
		driver.findElement(By.id("rental1")).sendKeys(cusDetail.get("Monthly rent"));
		driver.findElement(By.id("local_minutes")).sendKeys(cusDetail.get("Free local min"));
		driver.findElement(By.id("inter_minutes")).sendKeys(cusDetail.get("Free interna min"));
		driver.findElement(By.id("sms_pack")).sendKeys(cusDetail.get("Free SMS pack"));
		driver.findElement(By.id("minutes_charges")).sendKeys(cusDetail.get("Local per min"));
		driver.findElement(By.id("inter_charges")).sendKeys(cusDetail.get("Interna per min"));
		driver.findElement(By.id("sms_charges")).sendKeys(cusDetail.get("SMS per charge"));
	}

	@When("The user click on the submit button")
	public void the_user_click_on_the_submit_button() {
		driver.findElement(By.name("submit")).click();
	}

	@Then("The user should see plan has been added")
	public void the_user_should_see_plan_has_been_added() {
		Assert.assertTrue(
				driver.findElement(By.xpath("//h2[text()='Congratulation you add Tariff Plan']")).isDisplayed());
	}
}
