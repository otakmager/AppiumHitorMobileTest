package com.otakmager.pageEvents;

import com.otakmager.keywords.ActionKeyword;
import com.otakmager.keywords.ValidationKeyword;
import com.otakmager.pageObjects.PilihKelompokObject;

public class PilihKelompokEvents {
    ActionKeyword action = new ActionKeyword();
    ValidationKeyword validation = new ValidationKeyword();

    public void verifyAppBarTitle() {
        String expectedTitle = "Pilih Kelompok";
        String actualTitle = action.getText(PilihKelompokObject.appBarTitle);
        validation.assertTextEquals(actualTitle, expectedTitle);
    }

    public void verifyAppBarBackButtonVisible() {
        validation.assertElementVisible(PilihKelompokObject.appBarBackButton);
    }

    public void verifyMenu5TipeVisible() {
        validation.assertElementVisible(PilihKelompokObject.menu5Tipe);
    }

    public void verifyMenu8TipeVisible() {
        validation.assertElementVisible(PilihKelompokObject.menu8Tipe);
    }

    public void verifyMenu12TipeVisible() {
        validation.assertElementVisible(PilihKelompokObject.menu12Tipe);
    }

    public void clickMenu5Tipe() {
        action.click(PilihKelompokObject.menu5Tipe);
    }
}
