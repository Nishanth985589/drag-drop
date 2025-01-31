package windows.components;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

		public class guvilogin {
		    public static void main(String[] args) {
		    WebDriver driver = new ChromeDriver();
		    try {
		        driver.get("https://www.guvi.in/");     
		        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		        WebElement signUp= driver.findElement(By.xpath("//a[text()='Sign Up']"));
		        signUp.click();
		        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("signup-form")));
		        WebElement name = driver.findElement(By.id("name"));
		        WebElement email = driver.findElement(By.id("email"));
		        WebElement password = driver.findElement(By.id("password"));
		        WebElement confirmPassword = driver.findElement(By.id("confirm-password"));
		        WebElement signupSubmit = driver.findElement(By.id("signup-submit"));
		        name.sendKeys("Test User");
		        email.sendKeys("testuser@example.com");
		        password.sendKeys("TestPassword123");
		        confirmPassword.sendKeys("TestPassword123");
		        signupSubmit.click();
		        wait.until(ExpectedConditions.urlContains("success"));
		        WebElement loginButton = driver.findElement(By.xpath("//a[text()='Login']"));
		        loginButton.click();
		        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("login-form")));
		        WebElement loginEmailField = driver.findElement(By.id("login-email"));
		        WebElement loginPasswordField = driver.findElement(By.id("login-password"));
		        WebElement loginSubmitButton = driver.findElement(By.id("login-submit"));
		        loginEmailField.sendKeys("testuser@example.com");
		        loginPasswordField.sendKeys("TestPassword123");
		        loginSubmitButton.click();
		        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("user-profile")));		            
		        System.out.println("Signup and Login were successful!");
		        } finally {
		            // Close the browser
		            driver.quit();
		        }}}
		 
		