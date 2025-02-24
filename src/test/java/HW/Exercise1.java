package HW;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import Utils.Hooks2;

public class Exercise1 extends Hooks2 {

	public static void main(String[] args) throws InterruptedException {

		setUp("edge");
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

		Thread.sleep(3000);

		// UserNAme field
		WebElement usernameField = driver.findElement(By.name("username"));
		usernameField.sendKeys("admin");

		Thread.sleep(3000); // wait/pause 3 seconds

		// password field
		WebElement passwordField = driver.findElement(By.name("password"));
		passwordField.sendKeys("admin123");

		// locate the login button using XPATH
		WebElement loginButton = driver
				.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button"));
		loginButton.click();
		Thread.sleep(2000);

		// locate the element using ID locator the store in webElement object
		WebElement textField = driver
				.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[1]/span/h6"));
		Thread.sleep(2000);

		boolean isShowDisplay = textField.isDisplayed();

		System.out.println("Is Dashboard Displayed: " + isShowDisplay);
		Thread.sleep(2000);

		tearDown();

	}

}
