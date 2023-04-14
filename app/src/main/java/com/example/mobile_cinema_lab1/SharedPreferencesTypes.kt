package com.example.mobile_cinema_lab1

class SharedPreferencesTypes {
    companion object{
        const val AccessToken: String = "access_token"
        const val RefreshToken: String = "refresh_token"
        const val UserId: String = "user_id"
        const val UserName: String = "user_name"

        val allTypes = listOf(AccessToken, RefreshToken, UserName, UserId)
    }
}