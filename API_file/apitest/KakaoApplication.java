package com.example.apitest;

import android.app.Application;

import com.kakao.sdk.common.KakaoSdk;

public class KakaoApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        KakaoSdk.init(this, "27aa42ed60d3ecc0ea14ee86345ce012");
    }
}
