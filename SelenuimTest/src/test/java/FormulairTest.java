import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FormulairTest {
    public static void main(String[] args) {
		
    	System.setProperty("webdriver.chrome.driver", "C:\\Users\\tdhraeif\\eclipse-workspace\\Karate\\SelenuimTest\\drivers\\chromedriver\\chromedriver.exe");
    	WebDriver driver = new ChromeDriver();
    	driver.get("https://usptestqa.pages.dev/fake-contact");
	}
}
