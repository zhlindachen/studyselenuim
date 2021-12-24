package selenium_study;
import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

import java.util.concurrent.TimeUnit;

public class Main {

    public static void main(String[] args) throws InterruptedException {
	// write your code here
        System.setProperty("webdriver.gecko.driver", "\\Tools\\geckodriver.exe");
        WebDriver dr=new FirefoxDriver();
        dr.get("http://www.baidu.com");
        dr.findElement(By.id("kw")).sendKeys("新冠病毒");
        dr.findElement(By.id("su")).click();





       // dr.quit();
    }
}
