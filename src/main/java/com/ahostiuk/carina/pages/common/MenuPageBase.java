package com.ahostiuk.carina.pages.common;

import com.ahostiuk.carina.enums.MenuItem;
import com.qaprosoft.carina.core.gui.AbstractPage;
import org.openqa.selenium.WebDriver;

public abstract class MenuPageBase extends AbstractPage {

    public MenuPageBase(WebDriver driver) {
        super(driver);
    }

    public abstract AbstractPage clickMenuItem(MenuItem item);
}
