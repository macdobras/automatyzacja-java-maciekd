package selenium.worldpresspagesobjects.pages;

import org.openqa.selenium.WebDriver;

public class WpNotePage {
    private final WebDriver driver;

    public WpNotePage(WebDriver driver) {
        this.driver = driver;
        // Todo: here you open Worldpress page
    }

    public WpNotePage addComment(String comment, String author, String email) {
        // Todo: here you publish comment
        return new WpNotePage(driver);
    }

    public boolean commentExists(String comment, String author) {
        // Todo: here you check that comment is publish
        return false;
    }
}
