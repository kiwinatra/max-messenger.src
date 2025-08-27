package defpackage;

import java.util.concurrent.CancellationException;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.reflect.KProperty;

/* renamed from: ju3  reason: default package */
public final class ju3 {
    public static final /* synthetic */ KProperty[] j = {rae.s(ju3.class, "searchJob", "getSearchJob()Lkotlinx/coroutines/Job;", 0)};
    public final d14 a;
    public final ome b;
    public final he c;
    public final Lazy d;
    public final Lazy e;
    public final wie f = o5a.U();
    public final Lazy g = LazyKt.lazy(new nm1(19, this));
    public final xme h;
    public final etc i;

    public ju3(d14 d14, ome ome, he heVar, Lazy lazy, Lazy lazy2) {
        this.a = d14;
        this.b = ome;
        this.c = heVar;
        this.d = lazy;
        this.e = lazy2;
        xme a2 = f6e.a(po3.d);
        this.h = a2;
        this.i = new etc(a2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0077, code lost:
        if ((r2 != null ? ((defpackage.tld) r3.getValue()).h(r2.toString(), r8) : false) != false) goto L_0x0079;
     */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x007c  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x000e A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.util.ArrayList a(defpackage.ju3 r6, java.util.List r7, java.lang.String r8) {
        /*
            r6.getClass()
            java.lang.Iterable r7 = (java.lang.Iterable) r7
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r7 = r7.iterator()
        L_0x000e:
            boolean r1 = r7.hasNext()
            if (r1 == 0) goto L_0x0080
            java.lang.Object r1 = r7.next()
            r2 = r1
            zo3 r2 = (defpackage.zo3) r2
            java.util.List r3 = r2.o
            if (r3 == 0) goto L_0x004e
            java.lang.Iterable r3 = (java.lang.Iterable) r3
            boolean r4 = r3 instanceof java.util.Collection
            if (r4 == 0) goto L_0x002f
            r4 = r3
            java.util.Collection r4 = (java.util.Collection) r4
            boolean r4 = r4.isEmpty()
            if (r4 == 0) goto L_0x002f
            goto L_0x004e
        L_0x002f:
            java.util.Iterator r3 = r3.iterator()
        L_0x0033:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x004e
            java.lang.Object r4 = r3.next()
            java.lang.Number r4 = (java.lang.Number) r4
            long r4 = r4.longValue()
            java.lang.String r4 = java.lang.String.valueOf(r4)
            boolean r4 = kotlin.text.StringsKt__StringsJVMKt.startsWith$default(r4, r8, false, 2, (java.lang.Object) null)
            if (r4 == 0) goto L_0x0033
            goto L_0x0079
        L_0x004e:
            kotlin.Lazy r3 = r6.e
            java.lang.Object r4 = r3.getValue()
            tld r4 = (defpackage.tld) r4
            java.lang.CharSequence r5 = r2.b
            java.lang.String r5 = r5.toString()
            boolean r4 = r4.h(r5, r8)
            if (r4 != 0) goto L_0x0079
            r4 = 0
            java.lang.CharSequence r2 = r2.c
            if (r2 == 0) goto L_0x0076
            java.lang.Object r3 = r3.getValue()
            tld r3 = (defpackage.tld) r3
            java.lang.String r2 = r2.toString()
            boolean r2 = r3.h(r2, r8)
            goto L_0x0077
        L_0x0076:
            r2 = r4
        L_0x0077:
            if (r2 == 0) goto L_0x007a
        L_0x0079:
            r4 = 1
        L_0x007a:
            if (r4 == 0) goto L_0x000e
            r0.add(r1)
            goto L_0x000e
        L_0x0080:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ju3.a(ju3, java.util.List, java.lang.String):java.util.ArrayList");
    }

    public final void b() {
        ((tz9) this.g.getValue()).setValue((Object) null);
        pm7 pm7 = (pm7) this.f.getValue(this, j[0]);
        if (pm7 != null) {
            pm7.b((CancellationException) null);
        }
        po3 po3 = po3.d;
        xme xme = this.h;
        xme.getClass();
        xme.m((Object) null, po3);
    }
}
