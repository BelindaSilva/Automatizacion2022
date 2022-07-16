package testcases;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class MercuryTours {


    private WebDriver driver;

    By extractorEncabezado = By.tagName("h1");


    @Test
    public void setUp(){

        System.setProperty("webdriver.chrome.driver", "./src/test/resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://home.google.com/get-inspired/lighting/");
        driver.findElement(extractorEncabezado).getText();
        String texto=driver.findElement(extractorEncabezado).getText();
        System.out.print(" hola " +texto);

    }


    /* OBTENER TEXTO DEL TAH  H1 CON LOCALIZADOR TAGNAME
    @Test
    public void ByTagname(){

        driver.findElement(extractorEncabezado).getText();
        String texto=driver.findElement(extractorEncabezado).getText();
         System.out.print(" hola " +texto);

    }*/


}
