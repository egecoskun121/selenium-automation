package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.opera.OperaDriver;

public class Test1 {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
        WebDriver webDriver = new ChromeDriver();

        webDriver.get("https://demoqa.com/text-box");
        webDriver.manage().window().maximize();

        WebElement fullName=webDriver.findElement(By.id("userName"));
        fullName.click();
        fullName.sendKeys("Ege Coşkun");

        WebElement email=webDriver.findElement(new By.ByCssSelector("input.mr-sm-2[id='userEmail']"));
        email.click();
        email.sendKeys("egecoskun4@gmail.com");

        WebElement currentAddress= webDriver.findElement(new By.ByCssSelector(".form-control[placeholder='Current Address']"));
        currentAddress.click();
        currentAddress.sendKeys("İzmir/Karsiyaka");

        WebElement Address = webDriver.findElement(By.id("permanentAddress"));
        Address.click();
        Address.sendKeys("Tuna mah. İsmail özkunt sk.");

        WebElement submitButton= webDriver.findElement(new By.ByCssSelector("button.btn"));
        submitButton.click();





    }
}
