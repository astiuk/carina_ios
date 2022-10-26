package com.ahostiuk.carina.enums;

import com.ahostiuk.carina.pages.common.LoginPageBase;
import com.qaprosoft.carina.core.gui.AbstractPage;

public enum MenuItem {
    WEBVIEW("menu item webview"),
    QR_CODE_SCANNER("menu item qr code scanner"),
    GEO_LOCATION("menu item geo location"),
    DRAWING("menu item drawing"),
    REPORT_A_BUG("menu item report a bug"),
    ABOUT("menu item about"),
    RESET_APP_STATE("menu item reset app"),
    FACE_ID("menu item biometrics"),
    LOGIN("menu item log in", LoginPageBase.class),
    LOGOUT("menu item log out"),
    API_CALLS("menu item api calls"),
    SAUCE_BOT_VIDEO("menu item sauce bot video");

    private String accessibilityId;
    private Class<? extends AbstractPage> clazz;

    MenuItem(String accessibilityId) {
        this.accessibilityId = accessibilityId;
    }

    MenuItem(String accessibilityId, Class<? extends AbstractPage> clazz) {
        this.accessibilityId = accessibilityId;
        this.clazz = clazz;
    }

    public String getAccessibilityId() {
        return accessibilityId;
    }

    public Class<? extends AbstractPage> getClazz() {
        return clazz;
    }
}
