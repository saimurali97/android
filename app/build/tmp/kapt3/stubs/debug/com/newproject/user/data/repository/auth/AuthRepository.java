package com.newproject.user.data.repository.auth;

import com.newproject.user.data.model.remote.auth.LoginResponse;
import com.newproject.user.data.model.remote.auth.SignUpBody;
import com.newproject.user.data.model.remote.auth.SignUpResponse;
import com.newproject.user.network.auth.AuthApi;
import retrofit2.Response;
import javax.inject.Inject;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u001f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\b\u001a\u00020\tH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\nJ\u0019\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0010"}, d2 = {"Lcom/newproject/user/data/repository/auth/AuthRepository;", "", "authApi", "Lcom/newproject/user/network/auth/AuthApi;", "(Lcom/newproject/user/network/auth/AuthApi;)V", "getUserProfile", "Lretrofit2/Response;", "Lcom/newproject/user/data/model/remote/auth/LoginResponse;", "id", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "signUp", "Lcom/newproject/user/data/model/remote/auth/SignUpResponse;", "createCustomer", "Lcom/newproject/user/data/model/remote/auth/SignUpBody;", "(Lcom/newproject/user/data/model/remote/auth/SignUpBody;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public final class AuthRepository {
    private final com.newproject.user.network.auth.AuthApi authApi = null;
    
    @javax.inject.Inject()
    public AuthRepository(@org.jetbrains.annotations.NotNull()
    com.newproject.user.network.auth.AuthApi authApi) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getUserProfile(@org.jetbrains.annotations.NotNull()
    java.lang.String id, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.newproject.user.data.model.remote.auth.LoginResponse>> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object signUp(@org.jetbrains.annotations.NotNull()
    com.newproject.user.data.model.remote.auth.SignUpBody createCustomer, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.newproject.user.data.model.remote.auth.SignUpResponse> continuation) {
        return null;
    }
}