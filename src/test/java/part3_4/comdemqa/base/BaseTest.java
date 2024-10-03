package part3_4.comdemqa.base;

import com.demoqa.pages.HomePage;
import com.base.BasePage;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.Duration;
import java.util.logging.FileHandler;

import static Utilities.Utility.setUtilityDriver;
import static com.base.BasePage.delay;
import static java.util.logging.FileHandler.*;

public class BaseTest {
    private WebDriver driver;
    protected BasePage basePage;
    protected HomePage homePage;
    private String DEMOQA_URL = "https://demoqa.com/";

    @BeforeClass
    public void setUp(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    }

    @BeforeMethod
    public void loadApplication(){
        driver.get(DEMOQA_URL);
        basePage = new BasePage();
        basePage.setDriver(driver);
        setUtilityDriver();
        homePage = new HomePage();
    }
    @AfterMethod
    public void takeFailedResultScreenshot(ITestResult testResult){
        if(ITestResult.FAILURE == testResult.getStatus()){
            TakesScreenshot screenshot = (TakesScreenshot) driver;
            File source = screenshot.getScreenshotAs(OutputType.FILE);
            Path destination = Paths.get(System.getProperty("user.dir") + "/resources/screenshots/"+ java.time.LocalDate.now() + testResult.getName() + ".png");
            try {
                Files.createDirectories(destination.getParent());
                Files.copy(source.toPath(), destination);
            }catch (IOException e){
                throw new RuntimeException(e);
            }
            System.out.println("Screenshot Located at "+ destination);
        }
    }

    @AfterClass
    public void tearDown(){
        delay(3000);
        driver.quit();
    }
}
