package com.otakmager.testCases.screen;

import com.otakmager.base.BaseTest;
import com.otakmager.pageEvents.HomeEvents;
import org.testng.annotations.Test;

public class HomeTest extends BaseTest {
    HomeEvents events = new HomeEvents();

    @Test
    public void homeScreenShouldLoadSuccessfully() {
        events.verifyAppTitle();
        events.verifyAppDescription();

        events.verifyMenuPengamatanVisible();
        events.verifyMenuRiwayatVisible();
        events.verifyMenuPengaturanVisible();
        events.verifyMenuDukunganVisible();
    }
}
