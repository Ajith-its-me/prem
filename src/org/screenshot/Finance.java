package org.screenshot;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Finance {
public static void main(String[] args) throws InterruptedException, IOException {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\mathi\\eclipse-workspace\\Screenshot\\Driver\\chromedriver.exe");
    WebDriver driver=new ChromeDriver();
    driver.get("https://www.moneycontrol.com/markets/fno-market-snapshot");
    WebElement screenshot = driver.findElement(By.xpath("(//div[@class='leftD'])[2]"));
    
	
    //type cast
//    TakesScreenshot t = (TakesScreenshot) driver;
    Thread.sleep(15000);
    File s=screenshot.getScreenshotAs(OutputType.FILE);
    Thread.sleep(2000);
    File d=new File("D:\\Snapshot\\screencapture.png");
    FileUtils.copyFile(s, d);
    
	
	
	
	
}
}