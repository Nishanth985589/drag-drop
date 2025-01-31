package windows.components;

import java.util.List;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.WebElement;
import java.time.Duration;


	public class date {
	    public static void main(String[] args) {
	        // Set up the WebDriver (use the path to your ChromeDriver)
	        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");
	        WebDriver driver = new ChromeDriver();
	        
	        try {     
	            driver.get("https://jqueryui.com/datepicker/");    
	            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	            wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.cssSelector(".demo-frame")));            
	            WebElement datePickerInput = driver.findElement(By.id("datepicker"));
	            datePickerInput.click();           
	            WebElement nextButton = driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']"));
	            nextButton.click();
	            WebElement date22 = driver.findElement(By.xpath("//a[text()='22']"));
	            date22.click();
	            String selectedDate = datePickerInput.getAttribute("value");
	            System.out.println("Selected Date: " + selectedDate);
	        } finally {
	            // Close the browser
	            driver.quit();
	        }}}
		
	   	
	
