package defpackage;

import java.util.Map;

/* renamed from: i62  reason: default package */
public final /* synthetic */ class i62 implements sk3 {
    public final /* synthetic */ r62 a;
    public final /* synthetic */ long b;
    public final /* synthetic */ long c;
    public final /* synthetic */ Integer d = null;
    public final /* synthetic */ boolean e = true;
    public final /* synthetic */ long f;

    public /* synthetic */ i62(r62 r62, long j, long j2, long j3) {
        this.a = r62;
        this.b = j;
        this.c = j2;
        this.f = j3;
    }

    public final void accept(Object obj) {
        w62 w62 = (w62) obj;
        r62 r62 = this.a;
        r62.getClass();
        Map e2 = w62.e();
        long j = this.b;
        Long l = (Long) e2.get(Long.valueOf(j));
        if (l != null) {
            long longValue = l.longValue();
            long j2 = this.c;
            boolean z = longValue != j2;
            if (z) {
                e2.put(Long.valueOf(j), Long.valueOf(j2));
            }
            Integer num = this.d;
            if (num != null) {
                w62.m = num.intValue();
            }
            if (this.e && z && j == r62.Q()) {
                hs7 hs7 = r62.B;
                if (hs7.get() != null) {
                    ((qfa) hs7.get()).d(this.f, j2);
                }
            }
        }
    }
}
