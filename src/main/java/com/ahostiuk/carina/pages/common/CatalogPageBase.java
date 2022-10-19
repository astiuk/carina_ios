package com.ahostiuk.carina.pages.common;

import com.ahostiuk.carina.components.ios.FooterMenu;
import com.qaprosoft.carina.core.gui.AbstractPage;
import org.openqa.selenium.WebDriver;

public abstract class CatalogPageBase extends AbstractPage {

    public CatalogPageBase(WebDriver driver) {
        super(driver);
    }

    public abstract FooterMenu getFooterMenu();
}