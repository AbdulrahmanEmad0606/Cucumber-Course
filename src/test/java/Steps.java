import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Steps {
    private WebDriver driver;
    @Given("the user in the login page of the para bank application")
    public void the_user_in_the_login_page_of_the_para_bank_application() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("http://parabank.parasoft.com/parabank/index.htm");
    }
    @When("the user enter valid credentials")
    public void the_user_enter_valid_credentials() {
        driver.findElement(By.name("username")).sendKeys("abdo123");
        driver.findElement(By.name("password")).sendKeys("123456");
        driver.findElement(By.name("username")).submit();
    }
    @Then("the user should be token to the overview page")
    public void the_user_should_be_token_to_the_overview_page() {
        driver.findElement(By.xpath("//*[@id=\"leftPanel\"]/ul/li[8]/a")).click();
    }
}