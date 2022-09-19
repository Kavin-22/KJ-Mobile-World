import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;



public class signup {
    @Test(dataProvider = "datas")
    public  void main(String firstname,String lastname,String emailid,String password,String DOB,String phone,String message ) throws InterruptedException {
        // TODO Auto-generated method stub
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\kavin.kumar\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://mobileworld.banyanpro.com/");
        
        landingpage landing = new landingpage(driver);
        landing.main(firstname, lastname, emailid, password, DOB, phone, message);


   }
@DataProvider
public Object[][] datas(){
Object[][] data = new Object[3][7];
    //all correct
    data[0][0] = "Kavin";
    data[0][1] = "Kumar";
    data[0][2] = "kj@gmail.com";
    data[0][3] = "accepted";
    data[0][4] = "13/06/2000";
    data[0][5] = "8144114005";
    data[0][6] = "Heyy YOU!!!";
    
    //firstname correct
    data[1][0] = "Kavin";
    //lastname wrong
    data[1][1] = "k";
    //emailwrong
    data[1][2] = "KJ@gmail.com";
    //password wrong
    data[1][3] = "ac";
    //DOB correct
    data[1][4] = "13/06/2000";
    //phone wrong
    data[1][5] = "81441";
    //message wrong
    data[1][6] = "";
    
    //firstname wrong
    data[2][0] = "Ka";
    //lastname correct
    data[2][1] = "kumar";
    //email correct
    data[2][2] = "KJ@gmail.com";
    //password wrong
    data[2][3] = "01092000";
    //DOB correct
    data[2][4] = "13/06/2000";
    //phone wrong
    data[2][5] = "8144114005111111111";
    //message correct
    data[2][6] = "Heyy YOU!!!";



   
    return data;
     
}
private void quit() {
	// TODO Auto-generated method stub
	
}
}