package defpackage;

import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: m62  reason: default package */
public final /* synthetic */ class m62 implements qk3 {
    public final /* synthetic */ r62 a;
    public final /* synthetic */ long b;
    public final /* synthetic */ long c;
    public final /* synthetic */ Integer o;
    public final /* synthetic */ AtomicBoolean v;
    public final /* synthetic */ boolean w;

    public /* synthetic */ m62(r62 r62, long j, long j2, Integer num, AtomicBoolean atomicBoolean, boolean z) {
        this.a = r62;
        this.b = j;
        this.c = j2;
        this.o = num;
        this.v = atomicBoolean;
        this.w = z;
    }

    public final void accept(Object obj) {
        w62 w62 = (w62) obj;
        r62 r62 = this.a;
        r62.getClass();
        Map e = w62.e();
        long j = this.b;
        Long l = (Long) e.get(Long.valueOf(j));
        if (l != null) {
            long longValue = l.longValue();
            long j2 = this.c;
            boolean z = false;
            boolean z2 = longValue != j2;
            if (z2) {
                e.put(Long.valueOf(j), Long.valueOf(j2));
            }
            Integer num = this.o;
            if (num != null) {
                w62.m = num.intValue();
            }
            if (this.w && z2 && j == r62.Q()) {
                z = true;
            }
            this.v.set(z);
        }
    }
}
