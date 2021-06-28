package com.webtablebased;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoTask {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\admin\\eclipse-workspace\\WebTable\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		driver.manage().window().maximize();
		WebElement t = driver.findElement(By.xpath("//table[@id='customers']"));

		List<WebElement> td = t.findElements(By.tagName("tbody"));

		for (int i = 0; i < td.size(); i++) {
			WebElement tds = td.get(i);
			String text = tds.getText();
			System.out.println(text);
		}
	}

}
