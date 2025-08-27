package defpackage;

import android.os.Looper;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;

/* renamed from: iif  reason: default package */
public abstract class iif {
    public static final Lazy a = LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, new dle(25));

    public static final String a(Thread thread) {
        if (((Looper) a.getValue()).isCurrentThread()) {
            return "ui";
        }
        String name = thread.getName();
        return (name == null || name.length() == 0) ? String.valueOf(thread.getId()) : thread.getName();
    }
}
