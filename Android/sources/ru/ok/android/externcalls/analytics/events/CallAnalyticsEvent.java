package ru.ok.android.externcalls.analytics.events;

import java.util.Map;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u0012\u0010\u0003\u001a\u00020\u0004X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u001e\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\t0\bX¦\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lru/ok/android/externcalls/analytics/events/CallAnalyticsEvent;", "", "()V", "apiMethodName", "", "getApiMethodName", "()Ljava/lang/String;", "items", "", "Lru/ok/android/externcalls/analytics/events/EventItemValue;", "getItems", "()Ljava/util/Map;", "calls-sdk-analytics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public abstract class CallAnalyticsEvent {
    public abstract String getApiMethodName();

    public abstract Map<String, EventItemValue> getItems();
}
