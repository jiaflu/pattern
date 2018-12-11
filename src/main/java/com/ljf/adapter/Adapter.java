package com.ljf.adapter;


/**
 * 适配器
 * （相当于usb和ps/2的转接器）
 */
public class Adapter extends Adaptee implements Target {
    @Override
    public void handleReq() {
        super.request();
    }
}
