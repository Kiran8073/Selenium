package seleniumdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Registermodule {

	public static void main(String[] args) {
			System.setProperty("webdriver.chrome.driver", "C:\\seleniumsoftware\\chromedriver_win32\\chromedriver.exe");
			WebDriver driver= new ChromeDriver();
			driver.get("http://demowebshop.tricentis.com");
			driver.manage().window().maximize();
			
			driver.findElement(By.linkText("Register")).click();
			driver.findElement(By.id("gender-male")).click();
			driver.findElement(By.name("FirstName")).sendKeys("Kiran");
			driver.findElement(By.name("LastName")).sendKeys("Kumar");
			driver.findElement(By.id("Email")).sendKeys("bkirean7406@gmail.com");
			driver.findElement(By.id("Password")).sendKeys("kiran@123");
			driver.findElement(By.id("ConfirmPassword")).sendKeys("kiran@123");
			driver.findElement(By.xpath("//input[@value='Register']")).click();
			
			

	}

}
