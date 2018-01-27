package saschpe.discogs.model.user

import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.JUnit4

@RunWith(JUnit4::class)
class IdentityTest {
    @Test
    fun assignSomeValues() {
        val identity = Identity()
        identity.id = 123
        identity.consumerName = "abc"
        identity.resourceUrl = "http://foo"
        identity.username = "user"
    }
}