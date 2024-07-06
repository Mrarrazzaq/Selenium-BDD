package org.example.pageObject;

import org.example.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductPage extends BasePage {
    public ProductPage(WebDriver driver) {
        super(driver);
    }

    //judul button
    @FindBy(xpath = "//a[@id='item_4_title_link']")
    private WebElement titleProductSauceLabBackpack;

    //remove from cart button
    @FindBy(id = "remove-sauce-labs-backpack")
    private WebElement btnRemoveSauceLabBackpack;

    //add to cart button
    @FindBy(id = "add-to-cart-sauce-labs-backpack")
    private WebElement btnAddToCardSauceLabsBackpack;

    @FindBy(id = "shopping_cart_container")
    private WebElement cart;

    //verify if remove button is displayed correctly
    public boolean verifyTitleProductSauceLabBackpack(){
        return isDisplayed(titleProductSauceLabBackpack);
    }

    public boolean verifyRemoveButtonDisplayedOnProductSauceLabBackpack(){
        return isDisplayed(btnRemoveSauceLabBackpack);
    }

    public void clickRemoveProductSauceLabBackpack(){
        scrollIntoView(btnRemoveSauceLabBackpack);          //biar layarnya discroll sampai buttonnya terlihat
        waitForElementClickable(btnRemoveSauceLabBackpack); //nunggu sampai buttonnya bisa di click
        click(btnRemoveSauceLabBackpack);                   //click buttonnya
    }

    public boolean verifyAddToCartSauceLabsBackpack(){
        return isDisplayed(btnAddToCardSauceLabsBackpack);
    }

    public void clickAddToCartSauceLabsBackpack(){
        scrollIntoView(btnAddToCardSauceLabsBackpack);
        waitForElementClickable(btnAddToCardSauceLabsBackpack);
        click(btnAddToCardSauceLabsBackpack);
    }

    public void clickCart(){
        waitForElementClickable(cart);
        click(cart);
    }

}
