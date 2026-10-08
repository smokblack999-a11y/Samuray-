package com.samuray.telegram.core;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

public class TelegramCoreConfigTest {
    @Test
    public void storesRuntimeConfiguration() {
        TelegramCoreConfig config = new TelegramCoreConfig(123, "hash", false);
        assertEquals(123, config.getApiId());
        assertEquals("hash", config.getApiHash());
        assertFalse(config.isEnableNotifications());
    }
}
