package com.Base_Class;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class Base_Class {

	public static WebDriver driver;
	public static String value;
	public static Logger log;

	public static WebDriver getBrowser(String type) {

		if (type.equalsIgnoreCase("chrome")) {

			System.setProperty("webdriver.chrome.driver",
					System.getProperty("user.dir") + "//Driver//chromedriver.exe");

			driver = new ChromeDriver();
			driver.manage().window().maximize();

		}

		else if (type.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver",
					System.getProperty("user.dir") + "//Driver//firefoxdriver.exe");
			driver = new FirefoxDriver();

		}
		return driver;

	}

	public static void alert(String type, String value) {
		Alert alert = driver.switchTo().alert();
		if (type.equalsIgnoreCase("accept")) {
			alert.accept();
		} else if (type.equalsIgnoreCase("dimiss")) {
			alert.dismiss();

		} else if (type.equalsIgnoreCase("sendvalue")) {
			alert.sendKeys(value);
			alert.accept();

		}

	}

	public static void url(String url) {
		driver.get(url);

	}

	public static void clickOnElement(WebElement element) {
		element.click();
	}

	public static void inputValueOnElement(WebElement element, String value) {
		element.clear();
		element.sendKeys(value);
	}

	public static void implictlyWait(int num, TimeUnit type) {// -------------implicit wait methods

		driver.manage().timeouts().implicitlyWait(num, type);
	}

	public static void scroll(String type, String value, WebElement element) {// --------scrolling method
		JavascriptExecutor js = (JavascriptExecutor) driver;
		if (type.equalsIgnoreCase("scrollby")) {

			js.executeScript(value);

		} else if (type.equalsIgnoreCase("scrollinto")) {

			js.executeScript("arguments[0].scrollIntoView()", element);

		}

	}

	public static void explicitwait(int sec, String type, WebElement element, List<WebElement> listelements) {// -------
																												// explicit
																												// wait
																												// methods
		WebDriverWait wait = new WebDriverWait(driver, sec);

		if (type.equalsIgnoreCase("visibleofelement")) {
			wait.until(ExpectedConditions.visibilityOf(element));
		} else if (type.equalsIgnoreCase("visibleofallelements")) {
			wait.until(ExpectedConditions.visibilityOfAllElements(listelements));
		} else if (type.equalsIgnoreCase("alert")) {
			wait.until(ExpectedConditions.alertIsPresent());
		}
	}

	public static void drpdown(String type, String value, WebElement element) {
		Select sc = new Select(element);
		String s = type;
		switch (s) {
		case "index":
			int num = Integer.parseInt(value);
			sc.selectByIndex(num);
			break;
		case "value":

			sc.selectByValue(value);
			break;
		case "text":

			sc.selectByVisibleText(value);
			;
			break;

		default:
			System.out.println("invalid type");
			break;
		}
	}

	public static String readDataSheetAt(String path, int sheetindex, int rownum, int cellnum) throws IOException {
		File fi = new File(path);
		FileInputStream fis = new FileInputStream(fi);
		Workbook w = new XSSFWorkbook(fis);

		Cell cell = w.getSheetAt(sheetindex).getRow(rownum).getCell(cellnum);
		CellType cellType = cell.getCellType();

		if (cellType.equals(CellType.NUMERIC)) {
			double numericCellValue = cell.getNumericCellValue();
			int num = (int) numericCellValue;
			value = Integer.toString(num);
		}

		else if (cellType.equals(CellType.STRING)) {
			value = cell.getStringCellValue();
		}
		w.close();
		return value;

	}

	public static String readDataSheet(String path, String sheetname, int rownum, int cellnum) throws IOException {
		File fi = new File(path);
		FileInputStream fis = new FileInputStream(fi);
		Workbook w = new XSSFWorkbook(fis);

		Cell cell = w.getSheet(sheetname).getRow(rownum).getCell(cellnum);
		DataFormatter dft = new DataFormatter();
		String value = dft.formatCellValue(cell);

		w.close();
		return value;

	}

	public static void actions(String type, WebElement element) {// --------actions class methods
		Actions act = new Actions(driver);

		if (type.equalsIgnoreCase("click")) {
			act.click(element).build().perform();

		} else if (type.equalsIgnoreCase("doubleclick")) {
			act.doubleClick(element).build().perform();
		} else if (type.equalsIgnoreCase("rightclick")) {
			act.contextClick(element).build().perform();
		} else if (type.equalsIgnoreCase("moveToElement")) {
			act.moveToElement(element).build().perform();
		}
	}

	public static String getTitle() {
		String title = driver.getTitle();
		return title;

	}

	public void hardAssertEquals(String expected, String actual) {
		Assert.assertEquals(expected, actual);
	}

	public void logMsg(String msg) {

		if (log == null) {
			log = Logger.getLogger(getClass());
		}

		PropertyConfigurator.configure("log4j.properties");
		log.info(msg);

	}

	public void framesIndex(Integer index) {

		driver.switchTo().frame(index);

	}
	
	public void framesDefaultContent() {
		driver.switchTo().defaultContent();

	}
	public static void quit() {
		driver.quit();
	}
	public void close() {
		driver.close();

	}

}
