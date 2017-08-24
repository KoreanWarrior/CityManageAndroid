package com.citymanage.favorite.repo;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.Query;

/**
 * Created by park on 2017-08-06.
 */

public interface FavoriteService {
    @Headers({"Accept:application/json"})
    @GET("favoritesList.app")
    Call<FavoriteRepo> getMemberRepo(@Query("memberId") String memberId, @Query("mamageType") String mamageType);
}
