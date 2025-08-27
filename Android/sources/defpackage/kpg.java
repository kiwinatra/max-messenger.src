package defpackage;

import kotlin.time.Duration;
import kotlin.time.DurationKt;
import kotlin.time.DurationUnit;

/* renamed from: kpg  reason: default package */
public final class kpg {
    public final bud a;
    public volatile int b;
    public final f94 c;
    public volatile int d;
    public final f94 e;

    public kpg(hs7 hs7, bud bud) {
        this.a = bud;
        int i = f94.g;
        Duration.Companion companion = Duration.Companion;
        DurationUnit durationUnit = DurationUnit.SECONDS;
        this.c = b94.a(DurationKt.toDuration(30, durationUnit), new jpg(this, hs7, 0));
        this.e = b94.a(DurationKt.toDuration(30, durationUnit), new jpg(this, hs7, 1));
    }
}
