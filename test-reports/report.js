$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("JobBoard.feature");
formatter.feature({
  "line": 2,
  "name": "Verify the Job Board page.",
  "description": "",
  "id": "verify-the-job-board-page.",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@jobBoard"
    }
  ]
});
formatter.scenario({
  "line": 5,
  "name": "Create a new user",
  "description": "",
  "id": "verify-the-job-board-page.;create-a-new-user",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 6,
  "name": "Open a browser",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "Login to jobs page",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "Locate the left hand menu and Click on Menu Item",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "Click the Add New button",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "Fill in the necessary details and submit the form",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "Verify that the user was created",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "Close the browser",
  "keyword": "And "
});
formatter.match({
  "location": "JobBoard.openABrowser()"
});
formatter.result({
  "duration": 7758595900,
  "status": "passed"
});
formatter.match({
  "location": "JobBoard.login_to_jobs_page()"
});
formatter.result({
  "duration": 4448165500,
  "status": "passed"
});
formatter.match({
  "location": "JobBoard.locate_the_left_hand_menu()"
});
formatter.result({
  "duration": 2653128800,
  "status": "passed"
});
formatter.match({
  "location": "JobBoard.locate_the_Add_New_button()"
});
formatter.result({
  "duration": 864541200,
  "status": "passed"
});
formatter.match({
  "location": "JobBoard.fill_in_the_necessary_details()"
});
formatter.result({
  "duration": 1562382900,
  "status": "passed"
});
formatter.match({
  "location": "JobBoard.verify_that_the_user_was_created()"
});
formatter.result({
  "duration": 1705907000,
  "status": "passed"
});
formatter.match({
  "location": "JobBoard.close_the_browser()"
});
formatter.result({
  "duration": 286532400,
  "status": "passed"
});
formatter.scenario({
  "line": 14,
  "name": "Searching for jobs using XPath",
  "description": "",
  "id": "verify-the-job-board-page.;searching-for-jobs-using-xpath",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 15,
  "name": "Open a browser with Jobs Site",
  "keyword": "Given "
});
formatter.step({
  "line": 16,
  "name": "Navigate to Jobs page",
  "keyword": "Then "
});
formatter.step({
  "line": 17,
  "name": "Find the Keywords search input field and search for jobs",
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "Filter job type to show only Full Time jobs",
  "keyword": "Then "
});
formatter.step({
  "line": 19,
  "name": "Find the title of the job listing",
  "keyword": "And "
});
formatter.step({
  "line": 20,
  "name": "Close the browser",
  "keyword": "And "
});
formatter.match({
  "location": "JobBoard.openJobsSite()"
});
formatter.result({
  "duration": 5225904000,
  "status": "passed"
});
formatter.match({
  "location": "JobBoard.navigate_to_Jobs_page()"
});
formatter.result({
  "duration": 812874100,
  "status": "passed"
});
formatter.match({
  "location": "JobBoard.find_the_Keywords_search_input_field()"
});
formatter.result({
  "duration": 248623400,
  "status": "passed"
});
formatter.match({
  "location": "JobBoard.filter_job_type_to_show_only_Full_Time_jobs()"
});
formatter.result({
  "duration": 602109900,
  "status": "passed"
});
formatter.match({
  "location": "JobBoard.find_the_title_of_the_job_listing()"
});
formatter.result({
  "duration": 2142520700,
  "status": "passed"
});
formatter.match({
  "location": "JobBoard.close_the_browser()"
});
formatter.result({
  "duration": 212279700,
  "status": "passed"
});
formatter.scenario({
  "line": 23,
  "name": "Posting a job using parameterization",
  "description": "",
  "id": "verify-the-job-board-page.;posting-a-job-using-parameterization",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 24,
  "name": "Open a browser with Jobs Site",
  "keyword": "Given "
});
formatter.step({
  "line": 25,
  "name": "Go to Post a Job page",
  "keyword": "Then "
});
formatter.step({
  "line": 26,
  "name": "Enter \"Cucumber/BDD Tester\", \"kuehkopf-knoblochsaue\" and \"GoodGames GmbH\"",
  "keyword": "And "
});
formatter.step({
  "line": 27,
  "name": "Submit the form",
  "keyword": "And "
});
formatter.step({
  "line": 28,
  "name": "Go to the Jobs page",
  "keyword": "Then "
});
formatter.step({
  "line": 29,
  "name": "Confirm \"Cucumber/BDD Tester\" listing is shown on page",
  "keyword": "And "
});
formatter.step({
  "line": 30,
  "name": "Close the browser",
  "keyword": "And "
});
formatter.match({
  "location": "JobBoard.openJobsSite()"
});
formatter.result({
  "duration": 4305206800,
  "status": "passed"
});
formatter.match({
  "location": "JobBoard.go_to_Post_a_Job_page()"
});
formatter.result({
  "duration": 4175574400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Cucumber/BDD Tester",
      "offset": 7
    },
    {
      "val": "kuehkopf-knoblochsaue",
      "offset": 30
    },
    {
      "val": "GoodGames GmbH",
      "offset": 58
    }
  ],
  "location": "JobBoard.enter_and(String,String,String)"
});
formatter.result({
  "duration": 10913580300,
  "status": "passed"
});
formatter.match({
  "location": "JobBoard.submit_the_form()"
});
formatter.result({
  "duration": 1876145100,
  "status": "passed"
});
formatter.match({
  "location": "JobBoard.go_to_the_Jobs_page()"
});
formatter.result({
  "duration": 745010500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Cucumber/BDD Tester",
      "offset": 9
    }
  ],
  "location": "JobBoard.confirm_job_listing_is_shown_on_page(String)"
});
formatter.result({
  "duration": 589837700,
  "status": "passed"
});
formatter.match({
  "location": "JobBoard.close_the_browser()"
});
formatter.result({
  "duration": 268294900,
  "status": "passed"
});
formatter.scenarioOutline({
  "line": 33,
  "name": "Using Examples table to post a job",
  "description": "",
  "id": "verify-the-job-board-page.;using-examples-table-to-post-a-job",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 34,
  "name": "Open a browser with Jobs Site",
  "keyword": "Given "
});
formatter.step({
  "line": 35,
  "name": "Go to Post a Job page",
  "keyword": "Then "
});
formatter.step({
  "line": 36,
  "name": "Enter Example \"\u003cEmail\u003e\", \"\u003cJob\u003e\", \"\u003cLocation\u003e\" and \"\u003cCompany\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 37,
  "name": "Submit the form",
  "keyword": "And "
});
formatter.step({
  "line": 38,
  "name": "Go to the Jobs page",
  "keyword": "Then "
});
formatter.step({
  "line": 39,
  "name": "Confirm \"\u003cJob\u003e\" listing is shown on page",
  "keyword": "And "
});
formatter.step({
  "line": 40,
  "name": "Close the browser",
  "keyword": "And "
});
formatter.examples({
  "line": 42,
  "name": "",
  "description": "",
  "id": "verify-the-job-board-page.;using-examples-table-to-post-a-job;",
  "rows": [
    {
      "cells": [
        "Email",
        "Job",
        "Location",
        "Company"
      ],
      "line": 43,
      "id": "verify-the-job-board-page.;using-examples-table-to-post-a-job;;1"
    },
    {
      "cells": [
        "Test1@IBM1.com",
        "Selenium/BDD4",
        "Bangalore",
        "IBM"
      ],
      "line": 44,
      "id": "verify-the-job-board-page.;using-examples-table-to-post-a-job;;2"
    },
    {
      "cells": [
        "Test2@IBM2.com",
        "Selenium/BDD5",
        "Bangalore",
        "IBM"
      ],
      "line": 45,
      "id": "verify-the-job-board-page.;using-examples-table-to-post-a-job;;3"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 44,
  "name": "Using Examples table to post a job",
  "description": "",
  "id": "verify-the-job-board-page.;using-examples-table-to-post-a-job;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@jobBoard"
    }
  ]
});
formatter.step({
  "line": 34,
  "name": "Open a browser with Jobs Site",
  "keyword": "Given "
});
formatter.step({
  "line": 35,
  "name": "Go to Post a Job page",
  "keyword": "Then "
});
formatter.step({
  "line": 36,
  "name": "Enter Example \"Test1@IBM1.com\", \"Selenium/BDD4\", \"Bangalore\" and \"IBM\"",
  "matchedColumns": [
    0,
    1,
    2,
    3
  ],
  "keyword": "And "
});
formatter.step({
  "line": 37,
  "name": "Submit the form",
  "keyword": "And "
});
formatter.step({
  "line": 38,
  "name": "Go to the Jobs page",
  "keyword": "Then "
});
formatter.step({
  "line": 39,
  "name": "Confirm \"Selenium/BDD4\" listing is shown on page",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 40,
  "name": "Close the browser",
  "keyword": "And "
});
formatter.match({
  "location": "JobBoard.openJobsSite()"
});
formatter.result({
  "duration": 5428877900,
  "status": "passed"
});
formatter.match({
  "location": "JobBoard.go_to_Post_a_Job_page()"
});
formatter.result({
  "duration": 7972783400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Test1@IBM1.com",
      "offset": 15
    },
    {
      "val": "Selenium/BDD4",
      "offset": 33
    },
    {
      "val": "Bangalore",
      "offset": 50
    },
    {
      "val": "IBM",
      "offset": 66
    }
  ],
  "location": "JobBoard.enter_Example_and(String,String,String,String)"
});
formatter.result({
  "duration": 10726718000,
  "status": "passed"
});
formatter.match({
  "location": "JobBoard.submit_the_form()"
});
formatter.result({
  "duration": 4624700900,
  "status": "passed"
});
formatter.match({
  "location": "JobBoard.go_to_the_Jobs_page()"
});
formatter.result({
  "duration": 1872961900,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Selenium/BDD4",
      "offset": 9
    }
  ],
  "location": "JobBoard.confirm_job_listing_is_shown_on_page(String)"
});
formatter.result({
  "duration": 6076479200,
  "status": "passed"
});
formatter.match({
  "location": "JobBoard.close_the_browser()"
});
formatter.result({
  "duration": 4397391200,
  "status": "passed"
});
formatter.scenario({
  "line": 45,
  "name": "Using Examples table to post a job",
  "description": "",
  "id": "verify-the-job-board-page.;using-examples-table-to-post-a-job;;3",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@jobBoard"
    }
  ]
});
formatter.step({
  "line": 34,
  "name": "Open a browser with Jobs Site",
  "keyword": "Given "
});
formatter.step({
  "line": 35,
  "name": "Go to Post a Job page",
  "keyword": "Then "
});
formatter.step({
  "line": 36,
  "name": "Enter Example \"Test2@IBM2.com\", \"Selenium/BDD5\", \"Bangalore\" and \"IBM\"",
  "matchedColumns": [
    0,
    1,
    2,
    3
  ],
  "keyword": "And "
});
formatter.step({
  "line": 37,
  "name": "Submit the form",
  "keyword": "And "
});
formatter.step({
  "line": 38,
  "name": "Go to the Jobs page",
  "keyword": "Then "
});
formatter.step({
  "line": 39,
  "name": "Confirm \"Selenium/BDD5\" listing is shown on page",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 40,
  "name": "Close the browser",
  "keyword": "And "
});
formatter.match({
  "location": "JobBoard.openJobsSite()"
});
formatter.result({
  "duration": 7930458500,
  "status": "passed"
});
formatter.match({
  "location": "JobBoard.go_to_Post_a_Job_page()"
});
formatter.result({
  "duration": 4583205800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Test2@IBM2.com",
      "offset": 15
    },
    {
      "val": "Selenium/BDD5",
      "offset": 33
    },
    {
      "val": "Bangalore",
      "offset": 50
    },
    {
      "val": "IBM",
      "offset": 66
    }
  ],
  "location": "JobBoard.enter_Example_and(String,String,String,String)"
});
formatter.result({
  "duration": 10658461200,
  "status": "passed"
});
formatter.match({
  "location": "JobBoard.submit_the_form()"
});
formatter.result({
  "duration": 1480796700,
  "status": "passed"
});
formatter.match({
  "location": "JobBoard.go_to_the_Jobs_page()"
});
formatter.result({
  "duration": 953610800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Selenium/BDD5",
      "offset": 9
    }
  ],
  "location": "JobBoard.confirm_job_listing_is_shown_on_page(String)"
});
formatter.result({
  "duration": 660256200,
  "status": "passed"
});
formatter.match({
  "location": "JobBoard.close_the_browser()"
});
formatter.result({
  "duration": 170664700,
  "status": "passed"
});
});