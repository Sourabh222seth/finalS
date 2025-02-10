package sProject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import java.time.Duration;
public class sClass {  
  
    public static void main(String[] args) {  
    	
    	  String expectedUrl = "https://dev.privatewealthsystems.com/auth/login";
      
           // System Property for Chrome Driver   
        System.setProperty("webdriver.chrome.driver", "/Users/sourabh.seth/Downloads/chromedriver/chromedriver");  
          
             // ChromeDriver class.  
        
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        WebDriver driver = new ChromeDriver(options);
       // WebDriver driver=new ChromeDriver();  
          
           // Launch Website  
          driver.navigate().to(expectedUrl);  
          
         //Maximize the browser  
          driver.manage().window().maximize();  
          driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));   
          driver.get(expectedUrl);

          // Get the title of the page
          String pageTitle = driver.getTitle();
          System.out.println("Page Title: " + pageTitle);
               
        String actualUrl = driver.getCurrentUrl();
        System.out.println("Actual URL: " + actualUrl);

        // Verify if the expected URL and actual URL match
        Assert.assertEquals(actualUrl, expectedUrl, "The actual URL does not match the expected URL!");
        System.out.println("Url match successfully");
        
        driver.close();
  
    }  
  
}  