package com.ahostiuk.carina.pages.ios;

import com.ahostiuk.carina.enums.MenuItem;
import com.ahostiuk.carina.pages.common.MenuPageBase;
import com.qaprosoft.carina.core.foundation.utils.factory.DeviceType;
import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.foundation.webdriver.decorator.PageOpeningStrategy;
import com.qaprosoft.carina.core.foundation.webdriver.locator.ExtendedFindBy;
import com.qaprosoft.carina.core.gui.AbstractPage;
import org.openqa.selenium.WebDriver;

@DeviceType(pageType = DeviceType.Type.IOS_PHONE, parentClass = MenuPageBase.class)
public class MenuPage extends MenuPageBase {

    @ExtendedFindBy(accessibilityId = "close menu")
    private ExtendedWebElement closeButton;

    @ExtendedFindBy(accessibilityId = "%s")
    private ExtendedWebElement menuItem;

    public MenuPage(WebDriver driver) {
        super(driver);
        setPageOpeningStrategy(PageOpeningStrategy.BY_ELEMENT);
        setUiLoadedMarker(closeButton);
    }

    @Override
    public AbstractPage clickMenuItem(MenuItem item) {
        menuItem.format(item.getAccessibilityId()).click(3);
        return initPage(getDriver(), item.getClazz());
    }
}
