package ui;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Futurenation1 {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.edge.driver", "C:\\BrowserDrivers\\msedgedriver");
        WebDriverManager.edgedriver().setup();

        EdgeDriver driver = new EdgeDriver();
        driver.get("https://platform.futurenation.gov.bd/");
        driver.manage().window().maximize();

        Thread.sleep(2000);

        WebElement search1 = driver.findElement(By.xpath("/html/body/div[2]/div/div/header/div/div/div/div[3]/div/div[1]/input"));
        
       
        search1.sendKeys("Brand Promoter");
        Thread.sleep(2000);

        search1.sendKeys(Keys.ENTER);

        Thread.sleep(2000);

        
    }
}
