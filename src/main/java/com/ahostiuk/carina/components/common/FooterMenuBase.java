package com.ahostiuk.carina.components.common;

import com.ahostiuk.carina.pages.common.CartPageBase;
import com.ahostiuk.carina.pages.common.CatalogPageBase;
import com.ahostiuk.carina.pages.common.MenuPageBase;
import com.qaprosoft.carina.core.foundation.utils.factory.ICustomTypePageFactory;
import com.qaprosoft.carina.core.gui.AbstractUIObject;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;

public abstract class FooterMenuBase extends AbstractUIObject implements ICustomTypePageFactory {

    public FooterMenuBase(WebDriver driver, SearchContext searchContext) {
        super(driver, searchContext);
    }

    public abstract CatalogPageBase openCatalogPage();

    public abstract CartPageBase openCartPage();

    public abstract MenuPageBase openMenuPage();
}
