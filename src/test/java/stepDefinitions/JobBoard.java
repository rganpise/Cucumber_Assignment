package stepDefinitions;


import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import io.cucumber.java.en.And;

public class JobBoard {
	
	WebDriver driver;
	List<WebElement> jobPostings;

	@Given("^Open a browser$")
	public void openABrowser() throws Throwable {
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		// Verify the site in backend:
		driver.get("https://alchemy.hguy.co/jobs/wp-admin");
		}

	@Given("^Open a browser with Jobs Site$")
	public void openJobsSite() throws Throwable {
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		// Open Jobs portal
		driver.get("https://alchemy.hguy.co/jobs/");

	}

	@Then("^Login to jobs page$")
	public void login_to_jobs_page() throws Throwable {
		driver.findElement(By.id("user_login")).sendKeys("root");
		driver.findElement(By.id("user_pass")).sendKeys("pa$$w0rd");
		driver.findElement(By.id("wp-submit")).submit();

	}

	@And("^Locate the left hand menu and Click on Menu Item$")
	public void locate_the_left_hand_menu() throws Throwable {
		Actions action = new Actions(driver);
		WebElement menu = driver.findElement(By.cssSelector("a.menu-icon-users > div:nth-child(3)"));
		action.moveToElement(menu).build().perform();
		menu.click();

	}

	@And("^Click the Add New button$")
	public void locate_the_Add_New_button() throws Throwable {
		driver.findElement(By.cssSelector(".page-title-action")).click();

	}

	@Then("^Fill in the necessary details and submit the form$")
	public void fill_in_the_necessary_details() throws Throwable {
		driver.findElement(By.id("user_login")).sendKeys("BDDUsertest3");
		driver.findElement(By.id("email")).sendKeys("BDDUsertest3@ibm.com");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.id("createusersub")).submit();
	}

	@And("^Verify that the user was created$")
	public void verify_that_the_user_was_created() throws Throwable {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.id("user-search-input")).sendKeys("BDDUsertest3@ibm.com");
		
		driver.findElement(By.id("search-submit")).click();

	}

	@And("^Close the browser$")
	public void close_the_browser() throws Throwable {
		driver.close();

	}

	@Then("^Navigate to Jobs page$")
	public void navigate_to_Jobs_page() throws Throwable {
		driver.findElement(By.xpath("//*[@id='menu-item-24']/a")).click();
	}

	@And("^Find the Keywords search input field and search for jobs$")
	public void find_the_Keywords_search_input_field() throws Throwable {
		driver.findElement(By.cssSelector("#search_keywords")).sendKeys("Selenium/BDD");
		driver.findElement(By.cssSelector("#search_location")).sendKeys("Bangalore");
		driver.findElement(By.xpath("//*[@id='post-7']/div/div/form/div[1]/div[4]/input")).submit();

	}

	@Then("^Filter job type to show only Full Time jobs$")
	public void filter_job_type_to_show_only_Full_Time_jobs() throws Throwable {
		driver.findElement(By.id("job_type_temporary")).click();
		driver.findElement(By.id("job_type_freelance")).click();
		driver.findElement(By.id("job_type_internship")).click();
		driver.findElement(By.id("job_type_part-time")).click();
		driver.findElement(By.xpath("//*[@id='post-7']/div/div/form/div[1]/div[4]/input")).submit();

	}

	@And("^Find the title of the job listing$")
	public void find_the_title_of_the_job_listing() throws Throwable {
		jobPostings = driver.findElements(By.xpath("//*[@id=\"post-7\"]/div/div/ul/li/a/div[1]/h3"));
		for (WebElement job : jobPostings) {
			System.out.println(job.getText());
		}
	
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		jobPostings.get(1).click();
		driver.findElement(By.cssSelector(".application_button")).click();
		String message = driver.findElement(By.xpath("/html/body/div/div/div/div/main/article/div/header/div/h1")).getText();
		System.out.println(message);

	}

	@Then("^Go to Post a Job page$")
	public void go_to_Post_a_Job_page() throws Throwable {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.cssSelector("#menu-item-26 > a:nth-child(1)")).click();
		// Click Sign IN.
		driver.findElement(By.cssSelector("a.button")).click();
		// Login
		driver.findElement(By.id("user_login")).sendKeys("root");
		driver.findElement(By.id("user_pass")).sendKeys("pa$$w0rd");
		driver.findElement(By.id("wp-submit")).submit();

	}

	@And("^Enter \"(.*)\", \"(.*)\" and \"(.*)\"$")
	public void enter_and(String job, String location, String company) throws Throwable {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.id("job_title")).sendKeys(job);
		driver.findElement(By.id("job_location")).sendKeys(location);
		driver.findElement(By.id("company_name")).clear();
		driver.findElement(By.id("company_name")).sendKeys(company);
		Select selection = new Select(driver.findElement(By.id("job_type")));
		selection.selectByValue("2");

		// Switch

		driver.switchTo().frame("job_description_ifr");

		// add description
		driver.findElement(By.xpath("/html/body")).sendKeys("New job posting");

		driver.switchTo().defaultContent();

	}

	@And("^Submit the form$")
	public void submit_the_form() throws Throwable {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement buttonSubmit = driver.findElement(By.cssSelector("input.button:nth-child(4)"));

		buttonSubmit.click();

		driver.findElement(By.id("job_preview_submit_button")).click();
	
	}

	@Then("^Go to the Jobs page$")
	public void go_to_the_Jobs_page() throws Throwable {
		driver.findElement(By.xpath("//*[@id = 'menu-item-24']/a")).click();

	}

	@Then("^Confirm \"(.*)\" listing is shown on page$")
	public void confirm_job_listing_is_shown_on_page(String job) throws Throwable {
		driver.findElement(By.cssSelector("#search_keywords")).sendKeys(job);
		driver.findElement(By.cssSelector("#post-7 > div > div > form > div.search_jobs > div.search_submit > input[type=submit]")).click();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		String jobSave = driver.findElement(By.xpath("/html/body/div[2]/div/div/div/main/article/div/div/ul/li[1]/a/div[1]/h3")).getText();
		junit.framework.Assert.assertEquals(job, jobSave);
	}

	@Then("^Enter Example \"(.*)\", \"(.*)\", \"(.*)\" and \"(.*)\"$")
	public void enter_Example_and(String email, String job, String location, String company) throws Throwable {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.id("job_title")).sendKeys(job);
		driver.findElement(By.id("job_location")).sendKeys(location);
		driver.findElement(By.id("company_name")).clear();
		driver.findElement(By.id("company_name")).sendKeys(company);
		Select selection = new Select(driver.findElement(By.id("job_type")));
		selection.selectByValue("2");

		

		driver.switchTo().frame("job_description_ifr");

		// add description
		driver.findElement(By.xpath("/html/body")).sendKeys("New job posting");

		driver.switchTo().defaultContent();

	}

}



