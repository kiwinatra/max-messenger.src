package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Lazy;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function1;
import kotlin.reflect.KProperty;
import kotlin.time.Duration;
import kotlin.time.DurationKt;
import kotlin.time.DurationUnit;

/* renamed from: is9  reason: default package */
public final class is9 implements s98 {
    public final vq7 X;
    public final s04 a;
    public final Lazy b;
    public final Lazy c;
    public final Lazy o;
    public final Lazy v;
    public final Lazy w;
    public final Lazy x;
    public final a0a y = cvg.a();
    public final ws z = new ws(0);

    public is9(Lazy lazy, Lazy lazy2, s04 s04, Lazy lazy3, Lazy lazy4, Lazy lazy5, Lazy lazy6, Lazy lazy7) {
        this.a = s04;
        this.b = lazy2;
        this.c = lazy3;
        this.o = lazy4;
        this.v = lazy5;
        this.w = lazy6;
        this.x = lazy7;
        this.X = new vq7(20, (Object) lazy);
        ((iaa) lazy7.getValue()).c.d = new vr9(this, (Continuation) null);
    }

    public static void g(b89 b89, jz9 jz9, jz9 jz92, int i, boolean z2) {
        b89 b892;
        jz9.e(b89.o);
        a00 a00 = b89.y;
        if (!a00.isEmpty()) {
            Iterator it = a00.iterator();
            while (it.hasNext()) {
                gz gzVar = (gz) it.next();
                b10 b10 = gzVar.a;
                int i2 = b10 == null ? -1 : wr9.$EnumSwitchMapping$0[b10.ordinal()];
                if (i2 == 1) {
                    ox3 ox3 = (ox3) gzVar;
                    Long l = ox3.v;
                    if (l != null) {
                        jz9.e(l.longValue());
                    }
                    List<Long> list = ox3.w;
                    if (list != null) {
                        for (Long l2 : list) {
                            if (l2 != null) {
                                jz9.e(l2.longValue());
                            }
                        }
                    }
                } else if (i2 == 2) {
                    List<Long> list2 = ((h01) gzVar).z;
                    if (list2 != null) {
                        for (Long longValue : list2) {
                            jz9.e(longValue.longValue());
                        }
                    }
                } else if (i2 == 3) {
                    jz9.e(((al3) gzVar).v);
                }
            }
        }
        lc9 lc9 = b89.z;
        if (lc9 != null && (b892 = lc9.c) != null && i > 0) {
            if (z2) {
                g(b892, jz92, jz92, i - 1, true);
            } else {
                g(b892, jz9, jz92, i - 1, true);
            }
        }
    }

    public static void h(ha9 ha9, jz9 jz9, jz9 jz92, int i, boolean z2) {
        List<Number> list;
        n10 n10;
        jz9.e(ha9.w);
        w28 w28 = ha9.x0;
        if (w28 != null) {
            int G = w28.G();
            for (int i2 = 0; i2 < G; i2++) {
                l20 F = w28.F(i2);
                if (F != null) {
                    g20 g20 = F.a;
                    int i3 = g20 == null ? -1 : wr9.$EnumSwitchMapping$1[g20.ordinal()];
                    if (i3 == 1) {
                        q10 q10 = F.c;
                        if (q10 != null) {
                            jz9.e(q10.b);
                            Iterator it = q10.c.iterator();
                            while (it.hasNext()) {
                                jz9.e(((Number) it.next()).longValue());
                            }
                        }
                    } else if (i3 == 2) {
                        l10 l10 = F.i;
                        if (!(l10 == null || (list = l10.f) == null)) {
                            for (Number longValue : list) {
                                jz9.e(longValue.longValue());
                            }
                        }
                    } else if (i3 == 3 && (n10 = F.k) != null) {
                        jz9.e(n10.b);
                    }
                }
            }
        }
        ha9 ha92 = ha9.A0;
        if (ha92 == null || i <= 0) {
            return;
        }
        if (z2) {
            h(ha92, jz92, jz92, i - 1, true);
        } else {
            h(ha92, jz9, jz92, i - 1, true);
        }
    }

    public final void a() {
    }

    public final List b(jz9 jz9) {
        jz9 jz92 = jz9;
        if (!k() || jz9.b()) {
            return CollectionsKt.emptyList();
        }
        jz9 jz93 = new jz9((Object) null);
        long[] jArr = jz92.b;
        long[] jArr2 = jz92.a;
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
                            if (!((Boolean) this.X.invoke(Long.valueOf(j2))).booleanValue()) {
                                jz93.e(j2);
                            }
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
        jz92.l(jz93);
        return (!k() || jz9.b()) ? CollectionsKt.emptyList() : wa8.c(jz9);
    }

    public final void c(jz9 jz9, b32 b32, jz9 jz92) {
        boolean z2 = b32.V0 == 2;
        for (Long longValue : b32.o.keySet()) {
            long longValue2 = longValue.longValue();
            if (z2) {
                jz9.e(longValue2);
            } else {
                jz92.e(longValue2);
            }
        }
        Map map = b32.K0;
        if (map != null) {
            for (Map.Entry entry : map.entrySet()) {
                jz92.e(((Long) entry.getKey()).longValue());
                jz92.e(((cb) entry.getValue()).c);
            }
        }
        b89 b89 = b32.z;
        if (b89 != null) {
            g(b89, jz9, jz92, 5, false);
        }
        b89 b892 = b32.F0;
        if (b892 != null) {
            g(b892, jz9, jz92, 5, false);
        }
        jz92.e(b32.c);
    }

    public final jz9 d(List list, jz9 jz9) {
        jz9 jz92 = new jz9(list.size());
        if (list.isEmpty()) {
            return jz92;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            c(jz92, (b32) it.next(), jz9);
        }
        return jz92;
    }

    public final void i(List list, jz9 jz9, jz9 jz92) {
        Collection collection = list;
        if (collection != null && !collection.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                g((b89) it.next(), jz9, jz92, 5, false);
            }
        }
    }

    public final iaa j() {
        return (iaa) this.x.getValue();
    }

    public final boolean k() {
        nh3 nh3 = (nh3) this.w.getValue();
        nh3.getClass();
        KProperty kProperty = nh3.f[3];
        return !(((jxd) ((hxd) nh3.d.get())).h == 1);
    }

    public final Object l(long j, List list, Continuation continuation) {
        return e14.d(new as9(list, this, j, (Continuation) null), continuation);
    }

    public final void m(b32 b32) {
        a67 a67 = z68.b;
        if (a67 != null && a67.c()) {
            w78 w78 = w78.o;
            a67.d(w78, "MissedContactsController", "requestForChat: chat=" + b32, (Throwable) null);
        }
        jz9 jz9 = new jz9((Object) null);
        jz9 d = d(CollectionsKt.listOf(b32), jz9);
        j().c(jz9);
        if (!d.b()) {
            List b2 = b(d);
            if (!b2.isEmpty()) {
                Object unused = ev0.C(EmptyCoroutineContext.INSTANCE, new bs9(this, b2, (Continuation) null));
            }
        }
    }

    public final Object n(ma2 ma2, long j, Continuation continuation) {
        a67 a67 = z68.b;
        if (a67 != null && a67.c()) {
            w78 w78 = w78.o;
            a67.d(w78, "MissedContactsController", "requestForChatHistory: response=" + ma2, (Throwable) null);
        }
        jz9 jz9 = new jz9((Object) null);
        jz9 jz92 = new jz9((Object) null);
        i(ma2.c, jz9, jz92);
        b32 b32 = ma2.o;
        if (b32 != null) {
            c(jz9, b32, jz92);
        }
        j().c(jz92);
        List b2 = b(jz9);
        if (b2.isEmpty()) {
            return Unit.INSTANCE;
        }
        Object l = l(j, b2, continuation);
        return l == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? l : Unit.INSTANCE;
    }

    public final void o(va2 va2) {
        a67 a67 = z68.b;
        if (a67 != null && a67.c()) {
            w78 w78 = w78.o;
            a67.d(w78, "MissedContactsController", "requestForChatInfo: response=" + va2, (Throwable) null);
        }
        jz9 jz9 = new jz9((Object) null);
        jz9 d = d(va2.c, jz9);
        b32 b32 = va2.o;
        if (b32 != null) {
            c(d, b32, jz9);
        }
        j().c(jz9);
        if (!d.b()) {
            List b2 = b(d);
            if (!b2.isEmpty()) {
                Object unused = ev0.C(EmptyCoroutineContext.INSTANCE, new cs9(this, b2, (Continuation) null));
            }
        }
    }

    public final void p(List list) {
        Collection collection = list;
        if (collection != null && !collection.isEmpty()) {
            a67 a67 = z68.b;
            if (a67 != null && a67.c()) {
                a67.d(w78.o, "MissedContactsController", a81.m("requestForChats: chats=", CollectionsKt___CollectionsKt.joinToString$default(list, (CharSequence) null, (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (Function1) null, 63, (Object) null)), (Throwable) null);
            }
            jz9 jz9 = new jz9((Object) null);
            jz9 d = d(list, jz9);
            j().c(jz9);
            if (!d.b()) {
                List b2 = b(d);
                if (!b2.isEmpty()) {
                    Object unused = ev0.C(EmptyCoroutineContext.INSTANCE, new ds9(this, b2, (Continuation) null));
                }
            }
        }
    }

    public final Object q(a32 a32, Continuation continuation) {
        a67 a67 = z68.b;
        if (a67 != null && a67.c()) {
            w78 w78 = w78.o;
            a67.d(w78, "MissedContactsController", "requestForChat: chat=" + a32, (Throwable) null);
        }
        jz9 jz9 = new jz9((Object) null);
        jz9 jz92 = new jz9((Object) null);
        boolean N = a32.N();
        for (Long longValue : a32.b.e.keySet()) {
            long longValue2 = longValue.longValue();
            if (N) {
                jz92.e(longValue2);
            } else {
                jz9.e(longValue2);
            }
        }
        Map map = a32.b.R;
        if (map != null) {
            for (Map.Entry entry : map.entrySet()) {
                jz9.e(((Long) entry.getKey()).longValue());
                jz9.e(((v62) entry.getValue()).c);
            }
        }
        a89 a89 = a32.c;
        if (a89 != null) {
            h(a89.a, jz92, jz9, 5, false);
        }
        a89 a892 = a32.v;
        if (a892 != null) {
            h(a892.a, jz92, jz9, 5, false);
        }
        jz9.e(a32.b.d);
        j().c(jz9);
        if (jz92.b()) {
            return Unit.INSTANCE;
        }
        List b2 = b(jz92);
        if (b2.isEmpty()) {
            return Unit.INSTANCE;
        }
        Duration.Companion companion = Duration.Companion;
        Object l = l(DurationKt.toDuration(10, DurationUnit.SECONDS), b2, continuation);
        return l == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? l : Unit.INSTANCE;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0038  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object r(defpackage.l88 r8, long r9, kotlin.coroutines.Continuation r11) {
        /*
            r7 = this;
            boolean r0 = r11 instanceof defpackage.es9
            if (r0 == 0) goto L_0x0013
            r0 = r11
            es9 r0 = (defpackage.es9) r0
            int r1 = r0.v
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.v = r1
            goto L_0x0018
        L_0x0013:
            es9 r0 = new es9
            r0.<init>(r7, r11)
        L_0x0018:
            java.lang.Object r11 = r0.c
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.v
            r3 = 1
            if (r2 == 0) goto L_0x0038
            if (r2 != r3) goto L_0x0030
            jz9 r7 = r0.b
            is9 r8 = r0.a
            kotlin.ResultKt.throwOnFailure(r11)
            r2 = r7
            r7 = r8
            goto L_0x00b7
        L_0x0030:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L_0x0038:
            kotlin.ResultKt.throwOnFailure(r11)
            java.lang.String r11 = "requestForLogin"
            java.lang.String r2 = "MissedContactsController"
            defpackage.z68.c(r2, r11, new java.lang.Object[0])
            java.util.ArrayList r11 = r8.d()
            java.util.ArrayList r2 = new java.util.ArrayList
            int r4 = kotlin.collections.CollectionsKt__IterablesKt.collectionSizeOrDefault(r11, 10)
            r2.<init>(r4)
            java.util.Iterator r11 = r11.iterator()
        L_0x0053:
            boolean r4 = r11.hasNext()
            if (r4 == 0) goto L_0x0069
            java.lang.Object r4 = r11.next()
            fo3 r4 = (defpackage.fo3) r4
            long r4 = r4.a
            java.lang.Long r4 = kotlin.coroutines.jvm.internal.Boxing.boxLong(r4)
            r2.add(r4)
            goto L_0x0053
        L_0x0069:
            jz9 r11 = defpackage.wa8.d(r2)
            jz9 r2 = new jz9
            r4 = 0
            r2.<init>((java.lang.Object) r4)
            java.util.List r4 = r8.o
            jz9 r4 = r7.d(r4, r2)
            java.util.Map r5 = r8.X
            java.util.Collection r5 = r5.values()
            java.util.Iterator r5 = r5.iterator()
        L_0x0083:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L_0x0093
            java.lang.Object r6 = r5.next()
            java.util.List r6 = (java.util.List) r6
            r7.i(r6, r4, r2)
            goto L_0x0083
        L_0x0093:
            r4.l(r11)
            fo3 r8 = r8.c
            if (r8 == 0) goto L_0x00a3
            long r5 = r8.a
            boolean r8 = r4.k(r5)
            kotlin.coroutines.jvm.internal.Boxing.boxBoolean(r8)
        L_0x00a3:
            r2.l(r11)
            java.util.List r8 = r7.b(r4)
            r0.a = r7
            r0.b = r2
            r0.v = r3
            java.lang.Object r8 = r7.l(r9, r8, r0)
            if (r8 != r1) goto L_0x00b7
            return r1
        L_0x00b7:
            iaa r7 = r7.j()
            r7.c(r2)
            kotlin.Unit r7 = kotlin.Unit.INSTANCE
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.is9.r(l88, long, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final void s(kba kba) {
        a67 a67 = z68.b;
        if (a67 != null && a67.c()) {
            w78 w78 = w78.o;
            a67.d(w78, "MissedContactsController", "requestForNotifMessage: response=" + kba, (Throwable) null);
        }
        jz9 jz9 = new jz9((Object) null);
        jz9 jz92 = new jz9((Object) null);
        g(kba.v, jz9, jz92, 5, false);
        b32 b32 = kba.o;
        if (b32 != null) {
            c(jz9, b32, jz92);
        }
        j().c(jz92);
        if (!jz9.b()) {
            List b2 = b(jz9);
            if (!b2.isEmpty()) {
                Object unused = ev0.C(EmptyCoroutineContext.INSTANCE, new fs9(this, b2, (Continuation) null));
            }
        }
    }

    public final void t(dca dca) {
        long j = dca.o;
        jz9 jz9 = xa8.a;
        jz9 jz92 = new jz9(1);
        jz92.b[jz92.h(j)] = j;
        List b2 = b(jz92);
        if (!b2.isEmpty()) {
            a67 a67 = z68.b;
            if (a67 != null && a67.c()) {
                w78 w78 = w78.o;
                Object first = CollectionsKt.first(b2);
                a67.d(w78, "MissedContactsController", "requestForTyping: id=#" + first, (Throwable) null);
            }
            j().d(b2);
        }
    }

    public final Object u(long j, long j2, Continuation continuation) {
        a67 a67 = z68.b;
        if (a67 != null && a67.c()) {
            a67.d(w78.o, "MissedContactsController", wj6.i(j, "requestForUser: id=#"), (Throwable) null);
        }
        jz9 jz9 = xa8.a;
        jz9 jz92 = new jz9(1);
        jz92.b[jz92.h(j)] = j;
        List b2 = b(jz92);
        if (b2.isEmpty()) {
            return Unit.INSTANCE;
        }
        Object l = l(j2, b2, continuation);
        return l == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? l : Unit.INSTANCE;
    }

    public final Object v(jz9 jz9, long j, Continuation continuation) {
        List b2 = b(jz9);
        if (b2.isEmpty()) {
            return Unit.INSTANCE;
        }
        a67 a67 = z68.b;
        if (a67 != null && a67.c()) {
            a67.d(w78.o, "MissedContactsController", wj6.k("requestForUsers: ids=[", CollectionsKt___CollectionsKt.joinToString$default(b2, (CharSequence) null, (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (Function1) null, 63, (Object) null), "]"), (Throwable) null);
        }
        Object l = l(j, b2, continuation);
        return l == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? l : Unit.INSTANCE;
    }

    public final void w(d4g d4g) {
        a67 a67 = z68.b;
        if (a67 != null && a67.c()) {
            w78 w78 = w78.o;
            a67.d(w78, "MissedContactsController", "requestForVideoConference: videoConference=" + d4g, (Throwable) null);
        }
        fo3 fo3 = d4g.a;
        if (fo3 != null) {
            j().b(fo3.a);
        }
    }
}
