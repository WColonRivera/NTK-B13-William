package HW;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import Utils.Hooks2;

public class Exercice3 extends Hooks2 {

	public static void main(String[] args) throws InterruptedException {

		setUp("edge");
		driver.get("https://demo.nopcommerce.com/");
		Thread.sleep(3000);

		// we cannot run this program because we need to bypass the CAPTCHA in Selenium.
		// Thats a mystery that we are still trying to figure out.

		WebElement RegisterButton = driver
				.findElement(By.xpath("/html/body/div[6]/div[1]/div[1]/div[2]/div[1]/ul/li[1]/a"));
		RegisterButton.click();

		WebElement texField = driver.findElement(By.xpath("/html/body/div[6]/div[1]/div[2]/div[1]/a/img"));
		Thread.sleep(1000);

		WebElement gendercheck = driver.findElement(By.id("gender-male"));
		gendercheck.click();
		Thread.sleep(1000);

		WebElement firstName = driver.findElement(By.id("FirstName"));
		firstName.sendKeys("William");
		Thread.sleep(1000);

		WebElement lastName = driver.findElement(By.id("LastName"));
		lastName.sendKeys("Colon");
		Thread.sleep(1000);
		
		/**
		 * 
		 * There is no date of birth section. DevTeam needs to add this to the program
		 * to be test.
		 *
		 **/

		WebElement email = driver.findElement(By.id("Email"));
		email.sendKeys("Wcolonrivera04@gmail.com");
		Thread.sleep(1000);

		WebElement Company = driver.findElement(By.name("Company"));
		Thread.sleep(1000);

		WebElement Newsletter = driver.findElement(By.id("Newsletter"));
		gendercheck.click();
		Thread.sleep(1000);

		WebElement Password = driver.findElement(By.name("Password"));
		Thread.sleep(1000);

		WebElement ConfirmPassword = driver.findElement(By.name("ConfirmPassword"));
		Thread.sleep(1000);

		WebElement registerButton = driver.findElement(By.id("register-button"));
		registerButton.click();
		Thread.sleep(1000);

		WebElement texField1 = driver.findElement(By.xpath(
				"/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[3]/td/p[2]/font"));
		Thread.sleep(1000);

		boolean isYourRegistrationCompletedDisplay = texField1.isDisplayed();

		System.out.println("TESTCASE PASSED: " + isYourRegistrationCompletedDisplay);

		tearDown();

	}
}