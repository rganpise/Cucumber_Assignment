package stepDefinitions;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class OrangeHRM {
	WebDriver driver;
	Actions action;
	
	@Given("^Open and login into OrangeHRM$")
	public void open_and_login_to_the_orange_hrm_page() {
		driver = new ChromeDriver();
		driver.get("http://alchemy.hguy.co/orangehrm");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		//String username = "orange";
		//String password = "orangepassword123";
		// Enter Credentials
		driver.findElement(By.id("txtUsername")).sendKeys("orange");
		driver.findElement(By.id("txtPassword")).sendKeys("orangepassword123");

		// Click login
		driver.findElement(By.id("btnLogin")).submit();
	}

	@Then("^Navigate to the Recruitments page$")
	public void navigate_to_the_recruitments_page() {
		
		action = new Actions(driver);
		WebElement recruitment = driver.findElement(By.xpath("//*[@id='menu_recruitment_viewRecruitmentModule']/b"));
		action.moveToElement(recruitment).build().perform();
		recruitment.click();
	}

	@And("^Click on the Vacancies menu item to navigate to the vacancies page$")
	public void click_on_the_vacancies_menu_item_to_navigate_to_the_vacancies_page() {
		action = new Actions(driver);
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		WebElement vacancies = driver.findElement(By.xpath("//*[@id='menu_recruitment_viewJobVacancy']"));
		action.moveToElement(vacancies).build().perform();
		vacancies.click();
	}

	@When("^Clicked on the Add button to navigate to the Add Job Vacancy form$")
	public void clicked_on_the_add_button_to_navigate_to_the_add_job_vacancy_form() {
		driver.findElement(By.id("btnAdd")).click();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	}

	@Then("^Fill out the necessary details$")
	public void fill_out_the_necessary_details() {
		Select jobtitle = new Select(driver.findElement(By.id("addJobVacancy_jobTitle")));
		jobtitle.selectByValue("5");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.findElement(By.id("addJobVacancy_name")).sendKeys("SDET Orange HRM");
		driver.findElement(By.id("addJobVacancy_hiringManager")).sendKeys("FName_10981 lName_10981");
		driver.findElement(By.id("btnSave")).click();		
	}

	
	@And("^verify the vacancy$")
	public void verify_the_vacancy() {
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		navigate_to_the_recruitments_page();
		click_on_the_vacancies_menu_item_to_navigate_to_the_vacancies_page();
		Select jobtitle = new Select(driver.findElement(By.id("vacancySearch_jobTitle")));
		jobtitle.selectByValue("3");
		
		Select manager= new Select(driver.findElement(By.id("vacancySearch_hiringManager")));
		manager.selectByVisibleText("FName_10981 lName_10981");
		driver.findElement(By.id("btnSrch")).click();
		List<WebElement> vacancies =  driver.findElements(By.xpath("/html/body/div[1]/div[3]/div[2]/div/form/div[4]/table/tbody/tr/td[2]"));
		for(WebElement vacancy : vacancies) {
			if ((vacancy.getText()).equals("SDET Orange HRM")) {
				System.out.println("Test Case passed, Vacancy found");
				break;
			}
			else {
				System.out.println("Test Case failed, Vacancy not found ");
			}
		}
	}

	@And("^close the Orange browser$")
	public void close_browser() {
		driver.close();
	}

	@And("^click on the Add button to add candidate information$")
	public void click_on_the_add_button_to_add_candidate_information() {
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		action = new Actions(driver);
		WebElement candidate = driver.findElement(By.xpath("//*[@id='menu_recruitment_viewCandidates']"));
		action.moveToElement(candidate).build().perform();
		candidate.click();
		//Click Add button
		
		driver.findElement(By.id("btnAdd")).click();
	}

	@And("^On next page fill in the details of the candidate$")
	public void on_next_page_fill_in_the_details_of_the_candidate() {
		driver.findElement(By.id("addCandidate_firstName")).sendKeys("first1");
		driver.findElement(By.id("addCandidate_lastName")).sendKeys("last1");
		driver.findElement(By.id("addCandidate_email")).sendKeys("firstlast@gmail.com");
		
		Select vApply = new Select(driver.findElement(By.id("addCandidate_vacancy")));
		vApply.selectByVisibleText("SDET Orange HRM");
		
	}

	@Then("^Upload a resume to the form$")
	public void upload_a_resume_to_the_form() {
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		// Write code here that turns the phrase above into concrete actions
		WebElement addFile = driver.findElement(By.xpath(".//input[@type='file']"));
		addFile.sendKeys("C:/Users/RamaGanpisetti/Desktop/TestingResume.docx");
	}

	@And("^Save the application$")
	public void save_the_application() {
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.findElement(By.id("btnSave")).click();
	}

	@Then("^Navigate back to the Recruitments page to confirm candidate entry$")
	public void navigate_back_to_the_recruitments_page_to_confirm_candidate_entry() {
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		navigate_to_the_recruitments_page();
		driver.findElement(By.id("candidateSearch_candidateName")).sendKeys("first1 last1");
		Select jVacancy = new Select(driver.findElement(By.id("candidateSearch_jobVacancy")));
		jVacancy.selectByVisibleText("SDET Orange HRM");
		
		driver.findElement(By.id("btnSrch")).click();
		List<WebElement> candidate = driver.findElements(By.xpath("/html/body/div[1]/div[3]/div[2]/div/form/div[4]/table/tbody/tr/td[3]/a"));
		for(WebElement candid: candidate) {
			if ((candid.getText()).equals("first1 last1")) {
				System.out.println("Hurrryyyyy,,, Candidate applied but wont get the job.. :-) ");
				break;
			}
		}
		
	}

	@Then("^Find the PIM option in the menu and click Add$")
	public void find_the_pim_option_in_the_menu_and_click_it() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		Actions action = new Actions(driver);
		WebElement myInfo = driver.findElement(By.id("menu_pim_viewPimModule"));
		action.moveToElement(myInfo).build().perform();
		myInfo.click();
		//Add
		
		Thread.sleep(2000);
		driver.findElement(By.id("btnAdd")).click();
		
		
	}

	@And("Enter details \"(.*)\", \"(.*)\"$")
	public void enter_detials_name1_and(String firstName, String lastName) {
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.findElement(By.id("firstName")).sendKeys(firstName);
		driver.findElement(By.id("lastName")).sendKeys(lastName);
	}

	@And("^Checkbox login Details$")
	public void check_login_details() {
		driver.findElement(By.id("chkLogin")).click();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
			
	}

	@Then("Enter further details \"(.*)\", \"(.*)\"$")
	public void enter_further_details(String uName, String status) {
		driver.findElement(By.id("user_name")).sendKeys(uName);
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		Select state = new Select(driver.findElement(By.id("status")));
		state.selectByVisibleText(status);
				
	}

	@And("^Save the employee \"(.*)\", \"(.*)\"$")
	public void save_the_employee(String firstName, String lastName) {
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.findElement(By.id("btnSave"));
		Actions action = new Actions(driver);
		WebElement myInfo = driver.findElement(By.id("menu_pim_viewPimModule"));
		action.moveToElement(myInfo).build().perform();
		myInfo.click();
		
		driver.findElement(By.id("empsearch_employee_name_empName")).sendKeys(firstName+" "+lastName);
		driver.findElement(By.id("searchBtn")).click();
		
		//Get list of employees
		
		List<WebElement> employeeList = driver.findElements(By.xpath("/html/body/div[1]/div[3]/div[2]/div/form/div[4]/table/tbody/tr/td[3]/a"));
		for(WebElement employee: employeeList) {
			if ((employee.getText().equals(firstName +" "+ lastName))){
				System.out.println("Employee Found");
				break;
			}
		}
		
	}

	@Then("^Fill necessary details like \"(.*)\", \"(.*)\", \"(.*)\"$")
	public void enter_detials_name2_and(String vName,String hManager, String title) {
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		Select jobtitle = new Select(driver.findElement(By.id("addJobVacancy_jobTitle")));
		jobtitle.selectByVisibleText(title);
		driver.findElement(By.id("addJobVacancy_name")).sendKeys(vName);
		driver.findElement(By.id("addJobVacancy_hiringManager")).sendKeys(hManager);
		driver.findElement(By.id("btnSave")).click();		
	}
	
	@And("^verify the vacancy with  \"(.*)\", \"(.*)\", \"(.*)\"$")
	public void verify_vacancy(String name, String vmanager, String title) {
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		navigate_to_the_recruitments_page();
		click_on_the_vacancies_menu_item_to_navigate_to_the_vacancies_page();
		Select jobtitle = new Select(driver.findElement(By.id("vacancySearch_jobTitle")));
		jobtitle.selectByVisibleText(title);
		
		Select manager= new Select(driver.findElement(By.id("vacancySearch_hiringManager")));
		manager.selectByVisibleText(vmanager);
		driver.findElement(By.id("btnSrch")).click();
		List<WebElement> vacancies =  driver.findElements(By.xpath("/html/body/div[1]/div[3]/div[2]/div/form/div[4]/table/tbody/tr/td[2]"));
		for(WebElement vacancy : vacancies) {
			if ((vacancy.getText()).equals(name)) {
				System.out.println("Test Case passed, Vacancy found");
				break;
			}
			else {
				System.out.println("Test Case failed, Vacancy not found ");
			}
		}
	}

}

