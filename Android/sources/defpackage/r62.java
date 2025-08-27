package defpackage;

import android.database.Cursor;
import android.os.CancellationSignal;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Lazy;
import kotlin.NotImplementedError;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.io.ConstantsKt;
import kotlin.jvm.internal.LongCompanionObject;

/* renamed from: r62  reason: default package */
public final class r62 {
    public static final v00 I = new v00(10);
    public static final v00 J = new v00(9);
    public static final EnumSet K;
    public static final EnumSet L;
    public static final EnumSet M;
    public static final fm0 N = new fm0(20);
    public final hs7 A;
    public final hs7 B;
    public final Lazy C;
    public final hs7 D;
    public final xme E = f6e.a((Object) null);
    public final ts F = new qae(0);
    public q62 G;
    public final ReentrantLock H = new ReentrantLock();
    public a32 a = null;
    public final ConcurrentHashMap b = new ConcurrentHashMap();
    public final ConcurrentHashMap c = new ConcurrentHashMap();
    public final ConcurrentHashMap d = new ConcurrentHashMap();
    public final ConcurrentHashMap e = new ConcurrentHashMap();
    public final ConcurrentHashMap f = new ConcurrentHashMap();
    public final ConcurrentHashMap g = new ConcurrentHashMap();
    public final ConcurrentHashMap h = new ConcurrentHashMap();
    public volatile boolean i = false;
    public final db3 j = new db3();
    public final Set k = Collections.synchronizedSet(new HashSet());
    public final hs7 l;
    public final sv0 m;
    public final jtb n;
    public final hs7 o;
    public final hs7 p;
    public final hs7 q;
    public final hs7 r;
    public final hs7 s;
    public final hs7 t;
    public final lfd u;
    public final hs7 v;
    public final hs7 w;
    public final hs7 x;
    public final lfd y;
    public final lfd z;

    static {
        k72 k72 = k72.a;
        k72 k722 = k72.b;
        K = EnumSet.of(k72, new k72[]{k722, k72.c, k72.v, k72.o, k72.w, k72.x});
        L = EnumSet.of(k72, k722);
        M = EnumSet.of(k72);
    }

    /* JADX WARNING: type inference failed for: r1v2, types: [qae, ts] */
    public r62(hs7 hs7, sv0 sv0, jtb jtb, hs7 hs72, hs7 hs73, hs7 hs74, hs7 hs75, hs7 hs76, hs7 hs77, lfd lfd, hs7 hs78, hs7 hs79, hs7 hs710, hs7 hs711, lfd lfd2, lfd lfd3, hs7 hs712, hs7 hs713, Lazy lazy) {
        this.l = hs7;
        this.m = sv0;
        this.n = jtb;
        this.o = hs72;
        this.D = hs711;
        this.p = hs73;
        this.q = hs74;
        this.r = hs75;
        this.s = hs76;
        this.t = hs77;
        this.u = lfd;
        this.v = hs78;
        this.w = hs79;
        this.x = hs710;
        this.y = lfd2;
        this.z = lfd3;
        this.A = hs712;
        this.B = hs713;
        this.C = lazy;
    }

    public static z62 M(w62 w62, Set set) {
        if (b10.z0.equals(set)) {
            z62 z62 = w62.q;
            return z62 != null ? z62 : z62.g;
        } else if (b10.A0.equals(set)) {
            z62 z622 = w62.r;
            return z622 != null ? z622 : z62.g;
        } else if (b10.B0.equals(set)) {
            z62 z623 = w62.s;
            return z623 != null ? z623 : z62.g;
        } else if (b10.C0.equals(set)) {
            z62 z624 = w62.t;
            return z624 != null ? z624 : z62.g;
        } else if (b10.D0.equals(set)) {
            z62 z625 = w62.u;
            return z625 != null ? z625 : z62.g;
        } else if (b10.E0.equals(set)) {
            z62 z626 = w62.v;
            return z626 != null ? z626 : z62.g;
        } else if (b10.F0.equals(set)) {
            z62 z627 = w62.w;
            return z627 != null ? z627 : z62.g;
        } else {
            z62 z628 = z62.f;
            return new z62((f72) null, 0, 0, 0, Collections.emptyList());
        }
    }

    public static z62 N(m72 m72, Set set) {
        if (b10.z0.equals(set)) {
            z62 z62 = m72.q;
            return z62 != null ? z62 : z62.g;
        } else if (b10.A0.equals(set)) {
            z62 z622 = m72.r;
            return z622 != null ? z622 : z62.g;
        } else if (b10.B0.equals(set)) {
            z62 z623 = m72.s;
            return z623 != null ? z623 : z62.g;
        } else if (b10.C0.equals(set)) {
            z62 z624 = m72.t;
            return z624 != null ? z624 : z62.g;
        } else if (b10.D0.equals(set)) {
            z62 z625 = m72.u;
            return z625 != null ? z625 : z62.g;
        } else if (b10.E0.equals(set)) {
            z62 z626 = m72.v;
            return z626 != null ? z626 : z62.g;
        } else if (b10.F0.equals(set)) {
            z62 z627 = m72.w;
            return z627 != null ? z627 : z62.g;
        } else {
            z62 z628 = z62.f;
            return new z62((f72) null, 0, 0, 0, Collections.emptyList());
        }
    }

    public static void O() {
        throw new NotImplementedError("constructors not supported");
    }

    public static boolean R(m72 m72, Set set) {
        return b10.z0.equals(set) ? m72.q != null : b10.A0.equals(set) ? m72.r != null : b10.B0.equals(set) ? m72.s != null : b10.C0.equals(set) ? m72.t != null : b10.D0.equals(set) ? m72.u != null : b10.E0.equals(set) ? m72.v != null : b10.F0.equals(set) && m72.w != null;
    }

    public static void l0(w62 w62, Set set, z62 z62) {
        if (b10.z0.equals(set)) {
            w62.q = z62;
        } else if (b10.A0.equals(set)) {
            w62.r = z62;
        } else if (b10.B0.equals(set)) {
            w62.s = z62;
        } else if (b10.C0.equals(set)) {
            w62.t = z62;
        } else if (b10.D0.equals(set)) {
            w62.u = z62;
        } else if (b10.E0.equals(set)) {
            w62.v = z62;
        } else if (b10.F0.equals(set)) {
            w62.w = z62;
        }
    }

    public static boolean q(a32 a32, EnumSet enumSet, boolean z2, uj5 uj5) {
        m72 m72 = a32.b;
        if (m72.b == l72.c) {
            if (a32.K() && !a32.i0() && m72.a().e == 0) {
                return false;
            }
            if (z2) {
                boolean z3 = ((vj5) uj5).p() && (a32.z() || a32.e0() || ld9.F(a32.f(a32.w), ConstantsKt.MINIMUM_BLOCK_SIZE));
                if ((a32.y() || z3) && a32.E()) {
                    return true;
                }
            } else if (a32.d0()) {
                return true;
            }
            return false;
        } else if (!z2 && a32.L() && a32.f0() && !a32.e0() && a32.M()) {
            return true;
        } else {
            if (!a32.L() || a32.f0() || !a32.E() || m72.a().e != 0) {
                return enumSet.contains(m72.c);
            }
            return false;
        }
    }

    public static void u(w62 w62) {
        c72 a2 = w62.c().a();
        a2.e = 0;
        w62.p = new d72(a2);
    }

    public static void v0(w62 w62, ha9 ha9) {
        if (!ha9.p()) {
            w62.j = ha9.b;
            long j2 = w62.k;
            long j3 = ha9.o;
            if (j3 > j2) {
                w62.k = j3;
                return;
            }
            long j4 = ha9.Z;
            if (j4 > j2) {
                w62.k = j4;
            }
        }
    }

    /* JADX WARNING: type inference failed for: r2v6, types: [u62, java.lang.Object] */
    public static void y(w62 w62, long j2, long j3, int i2, long j4, Map map, long j5, int i3, long j6, long j7, String str, String str2, syc syc) {
        l72 l72;
        e72 e72;
        w62 w622 = w62;
        long j8 = j2;
        long j9 = j3;
        int i4 = i2;
        long j10 = j4;
        syc syc2 = syc;
        int i5 = 2;
        if (i4 == 2 || j9 != 0) {
            w622.l = j9;
        }
        if (i4 == 2 || j8 != 0) {
            w622.a = j8;
        }
        int y2 = tr1.y(i2);
        if (y2 != 1) {
            l72 = l72.b;
            if (y2 != 2) {
                if (y2 == 3) {
                    l72 = l72.c;
                } else if (y2 == 4) {
                    l72 = l72.o;
                }
            }
        } else {
            l72 = l72.a;
        }
        w622.b = l72;
        if (i4 == 3) {
            w622.I = Collections.singletonList(Long.valueOf(j4));
            Long valueOf = Long.valueOf(j4);
            ? obj = new Object();
            obj.b = j10;
            obj.a = 2047;
            w62.f(Collections.singletonMap(valueOf, new v62(obj)));
        }
        if (i3 != 0) {
            if (tr1.y(i3) == 1) {
                i5 = 1;
            }
            w622.r0 = i5;
        } else {
            w622.r0 = 2;
        }
        w622.c = k72.x;
        w622.d = j10;
        w622.G = map.size();
        w62.e().putAll(map);
        w622.k = j5;
        w622.p0 = j6;
        w622.q0 = j7;
        w622.g = str;
        w622.h = str2;
        if (syc2 != null) {
            long[] jArr = (long[]) syc2.b;
            if (jArr.length > 0) {
                e72 = new e72(jArr);
                w622.D = e72;
            }
        }
        e72 = null;
        w622.D = e72;
    }

    public final void A(long j2) {
        fa9 fa9 = (fa9) this.s.get();
        fa9.getClass();
        u0(j2, fa9.q(j2, bl4.REGULAR), true);
    }

    public final ArrayList B(zb2 zb2) {
        ltb ltb = (ltb) this.n;
        return H(L, false, new rj0(ltb.a.s(), ltb.b.y(), zb2));
    }

    public final lbe C(long j2) {
        a32 a32 = (a32) this.f.get(Long.valueOf(j2));
        if (a32 != null) {
            return lbe.h(a32);
        }
        return new hb3(new mka(2, new d62(this, j2, 0)), g()).n(this.y);
    }

    public final a32 D(long j2) {
        ConcurrentHashMap concurrentHashMap = this.g;
        a32 a32 = (a32) concurrentHashMap.get(Long.valueOf(j2));
        if (a32 != null) {
            return a32;
        }
        f();
        return (a32) concurrentHashMap.get(Long.valueOf(j2));
    }

    public final n72 E(long j2) {
        n72 n72 = (n72) this.d.get(Long.valueOf(j2));
        return (n72 != null || this.i) ? n72 : i0(j2);
    }

    public final n72 F(long j2) {
        n72 n72 = (n72) this.e.get(Long.valueOf(j2));
        return (n72 != null || this.i) ? n72 : ((a74) ((s74) this.l.get())).b.e(j2);
    }

    public final a32 G(long j2) {
        ConcurrentHashMap concurrentHashMap = this.f;
        a32 a32 = (a32) concurrentHashMap.get(Long.valueOf(j2));
        if (a32 != null) {
            return r(a32);
        }
        f();
        return r((a32) concurrentHashMap.get(Long.valueOf(j2)));
    }

    public final ArrayList H(EnumSet enumSet, boolean z2, osb osb) {
        boolean z3;
        f();
        ArrayList arrayList = new ArrayList();
        for (Map.Entry value : this.f.entrySet()) {
            a32 a32 = (a32) value.getValue();
            if (osb != null) {
                try {
                    z3 = osb.test(a32);
                } catch (Exception unused) {
                }
                if (z3 && q(a32, enumSet, z2, ((ltb) this.n).e)) {
                    arrayList.add(a32);
                }
            }
            z3 = true;
            arrayList.add(a32);
        }
        return arrayList;
    }

    public final List I(Comparator comparator) {
        ArrayList B2 = B((zb2) null);
        Collections.sort(B2, comparator);
        return Collections.unmodifiableList(B2);
    }

    public final List J(Collection collection) {
        if (collection == null || collection.isEmpty()) {
            return Collections.emptyList();
        }
        ConcurrentHashMap concurrentHashMap = this.g;
        if (!concurrentHashMap.keySet().containsAll(collection)) {
            f();
        }
        ArrayList arrayList = new ArrayList(collection);
        Objects.requireNonNull(concurrentHashMap);
        if (arrayList.isEmpty()) {
            return Collections.emptyList();
        }
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            try {
                a32 a32 = (a32) concurrentHashMap.get((Long) it.next());
                if (a32 != null) {
                    arrayList2.add(a32);
                }
            } catch (Throwable th) {
                throw new RuntimeException(th);
            }
        }
        return arrayList2;
    }

    public final a32 K(long j2) {
        return (a32) this.c.get(Long.valueOf(j2 ^ Q()));
    }

    public final int L() {
        int i2 = 0;
        for (a32 a32 : this.f.values()) {
            if (a32.b.a().e != 0) {
                i2++;
            }
        }
        return i2;
    }

    public final void P(long j2, qk3 qk3) {
        a32 K2 = K(j2);
        if (K2 == null || (!K2.E() && !K2.S())) {
            jbd.b(new d62(this, j2, 1), xfd.b(), new c62(qk3, 0), new b62(this, 1), this.u);
            return;
        }
        try {
            qk3.accept(K2);
        } catch (Throwable th) {
            throw new RuntimeException(th);
        }
    }

    public final long Q() {
        return ((ltb) this.n).a.s();
    }

    public final boolean S(long j2, x62 x62) {
        a32 G2 = G(j2);
        return G2 != null && G2.b.B.contains(x62);
    }

    /* JADX WARNING: type inference failed for: r16v0, types: [java.util.Map] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final defpackage.n72 T(long r28) {
        /*
            r27 = this;
            r0 = r27
            r1 = r28
            a67 r3 = defpackage.z68.b
            if (r3 != 0) goto L_0x0009
            goto L_0x001e
        L_0x0009:
            boolean r4 = r3.c()
            if (r4 != 0) goto L_0x0010
            goto L_0x001e
        L_0x0010:
            w78 r4 = defpackage.w78.o
            java.lang.String r5 = "insertDialog contactId="
            java.lang.String r5 = defpackage.wj6.i(r1, r5)
            r6 = 0
            java.lang.String r7 = "r62"
            r3.d(r4, r7, r5, r6)
        L_0x001e:
            long r14 = r27.Q()
            long r3 = r27.Q()
            long r11 = r3 ^ r1
            ts r3 = new ts
            r4 = 2
            r3.<init>(r4)
            java.lang.Long r4 = java.lang.Long.valueOf(r14)
            r5 = 0
            java.lang.Long r7 = java.lang.Long.valueOf(r5)
            r3.put(r4, r7)
            java.lang.Long r4 = java.lang.Long.valueOf(r28)
            java.lang.Long r5 = java.lang.Long.valueOf(r5)
            r3.put(r4, r5)
            w62 r4 = new w62
            r4.<init>()
            java.lang.String r24 = ""
            java.lang.String r25 = ""
            r13 = 2
            r17 = 0
            r19 = 3
            r20 = 0
            r22 = 0
            r26 = 0
            r8 = r4
            r9 = r11
            r16 = r3
            y(r8, r9, r11, r13, r14, r16, r17, r19, r20, r22, r24, r25, r26)
            m72 r3 = new m72
            r3.<init>(r4)
            a32 r1 = r27.K(r28)
            if (r1 == 0) goto L_0x0087
            hs7 r0 = r0.l
            java.lang.Object r0 = r0.get()
            s74 r0 = (defpackage.s74) r0
            a74 r0 = (defpackage.a74) r0
            f6d r0 = r0.b
            long r4 = r1.a
            r0.g(r4, r3)
            n72 r0 = new n72
            long r2 = r1.a
            m72 r1 = r1.b
            r0.<init>(r2, r1)
            goto L_0x009d
        L_0x0087:
            hs7 r0 = r0.l
            java.lang.Object r0 = r0.get()
            s74 r0 = (defpackage.s74) r0
            a74 r0 = (defpackage.a74) r0
            f6d r0 = r0.b
            long r0 = r0.d(r3)
            n72 r2 = new n72
            r2.<init>(r0, r3)
            r0 = r2
        L_0x009d:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.r62.T(long):n72");
    }

    public final ha9 U(long j2, b89 b89) {
        z68.c("r62", "insertMessageIfNeeded", new Object[0]);
        ha9 ha9 = null;
        if (b89 == null) {
            return null;
        }
        hs7 hs7 = this.s;
        ha9 k2 = ((fa9) hs7.get()).k(j2, b89.a);
        if (k2 != null) {
            return k2;
        }
        long j3 = b89.w;
        if (j3 != 0) {
            z6d z6d = ((a74) ((fa9) hs7.get()).a).c;
            ya9 h2 = z6d.d().h(j2, j3);
            if (h2 != null) {
                ha9 = z6d.b(h2);
            }
            if (ha9 != null) {
                z68.c("r62", "last message for chat %d founded by cid %d. Update it", Long.valueOf(j2), Long.valueOf(j3));
                z6d z6d2 = ((a74) ((s74) this.l.get())).c;
                cd4 cd4 = oa9.b;
                z6d2.o(b89, j2, false, (qe9) null);
                ((fa9) hs7.get()).y(ha9, qe8.g(b89.y, (bjd) this.q.get()));
                return ((fa9) hs7.get()).r(ha9.b);
            }
        }
        z68.c("r62", "insertMessageIfNeeded: insert message, cid = %d, chatId = %d, chatId = %d", Long.valueOf(j3), Long.valueOf(j2), Long.valueOf(b89.b));
        return ((fa9) hs7.get()).r(((fa9) hs7.get()).g(j2, Q(), b89));
    }

    public final void V() {
        v7b v7b;
        f();
        if (!this.f.isEmpty()) {
            Iterator it = this.f.values().iterator();
            while (true) {
                boolean z2 = true;
                if (it.hasNext()) {
                    a32 a32 = (a32) it.next();
                    boolean z3 = a32.X != null;
                    boolean z4 = a32.Y != null;
                    boolean z5 = a32.v0 != null;
                    if (a32.Z.get() == null) {
                        z2 = false;
                    }
                    a32.X = null;
                    a32.Y = null;
                    a32.v0 = null;
                    a32.Z.set((Object) null);
                    if (z3) {
                        a32.l0();
                    }
                    if (z4) {
                        a32.k0();
                    }
                    if (z5) {
                        a32.m0();
                    }
                    if (z2 && (v7b = (v7b) a32.Z.updateAndGet(new y22(a32, 0))) != null) {
                        CharSequence charSequence = (CharSequence) v7b.b;
                    }
                } else {
                    this.m.c(new xy2(Collections.emptyList(), true));
                    return;
                }
            }
        }
    }

    public final boolean W(a32 a32) {
        a32 a322 = this.a;
        return a322 != null && a32.a == a322.a;
    }

    public final void X(long j2) {
        a32 G2 = G(j2);
        if (G2 != null) {
            i(j2, false, new ba(17, this, G2));
        }
        a32 k2 = k(j2, k72.b);
        long j3 = k2.b.a;
        ((d6b) this.v.get()).getClass();
        d6b.a(j3);
        m72 m72 = k2.b;
        long j4 = m72.a;
        jna jna = (jna) ((rl) this.p.get());
        if (jna.r(j2)) {
            jna.A(jna, new eb2(((ltb) jna.D()).a.n(), j2, j4));
        }
        Lazy lazy = this.C;
        if (lazy.getValue() != null) {
            ia2 ia2 = (ia2) ((u82) lazy.getValue());
            ia2.getClass();
            ev0.v(ia2.y, (CoroutineContext) null, (f14) null, new r92(ia2, m72.a, (Continuation) null), 3);
        }
        xy2 xy2 = new xy2(Collections.singletonList(Long.valueOf(j2)), true);
        sv0 sv0 = this.m;
        sv0.c(xy2);
        sv0.c(new rs7(j2));
    }

    public final void Y(long j2, long j3) {
        a32 G2 = G(j2);
        if (G2 != null) {
            o(j3, G2);
            p(G2);
        }
    }

    public final void Z(long j2, w62 w62, ha9 ha9) {
        z68.c("r62", "onControlMessage, chatId = %d, messageDb.event = %s", Long.valueOf(w62.a), ha9.f().a);
        q10 f2 = ha9.f();
        int ordinal = f2.a.ordinal();
        x62 x62 = x62.c;
        switch (ordinal) {
            case 1:
            case 2:
                Iterator it = f2.c.iterator();
                while (it.hasNext()) {
                    Long l2 = (Long) it.next();
                    if (!S(j2, x62)) {
                        w62.e().put(l2, 0L);
                    }
                }
                return;
            case 3:
                boolean S = S(j2, x62);
                long j3 = f2.b;
                if (!S) {
                    w62.e().remove(Long.valueOf(j3));
                }
                if (j3 == Q()) {
                    w62.c = k72.b;
                    return;
                }
                return;
            case 4:
                Map e2 = w62.e();
                long j4 = ha9.w;
                e2.remove(Long.valueOf(j4));
                if (j4 == Q()) {
                    w62.c = k72.o;
                    return;
                }
                return;
            case 5:
                if (!S(j2, x62.a)) {
                    w62.g = f2.d;
                    return;
                }
                return;
            case 6:
                if (!S(j2, x62.b)) {
                    w62.h = f2.f;
                    return;
                }
                return;
            default:
                return;
        }
    }

    public final a32 a0(long j2, long j3, ha9 ha9) {
        StringBuilder n2 = tr1.n(j2, "onMsgSend, chatId = ", ", serverChatId = ");
        n2.append(j3);
        n2.append(", messageDb = ");
        n2.append(ha9);
        z68.c("r62", n2.toString(), new Object[0]);
        return i(j2, true, new n62(this, j3, ha9, j2));
    }

    /* JADX WARNING: type inference failed for: r12v0, types: [qae, java.util.Map] */
    public final a32 b(l72 l72, List list, String str, String str2) {
        n72 n72;
        l72 l722 = l72;
        if (l722 == l72.a) {
            n72 = T(((Long) list.get(0)).longValue());
        } else {
            List list2 = list;
            long Q = Q();
            long nanoTime = System.nanoTime();
            ? qae = new qae(list.size());
            Iterator it = list.iterator();
            while (it.hasNext()) {
                qae.put((Long) it.next(), 0L);
            }
            qae.put(Long.valueOf(Q), 0L);
            w62 w62 = new w62();
            y(w62, 0, nanoTime, 3, Q, qae, 0, 3, 0, 0, str, str2, (syc) null);
            m72 m72 = new m72(w62);
            n72 = new n72(((a74) ((s74) this.l.get())).b.d(m72), m72);
        }
        a67 a67 = z68.b;
        if (a67 != null && a67.c()) {
            w78 w78 = w78.o;
            a67.d(w78, "r62", "add chat; chatId=" + n72.b + ",type=" + l722, (Throwable) null);
        }
        c0(n72.b, n72);
        return r0(n72.b, false);
    }

    public final a32 b0(long j2, boolean z2, ha9 ha9, boolean z3, long j3) {
        ha9 ha92 = ha9;
        z68.c("r62", "onNotifMessage: chatId = %d, fromSelf = %s, messageDb = %s, updateNewMessage = %s", Long.valueOf(j2), Boolean.valueOf(z2), ha92, Boolean.valueOf(z3));
        long j4 = j2;
        return i(j2, true, new q52(this, ha92, z2, z3, j2, j3));
    }

    public final void c(long j2, long j3, List list, boolean z2) {
        z68.c("r62", "addChatUsers, chatId = " + j2 + ", ids = " + list, new Object[0]);
        e(j2, list);
        ((jna) ((rl) this.p.get())).e(j2, j3, list, z2);
    }

    public final void c0(long j2, n72 n72) {
        this.d.put(Long.valueOf(j2), n72);
        m72 m72 = n72.c;
        long j3 = m72.a;
        if (j3 != 0 || m72.h(((ltb) this.n).a.s())) {
            this.e.put(Long.valueOf(j3), n72);
        }
        this.b.put(Long.valueOf(n72.c.l), n72);
    }

    public final void d(long j2, x62 x62) {
        if (!S(j2, x62)) {
            i(j2, false, new j62(x62, 1));
        }
    }

    public final void d0(long j2, List list) {
        a32 G2 = G(j2);
        if (G2 != null) {
            i(j2, false, new x52(0, list));
            this.m.c(new xy2(Collections.singletonList(Long.valueOf(G2.a)), false));
        }
    }

    public final void e(long j2, List list) {
        a32 G2 = G(j2);
        if (G2 != null) {
            i(j2, false, new x52(1, list));
            this.m.c(new xy2(Collections.singletonList(Long.valueOf(G2.a)), false));
        }
    }

    public final void e0(long j2, long j3, List list) {
        z68.c("r62", "removeChatUsers, chatId = " + j2 + ", contactIds = " + list, new Object[0]);
        h0(j2, list);
        ((jna) ((rl) this.p.get())).R(0, j2, j3, list);
    }

    public final void f() {
        if (!this.i) {
            p0("awaitLoading", new s52(this, 0));
        }
    }

    public final void f0(long j2, boolean z2) {
        z68.c("r62", "removeFromFavorites: " + j2, new Object[0]);
        k0(j2, 0, z2);
    }

    public final ma3 g() {
        db3 db3 = this.j;
        return (db3.a.get() == db3.v && db3.c == null) ? ua3.a : db3;
    }

    public final void g0(long j2, x62 x62) {
        if (S(j2, x62)) {
            i(j2, false, new j62(x62, 0));
        }
    }

    public final a32 h(n72 n72, ha9 ha9) {
        a32 b2 = ((o82) this.x.get()).b(n72, ha9);
        p0((String) null, new w52(this, n72.b, b2, true));
        return b2;
    }

    public final void h0(long j2, List list) {
        a32 G2 = G(j2);
        if (G2 != null) {
            i(j2, false, new x52(2, list));
            this.m.c(new xy2(Collections.singletonList(Long.valueOf(G2.a)), false));
        }
    }

    public final a32 i(long j2, boolean z2, qk3 qk3) {
        if (E(j2) == null) {
            f();
        }
        n72 E2 = E(j2);
        if (E2 == null) {
            z68.c("r62", "changeChatField: chat with id = " + j2 + " not found", new Object[0]);
            return null;
        }
        w62 j3 = E2.c.j();
        try {
            qk3.accept(j3);
            c0(j2, new n72(j2, new m72(j3)));
            ((jqg) this.w.get()).a(new nvd(j2));
            return r0(j2, z2);
        } catch (Throwable th) {
            throw new RuntimeException(th);
        }
    }

    public final n72 i0(long j2) {
        n82 n82;
        f6d f6d = ((a74) ((s74) this.l.get())).b;
        hs2 c2 = f6d.c();
        c2.getClass();
        d7d a2 = d7d.a(1, "SELECT * FROM chats WHERE id = ?");
        a2.k(1, j2);
        i6d i6d = c2.a;
        i6d.b();
        Cursor o2 = i6d.o(a2, (CancellationSignal) null);
        try {
            int u2 = kne.u(o2, "id");
            int u3 = kne.u(o2, "server_id");
            int u4 = kne.u(o2, "data");
            int u5 = kne.u(o2, "favourite_index");
            int u6 = kne.u(o2, "sort_time");
            int u7 = kne.u(o2, "cid");
            if (o2.moveToFirst()) {
                n82 = new n82(o2.getLong(u2), o2.getLong(u3), c2.a().a(o2.isNull(u4) ? null : o2.getBlob(u4)), o2.getLong(u5), o2.getLong(u6), o2.getLong(u7));
            } else {
                n82 = null;
            }
            if (n82 != null) {
                return f6d.a(n82);
            }
            return null;
        } finally {
            o2.close();
            a2.o();
        }
    }

    public final void j(long j2, String str) {
        z68.c("r62", "changeChatIcon, chatId = " + j2 + ", path = " + str, new Object[0]);
        d(j2, x62.b);
        i(j2, false, new a62(str, 1));
        this.m.c(new xy2(Collections.singletonList(Long.valueOf(j2)), false));
    }

    public final void j0(long j2, boolean z2) {
        z68.c("r62", "setChatSubscribedToUpdates: chatId=%d, subscribed=%b", Long.valueOf(j2), Boolean.valueOf(z2));
        try {
            a32 a32 = (a32) o0((String) null, new u52((Object) this, j2, (Object) new e62(z2, 1), 2));
        } catch (Throwable th) {
            z68.f("r62", "setChatSubscribedToUpdates fail!", th);
        }
    }

    public final a32 k(long j2, k72 k72) {
        return i(j2, false, new ms1(7, k72));
    }

    public final void k0(long j2, long j3, boolean z2) {
        i(j2, false, new c10(j3, 3));
        if (z2) {
            ((jna) ((rl) this.p.get())).u(j2);
        }
        this.m.c(new xy2(Collections.singletonList(Long.valueOf(j2)), true));
    }

    public final void l(long j2, String str) {
        z68.c("r62", "changeChatTitle, chatId = " + j2, new Object[0]);
        d(j2, x62.a);
        a32 i2 = i(j2, false, new a62(str, 0));
        if (i2 != null) {
            this.m.c(new xy2(Collections.singletonList(Long.valueOf(j2)), false));
            ((jna) ((rl) this.p.get())).p(j2, i2.b.a, str, (String) null, (a20) null);
        }
    }

    public final void m(long j2, k72 k72) {
        z68.c("r62", "changeDialogStatus, contactId = " + j2 + ", status = " + k72, new Object[0]);
        a32 K2 = K(j2);
        if (K2 != null) {
            long j3 = K2.a;
            k(j3, k72);
            this.m.c(new xy2(Collections.singletonList(Long.valueOf(j3)), true));
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v59, resolved type: java.util.HashMap} */
    /* JADX WARNING: type inference failed for: r2v67, types: [u62, java.lang.Object] */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x003a, code lost:
        if (r9.l == r6) goto L_0x003c;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:104:0x0284  */
    /* JADX WARNING: Removed duplicated region for block: B:105:0x0289  */
    /* JADX WARNING: Removed duplicated region for block: B:113:0x02ea  */
    /* JADX WARNING: Removed duplicated region for block: B:114:0x02ee  */
    /* JADX WARNING: Removed duplicated region for block: B:117:0x0321  */
    /* JADX WARNING: Removed duplicated region for block: B:123:0x033f  */
    /* JADX WARNING: Removed duplicated region for block: B:124:0x0373  */
    /* JADX WARNING: Removed duplicated region for block: B:127:0x0381  */
    /* JADX WARNING: Removed duplicated region for block: B:130:0x0391  */
    /* JADX WARNING: Removed duplicated region for block: B:131:0x039d  */
    /* JADX WARNING: Removed duplicated region for block: B:134:0x03cb  */
    /* JADX WARNING: Removed duplicated region for block: B:162:0x045c  */
    /* JADX WARNING: Removed duplicated region for block: B:164:0x0470  */
    /* JADX WARNING: Removed duplicated region for block: B:167:0x048d  */
    /* JADX WARNING: Removed duplicated region for block: B:170:0x04a2  */
    /* JADX WARNING: Removed duplicated region for block: B:175:0x04b7  */
    /* JADX WARNING: Removed duplicated region for block: B:201:0x0589  */
    /* JADX WARNING: Removed duplicated region for block: B:207:0x05a4  */
    /* JADX WARNING: Removed duplicated region for block: B:213:0x05f3  */
    /* JADX WARNING: Removed duplicated region for block: B:216:0x0605  */
    /* JADX WARNING: Removed duplicated region for block: B:219:0x061a  */
    /* JADX WARNING: Removed duplicated region for block: B:220:0x061d  */
    /* JADX WARNING: Removed duplicated region for block: B:232:0x06ae  */
    /* JADX WARNING: Removed duplicated region for block: B:236:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x01cc  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x01e6  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x020a  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x0220  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x024a  */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x025a  */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x0267  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final defpackage.a32 m0(defpackage.b32 r48, defpackage.rp2 r49) {
        /*
            r47 = this;
            r0 = r47
            r1 = r48
            r2 = r49
            r3 = 2
            java.lang.Object[] r4 = new java.lang.Object[]{r48, r49}
            java.lang.String r5 = "r62"
            java.lang.String r6 = "storeChatFromServer, chat = %s, chatSettings = %s"
            defpackage.z68.c(r5, r6, r4)
            long r6 = r1.a
            n72 r4 = r0.F(r6)
            if (r4 != 0) goto L_0x0058
            int r6 = r1.V0
            if (r6 != r3) goto L_0x0058
            long r6 = r1.X
            java.util.concurrent.ConcurrentHashMap r4 = r0.b
            java.lang.Long r8 = java.lang.Long.valueOf(r6)
            java.lang.Object r8 = r4.get(r8)
            n72 r8 = (defpackage.n72) r8
            if (r8 == 0) goto L_0x003e
            m72 r9 = r8.c
            boolean r10 = r9.g()
            if (r10 == 0) goto L_0x003e
            long r9 = r9.l
            int r9 = (r9 > r6 ? 1 : (r9 == r6 ? 0 : -1))
            if (r9 != 0) goto L_0x003e
        L_0x003c:
            r4 = r8
            goto L_0x0058
        L_0x003e:
            hs7 r8 = r0.l
            java.lang.Object r8 = r8.get()
            s74 r8 = (defpackage.s74) r8
            a74 r8 = (defpackage.a74) r8
            f6d r8 = r8.b
            n72 r8 = r8.f(r6)
            if (r8 == 0) goto L_0x003c
            java.lang.Long r6 = java.lang.Long.valueOf(r6)
            r4.put(r6, r8)
            goto L_0x003c
        L_0x0058:
            if (r4 != 0) goto L_0x0063
            r47.f()
            long r6 = r1.a
            n72 r4 = r0.F(r6)
        L_0x0063:
            k72 r6 = defpackage.k72.x
            if (r4 != 0) goto L_0x00d0
            long r13 = r1.a
            long r3 = r1.X
            int r15 = r1.V0
            long r18 = r47.Q()
            java.util.Map r12 = r1.o
            long r7 = r1.Y
            int r11 = r1.W0
            long r9 = r1.T0
            r32 = r5
            r33 = r6
            long r5 = r1.U0
            syc r2 = r1.C0
            w62 r1 = new w62
            r1.<init>()
            java.lang.String r28 = ""
            java.lang.String r29 = ""
            r20 = r12
            r12 = r1
            r17 = r15
            r15 = r3
            r21 = r7
            r23 = r11
            r24 = r9
            r26 = r5
            r30 = r2
            y(r12, r13, r15, r17, r18, r20, r21, r23, r24, r26, r28, r29, r30)
            m72 r2 = new m72
            r2.<init>(r1)
            hs7 r1 = r0.l
            java.lang.Object r1 = r1.get()
            s74 r1 = (defpackage.s74) r1
            a74 r1 = (defpackage.a74) r1
            f6d r1 = r1.b
            long r3 = r1.d(r2)
            java.lang.Long r1 = java.lang.Long.valueOf(r3)
            java.lang.Object[] r1 = new java.lang.Object[]{r1}
            java.lang.String r5 = "storeChatFromServer: insert chat, chatId = %d"
            r6 = r32
            defpackage.z68.c(r6, r5, r1)
            n72 r1 = new n72
            r1.<init>(r3, r2)
            r0.c0(r3, r1)
            r4 = r1
            r3 = r33
            r2 = 1
            r1 = r48
            goto L_0x00f0
        L_0x00d0:
            r33 = r6
            r6 = r5
            java.lang.String r2 = r1.b
            int r2 = defpackage.a81.a(r2)
            r3 = 6
            if (r2 != r3) goto L_0x00ed
            long r2 = r1.X
            r7 = 0
            int r2 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
            if (r2 != 0) goto L_0x00ed
            long r1 = r4.b
            r3 = r33
            r0.k(r1, r3)
            r0 = 0
            return r0
        L_0x00ed:
            r3 = r33
            r2 = 0
        L_0x00f0:
            long r7 = r4.b
            b89 r5 = r1.z
            ha9 r5 = r0.U(r7, r5)
            long r7 = r4.b
            b89 r9 = r1.F0
            ha9 r7 = r0.U(r7, r9)
            long r13 = r4.b
            long r8 = r1.v0
            n72 r4 = r0.E(r13)
            if (r4 != 0) goto L_0x0115
            boolean r10 = r0.i
            if (r10 != 0) goto L_0x0115
            r47.f()
            n72 r4 = r0.E(r13)
        L_0x0115:
            if (r4 != 0) goto L_0x013c
            hs7 r0 = r0.o
            java.lang.Object r0 = r0.get()
            m95 r0 = (defpackage.m95) r0
            ru.ok.tamtam.exception.ChatNotFoundException r2 = new ru.ok.tamtam.exception.ChatNotFoundException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "chat "
            r3.<init>(r4)
            long r4 = r1.a
            java.lang.String r1 = " is not found"
            java.lang.String r1 = defpackage.wj6.m(r3, r4, r1)
            r2.<init>(r1)
            uta r0 = (defpackage.uta) r0
            r1 = 1
            r0.c(r2, r1)
            r8 = 0
            goto L_0x06ba
        L_0x013c:
            long r10 = r47.Q()
            m72 r12 = r4.c
            w62 r15 = r12.j()
            int r12 = r1.V0
            int r12 = defpackage.tr1.y(r12)
            r33 = r3
            l72 r3 = defpackage.l72.a
            r16 = r2
            r2 = 1
            if (r12 == r2) goto L_0x016b
            l72 r2 = defpackage.l72.b
            r19 = r2
            r2 = 2
            if (r12 == r2) goto L_0x0162
            r2 = 3
            if (r12 == r2) goto L_0x0168
            r2 = 4
            if (r12 == r2) goto L_0x0165
        L_0x0162:
            r2 = r19
            goto L_0x016c
        L_0x0165:
            l72 r2 = defpackage.l72.o
            goto L_0x016c
        L_0x0168:
            l72 r2 = defpackage.l72.c
            goto L_0x016c
        L_0x016b:
            r2 = r3
        L_0x016c:
            java.lang.String r12 = r1.b
            int r12 = defpackage.a81.a(r12)
            int r12 = defpackage.tr1.y(r12)
            k72 r19 = defpackage.k72.a
            k72 r20 = defpackage.k72.b
            k72 r21 = defpackage.k72.o
            r22 = r3
            k72 r3 = defpackage.k72.v
            if (r12 == 0) goto L_0x01b1
            r23 = r3
            r3 = 1
            if (r12 == r3) goto L_0x01ac
            r3 = 2
            if (r12 == r3) goto L_0x01a7
            r3 = 3
            if (r12 == r3) goto L_0x01a2
            r3 = 4
            if (r12 == r3) goto L_0x019d
            r3 = 5
            if (r12 == r3) goto L_0x0198
        L_0x0193:
            r24 = r10
            r3 = r19
            goto L_0x01b4
        L_0x0198:
            r24 = r10
            r3 = r33
            goto L_0x01b4
        L_0x019d:
            k72 r3 = defpackage.k72.w
            r24 = r10
            goto L_0x01b4
        L_0x01a2:
            r24 = r10
            r3 = r23
            goto L_0x01b4
        L_0x01a7:
            r24 = r10
            r3 = r21
            goto L_0x01b4
        L_0x01ac:
            r24 = r10
            r3 = r20
            goto L_0x01b4
        L_0x01b1:
            r23 = r3
            goto L_0x0193
        L_0x01b4:
            long r10 = r1.a
            r15.a = r10
            r15.b = r2
            r15.c = r3
            long r2 = r1.c
            r15.d = r2
            java.util.List r2 = r15.d()
            x62 r3 = defpackage.x62.a
            boolean r2 = r2.contains(r3)
            if (r2 != 0) goto L_0x01da
            java.lang.String r2 = r1.w
            boolean r3 = defpackage.cvg.A(r2)
            if (r3 != 0) goto L_0x01d7
            r15.g = r2
            goto L_0x01da
        L_0x01d7:
            r2 = 0
            r15.g = r2
        L_0x01da:
            java.util.List r2 = r15.d()
            x62 r3 = defpackage.x62.b
            boolean r2 = r2.contains(r3)
            if (r2 != 0) goto L_0x0202
            java.lang.String r2 = r1.x
            boolean r3 = defpackage.cvg.A(r2)
            if (r3 != 0) goto L_0x01f2
            r15.h = r2
            r2 = 0
            goto L_0x01f5
        L_0x01f2:
            r2 = 0
            r15.h = r2
        L_0x01f5:
            java.lang.String r3 = r1.y
            boolean r10 = defpackage.cvg.A(r3)
            if (r10 != 0) goto L_0x0200
            r15.i = r3
            goto L_0x0202
        L_0x0200:
            r15.i = r2
        L_0x0202:
            long r2 = r15.k
            long r10 = r1.Y
            int r2 = (r10 > r2 ? 1 : (r10 == r2 ? 0 : -1))
            if (r2 <= 0) goto L_0x020c
            r15.k = r10
        L_0x020c:
            long r2 = r1.J0
            r15.P = r2
            long r2 = r1.v
            r15.f = r2
            long r2 = r1.X
            r15.l = r2
            java.util.Map r2 = r1.o
            boolean r3 = r2.isEmpty()
            if (r3 != 0) goto L_0x024a
            java.util.List r3 = r15.d()
            x62 r10 = defpackage.x62.c
            boolean r3 = r3.contains(r10)
            if (r3 != 0) goto L_0x023b
            java.util.Map r3 = r15.e()
            r3.clear()
            java.util.Map r3 = r15.e()
            r3.putAll(r2)
            goto L_0x0256
        L_0x023b:
            java.util.Map r3 = r15.e()
            r3.clear()
            java.util.Map r3 = r15.e()
            r3.putAll(r2)
            goto L_0x0256
        L_0x024a:
            int r2 = r1.V0
            r3 = 4
            if (r2 != r3) goto L_0x0256
            java.util.Map r2 = r15.e()
            r2.clear()
        L_0x0256:
            int r2 = r1.W0
            if (r2 == 0) goto L_0x0267
            int r2 = defpackage.tr1.y(r2)
            r3 = 1
            if (r2 == r3) goto L_0x0263
            r2 = 2
            goto L_0x0264
        L_0x0263:
            r2 = 1
        L_0x0264:
            r15.r0 = r2
            goto L_0x026a
        L_0x0267:
            r2 = 2
            r15.r0 = r2
        L_0x026a:
            java.lang.String r2 = r1.B0
            r15.E = r2
            int r2 = r1.w0
            r15.G = r2
            java.lang.String r2 = r1.x0
            r15.H = r2
            java.util.List r2 = r1.y0
            r15.I = r2
            java.util.Map r2 = r1.K0
            if (r2 == 0) goto L_0x0284
            boolean r3 = r2.isEmpty()
            if (r3 == 0) goto L_0x0289
        L_0x0284:
            r32 = r6
            r27 = r7
            goto L_0x02db
        L_0x0289:
            java.util.HashMap r3 = new java.util.HashMap
            int r10 = r2.size()
            r3.<init>(r10)
            java.util.Set r10 = r2.keySet()
            java.util.Iterator r10 = r10.iterator()
        L_0x029a:
            boolean r11 = r10.hasNext()
            if (r11 == 0) goto L_0x02d6
            java.lang.Object r11 = r10.next()
            java.lang.Long r11 = (java.lang.Long) r11
            java.lang.Object r12 = r2.get(r11)
            cb r12 = (defpackage.cb) r12
            r26 = r2
            u62 r2 = new u62
            r2.<init>()
            r32 = r6
            r27 = r7
            long r6 = r12.a
            r2.b = r6
            int r6 = r12.b
            r2.a = r6
            long r6 = r12.c
            r2.c = r6
            java.lang.String r6 = r12.d
            r2.d = r6
            v62 r6 = new v62
            r6.<init>(r2)
            r3.put(r11, r6)
            r2 = r26
            r7 = r27
            r6 = r32
            goto L_0x029a
        L_0x02d6:
            r32 = r6
            r27 = r7
            goto L_0x02df
        L_0x02db:
            java.util.Map r3 = java.util.Collections.emptyMap()
        L_0x02df:
            r15.f(r3)
            int r2 = r1.z0
            r15.J = r2
            ll2 r2 = r1.A0
            if (r2 != 0) goto L_0x02ee
            r28 = r13
            r3 = 0
            goto L_0x031b
        L_0x02ee:
            b72 r3 = new b72
            boolean r6 = r2.g
            boolean r7 = r2.h
            boolean r10 = r2.a
            boolean r11 = r2.b
            boolean r12 = r2.c
            r28 = r13
            boolean r13 = r2.d
            boolean r14 = r2.e
            boolean r0 = r2.i
            boolean r2 = r2.j
            r33 = r3
            r34 = r10
            r35 = r11
            r36 = r12
            r37 = r13
            r38 = r14
            r39 = r6
            r40 = r7
            r41 = r0
            r42 = r2
            r33.<init>(r34, r35, r36, r37, r38, r39, r40, r41, r42)
        L_0x031b:
            r15.K = r3
            syc r0 = r1.C0
            if (r0 == 0) goto L_0x032e
            java.lang.Object r0 = r0.b
            long[] r0 = (long[]) r0
            int r2 = r0.length
            if (r2 <= 0) goto L_0x032e
            e72 r2 = new e72
            r2.<init>(r0)
            goto L_0x032f
        L_0x032e:
            r2 = 0
        L_0x032f:
            r15.D = r2
            jq5 r0 = new jq5
            int r2 = r1.D0
            r3 = 2
            r0.<init>(r2, r3)
            r15.F = r0
            gv6 r0 = r1.E0
            if (r0 == 0) goto L_0x0373
            h72 r2 = new h72
            long r6 = r0.a
            boolean r3 = r0.b
            boolean r10 = r0.c
            boolean r11 = r0.o
            java.lang.String r12 = r0.v
            java.lang.String r13 = r0.w
            boolean r14 = r0.x
            r30 = r8
            boolean r8 = r0.y
            int r9 = r0.z
            hv6 r0 = r0.X
            r33 = r2
            r34 = r6
            r36 = r3
            r37 = r10
            r38 = r11
            r39 = r12
            r40 = r13
            r41 = r14
            r42 = r8
            r43 = r9
            r44 = r0
            r33.<init>(r34, r36, r37, r38, r39, r40, r41, r42, r43, r44)
            r15.C = r2
            goto L_0x0375
        L_0x0373:
            r30 = r8
        L_0x0375:
            java.util.List r0 = r15.d()
            x62 r2 = defpackage.x62.o
            boolean r0 = r0.contains(r2)
            if (r0 != 0) goto L_0x0385
            boolean r0 = r1.G0
            r15.M = r0
        L_0x0385:
            boolean r0 = r1.H0
            r15.N = r0
            boolean r0 = r1.I0
            r15.O = r0
            af0 r0 = r1.L0
            if (r0 == 0) goto L_0x039d
            nl r3 = new nl
            long r6 = r0.c
            java.lang.String r8 = r0.o
            java.lang.String r0 = r0.b
            r3.<init>(r6, r0, r8)
            goto L_0x039e
        L_0x039d:
            r3 = 0
        L_0x039e:
            r15.T = r3
            zq0 r0 = new zq0
            ar0 r3 = r1.M0
            boolean r6 = r3.a
            boolean r3 = r3.b
            r0.<init>((boolean) r6, (boolean) r3)
            r15.d0 = r0
            long r6 = r1.N0
            r15.e0 = r6
            java.util.Map r0 = r1.O0
            r15.j0 = r0
            long r6 = r1.P0
            r15.k0 = r6
            long r6 = r1.R0
            r15.n0 = r6
            java.lang.String r0 = r1.S0
            r15.o0 = r0
            long r6 = r1.T0
            r15.p0 = r6
            long r6 = r1.U0
            r15.q0 = r6
            if (r5 == 0) goto L_0x0470
            long r6 = r5.o
            r8 = 0
            int r0 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r0 == 0) goto L_0x03e5
            long r10 = r15.j
            int r0 = (r10 > r8 ? 1 : (r10 == r8 ? 0 : -1))
            if (r0 == 0) goto L_0x03e1
            m72 r0 = r4.c
            long r8 = r0.k
            int r0 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r0 <= 0) goto L_0x03e5
        L_0x03e1:
            long r8 = r5.b
            r15.j = r8
        L_0x03e5:
            java.lang.Long r0 = java.lang.Long.valueOf(r6)
            r8 = 0
            int r3 = (r30 > r8 ? 1 : (r30 == r8 ? 0 : -1))
            if (r3 <= 0) goto L_0x0421
            r3 = r47
            hs7 r5 = r3.s
            java.lang.Object r5 = r5.get()
            fa9 r5 = (defpackage.fa9) r5
            r13 = r28
            r8 = r30
            ha9 r5 = r5.k(r13, r8)
            if (r5 == 0) goto L_0x041e
            g72 r8 = r15.n
            long r9 = r5.o
            bl4 r5 = defpackage.bl4.REGULAR
            r11 = r6
            r28 = r13
            r13 = r5
            boolean r5 = defpackage.hd8.q(r8, r9, r11, r13)
            if (r5 == 0) goto L_0x041b
            java.lang.String r5 = "updateChatFromServer: prevMesssage found, extend its chunk"
            r13 = r32
            defpackage.z68.c(r13, r5, new java.lang.Object[0])
            goto L_0x0429
        L_0x041b:
            r13 = r32
            goto L_0x0424
        L_0x041e:
            r28 = r13
            goto L_0x041b
        L_0x0421:
            r3 = r47
            goto L_0x041b
        L_0x0424:
            java.lang.String r5 = "updateChatFromServer: chunk for prevMessage not found"
            defpackage.z68.c(r13, r5, new java.lang.Object[0])
        L_0x0429:
            int r5 = r1.V0
            r8 = 4
            if (r5 == r8) goto L_0x0479
            java.util.Map r5 = r15.e()
            java.lang.Long r8 = java.lang.Long.valueOf(r24)
            boolean r5 = r5.containsKey(r8)
            if (r5 == 0) goto L_0x0479
            java.util.Map r5 = r15.e()
            java.lang.Long r8 = java.lang.Long.valueOf(r24)
            java.lang.Object r5 = r5.get(r8)
            java.lang.Long r5 = (java.lang.Long) r5
            if (r5 == 0) goto L_0x0456
            long r8 = r5.longValue()
            r10 = 0
            int r5 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r5 != 0) goto L_0x0479
        L_0x0456:
            long r8 = r1.J0
            int r5 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r5 > 0) goto L_0x0460
            r8 = 1
            long r8 = r6 - r8
        L_0x0460:
            java.lang.Long r5 = java.lang.Long.valueOf(r8)
            java.util.Map r6 = r15.e()
            java.lang.Long r7 = java.lang.Long.valueOf(r24)
            r6.put(r7, r5)
            goto L_0x0479
        L_0x0470:
            r5 = 0
            r3 = r47
            r13 = r32
            r15.j = r5
            r0 = 0
        L_0x0479:
            g72 r5 = r15.n
            bl4 r11 = defpackage.bl4.DELAYED
            r6 = 0
            r8 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r24 = r8
            r10 = r11
            boolean r5 = defpackage.hd8.q(r5, r6, r8, r10)
            if (r5 != 0) goto L_0x0494
            g72 r5 = r15.n
            r6 = r24
            defpackage.hd8.F(r5, r6, r11)
        L_0x0494:
            int r5 = r1.Z
            r15.m = r5
            java.util.List r5 = r15.d()
            boolean r2 = r5.contains(r2)
            if (r2 != 0) goto L_0x04af
            if (r27 == 0) goto L_0x04ab
            r2 = r27
            long r5 = r2.b
            r15.L = r5
            goto L_0x04af
        L_0x04ab:
            r5 = 0
            r15.L = r5
        L_0x04af:
            m72 r2 = r4.c
            k72 r2 = r2.c
            k72 r5 = r15.c
            if (r2 == r5) goto L_0x0573
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r5 = "handleChatStatus, chatId = "
            r2.<init>(r5)
            long r5 = r15.a
            r2.append(r5)
            java.lang.String r5 = ", status = "
            r2.append(r5)
            k72 r5 = r15.c
            r2.append(r5)
            java.lang.String r2 = r2.toString()
            defpackage.z68.c(r13, r2, new java.lang.Object[0])
            k72 r2 = r15.c
            int r2 = r2.ordinal()
            if (r2 == 0) goto L_0x051b
            r5 = 1
            if (r2 == r5) goto L_0x0503
            r5 = 3
            if (r2 == r5) goto L_0x04f9
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r5 = "chat status = "
            r2.<init>(r5)
            k72 r5 = r15.c
            r2.append(r5)
            java.lang.String r2 = r2.toString()
            defpackage.z68.c(r13, r2, new java.lang.Object[0])
            k72 r2 = r15.c
            r5 = r2
            goto L_0x0533
        L_0x04f9:
            u(r15)
            r5 = 0
            r15.x = r5
            r5 = r21
            goto L_0x0533
        L_0x0503:
            r5 = 0
            u(r15)
            r15.x = r5
            m72 r2 = r4.c
            k72 r2 = r2.c
            r5 = r23
            if (r2 != r5) goto L_0x0513
            goto L_0x0533
        L_0x0513:
            k72 r5 = defpackage.k72.c
            if (r2 != r5) goto L_0x0518
            goto L_0x0533
        L_0x0518:
            r5 = r20
            goto L_0x0533
        L_0x051b:
            r5 = r23
            m72 r2 = r4.c
            k72 r6 = r2.c
            if (r6 != r5) goto L_0x0531
            l72 r6 = r2.b
            r7 = r22
            if (r6 != r7) goto L_0x0533
            long r6 = r2.k
            long r8 = r15.k
            int r2 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r2 >= 0) goto L_0x0533
        L_0x0531:
            r5 = r19
        L_0x0533:
            m72 r2 = r4.c
            long r6 = r2.f
            long r8 = r15.f
            int r2 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r2 == 0) goto L_0x0560
            java.lang.String r2 = "created time is not the same, mark messages as deleted"
            defpackage.z68.c(r13, r2, new java.lang.Object[0])
            long r6 = r15.f
            long r8 = r4.b
            int r2 = r3.v(r8, r6)
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r7 = "created_issue: removed "
            r6.<init>(r7)
            r6.append(r2)
            java.lang.String r2 = " messages"
            r6.append(r2)
            java.lang.String r2 = r6.toString()
            defpackage.z68.c(r13, r2, new java.lang.Object[0])
        L_0x0560:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r6 = "new chat status = "
            r2.<init>(r6)
            r2.append(r5)
            java.lang.String r2 = r2.toString()
            defpackage.z68.c(r13, r2, new java.lang.Object[0])
            r15.c = r5
        L_0x0573:
            m72 r2 = r4.c
            long r5 = r2.U
            r15.U = r5
            int r5 = r2.V
            r15.V = r5
            long r5 = r2.W
            r15.W = r5
            int r5 = r2.X
            r15.X = r5
            syc r5 = r1.C0
            if (r5 == 0) goto L_0x0596
            java.lang.Object r5 = r5.b
            long[] r5 = (long[]) r5
            int r6 = r5.length
            if (r6 <= 0) goto L_0x0596
            e72 r6 = new e72
            r6.<init>(r5)
            goto L_0x0597
        L_0x0596:
            r6 = 0
        L_0x0597:
            r15.D = r6
            r5 = 0
            r15.m0 = r5
            long r5 = r2.f
            r7 = 0
            int r2 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r2 == 0) goto L_0x05eb
            long r7 = r15.f
            int r2 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r2 >= 0) goto L_0x05eb
            g72 r2 = r15.n
            bl4 r5 = defpackage.bl4.REGULAR
            java.util.ArrayList r2 = defpackage.hd8.j(r2, r7, r5)
            g72 r6 = r15.n
            java.util.ArrayList r6 = r6.d(r5)
            r6.clear()
            defpackage.g72.e(r5)
            g72 r6 = r15.n
            java.util.ArrayList r6 = r6.d(r5)
            r6.addAll(r2)
            defpackage.g72.e(r5)
            sv0 r2 = r3.m
            kv9 r6 = new kv9
            long r11 = r15.f
            r17 = 0
            r8 = r6
            r9 = r28
            r19 = r11
            r11 = r17
            r7 = r13
            r45 = r28
            r13 = r19
            r32 = r7
            r7 = r15
            r15 = r5
            r8.<init>(r9, r11, r13, r15)
            r2.c(r6)
        L_0x05e8:
            r2 = r49
            goto L_0x05f1
        L_0x05eb:
            r32 = r13
            r7 = r15
            r45 = r28
            goto L_0x05e8
        L_0x05f1:
            if (r2 == 0) goto L_0x05ff
            m72 r4 = r4.c
            d72 r4 = r4.a()
            d72 r2 = defpackage.qe8.i(r2, r4)
            r7.p = r2
        L_0x05ff:
            boolean r1 = r1.Q0
            r7.l0 = r1
            if (r0 == 0) goto L_0x0610
            g72 r1 = r7.n
            long r4 = r0.longValue()
            bl4 r0 = defpackage.bl4.REGULAR
            defpackage.hd8.F(r1, r4, r0)
        L_0x0610:
            long r0 = r7.n0
            java.lang.String r2 = r7.o0
            boolean r4 = defpackage.cvg.A(r2)
            if (r4 == 0) goto L_0x061d
            r5 = r45
            goto L_0x068b
        L_0x061d:
            hs7 r4 = r3.s
            java.lang.Object r4 = r4.get()
            fa9 r4 = (defpackage.fa9) r4
            r5 = r45
            ha9 r4 = r4.k(r5, r0)
            if (r4 == 0) goto L_0x068b
            xd9 r4 = r4.Q0
            if (r4 == 0) goto L_0x0632
            goto L_0x068b
        L_0x0632:
            a67 r4 = defpackage.z68.b
            if (r4 != 0) goto L_0x0637
            goto L_0x065c
        L_0x0637:
            boolean r8 = r4.c()
            if (r8 != 0) goto L_0x063e
            goto L_0x065c
        L_0x063e:
            w78 r8 = defpackage.w78.o
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            java.lang.String r10 = "updateMessageReactionIfPresent: adding first reaction="
            r9.<init>(r10)
            r9.append(r2)
            java.lang.String r10 = " for message with serverId="
            r9.append(r10)
            r9.append(r0)
            java.lang.String r9 = r9.toString()
            r11 = r32
            r10 = 0
            r4.d(r8, r11, r9, r10)
        L_0x065c:
            hs7 r4 = r3.s
            java.lang.Object r4 = r4.get()
            fa9 r4 = (defpackage.fa9) r4
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            qqc r1 = new qqc
            rqc r8 = defpackage.rqc.EMOJI
            hqc r9 = new hqc
            r9.<init>(r2)
            r1.<init>(r8, r9)
            wd9 r2 = new wd9
            r8 = 1
            r2.<init>(r1, r8)
            java.util.List r1 = kotlin.collections.CollectionsKt.listOf(r2)
            xd9 r2 = new xd9
            r9 = 0
            r2.<init>(r1, r8, r9)
            java.util.Map r0 = java.util.Collections.singletonMap(r0, r2)
            r4.i(r0)
        L_0x068b:
            m72 r0 = new m72
            r0.<init>(r7)
            n72 r1 = new n72
            r1.<init>(r5, r0)
            r3.c0(r5, r1)
            hs7 r1 = r3.l
            java.lang.Object r1 = r1.get()
            s74 r1 = (defpackage.s74) r1
            a74 r1 = (defpackage.a74) r1
            f6d r1 = r1.b
            r1.g(r5, r0)
            r0 = 0
            a32 r8 = r3.r0(r5, r0)
            if (r16 == 0) goto L_0x06ba
            sv0 r0 = r3.m
            fa r1 = new fa
            long r2 = r8.a
            r1.<init>(r2)
            r0.c(r1)
        L_0x06ba:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.r62.m0(b32, rp2):a32");
    }

    public final void n(long j2, long j3, pt4 pt4) {
        z68.c("r62", "Change draft: %d, draft = %s draftUpdateTime = %d", Long.valueOf(j2), pt4, Long.valueOf(j3));
        a32 i2 = i(j2, false, new u52((Object) this, (Object) pt4, j3, 1));
        Lazy lazy = this.C;
        if (lazy.getValue() != null) {
            ((ia2) ((u82) lazy.getValue())).o(j2, i2);
        }
        this.m.c(new xy2(Collections.singletonList(Long.valueOf(j2)), true));
    }

    public final List n0(List list) {
        return (List) o0("storeChatsFromServer", new vd0((Object) this, (Object) list, (Object) null, 20, 2));
    }

    public final void o(long j2, a32 a32) {
        StringBuilder sb = new StringBuilder("changeMuteUntil, chatId = ");
        long j3 = a32.a;
        sb.append(j3);
        sb.append(", dontDisturbUntil = ");
        sb.append(j2);
        z68.c("r62", sb.toString(), new Object[0]);
        i(j3, false, new c10(j2, 2));
        Lazy lazy = this.C;
        if (lazy.getValue() != null) {
            long j4 = a32.b.a;
            ia2 ia2 = (ia2) ((u82) lazy.getValue());
            aje aje = ia2.H0;
            if (aje != null) {
                aje.b((CancellationException) null);
            }
            ba2 ba2 = new ba2(ia2, (Continuation) null);
            ia2.H0 = ev0.v(ia2.y, ia2.x, (f14) null, ba2, 2);
        }
        this.m.c(new xy2(Collections.singletonList(Long.valueOf(j3)), false));
    }

    public final Object o0(String str, u2f u2f) {
        a67 a67;
        a67 a672;
        a67 a673;
        if (str != null) {
            a67 a674 = z68.b;
            if (a674 != null && a674.c()) {
                w78 w78 = w78.o;
                a674.d(w78, "r62", "syncSelf(" + str + ')', (Throwable) null);
            }
            if (this.H.isLocked() && (a673 = z68.b) != null && a673.c()) {
                w78 w782 = w78.w;
                StringBuilder p2 = tr1.p("syncSelf(", str, "): self is locked! ");
                p2.append(this.H.getHoldCount());
                a673.d(w782, "r62", p2.toString(), (Throwable) null);
            }
        }
        this.H.lock();
        try {
            Object obj = u2f.get();
            this.H.unlock();
            if (!(str == null || (a672 = z68.b) == null || !a672.c())) {
                a672.d(w78.o, "r62", wj6.k("syncSelf(", str, "): unlocked"), (Throwable) null);
            }
            return obj;
        } catch (Throwable th) {
            this.H.unlock();
            if (!(str == null || (a67 = z68.b) == null || !a67.c())) {
                a67.d(w78.o, "r62", wj6.k("syncSelf(", str, "): unlocked"), (Throwable) null);
            }
            throw th;
        }
    }

    public final void p(a32 a32) {
        ((jna) ((rl) this.p.get())).u(a32.a);
    }

    public final void p0(String str, Runnable runnable) {
        o0(str, new ms1(9, runnable));
    }

    public final void q0(long j2) {
        a32 G2 = G(j2);
        if (G2 != null) {
            o(0, G2);
            p(G2);
            Lazy lazy = this.C;
            if (lazy.getValue() != null) {
                long j3 = G2.b.a;
                ia2 ia2 = (ia2) ((u82) lazy.getValue());
                aje aje = ia2.H0;
                if (aje != null) {
                    aje.b((CancellationException) null);
                }
                ba2 ba2 = new ba2(ia2, (Continuation) null);
                ia2.H0 = ev0.v(ia2.y, ia2.x, (f14) null, ba2, 2);
            }
        }
    }

    public final a32 r(a32 a32) {
        if (a32 == null) {
            return null;
        }
        if (a32.c == null) {
            m72 m72 = a32.b;
            if (m72.j != 0) {
                n72 i0 = i0(a32.a);
                ha9 r2 = ((fa9) this.s.get()).r(m72.j);
                if (r2 == null) {
                    return a32;
                }
                z68.n("r62", (IOException) null, "checkChat! lastMessage is null but chat.data.getLastMessageId() not 0", Arrays.copyOf(new Object[0], 0));
                ((uta) ((m95) this.o.get())).c(new Exception("check.chat.error"), false);
                c0(i0.b, i0);
                return h(i0, r2);
            }
        }
        return a32;
    }

    public final a32 r0(long j2, boolean z2) {
        ha9 k2;
        long j3 = j2;
        a32 G2 = G(j2);
        n72 E2 = E(j2);
        if (E2 == null) {
            throw new IllegalArgumentException(wj6.i(j3, "chat is null for #"));
        } else if (G2 == null || z2) {
            return h(E2, (ha9) null);
        } else {
            m72 m72 = E2.c;
            long j4 = m72.j;
            m72 m722 = G2.b;
            boolean z3 = false;
            boolean z4 = j4 == m722.j;
            boolean z5 = m72.L == m722.L;
            if (m72.j0 == m722.j0) {
                z3 = true;
            }
            if (!z4 || !z5 || !z3) {
                return h(E2, (ha9) null);
            }
            boolean I2 = G2.I();
            hs7 hs7 = this.x;
            a89 a89 = G2.c;
            a32 b2 = (!I2 || a89 != null || (k2 = ((fa9) this.s.get()).k(j3, m72.j)) == null) ? null : ((o82) hs7.get()).b(E2, k2);
            if (b2 == null) {
                b2 = ((o82) hs7.get()).a(j2, ((ltb) this.n).a.s(), E2.c, a89, G2.o, G2.v);
                b2.p0((km3) this.r.get());
            }
            a32 a32 = b2;
            p0((String) null, new w52(this, j2, a32, true));
            return a32;
        }
    }

    public final void s(long j2, long j3) {
        z68.c("r62", "clearChatInternal: id=%d, time=%d", Long.valueOf(j2), Long.valueOf(j3));
        a32 G2 = G(j2);
        if (G2 != null) {
            long j4 = G2.b.a;
            ((d6b) this.v.get()).getClass();
            d6b.a(j4);
        }
        ((tz9) MapsKt__MapsKt.getOrPut(this.F, Long.valueOf(j2), new r52(0))).setValue((Object) null);
        i(j2, false, new c10(1 + j3, 8));
        v(j2, j3);
        i(j2, false, new c10(j3, 6));
        kv9 kv9 = new kv9(j2, 0, j3, bl4.REGULAR);
        sv0 sv0 = this.m;
        sv0.c(kv9);
        sv0.c(new xy2(Collections.singletonList(Long.valueOf(j2)), false));
    }

    public final void s0(long j2, long j3) {
        z68.c("r62", "updateChatLastSearchClickTime: chatId=%d, chatSearchClickTime=%d", Long.valueOf(j2), Long.valueOf(j3));
        n72 E2 = E(j2);
        if (E2 == null) {
            return;
        }
        if (E2.c.Y < j3 || j3 == 0) {
            i(j2, false, new c10(j3, 5));
        }
    }

    public final void t(long j2) {
        z68.c("r62", "clearDraft, chatId = %d", Long.valueOf(j2));
        a32 G2 = G(j2);
        if (G2 == null) {
            z68.n("r62", (IOException) null, "clearDraft: chat is null", Arrays.copyOf(new Object[0], 0));
            return;
        }
        n(j2, G2.b.g0, (pt4) null);
    }

    public final void t0(long j2, m72 m72, long j3) {
        z68.c("r62", "updateChatWriteTime: chatId=%d, chatWriteTime=%d", Long.valueOf(j2), Long.valueOf(j3));
        if (m72 != null && m72.Z < j3) {
            i(j2, false, new c10(j3, 7));
        }
    }

    public final a32 u0(long j2, ha9 ha9, boolean z2) {
        if (ha9 != null && ha9.p()) {
            return G(j2);
        }
        z68.c("r62", "updateLastMessage: chatId = " + j2 + ", messageDb = " + ha9 + ", force = " + z2, new Object[0]);
        return i(j2, true, new g62(this, ha9, z2, j2));
    }

    public final int v(long j2, long j3) {
        z68.c("r62", "clearMessagesInChat id=%d, time=%d", Long.valueOf(j2), Long.valueOf(j3));
        fa9 fa9 = (fa9) this.s.get();
        fa9.getClass();
        int e2 = fa9.e(j2, j3, bl4.REGULAR);
        z(j2, (w62) null, j3);
        A(j2);
        return e2;
    }

    public final void w() {
        if (this.i && !this.f.isEmpty()) {
            for (a32 a32 : this.f.values()) {
                a32.X = null;
                a32.Y = null;
                a32.v0 = null;
                a32.Z.set((Object) null);
            }
            this.m.c(new xy2(Collections.emptyList(), true));
        }
    }

    public final void w0(long j2, long j3, long j4, String str) {
        z68.c("r62", "updateLastPushMessage %d", Long.valueOf(j2));
        a32 D2 = D(j2);
        if (D2 == null) {
            z68.n("r62", (IOException) null, "updateLastPushMessage: chat not found! %d", Arrays.copyOf(new Object[]{Long.valueOf(j2)}, 1));
            return;
        }
        v52 v52 = new v52(1, j3, j4, str);
        long j5 = D2.a;
        i(j5, true, v52);
        this.m.c(new xy2(Collections.singletonList(Long.valueOf(j5)), true));
    }

    public final void x(long j2) {
        z68.c("r62", "deleteChatIcon, chatId = " + j2, new Object[0]);
        a32 G2 = G(j2);
        if (G2 != null) {
            ((jna) ((rl) this.p.get())).p(j2, G2.b.a, (String) null, "", (a20) null);
            j(j2, (String) null);
        }
    }

    public final void x0(int i2, long j2) {
        z68.c("r62", "updateNewMessages, chatId = " + j2 + ", count = " + i2, new Object[0]);
        i(j2, false, new ud0(this, i2, 3));
        this.m.c(new xy2(Collections.singletonList(Long.valueOf(j2)), false));
    }

    public final void y0(long j2) {
        z68.c("r62", "updatePinMessage: chatId = %d", Long.valueOf(j2));
        r0(j2, true);
    }

    public final void z(long j2, w62 w62, long j3) {
        if (j3 == LongCompanionObject.MAX_VALUE) {
            j3--;
        }
        ha9 s2 = ((fa9) this.s.get()).s(j2, 1 + j3);
        z68.c("r62", "findAndUpdateFirstMessage, chatId = %d, time = %s, message = %s", Long.valueOf(j2), iq.U(Long.valueOf(j3)), s2);
        long j4 = 0;
        if (w62 == null) {
            if (s2 != null) {
                j4 = s2.b;
            }
            i(j2, false, new c10(j4, 4));
            return;
        }
        if (s2 != null) {
            j4 = s2.b;
        }
        w62.x = j4;
    }

    public final void z0(long j2, long j3, long j4, Integer num, boolean z2) {
        long j5 = j2;
        Integer num2 = num;
        z68.c("r62", "updateReadMark: chatId=%d, userId=%d, mark=%d, newMessages=%s, notifySelfReadMarkChangedListener=%b", Long.valueOf(j2), Long.valueOf(j3), Long.valueOf(j4), num2, Boolean.valueOf(z2));
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        i(j5, false, new m62(this, j3, j4, num2, atomicBoolean, z2));
        if (atomicBoolean.get()) {
            hs7 hs7 = this.B;
            if (hs7.get() != null) {
                ((qfa) hs7.get()).d(j5, j4);
            }
        }
    }
}
