package HomeworkSelenium.HomeworkSeleniumWeek2;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Registration {


            public void Register() throws InterruptedException {
                    WebDriverManager.chromedriver().setup();
                    ChromeDriver driver = new ChromeDriver();
                    driver.manage().window().maximize();
                    driver.get("https://demo.nopcommerce.com/");
                    Thread.sleep(3000);
                    driver.findElement(By.xpath("//a[@href=\"/register?returnUrl=%2F\"]")).click();
                    Thread.sleep(3000);
                    driver.findElement(By.className("male")).click();
                    //Thread.sleep(2000);
                    driver.findElement(By.id("FirstName")).sendKeys("Amitabh");
                    // Thread.sleep(2000);
                    driver.findElement(By.id("LastName")).sendKeys("Bachhan");
                    // Thread.sleep(2000);

                    WebElement day = driver.findElement(By.name("DateOfBirthDay"));
                    WebElement month = driver.findElement(By.name("DateOfBirthMonth"));
                    WebElement year = driver.findElement(By.name("DateOfBirthYear"));

                    Select select = new Select(day);
                    select.selectByVisibleText("1");
                    //Thread.sleep(2000);
                    Select select1 = new Select(month);
                    select1.selectByVisibleText("January");
                    // Thread.sleep(2000);
                    Select select2 = new Select(year);
                    select2.selectByVisibleText("2000");
                    // Thread.sleep(2000);
                    driver.findElement(By.id("Email")).sendKeys("BigBachhan@bollywood.com");
                    Thread.sleep(2000);
                    driver.findElement(By.id("Company")).sendKeys("ABCL LIMITED");
                    Thread.sleep(4000);
                    driver.findElement(By.xpath("//input[@id='Newsletter']")).click();
                    Thread.sleep(4000);
                    driver.findElement(By.id("Password")).sendKeys("Amitabh123");
                    Thread.sleep(2000);
                    driver.findElement(By.id("ConfirmPassword")).sendKeys("Amitabh123");
                    Thread.sleep(2000);
                    driver.findElement(By.id("register-button")).click();
                    Thread.sleep(4000);
                    driver.close();
            }

        }


