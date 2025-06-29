package com.otakmager.testCases.screen;

import com.otakmager.base.BaseTest;
import com.otakmager.pageEvents.HomeEvents;
import com.otakmager.pageEvents.PengaturanEvents;
import org.testng.annotations.Test;

public class PengaturanTest extends BaseTest {
    HomeEvents events1 = new HomeEvents();
    PengaturanEvents events2 = new PengaturanEvents();

    @Test
    public void pengaturanScreenShouldLoadSuccessfully() {
        // home screen
        events1.verifyMenuPengaturanVisible();
        events1.clickMenuPengaturan();

        // pengaturan screen
        events2.verifyAppBarTitle();
        events2.verifyAppBarBackButtonVisible();
        events2.verifyCounterButtonStyleOptionsVisible();
    }
}
