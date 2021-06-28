package com.webtablebased;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\admin\\eclipse-workspace\\WebTable\\driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/html/html_tables.asp");

		List<WebElement> table = driver.findElements(By.xpath("//table"));
		WebElement webelements = table.get(3);
		List<WebElement> trow = webelements.findElements(By.tagName("tr"));
		for (WebElement webElement : trow) {
			List<WebElement> tdatas = webElement.findElements(By.tagName("td"));

			for (WebElement webElement2 : tdatas) {
				String hihilited = webElement2.getAttribute("is-highlighted");
				if (hihilited.equals("true")) {
					String text = webElement2.getText();
					System.out.println(text);
				}

			}
		}
	}

}