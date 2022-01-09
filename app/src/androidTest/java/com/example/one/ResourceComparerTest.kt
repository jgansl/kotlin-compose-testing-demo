package com.example.one

import android.content.Context
import androidx.test.core.app.ApplicationProvider
import org.junit.Assert.*
import com.google.common.truth.Truth.assertThat
import org.junit.After
import org.junit.Before
import org.junit.Test

class ResourceComparerTest {

    /**
     * Bad practice to initialize here - as global
     * dirty between tests - not isolated (F.I.R.S.T); flaky
     */
    private lateinit var resourceComparer: ResourceComparer

    @Before
    fun setup() {
        resourceComparer = ResourceComparer()
    }

    @After
    fun teardown() {
        //e.g. close DB
    }

    @Test
    fun stringResourceSameAsGivenString_returnsTrue() {
//        resourceComparer = ResourceComparer()
        val context = ApplicationProvider.getApplicationContext<Context>()
        val result = resourceComparer.isEqual(context, R.string.app_name, "one")
        assertThat(result).isTrue()
    }

    @Test
    fun stringResourceDifferentThanGivenString_returnsFalse() {
//        resourceComparer = ResourceComparer()
        val context = ApplicationProvider.getApplicationContext<Context>()
        val result = resourceComparer.isEqual(context, R.string.app_name, "two")
        assertThat(result).isFalse()
    }
}