package defpackage;

import android.system.Os;
import android.system.OsConstants;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* renamed from: atg  reason: default package */
public final class atg extends Lambda implements Function0 {
    public static final atg a = new Lambda(0);

    public final Object invoke() {
        return Long.valueOf(Os.sysconf(OsConstants._SC_NPROCESSORS_CONF));
    }
}
