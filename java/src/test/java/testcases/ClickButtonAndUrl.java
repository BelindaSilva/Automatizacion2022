package testcases;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class ClickByXpath {


    private WebDriver driver;


    By getButton = By.xpath("//button[@id=\"tabButton\"]");



    @Test
    public void Click(){

        System.setProperty("webdriver.chrome.driver", "./src/test/resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demoqa.com/browser-windows");


        driver.findElement(getButton).click();
        String url = driver.getCurrentUrl();
        System.out.print(" url " +url);



    }



 /*
    public void ByTagname(){

        driver.findElement(extractorEncabezado).getText();
        String texto=driver.findElement(extractorEncabezado).getText();
         System.out.print(" hola " +texto);

    }
*/
  /*private  void ByButton(){

      driver.findElement(getButton).click();

  }*/




}
