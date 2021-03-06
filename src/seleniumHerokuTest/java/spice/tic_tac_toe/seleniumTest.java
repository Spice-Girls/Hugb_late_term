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


public class seleniumTest {
    static WebDriver driver;
    static String baseUrl;

    @BeforeClass
        public static void before() {
            driver = new FirefoxDriver();
            baseUrl = "https://obscure-beyond-7452.herokuapp.com/index.html";
            driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        }

    @AfterClass
        public static void after() {
            driver.close();
        }

	@Before
        public void setup() {
            driver.get(baseUrl);

        }

    @After
        public void tearDown() {
        }
    @Test
        public void assertTitle() {
            driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
            assertEquals("Myllumaster 3000", driver.getTitle());
        }
	@Test
		public void assertXFirstMove() {
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.findElement(By.id("1")).click();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			String x = driver.findElement(By.id("1")).getText();
			assertEquals("X", x);
		}
	@Test
		public void assertReset() {
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.findElement(By.id("reset")).click();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			String empt = driver.findElement(By.id("1")).getText();
			assertEquals("", empt);
		}
	@Test
		public void assertXO() {
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.findElement(By.id("1")).click();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			String x = driver.findElement(By.id("1")).getText();
			assertEquals("X", x);
			driver.findElement(By.id("2")).click();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			String o = driver.findElement(By.id("2")).getText();
			assertEquals("O", o);
		}
	@Test
		public void assertWinX() {
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.findElement(By.id("1")).click();
			driver.findElement(By.id("2")).click();
			driver.findElement(By.id("4")).click();
			driver.findElement(By.id("5")).click();
			driver.findElement(By.id("7")).click();			
            String winner = driver.findElement(By.id("messageBox")).getText();
			assertEquals("Tester1 Just Won", winner);
		}

}
