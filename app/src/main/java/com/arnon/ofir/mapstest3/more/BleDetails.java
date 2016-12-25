package com.arnon.ofir.mapstest3.more;

import java.io.Serializable;

/**
 * Created by Ofir on 12/25/2016.
 */

public class BleDetails implements Serializable{
    private String latitude;
    private String longitude;
    private String macAddress;
    public BleDetails() {

    }
    public BleDetails(String latitude, String longitude, String macAddress) {
        this.latitude = latitude;
        this.longitude = longitude;
        this.macAddress = macAddress;
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public String getMacAddress() {
        return macAddress;
    }

    public void setMacAddress(String macAddress) {
        this.macAddress = macAddress;
    }

    @Override
    public String toString() {
        return "BleDetails{" +
                "latitude='" + latitude + '\'' +
                ", longitude='" + longitude + '\'' +
                ", macAddress='" + macAddress + '\'' +
                '}';
    }
}
