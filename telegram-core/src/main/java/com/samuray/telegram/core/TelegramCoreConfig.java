package com.samuray.telegram.core;

public final class TelegramCoreConfig {
    private final int apiId;
    private final String apiHash;
    private final boolean enableNotifications;

    public TelegramCoreConfig(int apiId, String apiHash, boolean enableNotifications) {
        if (apiId <= 0) throw new IllegalArgumentException("apiId must be positive");
        if (apiHash == null || apiHash.trim().isEmpty()) {
            throw new IllegalArgumentException("apiHash is required");
        }
        this.apiId = apiId;
        this.apiHash = apiHash;
        this.enableNotifications = enableNotifications;
    }

    public int getApiId() { return apiId; }
    public String getApiHash() { return apiHash; }
    public boolean isEnableNotifications() { return enableNotifications; }
}
