package defpackage;

import kotlin.Lazy;
import kotlin.time.Duration;
import kotlin.time.DurationKt;
import kotlin.time.DurationUnit;
import org.apache.http.HttpStatus;

/* renamed from: ara  reason: default package */
public final class ara implements s82 {
    public final Lazy a;
    public final n6e b;

    public ara(gaf gaf, Lazy lazy) {
        this.a = lazy;
        z04 z04 = new z04();
        q04 a2 = ((osa) gaf).a();
        p04 p04 = q04.a;
        jx3 a3 = e14.a(z04.plus(a2.s0(1, (String) null)));
        n6e b2 = m5a.b(0, 10, (cu0) null, 5);
        this.b = b2;
        Duration.Companion companion = Duration.Companion;
        bs0.K(new ps5(gt5.d(b2, DurationKt.toDuration((int) HttpStatus.SC_MULTIPLE_CHOICES, DurationUnit.MILLISECONDS)), new zqa(0, (Object) this), 5), a3);
    }
}
