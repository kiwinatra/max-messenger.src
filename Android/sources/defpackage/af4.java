package defpackage;

import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.IntCompanionObject;

/* renamed from: af4  reason: default package */
public final class af4 implements r2f {
    public static final long a = TimeUnit.MINUTES.toMillis(5);

    public final Object get() {
        int min = (int) Math.min(Runtime.getRuntime().maxMemory(), 2147483647L);
        int i = min < 16777216 ? 1048576 : min < 33554432 ? 2097152 : 4194304;
        return new a69(i, IntCompanionObject.MAX_VALUE, i, a, i / 8);
    }
}
