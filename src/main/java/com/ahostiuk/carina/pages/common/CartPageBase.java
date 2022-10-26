package com.ahostiuk.carina.pages.common;

import com.ahostiuk.carina.components.ios.FooterMenu;
import com.qaprosoft.carina.core.gui.AbstractPage;
import org.openqa.selenium.WebDriver;

public abstract class CartPageBase extends AbstractPage {

    public CartPageBase(WebDriver driver) {
        super(driver);
    }

    public abstract FooterMenu getFooterMenu();
}
