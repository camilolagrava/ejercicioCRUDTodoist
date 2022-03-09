package pagesTodoist;

import control.Button;
import control.TextBox;
import org.openqa.selenium.By;

public class LoginPage {
    public TextBox textoEmail = new TextBox(By.id("email"));
    public TextBox textoPass = new TextBox(By.id("password"));
    public Button registerButton = new Button(By.xpath("//button"));
}
