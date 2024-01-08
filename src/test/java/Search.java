import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Search {
    public static void main(String[] args) {
        // Set the path to your ChromeDriver executable
        System.setProperty("webdriver.chrome.driver", "C:\\Java\\untitled\\src\\main\\resources\\chromedriver.exe");

        // Create a new instance of the ChromeDriver
        WebDriver driver = new ChromeDriver();

        // Test Case 1: Valid Search
        validSearchTest(driver);

        // Test Case 2: Invalid Search
        invalidSearchTest(driver);

        // Close the browser
        driver.quit();
    }

    private static void validSearchTest(WebDriver driver) {
        // Navigate to the nopCommerce demo site
        driver.get("http://demo.nopcommerce.com");

        // Find the search input field and enter a valid search query
        WebElement searchInput = driver.findElement(By.id("small-searchterms"));
        searchInput.sendKeys("laptop");

        // Submit the search form
        searchInput.submit();

        // Wait for some time (you may need to implement proper waits)
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Validate that search results are displayed (you can add assertion here)
    }

    private static void invalidSearchTest(WebDriver driver) {
        // Navigate to the nopCommerce demo site
        driver.get("http://demo.nopcommerce.com");

        // Find the search input field and enter an invalid search query
        WebElement searchInput = driver.findElement(By.id("small-searchterms"));
        searchInput.sendKeys("InvalidTestData");

        // Submit the search form
        searchInput.submit();

        // Wait for some time (you may need to implement proper waits)
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Validate that no search results are displayed (you can add assertion here)
    }
}
