package defpackage;

import java.util.concurrent.ConcurrentHashMap;
import kotlin.Lazy;
import kotlin.LazyKt;

/* renamed from: ysc  reason: default package */
public final class ysc {
    public static final /* synthetic */ int j = 0;
    public final Lazy a;
    public final Lazy b;
    public final Lazy c;
    public final Lazy d;
    public final Lazy e;
    public final Lazy f;
    public final Lazy g;
    public final Lazy h;
    public final ConcurrentHashMap i = new ConcurrentHashMap();

    public ysc(Lazy lazy, Lazy lazy2, Lazy lazy3, Lazy lazy4, Lazy lazy5, Lazy lazy6, Lazy lazy7, Lazy lazy8) {
        this.a = lazy3;
        this.b = lazy7;
        this.c = lazy8;
        this.d = lazy2;
        this.e = lazy6;
        this.f = lazy;
        this.g = LazyKt.lazy(new ur(26, lazy4));
        this.h = lazy5;
    }

    public static /* synthetic */ long e(ysc ysc, long j2, long j3, long j4, boolean z, boolean z2, boolean z3, int i2) {
        return ysc.d(j2, j3, j4, (i2 & 8) != 0 ? false : z, (i2 & 16) != 0 ? true : z2, (i2 & 32) != 0 ? false : z3, false);
    }

    public final r62 a() {
        return (r62) this.a.getValue();
    }

    public final void b(a32 a32) {
        a89 a89 = a32.c;
        if (a89 != null) {
            long j2 = a32.b.a;
            ha9 ha9 = a89.a;
            e(this, j2, ha9.o, ha9.c, false, false, false, 88);
            ((qwa) this.b.getValue()).a(j2);
        }
    }

    public final void c(a32 a32) {
        ha9 ha9;
        a89 a89 = a32.c;
        if (a89 != null && (ha9 = a89.a) != null) {
            long j2 = ha9.o;
            if (j2 > 0) {
                e(this, a32.b.a, j2, ha9.c, true, false, false, 112);
            }
        }
    }

    public final long d(long j2, long j3, long j4, boolean z, boolean z2, boolean z3, boolean z4) {
        Integer num;
        long j5;
        long j6 = j2;
        long j7 = j3;
        long j8 = j4;
        boolean z5 = z;
        long j9 = z5 ? j7 - 1 : j7;
        StringBuilder n = tr1.n(j6, "sendReadMark: chatServerId = ", ", mark = ");
        n.append(j7);
        n.append(", messageServerId = ");
        n.append(j8);
        z68.c("ysc", n.toString(), new Object[0]);
        a32 D = a().D(j6);
        if (D == null) {
            qfa qfa = (qfa) this.c.getValue();
            if (qfa != null) {
                qfa.g(j6, j9);
            }
        } else {
            r62 a2 = a();
            long s = ((ltb) ((jtb) this.d.getValue())).a.s();
            a2.getClass();
            long j10 = D.a;
            i62 i62 = new i62(a2, s, j9, j10);
            Object obj = new Object();
            if (z5 || z2) {
                int b2 = z5 ? (int) ((fa9) this.e.getValue()).b(j10, j9) : 0;
                Integer valueOf = Integer.valueOf(b2);
                a().getClass();
                obj = new f62(b2);
                num = valueOf;
            } else {
                num = null;
            }
            a().getClass();
            e62 e62 = new e62(z5, 0);
            z68.c("ysc", "update chat %d, setAsUnread = %b, count = %s", Long.valueOf(j10), Boolean.valueOf(z), num);
            r62 a3 = a();
            Object[] objArr = {i62, obj, e62};
            a3.getClass();
            if (!a3.i(j10, false, new ms1(8, objArr)).f0()) {
                return 0;
            }
        }
        jna jna = (jna) ((rl) this.f.getValue());
        if (!jna.t(j8)) {
            j5 = 0;
        } else {
            nc2 nc2 = r1;
            nc2 nc22 = new nc2(((ltb) jna.D()).a.n(), j2, j3, j4, z, z3, z4);
            j5 = ocf.d(jna.E(), nc2, false, 0, 12);
        }
        ConcurrentHashMap concurrentHashMap = this.i;
        mq4 mq4 = (mq4) concurrentHashMap.get(Long.valueOf(j2));
        if (mq4 != null) {
            mq4.dispose();
        }
        concurrentHashMap.remove(Long.valueOf(j2));
        concurrentHashMap.put(Long.valueOf(j2), ((lfd) this.g.getValue()).c(new y55(5, j5, j2, this)));
        return j5;
    }
}
