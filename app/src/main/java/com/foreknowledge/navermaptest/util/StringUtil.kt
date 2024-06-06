package com.foreknowledge.navermapapi.util

import com.foreknowledge.navermapapi.GlobalApplication

/**
 * Created by Yeji on 13,April,2020.
 */
object StringUtil {
    fun getString(resId: Int) = GlobalApplication.getContext().getString(resId)
}