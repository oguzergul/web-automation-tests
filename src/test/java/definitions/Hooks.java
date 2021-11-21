package definitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import utils.Driver;

import java.util.concurrent.TimeUnit;

public class Hooks {

    @Before
    public void setup(){
        Driver.get().get("https://www.bestbuy.com");
        Driver.get().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

     @After
     public void teardown(){
        Driver.closeDriver();
     }
}
