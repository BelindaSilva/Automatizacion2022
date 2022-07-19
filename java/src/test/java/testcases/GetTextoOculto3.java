package testcases;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class GetTextoOculto3 {
    public WebDriver driver;
    By LocalizarTextoOculto = By.xpath("//p[@hidden]");


    @Test
    public void GetTextoTagP(){
        System.setProperty("webdriver.chrome.driver", "./src/test/resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml5_global_hidden");
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(500));

        //inicio

        driver.switchTo().frame("iframeResult");
        String text=driver.findElement(LocalizarTextoOculto).getAttribute("textContent");
        System.out.print("El texto oculto es: "+text);


    }



}
