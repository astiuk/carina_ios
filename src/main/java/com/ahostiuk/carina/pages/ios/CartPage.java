package com.ahostiuk.carina.pages.ios;

import com.ahostiuk.carina.components.ios.FooterMenu;
import com.ahostiuk.carina.pages.common.CartPageBase;
import com.qaprosoft.carina.core.foundation.utils.factory.DeviceType;
import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.foundation.webdriver.decorator.PageOpeningStrategy;
import com.qaprosoft.carina.core.foundation.webdriver.locator.ExtendedFindBy;
import org.openqa.selenium.WebDriver;

@DeviceType(pageType = DeviceType.Type.IOS_PHONE, parentClass = CartPageBase.class)
public class CartPage extends CartPageBase {

    @ExtendedFindBy(iosPredicate = "name == \"No Items\" OR name == \"My Cart\"")
    private ExtendedWebElement labelNoItemsOrMyCart;

    @ExtendedFindBy(iosPredicate = "value == \"tab list\"")
    private FooterMenu footerMenu;

    @ExtendedFindBy(iosClassChain = "**/XCUIElementTypeStaticText[`label == \"%s\"`]")
    private ExtendedWebElement itemLabel;

    public CartPage(WebDriver driver) {
        super(driver);
        setPageOpeningStrategy(PageOpeningStrategy.BY_ELEMENT);
        setUiLoadedMarker(labelNoItemsOrMyCart);
    }

    @Override
    public FooterMenu getFooterMenu() {
        return footerMenu;
    }

    @Override
    public boolean isItemByNamePresent(String name) {
        swipe(itemLabel.format(name), Direction.UP, 5, 500);
        return itemLabel.format(name).isPresent(3);
    }
}
