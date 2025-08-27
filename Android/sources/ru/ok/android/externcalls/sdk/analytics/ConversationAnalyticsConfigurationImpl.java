package ru.ok.android.externcalls.sdk.analytics;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u0004H\u0016J\u0010\u0010\u000f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\bH\u0016R\"\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004@BX\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\"\u0010\t\u001a\u0004\u0018\u00010\b2\b\u0010\u0003\u001a\u0004\u0018\u00010\b@BX\u000e¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0010"}, d2 = {"Lru/ok/android/externcalls/sdk/analytics/ConversationAnalyticsConfigurationImpl;", "Lru/ok/android/externcalls/sdk/analytics/ConversationAnalyticsConfiguration;", "()V", "<set-?>", "Lru/ok/android/externcalls/sdk/analytics/ApplicationNameProvider;", "applicationNameProvider", "getApplicationNameProvider", "()Lru/ok/android/externcalls/sdk/analytics/ApplicationNameProvider;", "Lru/ok/android/externcalls/sdk/analytics/UploadConfigProvider;", "uploadConfigProvider", "getUploadConfigProvider", "()Lru/ok/android/externcalls/sdk/analytics/UploadConfigProvider;", "setApplicationNameProvider", "", "provider", "setUploadConfigProvider", "calls-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class ConversationAnalyticsConfigurationImpl implements ConversationAnalyticsConfiguration {
    private ApplicationNameProvider applicationNameProvider;
    private UploadConfigProvider uploadConfigProvider;

    public final ApplicationNameProvider getApplicationNameProvider() {
        return this.applicationNameProvider;
    }

    public final UploadConfigProvider getUploadConfigProvider() {
        return this.uploadConfigProvider;
    }

    public void setApplicationNameProvider(ApplicationNameProvider applicationNameProvider2) {
        this.applicationNameProvider = applicationNameProvider2;
    }

    public void setUploadConfigProvider(UploadConfigProvider uploadConfigProvider2) {
        this.uploadConfigProvider = uploadConfigProvider2;
    }
}
