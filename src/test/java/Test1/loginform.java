package Test1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class loginform {

	WebDriver driver;
	
	@Given("user opens chrome and enters url")
	public void user_opens_chrome_and_enters_url() {
	    // Write code here that turns the phrase above into concrete actions
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\prave\\OneDrive\\Documents\\selenium grid\\chromedriver.exe");
		
	    driver = new ChromeDriver();
	    driver.get("https://v1.training-support.net/selenium/login-form");
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@When("user enters username")
	public void user_enters_username() {
	    // Write code here that turns the phrase above into concrete actions
	   driver.findElement(By.id("username")).sendKeys("admin");
	}

	@When("user enters password")
	public void user_enters_password() {
	    // Write code here that turns the phrase above into concrete actions
	    driver.findElement(By.id("password")).sendKeys("password");
	}

	@When("user clicks on login")
	public void user_clicks_on_login() {
	    // Write code here that turns the phrase above into concrete actions
	    driver.findElement(By.xpath("//button[@class='ui button']")).click();
	}

	@Then("Welcome back message is displayed")
	public void welcome_back_message_is_displayed() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
	 
		System.out.println("Login is successful ");
		
		Thread.sleep(3000);
		driver.close();
	}
	
}
