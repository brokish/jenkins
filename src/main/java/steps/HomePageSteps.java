package steps;

import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import page.HomePage;

public class HomePageSteps {
    private WebDriver driver;
    private HomePage homePage;

    public HomePageSteps(WebDriver driver) {
        this.driver = driver;
        homePage = new HomePage(driver);
    }
    @Step("click on movies link")
    public void clickMoviesLink() {
        homePage.moviesLink.click();
    }

}
