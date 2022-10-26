package com.ahostiuk.carina.components.ios;

import com.ahostiuk.carina.components.common.FooterMenuBase;
import com.ahostiuk.carina.pages.common.CartPageBase;
import com.ahostiuk.carina.pages.common.CatalogPageBase;
import com.ahostiuk.carina.pages.common.MenuPageBase;
import com.qaprosoft.carina.core.foundation.utils.factory.DeviceType;
import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.foundation.webdriver.locator.ExtendedFindBy;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;

@DeviceType(pageType = DeviceType.Type.IOS_PHONE, parentClass = FooterMenuBase.class)
public class FooterMenu extends FooterMenuBase {

    @ExtendedFindBy(accessibilityId = "tab bar option catalog")
    private ExtendedWebElement catalogButton;

    @ExtendedFindBy(accessibilityId = "tab bar option cart")
    private ExtendedWebElement cartButton;

    @ExtendedFindBy(accessibilityId = "tab bar option menu")
    private ExtendedWebElement menuButton;

    public FooterMenu(WebDriver driver, SearchContext searchContext) {
        super(driver, searchContext);
    }

    public CatalogPageBase openCatalogPage() {
        catalogButton.click(3);
        return initPage(getDriver(), CatalogPageBase.class);
    }

    public CartPageBase openCartPage() {
        cartButton.click(3);
        return initPage(getDriver(), CartPageBase.class);
    }

    public MenuPageBase openMenuPage() {
        menuButton.click(3);
        return initPage(getDriver(), MenuPageBase.class);
    }
}
