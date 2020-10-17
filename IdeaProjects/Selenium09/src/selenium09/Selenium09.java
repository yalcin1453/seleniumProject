package selenium09;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Arrays;
import java.util.Properties;

public class Selenium09 {

    public static void main(String[] args)  {


System.setProperty("webdriver.chrome.driver","C:/Users/fatih/Documents/selenium dependencies/driver/chromedriver.exe");

WebDriver  driver= new ChromeDriver();
driver.get("https://www.google.com/");
driver.manage().window().maximize();
driver.manage().window().fullscreen();











}





}














































