import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class SeleniumFirst {

    WebDriver webDriver = new ChromeDriver();

    @Test
    public void firstTest()
    {
        System.setProperty("webdriver.chrome.driver","D:\\Harsh\\Selenium-udemy\\SelemiumTest\\chromedriver.exe");
        webDriver.get("https://www.expedia.ca/");
        webDriver.manage().window().maximize();

        webDriver.findElement(By.xpath("//button[@aria-label='Going to']")).click();

        webDriver.findElement(By.id("location-field-destination")).sendKeys("Ahmedabad");
    }




}
