import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "/Users/Shakk/Documents/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.id("inputUsername")).sendKeys("Shakkila");
		driver.findElement(By.name("inputPassword")).sendKeys("P@ssw0rd1");
		driver.findElement(By.className("signInBtn")).click();
		System.out.println(driver.findElement(By.cssSelector("p.error")).getText());
		driver.findElement(By.linkText("Forgot your password?")).click();
		
		driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("Shakkila");
		driver.findElement(By.cssSelector("input[placeholder*='Email']")).sendKeys("john@rsa.com");
		driver.findElement(By.xpath("//input[@type='text'][2]")).clear();
		driver.findElement(By.cssSelector("input[type$='text' i]:nth-child(3)")).sendKeys("john@gmail.com");
		driver.findElement(By.xpath("//form/input[3]")).sendKeys("9715093333");
		driver.findElement(By.xpath("//button[@class=\"go-to-login-btn\"]")).click();
		//System.out.println(driver.findElement(By.cssSelector("form p")).getText());
		driver.findElement(By.id("inputUsername")).sendKeys("Shakkila");
		driver.findElement(By.name("inputPassword")).sendKeys("rahulshettyacademy");
		driver.findElement(By.className("signInBtn")).click();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		//driver.get("https://staging-login.cargoes.com/auth/realms/dtworld/protocol/openid-connect/auth?client_id=EU&redirect_uri=https://euuat-community.cargoes.com/login&response_type=code&state=nYI6oL");
		//driver.findElement(By.id("username")).sendKeys("eu.msadmin");
		//driver.findElement(By.name("password")).sendKeys("P@ssw0rd1");
		//driver.findElement(By.xpath("//*[@id='kc-login']".click();
		//driver.findElement(By.id("kc-login")).click();
		//System.out.println(driver.findElement(By.cssSelector(".kc-feedback-text")).getText());
		//driver.findElement(By.linkText("Forgot Username/Password?")).click();
		//driver.findElement(By.xpath("//div[@id='mat-input-0']")).sendKeys("medips.cns@mailinator.com");
		//driver.wait(2000);
		//driver.findElement(By.cssSelector("input[id='mat-input-0']")).sendKeys("medips.cns@mailinator.com");
		
		
		
		
		
		
		
		
		
	}

	

}
