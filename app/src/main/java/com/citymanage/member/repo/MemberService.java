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
    @GET("cityInfo.app")
    Call<CityInfoRepo> getCityInfo();

    @Headers({"Accept:application/json"})
    @GET("stateInfo.app")
    Call<StateInfoRepo> getStateInfo(@Query("cityCode") String cityCode);

    @Headers({"Accept:application/json"})
    @GET("cityStateInfoRegister.app")
    Call<MemberRepo> setCityStateInfoRegister(@Query("memberId") String memberId,@Query("memberPwd") String memberPwd, @Query("cityCode") String cityCode, @Query("stateCode") String stateCode);
}
