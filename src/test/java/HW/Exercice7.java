package HW;

import Utils.Hooks2;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Exercice7 extends Hooks2 {

	public static void main(String[] args) throws InterruptedException {

		setUp("edge");
		driver.get("https://www.selenium.dev/selenium/docs/api/java/index.html?overview-summary.html");

		WebElement Textbox = driver.findElement(By.xpath("//a[@href='org/openqa/selenium/package-summary.html']"));
		Textbox.click();

		WebElement Alert = driver.findElement(By.xpath("//a[@href='Alert.html']"));
		Alert.click();

		WebElement Interfacemessage = driver.findElement(By.xpath("//h1[@class='title']"));

		String text = Interfacemessage.getText();
		System.out.println(text);

		if (Interfacemessage.getText().contains("Interface Alert")) {

			System.out.println("TESTCASE PASSED");
		} else

			System.out.println("TESTCASE FAILED");

		Thread.sleep(1000);

// The web page those not open like it illustrate in the picture, therefore This automation cannot be performed

		tearDown();

	}

}
