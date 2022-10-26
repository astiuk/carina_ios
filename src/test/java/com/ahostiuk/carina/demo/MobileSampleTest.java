package com.ahostiuk.carina.demo;

import com.ahostiuk.carina.enums.MenuItem;
import com.ahostiuk.carina.pages.common.CartPageBase;
import com.ahostiuk.carina.pages.common.CatalogPageBase;
import com.ahostiuk.carina.pages.common.LoginPageBase;
import com.ahostiuk.carina.pages.common.MenuPageBase;
import com.ahostiuk.carina.pages.common.CartPageBase;
import com.ahostiuk.carina.pages.common.CatalogPageBase;
import com.ahostiuk.carina.pages.common.MenuPageBase;
import org.testng.annotations.Test;

import com.qaprosoft.carina.core.foundation.IAbstractTest;
import com.qaprosoft.carina.core.foundation.utils.mobile.IMobileUtils;
import com.qaprosoft.carina.core.foundation.utils.ownership.MethodOwner;


public class MobileSampleTest implements IAbstractTest, IMobileUtils {

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
}