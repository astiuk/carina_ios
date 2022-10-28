package com.ahostiuk.carina.demo;

import com.ahostiuk.carina.enums.MenuItem;
import com.ahostiuk.carina.pages.common.CatalogPageBase;
import com.ahostiuk.carina.pages.common.LoginPageBase;
import com.qaprosoft.carina.core.foundation.IAbstractTest;
import com.qaprosoft.carina.core.foundation.utils.mobile.IMobileUtils;

public class MyDemoAppBaseTest implements IAbstractTest, IMobileUtils {

    protected final String BIKE_LIGHT_NAME = "Sauce Labs Bike Light";
    protected final String BIKE_LIGHT_DESCRIPTION = "A red light isn't the desired state in testing but it sure " +
            "helps when riding your bike at night. Water-resistant with 3 lighting modes, 1 AAA battery included.";

    protected CatalogPageBase loginWithAutoFill() {
        CatalogPageBase catalogPage = initPage(getDriver(), CatalogPageBase.class);
        LoginPageBase loginPage = (LoginPageBase) catalogPage.getFooterMenu()
                                                             .openMenuPage()
                                                             .clickMenuItem(MenuItem.LOGIN);
        loginPage.loginWithAutofill();
        return catalogPage;
    }
}
