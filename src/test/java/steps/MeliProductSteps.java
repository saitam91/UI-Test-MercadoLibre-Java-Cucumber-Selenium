package steps;

import io.cucumber.java.en.And;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.MeliProductPage;

public class MeliProductSteps{

    MeliProductPage meliprod = new MeliProductPage();

    @And("^Enter (.+) as a search criteria$")
    public void searchItem(String item) {
        meliprod.searchProduct(item);
        meliprod.clickSearchButton();
    }

    @And("^Click Montevideo as location filter$")
    public void enterLocation() {
        meliprod.clickBanner();
        meliprod.clickLocation();
    }

    @When("^Select a random publication$")
    public void selectRandomPublication(){
        int randomItem = (int) (Math.random() * 10 + 1);
        meliprod.selectRandomItem(randomItem);
    }

    @Then("^I can validate the seller has the highest reputation$")
    public void validateReputation(){
        String reputation = meliprod.salesLabel();
        int sellerReputation = Integer.parseInt(reputation);
        Assert.assertTrue("The seller does not have the highest reputation",sellerReputation >= 120);
    }

}
