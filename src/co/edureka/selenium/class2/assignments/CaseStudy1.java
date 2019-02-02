package co.edureka.selenium.class2.assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CaseStudy1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Atiqul Islam\\Downloads\\ChromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("http://edureka.co/");
		driver.manage().window().maximize();
		//Get attributes id, name, xpath, class name, css values
		WebElement serachBoxById = driver.findElement(By.id("search-inp"));
		WebElement searchBox = driver.findElement(By.name("user_v1[query]"));
		WebElement serachBoxByXpath = driver.findElement(By.xpath("/html//input[@id='search-inp']"));
		WebElement searchBoxByCSS = driver.findElement(By.className("typeahead__query"));
		
		WebElement loginLink = driver.findElement(By.xpath("//header[@id='header-II']//nav[@role='navigation']/div/a[2]"));
		System.out.println(loginLink.getText());
	}

}
