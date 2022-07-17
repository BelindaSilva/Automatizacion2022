package testcases;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class GetUrlByXpath2 {
    public WebDriver driver;

    By GetUrl = By.xpath("//a[@target=\"_blank\"]");


    @Test
    public void GetUrl() {
        System.setProperty("webdriver.chrome.driver", "./src/test/resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demoqa.com/");

        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(500));

        driver.findElement(GetUrl).getText();
        String url=driver.findElement(GetUrl).getAttribute("href");
        System.out.print("esta es la url: "+url);


    }
}
