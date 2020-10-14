package com.shoaib.testng;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AssertConcept {
	WebDriver driver;

	@BeforeMethod
	public void setUp() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://www.google.com");
	}

	@Test(priority = 2, groups = "Title")
	public void googleTitleTest() {
		String title = driver.getTitle();
		System.out.println("Title of Page is  " + title);
		Assert.assertEquals(title, "Google");
	}

	@Test(priority = 1, groups = "Logo")
	public void googleLogoTest() {
		boolean a = driver.findElement(By.xpath("//*[@id='hplogo']")).isDisplayed();
		Assert.assertTrue(a);
		// Assert.assertEquals(a, true);
		// True=True condition pass
	}

}
