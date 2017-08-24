package com.citymanage.favorite.repo;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by com on 2017-08-24.
 */

public class FavoriteRepo {
    @SerializedName("resultCode")
    private String resultCode;

    @SerializedName("resultMessage")
    private String resultMessage;

    public List<Favorites> favoritesList = new ArrayList<>();

    public String getResultCode() {
        return resultCode;
    }

    public String getResultMessage() {
        return resultMessage;
    }

    public List<Favorites> getFavoritesList() {
        return favoritesList;
    }

    public class Favorites {
        @SerializedName("manageId")
        private String manageId;

        @SerializedName("cityName")
        private String cityName;

        @SerializedName("stateName")
        private String stateName;

        public String getManageId() {
            return manageId;
        }

        public String getCityName() {
            return cityName;
        }

        public String getStateName() {
            return stateName;
        }
    }
}
