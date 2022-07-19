package testcases;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetByTagName1 {


    private WebDriver driver;

    By extractorEncabezado = By.tagName("h1");


    @Test
    public  void GetTextoH1(){

        System.setProperty("webdriver.chrome.driver", "./src/test/resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.w3schools.com/#gsc.tab=0");

         //Aca inicia
        driver.findElement(extractorEncabezado).getText();
        String texto=driver.findElement(extractorEncabezado).getText();
        System.out.print(" hola " +texto);


    }









}
