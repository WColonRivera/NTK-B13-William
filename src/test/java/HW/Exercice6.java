package HW;

import Utils.Hooks2;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Exercice6 extends Hooks2 {

	public static void main(String[] args) throws InterruptedException {

		setUp("edge");
		driver.get("https://demo.automationtesting.in/Alerts.html");

		if (driver.getTitle().contains("Alerts")) {
			// Pass
			System.out.println("Page title contains: \"Alerts\" ");
		} else
			// Fail
			System.out.println("Page title doesn't contains: \"Alerts\" ");

		WebElement Textbox = driver.findElement(By.xpath("//a[@href='#Textbox']"));
		Textbox.click();

		WebElement info = driver.findElement(By.xpath("//button[@class='btn btn-info']"));
		info.click();

		Alert alert = driver.switchTo().alert();
		alert.sendKeys("William");
		alert.accept();

		WebElement wholeBodyText = driver.findElement(By.id("demo1"));

		if (wholeBodyText.getText().contains("How are you today")) {

			System.out.println("Page contains: \"How are you today\" ");
		} else

			System.out.println("Page doesn't contains: \"How are you today\" ");

		Thread.sleep(1000);

		driver.navigate().refresh();
		Thread.sleep(5000);

		WebElement CancelBtn = driver.findElement(By.xpath("//a[contains(@href,'#CancelTab')]"));
		CancelBtn.click();

		WebElement confirmbox = driver.findElement(By.xpath("//button[@onclick='confirmbox()' ]"));
		confirmbox.click();

		Thread.sleep(1000);

		// the alert that shows is a confirmation alert not a prompt alert. Therefore
		// there is no field for writing the name.

		Alert alert1 = driver.switchTo().alert();

		if (alert1.getText().contains("Press a Button !")) {
			alert1.accept();

			System.out.println("Page contains: \"Press a Button !\" ");
		} else
			alert1.dismiss();
		System.out.println("Page doesn't contains: \"Press a Button !\" ");

		Thread.sleep(1000);

		WebElement wholeBodyText1 = driver.findElement(By.id("demo"));

		if (wholeBodyText1.getText().contains("You pressed")) {

			System.out.println("Page contains: \"You pressed\" ");
		} else

			System.out.println("Page doesn't contains: \"You pressed\" ");

		Thread.sleep(1000);

		tearDown();

	}

}
