package testTodoist;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import pagesTodoist.*;

public class CrudTest extends BaseTodoist{
    LoginPage loginPage = new LoginPage();
    MainPage mainPage = new MainPage();
    PersonalPage personalPage = new PersonalPage();
    NewProjectModal newProjectModal = new NewProjectModal();
    EditProjectModal editProjectModal = new EditProjectModal();
    DeleteProjectModal deleteProjectModal = new DeleteProjectModal();
    String email = "camilolagrava@gmail.com";
    String pass = "contrasenna123";
    String nameNewProject = "NuevoProyecto";
    String nuevoNombre = nameNewProject+"EDITADO";

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

    @Test
    public void createProyectTest() throws InterruptedException {
        loginTest();
        personalPage.newProjectButton.click();
        newProjectModal.nameNewProject.click();
        newProjectModal.nameNewProject.setText(nameNewProject);
        Thread.sleep(2000);
        newProjectModal.buttonSubmitNewProject.click();
        Thread.sleep(4000);

        if(!personalPage.listaExpandida.isControlDisplayed()){
            personalPage.listaNoexpandida.click();
        }
        personalPage.setProjectDone(nameNewProject);
        Assertions.assertEquals(nameNewProject,personalPage.lastProjectDone.getTextControl(),
                "Error, no se encontro el nuevo proyecto");
    }

    @Test
    public void editProyectTest() throws InterruptedException {
        loginTest();
        personalPage.setProjectDone(nameNewProject);
        personalPage.lastProjectDone.click();
        personalPage.moreActionButton.click();
        personalPage.editProjectButton.click();
        Thread.sleep(3000);
        editProjectModal.nameProjectEdited.click();
        editProjectModal.nameProjectEdited.clearSetText(nuevoNombre);
        editProjectModal.submitButton.click();
        Thread.sleep(3000);
        personalPage.setProjectDone(nuevoNombre);
        if(!personalPage.listaExpandida.isControlDisplayed()){
            personalPage.listaNoexpandida.click();
        }
        Assertions.assertEquals(nuevoNombre,personalPage.lastProjectDone.getTextControl(),
                "Error, no se encontro el nuevo proyecto");

    }

    @Test
    public void deletProyectTest() throws InterruptedException {
        loginTest();
        personalPage.setProjectDone(nuevoNombre);
        personalPage.lastProjectDone.click();
        personalPage.moreActionButton.click();
        Thread.sleep(2000);
        personalPage.deletProjectButton.click();
        deleteProjectModal.deleteButton.click();

        Assertions.assertTrue(!personalPage.lastProjectDone.isControlDisplayed(),
                "Error, no se pudo borrar adecuadamente");
    }



}
