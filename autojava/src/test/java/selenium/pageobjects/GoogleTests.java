package selenium.pageobjects;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class GoogleTests extends BaseTest{

    @Test
    public void FindCodeSprinters(){

        //open Google Page
        driver.get("https://www.google.com/");


        //search for Code Sprinters Page
        WebElement searchBox = driver.findElement(By.name("q"));
        searchBox.sendKeys("Code Sprinters");
        searchBox.submit();


        //assert Code Sprinters Page is found
        Assertions.assertTrue();


    }
}
