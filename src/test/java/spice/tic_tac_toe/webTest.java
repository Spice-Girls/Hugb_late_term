package spice.tic_tac_toe;

import java.util.concurrent.TimeUnit;
import static org.junit.Assert.assertEquals;

import org.junit.AfterClass;
import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;



public class webTest {
    static WebDriver driver;
    static String baseUrl;
    static String port;

    @BeforeClass
        public static void before() {
            driver = new FirefoxDriver();
            port = System.getenv("PORT");
            if(port == null) {
                port = "9090";
            }
            baseUrl = "https://obscure-beyond-7452.herokuapp.com";
            driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        }

    @AfterClass
        public static void after() {
            driver.close();
        }

/*    @Before
        public void setup() {
            ;
        }*/

    @After
        public void tearDown() {
            driver.get(baseUrl + "/");
        }
    @Test
        public void assertTitle() {
            driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
            driver.get(baseUrl + "/index.html");
            assertEquals("Error 404", driver.getTitle());
        }
}
