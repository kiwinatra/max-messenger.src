package ru.ok.android.externcalls.analytics.events;

import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.MapsKt;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001:\u0001\rB\u001b\b\u0000\u0012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\u0010\u0006J\b\u0010\f\u001a\u00020\u0004H\u0016R\u0014\u0010\u0007\u001a\u00020\u0004XD¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR \u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u000e"}, d2 = {"Lru/ok/android/externcalls/analytics/events/SdkIntervalStatEvent;", "Lru/ok/android/externcalls/analytics/events/CallAnalyticsEvent;", "items", "", "", "Lru/ok/android/externcalls/analytics/events/EventItemValue;", "(Ljava/util/Map;)V", "apiMethodName", "getApiMethodName", "()Ljava/lang/String;", "getItems", "()Ljava/util/Map;", "toString", "Builder", "calls-sdk-analytics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class SdkIntervalStatEvent extends CallAnalyticsEvent {
    private final String apiMethodName = "vchat.clientStats";
    private final Map<String, EventItemValue> items;

    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u001a\u0010\u0005\u001a\u00020\u00002\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007J\u000e\u0010\u0005\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0004J\u0006\u0010\n\u001a\u00020\u000bJ \u0010\f\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\b2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0002¢\u0006\u0002\u0010\u0010J \u0010\f\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\b2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0011H\u0002¢\u0006\u0002\u0010\u0012J \u0010\f\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\b2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0013H\u0002¢\u0006\u0002\u0010\u0014J\u001b\u0010\f\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\b2\b\u0010\u000e\u001a\u0004\u0018\u00010\bH\u0002J\u0019\u0010\f\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\tH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lru/ok/android/externcalls/analytics/events/SdkIntervalStatEvent$Builder;", "", "()V", "map", "Lru/ok/android/externcalls/analytics/events/EventItemsMap;", "addAll", "items", "", "", "Lru/ok/android/externcalls/analytics/events/EventItemValue;", "build", "Lru/ok/android/externcalls/analytics/events/SdkIntervalStatEvent;", "set", "key", "value", "", "(Ljava/lang/String;Ljava/lang/Float;)Lru/ok/android/externcalls/analytics/events/SdkIntervalStatEvent$Builder;", "", "(Ljava/lang/String;Ljava/lang/Integer;)Lru/ok/android/externcalls/analytics/events/SdkIntervalStatEvent$Builder;", "", "(Ljava/lang/String;Ljava/lang/Long;)Lru/ok/android/externcalls/analytics/events/SdkIntervalStatEvent$Builder;", "calls-sdk-analytics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Builder {
        private final EventItemsMap map = new EventItemsMap();

        public final Builder addAll(Map<String, ? extends EventItemValue> map2) {
            this.map.addAll(map2);
            return this;
        }

        public final SdkIntervalStatEvent build() {
            return new SdkIntervalStatEvent(MapsKt.toMap(this.map.getItems()));
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

    public SdkIntervalStatEvent(Map<String, ? extends EventItemValue> map) {
        this.items = map;
    }

    public String getApiMethodName() {
        return this.apiMethodName;
    }

    public Map<String, EventItemValue> getItems() {
        return this.items;
    }

    public String toString() {
        return g63.j("SdkIntervalStatEvent apiMethod=", getApiMethodName(), " ", CollectionsKt___CollectionsKt.joinToString$default(getItems().entrySet(), ", ", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, SdkIntervalStatEvent$toString$1.INSTANCE, 30, (Object) null));
    }
}
