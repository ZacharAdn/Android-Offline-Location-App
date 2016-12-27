package com.arnon.ofir.mapstest3.more;

import java.io.Serializable;

/**
 * Created by zahar on 22/12/16.
 */

public class LocationOnMap implements Serializable{
    private String latitude;
    private String longitude;
    private String permissions;
    private float speed;

    public LocationOnMap(float speed, String permissions, String longitude, String latitude) {
        this.speed = speed;
        this.permissions = permissions;
        this.longitude = longitude;
        this.latitude = latitude;
    }

    public LocationOnMap() {
    }

    public float getSpeed() {
        return speed;
    }

    public LocationOnMap(String latitude, String longitude) {
        this.latitude = latitude;
        this.longitude = longitude;
    }

    public LocationOnMap(String latitude, String longitude, String permissions) {
        this.latitude = latitude;
        this.longitude = longitude;
        this.permissions = permissions;
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

    public String getPermissions() {
        return permissions;
    }

    public void setPermissions(String permissions) {
        this.permissions = permissions;
    }

    public String toString(){
        return  "{"+latitude+" , "+longitude + "}";
    }
}
