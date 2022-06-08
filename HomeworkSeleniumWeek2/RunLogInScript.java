package HomeworkSelenium;

import HomeworkSelenium.HomeworkSeleniumWeek2.Registration;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class RunLogInScript extends Registration {

    public static String[] browser = {"chrome","firefox","edge"};
    public static WebDriver driver;
    public static void main(String[] args) throws InterruptedException {
        //. Registration
       Registration reg = new Registration();
       reg.Register();
        //. LogIn
        for (int i =0;i<= browser.length;i++)
        {
            if(browser[i].equals("chrome"))
            {
                //RUN SCRIPT IN  CHROME
                WebDriverManager.chromedriver().setup();
                driver = new ChromeDriver();
                LogIn();

            }
            else if(browser[i].equals("firefox"))
            {
                // RUN SCRIPT IN FIREFOX
                WebDriverManager.firefoxdriver().setup();
                driver = new FirefoxDriver();
                LogIn();
            }
            else if(browser[i].equals("edge"))
            {
                //RUN SCRIPT IN EDGE
                WebDriverManager.edgedriver().setup();
                driver = new EdgeDriver();
                LogIn();
            }

        }

    }

    public static void LogIn() throws InterruptedException
    {
        driver.manage().window().maximize();  // MAXIMISING BROWSER WINDOW
        driver.get("https://demo.nopcommerce.com/");  // OPENING WEBSITE INTO BROWSER

        driver.findElement(By.className("ico-login")).click();  //FIND LOGIN WEB ELEMENT AND CLICK ON THAT
        driver.findElement(By.id("Email")).sendKeys("BigBachhan@bollywood.com");//FIND EMAIL WEB ELEMENT AND PASS EMAIL DETAIL TO LOGIN
        Thread.sleep(2000);
        driver.findElement(By.id("Password")).sendKeys("Amitabh1234"); //FIND PASSWORD WEB ELEMENT AND PASSING VALUE
        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[@class='button-1 login-button']")).click(); //FIND LOGIN BUTTON AND CLICK TO LOGIN
        Thread.sleep(3000);
        driver.findElement(By.className("ico-logout")).click(); //FIND LOGOUT ELEMENT AND LOG OUT FROM ACCOUNT
        Thread.sleep(3000);
        driver.close();//CLOSE THE BROWSER
    }

}
