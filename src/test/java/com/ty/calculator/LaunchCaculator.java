package com.ty.calculator;

import java.net.URL;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;

public class LaunchCaculator {
	
	
	@Test
	public void lanchBrowser() throws Throwable {
		
		// File f = new File("C:\\Users\\Subhas bhosale\\AppData\\Roaming\\npm\\node_modules\\appium\\build\\lib\\main.js");
		// AppiumDriverLocalService service = new AppiumServiceBuilder().withAppiumJS(f).withIPAddress("127.0.0.1").usingPort(4723).withTimeout(Duration.ofSeconds(3000)).build();
		// service.start();

		DesiredCapabilities dc = new DesiredCapabilities();
        dc.setCapability("platformName", "Android");
        dc.setCapability("automationName", "UiAutomator2");
        dc.setCapability("udid", "RZCW60CR8VE");
        dc.setCapability("appPackage", "com.google.android.calculator");
        dc.setCapability("appActivity", "com.android.calculator2.Calculator");

		URL u = new URL("http://localhost:4723/wd/hub");
		AndroidDriver driver = new AndroidDriver(u, dc);
		// driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(AppiumBy.accessibilityId("1")).click();
		driver.findElement(AppiumBy.accessibilityId("plus")).click();
		driver.findElement(AppiumBy.accessibilityId("2")).click();
		driver.findElement(AppiumBy.accessibilityId("equals")).click();
		WebElement Additionresult = driver.findElement(AppiumBy.id("com.google.android.calculator:id/result_final"));
		driver.findElement(AppiumBy.accessibilityId("1")).click();
		driver.findElement(AppiumBy.accessibilityId("multiply")).click();
		driver.findElement(AppiumBy.accessibilityId("2")).click();
		driver.findElement(AppiumBy.accessibilityId("equals")).click();
		WebElement Multiplicationresult = driver.findElement(AppiumBy.id("com.google.android.calculator:id/result_final"));
		driver.findElement(AppiumBy.accessibilityId("10")).click();
		driver.findElement(AppiumBy.accessibilityId("divide")).click();
		driver.findElement(AppiumBy.accessibilityId("2")).click();
		driver.findElement(AppiumBy.accessibilityId("equals")).click();
		WebElement divisionresult = driver.findElement(AppiumBy.id("com.google.android.calculator:id/result_final"));
		driver.findElement(AppiumBy.accessibilityId("10")).click();
		driver.findElement(AppiumBy.accessibilityId("minus")).click();
		driver.findElement(AppiumBy.accessibilityId("2")).click();
		driver.findElement(AppiumBy.accessibilityId("equals")).click();
		WebElement substractionresult = driver.findElement(AppiumBy.id("com.google.android.calculator:id/result_final"));

		}
		
		
	}

