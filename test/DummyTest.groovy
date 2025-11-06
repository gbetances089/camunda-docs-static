package org.camunda.docs

import org.junit.Test
import static org.junit.Assert.*

class DummyTest {

    @Test
    void testDummyAssertion() {
        // This is a simple dummy test
        assertTrue("This dummy test should always pass", true)
    }

    @Test
    void testBasicArithmetic() {
        // Another simple test to verify basic functionality
        int result = 2 + 2
        assertEquals(4, result)
    }

    @Test
    void testStringComparison() {
        // Test string equality
        String expected = "dummy"
        String actual = "dummy"
        assertEquals(expected, actual)
    }
}
