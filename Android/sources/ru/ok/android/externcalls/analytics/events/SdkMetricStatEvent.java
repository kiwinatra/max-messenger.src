package ru.ok.android.externcalls.analytics.events;

import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.ok.android.externcalls.analytics.events.EventItemValue;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u0000 \u000e2\u00020\u0001:\u0002\r\u000eB\u001b\b\u0000\u0012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\u0010\u0006J\b\u0010\f\u001a\u00020\u0004H\u0016R\u0014\u0010\u0007\u001a\u00020\u0004XD¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR \u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u000f"}, d2 = {"Lru/ok/android/externcalls/analytics/events/SdkMetricStatEvent;", "Lru/ok/android/externcalls/analytics/events/CallAnalyticsEvent;", "items", "", "", "Lru/ok/android/externcalls/analytics/events/EventItemValue;", "(Ljava/util/Map;)V", "apiMethodName", "getApiMethodName", "()Ljava/lang/String;", "getItems", "()Ljava/util/Map;", "toString", "Builder", "Companion", "calls-sdk-analytics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class SdkMetricStatEvent extends CallAnalyticsEvent {
    private static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    private static final String NAME_KEY = "name";
    private static final String STRING_VALUE_KEY = "string_value";
    private static final String VALUE_KEY = "value";
    private final String apiMethodName = "vchat.clientStats";
    private final Map<String, EventItemValue> items;

    @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u001a\u0010\t\u001a\u00020\u00002\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00050\u000bJ\u000e\u0010\t\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\bJ\u0006\u0010\f\u001a\u00020\rJ \u0010\u000e\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u00032\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0002¢\u0006\u0002\u0010\u0012J \u0010\u000e\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u00032\b\u0010\u0010\u001a\u0004\u0018\u00010\u0013H\u0002¢\u0006\u0002\u0010\u0014J \u0010\u000e\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u00032\b\u0010\u0010\u001a\u0004\u0018\u00010\u0015H\u0002¢\u0006\u0002\u0010\u0016J\u001b\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u00032\b\u0010\u0010\u001a\u0004\u0018\u00010\u0003H\u0002J\u0019\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u0005H\u0002R\u000e\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Lru/ok/android/externcalls/analytics/events/SdkMetricStatEvent$Builder;", "", "metricName", "", "metricValue", "Lru/ok/android/externcalls/analytics/events/EventItemValue;", "(Ljava/lang/String;Lru/ok/android/externcalls/analytics/events/EventItemValue;)V", "map", "Lru/ok/android/externcalls/analytics/events/EventItemsMap;", "addAll", "items", "", "build", "Lru/ok/android/externcalls/analytics/events/SdkMetricStatEvent;", "set", "key", "value", "", "(Ljava/lang/String;Ljava/lang/Float;)Lru/ok/android/externcalls/analytics/events/SdkMetricStatEvent$Builder;", "", "(Ljava/lang/String;Ljava/lang/Integer;)Lru/ok/android/externcalls/analytics/events/SdkMetricStatEvent$Builder;", "", "(Ljava/lang/String;Ljava/lang/Long;)Lru/ok/android/externcalls/analytics/events/SdkMetricStatEvent$Builder;", "calls-sdk-analytics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Builder {
        private final EventItemsMap map;
        private final String metricName;
        private final EventItemValue metricValue;

        public Builder(String str, EventItemValue eventItemValue) {
            this.metricName = str;
            this.metricValue = eventItemValue;
            EventItemsMap eventItemsMap = new EventItemsMap();
            this.map = eventItemsMap;
            eventItemsMap.set(SdkMetricStatEvent.NAME_KEY, str);
            if (eventItemValue instanceof EventItemValue.StringValue) {
                eventItemsMap.set(SdkMetricStatEvent.STRING_VALUE_KEY, eventItemValue);
            } else {
                eventItemsMap.set(SdkMetricStatEvent.VALUE_KEY, eventItemValue);
            }
        }

        public final Builder addAll(Map<String, ? extends EventItemValue> map2) {
            this.map.addAll(map2);
            return this;
        }

        public final SdkMetricStatEvent build() {
            return new SdkMetricStatEvent(MapsKt.toMap(this.map.getItems()));
        }

        public final Builder set(String str, EventItemValue eventItemValue) {
            this.map.set(str, eventItemValue);
            return this;
        }

        public final Builder addAll(EventItemsMap eventItemsMap) {
            addAll((Map<String, ? extends EventItemValue>) eventItemsMap.getItems());
            return this;
        }

        public final Builder set(String str, String str2) {
            this.map.set(str, str2);
            return this;
        }

        public final Builder set(String str, Integer num) {
            this.map.set(str, num);
            return this;
        }

        public final Builder set(String str, Long l) {
            this.map.set(str, l);
            return this;
        }

        public final Builder set(String str, Float f) {
            this.map.set(str, f);
            return this;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lru/ok/android/externcalls/analytics/events/SdkMetricStatEvent$Companion;", "", "()V", "NAME_KEY", "", "STRING_VALUE_KEY", "VALUE_KEY", "calls-sdk-analytics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public SdkMetricStatEvent(Map<String, ? extends EventItemValue> map) {
        this.items = map;
    }

    public String getApiMethodName() {
        return this.apiMethodName;
    }

    public Map<String, EventItemValue> getItems() {
        return this.items;
    }

    public String toString() {
        return g63.j("SdkMetricStatEvent apiMethod=", getApiMethodName(), " ", CollectionsKt___CollectionsKt.joinToString$default(getItems().entrySet(), ", ", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, SdkMetricStatEvent$toString$1.INSTANCE, 30, (Object) null));
    }
}
