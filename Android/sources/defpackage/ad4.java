package defpackage;

import android.app.ActivityManager;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.IntCompanionObject;

/* renamed from: ad4  reason: default package */
public final class ad4 implements r2f {
    public static final long b = TimeUnit.MINUTES.toMillis(5);
    public final ActivityManager a;

    public ad4(ActivityManager activityManager) {
        this.a = activityManager;
    }

    public final Object get() {
        int min = Math.min(this.a.getMemoryClass() * 1048576, IntCompanionObject.MAX_VALUE);
        return new a69(min < 33554432 ? 4194304 : min < 67108864 ? 6291456 : min / 4, 256, IntCompanionObject.MAX_VALUE, b, IntCompanionObject.MAX_VALUE);
    }
}
