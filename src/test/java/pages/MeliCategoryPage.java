package pages;

import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class MeliCategoryPage extends BasePage{

    public MeliCategoryPage(){
        super(driver);
    }

    private String categoriesButton = "//body[1]/header[1]/div[1]/div[2]/ul[1]/li[2]/a[1]";
    private String technologiesButton = "//body[1]/header[1]/div[1]/div[2]/ul[1]/li[2]/div[1]/ul[1]/li[1]/a[1]";
    private String selectCategory="//ul[@class='nav-categs-detail__categ-list']/li/a";
    private String categoryLabel="//body[1]/main[1]/div[1]/div[2]/aside[1]/div[1]/h1[1]";
    private String categoryResults="//body[1]/main[1]/div[1]/div[2]/aside[1]/div[2]/span[1]";

    public void navigateToMeli(){
        navigateTo("https://www.mercadolibre.com.uy/");
    }

    public void categoriesButton(){
        hoverOver(categoriesButton);
    }

    public void technologiesButton(){
        hoverOver(technologiesButton);
    }

    public List selectCategories(String result) throws InterruptedException {
        Thread.sleep(600);
        try {
            List<WebElement>listOfElements = bringMeAllElementsXPath(selectCategory);
            for(WebElement e:listOfElements){
                if(e.getText().equals(result)){
                    e.click();
                }
            }
            return listOfElements;
        }
        catch (StaleElementReferenceException e){
        }
        return null;
    }

    public String itemLabel(){
        return textFromElement(categoryLabel);
    }

    public boolean resultsLabel(){
        return elementIsDisplay(categoryResults);
    }



}
