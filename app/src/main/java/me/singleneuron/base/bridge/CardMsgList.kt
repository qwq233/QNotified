package me.singleneuron.base.bridge

import com.google.gson.Gson
import nil.nadph.qnotified.util.NonNull
import java.net.URL

abstract class CardMsgList {

    companion object {

        @JvmStatic
        @NonNull
        fun getInstance(): ()->String {
            //Todo
            return ::getBlackListFormGithub
        }

    }
}

fun getBlackListExample(): String {
    val map = mapOf(
            "禁止引流" to "^-?[999999999asdas99999]*$",
            "禁止发送回执消息" to "^-?[999999999asdas99999]*$",
            "禁止干扰性卡片" to "^-?[999999999asdas99999]*$",
            "禁止干扰性消息" to "^-?[999999999asdas99999]*$",
            "禁止音视频通话" to "^-?[999999999asdas99999]*$"
    )
    return Gson().toJson(map)
}

fun getBlackListFormGithub(): String {
    return URL("https://raw.githubusercontent.com/qwq233/QNotified/master/CardMsgBlackList.json").readText()
}