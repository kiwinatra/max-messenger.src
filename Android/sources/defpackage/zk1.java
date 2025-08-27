package defpackage;

import java.util.concurrent.TimeUnit;
import kotlin.ranges.LongRange;

/* renamed from: zk1  reason: default package */
public abstract class zk1 {
    public static final LongRange a;

    static {
        long millis = TimeUnit.SECONDS.toMillis(5);
        a = new LongRange(millis - 2000, millis + 4000);
    }
}
