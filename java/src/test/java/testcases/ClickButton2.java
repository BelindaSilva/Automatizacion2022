package testcases;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetByXpathButton2 {


    private WebDriver driver;

    By getButton = By.xpath("//button[@id=\"tabButton\"]");


    @Test
    public  void ClickButton(){

        System.setProperty("webdriver.chrome.driver", "./src/test/resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demoqa.com/browser-windows");

        //Aca inicia
        driver.findElement(getButton).click();

    }









}
