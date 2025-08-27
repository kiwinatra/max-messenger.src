package defpackage;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.time.Duration;
import kotlin.time.DurationKt;
import kotlin.time.DurationUnit;
import org.apache.http.HttpStatus;

/* renamed from: wi0  reason: default package */
public abstract class wi0 implements ns2 {
    public final n6e a = m5a.b(0, 0, (cu0) null, 7);
    public final jx3 b;

    public wi0(gaf gaf) {
        this.b = e14.a(((osa) gaf).a());
    }

    public final void a(ms2 ms2) {
        ev0.v(this.b, (CoroutineContext) null, (f14) null, new vi0(this, ms2, (Continuation) null), 3);
    }

    public final ps5 b() {
        n6e n6e = this.a;
        Duration.Companion companion = Duration.Companion;
        return gt5.a(n6e, DurationKt.toDuration((int) HttpStatus.SC_MULTIPLE_CHOICES, DurationUnit.MILLISECONDS), new ui0(0));
    }
}
