package defpackage;

import android.content.Context;
import kotlin.Lazy;
import kotlin.time.Duration;
import kotlin.time.DurationKt;
import kotlin.time.DurationUnit;

/* renamed from: lta  reason: default package */
public final class lta {
    public static final long e = DurationKt.toDuration(3, DurationUnit.SECONDS);
    public static final /* synthetic */ int f = 0;
    public final Context a;
    public final Lazy b;
    public final Lazy c;
    public final Lazy d;

    static {
        Duration.Companion companion = Duration.Companion;
    }

    public lta(Context context, Lazy lazy, Lazy lazy2, Lazy lazy3) {
        this.a = context;
        this.b = lazy;
        this.c = lazy2;
        this.d = lazy3;
    }

    public final et4 a() {
        return (et4) this.b.getValue();
    }
}
