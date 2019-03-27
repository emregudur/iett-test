package test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class testIett {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "geckodriver.exe");

		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.iett.istanbul/");
		WebElement link;
		link = driver.findElement(By.className("b-close"));
		link.click();
		
		Thread.sleep(1000);
		driver.findElement(By.partialLinkText("Hat")).click();
		
		Thread.sleep(5000);
		
		//ÝNPUTUN YÜKLENMESÝ ÝÇÝN TIKLANMASI GEREKÝYOR
		driver.findElement(By.id("select2-DetailSelect-container")).click();
		Thread.sleep(2000);
		//ÝNPUTA DEÐER GÖNDERÝLÝYOR
		driver.findElement(By.className("select2-search__field")).sendKeys("500T");
		
		Thread.sleep(1000);
		//AÇILIR MENÜ ELEMANINA TIKLANIYOR
		driver.findElement(By.className("select2-results__option")).click();
		
		Thread.sleep(1000);
		//AÇILAN SAYFADA DURAK DETAYLARI LÝNK AÇILIYOR
		driver.findElement(By.xpath("/html/body/header[2]/div/div/nav/a[2]/span")).click();
		
		
		Thread.sleep(1000);
		//DURAK DETAYINA TIKLANIYOR
		driver.findElement(By.cssSelector("div.DetailTables:nth-child(1) > div:nth-child(1) > ol:nth-child(2) > li:nth-child(19) > div:nth-child(3) > a:nth-child(2)")).click();
		
		Thread.sleep(2000);
		driver.quit();
	
		
		
		
	}
}
