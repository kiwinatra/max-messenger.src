package defpackage;

import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.LongCompanionObject;

/* renamed from: v58  reason: default package */
public enum v58 {
    c(TimeUnit.MINUTES.toSeconds(20), "MIN_20"),
    o(r1.toSeconds(1), "HOUR_1"),
    v(r1.toSeconds(3), "HOUR_3"),
    w(r1.toSeconds(24), "HOUR_24"),
    x(LongCompanionObject.MAX_VALUE, "NO_LIMIT");
    
    public final long a;
    public final long b;

    /* access modifiers changed from: public */
    v58(long j, String str) {
        this.a = r2;
        this.b = j;
    }
}
