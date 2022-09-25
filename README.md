# Test MercadoLibre Web Page / Java-Cucumber-Selenium

## Resume:
* This automated UI test framework was created based on BDD carrying out the best testing practices.

* Using Page Object Model (POM) as a design pattern.

* To verify web-based application testing performs expectedly, Selenium WebDriver was used.

-----------------------  

To achieve this test framework, two scenarios with different test cases in MercadoLibre web page following this steps were created:

* First scenario:

  **1. Navigate to MercadoLibre web page.**

  **2. Select a category from Tecnologia submenu.**
  
  **3. Validate that the category selected previously and the total results for it, are being display.**
 
----------------------- 

* Second scenario:

  **1. Navigate to MercadoLibre web page.**

  **2. Search an item.**
  
  **3. Select Montevideo as location filter.**
  
  **4. Select a random publication from the items list.**
  
  **5. Validate the seller has the highest reputation.**
 
-----------------------  

* In order to automate these test cases, the following classes and files were created:

  ***1. build.gradle file***  to define the build configurations that will be applied to all the modules in the project.

  ***2. Runner java class***  to execute scenario we want and how we want cucumber to run.
  
  ***3. Feature file***  in gherkin language where to declare the scenearios and declare in a parameterized way the categories to select from the submenu and the items to perform the search.
  
  ***4. Base page java class*** where a single instance of the webdriver is created, and different methods to interact with the web elements, the other pages will inherit these functionalities.
  
  ***5. Step java class***  where the methods to be reproduced by the gherkin scenarios are implemented.
  
  ***6. Page java class***  where we will inherit the functionalities from the base page for interact with web elements.
  
------------------------
  
  ## Technologies used:

   - Language: JAVA

   - Building Tool: Gradle

   - Libraries: Selenium-Cucumber 

* Enviroment Configuration:

  - Download and set JAVA environment variables (JAVA_HOME and PATH):JDK (17.0.2)

  - Download and installation IDE (IntelliJ IDEA)

* Cucumber Reports:

  - test-output/HtmlReport/ExtentHtml.html
  
  
 * Run Tests:

   - gradle clean
   
   - gradle clean test -D cucumber.options="--tags '@Meli'"
