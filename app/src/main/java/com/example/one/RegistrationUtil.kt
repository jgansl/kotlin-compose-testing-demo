package com.example.one

object RegistrationUtil {

    private val existingUsers = listOf("Peter", "Carl")

    /**
     * the input is not valid if...
     * ... the username/password is empty
     * ... username is already taken
     * ... confirmPassword does not match password
     * ... password is less than 3 characters in length
     */
    fun validateRegistrationInput(
        username: String,
        password: String,
        confirmPassword: String
    ): Boolean {
        if(username == null || username.length == 0) return false
        if(username in existingUsers) return false
        if(password != confirmPassword) return false
        if(password.count { it.isDigit() } < 2) return false
        return true
    }
}