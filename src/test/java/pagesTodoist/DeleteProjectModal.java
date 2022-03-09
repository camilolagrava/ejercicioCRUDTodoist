package pagesTodoist;

import control.Button;
import org.openqa.selenium.By;

public class DeleteProjectModal {
    public Button deleteButton = new Button(By.xpath("//button[text()='Delete']"));
}
