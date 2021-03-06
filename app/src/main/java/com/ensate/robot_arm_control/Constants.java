package com.ensate.robot_arm_control;

/**
 * Defines several constants used between {@link BluetoothService} and the UI.
 */
public class Constants {

    // Message types sent from the BluetoothChatService Handler
    public static final int MESSAGE_STATE_CHANGE = 1;
    public static final int MESSAGE_READ = 2;
    public static final int MESSAGE_WRITE = 3;
    public static final int MESSAGE_DEVICE_NAME = 4;
    public static final int MESSAGE_TOAST = 5;

    public static final String SERVO1_PREEFIX = "S1";
    public static final String SERVO2_PREEFIX = "S2";
    public static final String SERVO3_PREEFIX = "S3";



    // Key names received from the BluetoothChatService Handler
    public static final String DEVICE_NAME = "layout_device_name";
    public static final String TOAST = "toast";
    public static final String APP_UUID = "00001101-0000-1000-8000-00805f9b34fb";

    private Constants() {

    }
}