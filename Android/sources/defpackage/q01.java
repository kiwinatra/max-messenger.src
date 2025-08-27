package defpackage;

import java.util.List;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.collections.MapsKt;
import ru.ok.android.externcalls.analytics.CallAnalyticsSender;

/* renamed from: q01  reason: default package */
public final class q01 {
    public boolean a;
    public final Object b;
    public final Object c;
    public final Object d;
    public Object e;
    public Object f;
    public Object g;
    public Object h;
    public Object i;

    public q01(CallAnalyticsSender callAnalyticsSender, zc4 zc4, sjf sjf) {
        this.b = callAnalyticsSender;
        this.c = zc4;
        this.d = sjf;
        this.a = true;
        this.h = new e4(4, (Object) this);
    }

    /* JADX WARNING: Removed duplicated region for block: B:41:0x008e  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00bd  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.List a(java.util.Collection r5, defpackage.vag r6, defpackage.k91 r7) {
        /*
            r4 = this;
            x4b r0 = defpackage.x4b.b
            boolean r1 = r7.g
            if (r1 != 0) goto L_0x0017
            js9 r1 = defpackage.vag.a
            r1.getClass()
            boolean r1 = defpackage.js9.k(r6)
            if (r1 == 0) goto L_0x0017
            java.util.List r7 = kotlin.collections.CollectionsKt.emptyList()
            goto L_0x0087
        L_0x0017:
            boolean r1 = r7.l
            boolean r2 = r7.g
            if (r2 == 0) goto L_0x0064
            js9 r3 = defpackage.vag.a
            r3.getClass()
            vag r3 = defpackage.vag.o
            if (r6 != r3) goto L_0x0064
            if (r1 != 0) goto L_0x0064
            java.util.List r1 = kotlin.collections.CollectionsKt.createListBuilder()
            r1.addAll(r5)
            ld9 r2 = r7.b
            if (r2 == 0) goto L_0x005f
            boolean r3 = r2 instanceof defpackage.el1
            if (r3 == 0) goto L_0x0052
            boolean r3 = r4.a
            if (r3 == 0) goto L_0x0052
            ma1 r2 = new ma1
            java.lang.String r7 = r7.k
            if (r7 == 0) goto L_0x0046
            java.lang.String r7 = defpackage.f6e.J(r7)
            goto L_0x0047
        L_0x0046:
            r7 = 0
        L_0x0047:
            if (r7 != 0) goto L_0x004b
            java.lang.String r7 = ""
        L_0x004b:
            r2.<init>(r7)
            r1.add(r2)
            goto L_0x005f
        L_0x0052:
            boolean r7 = r2 instanceof defpackage.dl1
            if (r7 == 0) goto L_0x005f
            boolean r7 = r4.a
            if (r7 == 0) goto L_0x005f
            ba1 r7 = defpackage.ba1.a
            r1.add(r7)
        L_0x005f:
            java.util.List r7 = kotlin.collections.CollectionsKt.build(r1)
            goto L_0x0087
        L_0x0064:
            if (r2 == 0) goto L_0x0080
            js9 r2 = defpackage.vag.a
            r2.getClass()
            boolean r2 = defpackage.js9.k(r6)
            if (r2 == 0) goto L_0x0080
            if (r1 != 0) goto L_0x0077
            boolean r1 = r4.a
            if (r1 != 0) goto L_0x0080
        L_0x0077:
            boolean r7 = r7.o
            if (r7 == 0) goto L_0x0080
            java.util.List r7 = kotlin.collections.CollectionsKt.emptyList()
            goto L_0x0087
        L_0x0080:
            r7 = r5
            java.lang.Iterable r7 = (java.lang.Iterable) r7
            java.util.List r7 = kotlin.collections.CollectionsKt.toList(r7)
        L_0x0087:
            int r6 = r6.ordinal()
            r1 = 0
            if (r6 == 0) goto L_0x00bd
            r5 = 1
            if (r6 == r5) goto L_0x00b8
            r5 = 2
            if (r6 != r5) goto L_0x00b2
            java.util.List r5 = kotlin.collections.CollectionsKt.createListBuilder()
            java.lang.Object r4 = r4.d
            kotlin.Lazy r4 = (kotlin.Lazy) r4
            java.lang.Object r4 = r4.getValue()
            java.lang.Number r4 = (java.lang.Number) r4
            int r4 = r4.intValue()
            java.util.ArrayList r4 = defpackage.ke8.a(r7, r4, r0, r1)
            r5.addAll(r4)
            java.util.List r4 = kotlin.collections.CollectionsKt.build(r5)
            goto L_0x00d0
        L_0x00b2:
            kotlin.NoWhenBranchMatchedException r4 = new kotlin.NoWhenBranchMatchedException
            r4.<init>()
            throw r4
        L_0x00b8:
            java.util.List r4 = kotlin.collections.CollectionsKt.emptyList()
            goto L_0x00d0
        L_0x00bd:
            boolean r4 = r5.isEmpty()
            if (r4 == 0) goto L_0x00c8
            java.util.List r4 = kotlin.collections.CollectionsKt.emptyList()
            goto L_0x00d0
        L_0x00c8:
            int r4 = r5.size()
            java.util.ArrayList r4 = defpackage.ke8.a(r7, r4, r0, r1)
        L_0x00d0:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.q01.a(java.util.Collection, vag, k91):java.util.List");
    }

    public nge b(Map map, gd8 gd8, List list, ze1 ze1) {
        la1 la1;
        k91 k91 = (k91) this.e;
        v4b v4b = null;
        if (k91.t) {
            return null;
        }
        aj8.a.getClass();
        if (nfd.r(k91.r)) {
            me5 me5 = k91.e;
            if (!(me5 instanceof he5) && !(me5 instanceof ge5) && !(me5 instanceof ie5) && !k91.g) {
                vag.a.getClass();
                if (js9.k((vag) this.f) && (la1 = (la1) map.get(ze1)) != null) {
                    v4b = ke8.e(la1, true, k91.m, false);
                }
            }
        }
        return new nge(list, gd8, v4b);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v0, resolved type: la1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v3, resolved type: la1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v6, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v1, resolved type: la1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v6, resolved type: la1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v7, resolved type: la1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v13, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v7, resolved type: la1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v10, resolved type: la1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v14, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v16, resolved type: la1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v17, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v18, resolved type: la1} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public defpackage.gd8 c(defpackage.vag r21, java.util.Map r22, defpackage.ze1 r23) {
        /*
            r20 = this;
            r0 = r20
            r1 = r23
            java.lang.Object r2 = r0.e
            k91 r2 = (defpackage.k91) r2
            l21 r2 = r2.f
            r3 = 0
            if (r2 == 0) goto L_0x0035
            java.lang.Long r4 = r2.a
            if (r4 == 0) goto L_0x001d
            long r4 = r4.longValue()
            ze1 r6 = new ze1
            r7 = 0
            r6.<init>(r4, r7)
            r11 = r6
            goto L_0x001e
        L_0x001d:
            r11 = r3
        L_0x001e:
            gd8 r4 = new gd8
            lge r17 = defpackage.lge.c
            r15 = 0
            r16 = 0
            zd0 r9 = r2.c
            java.lang.CharSequence r10 = r2.b
            r12 = 0
            r13 = 0
            r14 = 0
            r18 = 0
            r19 = 0
            r8 = r4
            r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            goto L_0x0036
        L_0x0035:
            r4 = r3
        L_0x0036:
            java.lang.Object r2 = r0.e
            k91 r2 = (defpackage.k91) r2
            java.lang.Object r5 = r0.i
            java.util.Map r5 = (java.util.Map) r5
            java.lang.Object r6 = r0.h
            ze1 r6 = (defpackage.ze1) r6
            java.lang.Object r6 = r5.get(r6)
            la1 r6 = (defpackage.la1) r6
            if (r6 != 0) goto L_0x0095
            ze1 r6 = r2.p
            java.lang.Object r6 = r5.get(r6)
            la1 r6 = (defpackage.la1) r6
            if (r6 != 0) goto L_0x0095
            java.util.Set r6 = r5.keySet()
            java.util.Iterator r6 = r6.iterator()
        L_0x005c:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L_0x007e
            java.lang.Object r7 = r6.next()
            r8 = r7
            ze1 r8 = (defpackage.ze1) r8
            y8b r9 = r2.h
            if (r9 == 0) goto L_0x0074
            cf1 r9 = r9.a
            ze1 r9 = r9.getId()
            goto L_0x0075
        L_0x0074:
            r9 = r3
        L_0x0075:
            boolean r8 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r8, (java.lang.Object) r9)
            r8 = r8 ^ 1
            if (r8 == 0) goto L_0x005c
            goto L_0x007f
        L_0x007e:
            r7 = r3
        L_0x007f:
            java.lang.Object r2 = r5.get(r7)
            r6 = r2
            la1 r6 = (defpackage.la1) r6
            if (r6 != 0) goto L_0x0095
            java.util.Collection r2 = r5.values()
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            java.lang.Object r2 = kotlin.collections.CollectionsKt.firstOrNull(r2)
            r6 = r2
            la1 r6 = (defpackage.la1) r6
        L_0x0095:
            java.lang.Object r2 = r0.e
            k91 r2 = (defpackage.k91) r2
            ni1 r5 = r2.i
            boolean r5 = r5.a()
            if (r5 == 0) goto L_0x00a3
            goto L_0x0140
        L_0x00a3:
            js9 r5 = defpackage.vag.a
            r5.getClass()
            vag r5 = defpackage.vag.o
            r7 = r21
            if (r7 != r5) goto L_0x00b0
            goto L_0x0140
        L_0x00b0:
            java.lang.Object r5 = r0.c
            kotlin.Lazy r5 = (kotlin.Lazy) r5
            boolean r2 = r2.g
            if (r2 != 0) goto L_0x00f1
            boolean r8 = defpackage.js9.k(r21)
            if (r8 == 0) goto L_0x00f1
            if (r1 != 0) goto L_0x00f1
            java.util.Collection r1 = r22.values()
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.Iterator r1 = r1.iterator()
        L_0x00ca:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x00de
            java.lang.Object r2 = r1.next()
            r6 = r2
            la1 r6 = (defpackage.la1) r6
            boolean r6 = r6.X
            r6 = r6 ^ 1
            if (r6 == 0) goto L_0x00ca
            r3 = r2
        L_0x00de:
            la1 r3 = (defpackage.la1) r3
            if (r3 == 0) goto L_0x0130
            java.lang.Object r0 = r0.e
            k91 r0 = (defpackage.k91) r0
            java.lang.Object r1 = r5.getValue()
            hl1 r1 = (defpackage.hl1) r1
            gd8 r3 = defpackage.ke8.d(r3, r0, r1)
            goto L_0x0140
        L_0x00f1:
            if (r2 != 0) goto L_0x012e
            boolean r2 = defpackage.js9.k(r21)
            if (r2 == 0) goto L_0x012e
            java.util.Collection r2 = r22.values()
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            java.util.Iterator r2 = r2.iterator()
        L_0x0103:
            boolean r6 = r2.hasNext()
            if (r6 == 0) goto L_0x011b
            java.lang.Object r6 = r2.next()
            r7 = r6
            la1 r7 = (defpackage.la1) r7
            ze1 r7 = r7.a
            boolean r7 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r7, (java.lang.Object) r1)
            r7 = r7 ^ 1
            if (r7 == 0) goto L_0x0103
            r3 = r6
        L_0x011b:
            la1 r3 = (defpackage.la1) r3
            if (r3 == 0) goto L_0x0130
            java.lang.Object r0 = r0.e
            k91 r0 = (defpackage.k91) r0
            java.lang.Object r1 = r5.getValue()
            hl1 r1 = (defpackage.hl1) r1
            gd8 r3 = defpackage.ke8.d(r3, r0, r1)
            goto L_0x0140
        L_0x012e:
            if (r6 != 0) goto L_0x0132
        L_0x0130:
            r3 = r4
            goto L_0x0140
        L_0x0132:
            java.lang.Object r0 = r0.e
            k91 r0 = (defpackage.k91) r0
            java.lang.Object r1 = r5.getValue()
            hl1 r1 = (defpackage.hl1) r1
            gd8 r3 = defpackage.ke8.d(r6, r0, r1)
        L_0x0140:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.q01.c(vag, java.util.Map, ze1):gd8");
    }

    public q01(Lazy lazy, wgd wgd) {
        this.b = wgd;
        this.c = lazy;
        this.d = LazyKt.lazy(LazyThreadSafetyMode.NONE, new nm1(2, this));
        this.e = new k91();
        this.f = vag.b;
        this.a = true;
        this.i = MapsKt.emptyMap();
    }
}
