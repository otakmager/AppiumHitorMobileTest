package com.otakmager.pageEvents;

import com.otakmager.keywords.ActionKeyword;
import com.otakmager.keywords.ValidationKeyword;
import com.otakmager.pageObjects.HomeObject;

public class HomeEvents {
    ActionKeyword action = new ActionKeyword();
    ValidationKeyword validation = new ValidationKeyword();

    public void verifyAppTitle() {
        String expectedTitle = "Hitor";
        String actualTitle = action.getText(HomeObject.appTitle);
        validation.assertTextEquals(actualTitle, expectedTitle);
    }

    public void verifyAppDescription() {
        String expectedDesc = "Kendaraan lewat?\nKita Catat!";
        String actualDesc = action.getText(HomeObject.appDesc);
        validation.assertTextEquals(actualDesc, expectedDesc);
    }

    public void verifyMenuPengamatanVisible() {
        validation.assertElementVisible(HomeObject.menuPengamatan);
    }

    public void verifyMenuRiwayatVisible() {
        validation.assertElementVisible(HomeObject.menuRiwayat);
    }

    public void verifyMenuPengaturanVisible() {
        validation.assertElementVisible(HomeObject.menuPengaturan);
    }

    public void verifyMenuDukunganVisible() {
        validation.assertElementVisible(HomeObject.menuDukungan);
    }

    public void clickMenuPengamatan() {
        action.click(HomeObject.menuPengamatan);
    }
}
