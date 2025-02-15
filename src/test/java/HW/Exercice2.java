package HW;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import Utils.Hooks2;

public class Exercice2 extends Hooks2 {

	public static void main(String[] args) throws InterruptedException {

		setUp("edge");
		driver.get(" https://demo.guru99.com/test/newtours/");
		Thread.sleep(3000);

		WebElement RegisterButton = driver.findElement(
				By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[2]/td/table/tbody/tr/td[2]/a"));
		RegisterButton.click();

		WebElement texField = driver.findElement(
				By.xpath("/html/body/div[2]/table/tbody/tr/td[1]/table/tbody/tr/td/table/tbody/tr/td/p[1]/img"));
		Thread.sleep(1000);

		WebElement firstName = driver.findElement(By.name("firstName"));
		Thread.sleep(1000);

		WebElement lastName = driver.findElement(By.name("lastName"));
		Thread.sleep(1000);

		WebElement phone = driver.findElement(By.name("phone"));
		Thread.sleep(1000);

		WebElement email = driver.findElement(By.id("userName"));
		Thread.sleep(1000);

		WebElement address = driver.findElement(By.name("address1"));
		Thread.sleep(1000);

		WebElement city = driver.findElement(By.name("city"));
		Thread.sleep(1000);

		WebElement state = driver.findElement(By.name("state"));
		Thread.sleep(1000);

		WebElement postal = driver.findElement(By.name("postalCode"));
		Thread.sleep(1000);

		WebElement userName = driver.findElement(By.id("email"));
		Thread.sleep(1000);

		WebElement password = driver.findElement(By.name("password"));
		Thread.sleep(1000);

		WebElement confirmPassword = driver.findElement(By.name("confirmPassword"));
		Thread.sleep(1000);

		WebElement submitButton = driver.findElement(By.xpath(
				"/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[17]/td/input"));
		submitButton.click();
		Thread.sleep(1000);

		WebElement texField1 = driver.findElement(By.xpath(
				"/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[3]/td/p[2]/font"));
		Thread.sleep(1000);

		boolean isThankYouForRegisteringDisplay = texField1.isDisplayed();

		System.out.println("TESTCASE PASSED: " + isThankYouForRegisteringDisplay);

		tearDown();
	}
}