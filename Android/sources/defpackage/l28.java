package defpackage;

import android.net.Uri;
import java.util.Collections;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: l28  reason: default package */
public final class l28 {
    public static final AtomicLong c = new AtomicLong();
    public final Map a;
    public final long b;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public l28(long j, q74 q74, long j2) {
        this(0, Collections.emptyMap());
        Uri uri = q74.a;
    }

    public l28(long j, Map map) {
        this.a = map;
        this.b = j;
    }
}
