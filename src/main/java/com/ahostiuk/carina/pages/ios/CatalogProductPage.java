package com.ahostiuk.carina.pages.ios;

import com.ahostiuk.carina.pages.common.CatalogProductPageBase;
import com.qaprosoft.carina.core.foundation.utils.factory.DeviceType;
import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.foundation.webdriver.locator.ExtendedFindBy;
import org.openqa.selenium.WebDriver;

@DeviceType(pageType = DeviceType.Type.IOS_PHONE, parentClass = CatalogProductPageBase.class)
public class CatalogProductPage extends CatalogProductPageBase {

    @ExtendedFindBy(accessibilityId = "product description")
    private ExtendedWebElement productDescription;

    @ExtendedFindBy(accessibilityId = "Add To Cart button")
    private ExtendedWebElement addToCartButton;

    public CatalogProductPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public String getProductDescription() {
        swipe(productDescription, Direction.UP, 3, 500);
        return productDescription.getAttribute("value");
    }

    @Override
    public void clickAddToCartButton() {
        swipe(addToCartButton, Direction.UP, 3, 500);
        addToCartButton.click(3);
    }
}
