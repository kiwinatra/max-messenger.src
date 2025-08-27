package defpackage;

import java.util.Collections;
import java.util.Locale;

/* renamed from: g62  reason: default package */
public final /* synthetic */ class g62 implements qk3 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ long b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Object o;
    public final /* synthetic */ Object v;

    public /* synthetic */ g62(r62 r62, ha9 ha9, boolean z, long j) {
        this.o = r62;
        this.v = ha9;
        this.c = z;
        this.b = j;
    }

    public final void accept(Object obj) {
        Object obj2 = this.v;
        boolean z = this.c;
        long j = this.b;
        Object obj3 = this.o;
        switch (this.a) {
            case 0:
                w62 w62 = (w62) obj;
                r62 r62 = (r62) obj3;
                r62.getClass();
                ha9 ha9 = (ha9) obj2;
                if (ha9 == null) {
                    w62.j = 0;
                } else {
                    ha9 r = ((fa9) r62.s.get()).r(w62.j);
                    if (z || r == null || ha9.o > r.o) {
                        r62.v0(w62, ha9);
                    }
                }
                r62.m.c(new xy2(Collections.singletonList(Long.valueOf(j)), true));
                return;
            default:
                Throwable th = (Throwable) obj;
                a2a a2a = (a2a) obj3;
                a2a.getClass();
                Locale locale = Locale.ENGLISH;
                z68.f("a2a", "Can't mark as favorite " + j, th);
                n99 n99 = a2a.v.a.b;
                d6a d6a = n99.B0;
                ype ype = (ype) obj2;
                if (z) {
                    d6a.n(ype);
                } else {
                    d6a.o(ype);
                }
                n99.C0.r(th, z);
                return;
        }
    }

    public /* synthetic */ g62(a2a a2a, long j, boolean z, ype ype) {
        this.o = a2a;
        this.b = j;
        this.c = z;
        this.v = ype;
    }
}
