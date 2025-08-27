package defpackage;

import kotlin.time.Duration;
import kotlin.time.DurationKt;
import kotlin.time.DurationUnit;

/* renamed from: d7b  reason: default package */
public final class d7b {
    public final fbf a;
    public final boolean b;
    public final s9f c;
    public volatile long d = DurationKt.toDuration(System.currentTimeMillis(), DurationUnit.MILLISECONDS);

    public d7b(fbf fbf, boolean z, s9f s9f) {
        this.a = fbf;
        this.b = z;
        this.c = s9f;
        int i = bq7.a;
        Duration.Companion companion = Duration.Companion;
    }
}
