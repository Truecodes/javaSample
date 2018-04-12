package selenium;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertEquals;

/**
 * Created by wasadmin on 4/12/2018.
 */
public class BasicPageTest {

    @Test
    public void testThatPageOpens() {
        String pathToDriver = "c:/drivers/chromedriver.exe"; // you have to download this
        System.setProperty("webdriver.chrome.driver", pathToDriver);

        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://www.google.com");
        driver.findElement(By.id("lst-ib")).sendKeys("selenium");
        driver.findElement(By.className("lsb")).click();
        driver.findElement(By.linkText("Selenium - Web Browser Automation")).click();
        assertEquals("Selenium - Web Browser Automation", driver.getTitle());

    }
}
