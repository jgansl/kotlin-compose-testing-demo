package com.example.one

import com.google.common.truth.Truth.assertThat
import org.junit.Test

class RegistrationUtilTest {

    @Test
    fun `FALSE if empty username`() {
        val result = RegistrationUtil.validateRegistrationInput(
            "","123","123"
        )

        assertThat(result).isFalse()
    }

    @Test
    fun `FALSE if username already exists should`() {
        val result = RegistrationUtil.validateRegistrationInput(
            "Carl","123","123"
        )

        assertThat(result).isFalse()
    }

    @Test
    fun `FALSE if password is empty`() {
        val result = RegistrationUtil.validateRegistrationInput(
            "Not Empty","","123"
        )

        assertThat(result).isFalse()
    }

    @Test
    fun `FALSE if confirmPassword is empty`() {
        val result = RegistrationUtil.validateRegistrationInput(
            "Not Empty","Not Empty",""
        )

        assertThat(result).isFalse()
    }

    @Test
    fun `FALSE if confirmPassword does not match password`() {
        val result = RegistrationUtil.validateRegistrationInput(
            "Not Empty","Not Empty","Also Not Empty"
        )

        assertThat(result).isFalse()
    }

    @Test
    fun `FALSE if password input length is less than 3 characters`() {
        val result = RegistrationUtil.validateRegistrationInput(
            "Not Empty","NE","Less Than 2 Digits"
        )

        assertThat(result).isFalse()
    }
}