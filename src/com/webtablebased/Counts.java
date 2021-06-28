package com.webtablebased;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Counts {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\admin\\eclipse-workspace\\WebTable\\driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/html/html_tables.asp");

		List<WebElement> table = driver.findElements(By.xpath("//table"));
		WebElement data = table.get(3);
		List<WebElement> trow = data.findElements(By.tagName("tr"));
		for (int i = 0; i < trow.size(); i++) {
			WebElement trows = trow.get(i);
			List<WebElement> tdata = trows.findElements(By.tagName("td"));

			for (int j = 0; j < tdata.size(); j++) {
				WebElement tdatas = tdata.get(j);
				String text = tdatas.getText();
				if (text.equals("Germany")) {
					System.out.println(text);
					System.out.println("row" + (i + 1));
					System.out.println("colum" + (j + 1));
				}
			}
		}

	}

}
