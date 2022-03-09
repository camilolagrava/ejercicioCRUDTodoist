package testTodoist;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import pagesTodoist.LoginPage;
import pagesTodoist.MainPage;
import pagesTodoist.PersonalPage;

public class LoginTest extends BaseTodoist{

    LoginPage loginPage = new LoginPage();
    MainPage mainPage = new MainPage();
    PersonalPage personalPage = new PersonalPage();
    String email = "camilolagrava@gmail.com";
    String pass = "contrasenna123";

    @Test
    public void loginTest(){
        mainPage.imagenInicioDeSecion.click();
        loginPage.textoEmail.click();
        loginPage.textoEmail.clearSetText(email);
        loginPage.textoPass.click();
        loginPage.textoPass.clearSetText(pass);
        loginPage.registerButton.click();

        Assertions.assertTrue(personalPage.avatarImage.isControlDisplayed(),
                "Error, loggin no exitoso");
    }
}
