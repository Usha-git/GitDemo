import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String 	text="Rahul";
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ushan\\Documents\\Automation\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		//to select and pass the key in the text box
		driver.findElement(By.xpath("//*[@id=\"name\"]")).sendKeys(text);
		//to click on the alert button
		driver.findElement(By.id("alertbtn")).click();
		//to display the text in the popup(alert) page 
		System.out.println(driver.switchTo().alert().getText());
		//to swicth to the popup and accept the alert like click on ok button
		driver.switchTo().alert().accept();// click  on ok button
		driver.findElement(By.id("confirmbtn")).click();
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().dismiss();// click on cancel button

	}

}
