package spicejet;




import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;	
	

public class Spicejet extends BaseFile{
	
	WebDriver driver;

@FindBy(xpath = "//title")
WebElement Title;	



@FindBy(xpath = "//div[contains(text(),'Signup')]")
WebElement signUplink;	
@FindBy(xpath = "/html/body/div[2]/div/div/div[2]/div[2]/div/div[1]/div[1]/div[2]/select/option[2]")
WebElement titleofMembers;
@FindBy(xpath = "//input[@id='first_name']")
WebElement firstName;	
@FindBy(xpath = "//input[@id='last_name']")
WebElement lastName;	
@FindBy(xpath = "//input[@placeholder='+91 01234 56789']")
WebElement enrollmentmobileNo;
@FindBy(xpath = "//input[@id='email_id']")
WebElement enrollmentMailid;
@FindBy(xpath = "//input[@id='new-password']")
WebElement enrollmentPassword;
@FindBy(xpath = "//input[@id='c-password']")
WebElement enrollmentConfirmPassword;
@FindBy(xpath = "//input[@id='defaultCheck1']")
WebElement agreeToTerms;
@FindBy(xpath = "//button[@type='button']")
WebElement enrollmentSubmit;
@FindBy(xpath = "//button[@class='btn btn-red plr-50']")
WebElement otpVerify;








@FindBy(xpath="//input[@data-testid='user-mobileno-input-box']")	
WebElement mobileno;
@FindBy(xpath="//input[@type='password']")	
WebElement password;
@FindBy(xpath="//div[contains(text(),'Login')]")
WebElement login;
@FindBy(xpath="//div[@class='css-76zvg2 r-homxoj r-ubezar r-1ozqkpa'][normalize-space()='Email']")
WebElement Emailopt;
@FindBy(xpath="//input[@type='email']")
WebElement Email;
@FindBy(xpath="//div[@class='css-1dbjc4n r-1awozwy r-184aecr r-z2wwpe r-1loqt21 r-18u37iz r-tmtnm0 r-1777fci r-1x0uki6 r-1w50u8q r-ah5dr5 r-1otgn73']")
WebElement loginbutton;

@FindBy(xpath="/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[3]/div[2]/div[2]/div[1]/div[2]/div[2]/div[1]/div[2]/div[1]/*[name()='svg'][1]/*[name()='circle'][1]")
WebElement Roundtrip;

@FindBy(xpath="/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[3]/div[2]/div[2]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/*[name()='svg'][1]/*[name()='g'][1]/*[name()='circle'][2]")
WebElement singleTrip;


@FindBy(xpath="//div[contains(text(),'From')]")
WebElement From;
@FindBy(xpath="//div[@class='css-76zvg2 r-cqee49 r-ubezar r-1kfrs79 r-1ozqkpa']")
WebElement India;
@FindBy(xpath="//div[normalize-space()='Chennai International Airport']")
WebElement chennai;
@FindBy(xpath="//div[normalize-space()='Rajiv Gandhi International Airport']")
WebElement Hydrebad;
@FindBy(xpath="//div[normalize-space()='Indira Gandhi International Airport']")
WebElement Delhi;
@FindBy(xpath="//div[@class='css-1dbjc4n r-1awozwy r-1xfd6ze r-1loqt21 r-18u37iz r-1777fci r-1w50u8q r-ah5dr5 r-1otgn73']")
WebElement continueBooking;

@FindBy(xpath="/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[3]/div[2]/div[3]/div[1]/div[3]/div[1]/div[1]")
WebElement to;
@FindBy(xpath="/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[3]/div[2]/div[3]/div[1]/div[3]/div[2]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]")
WebElement IndiaInTO;


@FindBy(xpath="//div[normalize-space()='Departure Date']")
WebElement DepDate;

@FindBy(xpath="/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[3]/div[2]/div[4]/div[1]/div[2]/div[2]/div[3]/div[2]/div[1]/div[2]/div[1]/div[3]/div[4]/div[7]/div[1]/div[1]")
WebElement Feb25;
@FindBy(xpath="/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[3]/div[2]/div[4]/div[1]/div[2]/div[2]/div[3]/div[2]/div[1]/div[2]/div[1]/div[3]/div[5]/div[4]/div[1]/div[1]")
WebElement Feb29;
@FindBy(xpath="/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[3]/div[2]/div[7]/div[2]/div[1]")
WebElement search;
@FindBy(xpath="/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[6]/div[2]/div[2]/div[3]")
WebElement modifysearch;
@FindBy(xpath="/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[5]/div[1]/div[1]/div[3]/div[2]")
WebElement continue1;
@FindBy(xpath="/html[1]/body[1]/div[2]/div[1]/div[1]/div[5]/div[1]/div[1]/div[1]/div[3]/div[2]/div[1]/div[1]/div[2]/input[1]")
WebElement firstname;
@FindBy(xpath="/html[1]/body[1]/div[2]/div[1]/div[1]/div[5]/div[1]/div[1]/div[1]/div[3]/div[3]/div[1]/div[1]/div[2]/input[1]")
WebElement lastname;
@FindBy(xpath="/html[1]/body[1]/div[2]/div[1]/div[1]/div[5]/div[1]/div[1]/div[1]/div[3]/div[4]/div[1]/div[2]/input[1]")
WebElement contact;
@FindBy(xpath="/html[1]/body[1]/div[2]/div[1]/div[1]/div[5]/div[1]/div[1]/div[1]/div[4]/div[1]/div[1]/div[1]/div[2]/input[1]")
WebElement email;
@FindBy(xpath="/html[1]/body[1]/div[2]/div[1]/div[1]/div[5]/div[1]/div[1]/div[1]/div[4]/div[3]/div[1]/div[1]/div[2]/input[1]")
WebElement town;
@FindBy(xpath="//div[@class='css-1dbjc4n r-1awozwy r-18u37iz r-1wtj0ep r-19h5ruw']//div[@class='css-1dbjc4n r-zso239']//*[name()='svg']//*[name()='g' and contains(@fill,'#FFF')]//*[name()='rect' and contains(@width,'100%')]")
WebElement primarypassenger;

@FindBy(xpath="/html[1]/body[1]/div[2]/div[1]/div[1]/div[5]/div[1]/div[2]/div[1]/div[1]/div[2]")
WebElement continueToPay;
@FindBy(xpath="//body/div[@id='react-root']/div[@id='main-container']/div[@class='css-1dbjc4n r-1niwhzg r-1jgb5lz r-r0h9e2 r-13qz1uu']/div[@class='css-1dbjc4n r-1kihuf0 r-ometjm r-1251kcm r-13qz1uu']/div[@class='css-1dbjc4n r-1awozwy r-13awgt0']/div[@class='css-1dbjc4n r-18u37iz r-ometjm r-gq6cd1']/div[@class='css-1dbjc4n r-2ka9w3 r-6ity3w r-zr9zts']/div[@class='css-1dbjc4n r-1xcajam r-1biggbk']/div[@class='css-1dbjc4n r-13awgt0 r-1biggbk']/div[4]")
WebElement continueToPayinSingleTrip;
@FindBy(xpath="/html[1]/body[1]/div[3]/div[1]/div[1]/div[5]/div[1]/div[1]/div[2]/div[1]/div[1]/div[4]")
WebElement tripSummary;
@FindBy(xpath="//body/div[@id='react-root']/div[@id='main-container']/div[@class='css-1dbjc4n r-1niwhzg r-1jgb5lz r-r0h9e2 r-13qz1uu']/div[@class='css-1dbjc4n r-1kihuf0 r-ometjm r-1251kcm r-13qz1uu']/div[@class='css-1dbjc4n r-1awozwy r-13awgt0']/div[@class='css-1dbjc4n r-18u37iz r-ometjm r-gq6cd1']/div[@class='css-1dbjc4n r-2ka9w3 r-6ity3w r-zr9zts']/div[@class='css-1dbjc4n r-1xcajam r-1biggbk']/div[@class='css-1dbjc4n r-13awgt0 r-1biggbk']/div[4]")
WebElement addonSingletripSummary;


@FindBy(xpath="//div[@class='css-76zvg2 r-cqee49 r-poiln3 r-ubezar r-1kfrs79 r-1n0xq6e' and text()='UPI']")
WebElement upi;

@FindBy(xpath="//div[@id='at_addon_close_icon']//img")
WebElement offerPopup;
@FindBy(xpath="//div[@class='tt_pop']")
WebElement pop;
@FindBy(xpath="/html[1]/body[1]/div[1]/div[1]/div[2]/p[3]/span[1] ")
WebElement skipPopUp;
@FindBy(xpath="//div[@id='at_prepayment_close_icon']//img")
WebElement closePopUp;

@FindBy(xpath="//div[@class='css-1dbjc4n r-1awozwy r-1xfd6ze r-1loqt21 r-18u37iz r-1777fci r-1w50u8q r-ah5dr5 r-1otgn73']")
WebElement continueToSelectFlight;

@FindBy(xpath="//div[@class='css-76zvg2 r-cqee49 r-poiln3 r-ubezar r-1kfrs79 r-1n0xq6e' and text()='Credit/Debit Card']")
WebElement cardOption;

@FindBy(xpath="//input[@class='card_number']")
WebElement cardn;
@FindBy(xpath="//input[@id='name_on_card']")
WebElement cardname;
@FindBy(xpath="//input[@id='card_exp_month']")
WebElement expiredate;
@FindBy(xpath="//input[@id='card_exp_month']")
WebElement expiremonth;
@FindBy(xpath="//input[@id='security_code']")
WebElement cvv;
@FindBy(xpath="/html[1]/body[1]/div[3]/div[1]/div[1]/div[2]/div[2]/div[1]/div[2]/div[1]")
WebElement proceedToPay;

@FindBy(xpath="/html[1]/body[1]/div[3]/div[1]/div[1]/div[2]/div[1]/div[3]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]")
WebElement netBanking;
@FindBy(xpath="//div[@class='net_banking_wrapper']//div[1]//div[1]//div[3]//div[1]")
WebElement axisBank;
@FindBy(xpath="//div[@class='css-1dbjc4n r-1awozwy r-un1frt r-z2wwpe r-1loqt21 r-18u37iz r-1777fci r-6ity3w r-d9fdf6 r-9qu9m4 r-ah5dr5 r-1otgn73 r-1wgg2b2 r-1wn9b5e']")
WebElement proceedingPay;




	


public Spicejet(WebDriver driver) {	
		this.driver =driver;
		PageFactory.initElements(BaseFile.driver, this);
      	}
   
public void waitForElementToBeClickable(WebElement element, int timeoutInSeconds) {
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeoutInSeconds));
    wait.until(ExpectedConditions.elementToBeClickable(element));
}

public void waitForPresenceOfElement(WebElement element, int timeoutInSeconds) {
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeoutInSeconds));
    wait.until(ExpectedConditions.visibilityOf(element));
}
public void waitForElementPresence(By locator, int timeoutInSeconds) {
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeoutInSeconds));
    wait.until(ExpectedConditions.presenceOfElementLocated(locator));
}

public void takeScreenshot(WebDriver driver, String fileName) {
    // Convert the WebDriver instance to TakesScreenshot
    TakesScreenshot ts = ((TakesScreenshot) driver);

    // Capture the screenshot as a file
    File screenshot = ts.getScreenshotAs(OutputType.FILE);

    try {
        // Copy the file to a desired location
        org.apache.commons.io.FileUtils.copyFile(screenshot, new File(fileName));
        System.out.println("Screenshot captured and saved as " + fileName);
    } catch (IOException e) {
        System.out.println("Failed to capture screenshot: " + e.getMessage());
    }
}

		
public void signUp() {
	signUplink.click();
	takeScreenshot(driver,"C:\\Users\\SHASWATH\\Documents\\arun\\GUVI\\spicejet\\screenshot\\signingpage.jpg");
}	

public void memberEnrollmentWindow() {	
	
	Set<String> handles = driver.getWindowHandles();
	ArrayList<String>  list = new ArrayList<String> (handles);
	System.out.println("ID :"+handles + '\n' + "Total :" +list.size());
	driver.switchTo().window(list.get(1));
	System.out.println(driver.getCurrentUrl());
	
}

public void memberDetails() {
	titleofMembers.click();
	firstName.sendKeys("Arun");
	lastName.sendKeys("kumar");
	WebElement country = driver.findElement (By.xpath("//select[@class='form-control form-select']"));
    Select dropdown2 = new Select(country);
    dropdown2.selectByValue("IN");
        //CALENDER 
  		driver.findElement(By.xpath("//div[@id='react-root']//div[@class='position-relative date']")).click();
  		//year
  		driver.findElement(By.xpath("//select[@class='react-datepicker__year-select']")).click();
  	    WebElement years = driver.findElement (By.xpath("//select[@class='react-datepicker__year-select']"));
  	    Select year = new Select(years);
  	    year.selectByValue("1986");
  	    //month
  	    driver.findElement(By.xpath("//select[@class='react-datepicker__month-select']")).click();
  	    driver.findElement(By.xpath("//option[@value='2']")).click();
  	    // day
  	    driver.findElement(By.xpath("//div[@class='react-datepicker__day react-datepicker__day--015 react-datepicker__day--weekend']")).click();
  	  JavascriptExecutor js = (JavascriptExecutor) driver;
      js.executeScript("window.scrollBy(0, 200);");
      enrollmentmobileNo.sendKeys("8668135376");  
      enrollmentMailid.sendKeys("arun86@fastmail.com");
      enrollmentPassword.sendKeys("Arun@1986");
      enrollmentConfirmPassword.sendKeys("Arun@1986");
      waitForElementToBeClickable(agreeToTerms,10);
      agreeToTerms.click();
      waitForElementToBeClickable(enrollmentSubmit,10);
      enrollmentSubmit.click();
    
}

public void otpHandlying() {
	try {
       
      waitForElementPresence(By.xpath("//input[@id='first']"),5);      
      waitForElementPresence(By.xpath("//input[@id='second']"),5);
      waitForElementPresence(By.xpath("//input[@id='third']"),5);
      waitForElementPresence(By.xpath("//input[@id='fourth']"),5);
      waitForElementPresence(By.xpath("//input[@id='fifth']"),5);
      waitForElementPresence(By.xpath("//input[@id='sixth']"),5);

        // Once all input fields are present, locate and click the submit button
        waitForElementToBeClickable(otpVerify,20);
        otpVerify.click();
               
    } finally {	
        // You can add cleanup or error handling code here if needed
    }
	takeScreenshot(driver,"C:\\Users\\SHASWATH\\Documents\\arun\\GUVI\\spicejet\\screenshot\\signingpageotp.jpg");
    }

public void	homepage() {
	 String actualTitle = (driver.getTitle());

     // Define the expected title
     String expectedTitle = "SpiceJet - Flight Booking for Domestic and International, Cheap Air Tickets";

     // Validate the title
     if (actualTitle.equals(expectedTitle)) {
         System.out.println("Title Validation Passed!");
     } else {
         System.out.println("Title Validation Failed. Actual title: " + actualTitle);
     }

	
   
}
public void login()  {
	login.click();
	Emailopt.click();
	Email.sendKeys("arun86@fastmail.com");
	password.sendKeys("Arun@1986");
	try {
		Thread.sleep(4000);
	} catch (InterruptedException e) {
		
		e.printStackTrace();
	}
	loginbutton.click();
}
	
public void singleTrip() {
	try {
		Thread.sleep(6000);
	} catch (InterruptedException e) {
		e.printStackTrace();
	}
	singleTrip.click();	
	From.click();
	India.click();
	waitForElementToBeClickable(chennai,10);
	chennai.click();
	waitForElementToBeClickable(Delhi,10);
	Delhi.click();
    waitForElementToBeClickable(Feb25,15);
    Feb25.click();
    search.click();
 // Take the screenshot
    takeScreenshot(driver,"C:\\Users\\SHASWATH\\Documents\\arun\\GUVI\\spicejet\\screenshot\\singletrip.jpg");
}

public void roundTrip()  {
	try {
		Thread.sleep(6000);
	} catch (InterruptedException e) {
		e.printStackTrace();
	}
	Roundtrip.click();
    From.click();
	India.click();
    waitForElementToBeClickable(chennai,10);
    chennai.click();
    waitForElementToBeClickable(Delhi,10);
    Delhi.click();
     
  
    waitForElementToBeClickable(Feb25,15);
    Feb25.click();
    waitForElementToBeClickable(Feb29,15);
    Feb29.click();
    search.click();
 // Take the screenshot
    takeScreenshot(driver,"C:\\Users\\SHASWATH\\Documents\\arun\\GUVI\\spicejet\\screenshot\\multitrip.jpg");
}

public void continueToSelectFlight() {
	JavascriptExecutor js = (JavascriptExecutor) driver;
    js.executeScript("window.scrollBy(0, 150);");
	waitForElementToBeClickable(continueToSelectFlight,15);
	continueToSelectFlight.click();
	
}

public void selectFlight() {
	

	waitForElementToBeClickable(continueBooking,15);
	continueBooking.click();
   
}	

public void passengerDetailsSingletrip() {
	try {
		Thread.sleep(6000);
	} catch (InterruptedException e) {
					e.printStackTrace();
	}
	town.sendKeys("chennai");
	 JavascriptExecutor js = (JavascriptExecutor) driver;
       js.executeScript("window.scrollBy(0, 200);");
       waitForElementToBeClickable(primarypassenger,15);
		primarypassenger.click();
		waitForElementToBeClickable(continueToPay,15);
		continueToPay.click();
		waitForPresenceOfElement(continueToPayinSingleTrip,15);
		continueToPayinSingleTrip.click();
       
}


public void passengerDetails() {
	
		try {
			Thread.sleep(6000);
		} catch (InterruptedException e) {
						e.printStackTrace();
		}
		town.sendKeys("chennai");
		 JavascriptExecutor js = (JavascriptExecutor) driver;
	        js.executeScript("window.scrollBy(0, 200);");
		waitForElementToBeClickable(primarypassenger,15);
		primarypassenger.click();
		waitForElementToBeClickable(continueToPay,15);
		continueToPay.click();
		
}	

public void singleTripSummary() {
	try {
		Thread.sleep(4000);
	} catch (InterruptedException e) {
					e.printStackTrace();
	}
	JavascriptExecutor js = (JavascriptExecutor) driver;
    js.executeScript("window.scrollBy(0, 400);");
	if (offerPopup.isDisplayed()) {
		offerPopup.click();
	    System.out.println("The popup is displayed.");
	} else {
	    System.out.println("The popup is not displayed.");
	}
	if (skipPopUp.isDisplayed()) {
		skipPopUp.click();
        System.out.println("The element is displayed.");
    } else {
        System.out.println("The element is not displayed.");
    }
	
	
	
	waitForPresenceOfElement(addonSingletripSummary,15);
	addonSingletripSummary.click();

	
}




public void summary() {
	
	try {
		Thread.sleep(6000);
	} catch (InterruptedException e) {
		e.printStackTrace();
	}
	
	waitForPresenceOfElement(tripSummary,15);
	
	JavascriptExecutor js = (JavascriptExecutor) driver;
    js.executeScript("window.scrollBy(0, 400);");
    
    waitForElementToBeClickable(tripSummary,15);
	tripSummary.click();
	
	if (skipPopUp.isDisplayed()) {
		skipPopUp.click();
        System.out.println("The element is displayed.");
    } else {
        System.out.println("The element is not displayed.");
    }
	
	
	
				
}

public void upi() {
	try {	
		Thread.sleep(5000);
	} catch (InterruptedException e) {
			
		e.printStackTrace();
	}
	waitForPresenceOfElement(upi,15);
	upi.click();
	JavascriptExecutor js = (JavascriptExecutor) driver;
    js.executeScript("window.scrollBy(0, 400);");
    waitForElementToBeClickable(proceedToPay,15);
    proceedToPay.click();
 // Take the screenshot
    takeScreenshot(driver,"C:\\Users\\SHASWATH\\Documents\\arun\\GUVI\\spicejet\\screenshot\\upi.jpg");
}

public void netBankingOption() {
	try {	
		Thread.sleep(5000);
	} catch (InterruptedException e) {
			
		e.printStackTrace();
	}
	waitForPresenceOfElement(netBanking,15);
	netBanking.click();
	axisBank.click();
	JavascriptExecutor js = (JavascriptExecutor) driver;
    js.executeScript("window.scrollBy(0, 200);");
    proceedToPay.click();
 // Take the screenshot
    takeScreenshot(driver,"C:\\Users\\SHASWATH\\Documents\\arun\\GUVI\\spicejet\\screenshot\\netBanking.jpg");
}



public void cardDetails() {
	
	waitForPresenceOfElement(cardOption,20);
	cardOption.click();
	
	List<WebElement> frames = driver.findElements(By.tagName("iframe"));

	for (int i = 0; i < frames.size(); i++) {
	    System.out.println("Frame Index: " + i);}
	driver.switchTo().frame(4);
	cardn.click();
	cardn.sendKeys("6585965845369568");
	
	}}
		
	
 




