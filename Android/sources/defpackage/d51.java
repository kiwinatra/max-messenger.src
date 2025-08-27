package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import ru.ok.android.externcalls.analytics.CallAnalyticsSender;
import ru.ok.android.externcalls.analytics.events.EventItemValue;
import ru.ok.android.externcalls.analytics.events.EventItemsMap;
import ru.ok.android.externcalls.analytics.events.SdkMetricStatEvent;

/* renamed from: d51  reason: default package */
public final class d51 implements c51 {
    public static final List e = CollectionsKt.listOf("rtt");
    public final CallAnalyticsSender a;
    public final rjf b;
    public EventItemsMap c;
    public final ArrayList d = new ArrayList();

    static {
        yk1[] yk1Arr = yk1.b;
    }

    public d51(CallAnalyticsSender callAnalyticsSender, sjf sjf) {
        this.a = callAnalyticsSender;
        this.b = sjf;
    }

    public final void b(rsg rsg, EventItemsMap eventItemsMap) {
        long j;
        EventItemsMap eventItemsMap2 = rsg.c;
        eventItemsMap2.addAll(eventItemsMap);
        Long l = rsg.d;
        if (l == null) {
            rjf rjf = this.b;
            Long a2 = ((sjf) rjf).a();
            if (a2 != null) {
                l = a2;
            } else {
                ((sjf) rjf).getClass();
                j = System.currentTimeMillis();
                this.a.send(new SdkMetricStatEvent.Builder(rsg.a, rsg.b).addAll((Map<String, ? extends EventItemValue>) eventItemsMap2.getItems()).set("timestamp", Long.valueOf(j)).build());
            }
        }
        j = l.longValue();
        this.a.send(new SdkMetricStatEvent.Builder(rsg.a, rsg.b).addAll((Map<String, ? extends EventItemValue>) eventItemsMap2.getItems()).set("timestamp", Long.valueOf(j)).build());
    }

    public final void c(String str, EventItemValue eventItemValue, EventItemsMap eventItemsMap) {
        rsg rsg = new rsg(str, eventItemValue, eventItemsMap, ((sjf) this.b).a());
        EventItemsMap eventItemsMap2 = this.c;
        if (eventItemsMap2 == null) {
            this.d.add(rsg);
        } else {
            b(rsg, eventItemsMap2);
        }
    }
}
