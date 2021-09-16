package seleniumdemo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

class Countlinks {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\seleniumsoftware\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com/login");
		driver.manage().window().maximize();
			      List<WebElement> links = driver.findElements(By.linkText("a"));
			      System.out.println("The number of links is " + links.size());
			      driver.close();
			   }
			
	}


