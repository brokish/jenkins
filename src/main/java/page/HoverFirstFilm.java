package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class HoverFirstFilm {
    private WebDriver driver;
    @FindBy(xpath = "//div[@class='MenuItems container']//img[@alt='Alternate Text']")
    private List<WebElement> movieList;

    @FindBy(xpath = "//div[@class='movies-deal'][1]//p[contains(text(),'ყიდვა')]")
    private WebElement buyMovieButton;

    public HoverFirstFilm(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    public List<WebElement> getMovieList() {
        return movieList;
    }

    public WebElement getBuyMovieButton() {
        return buyMovieButton;
    }
}