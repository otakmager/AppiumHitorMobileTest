package com.otakmager.testCases.screen;

import com.otakmager.base.BaseTest;
import com.otakmager.pageEvents.*;
import org.testng.annotations.Test;

public class RiwayatTest extends BaseTest {
    HomeEvents events1 = new HomeEvents();
    RiwayatEvents events2 = new RiwayatEvents();

    @Test
    public void riwayatScreenShouldLoadSuccessfullyWhenNoData() {
        // home screen
        events1.verifyMenuRiwayatVisible();
        events1.clickMenuRiwayat();

        // riwayat screen
        events2.verifyAppBarTitle();
        events2.verifyAppBarBackButtonVisible();
        events2.verifyNoDataMessageVisible();
    }
}
