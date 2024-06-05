package com.foreknowledge.navermaptest

import android.app.Application
import android.content.Context
import com.naver.maps.map.NaverMapSdk
import com.naver.maps.map.NaverMapSdk.NaverCloudPlatformClient

/**
 * GlobalApplication 클래스는 애플리케이션의 컨텍스트를 저장하고, Naver 지도 SDK를 초기화하는 역할을 수행합니다.
 */
class GlobalApplication: Application() {
    companion object {
        private lateinit var APPLICATION_CONTEXT: Context

        @JvmStatic
        fun getContext(): Context {
            return APPLICATION_CONTEXT
        }
    }

    override fun onCreate() {
        super.onCreate()
        APPLICATION_CONTEXT = applicationContext

        NaverMapSdk.getInstance(this).client =
            NaverCloudPlatformClient(BuildConfig.NAVER_CLIENT_ID)
    }
}