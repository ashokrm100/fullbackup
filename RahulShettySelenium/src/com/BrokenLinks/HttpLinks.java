package com.BrokenLinks;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HttpLinks {
	public static void main(String args[]) throws IOException, IOException {
		System.setProperty("webdriver.chrome.driver", "E:\\CHROMEDRIVER\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://qaclickacademy.com/practice.php");
		List<WebElement> links=driver.findElements(By.tagName("a"));
		System.out.println(links.size());
		//List<WebElement> links = driver.findElements(By.cssSelector("table.gf-t tr td:nth-child(2) a"));
		/*for (int i=0; i<links.size();i++)
		{
			System.out.println(links.get(i).getAttribute("href"));
		}*/
	
		// System.out.println(url);
		for (WebElement link : links) {
			System.out.println(links.size());
			String url=link.getAttribute("href");
			System.out.println(url);
			//System.out.println(url);
			HttpURLConnection conn = (HttpURLConnection) new URL(url).openConnection();
			conn.setRequestMethod("HEAD");
			conn.connect();
			int codes=conn.getResponseCode();
			if(codes>400)
			{
				System.out.println("Print webpage not found");
				System.out.println(url);
			}
		}
	}

}
