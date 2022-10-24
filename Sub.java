package Project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Sub {

	WebDriver driver;
	
	Sub (WebDriver driver) {
		this.driver=driver;
	}
	
	//Home Button
	WebElement homeBtn() {
		return driver.findElement(By.cssSelector("[href='home.html']"));
	}
	
	//New York Button
	WebElement branch1Btn() {
		return driver.findElement(By.cssSelector("[value='New York']"));
	}
	
	//New Delhi Button
	WebElement branch2Btn() {
		return driver.findElement(By.cssSelector("[value='New Delhi']"));
	}
	
	//California Button
	WebElement branch3Btn() {
		return driver.findElement(By.cssSelector("[value='California']"));
	}
	
	//Reset Image Button
	WebElement resetBranchBtn() {
		return driver.findElement(By.cssSelector("[value='Reset']"));
	}
	
	//Categories Button
	WebElement categoriesBtn() {
		return driver.findElement(By.cssSelector("[href='categories.html']"));
	}
	
	//Contact Us Button
	WebElement contactUsBtn() {
		return driver.findElement(By.cssSelector("[href='contactus.html']"));
	}
	
	//First Name Bracket In Contact Us Page
	WebElement firstName() {
		return driver.findElement(By.cssSelector("[placeholder='Your name..']"));
	}
	
	//Last Name Bracket In Contact Us Page
	WebElement lastName() {
		return driver.findElement(By.cssSelector("[placeholder='Your last name..']"));
	}
	
	//Country Dropdown Menu In Contact Us Page
	WebElement country() {
		return driver.findElement(By.id("country"));
	}
	
	//Subject Bracket In Contact Us Page
	WebElement subject() {
		return driver.findElement(By.id("subject"));
	}
	
	//Male Radio Button Option In Contact Us Page
	WebElement radioBtnM() {
		return driver.findElement(By.cssSelector("[value='male']"));
	}
	
	//Female Radio Button Option In Contact Us Page
	WebElement radioBtnF() {
		return driver.findElement(By.cssSelector("[value='female']"));
	}
	
	//Newsletter Checkbox In Contact Us Page
	WebElement newsletterCheckbox() {
		return driver.findElement(By.name("newsletter"));
	}
	
	//Business Advisor Checkbox In Contact Us Page
	WebElement advisorCheckbox() {
		return driver.findElement(By.name("advisor"));
	}
	
	//Submit Form Button In Contact Us Page
	WebElement submitBtn() {
		return driver.findElement(By.cssSelector("[value='Submit']"));
	}
	
	//Reset Form Button In Contact Us Page
	WebElement resetBtn() {
		return driver.findElement(By.cssSelector("[value='Reset']"));
	}
	
	//Upper Right Text
	WebElement brand() {
		return driver.findElement(By.id("brand"));
	}				
}
