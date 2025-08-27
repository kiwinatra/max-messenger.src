package ru.ok.android.externcalls.analytics.internal.api;

import java.io.IOException;
import ru.ok.android.api.json.JsonSerializeException;
import ru.ok.android.externcalls.analytics.events.CallAnalyticsEvent;
import ru.ok.android.externcalls.analytics.internal.event.EventSerializer;

public class SimpleItemsApiValue extends hs0 {
    private final Iterable<CallAnalyticsEvent> items;

    public SimpleItemsApiValue(Iterable<CallAnalyticsEvent> iterable) {
        this.items = iterable;
    }

    public void write(zp7 zp7) throws IOException, JsonSerializeException {
        zp7.v();
        for (CallAnalyticsEvent serialize : this.items) {
            EventSerializer.INSTANCE.serialize(zp7, serialize);
        }
        zp7.u();
    }
}
