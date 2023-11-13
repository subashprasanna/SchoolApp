package com.prasanna.demo

import org.junit.Assert.*
import org.junit.Test

class RegistrationUtilTest {
    @Test
    fun `is valid username`() {
        val result = RegistrationUtil.validateRegister(
            username = "",
            password =  "",
            confirmPassword = ""
        )
        assertFalse(result)
    }
}