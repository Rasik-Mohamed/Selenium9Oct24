package Basic;

import java.io.File;
import java.io.IOException;
import java.nio.file.Paths;
import java.time.Duration;
import java.util.List;
import java.util.Set;
import java.util.ArrayList;
import java.util.Arrays;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.io.Files;

import org.apache.commons.io.FileUtils.*;

public class Interview {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
        int[] x = {3,4,5,3,6,5,7,8,6};
        
        int uniqueCount = 0;

        // Loop through the original array
        for (int i = 0; i < x.length; i++) {
            boolean isDuplicate = false;

            // Check if the current element is already in the unique part of the array
            for (int j = 0; j < uniqueCount; j++) {
            	/*System.out.println("*********************");
        		System.out.println(x[i]);
        		System.out.println(x[j]);*/
                if (x[i] == x[j]) {
                    isDuplicate = true;
                    break;
                }
            }

            // If it's not a duplicate, add it to the unique part
            if (!isDuplicate) {
                x[uniqueCount] = x[i];
                uniqueCount++;
            }
        }

        // Create a new array for the unique elements
        int[] uniqueArray = new int[uniqueCount];
        System.arraycopy(x, 0, uniqueArray, 0, uniqueCount);
        System.out.println("The second largest number is: " + Arrays.toString(uniqueArray));	
        
   /*
        
        
        
        Arrays.sort(x);
        String[] strarr = new String[x.length];
       
        
        
        int[] newarr = new int[x.length];
        int[] temp = new int[x.length];
        
        for(int i=0;i<x.length;i++){
        	int counter = 0;
        	for(int j=0;j<x.length;j++) {
        		System.out.println("*********************");
        		System.out.println(x[i]);
        		System.out.println(x[j]);
        		if(x[i]==x[j]) {
        			counter=counter+1;
        		}
        		
        	}
        	
        	if(counter>1) {
        		int val = x[i];
        		String strval = String.valueOf(val);
        		strarr[i]=strval;
        		
        		//temp[i]=x[i];
        		//System.out.println(strarr[i]);
            	
        	}else if(counter==1) {
        		newarr[i]=x[i];
        		System.out.println(newarr[i]);
        	}
        }

        System.out.println("The second largest number is: " + Arrays.toString(newarr));	
        System.out.println("*****************************************");
		
		*/
		
		
		/* System.setProperty("webdriver.chrome.driver","E:\\\\\\\\Selenium Drivers\\\\\\\\chromedriver-win32_127.0.6533.88\\\\\\\\chromedriver-win32\\\\\\\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
		
		WebElement xx = driver.findElement(By.xpath("//div[@id='product-list-wrap']/div"));
		File fis = xx.getScreenshotAs(OutputType.FILE);
		FileHandler.copy(fis, new File(""));
		
		
		System.out.println(xx.getRect().getDimension().getHeight());
		System.out.println(xx.getRect().getDimension().getHeight());
		
		
		String str = "Keep moving forward always";
	    
	    String[] sa = str.split("\\s");
	    
	    System.out.println("Input String is : "+Arrays.toString(sa));
	    String finval = "", out ="";
	    Boolean flg = false;
	    
	    for(int i=0;i<sa.length;i++){
	        flg = false;
	        if(i==2) {
	        	flg=true;
	        	String sval = sa[i];
	            String[] sarry = sval.split("(?!^)");
	            
	            for(int j=sarry.length-1;j>=0;j--){
	                out = out+sarry[j];
	            }	            
	        }	        

	        if(flg) {
	        	finval = finval+ " " +out;
	        }else {
	        	finval = finval+ " " + sa[i];
	        }
	                
	    }
	    System.out.println("Output String is : " +finval);
	    
	    */
		

}
}

/*
 * System.setProperty("webdriver.chrome.driver",
 * "E:\\\\\\\\Selenium Drivers\\\\\\\\chromedriver-win32_127.0.6533.88\\\\\\\\chromedriver-win32\\\\\\\\chromedriver.exe"
 * ); WebDriver driver = new ChromeDriver();
 * driver.manage().window().maximize();
 * 
 * driver.get("http://example.com"); String parent = driver.getWindowHandle();
 * driver.switchTo().newWindow(WindowType.TAB);
 * driver.switchTo().newWindow(WindowType.TAB);
 * driver.switchTo().newWindow(WindowType.TAB);
 * driver.switchTo().newWindow(WindowType.TAB);
 * 
 * for(String child:driver.getWindowHandles()) { if(!parent.equals(child)) {
 * driver.switchTo().window(child); System.out.println(driver.getTitle() +
 * "Window -" + child); }
 * 
 * } driver.switchTo().window(parent);
 */
/*
 * List<String> childstr = new ArrayList<>(driver.getWindowHandles()); String
 * childname = childstr.get(3); driver.switchTo().window(childname);
 */

/*
 * 
 * 
 * System.setProperty("webdriver.chrome.driver",
 * "E:\\\\Selenium Drivers\\\\chromedriver-win32_127.0.6533.88\\\\chromedriver-win32\\\\chromedriver.exe"
 * ); WebDriver driver = new ChromeDriver();
 * driver.manage().window().maximize();
 * 
 * driver.get("http://example.com");
 * 
 * driver.switchTo().newWindow(WindowType.TAB);
 * driver.switchTo().newWindow(WindowType.TAB);
 * driver.switchTo().newWindow(WindowType.TAB);
 * driver.switchTo().newWindow(WindowType.TAB);
 * 
 * List<String> windstr = new ArrayList<>(driver.getWindowHandles()); String
 * child = windstr.get(3); driver.switchTo().window(child);
 * 
 */

/*
 * driver.executescript("window.open('http://example.org', '_blank');");// #
 * Open second tab
 * driver.execute_script("window.open('http://example.net', '_blank');");// #
 * Open third tab
 * driver.execute_script("window.open('http://example.edu', '_blank');");// #
 * Open fourth tab
 * driver.execute_script("window.open('http://example.fg', '_blank');");// #
 * Open fifth tab
 */

/*
 * System.setProperty("webdriver.chrome.driver",
 * "E:\\\\Selenium Drivers\\\\chromedriver-win32_127.0.6533.88\\\\chromedriver-win32\\\\chromedriver.exe"
 * ); WebDriver driver = new ChromeDriver();
 * driver.manage().window().maximize();
 * 
 * 
 * driver.get("https://kite.zerodha.com/chart/web/ciq/BSE/SUZLON/136362756");
 * 
 * //Step7: Get product value String ProValue = driver.findElement(By.xpath(
 * "(//span[contains(text(),'MRP:')]/parent::div//span[@class='css-1jczs19'])[1]"
 * )).getText(); System.out.println("Product Value :" + ProValue);
 * 
 * 
 * /* driver.get(
 * "https://www.nykaa.com/wellness/wellness-equipment/weighing-scales/c/19863");
 * 
 * //Step4: Scroll down to the product Menu Actions at = new Actions(driver);
 * at.moveToElement(driver.findElement(By.xpath("//span[text()='Preference']")))
 * .perform();
 * 
 * //Step5: Get count of the Total Product List<WebElement> ss =
 * driver.findElements(By.xpath("//div[@id='product-list-wrap']/div"));
 * System.out.println("Total Product count :" + ss.size());
 * 
 * //Step6: Click on 5th Product
 * driver.findElement(By.xpath("//div[@id='product-list-wrap']/div[5]")).click()
 * ;
 */

/*
 * //Step1: launch a browser driver.get("https://www.nykaa.com/");
 * driver.manage().window().maximize();
 * 
 * Boolean islogo =
 * driver.findElement(By.xpath("//a[@title='logo']")).isDisplayed(); if(islogo)
 * { System.out.println("Page Loaded"); }else {
 * System.out.println("Page Not Loaded"); }
 * 
 * 
 * //Step2: click on Nutritional Supplements Actions at = new Actions(driver);
 * at.moveToElement(driver.findElement(By.xpath("//a[text()='mom & baby']"))).
 * perform();
 * 
 * WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
 * wait.until(ExpectedConditions.visibilityOfElementLocated(By.
 * xpath("//a[contains(text(),'Nutritional Supplements')]")));
 * 
 * 
 * driver.findElement(By.xpath("//a[contains(text(),'Nutritional Supplements')]"
 * )).click();
 * 
 * //Step3: Navigate to the new Window String parent = driver.getWindowHandle();
 * 
 * for(String child: driver.getWindowHandles()){ if(!parent.equals(child)){
 * driver.switchTo().window(child); System.out.println(driver.getTitle());
 * String msg =
 * driver.findElement(By.xpath("//div[@class='cf-error-details-wrapper']/div/h1"
 * )).getText(); System.out.println(msg); } }
 */

/*
 * System.setProperty("webdriver.chrome.driver",
 * "E:\\\\Selenium Drivers\\\\chromedriver-win32_127.0.6533.88\\\\chromedriver-win32\\\\chromedriver.exe"
 * ); WebDriver driver = new ChromeDriver();
 * driver.manage().window().maximize();
 * 
 * 
 * driver.get(
 * "https://www.nykaa.com/igrid-bluetooth-digital-body-fat-weight-machine-with-alfit-app-black/p/5069637?productId=5069637&pps=5"
 * );
 * 
 * //Step7: Get product value String ProValue = driver.findElement(By.xpath(
 * "(//span[contains(text(),'MRP:')]/parent::div//span[@class='css-1jczs19'])[1]"
 * )).getText(); System.out.println("Product Value :" + ProValue);
 */

/*
 * driver.get(
 * "https://www.nykaa.com/wellness/wellness-equipment/weighing-scales/c/19863");
 * 
 * //Step4: Scroll down to the product Menu Actions at = new Actions(driver);
 * at.moveToElement(driver.findElement(By.xpath("//span[text()='Preference']")))
 * .perform();
 * 
 * //Step5: Get count of the Total Product List<WebElement> ss =
 * driver.findElements(By.xpath("//div[@id='product-list-wrap']/div"));
 * System.out.println("Total Product count :" + ss.size());
 * 
 * //Step6: Click on 5th Product
 * driver.findElement(By.xpath("//div[@id='product-list-wrap']/div[5]")).click()
 * ;
 */
