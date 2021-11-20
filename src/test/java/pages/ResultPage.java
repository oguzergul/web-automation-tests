package pages;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.Driver;

public class ResultPage {

    public ResultPage(){
        PageFactory.initElements(Driver.get(),this);
    }

    @FindBy(css = ".title-wrapper.title")
    public WebElement resultTitle;

    public void verifySearchResults(){
        Assert.assertTrue(resultTitle.getText().contains("Results for"));
    }

}
