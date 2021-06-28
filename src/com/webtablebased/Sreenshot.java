package com.webtablebased;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class Sreenshot {
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\admin\\eclipse-workspace\\WebTable\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.navigate().to("http://demo.automationtesting.in/Register.html");
		driver.manage().window().maximize();
		Wait w = new FluentWait(driver).withTimeout(10, TimeUnit.SECONDS).pollingEvery(10, TimeUnit.SECONDS)
				.ignoring(Exception.class);
		WebElement e = driver.findElement(By.xpath("//input[@type='text']"));
		e.sendKeys("latha");

	}
}
