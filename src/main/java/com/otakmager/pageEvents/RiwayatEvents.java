package com.otakmager.pageEvents;

import com.otakmager.keywords.ActionKeyword;
import com.otakmager.keywords.ValidationKeyword;
import com.otakmager.pageObjects.RiwayatObject;

public class RiwayatEvents {
    ActionKeyword action = new ActionKeyword();
    ValidationKeyword validation = new ValidationKeyword();

    public void verifyAppBarTitle() {
        String expectedTitle = "Riwayat";
        String actualTitle = action.getText(RiwayatObject.appBarTitle);
        validation.assertTextEquals(actualTitle, expectedTitle);
    }

    public void verifyAppBarBackButtonVisible() {
        validation.assertElementVisible(RiwayatObject.appBarBackButton);
    }

    public void verifyNoDataMessageVisible() {
        String expectedTitle = "Tidak ada data";
        String actualTitle = action.getText(RiwayatObject.noDataText);
        validation.assertTextEquals(actualTitle, expectedTitle);
    }

    public void verifyDataVisible() {
        validation.assertElementVisible(RiwayatObject.itemData);
    }

    public void clickData() {
        action.click(RiwayatObject.itemData);
    }
}
