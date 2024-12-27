package package1;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Openlinksinnewtabandgetthetitle {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		
		System.out.println("All Links on page: " + driver.findElements(By.xpath("//a")).size());
		
		WebElement footerlinks = driver.findElement(By.xpath("//div[@id='gf-BIG']"));
		
		System.out.println("Links on Footer: " + footerlinks.findElements(By.tagName("a")).size());
		
		WebElement columnlinks = driver.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
		
		int columnlinkscount= columnlinks.findElements(By.tagName("a")).size();
		
		System.out.println("Links in Column 1: "+columnlinkscount);
		
		
		for(int i=0;i<columnlinkscount;i++)
		{
			columnlinks.findElements(By.tagName("a")).get(i).sendKeys(Keys.chord(Keys.CONTROL, Keys.ENTER));
			Thread.sleep(Duration.ofSeconds(5));
		}
				
		Set<String> winh = driver.getWindowHandles();
		
		Iterator<String> it = winh.iterator();
		
		while(it.hasNext())
		{
			driver.switchTo().window(it.next());
			System.out.println(driver.getTitle());
			//Thread.sleep(Duration.ofSeconds(5));
		}
		
		/*
		for(int i=columnlinkscount-1;i>=0;i--)
		{
			String win = it.next();
			driver.switchTo().window(win);
			System.out.println(driver.getTitle());
			
		}
		*/
		
		driver.quit();
	}

}
