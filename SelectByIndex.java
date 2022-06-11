package com.selectClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class SelectByIndex {
    @Test
    public void SelectByIndexTest() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\harshal bojja\\IdeaProjects\\SeleniumSession\\src\\driver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.facebook.com/");
        Thread.sleep(2000);
        driver.findElement(By.linkText("Create New Account")).click();
        Thread.sleep(2000);
        driver.findElement(By.name("firstname")).sendKeys("Test123");
        Thread.sleep(2000);
        driver.findElement(By.name("lastname")).sendKeys("Test");
        Thread.sleep(2000);
        driver.findElement(By.name("reg_email__")).sendKeys("test@gmail.com");
        Thread.sleep(2000);
        driver.findElement(By.name("reg_email_confirmation__")).sendKeys("test@gmail.com");
        Thread.sleep(2000);
        driver.findElement(By.name("reg_passwd__")).sendKeys("test@143");
        Thread.sleep(2000);

        Select date = new Select(driver.findElement(By.id("day")));
        date.selectByIndex(19);
        Thread.sleep(2000);

        Select month = new Select(driver.findElement(By.id("month")));
        month.selectByIndex(9);
        Thread.sleep(2000);

        Select year = new Select(driver.findElement(By.id("year")));
        year.selectByIndex(26);
        Thread.sleep(2000);

        driver.findElement(By.xpath("//label[contains(text(),'Female')]")).click();
        Thread.sleep(2000);
        //driver.findElement(By.name("websubmit")).click();
        //driver.close();

    }


}
