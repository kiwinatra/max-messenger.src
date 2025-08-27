package defpackage;

import android.os.Build;
import kotlin.time.DurationKt;

/* renamed from: av0  reason: default package */
public abstract class av0 {
    public static final /* synthetic */ int a = 0;

    static {
        int i = Build.VERSION.SDK_INT;
        zu0 zu0 = zu0.a;
        if (i >= 30) {
            zu0.a(30);
        }
        if (i >= 30) {
            zu0.a(31);
        }
        if (i >= 30) {
            zu0.a(33);
        }
        if (i >= 30) {
            zu0.a(DurationKt.NANOS_IN_MILLIS);
        }
    }
}
