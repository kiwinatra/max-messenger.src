package defpackage;

import android.os.SystemClock;
import java.util.concurrent.TimeUnit;

/* renamed from: jsb  reason: default package */
public abstract class jsb {
    public static final long a = TimeUnit.MILLISECONDS.toNanos(System.currentTimeMillis());
    public static final long b = SystemClock.elapsedRealtimeNanos();
}
