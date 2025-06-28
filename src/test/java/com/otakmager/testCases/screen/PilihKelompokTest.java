package com.otakmager.testCases.screen;

import com.otakmager.base.BaseTest;
import com.otakmager.pageEvents.HomeEvents;
import com.otakmager.pageEvents.PilihJalanEvents;
import com.otakmager.pageEvents.PilihKelompokEvents;
import org.testng.annotations.Test;

public class PilihKelompokTest extends BaseTest {
    HomeEvents events1 = new HomeEvents();
    PilihJalanEvents events2 = new PilihJalanEvents();
    PilihKelompokEvents events3 = new PilihKelompokEvents();

    @Test
    public void pilihKelompokScreenShouldLoadAfterChoosingJalanRaya() {
        // home screen
        events1.verifyMenuPengamatanVisible();
        events1.clickMenuPengamatan();

        // pilih jalan screen
        events2.verifyMenuJalanRayaVisible();
        events2.clickMenuJalanRaya();

        // pilih kelompok screen
        events3.verifyAppBarTitle();
        events3.verifyAppBarBackButtonVisible();
        events3.verifyMenu5TipeVisible();
        events3.verifyMenu8TipeVisible();
        events3.verifyMenu12TipeVisible();
    }

    @Test
    public void pilihKelompokScreenShouldLoadAfterChoosingJalanTol() {
        // home screen
        events1.verifyMenuPengamatanVisible();
        events1.clickMenuPengamatan();

        // pilih jalan screen
        events2.verifyMenuJalanTolVisible();
        events2.clickMenuJalanTol();

        // pilih kelompok screen
        events3.verifyAppBarTitle();
        events3.verifyAppBarBackButtonVisible();
        events3.verifyMenu6TipeVisible();
    }

}
