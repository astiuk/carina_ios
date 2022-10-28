package com.ahostiuk.carina.pages.common;

import com.qaprosoft.carina.core.foundation.utils.mobile.IMobileUtils;
import com.qaprosoft.carina.core.gui.AbstractPage;
import org.openqa.selenium.WebDriver;

public abstract class CatalogProductPageBase extends AbstractPage implements IMobileUtils {

    public CatalogProductPageBase(WebDriver driver) {
        super(driver);
    }

    public abstract String getProductDescription();
}
