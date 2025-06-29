package com.otakmager.pageEvents;

import com.otakmager.keywords.ActionKeyword;
import com.otakmager.keywords.ValidationKeyword;
import com.otakmager.pageObjects.DetailObject;

public class DetailEvents {
    ActionKeyword action = new ActionKeyword();
    ValidationKeyword validation = new ValidationKeyword();

    public void verifyAppBarTitle() {
        String expectedTitle = "Detail";
        String actualTitle = action.getText(DetailObject.appBarTitle);
        validation.assertTextEquals(actualTitle, expectedTitle);
    }

    public void verifyAppBarBackButtonVisible() {
        validation.assertElementVisible(DetailObject.appBarBackButton);
    }

    public void verifyDetailContentVisible() {
        validation.assertElementVisible(DetailObject.summaryResult);

        action.swipeUntilVisible(DetailObject.summaryResult, DetailObject.additionalInfo, false, 1);
        validation.assertElementVisible(DetailObject.additionalInfo);

        action.swipeUntilVisible(DetailObject.additionalInfo, DetailObject.summaryRecord, false, 1);
        validation.assertElementVisible(DetailObject.summaryRecord);

        action.swipeUntilVisible(DetailObject.summaryRecord, DetailObject.totalVehicles, false, 5);
        validation.assertElementVisible(DetailObject.totalVehicles);

        action.swipeUntilVisible(DetailObject.totalVehicles, DetailObject.buttonEdit, false, 2);
        validation.assertElementVisible(DetailObject.buttonEdit);

        action.swipeUntilVisible(DetailObject.buttonEdit, DetailObject.buttonDelete, false, 2);
        validation.assertElementVisible(DetailObject.buttonDelete);
    }
}
