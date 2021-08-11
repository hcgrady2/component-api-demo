package com.kpa.user;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0006"}, d2 = {"Lcom/kpa/user/UserService;", "Lcom/alibaba/android/arouter/facade/template/IProvider;", "checkLogin", "", "getUserInfo", "Lcom/kpa/user/UserInfo;", "user-api_debug"})
public abstract interface UserService extends com.alibaba.android.arouter.facade.template.IProvider {
    
    public abstract boolean checkLogin();
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.kpa.user.UserInfo getUserInfo();
}