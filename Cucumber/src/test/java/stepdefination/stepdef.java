package stepdefination;   
import java.util.List;  
import org.openqa.selenium.By;   
import org.openqa.selenium.WebDriver;   
import org.openqa.selenium.WebElement;   
import org.openqa.selenium.firefox.FirefoxDriver;   
import org.openqa.selenium.support.ui.Select;  
import cucumber.annotation.en.Given;   
import cucumber.annotation.en.Then;   
import cucumber.annotation.en.When;   
import cucumber.table.DataTable;  
public class StepDefinition {   
   WebDriver driver = null;  
   @Given("^I am on user registration page$")   
   public void goToFacebook() {   
      //Intiate web browser instance. driver = new FirefoxDriver();  
      driver.navigate().to("https://www.javaTpoint.com/");   
   }   
      
   @When("^I enter valid data on the page$")   
   public void enterData(DataTable table){   
      //Initialize data table   
      List<list> data = table.raw();  
      System.out.println(data.get(1).get(1));   
        
      //Enter data  
      driver.findElement(By.name("firstname")).sendKeys(data.get(1).get(1));  
      driver.findElement(By.name("lastname")).sendKeys(data.get(2).get(1));  
      driver.findElement(By.name("registered_email__")).sendKeys(data.get(3).get(1));       
      driver.findElement(By.name("registered_email_confirmation__")).  
         sendKeys(data.get(4).get(1));   
      driver.findElement(By.name("registered_passwd__")).sendKeys(data.get(5).get(1));   
        
      Select dropdownB = new Select(driver.findElement(By.name("birth_day")));   
      dropdownB.selectByValue("12");   
          
      Select dropdownM = new Select(driver.findElement(By.name("birth_month")));  
      dropdownM.selectByValue("7");   
          
      Select dropdownY = new Select(driver.findElement(By.name("birth_year")));  
      dropdownY.selectByValue("1992");   
          
      driver.findElement(By.className("_59mt")).click();   
      // Click submit button driver.findElement(By.name("websubmit")).click();   
   }   
      
   @Then("^User registration should be successful$")   
   public void User_registration_should_be_successful() {  
      if(driver.getCurrentUrl().equalsIgnoreCase("https://www.javaTpoint.com/")){  
         System.out.println("Test Pass");   
      } else {   
         System.out.println("Test Failed");   
      }   
      driver.close();   
   }   
}