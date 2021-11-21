package definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.HomePage;
import pages.ResultPage;
import pages.SignInPage;
import utils.Driver;

public class step_definitions {
    HomePage homePage = new HomePage();
    ResultPage resultPage = new ResultPage();
    SignInPage signInPage = new SignInPage();
    GooglePage googlePage = new GooglePage();

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

    @When("I open {string} dropdown")
    public void openDropdown(String name) {
        homePage.openDropdown(name);
    }

    @And("I choose {string} submenu")
    public void openSubMenu(String name) {
        homePage.openSubMenu(name);
    }

    @When("I check Sign In Page title is {string}")
    public void verifyTitle(String title) {
        signInPage.verifyTitle(title);
    }

    @When("I fill Sign In form with {string} and {string}")
    public void fillSignInForm(String email, String password) {
        signInPage.fillSignInForm(email, password);
    }

    @When("I check if the login was successful")
    public void checkLoginIsSuccessful() {
        signInPage.checkLoginIsSuccessful();
    }

    @When("I click on Google Sign In Button")
    public void clickOnGoogleSignInButton() {
        signInPage.clickGoogleButton();
    }

    @And("I redirect to Google Sign In Page")
    public void redirectToGoogleSignInPage() {
        String parentWindow = Driver.get().getWindowHandle();
        System.out.println("Parent Window ID is : " + parentWindow);

        for(String winHandle : Driver.get().getWindowHandles()) {
            Driver.get().switchTo().window(winHandle);
        }
    }

    @When("I fill the email input with {string} and next")
    public void fillEmailInput(String email) {
        signInPage.fillGoogleEmail(email);
    }

    @When("I fill the password input with {string} and next")
    public void fillPasswordInput(String password) {
        signInPage.fillGooglePassword(password);
    }


    @When("I open Menu Dropdown")
    public void openMenuDropdown() {
        homePage.openMenu();
    }

    @And("I choose {string} option from list")
    public void chooseMenuOption(String option) {
        homePage.chooseMenuOption(option);
    }

    @And("I choose {string} category option from list")
    public void chooseCategoryOption(String option) {
        homePage.chooseCategoryOption(option);
    }
}
