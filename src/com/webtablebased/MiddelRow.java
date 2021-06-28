package com.webtablebased;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MiddelRow {
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\admin\\eclipse-workspace\\WebTable\\driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/html/html_tables.asp");

		List<WebElement> table = driver.findElements(By.xpath("//table"));
		WebElement tables = table.get(3);

		List<WebElement> trow = tables.findElements(By.tagName("tr"));
		int i = trow.size();
		int rowno = 0;
		if (i % 2 == 0) {
			rowno = (i / 2) - 1;
		} else {
			rowno = i / 2;
		}
		WebElement trows = trow.get(rowno);

		List<WebElement> tdata = trows.findElements(By.tagName("td"));

		int j = tdata.size();
		int colno = 0;
		if (j % 2 == 0) {
			colno = (j / 2) - 1;
		} else {
			colno = j / 2;
		}

		WebElement middelno = tdata.get(colno);
		String text = middelno.getText();
		System.out.println(text);
	}
}
