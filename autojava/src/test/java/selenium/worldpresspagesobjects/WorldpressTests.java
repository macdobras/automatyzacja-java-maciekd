package selenium.worldpresspagesobjects;

// dzień 3: 2018-12-13
// ćwiczenie przerobienia testu basic.WorldpressTests na Page Objects Pattern

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import selenium.worldpresspagesobjects.pages.WpMainPage;
import selenium.worldpresspagesobjects.pages.WpNotePage;

import java.util.UUID;

public class WorldpressTests extends BaseTest {

    @Test
    public void verifyAddNewCommentToFirstNote(){

        // Test Scenario:
        // - open wordpress main page
        // - open first note
        // - add comment to the note
        // - check that comment is addes

        // Dodatkowe komentarze moje:
        // - po opublikowaniu komentarza strona się odświeża więc to jest inna strona (inne dane są)
        // wiec powinien być inny nowy obiekt bo jeszcze raz trzeba wyszukać elementy  --> stąd latestNoteWithComment !!

        String comment = generateRandomeText();
        String author = generateRandomeText();
        //można np. String author = 'Maciek' + generateRandomeText();
        String email = generateRandomeEmail();

        WpMainPage mainPage = new WpMainPage(driver);
        WpNotePage latestNote = mainPage.openLatestNote();
        WpNotePage latestNoteWithComment = latestNote.addComment(comment, author, email);

    Assertions.assertTrue(latestNoteWithComment.commentExists(comment, author));

    }

    private String generateRandomeEmail() {
        return generateRandomeText() + "@testdomain.com";
    }

    private String generateRandomeText() {
        return UUID.randomUUID().toString();
    }

}
