package HW;

import Utils.Hooks2;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Exercice8 extends Hooks2 {

	public static void main(String[] args) throws InterruptedException {

		setUp("edge");
		driver.get("https://demo.automationtesting.in/Frames.html");

		driver.switchTo().frame(1);

		WebElement searchBtn = driver.findElement(By.xpath(("//input[@type='text']")));
		searchBtn.sendKeys("Accessing Iframe");
		Thread.sleep(2000);

		driver.switchTo().defaultContent();

		WebElement IframeBtn = driver.findElement(By.xpath(("//a[@href='#Multiple']")));
		IframeBtn.click();

		driver.switchTo().frame(2);

		// Cannot figuere why this is not working

		// WebElement searchBtn1 = driver.findElement(By.xpath(("//input[starts-with(@style,'mar')]")));
		// searchBtn1.sendKeys("Accessing Iframe");
		// Thread.sleep(2000);

		tearDown();
	}
}