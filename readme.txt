The framework created here uses Gherkin syntax with Testng and Page object model implementation,

--------------------------------------------------------------------------------------------------------
Key specialities of this frmework are as follows

1. Gherkin specific format with all the values of user to be created or user to be deleted coming from
"src.test.featurefiles.way2automation.feature"

2. It implements POM(Page object model) implementation, all the hardcoded locators are kept in specific pages
located at "test.java.pageObjects.<pagefiles>"

3. It implements TestNG architecture and testng specific configs can be found in testng.xml where we have specified TestRunner location

4. Parallel execution is key USP of this framework, from pom.xml surefire plugin configs we can change configs of parallel configuration.

---------------------------------------------------------------------------------------------------------
Steps to run the framework(Use any 1 of the below specified 4 ways)

1. Through mvn
- Just clone the project
- From base location just type "mvn clean test" which will start execution of testcases


2. Through testRunner
- Open framework in any ide(Intellij or eclipse) and open "src/test/java/runner/TestRunner" file
- Right click -> select "Run TestRunner" which will start execution of testcases

3. Through Feature file
- Open framework in and IDE
- go to location "src/test/featurefiles/way2automation.feature" and open the file
- Right click and click on "Run Feature:way2automation.feature" while your pointer is on first line of page

4. Through TestNG
- Open framework in and IDE
- Open testng.xml file present at the base location
- Right click and click on "run ../testng.xml" feature which will start execution of Testcases.