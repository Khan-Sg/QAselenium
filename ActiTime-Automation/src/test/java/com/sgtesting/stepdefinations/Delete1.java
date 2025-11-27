package com.sgtesting.stepdefinations;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.ResponseCodec;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.net.HttpURLConnection;
import java.net.URL;
import java.time.Duration;
import java.util.List;

public class Delete1{
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.google.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
        List<WebElement> link=driver.findElements(By.tagName("a"));
        for(WebElement links:link){
            System.out.println(links.getText()+"-->"+links.getAttribute("href"));
            String url=links.getAttribute("href");
            if(url==null||url.isEmpty()){
                System.out.println("empty links");
                continue;
            }try {
                HttpURLConnection conn=(HttpURLConnection) new URL(url).openConnection();
              conn.setRequestMethod("HEAD");
              conn.connect();
              int response=conn.getResponseCode();
              if(response>=400){
                  System.out.println("Broken list"+url+response);
              }else{
                  System.out.println("valid links"+url+response);
              }
            }catch (Exception e){
                System.out.println("Error checking url"+url+e.getMessage());
            }
        }driver.quit();
        }
    }



