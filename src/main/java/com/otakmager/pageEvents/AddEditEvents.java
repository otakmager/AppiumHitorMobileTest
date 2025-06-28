package com.otakmager.pageEvents;

import com.otakmager.keywords.ActionKeyword;
import com.otakmager.keywords.ValidationKeyword;
import com.otakmager.pageObjects.AddEditObject;

public class AddEditEvents {
    ActionKeyword action = new ActionKeyword();
    ValidationKeyword validation = new ValidationKeyword();

    public void verifyAppBarTitleAdd() {
        String expectedTitle = "Tambah Data";
        String actualTitle = action.getText(AddEditObject.appBarTitleAdd);
        validation.assertTextEquals(actualTitle, expectedTitle);
    }

    public void verifyAppBarTitleEdit() {
        String expectedTitle = "Edit Data";
        String actualTitle = action.getText(AddEditObject.appBarTitleEdit);
        validation.assertTextEquals(actualTitle, expectedTitle);
    }

    public void verifyAppBarBackButtonVisible() {
        validation.assertElementVisible(AddEditObject.appBarBackButton);
    }

    public void verifyAppBarSaveButtonVisible() {
        validation.assertElementVisible(AddEditObject.appBarSaveButton);
    }

    public void verifyRingkasanCardVisible() {
        validation.assertElementVisible(AddEditObject.resultSummary);
    }

    public void verifyFormFieldVisible() {
        validation.assertElementVisible(AddEditObject.fieldPengamat);
        validation.assertElementVisible(AddEditObject.fieldLokasi);
        validation.assertElementVisible(AddEditObject.fieldKeterangan);
    }

    public void verifyDataPengamatanVisible() {
        action.swipeUntilVisible(AddEditObject.resultSummary, AddEditObject.resultRecord, false, 2);
        validation.assertElementVisible(AddEditObject.resultRecord);
    }

    public void clickSave() {
        action.click(AddEditObject.appBarSaveButton);
    }
}
