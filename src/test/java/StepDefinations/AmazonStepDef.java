package StepDefinations;

import Pages.AmazonPages;
import Util.DriverFactory;
import io.cucumber.java.en.*;
import org.openqa.selenium.WebDriver;

public class AmazonStepDef {

    WebDriver driver = DriverFactory.getDriver();
    AmazonPages amazonPages = new AmazonPages(driver);

    @Given("User is on homepage")
    public void user_is_on_homepage() {
        AmazonPages.HomePage();

    }
    @When("Click accept cookies")
    public void click_accept_cookies() {
        AmazonPages.acceptCookie();
    }
    @When("Click the search button")
    public void click_the_search_button() {
        AmazonPages.clickSearch();
    }
    @When("Write product name")
    public void write_product_name() {
        AmazonPages.writeProductName();
    }
    @When("Click search button")
    public void click_search_button() {
        AmazonPages.searchButton();
    }
    @When("Filter for Shipped by Amazon")
    public void filter_for_shipped_by_amazon() {
        AmazonPages.filterAmazon();
    }
    @When("Filter for Apple")
    public void filter_for_apple() {
        AmazonPages.filterApple();
    }
    @When("Click the first product")
    public void click_the_first_product() {
        AmazonPages.firstProduct();
    }
    @When("Add to Cart")
    public void add_to_cart() {
        AmazonPages.addCart();
    }
    @When("Check at cart page")
    public void check_at_cart_page() {
        AmazonPages.checkCart();
    }

}
