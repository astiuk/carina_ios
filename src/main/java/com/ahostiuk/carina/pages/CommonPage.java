package com.ahostiuk.carina.pages;

import com.ahostiuk.carina.enums.BottomTabButtons;
import com.ahostiuk.carina.pages.common.CommonPageBase;
import com.qaprosoft.carina.core.foundation.utils.factory.DeviceType;
import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.foundation.webdriver.decorator.PageOpeningStrategy;
import com.qaprosoft.carina.core.foundation.webdriver.locator.ExtendedFindBy;
import com.qaprosoft.carina.core.gui.AbstractPage;
import org.openqa.selenium.WebDriver;

@DeviceType(pageType = DeviceType.Type.IOS_PHONE, parentClass = CommonPageBase.class)
public class CommonPage extends CommonPageBase {

    @ExtendedFindBy(accessibilityId = "longpress reset app")
    private ExtendedWebElement logoImage;

    @ExtendedFindBy(accessibilityId = "%s")
    private ExtendedWebElement bottomTabButton;

    public CommonPage(WebDriver driver) {
        super(driver);
        setPageOpeningStrategy(PageOpeningStrategy.BY_ELEMENT);
        setUiLoadedMarker(logoImage);
    }

    public AbstractPage clickBottomTabButton(BottomTabButtons button) {
        bottomTabButton.format(button.getAccessibilityId()).click(3);
        return initPage(getDriver(), button.getPage());
    }

    @Override
    public boolean isPageOpened() {
        return logoImage.isPresent();
    }
}
