package com.expertszen;

import org.junit.Test;
import static org.junit.Assert.assertTrue;

public class BatchJobAppTest {
    @Test
    public void testApp() {
        assertTrue(true);
    }
    @Test
    public void testShouldFail() {
        assertEquals(1, 2); //This will always fail
    }
}
