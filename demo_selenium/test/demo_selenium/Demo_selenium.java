/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demo_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import demo_selenium.Demo_seleniumNGTest;


/**
 *
 * @author ASUS
 */
public class Demo_selenium {

    /**
     * @param args the command line arguments
     */
    
    private static WebDriver driver = null;
            
    public static void main(String[] args) {
        // TODO code application logic here
        
        //Installing driver for chrome
        System.setProperty("webdriver.chrome.driver", "D:\\installer setup\\chromedriver\\chromedriver.exe");
        driver = new ChromeDriver();
        //get url
        driver.get("https:\\amazon.com");
        
        
        driver.findElement(By.xpath("//*[@id=\"nav-link-shopall\"]")).click();
        driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div[2]/div[3]/div/a[1]")).click();
        driver.findElement(By.xpath("/html/body/div[2]/div[4]/div/div[2]/div/div[1]/div[1]/ul[3]/li[1]/a")).click();
        
        driver.findElement(By.xpath("//*[@id=\"low-price\"]")).sendKeys("Max");
        driver.findElement(By.xpath("//*[@id=\"high-price\"]")).sendKeys("Min");
        driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div[3]/div[3]/div[2]/ul[3]/div/li[6]/span/form/span[3]/span/input")).submit();

        String ProductName = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div[3]/div[2]/div/div[4]/div[1]/div/ul/li[1]/div/div[3]/div[2]/div[1]/a/h2")).getText();
        String ProductPrice = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div[3]/div[2]/div/div[4]/div[1]/div/ul/li[1]/div/div[3]/div[4]/div[1]/a/span[2]/span")).getText();
        System.out.println("1. Product Name : " + ProductName);
        System.out.println("2. Product Price : " + ProductPrice);
        
        driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div[3]/div[2]/div/div[4]/div[1]/div/ul/li[1]/div/div[3]/div[2]/div[1]/a/h2")).click();
        driver.findElement(By.xpath("//*[@id=\"add-to-wishlist-button-submit\"]")).submit();
        
        try{
            String SignIn_verify = driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div/div[2]/div/div[1]/form/div/div/div/h1")).getText();
            Demo_seleniumNGTest objekNGT = new Demo_seleniumNGTest();
            objekNGT.testSomeMethod(SignIn_verify);
            //if (SignIn_verify != ""){
                System.out.println("SIGN IN VERIFIED");
                driver.findElement(By.xpath("//*[@id=\"ap_email\"]")).sendKeys("chandra@gmail.com");
                driver.findElement(By.xpath("//*[@id=\"continue\"]")).submit();
            //}
        }catch (Exception e){
                System.out.println("NOT VERIFIED");
        }
        
        
        driver.quit();
        
        
    }
}
