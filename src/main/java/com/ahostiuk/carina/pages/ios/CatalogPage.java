package com.ahostiuk.carina.pages.ios;

import com.ahostiuk.carina.components.ios.FooterMenu;
import com.ahostiuk.carina.pages.common.CatalogPageBase;
import com.qaprosoft.carina.core.foundation.utils.factory.DeviceType;
import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.foundation.webdriver.decorator.PageOpeningStrategy;
import com.qaprosoft.carina.core.foundation.webdriver.locator.ExtendedFindBy;
import org.openqa.selenium.WebDriver;

@DeviceType(pageType = DeviceType.Type.IOS_PHONE, parentClass = CatalogPageBase.class)
public class CatalogPage extends CatalogPageBase {

    @ExtendedFindBy(iosClassChain = "**/XCUIElementTypeStaticText[`label == \"Products\"`]")
    private ExtendedWebElement productsLabel;

    @ExtendedFindBy(iosPredicate = "value == \"tab list\"")
    private FooterMenu footerMenu;

    public CatalogPage(WebDriver driver) {
        super(driver);
        setPageOpeningStrategy(PageOpeningStrategy.BY_ELEMENT);
        setUiLoadedMarker(productsLabel);
    }

    @Override
    public FooterMenu getFooterMenu() {
        return footerMenu;
    }
}
