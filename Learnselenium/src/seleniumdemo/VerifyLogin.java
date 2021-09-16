package seleniumdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyLogin {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\seleniumsoftware\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com/login");
		driver.manage().window().maximize();
		String expectedtitle= "Demo Web Shop. Login";
		String actualtitle= driver.getTitle();
		System.out.println(actualtitle);
		
		if(expectedtitle.equals(actualtitle))
		{
			System.out.println("you are on correct page");
		driver.findElement(By.id("Email")).sendKeys("bekiran1998@gmail.com");
		driver.findElement(By.name("Password")).sendKeys("kiran@123");
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
		driver.findElement(By.linkText("Log out")).click();
		driver.close();
	}
		else
		{
			System.out.println("you are on wrong page");
			driver.close();
		}
}
}
