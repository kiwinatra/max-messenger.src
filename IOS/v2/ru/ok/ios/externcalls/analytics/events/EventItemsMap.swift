package ru.ok.android.externcalls.analytics.events;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import ru.ok.android.externcalls.analytics.events.EventItemValue;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u001b\b\u0016\u0012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\u0010\u0006B\u0005¢\u0006\u0002\u0010\u0007J\u001a\u0010\t\u001a\u00020\u00002\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003J\u000e\u0010\t\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u0000J\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003J \u0010\f\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\u00042\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0002¢\u0006\u0002\u0010\u0010J \u0010\f\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\u00042\b\u0010\u000e\u001a\u0004\u0018\u00010\u0011H\u0002¢\u0006\u0002\u0010\u0012J \u0010\f\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\u00042\b\u0010\u000e\u001a\u0004\u0018\u00010\u0013H\u0002¢\u0006\u0002\u0010\u0014J\u001b\u0010\f\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\u00042\b\u0010\u000e\u001a\u0004\u0018\u00010\u0004H\u0002J\u0019\u0010\f\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u0005H\u0002R\u001a\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\bX\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lru/ok/android/externcalls/analytics/events/EventItemsMap;", "", "items", "", "", "Lru/ok/android/externcalls/analytics/events/EventItemValue;", "(Ljava/util/Map;)V", "()V", "", "addAll", "map", "getItems", "set", "key", "value", "", "(Ljava/lang/String;Ljava/lang/Float;)Lru/ok/android/externcalls/analytics/events/EventItemsMap;", "", "(Ljava/lang/String;Ljava/lang/Integer;)Lru/ok/android/externcalls/analytics/events/EventItemsMap;", "", "(Ljava/lang/String;Ljava/lang/Long;)Lru/ok/android/externcalls/analytics/events/EventItemsMap;", "calls-sdk-analytics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nEventItemsMap.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EventItemsMap.kt\nru/ok/android/externcalls/analytics/events/EventItemsMap\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,46:1\n1#2:47\n*E\n"})
public final class EventItemsMap {
    private final Map<String, EventItemValue> items;

    public EventItemsMap() {
        this.items = new LinkedHashMap();
    }

    public final EventItemsMap addAll(Map<String, ? extends EventItemValue> map) {
        this.items.putAll(map);
        return this;
    }

    public final Map<String, EventItemValue> getItems() {
        return this.items;
    }

    public final EventItemsMap set(String str, EventItemValue eventItemValue) {
        this.items.put(str, eventItemValue);
        return this;
    }

    public final EventItemsMap addAll(EventItemsMap eventItemsMap) {
        addAll((Map<String, ? extends EventItemValue>) eventItemsMap.getItems());
        return this;
    }

    public final EventItemsMap set(String str, String str2) {
        if (str2 != null) {
            this.items.put(str, EventItemValue.StringValue.m1598boximpl(EventItemValue.StringValue.m1599constructorimpl(str2)));
        }
        return this;
    }

    public EventItemsMap(Map<String, ? extends EventItemValue> map) {
        this();
        this.items.putAll(map);
    }

    public final EventItemsMap set(String str, Integer num) {
        if (num != null) {
            this.items.put(str, EventItemValue.IntValue.m1584boximpl(EventItemValue.IntValue.m1585constructorimpl(num.intValue())));
        }
        return this;
    }

    public final EventItemsMap set(String str, Long l) {
        if (l != null) {
            this.items.put(str, EventItemValue.LongValue.m1591boximpl(EventItemValue.LongValue.m1592constructorimpl(l.longValue())));
        }
        return this;
    }

    public final EventItemsMap set(String str, Float f) {
        if (f != null) {
            this.items.put(str, EventItemValue.FloatValue.m1577boximpl(EventItemValue.FloatValue.m1578constructorimpl(f.floatValue())));
        }
        return this;
    }
}
