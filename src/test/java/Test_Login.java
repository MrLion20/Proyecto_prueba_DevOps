import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test_Login {
    private static final WebDriver driver = new ChromeDriver();
    PageObject pageobject = new PageObject(driver);

    @Before
    public void BeforeSuit() {
        pageobject.CargarPagina();
    }

    @Test
    public void Ingresar_Credenciales() throws InterruptedException {
        pageobject.Login();
    }
}
