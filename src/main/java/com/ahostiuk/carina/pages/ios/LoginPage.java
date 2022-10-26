package com.ahostiuk.carina.pages.ios;

import com.ahostiuk.carina.pages.common.CatalogPageBase;
import com.ahostiuk.carina.pages.common.LoginPageBase;
import com.qaprosoft.carina.core.foundation.utils.factory.DeviceType;
import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.foundation.webdriver.decorator.PageOpeningStrategy;
import com.qaprosoft.carina.core.foundation.webdriver.locator.ExtendedFindBy;
import org.openqa.selenium.WebDriver;

@DeviceType(pageType = DeviceType.Type.IOS_PHONE, parentClass = LoginPageBase.class)
public class LoginPage extends LoginPageBase {

    @ExtendedFindBy(accessibilityId = "Username input field")
    private ExtendedWebElement usernameTextField;

    @ExtendedFindBy(accessibilityId = "Password input field")
    private ExtendedWebElement passwordTextField;

    @ExtendedFindBy(accessibilityId = "Login button")
    private ExtendedWebElement loginButton;

    @ExtendedFindBy(accessibilityId = "bob@example.com-autofill")
    private ExtendedWebElement bobLinkAutofillCredentials;

    @ExtendedFindBy(accessibilityId = "alice@example.com (locked out)-autofill")
    private ExtendedWebElement aliceLinkAutofillCredentials;

    public LoginPage(WebDriver driver) {
        super(driver);
        setPageOpeningStrategy(PageOpeningStrategy.BY_ELEMENT);
        setUiLoadedMarker(loginButton);
    }

    @Override
    public CatalogPageBase loginWithAutofill() {
        bobLinkAutofillCredentials.click(3);
        loginButton.click(3);
        return initPage(getDriver(), CatalogPageBase.class);
    }

}
