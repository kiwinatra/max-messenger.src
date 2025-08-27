package defpackage;

import java.util.List;
import java.util.Locale;
import kotlin.jvm.internal.LongCompanionObject;

/* renamed from: rb4  reason: default package */
public final /* synthetic */ class rb4 implements i08, qk3, lp8, ez8, gz8, pk3 {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object o;

    public /* synthetic */ rb4(td tdVar, int i, long j, long j2) {
        this.a = 0;
        this.o = tdVar;
        this.c = i;
        this.b = j;
    }

    public void accept(Object obj) {
        int i = this.c;
        long j = this.b;
        Object obj2 = this.o;
        switch (this.a) {
            case 1:
                ai5 ai5 = (ai5) obj2;
                ai5.getClass();
                Locale locale = Locale.ENGLISH;
                z68.f("ai5", "onNotifMoved: failed to move id=" + j + " to position=" + i, (Throwable) obj);
                ai5.j();
                return;
            case 2:
                vi5 vi5 = (vi5) obj2;
                vi5.getClass();
                Locale locale2 = Locale.ENGLISH;
                z68.f("vi5", "onNotifMoved: failed to move id=" + j + " to position=" + i, (Throwable) obj);
                vi5.d();
                return;
            default:
                q44 q44 = (q44) obj;
                kze kze = (kze) obj2;
                n79.o(kze.i);
                tb7 tb7 = q44.a;
                kze.c.getClass();
                byte[] r = mz4.r(q44.c, tb7);
                l8b l8b = kze.d;
                l8b.getClass();
                l8b.E(r.length, r);
                boolean z = false;
                kze.a.b(l8b, r.length, 0);
                long j2 = q44.b;
                if (j2 == -9223372036854775807L) {
                    if (kze.i.s == LongCompanionObject.MAX_VALUE) {
                        z = true;
                    }
                    n79.n(z);
                } else {
                    long j3 = kze.i.s;
                    j = j3 == LongCompanionObject.MAX_VALUE ? j + j2 : j2 + j3;
                }
                kze.a.a(j, this.c, r.length, 0, (xpf) null);
                return;
        }
    }

    public void d(i67 i67, int i) {
        i67.P(((np8) this.o).c, i, this.c, this.b);
    }

    public void e(ypb ypb, cx8 cx8) {
        ypb.n(((hz8) this.o).K0(cx8, ypb, this.c), this.b);
    }

    public Object g(yx8 yx8, cx8 cx8, int i) {
        int i2 = this.c;
        return yx8.q(cx8, (k0d) ((List) this.o), i2 == -1 ? yx8.s.d0() : i2, i2 == -1 ? yx8.s.h() : this.b);
    }

    public void invoke(Object obj) {
        ((ud) obj).M((td) this.o, this.c, this.b);
    }

    public /* synthetic */ rb4(Object obj, int i, long j, int i2) {
        this.a = i2;
        this.o = obj;
        this.c = i;
        this.b = j;
    }

    public /* synthetic */ rb4(Object obj, long j, int i, int i2) {
        this.a = i2;
        this.o = obj;
        this.b = j;
        this.c = i;
    }
}
