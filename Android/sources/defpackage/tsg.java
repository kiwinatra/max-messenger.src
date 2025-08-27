package defpackage;

import android.system.Os;
import android.system.OsConstants;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* renamed from: tsg  reason: default package */
public final class tsg extends Lambda implements Function0 {
    public static final tsg a = new Lambda(0);

    public final Object invoke() {
        return Long.valueOf(Os.sysconf(OsConstants._SC_CLK_TCK));
    }
}
