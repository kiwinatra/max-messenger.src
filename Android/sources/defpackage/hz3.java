package defpackage;

import java.time.Clock;
import ru.ok.android.externcalls.sdk.log.ExtLogger;
import ru.ok.android.externcalls.sdk.log.stat.StatisticsManager;

/* renamed from: hz3  reason: default package */
public final /* synthetic */ class hz3 implements StatisticsManager.TimeProvider, ExtLogger.TimeProvider {
    public final /* synthetic */ int a;
    public final /* synthetic */ Clock b;

    public /* synthetic */ hz3(Clock clock, int i) {
        this.a = i;
        this.b = clock;
    }

    public final long getCurrentTimeMillis() {
        int i = this.a;
        Clock clock = this.b;
        switch (i) {
            case 0:
                return clock.millis();
            default:
                return clock.millis();
        }
    }
}
