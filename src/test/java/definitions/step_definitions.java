package definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.HomePage;
import pages.ResultPage;

public class step_definitions {
    HomePage homePage = new HomePage();
    ResultPage resultPage = new ResultPage();

    @Given("I open BestBuy homepage")
    public void homePageIsOpen(){
        homePage.chooseUS();
    }

    @And("I close first opening popup")
    public void closePopUp() {
        homePage.closePopUp();
    }

    @And("I maximize window")
    public void maximizeWindow() {
        homePage.maximizeWindow();
    }

    @When("I check homepage meta title")
    public void checkMetaTitle() {
        homePage.checkMetaTitle();
    }

    @When("I search for {string} on search-box")
    public void makeSearchFor(String searchKey) {
        homePage.searchFor(searchKey);
    }

    @Then("I check search results have been listed")
    public void checkForResults() {
        resultPage.verifySearchResults();
    }
}
