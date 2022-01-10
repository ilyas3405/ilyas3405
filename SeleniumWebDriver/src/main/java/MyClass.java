
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class MyClass {

	static int sleepTimeMiliseconds = 2000;

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\P2947816\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		JavascriptExecutor js = (JavascriptExecutor) driver;

		TakesScreenshot scrShot = (TakesScreenshot) driver;

		driver.manage().window().maximize();

		// getStoreDetails(driver, js, scrShot);

		// getDeviceOnHandStatus(driver, js, scrShot);
		shipmentStatus(driver, js, scrShot);

		Thread.sleep(sleepTimeMiliseconds);

		// driver.close();
	}

	private static void shipmentStatus(WebDriver driver, JavascriptExecutor js, TakesScreenshot scrShot)
			throws InterruptedException {
		// TODO Auto-generated method stub
		Thread.sleep(sleepTimeMiliseconds);
		driver.get("http://vm0dnspmbla0036:8990/api/swagger-ui.html");
		Thread.sleep(sleepTimeMiliseconds);

		driver.findElement(By.id("operations-tag-pos-inventory-service-rest-controller")).click();
		Thread.sleep(sleepTimeMiliseconds);

		js.executeScript("window.scrollBy(0,500)");
		Thread.sleep(sleepTimeMiliseconds);

		driver.findElement(By.linkText("/device/shipmentStatus")).click();

		Thread.sleep(sleepTimeMiliseconds);

		driver.findElement(By.className("try-out")).click();
		Thread.sleep(sleepTimeMiliseconds);

		// js.executeScript("window.scrollBy(0,500)");

		driver.findElement(By.xpath(
				"//*[@id=\"operations-pos-inventory-service-rest-controller-updateDeviceShipmentStatus1UsingPUT\"]/div[2]/div/div[1]/div[2]/table/tbody/tr/td[2]/div[2]/div/div/textarea"))
				.click();
		Thread.sleep(sleepTimeMiliseconds);

		WebElement cancelButton = driver.findElement(By.xpath(
				"//*[@id=\"operations-pos-inventory-service-rest-controller-updateDeviceShipmentStatus1UsingPUT\"]/div[2]/div/div[1]/div[2]/table/tbody/tr/td[2]/div[2]/div/div/div/div/button"));
		cancelButton.click();

		WebElement editButton = driver.findElement(By.xpath(
				"//*[@id=\"operations-pos-inventory-service-rest-controller-updateDeviceShipmentStatus1UsingPUT\"]"
						+ "/div[2]/div/div[1]/div[2]/table/tbody/tr/td[2]/div[2]/div/div/div[2]/div/button"));
		editButton.click();
cancelButton.
	 
//		String strJsonShipmentRequest = null;
//
//		strJsonShipmentRequest = "{\r\n" + 
//				"    \"actualDeliveryDate\": \"11/30/2021\",\r\n" + 
//				"    \"itemId\": \"123456\",\r\n" + 
//				"    \"retailStoreId\": \"12346\",\r\n" + 
//				"    \"serialNumber\": \"3123456789\",\r\n" + 
//				"    \"serializedItemFlag\": true,\r\n" + 
//				"    \"userId\": \"P20000\"\r\n" + 
//				"}";
//
//		WebElement inputField = driver.findElement(By.xpath(
//				"//*[@id=\"operations-pos-inventory-service-rest-controller-updateDeviceShipmentStatus1UsingPUT\"]"
//						+ "/div[2]/div/div[1]/div[2]/table/tbody/tr/td[2]/div[2]/div/div/textarea"));
//
//		inputField.sendKeys(strJsonShipmentRequest);

		Thread.sleep(sleepTimeMiliseconds);

		js.executeScript("window.scrollBy(0,500)");
		Thread.sleep(sleepTimeMiliseconds);

	}

	private static void getDeviceOnHandStatus(WebDriver driver, JavascriptExecutor js, TakesScreenshot scrShot)
			throws InterruptedException {

		Thread.sleep(sleepTimeMiliseconds);
		driver.get("http://vm0dnspmbla0036:8990/api/swagger-ui.html");
		Thread.sleep(sleepTimeMiliseconds);

		driver.findElement(By.id("operations-tag-pos-inventory-service-rest-controller")).click();
		Thread.sleep(sleepTimeMiliseconds);

		js.executeScript("window.scrollBy(0,2000)");
		Thread.sleep(sleepTimeMiliseconds);

		driver.findElement(By.linkText("/getDeviceOnhandStatus/{imei}/{storeid}")).click();

		Thread.sleep(sleepTimeMiliseconds);

		driver.findElement(By.className("try-out")).click();
		Thread.sleep(sleepTimeMiliseconds);

		js.executeScript("window.scrollBy(0,2000)");

		driver.findElement(By.xpath("/html/body/div/section/div[2]/div[2]/div[5]/section/div/span[3]"
				+ "/div/div/span[5]/div/div[2]/div/div[1]/div[2]/table/tbody/tr[1]/td[2]/input\r\n")).click();
		Thread.sleep(sleepTimeMiliseconds);

		driver.findElement(By.xpath("/html/body/div/section/div[2]/div[2]/div[5]/section/div/span[3]"
				+ "/div/div/span[5]/div/div[2]/div/div[1]/div[2]/table/tbody/tr[1]/td[2]/input\r\n"))
				.sendKeys("1000000");
		Thread.sleep(sleepTimeMiliseconds);

		driver.findElement(By.xpath("/html/body/div/section/div[2]/div[2]/div[5]/section/div/span[3]"
				+ "/div/div/span[5]/div/div[2]/div/div[1]/div[2]/table/tbody/tr[2]/td[2]/input")).click();
		Thread.sleep(sleepTimeMiliseconds);

		driver.findElement(By.xpath("/html/body/div/section/div[2]/div[2]/div[5]/section/div/span[3]"
				+ "/div/div/span[5]/div/div[2]/div/div[1]/div[2]/table/tbody/tr[2]/td[2]/input")).sendKeys("8220");
		Thread.sleep(sleepTimeMiliseconds);

		driver.findElement(By.xpath("/html/body/div/section/div[2]/div[2]/div[5]/section"
				+ "/div/span[3]/div/div/span[5]/div/div[2]/div/div[2]/button")).click();

		Thread.sleep(sleepTimeMiliseconds);

		js.executeScript("window.scrollBy(0,2000)");

		File tempFile = scrShot.getScreenshotAs(OutputType.FILE);
		try {
			File screenshot = new File("C:\\Temp\\getdeviceonhand.png");
			// FileUtils .copyFile(tempFile, screenshot);
			Files.copy(tempFile, screenshot);

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private static void getStoreDetails(WebDriver driver, JavascriptExecutor js, TakesScreenshot scrShot)
			throws InterruptedException {
		Thread.sleep(sleepTimeMiliseconds);
		driver.get("http://vm0dnspmbla0036:8990/api/swagger-ui.html");
		Thread.sleep(sleepTimeMiliseconds);

		driver.findElement(By.id("operations-tag-pos-inventory-service-rest-controller")).click();
		Thread.sleep(sleepTimeMiliseconds);

		driver.findElement(By.tagName("BODY")).sendKeys(Keys.PAGE_DOWN);
		Thread.sleep(sleepTimeMiliseconds);

		driver.findElement(By.linkText("/getStoreDetails/{id}")).click();

		// driver.findElement(By.tagName("BODY")).sendKeys(Keys.PAGE_DOWN);
		Thread.sleep(sleepTimeMiliseconds);

		driver.findElement(By.className("try-out")).click();
		Thread.sleep(sleepTimeMiliseconds);

		js.executeScript("window.scrollBy(0,2000)");

		driver.findElement(By.tagName("INPUT")).click();
		Thread.sleep(sleepTimeMiliseconds);

		driver.findElement(By.tagName("INPUT")).sendKeys("8220");

		Thread.sleep(sleepTimeMiliseconds);

		// driver.findElement(By.tagName("BODY")).sendKeys(Keys.TAB,Keys.ENTER);
		// Thread.sleep(sleepTimeMiliseconds);

		driver.findElement(By.xpath("/html/body/div/section/div[2]/div[2]/div[5]/section/"
				+ "div/span[3]/div/div/span[10]/div/div[2]/div/div[2]/button[1]")).click();

		Thread.sleep(sleepTimeMiliseconds);

		js.executeScript("window.scrollBy(0,2000)");

		File tempFile = scrShot.getScreenshotAs(OutputType.FILE);
		try {
			File screenshot = new File("C:\\Temp\\getstore.png");
			// FileUtils .copyFile(tempFile, screenshot);
			Files.copy(tempFile, screenshot);

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
