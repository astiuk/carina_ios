package com.ahostiuk.carina.enums;

import com.ahostiuk.carina.pages.common.CartPageBase;
import com.ahostiuk.carina.pages.common.CatalogPageBase;
import com.ahostiuk.carina.pages.common.MenuPageBase;
import com.qaprosoft.carina.core.gui.AbstractPage;

public enum BottomTabButtons {

    CATALOG("tab bar option catalog", CatalogPageBase.class),
    CART("tab bar option cart", CartPageBase.class),
    MENU("tab bar option menu", MenuPageBase.class);

    private String accessibilityId;
    private Class<? extends AbstractPage> page;

    BottomTabButtons(String accessibilityId, Class<? extends AbstractPage> page) {
        this.accessibilityId = accessibilityId;
        this.page = page;
    }

    public String getAccessibilityId() {
        return accessibilityId;
    }

    public Class<? extends AbstractPage> getPage() {
        return page;
    }
}
