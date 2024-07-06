package step_definitions;

import hooks.Hooks;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.example.pageObject.ProductPage;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class ProductSteps {

    private final WebDriver driver = Hooks.driver;
    ProductPage productPage = new ProductPage(driver);

    @Then("On the product page verify the saucelabs backpack is displayed")
    public void onTheProductPageVerifyTheSaucelabsBackpackIsDisplayed() {
        Assert.assertTrue(productPage.verifyTitleProductSauceLabBackpack());
        //Assert.assertEquals("expected", "actual"); untuk cek apakah nama produk sama dengan yang akan di cek
        //Assert digunakan untuk verifikasi
    }

    @And("Add to cart button saucelabs backpack is displayed")
    public void addToCartButtonSaucelabsBackpackIsDisplayed() {
        Assert.assertTrue(productPage.verifyAddToCartSauceLabsBackpack());
    }

    @And("Click Add to cart saucelabs backpack")
    public void addToCartSaucelabsBackpack() {
        productPage.clickAddToCartSauceLabsBackpack();
    }

    @And("Remove button on the saucelabs backpack is displayed")
    public void removeButtonOnTheSaucelabsBackpackIsDisplayed() {
        productPage.verifyRemoveButtonDisplayedOnProductSauceLabBackpack();
    }

//    @And("Remove the saucelabs backpack from product list")
//    public void removeTheSaucelabsBackpackFromProductList() {
//        productPage.clickRemoveProductSauceLabBackpack();
//        Assert.assertFalse(productPage.verifyRemoveButtonDisplayedOnProductSauceLabBackpack());
//    }


}
