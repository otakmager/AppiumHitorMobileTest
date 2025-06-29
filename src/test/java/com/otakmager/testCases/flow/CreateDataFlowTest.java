package com.otakmager.testCases.flow;

import com.otakmager.base.BaseTest;
import com.otakmager.pageEvents.*;
import org.testng.annotations.Test;

public class CreateDataFlowTest extends BaseTest {
    HomeEvents events1 = new HomeEvents();
    PilihJalanEvents events2 = new PilihJalanEvents();
    PilihKelompokEvents events3 = new PilihKelompokEvents();
    CounterEvents events4 = new CounterEvents();
    AddEditEvents events5 = new AddEditEvents();

    @Test
    public void createDataShouldSucceed() {
        // home screen
        events1.verifyMenuPengamatanVisible();
        events1.clickMenuPengamatan();

        // pilih jalan screen
        events2.verifyMenuJalanRayaVisible();
        events2.clickMenuJalanRaya();

        // pilih kelompok screen
        events3.verifyMenu5TipeVisible();
        events3.clickMenu5Tipe();

        // counter screen
        events4.verifyMotorCounterVisible();
        events4.clickMotorCounter();
        events4.clickFinish();

        // add screen
        String pengamat = "Dimas";
        String lokasi = "Surakarta, Central Java, Indonesia";
        String keterangan = "Weather clear, vehicle count stable";

        events5.verifyFormFieldVisible();
        events5.fillForm(pengamat, lokasi, keterangan);
        events5.clickSave();
    }
}
