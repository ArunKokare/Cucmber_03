package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.*;

public class TestImplementation {
	
	WebDriver driver;
	
	@Given("user should navigate on homepage")
	public void user_should_navigate_on_homepage() {
	        System.out.println("User is on homepage");
	        driver = new ChromeDriver();
	        driver.get("https://demoblaze.com/index.html#");
	        driver.manage().window().maximize();    
	}

    @When("user clicks on login link and enter username and enter password and click on login button")
    public void user_clicks_on_login_link_and_enter_username_and_enter_password_and_click_on_login_button() throws InterruptedException {
    	 System.out.println("User enter username and password and clicked on login button");
    	 
    	 driver.findElement(By.xpath("//a[@id='login2']")).click();
    	 Thread.sleep(4000);
    	 driver.findElement(By.xpath("//input[@id='loginusername']")).sendKeys("testacc3");
    	 driver.findElement(By.xpath("//input[@id='loginpassword']")).sendKeys("test");
    	 driver.findElement(By.xpath("//button[contains(text(),'Log in')]")).click(); 
    }

    @Then("user logged in application")
    public void user_logged_in_application() throws InterruptedException {
    	 System.out.println("User is logged in");
    	 Thread.sleep(4000);
    	 String status = driver.findElement(By.xpath("//a[@id='nameofuser']")).getText();
    	 Assert.assertEquals(status, "Welcome testacc3");
    }
    
    //----------------------------------------------------
    @When("user clicks on phones")
    public void user_clicks_on_phones() throws InterruptedException  {
       driver.findElement(By.xpath("//a[contains(text(),'Phones')]")).click();
       Thread.sleep(5000);
    }
    @When("click on Samsung galaxy s6")
    public void click_on_samsung_galaxy_s6() {
    	driver.findElement(By.xpath("//a[contains(text(),'Samsung galaxy s6')]")).click();
    }
    
    @When("click on Nokia lumia1520")
    public void click_on_nokia_lumia1520() {
    	driver.findElement(By.xpath("//a[contains(text(),'Nokia lumia 1520')]")).click();
    }
    
    @When("click on Nexus6")
    public void click_on_nexus6() {
    	driver.findElement(By.xpath("//a[contains(text(),'Nexus 6')]")).click();
    }
    
    //------------------------------------------------------------
    @When("click on Add to cart")
    public void click_on_add_to_cart() throws InterruptedException  {
    	Thread.sleep(5000);
    	driver.findElement(By.xpath("//a[contains(text(),'Add to cart')]")).click();
    }
    @Then("it shows Product added text on popup")
    public void it_shows_product_added_text_on_popup() throws InterruptedException {
    	Thread.sleep(5000);
    	String status = driver.switchTo().alert().getText();
    	Thread.sleep(5000);
    	Assert.assertEquals(status, "Product added");
    }
    @Then("click on OK on popup")
    public void click_on_ok_on_popup() {
        driver.switchTo().alert().accept();
    }
    
    //-------------------------------------------------------------------
    @When("user clicks on login link")
    public void user_clicks_on_login_link()  {
    	 driver.findElement(By.xpath("//a[@id='login2']")).click();
    	 
    }
    @When("enter username as {string} and enter password as {string}")
    public void enter_username_as_and_enter_password_as(String username, String password) {
    	driver.findElement(By.xpath("//input[@id='loginusername']")).sendKeys(username);
   	 	driver.findElement(By.xpath("//input[@id='loginpassword']")).sendKeys(password);
    }
    @When("click on login button")
    public void click_on_login_button() {
    	 driver.findElement(By.xpath("//button[contains(text(),'Log in')]")).click(); 
    }

    @Then("user logged in application and showing {string}")
    public void user_logged_in_application_and_showing(String status1) throws InterruptedException {
    	 System.out.println("User is logged in");
    	 Thread.sleep(5000);
    	 String status = driver.findElement(By.xpath("//a[@id='nameofuser']")).getText();
    	 Thread.sleep(5000);
    	 Assert.assertEquals(status, status1);
    }
    
    //-------------------------------------------------------------------
    @When("enter username {string} and enter password {string}")
    public void enter_username_and_enter_password(String username, String password) {
    	driver.findElement(By.xpath("//input[@id='loginusername']")).sendKeys(username);
   	 	driver.findElement(By.xpath("//input[@id='loginpassword']")).sendKeys(password);
    }
    @Then("user logged in application & showing {string}")
    public void user_logged_in_application_showing(String status2) throws InterruptedException   {
    	System.out.println("User is logged in");
	   	 Thread.sleep(6000);
	   	 String status = driver.findElement(By.xpath("//a[@id='nameofuser']")).getText();
	   	 Thread.sleep(3000);
	   	 Assert.assertEquals(status, status2);
    }
    
	

}
