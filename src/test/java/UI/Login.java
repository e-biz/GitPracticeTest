package UI;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import io.github.bonigarcia.wdm.WebDriverManager;
public class Login {
	
	
	public static void main(String[] args) throws InterruptedException {
	// TODO Auto-generated method stub
	WebDriverManager.chromedriver().setup();
	ChromeDriver driver = new  ChromeDriver ();
//	driver.get("https://qatxo.e-bizsoft.net/Login.aspx");
//	driver.manage().window().maximize();
//	driver.manage().window().maximize();
//	driver.findElement(By.id("txtUserName")).sendKeys("txotest01@gmail.com");
//	driver.findElement(By.id("txtPWD")).sendKeys("Aa1234567");
//	driver.findElement(By.xpath("//input[@id ='Img_Login']")).click();
//	Thread.sleep(2000);
//	Select select= new Select(driver.findElement(By.id("ddlMultiCompany")));
//	select.selectByValue("openedge Test 03");
//	driver.findElement(By.xpath("//div//input[@id= 'Img_Login']")).click();
	
	driver.get("https://qatxo.e-bizsoft.net/Login.aspx");
	driver.findElement(By.id("txtUserName")).sendKeys("txotest01@gmail.com");
	driver.findElement(By.id("txtPWD")).sendKeys("Aa1234567");
	driver.findElement(By.xpath("//input[@id ='Img_Login']")).click();
	Thread.sleep(2000); 
	WebElement Ab = driver.findElement(By.id("ddlMultiCompany"));
	Select aa = new Select(Ab);
	aa.selectByValue("openedge Test 04");
	driver.findElement(By.xpath("//div//input[@id= 'Img_Login']")).click();
	Thread.sleep(35000); 
//	driver.findElement(By.id("menu")).click();
	driver.findElement(By.id("btn_NeWReq_New_UI")).click();
	Thread.sleep(2000);
	driver.findElement(By.id("menu")).click();
}
}
