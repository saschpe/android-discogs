package saschpe.discogs

import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.JUnit4

@RunWith(JUnit4::class)
class DiscogsTest {
    @Test
    fun setupWithInvalidToken() {
        val discogs = Discogs(TEST_USER_AGENT, "invalid_token" )
    }

    companion object {
        const val TEST_USER_AGENT = "saschpe.discogs"
    }
}