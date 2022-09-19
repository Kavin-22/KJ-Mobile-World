
		import java.util.ArrayList;
import java.util.List;
import java.util.Set;



		import org.openqa.selenium.WebDriver;
		import org.openqa.selenium.WebElement;
		import org.openqa.selenium.support.FindBy;
		import org.openqa.selenium.support.PageFactory;



		public class landingpage {
		    WebDriver driver;
		    public landingpage(WebDriver driver) {
		    this.driver =driver;
		    PageFactory.initElements(driver, this);
		    }
		    // signin
		    @FindBy(xpath= "//button[@class='btn btn-warning my-2 my-sm-0']")
		    WebElement signin;
		    @FindBy(id = "username")
		    WebElement  username;
		    @FindBy(id= "password")
		    WebElement password;
		    @FindBy(xpath="//*[@id=\"submitForm\"]/div[4]/a")
		    WebElement login;
		    public void signin3(String name, String pass) throws InterruptedException {
		        signin.click();
		        username.sendKeys(name);
		        Thread.sleep(1000);
		        password.sendKeys(pass);
		        Thread.sleep(1000);
		        login.click();}
		      
		    // sign up
		        @FindBy(xpath= "//button[@class='btn btn-warning my-2 my-sm-0']")
		        WebElement signin1;
		        //signup
		        @FindBy(linkText="Sign up")
		        WebElement Signup;
		        //firstname
		        @FindBy(css="input[type='text']")
		        WebElement text;
		        //lastname
		        @FindBy(xpath="//input[@placeholder='Last Name']")
		        WebElement lastname;
		        //email-id
		        @FindBy(xpath = "//input[@placeholder='Enter Email']")
		        WebElement Email;
		        //password
		        @FindBy(xpath="//input[@type='Password']")
		        WebElement password1;
		        //DOB
		        @FindBy(xpath="//input[@type='date']")
		        WebElement date;
		        //Gender
		        @FindBy(xpath="//input[@type='radio']")
		        WebElement gender;
		        //phone
		        @FindBy(xpath="//input[@min='0']")
		        WebElement phone1;
		        //message
		        @FindBy(xpath="//textarea[@rows='3']")
		        WebElement message1;
		        //register
		        @FindBy(css="button[type='submit']")
		        WebElement register;
		        public  void main(String firstname,String lname,String emailid,String password,String DOB,String phone,String message ) throws InterruptedException {
		            signin.click();
		            Signup.click();
		        text.sendKeys(firstname);
		        Thread.sleep(500);
		        lastname.sendKeys(lname);
		        Email.sendKeys(emailid);
		        password1.sendKeys(password);
		        date.sendKeys(DOB);
		        gender.click();
		        phone1.sendKeys(phone);
		        message1.sendKeys(message);
		        register.click();}
                
		        // Home
		        
		        @FindBy(id="home")
		    	WebElement home1;
		    	@FindBy(id="navbardropdown")
		    	WebElement latest;
		    	@FindBy(partialLinkText="Samsung")
		    	WebElement Samsung;
		    	@FindBy(partialLinkText="More Details")
		    	WebElement MoreDetails;
		    	@FindBy(className="nav-link")
		    	WebElement buy;
		    	@FindBy(partialLinkText="Lenovo")
		    	WebElement Lenovo;
		    	@FindBy(partialLinkText="Apple")
		    	WebElement Apple;
		    	@FindBy(xpath="//a[@id='navbarDropdown'][contains(.,'Support')]")
		    	WebElement Support;
		    	@FindBy(partialLinkText="Order")
		    	WebElement Order;
		    	@FindBy(partialLinkText="Contact Us")
		    	WebElement contactus;
		    	@FindBy(xpath="/html/body/footer/ul/li[1]/a")
		    	WebElement footerhome;
		    	
		    	public void home() throws InterruptedException {
		    		System.out.println(home1.getText());
		    		latest.click();
		    		delay();
		    		Samsung.click();
		    		MoreDetails.click();
		    		delay();
		    		buy.click();
		    		latest.click();
		    		Apple.click();
		    		delay();
		    		buy.click();
		    		Support.click();
		    		delay();
		    		Set<String> windowHandles=driver.getWindowHandles();
		    		List<String> windowHandlesList = new ArrayList<>(windowHandles);
		    		System.out.println(driver.getWindowHandles());
		    		Order.click();
		    		System.out.println(driver.getWindowHandle());
		    		System.out.println("Total window number" + windowHandlesList.size() +"\n");
		    		home1.click();
		    		Support.click();
		    		delay();
		    		contactus.click();
		    		footerhome.click();
		    		delay();
		    		quit();
	}

				private void quit() {
					// TODO Auto-generated method stub
					
				}

				private void delay() {
					// TODO Auto-generated method stub
					
				}
				
		}

