@JobBoard
Feature: Verify the Job Board page.
  

  Scenario: Create a new user
    Given Open a browser
    Then Login to jobs page
    And Locate the left hand menu and Click on Menu Item
    And Click the Add New button
    Then Fill in the necessary details and submit the form
    And Verify that the user was created
    And Close the browser
	
 	Scenario: Searching for jobs using XPath
    Given Open a browser with Jobs Site
    Then Navigate to Jobs page
    And Find the Keywords search input field and search for jobs
    Then Filter job type to show only Full Time jobs 
    And Find the title of the job listing
    And Close the browser
   
  
   Scenario: Posting a job using parameterization
    Given Open a browser with Jobs Site
    Then Go to Post a Job page
    And Enter "Cucumber/BDD Tester", "kuehkopf-knoblochsaue" and "GoodGames GmbH"
    And Submit the form
    Then Go to the Jobs page
    And Confirm "Cucumber/BDD Tester" listing is shown on page
    And  Close the browser
    
    
    Scenario Outline: Using Examples table to post a job
    Given Open a browser with Jobs Site
    Then Go to Post a Job page
    And Enter Example "<Email>", "<Job>", "<Location>" and "<Company>"
    And Submit the form
    Then Go to the Jobs page
    And Confirm "<Job>" listing is shown on page
    And  Close the browser
    
  Examples:
  | Email | Job | Location | Company |
  |Test1@IBM1.com|Selenium/BDD4|Bangalore|IBM|
  |Test2@IBM2.com|Selenium/BDD5|Bangalore|IBM|