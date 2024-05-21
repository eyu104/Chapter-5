package com.byted.chapter5;

import retrofit2.Call;
import retrofit2.http.*;

public interface ApiService {
    // https://wanandroid.com/wxarticle/chapters/json
    @GET("wxarticle/chapters/json")
    Call<ArticleResponse> getArticles();

    // TODO 添加api
    // https://www.wanandroid.com/user/register
    //方法：POST
    //	username,password,repassword
    @FormUrlEncoded
    @POST("user/register")
    Call<UserResponse> postRegister(@Field("username")String username,
                                    @Field("password")String password,
                                    @Field("repassword")String repassword);

}
