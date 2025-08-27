package ru.ok.android.externcalls.analytics.events;

import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010&\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "it", "", "", "Lru/ok/android/externcalls/analytics/events/EventItemValue;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
public final class SdkIntervalStatEvent$toString$1 extends Lambda implements Function1<Map.Entry<? extends String, ? extends EventItemValue>, CharSequence> {
    public static final SdkIntervalStatEvent$toString$1 INSTANCE = new SdkIntervalStatEvent$toString$1();

    public SdkIntervalStatEvent$toString$1() {
        super(1);
    }

    public final CharSequence invoke(Map.Entry<String, ? extends EventItemValue> entry) {
        String key = entry.getKey();
        Object value = entry.getValue();
        return key + "=" + value;
    }
}
