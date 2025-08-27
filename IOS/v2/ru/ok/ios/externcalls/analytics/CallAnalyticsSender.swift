package ru.ok.android.externcalls.analytics;

import kotlin.Metadata;
import ru.ok.android.externcalls.analytics.config.CallAnalyticsConfig;
import ru.ok.android.externcalls.analytics.events.CallAnalyticsEvent;
import ru.ok.android.externcalls.analytics.internal.config.CallAnalyticsConfigStorage;
import ru.ok.android.externcalls.analytics.internal.event.EventQueueCollector;
import ru.ok.android.externcalls.analytics.internal.log.DefaultCallAnalyticsLogger;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0005\u001a\u00020\u0006J\u000e\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\tJ\u000e\u0010\n\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\fJ\u000e\u0010\r\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u000fR\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lru/ok/android/externcalls/analytics/CallAnalyticsSender;", "", "()V", "LOG_TAG", "", "forceSendScheduledEvents", "", "initialize", "config", "Lru/ok/android/externcalls/analytics/config/CallAnalyticsConfig;", "send", "event", "Lru/ok/android/externcalls/analytics/events/CallAnalyticsEvent;", "setIdle", "isIdle", "", "calls-sdk-analytics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class CallAnalyticsSender {
    public static final CallAnalyticsSender INSTANCE = new CallAnalyticsSender();
    private static final String LOG_TAG = "CallAnalyticsSender";

    private CallAnalyticsSender() {
    }

    /* access modifiers changed from: private */
    public static final boolean setIdle$lambda$0(boolean z) {
        return z;
    }

    public final void forceSendScheduledEvents() {
        EventQueueCollector.flushAll();
    }

    public final synchronized void initialize(CallAnalyticsConfig callAnalyticsConfig) {
        CallAnalyticsConfigStorage callAnalyticsConfigStorage = CallAnalyticsConfigStorage.INSTANCE;
        if (callAnalyticsConfigStorage.getConfig() == null) {
            callAnalyticsConfigStorage.setConfig(callAnalyticsConfig);
        }
    }

    public final void send(CallAnalyticsEvent callAnalyticsEvent) {
        if (CallAnalyticsConfigStorage.INSTANCE.getConfig() == null) {
            DefaultCallAnalyticsLogger defaultCallAnalyticsLogger = new DefaultCallAnalyticsLogger();
            defaultCallAnalyticsLogger.e(LOG_TAG, "CallAnalyticsSender is not initialized, event=" + callAnalyticsEvent + " is skipped");
            return;
        }
        EventQueueCollector.getInstance(callAnalyticsEvent.getApiMethodName()).addEvent(callAnalyticsEvent);
    }

    public final void setIdle(boolean z) {
        EventQueueCollector.setIdleStateProvider(new vz0(z, 0));
    }
}
