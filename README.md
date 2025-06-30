# AppiumHitorMobileTest

> Automated Mobile Testing Project for **Hitor** – a practical and efficient Daily Traffic Counter

---

**Hitor** is a smart solution that simplifies daily traffic volume surveys or traffic counting. With an intuitive interface and complete features, Hitor helps you record traffic data accurately and efficiently, whether on highways or toll roads.

This repository contains an **automated mobile test project** for Hitor using **Appium v2** and **Java Maven** with **TestNG**, **Page Object Model (POM)** structure, logging, and reporting via **ExtentReports**.

---

## 📲 Hitor Key Features

* **Complete Vehicle Classification**

  * **Highways:** 3 classification options (5, 8, or 12 vehicle types) including motorcycles, cars, buses, trucks, and non-motorized vehicles.
  * **Toll Roads:** 6 classes according to toll road standards, including sedans, trucks, buses, and motorcycles.
* **Automatic Time and Duration Recording:** Tracks start time and survey duration automatically.
* **Additional Notes:** Add relevant notes after finishing the counting process.
* **Data History & Edit:** Access and modify survey history anytime.
* **User-Friendly Interface:** Easy to use for any user.

---

## ✅ Project Highlights

* Built with **Appium v2.19.0**, **Java Client 9.4.0**, **Selenium 4.33.0**, **TestNG 7.11.0**.
* Logging handled by **Log4j2** and **SLF4J**.
* HTML reports generated via **ExtentReports**.
* Page Object Model + Page Events structure for maintainable test flows.
* Example configuration file provided.

---

## 🗂️ Project Structure

```
AppiumHitorMobileTest/
├── logs/                # Test logs
├── reports/             # HTML reports (ExtentReports)
├── screenshots/         # Screenshots (if implemented)
├── src/main/java/       # Base, keywords, models, page objects, events, utils
├── src/test/java/       # Test cases (screen tests & flow tests)
├── src/test/resources/  # Config example, APK file, log4j2 config
├── pom.xml              # Maven dependencies & config
└── testng.xml           # TestNG suite configuration
```

---

## 🧪 Test Types

| Test Suite   | Description                                                 | Category         |
| ------------ | ----------------------------------------------------------- | ---------------- |
| `screenTest` | Validates each screen/component loads and behaves correctly | UI/Smoke Test    |
| `flowTest`   | Simulates user flow: create, edit, view data end-to-end     | End-to-End (E2E) |

* **Screen Tests:** Cover basic UI checks for Home, Select Street, Select Group, Counter, Add/Edit, History, Settings.
* **Flow Tests:** Validate realistic usage scenario from data creation to viewing details.

Test execution is configured in [`testng.xml`](https://github.com/otakmager/AppiumHitorMobileTest/blob/main/testng.xml).

---

## 📊 Test Outputs

| Output          | Description                                | Link                                                                                                 |
| --------------- | ------------------------------------------ | ---------------------------------------------------------------------------------------------------- |
| **HTML Report** | Full test execution report (ExtentReports) | [View Report](https://github.com/otakmager/AppiumHitorMobileTest/blob/main/reports/test-report.html) |
| **Log File**    | Runtime logs and debug information         | [View Log](https://github.com/otakmager/AppiumHitorMobileTest/blob/main/logs/app.log)                |
| **Screenshots** | Store failed test screenshots   | [View Screenshots](https://github.com/otakmager/AppiumHitorMobileTest/tree/main/screenshots)         |

---

## 📌 How to Run

1. Make sure **Node**, **npm**, and **Java 17** are installed.
2. Install **Appium** globally: `npm install -g appium`
3. Clone this repository.
4. Open the project in **IntelliJ IDEA** (TestNG support built-in).
5. Download all dependencies by running command prompt or use **Maven Reload Project** from your IDE.
6. Create your own `config.properties` based on the `config.properties.example` and adjust paths/capabilities.
7. Start the Appium server (`appium` or with `--allow-cors` if needed).
8. Run tests via **TestNG**, using the provided `testng.xml`.

---

## 🔗 Useful Links

* **Hitor APK (local asset):** [`hitor-v1.0.0-release.apk`](https://github.com/otakmager/AppiumHitorMobileTest/blob/main/src/test/resources/hitor-v1.0.0-release.apk)
* **Project Repo:** [AppiumHitorMobileTest](https://github.com/otakmager/AppiumHitorMobileTest)
* **HTML Report:** [Test Report](https://github.com/otakmager/AppiumHitorMobileTest/blob/main/reports/test-report.html)
* **Log File:** [Test Log](https://github.com/otakmager/AppiumHitorMobileTest/blob/main/logs/app.log)
* **POM File:** [`pom.xml`](https://github.com/otakmager/AppiumHitorMobileTest/blob/main/pom.xml)
* **TestNG Suite:** [`testng.xml`](https://github.com/otakmager/AppiumHitorMobileTest/blob/main/testng.xml)
* **Example Config:** [`config.properties.example`](https://github.com/otakmager/AppiumHitorMobileTest/blob/main/src/test/resources/config.properties.example)

---

## 📥 Download Hitor App

* [Hitor on GitHub Pages](https://otakmager.github.io/traffic_records_web/)
* [Hitor on upToDown](https://hitorhitor-traffic-counter-and-records.id.uptodown.com/android)

---

## App Screnshot

<table>
  <tr>
    <td><img src="https://github.com/otakmager/AppiumHitorMobileTest/blob/main/docs/1_home.jpg" width=270 height=480></td>
    <td><img src="https://github.com/otakmager/AppiumHitorMobileTest/blob/main/docs/2_choose_street.jpg" width=270 height=480></td>
    <td><img src="https://github.com/otakmager/AppiumHitorMobileTest/blob/main/docs/3_choose_type.jpg" width=270 height=480></td>
  </tr>
  <tr>
    <td><img src="https://github.com/otakmager/AppiumHitorMobileTest/blob/main/docs/4_counter.jpg" width=270 height=480></td>
    <td><img src="https://github.com/otakmager/AppiumHitorMobileTest/blob/main/docs/5_history.jpg" width=270 height=480></td>
    <td><img src="https://github.com/otakmager/AppiumHitorMobileTest/blob/main/docs/7_edit.jpg" width=270 height=480></td>
  </tr>
 </table>
 
---
