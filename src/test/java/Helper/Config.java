package Helper;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class Config {
	
	public static WebDriver driver; 
	
	public static WebDriver driver2; 
	
	
	public static Actions avtions; 
	
	
	public static void maximizeWindow() {
		driver.manage().window().maximize();
	}
	
	public static void attente(int s) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(s));
	}

}
