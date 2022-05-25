package HomeworkSelenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchBrowser {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","C:\\Users\\rohitPatel\\IdeaProjects\\Software\\Driver\\chromedriver.exe");
        System.setProperty("webdriver.gecko.driver","C:\\Users\\rohitPatel\\IdeaProjects\\Software\\Driver\\geckodriver.exe");
        System.setProperty("webdriver.edge.driver","C:\\Users\\rohitPatel\\IdeaProjects\\Software\\Driver\\msedgedriver.exe");


        // Bewlow I created instance of different browsers
       WebDriver chro = new ChromeDriver();
        chro.get("https://demo.nopcommerce.com/");
       WebDriver fire = new FirefoxDriver();
        fire.get("https://demo.nopcommerce.com/");
       WebDriver edge = new EdgeDriver();

       edge.get("https://demo.nopcommerce.com/");


    }
}
