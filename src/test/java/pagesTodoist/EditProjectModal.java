package pagesTodoist;

import control.Button;
import control.TextBox;
import org.openqa.selenium.By;

public class EditProjectModal {

    public TextBox nameProjectEdited= new TextBox(By.id("edit_project_modal_field_name"));
    public Button submitButton = new Button(By.xpath("//button[@type='submit']"));

}
