package selenium.basic;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.UUID;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class WorldpressTests {

    private WebDriver driver;
    private final UUID id = UUID.randomUUID();

    @BeforeEach
    public void startDriver() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @Test
    public void verifyAddNewCommentToFirstNote(){
        driver.get("https://automatyzacja.benedykt.net/");

        WebElement firstTitleOnPage = driver.findElement(By.cssSelector(".entry-title > a"));
        firstTitleOnPage.click();

        WebElement comment = driver.findElement(By.id("comment"));
        comment.sendKeys(""+id);

        WebElement author = driver.findElement(By.id("author"));
        author.sendKeys("Maciek Testowy Jan Marian");

        WebElement email = driver.findElement(By.id("email"));
        email.sendKeys("test@test.pl");

        driver.findElement(By.id("submit")).submit();


        Stream<WebElement> listOfComment = driver.findElements(By.className(".comment-content"))
                .stream()
                .filter (c -> c.findElement(By.cssSelector(".comment-content > p")).getText().equals(""+id));

// coś tu nie działa:
//      Assertions.assertEquals(""+id, listOfComment.getText(""+id));


    }


    @AfterEach
    public void closeDriver() {
        driver.quit();
    }


}
