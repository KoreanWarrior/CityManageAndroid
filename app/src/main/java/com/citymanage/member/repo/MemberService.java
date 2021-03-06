package com.citymanage.member.repo;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.Query;

/**
 * Created by park on 2017-08-06.
 */

public interface MemberService {
    @Headers({"Accept:application/json"})
    @GET("memberLogin.app")
    Call<MemberRepo> getMemberRepo(@Query("memberId") String id, @Query("memberPwd") String password);

    @Headers({"Accept:application/json"})
    @GET("appLogin.app")
    Call<CityInfoRepo> getCityInfo();
}
