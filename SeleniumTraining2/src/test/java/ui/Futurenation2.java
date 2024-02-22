package ui;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Futurenation2 {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.edge.driver", "C:\\BrowserDrivers\\msedgedriver");
        WebDriverManager.edgedriver().setup();

        EdgeDriver driver = new EdgeDriver();
        driver.get("https://platform.futurenation.gov.bd/");
        driver.manage().window().maximize();

        Thread.sleep(2000);

        
        WebElement signInButton = driver.findElement(By.className("MuiButton-outlinedPrimary"));
		signInButton.click();
		Thread.sleep(2000);
		
		WebElement email = driver.findElement(By.id("username"));
		email.sendKeys("monishamunir22@gmail.com");
		Thread.sleep(2000);
		 
		WebElement passwordInput = driver.findElement(By.id("password"));
		passwordInput.sendKeys("Monishamunir22");
		Thread.sleep(2000);

		WebElement signinButton = driver.findElement(By.id("kc-login"));
		signinButton.click();
		Thread.sleep(2000);
		
		Actions actions = new Actions(driver);
        actions.sendKeys(org.openqa.selenium.Keys.PAGE_DOWN).build().perform();
        Thread.sleep(2000);
        
        WebElement applyButton = driver.findElement(By.className("MuiButton-containedPrimary"));
        applyButton.click();
        Thread.sleep(2000);

        WebElement applyButton2 = driver.findElement(By.className("MuiButton-containedPrimary"));
        applyButton2.click();
        Thread.sleep(2000);

        
    }
}
