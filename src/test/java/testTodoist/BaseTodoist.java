package testTodoist;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import singleton.Session;

public class BaseTodoist {

    public WebDriver driver;
    @BeforeEach
    public void openBrowser(){
        Session.getInstance().getDriver().get("https://todoist.com/es");
        driver = Session.getDriver();
    }

    public WebDriver getDriver() {
        return driver;
    }

    @AfterEach
    public void closeBrowser(){
        Session.getInstance().closeSession();
    }
}
