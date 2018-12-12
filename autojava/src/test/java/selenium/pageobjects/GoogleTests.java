package selenium.pageobjects;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

public class GoogleTests extends BaseTest{

    @Test
    public void FindCodeSprinters(){
        //open Google Page
        driver.get("https://www.google.com/");

        //search for Code Sprinters Page
        driver.findElement(By.name("q"));


        //assert Code Sprinters Page is found


    }
}
