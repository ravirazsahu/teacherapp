package com.teacher;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.springframework.boot.test.context.SpringBootTest;
import org.testng.Assert;

class TeacherappApplicationTests {
public static void main(String[] args) {
	contextLoads();
}
	private static void contextLoads() {
		System.out.println("Testing url");
		 System.setProperty("webdriver.chrome.driver", "D:\\eclipse projects\\Project");
		 WebDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("https://www.browserstack.com/users/sign_in");
		 WebElement username=driver.findElement(By.id("user_email_Login"));
		 WebElement password=driver.findElement(By.id("user_password"));
		 WebElement login=driver.findElement(By.name("commit"));
		 username.sendKeys("abc@gmail.com");
		 password.sendKeys("your_password");
		 login.click();
		 String actualUrl="https://live.browserstack.com/dashboard";
		 String expectedUrl= driver.getCurrentUrl();
		 Assert.assertEquals(expectedUrl,actualUrl);
}

}
