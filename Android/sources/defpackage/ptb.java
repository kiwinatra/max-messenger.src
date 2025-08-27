package defpackage;

import java.io.IOException;
import java.util.Arrays;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Lazy;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import ru.ok.tamtam.android.db.room.OneMeRoomDatabase;

/* renamed from: ptb  reason: default package */
public final class ptb implements s98 {
    public final Lazy a;
    public final Lazy b;
    public final Lazy c;
    public final ConcurrentHashMap o = new ConcurrentHashMap();
    public final aje v;

    public ptb(Lazy lazy, Lazy lazy2, Lazy lazy3, gaf gaf, m95 m95) {
        this.a = lazy;
        this.b = lazy2;
        this.c = lazy3;
        this.v = ev0.v(e14.a(((osa) gaf).a().s0(1, "presences").plus(new n95(m95))), (CoroutineContext) null, (f14) null, new otb(this, (Continuation) null), 3);
    }

    public final void a() {
        this.v.b((CancellationException) null);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x001e, code lost:
        r2 = (defpackage.mtb) (r2 = (defpackage.tz9) r2.o.get(java.lang.Long.valueOf(r3))).getValue();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final defpackage.mtb b(long r3) {
        /*
            r2 = this;
            kotlin.Lazy r0 = r2.b
            java.lang.Object r0 = r0.getValue()
            km3 r0 = (defpackage.km3) r0
            boolean r0 = r0.m(r3)
            mtb r1 = defpackage.mtb.c
            if (r0 == 0) goto L_0x0028
            java.util.concurrent.ConcurrentHashMap r2 = r2.o
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            java.lang.Object r2 = r2.get(r3)
            tz9 r2 = (defpackage.tz9) r2
            if (r2 == 0) goto L_0x0028
            java.lang.Object r2 = r2.getValue()
            mtb r2 = (defpackage.mtb) r2
            if (r2 != 0) goto L_0x0027
            goto L_0x0028
        L_0x0027:
            r1 = r2
        L_0x0028:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ptb.b(long):mtb");
    }

    public final tz9 c(long j) {
        return (tz9) this.o.computeIfAbsent(Long.valueOf(j), new yi(16, new oo9(22)));
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [qae, ts] */
    public final ts d() {
        ConcurrentHashMap concurrentHashMap = this.o;
        ? qae = new qae(concurrentHashMap.size());
        for (Map.Entry entry : concurrentHashMap.entrySet()) {
            long longValue = ((Number) entry.getKey()).longValue();
            mtb mtb = (mtb) ((tz9) entry.getValue()).getValue();
            if (mtb != null) {
                qae.put(Long.valueOf(longValue), mtb);
            }
        }
        return qae;
    }

    public final boolean g(long j) {
        mtb mtb;
        if (!((km3) this.b.getValue()).m(j)) {
            return false;
        }
        tz9 tz9 = (tz9) this.o.get(Long.valueOf(j));
        if (tz9 == null || (mtb = (mtb) tz9.getValue()) == null) {
            mtb = mtb.c;
        }
        int i = mtb.a;
        return i == 40 || i == 10 || i == 20;
    }

    public final void h(long j, mtb mtb) {
        Object value;
        Object value2;
        mtb mtb2 = (mtb) c(j).getValue();
        if (mtb2 == null || mtb2.b <= mtb.b) {
            tz9 c2 = c(j);
            do {
                value = c2.getValue();
                mtb mtb3 = (mtb) value;
            } while (!c2.b(value, mtb));
        } else {
            tz9 c3 = c(j);
            do {
                value2 = c3.getValue();
                mtb mtb4 = (mtb) value2;
            } while (!c3.b(value2, new mtb(mtb.a, mtb2.b)));
        }
        if (((km3) this.b.getValue()).e) {
            vk3 p = ((km3) this.b.getValue()).p(j, false);
            if (p == null) {
                z68.n("km3", (IOException) null, "updatePresence failure! contact not found", Arrays.copyOf(new Object[0], 0));
            } else {
                p.a.o = mtb;
            }
        }
    }

    public final void i(va8 va8) {
        ya8 ya8 = new ya8(va8.d);
        long[] jArr = va8.b;
        long[] jArr2 = va8.a;
        int length = jArr2.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr2[i];
                if ((((~j) << 7) & j & -9187201950435737472L) != -9187201950435737472L) {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128) {
                            long j2 = jArr[(i << 3) + i3];
                            ya8.i(j2, b(j2));
                        }
                        j >>= 8;
                    }
                    if (i2 != 8) {
                        break;
                    }
                }
                if (i == length) {
                    break;
                }
                i++;
            }
        }
        g6d g6d = ((a74) ((s74) this.a.getValue())).d;
        ((OneMeRoomDatabase) ((j6d) g6d.b).m()).q(new ovb(13, ya8, g6d));
    }
}
