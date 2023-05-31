package com.newproject.user.data.model.local

import android.annotation.SuppressLint
import android.content.Context
import android.content.SharedPreferences
import dagger.hilt.android.qualifiers.ApplicationContext
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class Preferenceshandler @Inject internal constructor(@ApplicationContext private val mContext: Context) {

    private val appSharedPreferencesObject: SharedPreferences
        get() = mContext.getSharedPreferences(
            SHARED_PREFERENCES_KEY,
            Context.MODE_PRIVATE
        )

    fun getValue(key: String?): Any? {
        if (key == null) {
            return null
        }
        val allPreferences: Map<String, *>
        val preferences = appSharedPreferencesObject
        allPreferences = preferences.all
        for ((key1, value) in allPreferences) {
            if (key1 == key)
                return value
        }
        return null
    }

    val userToken: String
        get() {
            val prefObj = getValue("userToken")
            return if (prefObj != null) {
                prefObj as String
            } else ""
        }

    private fun saveSharedPreferences(key: String?, `object`: String?): Boolean {
        if (key == null || `object` == null) {
            return false
        }
        val preferences = appSharedPreferencesObject
        val sharedPreferencesEditor = preferences.edit()
        sharedPreferencesEditor.putString(key, `object`)
        return sharedPreferencesEditor.commit()
    }

    private fun saveSharedPreferencesBoolean(key: String?, `object`: Boolean?): Boolean {
        if (key == null || `object` == null) {
            return false
        }
        val preferences = appSharedPreferencesObject
        val sharedPreferencesEditor = preferences.edit()
        sharedPreferencesEditor.putBoolean(key, `object`)
        return sharedPreferencesEditor.commit()
    }

    fun saveUserToken(userToken: String): Boolean {
        return saveSharedPreferences("userToken", userToken)
    }

    fun setValue(key: String, value: String): Boolean {
        return saveSharedPreferences(key, value)
    }

    fun setBoolean(key: String, value: Boolean): Boolean {
        return saveSharedPreferencesBoolean(key, value)
    }

    @SuppressLint("CommitPrefEdits")
    fun clearLocalData() {
        val mobileNumber = appSharedPreferencesObject.getString("fingerPrintMobileNumber", "")
        appSharedPreferencesObject.edit().clear()
        if (mobileNumber != null) {
            setValue("fingerPrintMobileNumber", mobileNumber)
        }
    }

    companion object {
        const val SHARED_PREFERENCES_KEY = "com.munchngiveandroid.user"
    }
}