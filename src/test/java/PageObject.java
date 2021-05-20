import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class PageObject extends Base{
    public PageObject(WebDriver driver) {
        super(driver);
    }
    //Pagina De Login
    By txt_email = By.id("Email");
    By txt_password = By.id("Password");
    By cb_remember = By.id("RememberMe");
    By btn_login = By.xpath("/html/body/div[6]/div/div/div/div/div[2]/div[1]/div/form/div[3]/button");

    //Implementacion de las acciones de Pruebas

    //Test Cargar Pagina
    public void CargarPagina() {
        System.setProperty("webdriver.chrome.driver", Conexion.CHROME_DRIVER_LOCATION);
        driver.get(Conexion.BASE_URL);
        driver.manage().window().maximize();
    }
    //Test Login
    public void Login() {
       /* Credenciales de login:
        - Email: admin@yourstore.com
        -PassWord: admin */

        //Test de limpiar los espacios del login para ingresar los Credenciales
        clear(txt_email);
        clear(txt_password);
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

        //Agregr Credenciales
        type("admin@yourstore.com", txt_email);
        type("admin", txt_password);

        //Seleccionar el CheckBox
        click(cb_remember);
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

        //Confirmar los Datos al ingresar y Precionar Boton para Confirmar Credenciales y ingresar al Sistema
        click(btn_login);
    }
}
