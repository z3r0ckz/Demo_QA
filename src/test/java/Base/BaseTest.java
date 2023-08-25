package Base;

import Browser.Browser;
import ConfigManager.ConfigManager;
import Logger.MyLogger;
import Utils.WaitsUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;

public abstract class BaseTest {
    public final WebDriver driver = Browser.Driver();
    protected final String url = ConfigManager.get("baseUrl");
    protected final WaitsUtil waits = new WaitsUtil();
    //Declaramos los Locators de la pagina para asegurarnos que esta abierta
    protected final By PageLocator_MainPage = By.xpath("//header[@href=www.demoqa.com]");

    @BeforeClass
    public void setup(){
        driver.get(url);
        MyLogger.info("Go to the Page: "+ url);
    }

    @AfterTest
    public void teardown(){
        MyLogger.info("End of the Test");
        //driver.quit();
    }


}
