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
        validation.assertElementVisible(DetailObject.additionalInfo);
        validation.assertElementVisible(DetailObject.summaryRecord);

        action.swipe(DetailObject.additionalInfo, false, 1.0);
        validation.assertElementVisible(DetailObject.totalVehicles);

        action.swipe(DetailObject.totalVehicles, false, 0.3);
        validation.assertElementVisible(DetailObject.buttonEdit);
        validation.assertElementVisible(DetailObject.buttonDelete);
    }
}
