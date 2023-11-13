package com.prasanna.demo

object RegistrationUtil {
    val existingUser = listOf("Prasanna", "Subash")
    fun validateRegister(
        username: String,
        password: String,
        confirmPassword: String
    ) : Boolean {
        var result = true
        if (username.isEmpty()) {
            result = false
        } else if (existingUser.contains(username)) {
            result = false
        } else if(password.isEmpty()) {
            result = false
        } else if (confirmPassword.isEmpty()) {
            result = false
        } else if (!password.equals(confirmPassword)) {
            result = false
        }
        return result
    }
}