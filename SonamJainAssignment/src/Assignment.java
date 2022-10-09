import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ababhinj\\Downloads\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.demoblaze.com/");

		driver.manage().window().maximize();


		driver.findElement(By.id("signin2")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("sign-username")).sendKeys("sonamjainsjtest2690");
		driver.findElement(By.cssSelector("input[type=password]")).sendKeys("Jain@123");
		driver.findElement(By.xpath("//button[@onclick='register()']")).click();
		
		Thread.sleep(3000);
		String txt = driver.switchTo().alert().getText();
		System.out.println("The text is - " + txt);
		driver.switchTo().alert().accept();


		driver.findElement(By.cssSelector("a[id=login2]")).click();
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("input[id=loginusername]")).sendKeys("sonamjainsjtest2690");
		driver.findElement(By.cssSelector("input[id=loginpassword]")).sendKeys("Jain@123");
		driver.findElement(By.xpath("//button[@onclick='logIn()']")).click();
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("a#logout2")).click();
		Thread.sleep(3000);

		driver.findElement(By.xpath("(//img[contains(@src,'imgs/galaxy_s6.jpg')])[1]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[@onclick='addToCart(1)']")).click();
		Thread.sleep(3000);
		driver.switchTo().alert().accept();

		driver.findElement(By.xpath("//a[@href='index.html']//parent::li")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//img[@src='imgs/Lumia_1520.jpg']")).click();
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("a[onclick='addToCart(2)']")).click();
		Thread.sleep(3000);
		driver.switchTo().alert().accept();

		driver.findElement(By.id("signin2")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("sign-username")).sendKeys("sonamjainsjtest2690");
		driver.findElement(By.cssSelector("input[type=password]")).sendKeys("Jain@123");
		Thread.sleep(3000);
		driver.findElement(By
				.xpath("//button[contains(@onclick,'register')]/preceding-sibling::button[@class='btn btn-secondary']"))
				.click();

		driver.findElement(By.xpath("//a[@href='cart.html']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//a[contains(@onclick,'delete')])[1]")).click();
		driver.findElement(By.xpath("(//a[contains(@onclick,'delete')])[2]")).click();
		Thread.sleep(3000);

		List<WebElement> list = driver.findElements(By.xpath("//a[@href='cart.html']"));
		int itemsCount = list.size();
		System.out.println("Total number of items in the cart is " + itemsCount);
		
		driver.findElement(By.xpath("//a[@href='index.html']//parent::li")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("(//img[contains(@src,'imgs/galaxy_s6.jpg')])[1]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[@onclick='addToCart(1)']")).click();
		Thread.sleep(3000);
		driver.switchTo().alert().accept();
		
		
		driver.findElement(By.xpath("//a[@href='index.html']//parent::li")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//img[@src='imgs/Lumia_1520.jpg']")).click();
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("a[onclick='addToCart(2)']")).click();
		Thread.sleep(3000);
		driver.switchTo().alert().accept();

		driver.findElement(By.xpath("//a[@href='cart.html']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//a[contains(@onclick,'delete')])[1]")).click();



	}
}