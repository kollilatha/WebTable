package com.webtablebased;

import java.util.LinkedList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WinHandle {
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\admin\\eclipse-workspace\\WebTable\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.amazon.in/");

		WebElement w1 = driver.findElement(By.id("twotabsearchtextbox"));
		w1.sendKeys("iphone", Keys.ENTER);
		WebElement w2 = driver.findElement(By.xpath("(//span[text()='Apple iPhone 11 (64GB) - Black'])[2]"));
		w2.click();

		WebElement w3 = driver.findElement(By.xpath("//span[text()='Apple iPhone 11 (128GB) - Black']"));
		w3.click();

		WebElement w5 = driver.findElement(By.xpath("//span[text()='Apple iPhone 11 (128GB) - Black']"));
		w5.click();
		String x = driver.getWindowHandle();
		System.out.println(x);

		Set<String> x1 = driver.getWindowHandles();
		System.out.println(x1);

		List<String> x2 = new LinkedList<>();
		x2.addAll(x1);
		driver.switchTo().window(x2.get(3));
	}
}
