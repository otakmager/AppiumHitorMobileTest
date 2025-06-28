package com.otakmager.pageEvents;

import com.otakmager.keywords.ActionKeyword;
import com.otakmager.keywords.ValidationKeyword;
import com.otakmager.pageObjects.PilihJalanObject;

public class PilihJalanEvents {
    ActionKeyword action = new ActionKeyword();
    ValidationKeyword validation = new ValidationKeyword();

    public void verifyAppBarTitle() {
        String expectedTitle = "Pilih Jenis Jalan";
        String actualTitle = action.getText(PilihJalanObject.appBarTitle);
        validation.assertTextEquals(actualTitle, expectedTitle);
    }

    public void verifyAppBarBackButtonVisible() {
        validation.assertElementVisible(PilihJalanObject.appBarBackButton);
    }

    public void verifyMenuJalanRayaVisible() {
        validation.assertElementVisible(PilihJalanObject.menuJalanRaya);
    }

    public void verifyMenuJalanTolVisible() {
        validation.assertElementVisible(PilihJalanObject.menuJalanTol);
    }

    public void clickMenuJalanRaya() {
        action.click(PilihJalanObject.menuJalanRaya);
    }

    public void clickMenuJalanTol() {
        action.click(PilihJalanObject.menuJalanTol);
    }
}
