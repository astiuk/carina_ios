package com.ahostiuk.carina.pages.common;

import com.ahostiuk.carina.enums.BottomTabButtons;
import com.qaprosoft.carina.core.gui.AbstractPage;
import org.openqa.selenium.WebDriver;

public abstract class CommonPageBase extends AbstractPage {

    public CommonPageBase(WebDriver driver) {
        super(driver);
    }

    public abstract AbstractPage clickBottomTabButton(BottomTabButtons button);
}
