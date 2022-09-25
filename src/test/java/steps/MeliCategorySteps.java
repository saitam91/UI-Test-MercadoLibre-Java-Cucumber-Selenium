package steps;

import io.cucumber.java.en.*;
import org.junit.Assert;
import pages.MeliCategoryPage;

public class MeliCategorySteps {

    MeliCategoryPage meli = new MeliCategoryPage();

    @Given("^I navigate to MercadoLibre webpage$")
    public void navigateToMeliWebPage(){
        meli.navigateToMeli();
    }


    @When("^I select the category (.+) from Tecnologia submenu$")
    public void selectItem(String cat) throws InterruptedException {
        meli.categoriesButton();
        meli.technologiesButton();
        meli.selectCategories(cat);
    }

    @Then("^I can validate I am looking for (.+) and the total results for it$")
    public void validateCategory(String cat){
       Assert.assertEquals(cat,meli.itemLabel());
       Assert.assertTrue("There are results for this item", meli.resultsLabel());
    }
   }




