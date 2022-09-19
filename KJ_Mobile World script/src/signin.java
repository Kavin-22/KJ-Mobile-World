import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;



import com.google.common.base.Objects;



public class signin {
@Test(dataProvider = "datas")
    public void signin3(String username, String password) throws InterruptedException {
        // TODO Auto-generated method stub
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\kavin.kumar\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://mobileworld.banyanpro.com/");
        
        landingpage landing = new landingpage(driver);
        landing.signin3(username, password);
}




         



@DataProvider
public Object[][] datas(){
    Object[][] data = new Object[4][2];
    // username correct , password wrong
    data[0][0]="Kavin";
    data[0][1]="h1";
    
    // username wrong , password correct
    data[1][0]="Ka";
    data[1][1]="hr1234";
    // both are wrong
    data[2][0]="asdfghjkghjkertyuidfghxcvbfrghjkvbn";
    data[2][1]="aaaaaassssssssssssss1234567890uytrewsdfghnbvf45678";
    
    // username correct , password nil
    data[3][0]="Kavin";
    data[3][1]="";
    
    



   return data;
    
        }





   }