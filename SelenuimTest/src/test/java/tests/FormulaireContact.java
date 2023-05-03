package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import pages.UserFromPage;


public class FormulaireContact {
	
	public void completeContactFrom() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\tdhraeif\\eclipse-workspace\\Karate\\SelenuimTest\\drivers\\chromedriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://usptestqa.pages.dev/fake-contact");
		WebElement ddown = driver.findElement(By.xpath("//select[@id='gender']"));
		Select select =new Select(ddown);
		
		select.selectByVisibleText("Homme");
		
		UserFromPage UserFrom=new UserFromPage(driver);
		
		UserFrom.typefirstname("taha");
		UserFrom.typelastname("dhraief");
		UserFrom.company("atecna");
		UserFrom.typephone("07121212");
		UserFrom.typemessage("bonjour");
		UserFrom.typemessagetitle("hello");
		UserFrom.clickloginbtn();
		
		WebElement messageConfirmation =driver.findElement(By.xpath("//div[@id='popin-message']"));
		assert messageConfirmation.equals("Le message a été envoyé");
		
		
		
	
		
	driver.quit();
		
		
		
		
		
	}

}
