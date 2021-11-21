package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.Driver;
import utils.Helper;

public class HomePage {

    public HomePage(){
        PageFactory.initElements(Driver.get(),this);
    }

    @FindBy(css = "[alt='United States']")
    public WebElement country;

    @FindBy(css =  ".c-close-icon.c-modal-close-icon")
    public WebElement closePopupButton;

    @FindBy(id = "gh-search-input")
    public WebElement searchInput;

    @FindBy(css = "[aria-label='submit search']")
    public WebElement searchButton;

    public void chooseUS(){
        country.click();
    }

    public void closePopUp(){
        closePopupButton.click();
    }

    public void maximizeWindow(){
        Driver.get().manage().window().maximize();
    }

    public void checkMetaTitle() {
        String expectedTitle = "Best Buy | Official Online Store | Shop Now & Save";
        String receivedTitle = Driver.get().getTitle();
        Assert.assertEquals(expectedTitle,receivedTitle);
    }

    public void searchFor(String searchKey){
        searchInput.click();
        searchInput.sendKeys(searchKey);
        searchButton.click();
    }

    public void openDropdown(String name) {
        String locator = "//span[text()='" + name + "']";
        Driver.get().findElement(By.xpath(locator)).click();
    }

    public void openSubMenu(String name) {
        Helper.clickWithLinkText(name);
    }
}
