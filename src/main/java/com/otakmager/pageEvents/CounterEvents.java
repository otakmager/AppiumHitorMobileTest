package com.otakmager.pageEvents;

import com.otakmager.keywords.ActionKeyword;
import com.otakmager.keywords.ValidationKeyword;
import com.otakmager.pageObjects.CounterObject;

public class CounterEvents {
    ActionKeyword action = new ActionKeyword();
    ValidationKeyword validation = new ValidationKeyword();

    public void verifyAppBarBackButton() {
        validation.assertElementVisible(CounterObject.appBarBackButton);
    }

    public void verifyAppBarResetButtonVisible() {
        validation.assertElementVisible(CounterObject.appBarResetButton);
    }

    public void verifyAppBarFinishButtonVisible() {
        validation.assertElementVisible(CounterObject.appBarFinishButton);
    }

    public void verifyAlertDialogReset() {
        action.click(CounterObject.appBarResetButton);
        validation.assertElementVisible(CounterObject.alertDialogTitle);
        validation.assertElementVisible(CounterObject.alertDialogDescReset);
        validation.assertElementVisible(CounterObject.alertDialogYesButton);
        validation.assertElementVisible(CounterObject.alertDialogCancelButton);

        String expectedTitle = "Apakah Anda Yakin?";
        String expectedDesc = "Tindakan ini akan menghapus data yang sudah diinput dan memulai dari awal kembali.";
        String actualTitle = action.getText(CounterObject.alertDialogTitle);
        String actualDesc = action.getText(CounterObject.alertDialogDescReset);
        validation.assertTextEquals(actualTitle, expectedTitle);
        validation.assertTextEquals(actualDesc, expectedDesc);

        action.click(CounterObject.alertDialogCancelButton);
    }

    public void verifyAlertDialogFinish() {
        action.click(CounterObject.appBarFinishButton);
        validation.assertElementVisible(CounterObject.alertDialogTitle);
        validation.assertElementVisible(CounterObject.alertDialogDescFinish);
        validation.assertElementVisible(CounterObject.alertDialogYesButton);
        validation.assertElementVisible(CounterObject.alertDialogCancelButton);

        String expectedTitle = "Apakah Anda Yakin?";
        String expectedDesc = "Tindakan ini akan menghentikan proses penghitungan dan mengarahkan Anda ke halaman pengeditan sebelum data sepenuhnya disimpan.";
        String actualTitle = action.getText(CounterObject.alertDialogTitle);
        String actualDesc = action.getText(CounterObject.alertDialogDescFinish);
        validation.assertTextEquals(actualTitle, expectedTitle);
        validation.assertTextEquals(actualDesc, expectedDesc);

        action.click(CounterObject.alertDialogCancelButton);
    }

    public void verifyMotorCounterVisible() {
        validation.assertElementVisible(CounterObject.counterMotor);
    }

    public void clickMotorCounter() {
        action.click(CounterObject.counterMotor);
    }

    public void clickFinish() {
        action.click(CounterObject.appBarFinishButton);
        action.click(CounterObject.alertDialogYesButton);
    }
}
