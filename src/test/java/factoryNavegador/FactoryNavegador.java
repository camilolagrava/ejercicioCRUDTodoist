package factoryNavegador;

public class FactoryNavegador {

    public static INavegador make(String browser){

        INavegador navegador;

        switch (browser.toLowerCase()){
            case  "chrome":
                navegador = new Chrome();
            case  "firefox":
                navegador = new Firefox();
            default:
                navegador = new Chrome();
        }

        return navegador;
    }

}
