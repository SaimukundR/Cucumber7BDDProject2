package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;

import static utils.MainDriver.driver;

public class homePage extends basePage{

    public homePage() throws IOException {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//a[@title='My Account']")
    static WebElement myAccountButton;

    @FindBy(xpath = "//a[normalize-space()='Login']")
    static WebElement loginButton;

//public static void userNavigatesToLoginPage(){
//    WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(4));
//       driver.findElement(By.xpath("//a[@title='My Account']")).click();
//       wait.until(ExpectedConditions.visibilityOf(loginButton));
//       driver.findElement(By.xpath("//a[normalize-space()='Login']")).click();
//
//}



}

