Feature: Loading IDE after selecting the workspace

@Test
Scenario: Validation of loading IDE after creating workspace in application

Given user logged in to the application 

When user clicks New Project button and again clicks New RStudio Project tab

Then user should see an IDE loaded successfully

