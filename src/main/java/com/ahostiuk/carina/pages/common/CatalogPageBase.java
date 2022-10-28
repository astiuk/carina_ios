package com.ahostiuk.carina.pages.common;

import com.ahostiuk.carina.components.ios.FooterMenu;
import com.qaprosoft.carina.core.foundation.utils.mobile.IMobileUtils;
import com.qaprosoft.carina.core.gui.AbstractPage;
import org.openqa.selenium.WebDriver;

public abstract class CatalogPageBase extends AbstractPage implements IMobileUtils {

    public CatalogPageBase(WebDriver driver) {
        super(driver);
    }

    public abstract FooterMenu getFooterMenu();

    public abstract CatalogProductPageBase openProductPageByName(String name);
}
