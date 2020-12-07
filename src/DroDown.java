import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DroDown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "C:\\Users\\ushan\\Documents\\Automation\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.spicejet.com/");
		
		//handling static elements
		
		Select S=new Select(driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency")));
		S.selectByValue("AED");
		//S.selectByIndex(1);
		//S.selectByVisibleText("USD");
		

	}

}
