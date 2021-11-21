package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.Driver;

public class SignInPage {

    public SignInPage(){
        PageFactory.initElements(Driver.get(),this);
    }

    @FindBy(tagName = "h1")
    public WebElement title;

    @FindBy(id = "fld-p1")
    public WebElement passwordInput;

    @FindBy(id = "fld-e")
    public WebElement emailInput;

    @FindBy(css = "[data-track='Sign In']")
    public WebElement signInButton;



    public void verifyTitle(String expected) {
      Assert.assertEquals(expected,title.getText());
    }

    public void fillSignInForm(String email, String password) {
        emailInput.sendKeys(email);
        passwordInput.sendKeys(password);
        signInButton.sendKeys(Keys.ENTER);
    }

    public void checkLoginIsSuccessful() {
        WebElement signout = Driver.get().findElement(By.linkText("Sign Out"));
        Assert.assertTrue(signout.getText().contains("Sign Out"));
    }
}
