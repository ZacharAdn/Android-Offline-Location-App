package com.arnon.ofir.mapstest3.more;

import java.io.Serializable;

/**
 * Created by zahar on 25/12/16.
 */

public class userDetails implements Serializable {

    String premission = null;
    String userName = null;
    boolean selected = false;
    private String latitude;
    private String longitude;

    public String getLongitude() {
        return longitude;
    }

    public String getLatitude() {
        return latitude;
    }

    public userDetails(String premission, String userName, boolean selected, String latitude, String longitude) {
        super();
        this.premission = premission;
        this.userName = userName;
        this.selected = selected;
        this.latitude=latitude;

        this.longitude=longitude;
    }

    public String getpremission() {
        return premission;
    }
    public void setpremission(String premission) {
        this.premission = premission;
    }
    public String getuserName() {
        return userName;
    }
    public void setuserName(String userName) {
        this.userName = userName;
    }

    public boolean isSelected() {
        return selected;
    }
    public void setSelected(boolean selected) {
        this.selected = selected;
    }

}
