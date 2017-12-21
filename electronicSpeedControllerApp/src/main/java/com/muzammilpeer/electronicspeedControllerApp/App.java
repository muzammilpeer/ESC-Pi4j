package com.muzammilpeer.electronicspeedControllerApp;


import com.muzammilpeer.electronicspeedControllerApp.controller.ElectronicSpeedController;
import com.muzammilpeer.electronicspeedControllerApp.controller.impl.ElectronicSpeedControllerImpl;

public class App {

    public static void main(String[] args) throws Exception {

        //Raspberry pi 3 Model B, GPIO_26 = BCM = 12 PIN, which has hardware enable PWM
        int operatingFrequency = Math.round(1000.0f / 16); // 62.5 Hz
        // gpio -readall to get the mapping of all pins check this command on terminal

        ElectronicSpeedController controller = new ElectronicSpeedControllerImpl(12);
        //calibration then test flight
//        controller.calibrate();
//        controller.testFlight();

        //or you have done calibration with your ESC then run a arm test for 5 seconds
        Thread.sleep(1 * 1000);
        controller.arm(true);
        Thread.sleep(5 * 1000);
        controller.disArm();

    }
}

