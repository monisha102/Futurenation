package ui;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Futurenation {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.edge.driver", "C:\\BrowserDrivers\\msedgedriver");
		WebDriverManager.edgedriver().setup();
		

		EdgeDriver driver = new EdgeDriver();
		driver.get("https://platform.futurenation.gov.bd/");
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		WebElement signUpButton = driver.findElement(By.className("MuiButton-containedPrimary"));
		signUpButton.click();
		Thread.sleep(2000);
		 
		WebElement email = driver.findElement(By.id(":r0:"));
		email.sendKeys("bcausebd01@gmail.com");
		Thread.sleep(2000);
		 
		WebElement passwordInput = driver.findElement(By.id(":r1:"));
		WebElement visibilityToggle = driver.findElement(By.className("MuiIconButton-root"));
		visibilityToggle.click();
		Thread.sleep(1000);
		passwordInput.sendKeys("Bcausebd01");
		
		WebElement passwordInput2 = driver.findElement(By.id(":r2:"));
		WebElement visibilityToggle2 = driver.findElement(By.className("MuiIconButton-root"));
		visibilityToggle2.click();
		Thread.sleep(1000);
		passwordInput2.sendKeys("Bcausebd01");

		
		WebElement getStartedButton = driver.findElement(By.className("MuiButton-containedPrimary"));
		getStartedButton.click();
		Thread.sleep(2000);
		 
	}

}
