package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.IOException;
import java.time.Duration;

import static utils.MainDriver.driver;

public class loginPage extends basePage {
    static By userNameField= By.id("input-email");
    static By passwordField= By.id("input-password");
    static By loginButton= By.xpath("//input[@value='Login']");

    public loginPage() throws IOException {
        super();
        PageFactory.initElements(driver, this);
    }
    static WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(4));
    public static void userEntersCredentils(){

        wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//input[@value='Login']"))));
        Actions action = new Actions(driver);
        action.moveToElement(driver.findElement(userNameField)).sendKeys("saimukund99@gmail.com").moveToElement(driver.findElement(passwordField)).sendKeys("password")
                .build().perform();

    }

    public static void userClicksOnLogin() {
        wait.until(ExpectedConditions.elementToBeClickable(loginButton));
        driver.findElement(loginButton).click();
    }
}
