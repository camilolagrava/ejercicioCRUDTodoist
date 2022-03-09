package pagesTodoist;

import control.Button;
import control.TextBox;
import org.openqa.selenium.By;

public class NewProjectModal {
    public Button buttonSubmitNewProject = new Button(By.xpath("//button[@type = 'submit']") );
    public TextBox nameNewProject = new TextBox(By.xpath("//input[@name='name']"));
}
