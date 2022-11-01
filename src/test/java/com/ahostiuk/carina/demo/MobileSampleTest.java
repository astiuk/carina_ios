package com.ahostiuk.carina.demo;

import com.ahostiuk.carina.enums.MenuItem;
import com.ahostiuk.carina.pages.common.*;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.qaprosoft.carina.core.foundation.utils.ownership.MethodOwner;


public class MobileSampleTest extends MyDemoAppBaseTest {

    @MethodOwner(owner = "ahostiuk")
    @Test(description = "User can navigate through tabs")
    public void navigationTest() {
        CatalogPageBase catalogPage = initPage(getDriver(), CatalogPageBase.class);
        catalogPage.assertPageOpened();
        CartPageBase cartPage = catalogPage.getFooterMenu().openCartPage();
        cartPage.assertPageOpened();
        MenuPageBase menuPage = cartPage.getFooterMenu().openMenuPage();
        menuPage.assertPageOpened();
    }

    @MethodOwner(owner = "ahostiuk")
    @Test(description = "User can login with autofill")
    public void loginAutofillTest() {
        CatalogPageBase catalogPage = initPage(getDriver(), CatalogPageBase.class);
        catalogPage.assertPageOpened();
        MenuPageBase menuPage = catalogPage.getFooterMenu().openMenuPage();
        menuPage.assertPageOpened();
        LoginPageBase loginPage = (LoginPageBase) menuPage.clickMenuItem(MenuItem.LOGIN);
        loginPage.assertPageOpened();
        loginPage.loginWithAutofill().assertPageOpened();
    }

    @MethodOwner(owner = "ahostiuk")
    @Test(description = "User can view catalog item description")
    public void viewProductDescriptionTest() {
        CatalogPageBase catalogPage = loginWithAutoFill();
        CatalogProductPageBase catalogProductPage = catalogPage.openProductPageByName(BIKE_LIGHT_NAME);
        Assert.assertEquals(catalogProductPage.getProductDescription(), BIKE_LIGHT_DESCRIPTION,
                String.format("Expected product description %s, actual description %s",
                        BIKE_LIGHT_DESCRIPTION,
                        catalogProductPage.getProductDescription()));
    }

    @MethodOwner(owner = "ahostiuk")
    @Test(description = "User can add catalog item to cart")
    public void addProductToCartTest() {
        CatalogPageBase catalogPage = loginWithAutoFill();
        CatalogProductPageBase catalogProductPage = catalogPage.openProductPageByName(BIKE_LIGHT_NAME);
        catalogProductPage.clickAddToCartButton();
        CartPageBase cartPage = catalogPage.getFooterMenu().openCartPage();
        Assert.assertTrue(cartPage.isItemByNamePresent(BIKE_LIGHT_NAME),
                String.format("%s item is not present", BIKE_LIGHT_NAME));
    }
}
