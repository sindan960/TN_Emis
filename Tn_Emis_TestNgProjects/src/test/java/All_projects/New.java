package All_projects;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class New {

	private WebDriver driver;

	@BeforeMethod
	public void setUp() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Admin\\eclipse-workspace\\Tn_Emis_Projects\\chromedriver-win64\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://d16j7f8mrd9efq.cloudfront.net/auth/login");
	}

	@Test(priority = 1)
	public void testLogin() {
		driver.findElement(By
				.xpath("/html/body/app-root/app-auth/app-login/div/div[1]/div[2]/div/div/div[2]/div/form/div[1]/input"))
				.sendKeys("33020700907");
		driver.findElement(By.xpath("//*[@id=\"exampleInputPassword1\"]")).sendKeys("Reset@123");
		driver.findElement(By.xpath(
				"/html/body/app-root/app-auth/app-login/div/div[1]/div[2]/div/div/div[2]/div/form/div[3]/button[1]"))
				.click();
	}

	@Test(priority = 2)
	public void formFiling() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"printPageButton\"]/nav[2]/div/ul/li[3]/a")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"printPageButton\"]/nav[2]/div/ul/li[3]/div/div/div[4]/ul/li[9]/a"))
				.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//span[@class='p-radiobutton-icon'])[1]")).click();
		Thread.sleep(1000);
		driver.findElement(By
				.xpath("(//input[@class='p-inputtext p-component p-element ng-untouched ng-pristine ng-invalid'])[1]"))
				.sendKeys("10016209");
		Thread.sleep(1000);
		driver.findElement(By.xpath(
				"/html/body/app-root/app-base/div/div/div/div/app-school/app-disaster-management/div[2]/form/div/div[1]/div[2]/div[2]/div/button"))
				.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath(
				"/html/body/app-root/app-base/div/div/div/div/app-school/app-disaster-management/div[2]/form/div/div[1]/div[2]/div[3]/div[1]/input"))
				.sendKeys("1011934275");
		Thread.sleep(1000);
		driver.findElement(By.xpath(
				"/html/body/app-root/app-base/div/div/div/div/app-school/app-disaster-management/div[2]/form/div/div[1]/div[2]/div[3]/div/input"))
				.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("")).click();
	}
}
