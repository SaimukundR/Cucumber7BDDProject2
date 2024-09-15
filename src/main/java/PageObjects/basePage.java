package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.MainDriver;

import java.io.IOException;
import java.time.Duration;

import static utils.MainDriver.driver;

public class basePage {
    protected static WebDriverWait waitDriver;

    // Constructor to accept WebDriver instance
    public basePage() throws IOException, IOException {
        if (driver == null) {
            driver = MainDriver.getDriver();

        }
        PageFactory.initElements(driver, this);
    }

    // Utility method for navigation
    public static void userNavigatesToLoginPage(){
        WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(4));
        driver.findElement(By.xpath("//a[@title='My Account']")).click();
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//a[normalize-space()='Login']"))));
        driver.findElement(By.xpath("//a[normalize-space()='Login']")).click();

    }
}
