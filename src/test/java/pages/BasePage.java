package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class BasePage {

    protected static WebDriver driver;
    private static WebDriverWait wait;
    Actions act = new Actions (driver);



    static{
        System.setProperty("webdriver.chrome.driver","src/test/resources/chromedriver.exe");
        ChromeOptions chromeoptions = new ChromeOptions();
        driver = new ChromeDriver(chromeoptions);
        wait = new WebDriverWait(driver,30);
    }

    public BasePage(WebDriver driver){
        BasePage.driver = driver;
        wait = new WebDriverWait(driver,30);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.manage().window().maximize();
    }

    private WebElement Find (String locator){
        return wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(locator)));
    }

    public static void navigateTo(String url){
        driver.get(url);
    }

    public void clickElement (String locator){
        Find(locator).click();
    }

    public void write (String locator, String textToWrite){
        Find(locator).clear();
        Find(locator).sendKeys(textToWrite);
    }

    public void hoverOver(String locator){
        act.moveToElement(Find(locator)).perform();
    }

    public void clickAction(String locator){
        act.click(Find(locator)).perform();
    }

    public String textFromElement(String locator){
        return Find(locator).getText();
    }

    public List<WebElement>bringMeAllElementsXPath(String locator){
        return driver.findElements(By.xpath(locator));
    }

    public boolean elementIsDisplay (String locator){
        return Find(locator).isDisplayed();
    }

    public void selectItems(String locator, int index){
        List<WebElement> results = driver.findElements(By.xpath(locator));
        results.get(index).click();
    }

    public static void closeBrowser(){
        driver.quit();
    }





    }


