package com.ahostiuk.carina.demo;

import com.ahostiuk.carina.enums.BottomTabButtons;
import com.ahostiuk.carina.pages.common.CartPageBase;
import com.ahostiuk.carina.pages.common.CatalogPageBase;
import com.ahostiuk.carina.pages.common.CommonPageBase;
import com.ahostiuk.carina.pages.common.MenuPageBase;
import org.testng.annotations.Test;

import com.qaprosoft.carina.core.foundation.IAbstractTest;
import com.qaprosoft.carina.core.foundation.utils.mobile.IMobileUtils;
import com.qaprosoft.carina.core.foundation.utils.ownership.MethodOwner;


public class MobileSampleTest implements IAbstractTest, IMobileUtils {

    @MethodOwner(owner = "ahostiuk")
    @Test(description = "User can navigate through tabs")
    public void navigationTest() {
        CommonPageBase commonPage = initPage(getDriver(), CommonPageBase.class);
        commonPage.assertPageOpened();
        CartPageBase cartPage = (CartPageBase) commonPage.clickBottomTabButton(BottomTabButtons.CART);
        cartPage.assertPageOpened();
        CatalogPageBase catalogPage = (CatalogPageBase) commonPage.clickBottomTabButton(BottomTabButtons.CATALOG);
        catalogPage.assertPageOpened();
        MenuPageBase menuPage = (MenuPageBase) commonPage.clickBottomTabButton(BottomTabButtons.MENU);
        menuPage.assertPageOpened();
    }
}