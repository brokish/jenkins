import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import steps.HomePageSteps;
import steps.HoverFirstFilmSteps;


public class SeleniumProject {
    private WebDriver driver;
    private HoverFirstFilmSteps hoverFirstFilmSteps;
    private HomePageSteps homePageSteps; // Declare HomePageSteps at the class level

    @BeforeMethod
    public void setUp() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver(options);
        hoverFirstFilmSteps = new HoverFirstFilmSteps(driver);
        homePageSteps = new HomePageSteps(driver); // Initialize HomePageSteps
    }

    @Test
    public void test() throws InterruptedException {
        driver.get("https://swoop.ge/");

        // Adding a sleep of 5 seconds (5000 milliseconds)
        Thread.sleep(5000);

        // Now you can use the steps from HomePageSteps and HoverFirstFilmSteps
        homePageSteps.clickMoviesLink(); // Call the method using parentheses
//        hoverFirstFilmSteps.clickMovieToBuy(0); // Replace '0' with the desired movie index
    }
}