import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.edge.EdgeDriver;

//import org.openqa.selenium.firefox.FirefoxDriver;

public class Newclass {

	public static void main(String[] args) {

//Invoking Browser

//Chrome - ChromeDriver exten->Methods close get

//Firefox- FirefoxDriver ->methods close get

// WebDriver  close  get

//WebDriver methods + class methods

// Chrome

		// ChromeOptions options = new ChromeOptions();

		// options.addArguments("--remote-allow-origins=*");

		System.setProperty("webdriver.chrome.driver", "/Users/Shakk/Documents/chromedriver.exe");

		WebDriver driver = new ChromeDriver();

//Firefox

//System.setProperty("webdriver.gecko.driver", "/Users/rahulshetty/Documents/geckodriver");

//WebDriver driver1 = new FirefoxDriver();

//Microsoft Edge

		System.setProperty("webdriver.edge.driver", "/Users/Shakk/Documents/edgedriver_win64/msedgedriver.exe");

		WebDriver driver2 = new EdgeDriver();

		driver2.get(
				"https://dev-login.cargoes.com/auth/realms/dtworld/protocol/openid-connect/auth?client_id=EU&redirect_uri=https://eudev-community.cargoes.com/login&response_type=code&state=U8fzeF");

		System.out.println(driver.getTitle());

		System.out.println(driver.getCurrentUrl());

		driver2.close();

//driver.quit();

	}

}
