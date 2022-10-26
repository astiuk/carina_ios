package com.ahostiuk.carina.demo;

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
}