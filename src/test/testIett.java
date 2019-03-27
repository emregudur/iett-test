package test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class testIett {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "geckodriver.exe");

		//Now you can Initialize marionette driver to launch firefox
		DesiredCapabilities capabilities = DesiredCapabilities.firefox();
		capabilities.setCapability("marionette", true);
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.iett.istanbul/");
		WebElement link;
		link = driver.findElement(By.className("b-close"));
		link.click();
		
		Thread.sleep(1000);
		driver.findElement(By.partialLinkText("Hat")).click();
	}
}
