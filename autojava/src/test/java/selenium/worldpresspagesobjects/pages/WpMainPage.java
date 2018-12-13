package selenium.worldpresspagesobjects.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class WpMainPage {

    private final WebDriver driver;

    public WpMainPage(WebDriver driver) {
        this.driver = driver;
        // here you open Worldpress page
        this.driver.get("https://automatyzacja.benedykt.net/");
    }

    public WpNotePage openLatestNote() {
        // here you find and open latest note (first note)
        WebElement firstTitleOnPage = driver.findElement(By.cssSelector(".entry-title > a"));
        firstTitleOnPage.click();

        return new WpNotePage(driver);
    }

}
