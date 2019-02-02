package co.edureka.selenium.class2.assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CaseStudy1 {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Atiqul Islam\\eclipse-workspace\\EdurekaAssignments\\drivers\\chromedriver.exe");
		System.setProperty("webdriver.firefox.marionette", "C:\\Users\\Atiqul Islam\\eclipse-workspace\\EdurekaAssignments\\drivers\\geckodriver.exe");
		
		runTests(new ChromeDriver());
		runTests(new FirefoxDriver());
	}
	
	static void runTests(WebDriver driver){
		
		driver.navigate().to("http://edureka.co/");
		driver.manage().window().maximize();
		//Get attributes id, name, xpath, class name, css values
		WebElement serachBoxById = driver.findElement(By.id("search-inp"));
		WebElement searchBox = driver.findElement(By.name("user_v1[query]"));
		WebElement serachBoxByXpath = driver.findElement(By.xpath("/html//input[@id='search-inp']"));
		WebElement searchBoxByCSS = driver.findElement(By.className("typeahead__query"));
		
		WebElement loginLink = driver.findElement(By.xpath("//header[@id='header-II']//nav[@role='navigation']/div/a[2]"));
		System.out.println(loginLink.getText());
		
		try {
			Thread.sleep(5000);
			driver.close();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}		
		
	}

}
