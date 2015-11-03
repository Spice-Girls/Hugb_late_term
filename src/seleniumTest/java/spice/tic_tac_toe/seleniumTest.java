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
import org.openqa.selenium.Alert;


public class seleniumTest {
    static WebDriver driver;
    static String baseUrl;
	static String port;

    @BeforeClass
        public static void before() {
            driver = new FirefoxDriver();
			port = System.getenv("PORT");
			if(port == null) {
				port = "4567";
			}
            baseUrl = "http://localhost:" + port;
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        }

    @AfterClass
        public static void after() {
            driver.close();
        }

	@Before
        public void setup() {
            driver.get(baseUrl + "/index.html");

        }

    @After
        public void tearDown() {
        }
    @Test
        public void assertTitle() {
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            assertEquals("Myllumaster 3000", driver.getTitle());
        }
	@Test
		public void assertXFirstMove() {
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.findElement(By.id("1")).click();
			String x = driver.findElement(By.id("1")).getText();
			assertEquals("X", x);
		}
	@Test
		public void assertReset() {
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.findElement(By.id("reset")).click();
			String empt = driver.findElement(By.id("1")).getText();
			assertEquals("", empt);
		}
	@Test
		public void assertXO() {
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.findElement(By.id("1")).click();
			String x = driver.findElement(By.id("1")).getText();
			assertEquals("X", x);
			driver.findElement(By.id("2")).click();
			String o = driver.findElement(By.id("2")).getText();
			assertEquals("O", o);
		}
	@Test
		public void assertWinX() {
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.findElement(By.id("1")).click();
			driver.findElement(By.id("2")).click();
			driver.findElement(By.id("4")).click();
			driver.findElement(By.id("5")).click();
			driver.findElement(By.id("7")).click();			
			Alert a1 = driver.switchTo().alert();
			String winner = a1.getText();
			a1.accept();
			assertEquals("Tester1", winner);
		}

}
