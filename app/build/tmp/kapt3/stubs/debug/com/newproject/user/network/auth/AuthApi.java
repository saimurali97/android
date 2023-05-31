package com.newproject.user.network.auth;

import com.newproject.user.data.model.remote.auth.LoginResponse;
import com.newproject.user.data.model.remote.auth.SignUpBody;
import com.newproject.user.data.model.remote.auth.SignUpResponse;
import retrofit2.Response;
import retrofit2.http.*;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u001b\u0010\u0002\u001a\u00020\u00032\b\b\u0001\u0010\u0004\u001a\u00020\u0005H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0006J!\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\b\b\u0001\u0010\n\u001a\u00020\u000bH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\f\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\r"}, d2 = {"Lcom/newproject/user/network/auth/AuthApi;", "", "signUp", "Lcom/newproject/user/data/model/remote/auth/SignUpResponse;", "createCustomer", "Lcom/newproject/user/data/model/remote/auth/SignUpBody;", "(Lcom/newproject/user/data/model/remote/auth/SignUpBody;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "userProfile", "Lretrofit2/Response;", "Lcom/newproject/user/data/model/remote/auth/LoginResponse;", "id", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public abstract interface AuthApi {
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.GET(value = "api/profile/{id}")
    public abstract java.lang.Object userProfile(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Path(value = "id")
    java.lang.String id, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.newproject.user.data.model.remote.auth.LoginResponse>> continuation);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.POST(value = "api/createCustomer")
    public abstract java.lang.Object signUp(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Body()
    com.newproject.user.data.model.remote.auth.SignUpBody createCustomer, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.newproject.user.data.model.remote.auth.SignUpResponse> continuation);
}