package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class UserFromPage
{
	WebDriver driver;
	
	By kind_scrallbar=By.xpath ("//select[@id='gender']");
	By first_name_field=By.xpath ("//input[@id='first-name']");
	By name_field=By.xpath ("//input[@id='last-name']");
	By company_field=By.xpath ("//input[@id='company']");
	By phone_field=By.xpath ("//input[@id='phone']");
	By message_title_field=By.xpath ("//input[@id='message-title']");
	By your_message_field=By.xpath ("//textarea[@id='message']");
	By LgnBtn=By.id("submit-button");
	
	
	public UserFromPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public void selectgender()
	{
		   driver.findElement(kind_scrallbar).click();
	}
	public void typefirstname(String first_name)
	{
		driver.findElement(first_name_field).sendKeys(first_name);
	}
	public void typelastname(String last_name)
	{
		driver.findElement(name_field).sendKeys(last_name);
	}
	public void company(String campany)
	{
		driver.findElement(company_field).sendKeys(campany);
	}
	public void typephone(String phone)
	{
		driver.findElement(phone_field).sendKeys(phone);
	}
	public void typemessagetitle(String message)
	{
		driver.findElement(message_title_field).sendKeys(message);
	}
	public void typemessage(String your_message)
	{
		driver.findElement(your_message_field).sendKeys(your_message);
	}
	public void clickloginbtn()
	{
		driver.findElement(LgnBtn).click();
	}


		// TODO Auto-generated method stub
		
	}
	
