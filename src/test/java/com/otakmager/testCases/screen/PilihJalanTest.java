package com.otakmager.testCases.screen;

import com.otakmager.base.BaseTest;
import com.otakmager.pageEvents.HomeEvents;
import com.otakmager.pageEvents.PilihJalanEvents;
import org.testng.annotations.Test;

public class PilihJalanTest extends BaseTest {
    HomeEvents events1 = new HomeEvents();
    PilihJalanEvents events2 = new PilihJalanEvents();

    @Test
    public void pilihJalanScreenShouldLoadSuccessfully() {
        // home screen
        events1.verifyMenuPengamatanVisible();
        events1.clickMenuPengamatan();

        // pilih jalan screen
        events2.verifyAppBarTitle();
        events2.verifyAppBarBackButtonVisible();
        events2.verifyMenuJalanRayaVisible();
        events2.verifyMenuJalanTolVisible();
    }
}
