package Project;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Main {

	public static void main(String[] args) throws Exception {
		
//Accessing the HTML file.
		System.setProperty("webdriver.chrome.driver", "C:\\eclipse\\selenium\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();

		driver.manage().window().maximize();
		
		driver.navigate().to("D://QA//JAVA//AutomationProject//HTML//home.html");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		Sub sub=new Sub(driver);
		
//Confirms The URL That Starts The Automation Process
	String actualURLhom=driver.getCurrentUrl();
	String expectedURLhom=("file:///D://QA//JAVA//AutomationProject//HTML//home.html");
	
	if (actualURLhom.equals(expectedURLhom))
		System.out.println("Test 1 passed. The correct page is shown as default.");
	else
		System.out.println("Test 1 failed. The incorrect page is shown as default: "+actualURLhom);

		Thread.sleep(500);
		
//Confirms The Correct Image Is Shown In The Home Page
//New York button.
	sub.branch1Btn().click();
		
	if (driver.findElement(By.cssSelector("[src='images/Branch1.jpg']")).isDisplayed())
		System.out.println("Test 2 passed. The correct image is shown.");
	else
		System.out.println("Test 2 failed. The incorrect image is shown.");
	
		Thread.sleep(500);
		
//New Delhi button.
	sub.branch2Btn().click();

	if (driver.findElement(By.cssSelector("[src='images/Branch2.jpg']")).isDisplayed())
		System.out.println("Test 3 passed. The correct image is shown.");
	else
		System.out.println("Test 3 failed. The incorrect image is shown.");
	
		Thread.sleep(500);
		
//California button.
	sub.branch3Btn().click();
		
	if (driver.findElement(By.cssSelector("[src='images/Branch3.jpg']")).isDisplayed())
		System.out.println("Test 4 passed. The correct image is shown.");
	else
		System.out.println("Test 4 failed. The incorrect image is shown.");
	
		Thread.sleep(1000);
		
//Reset branch image button.
	sub.resetBranchBtn().click();

	if (driver.findElement(By.cssSelector("[src='images/ElectronicStore.jpg']")).isDisplayed())
		System.out.println("Test 5 passed. The correct image is shown.");
	else
		System.out.println("Test 5 failed. The incorrect image is shown.");
	
		Thread.sleep(500);
		
//Moves to the "Categories" page and confirms the URL.
	sub.categoriesBtn().click();
		
	String actualURLcat=driver.getCurrentUrl();
	String expectedURLcat=("file:///D://QA//JAVA//AutomationProject//HTML//categories.html");
	
	if (actualURLcat.equals(expectedURLcat))
		System.out.println("Test 6 passed. The correct page is shown.");
	else
		System.out.println("Test 6 failed. The incorrect page is shown: "+actualURLcat);
	
		Thread.sleep(500);
		
//Moves to the "Contact Us" page and confirms the URL.
	sub.contactUsBtn().click();
		
	String actualURLcon=driver.getCurrentUrl();
	String expectedURLcon=("file:///D://QA//JAVA//AutomationProject//HTML//contactus.html");
		
	if (actualURLcon.equals(expectedURLcon))
		System.out.println("Test 7 passed. The correct page is shown.");
	else
		System.out.println("Test 7 failed. The incorrect page is shown: "+actualURLcon);
	
		Thread.sleep(500);
		
//Confirms the default options on form part of the page.
//First name placeholder.
	String firstNameText=sub.firstName().getAttribute("placeholder");
	
	if (firstNameText.equals("Your name.."))
		System.out.println("Test 8 passed. The correct text is shown as default.");
	else
		System.out.println("Test 8 failed. The incorrect text is shown as default: "+firstNameText);
	
//Last name placeholder.
	String lastNameText=sub.lastName().getAttribute("placeholder");
	
	if (lastNameText.equals("Your last name.."))
		System.out.println("Test 9 passed. The correct text is shown as default.");
	else
		System.out.println("Test 9 failed. The incorrect text is shown as default: "+lastNameText);

//Country placeholder.
	String countryText=driver.findElement(By.xpath("//select[@id='country']/option[1]")).getText();
	
	if (countryText.equals("Select a Country"))
		System.out.println("Test 10 passed. The correct text is shown as default.");
	else
		System.out.println("Test 10 failed. The wrong text is shown as default: "+countryText);

//Subject placeholder.
	String subjectText=sub.subject().getAttribute("placeholder");
	
	if (subjectText.equals("Write here.."))
		System.out.println("Test 11 passed. The correct text is shown as default.");
	else
		System.out.println("Test 11 failed. The wrong text is shown as default: "+subjectText);

//Radio button default option.
	boolean	radioBtnM=sub.radioBtnM().isSelected(); 
	
	if (radioBtnM)
		System.out.println("Test 12 passed. The correct radio button is shown as default.");
	else
		System.out.println("Test 12 failed. The incorrect radio button is shown as defalt.");

//Female option for radio button is not the default option.
	boolean	radioBtnF=sub.radioBtnF().isSelected(); 
	
	if (!radioBtnF)
		System.out.println("Test 13 passed. The specified radio button is not shown as default.");
	else
		System.out.println("Test 13 failed. The specified radio button is shown as defalt.");
	
//Newsletter checkbox not selected by default.
	boolean newsletterCheckbox=sub.newsletterCheckbox().isSelected();
	
	if (!newsletterCheckbox)
		System.out.println("Test 14 passed. The checkbox is not marked by default.");
	else
		System.out.println("Test 14 failed. The checkbox is marked.");
	
//Businees advisor checkbox not selected by default.
	boolean advisorCheckbox=sub.advisorCheckbox().isSelected();
	
	if (!advisorCheckbox)
		System.out.println("Test 15 passed. The checkbox is not marked by default.");
	else
		System.out.println("Test 15 failed. The checkbox is marked.");
		
		Thread.sleep(500);
		
//Commands on contact us page.
//Inserting text.
		sub.firstName().sendKeys("Ido");
		Thread.sleep(500);
		
		sub.lastName().sendKeys("Goldshtien");
		Thread.sleep(500);
		
		sub.subject().sendKeys("This is the automation process, pretty cool right?");
		Thread.sleep(500);
		
//Choosing the second radio button.
		sub.radioBtnF().click();
		Thread.sleep(500);
		
//Choosing the second option in dropdown menu.
		Select countryDropDown=new Select(sub.country());
		countryDropDown.selectByVisibleText("USA");
		Thread.sleep(500);
		
//Ticking checkboxes.
//Newsletter checkbox.
		sub.newsletterCheckbox().click();
		Thread.sleep(500);
		
//Business advisor checkbox.
		sub.advisorCheckbox().click();
		Thread.sleep(500);
		
//Confirms the correct amount of radio buttons.
	List<WebElement> chkrdo=driver.findElements(By.xpath("//input[@type='radio']"));
		
	if (chkrdo.size()==2)
		System.out.println("Test 16 passed. The number of radio buttons is correct: "+chkrdo.size());
	else
		System.out.println("Test 16 failed. The number of radio buttons is incorrect: "+chkrdo.size());
	
		Thread.sleep(500);
		
//Confirms the correct amount of checkboxes buttons.
	List<WebElement> chkbx=driver.findElements(By.xpath("//input[@type='checkbox']"));	
		
	if (chkbx.size()==2)
		System.out.println("Test 17 passed. The number of checkbox is correct: "+chkbx.size());
	else
		System.out.println("Test 17 failed. The number of checkboxes is correct: "+chkbx.size());
	
		Thread.sleep(500);
		
//Prints and confirms the upper right text from the Categories page.
		sub.categoriesBtn().click();
		System.out.println("The upper right text for test 18 is: "+sub.brand().getText());
		
		String brndChk=sub.brand().getText();
		
		if (brndChk.equals("IDO GOLDSHTIEN"))
			System.out.println("Test 18 passed. The specified text is correct. ");
		else
			System.out.println("Test 18 failed. The specified text is incorrect: "+sub.brand().getText());
	
		Thread.sleep(500);
		
		driver.close();
	}
}
