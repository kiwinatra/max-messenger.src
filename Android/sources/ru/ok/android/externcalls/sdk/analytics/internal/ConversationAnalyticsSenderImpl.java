package ru.ok.android.externcalls.sdk.analytics.internal;

import kotlin.Metadata;
import ru.ok.android.externcalls.analytics.CallAnalyticsSender;
import ru.ok.android.externcalls.sdk.analytics.ConversationAnalyticsConfigurationImpl;
import ru.ok.android.externcalls.sdk.analytics.ConversationAnalyticsSender;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0007\u001a\u00020\bH\u0016R\u0014\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Lru/ok/android/externcalls/sdk/analytics/internal/ConversationAnalyticsSenderImpl;", "Lru/ok/android/externcalls/sdk/analytics/ConversationAnalyticsSender;", "()V", "configuration", "Lru/ok/android/externcalls/sdk/analytics/ConversationAnalyticsConfigurationImpl;", "getConfiguration", "()Lru/ok/android/externcalls/sdk/analytics/ConversationAnalyticsConfigurationImpl;", "forceSendScheduledEvents", "", "calls-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class ConversationAnalyticsSenderImpl implements ConversationAnalyticsSender {
    private final ConversationAnalyticsConfigurationImpl configuration = new ConversationAnalyticsConfigurationImpl();

    public void forceSendScheduledEvents() {
        CallAnalyticsSender.INSTANCE.forceSendScheduledEvents();
    }

    public ConversationAnalyticsConfigurationImpl getConfiguration() {
        return this.configuration;
    }
}
