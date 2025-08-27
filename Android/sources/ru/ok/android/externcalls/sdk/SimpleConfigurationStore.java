package ru.ok.android.externcalls.sdk;

public class SimpleConfigurationStore implements cf3 {
    private final String appKey;
    private final String baseEndpoint;
    private bf3 sessionInfo;

    public SimpleConfigurationStore(cf3 cf3) {
        this.appKey = cf3.getAppKey();
        this.baseEndpoint = cf3.getBaseEndpoint();
    }

    public String getAppKey() {
        return this.appKey;
    }

    public String getBaseEndpoint() {
        return this.baseEndpoint;
    }

    public bf3 getSessionInfo() {
        return this.sessionInfo;
    }

    public void setSessionInfo(bf3 bf3) {
        this.sessionInfo = bf3;
    }
}
