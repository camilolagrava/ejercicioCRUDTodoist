package pagesTodoist;

import control.Button;
import control.Image;

import control.Label;
import control.TextBox;
import org.openqa.selenium.By;

public class PersonalPage {

    /*cabecera*/
    public Image avatarImage = new Image(By.xpath("//img[@class='user_avatar big settings_avatar']"));
    public Button newProjectButton = new Button(By.xpath("//button[@data-track = 'navigation|projects_quick_add' ]"));

    /* lista de items izquirda inferior */

    public Label listaNoexpandida = new Label(By.xpath("//div[@class='sidebar_expansion_panel expansion_panel']"));
    public Label listaExpandida = new Label(By.xpath("//div[@class='sidebar_expansion_panel expansion_panel expansion_panel--expanded']"));
    public Label lastProjectDone ;

    public Button moreActionButton = new Button(By.xpath("//li[last()]//div[@class='_7DCqR7o3BYjme7edphDp8A==']"));
        /*menu extendible dentro de la lista izquirda inferior*/
    public Button editProjectButton = new Button(By.xpath("//div[text()='Edit project']"));
    public Button deletProjectButton = new Button(By.xpath("//div[text()='Delete project']"));

    public void setProjectDone(String name) {
        this.lastProjectDone = new Label(By.xpath("//div[@class='sidebar_expansion_panel expansion_panel expansion_panel--expanded']//li[last()]//span[text()='"+name+"']"));

    }





}
