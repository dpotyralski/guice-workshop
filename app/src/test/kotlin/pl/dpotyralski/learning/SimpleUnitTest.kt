package pl.dpotyralski.learning

import com.google.common.truth.Truth.assertThat
import org.junit.jupiter.api.AfterEach
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test

class SimpleUnitTest {
    @BeforeEach
    fun setUp() {
        println("Setting up test")
    }

    @Test
    fun `example test`() {
        println("Running test")
        assertThat(1L).isEqualTo(1L)
    }

    @AfterEach
    fun tearDown() {
        println("Tearing down test")
    }
}
