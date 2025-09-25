# Appium Java - Part 01: Basic

---

This project is a basic example of using **Appium Java** with **TestNG** to perform a login test on the **SwagLabs Mobile App**.

---

## Objectives
- Understand the basic structure of a mobile automation testing project in Java.
- Learn how to create a `BaseTest` class for Appium driver setup & teardown.
- Run a simple login test on an Android mobile app using Appium.

---

## Tools & Dependencies
- **Java** 21
- **Maven**
- **Appium Java Client** 9.x
- **TestNG**
- **Appium Server** v3.x
- **Android SDK + adb**
- **Real Device**

---

## How To Clone (Using IntelliJ IDEA)
1. Open **IntelliJ IDEA**.
2. From the main menu, select: File → New → Project from Version Control...
3. Select **Git** from the list.
4. Paste the repository URL: https://github.com/ariansyah-riwendi/appium-java-part-02-page-object-model.git
5. Click **Clone**.
6. Wait for IntelliJ to finish downloading the project and load all dependencies.

## How To Run

### 1. Verify Java & Maven Installation
Make sure you have Java 21 installed.
Confirm the installation with `java -version`
---

### 2. Install & Start Appium Server
Install Appium globally (if not already) with `npm install -g appium`.  
Check Appium version with `appium -v`.  
Start the Appium server by running `appium`.  
By default, Appium runs on: http://127.0.0.1:4723

---

### 3. Connect Android Device
Connect your real device or start an emulator.  
Run `adb devices` to make sure your device is detected and appears with status "device".

---

### 4. Configure BaseTest
Open the file:  
`src/test/java/com/automation/base/BaseTest.java`

Replace `YOUR_DEVICE_UDID` with the UDID from `adb devices`.

Example:    
`.setUdid("CADEP7A6DYDQN7G6")`

---

### 5. Run Test in IntelliJ IDEA
1. Open the file:  
   `src/test/java/com/automation/tests/LoginTest.java`
2. On the left side of the class name → click the green Run ▶ icon.
3. IntelliJ will build the project and start the test execution.

---

### 6. Observe Test Execution
- Appium will launch the SwagLabs Mobile App on your device.


