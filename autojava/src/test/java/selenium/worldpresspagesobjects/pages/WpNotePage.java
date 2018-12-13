package selenium.worldpresspagesobjects.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class WpNotePage {
    private final WebDriver driver;

    public WpNotePage(WebDriver driver) {
        this.driver = driver;
        // here you have new Note page on Worldpress (no code;-) )
    }

    public WpNotePage addComment(String comment, String author, String email) {
        // here you publish comment
        WebElement newComment = driver.findElement(By.id("comment"));
        newComment.sendKeys(comment);

        WebElement newAuthor = driver.findElement(By.id("author"));
        newAuthor.sendKeys(author);

        WebElement newEmail = driver.findElement(By.id("email"));
        newEmail.sendKeys(email);

        driver.findElement(By.id("submit")).submit();

        return new WpNotePage(driver);
    }

    public boolean commentExists(String comment, String author) {
        Stream<WebElement> listOfComment = driver.findElements(By.className(".comment-content"))
                .stream()
                .filter (c -> c.findElement(By.cssSelector(".comment-content > p")).getText().equals(comment));
        List<WebElement> result = listOfComment.collect(Collectors.toList());

        return result.size() == 1;

        // Stream<WebElement> listOfAuthor = driver.findElements(By.className(".fn"))
        //        .stream()
        //        .filter (c -> c.findElement(By.cssSelector(".fn")).getText().equals(""+author));
        // List<WebElement> resultsListOfAuthors = listOfAuthor.collect(Collectors.toList());
        // return resultsListOfAuthors.size() == 1;
    }

}
