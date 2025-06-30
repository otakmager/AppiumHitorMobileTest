package com.otakmager.testCases.flow;

import com.otakmager.base.BaseTest;
import com.otakmager.pageEvents.DetailEvents;
import com.otakmager.pageEvents.HomeEvents;
import com.otakmager.pageEvents.RiwayatEvents;
import org.testng.annotations.Test;

public class ViewDetailDataFlowTest extends BaseTest {
    HomeEvents events1 = new HomeEvents();
    RiwayatEvents events2 = new RiwayatEvents();
    DetailEvents events3 = new DetailEvents();

    @Test
    public void viewDetailDataShouldSucceed() {
        // home screen
        events1.verifyMenuRiwayatVisible();
        events1.clickMenuRiwayat();

        // riwayat screen
        events2.verifyDataVisible();
        events2.clickData();

        // detail screen
        events3.verifyAppBarTitle();
        events3.verifyAppBarBackButtonVisible();
        events3.verifyDetailContentVisible();
    }
}
