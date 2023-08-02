package jenkins_java;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Validate_checkbox {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "driver\\geckodriver.exe");

		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.ironspider.ca/forms/checkradio.htm");

		WebElement checkbox = driver.findElement(
				By.cssSelector("blockquote.Example:nth-child(17) > form:nth-child(1) > input:nth-child(3)"));
		checkbox.click();
		// driver.findElement(By.xpath("")).click();

		// WebElement checkbox =
		// driver.findElement(By.id("li.rct-node-parent:nth-child(3) > ol:nth-child(2) >
		// li:nth-child(2) > span:nth-child(1) > label:nth-child(2) > span:nth-child(2)
		// > svg:nth-child(1)"));
		if (checkbox.isSelected()) {

			String message = "Checkbox is selected!";
			((JavascriptExecutor) driver).executeScript("alert('" + message + "');");

		} else {

			String message = "Checkbox is not selected!";
			((JavascriptExecutor) driver).executeScript("alert('" + message + "');");

		}
	}

}