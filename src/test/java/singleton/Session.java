package singleton;

import factoryNavegador.FactoryNavegador;
import org.openqa.selenium.WebDriver;

public class Session {

    private static Session session=null;
    private static WebDriver driver;

    private Session(){
        driver= FactoryNavegador.make("chrome").createBrowser();
    }

    public static Session getInstance(){
        if (session == null)
            session= new Session();
        return session;
    }

    public void closeSession(){
        driver.quit();
        session=null;
    }

    public static WebDriver getDriver() {
        return driver;
    }


}
