package com.common.commonRepo;

import com.google.gson.annotations.SerializedName;

/**
 * Created by park on 2017-08-06.
 */

public class LocationManagementRepo {
    @SerializedName("resultCode")
    private String resultCode;

    @SerializedName("resultMessage")
    private String resultMessage;

    private String manageId;
    private String latitude;
    private String longitude;
    private String cityName;
    private String stateName;
    
}
