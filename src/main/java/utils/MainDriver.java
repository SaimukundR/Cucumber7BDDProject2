package utils;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

public class MainDriver {
    private static MainDriver mainDriver;
    public static WebDriver driver;
    private WebDriverWait waitDriver;
    public static Properties OR = new Properties();
    public static Properties config = new Properties();

    private MainDriver() throws IOException {
        loadProperties();
        if (config.getProperty("browser").equals("chrome")) {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
        } else if (config.getProperty("browser").equals("firefox")) {
            WebDriverManager.firefoxdriver().setup();
            driver = new FirefoxDriver();
        }

        driver.manage().window().maximize();
        waitDriver = new WebDriverWait(driver, Duration.ofSeconds(Integer.parseInt(config.getProperty("explicit.wait"))));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(Integer.parseInt(config.getProperty("implicit.wait"))));
    }

    private void loadProperties() throws IOException {
        try (FileInputStream fisOR = new FileInputStream("src/main/resources/Properties/OR.properties");
             FileInputStream fisConfig = new FileInputStream("src/main/resources/Properties/config.properties")) {
            OR.load(fisOR);
            config.load(fisConfig);
        }
    }

    public static MainDriver getInstance() throws IOException {
        if (mainDriver == null) {
            mainDriver = new MainDriver(); // Initialize once
        }
        return mainDriver;
    }

    public static WebDriver getDriver() {
        return driver;
    }

    public WebDriverWait getWaitDriver() {
        return waitDriver;
    }

    public static void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }

    public static void openWebpage(String url) {
        getDriver().get(url); // Ensure driver is initialized
    }
}
