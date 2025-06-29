package com.otakmager.pageEvents;

import com.otakmager.keywords.ActionKeyword;
import com.otakmager.keywords.ValidationKeyword;
import com.otakmager.pageObjects.PengaturanObject;

public class PengaturanEvents {
    ActionKeyword action = new ActionKeyword();
    ValidationKeyword validation = new ValidationKeyword();

    public void verifyAppBarTitle() {
        String expectedTitle = "Pengaturan";
        String actualTitle = action.getText(PengaturanObject.appBarTitle);
        validation.assertTextEquals(actualTitle, expectedTitle);
    }

    public void verifyAppBarBackButtonVisible() {
        validation.assertElementVisible(PengaturanObject.appBarBackButton);
    }

    public void verifyCounterButtonStyleOptionsVisible() {
        String actualLabel, actualOpt1, actualOpt2, actualOpt3, actualOpt4;
        String expectedLabel = "Bentuk Counter";
        String expectedOpt1 = "Simple";
        String expectedOpt2 = "Counter";
        String expectedOpt3 = "Big Simple";
        String expectedOpt4 = "Big Counter";

        validation.assertElementVisible(PengaturanObject.headerButtonStyle);
        actualLabel = action.getText(PengaturanObject.headerButtonStyle);
        validation.assertTextEquals(actualLabel, expectedLabel);

        validation.assertElementVisible(PengaturanObject.radioBtnSimpleStyle);
        actualOpt1 = action.getText(PengaturanObject.radioBtnSimpleStyle);
        validation.assertTextEquals(actualOpt1, expectedOpt1);

        validation.assertElementVisible(PengaturanObject.radioBtnCounterStyle);
        actualOpt2 = action.getText(PengaturanObject.radioBtnCounterStyle);
        validation.assertTextEquals(actualOpt2, expectedOpt2);

        validation.assertElementVisible(PengaturanObject.radioBtnBigSimple);
        actualOpt3 = action.getText(PengaturanObject.radioBtnBigSimple);
        validation.assertTextEquals(actualOpt3, expectedOpt3);

        validation.assertElementVisible(PengaturanObject.radioBtnBigCounter);
        actualOpt4 = action.getText(PengaturanObject.radioBtnBigCounter);
        validation.assertTextEquals(actualOpt4, expectedOpt4);
    }
}
