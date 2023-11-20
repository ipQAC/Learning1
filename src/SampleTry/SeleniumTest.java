package SampleTry;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;

import java.time.Duration;

public class SeleniumTest {
    public static void main (String[] args) {
       // System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.google.com/");

        System.out.println ("Page Title is " + driver.getTitle());

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));

        WebElement keyword = driver.findElement(By.name ("q"));

        keyword.sendKeys("Selenium");

        keyword.sendKeys(Keys.ENTER);

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));

       driver.findElement(By.xpath("//*[@id='rso']/div[1]/div/div/div/div[1]/div/div/span/a/div/div/div/cite")).click();

       System.out.println("User redirected to " + driver.getCurrentUrl() );

      driver.quit();

    }
}
