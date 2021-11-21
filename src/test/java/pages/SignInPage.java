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

    @FindBy(xpath = "//button[text()='Sign in with Google']")
    public WebElement googleButton;

    @FindBy(css = "[type='email']")
    public WebElement googleEmail;

    @FindBy(css = "[type='password']")
    public WebElement googlePassword;

    @FindBy(className = "VfPpkd-vQzf8d")
    public WebElement nextButton;

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

    public void clickGoogleButton() {
        googleButton.click();
    }

    public void fillGoogleEmail(String email) {
        System.out.println(Driver.get().getTitle());
        googleEmail.sendKeys(email);
        nextButton.click();
    }

    public void fillGooglePassword(String password) {
        googlePassword.sendKeys(password);
        nextButton.click();
    }


}
