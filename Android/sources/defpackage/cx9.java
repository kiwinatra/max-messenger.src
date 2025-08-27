package defpackage;

import kotlin.Lazy;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.reflect.KProperty;

/* renamed from: cx9  reason: default package */
public final class cx9 {
    public static final /* synthetic */ KProperty[] i = {rae.s(cx9.class, "newSelectionJob", "getNewSelectionJob()Lkotlinx/coroutines/Job;", 0)};
    public final d14 a;
    public final gaf b;
    public final ome c;
    public final Function2 d;
    public final Lazy e;
    public final xme f;
    public final etc g;
    public final wie h = o5a.U();

    public cx9(Lazy lazy, d14 d14, gaf gaf, ome ome, zw zwVar) {
        this.a = d14;
        this.b = gaf;
        this.c = ome;
        this.d = zwVar;
        this.e = lazy;
        xme a2 = f6e.a(new ww9());
        this.f = a2;
        this.g = new etc(a2);
    }

    public static e3b b(c89 c89) {
        int ordinal = c89.ordinal();
        if (ordinal == 0) {
            return new e3b(cwa.v, ewa.l, cad.Z1);
        }
        if (ordinal == 1) {
            return new e3b(cwa.q, ewa.e, cad.v);
        }
        if (ordinal == 4) {
            return new e3b(cwa.y, ewa.o, cad.R1);
        }
        if (ordinal == 5) {
            return new e3b(cwa.s, ewa.i, cad.y);
        }
        if (ordinal == 7) {
            return new e3b(cwa.x, ewa.n, cad.E1);
        }
        if (ordinal != 8) {
            return null;
        }
        return new e3b(cwa.C, ewa.s, cad.C1);
    }

    public final void a() {
        ww9 ww9 = new ww9();
        xme xme = this.f;
        xme.getClass();
        xme.m((Object) null, ww9);
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x003b  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x007a  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object c(java.util.Set r6, kotlin.coroutines.Continuation r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof defpackage.xw9
            if (r0 == 0) goto L_0x0013
            r0 = r7
            xw9 r0 = (defpackage.xw9) r0
            int r1 = r0.w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.w = r1
            goto L_0x0018
        L_0x0013:
            xw9 r0 = new xw9
            r0.<init>(r5, r7)
        L_0x0018:
            java.lang.Object r7 = r0.o
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.w
            r3 = 1
            if (r2 == 0) goto L_0x003b
            if (r2 != r3) goto L_0x0033
            java.util.List r5 = r0.c
            java.util.List r5 = (java.util.List) r5
            java.util.List r6 = r0.b
            java.util.List r6 = (java.util.List) r6
            cx9 r0 = r0.a
            kotlin.ResultKt.throwOnFailure(r7)
            goto L_0x0060
        L_0x0033:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x003b:
            kotlin.ResultKt.throwOnFailure(r7)
            java.util.List r7 = kotlin.collections.CollectionsKt.createListBuilder()
            kotlin.Lazy r2 = r5.e
            java.lang.Object r2 = r2.getValue()
            j89 r2 = (defpackage.j89) r2
            r0.a = r5
            r4 = r7
            java.util.List r4 = (java.util.List) r4
            r0.b = r4
            r0.c = r4
            r0.w = r3
            java.lang.Object r6 = r2.e(r6, r0)
            if (r6 != r1) goto L_0x005c
            return r1
        L_0x005c:
            r0 = r5
            r5 = r7
            r7 = r6
            r6 = r5
        L_0x0060:
            java.util.Collection r7 = (java.util.Collection) r7
            r5.addAll(r7)
            java.util.List r5 = kotlin.collections.CollectionsKt.build(r6)
            java.lang.Iterable r5 = (java.lang.Iterable) r5
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            java.util.Iterator r5 = r5.iterator()
        L_0x0074:
            boolean r7 = r5.hasNext()
            if (r7 == 0) goto L_0x008d
            java.lang.Object r7 = r5.next()
            c89 r7 = (defpackage.c89) r7
            r0.getClass()
            e3b r7 = b(r7)
            if (r7 == 0) goto L_0x0074
            r6.add(r7)
            goto L_0x0074
        L_0x008d:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cx9.c(java.util.Set, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x003b  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0083  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object d(one.me.messages.list.loader.MessageModel r6, kotlin.coroutines.Continuation r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof defpackage.yw9
            if (r0 == 0) goto L_0x0013
            r0 = r7
            yw9 r0 = (defpackage.yw9) r0
            int r1 = r0.w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.w = r1
            goto L_0x0018
        L_0x0013:
            yw9 r0 = new yw9
            r0.<init>(r5, r7)
        L_0x0018:
            java.lang.Object r7 = r0.o
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.w
            r3 = 1
            if (r2 == 0) goto L_0x003b
            if (r2 != r3) goto L_0x0033
            java.util.List r5 = r0.c
            java.util.List r5 = (java.util.List) r5
            java.util.List r6 = r0.b
            java.util.List r6 = (java.util.List) r6
            cx9 r0 = r0.a
            kotlin.ResultKt.throwOnFailure(r7)
            goto L_0x0069
        L_0x0033:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x003b:
            kotlin.ResultKt.throwOnFailure(r7)
            if (r6 != 0) goto L_0x0045
            java.util.List r5 = kotlin.collections.CollectionsKt.emptyList()
            return r5
        L_0x0045:
            java.util.List r7 = kotlin.collections.CollectionsKt.createListBuilder()
            kotlin.Lazy r2 = r5.e
            java.lang.Object r2 = r2.getValue()
            j89 r2 = (defpackage.j89) r2
            r0.a = r5
            r4 = r7
            java.util.List r4 = (java.util.List) r4
            r0.b = r4
            r0.c = r4
            r0.w = r3
            long r3 = r6.a
            java.lang.Object r6 = r2.d(r3, r0)
            if (r6 != r1) goto L_0x0065
            return r1
        L_0x0065:
            r0 = r5
            r5 = r7
            r7 = r6
            r6 = r5
        L_0x0069:
            java.util.Collection r7 = (java.util.Collection) r7
            r5.addAll(r7)
            java.util.List r5 = kotlin.collections.CollectionsKt.build(r6)
            java.lang.Iterable r5 = (java.lang.Iterable) r5
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            java.util.Iterator r5 = r5.iterator()
        L_0x007d:
            boolean r7 = r5.hasNext()
            if (r7 == 0) goto L_0x0096
            java.lang.Object r7 = r5.next()
            c89 r7 = (defpackage.c89) r7
            r0.getClass()
            e3b r7 = b(r7)
            if (r7 == 0) goto L_0x007d
            r6.add(r7)
            goto L_0x007d
        L_0x0096:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cx9.d(one.me.messages.list.loader.MessageModel, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final boolean e() {
        return !((ww9) this.g.a.getValue()).a.isEmpty();
    }

    public final void f(long j) {
        aje u = ev0.u(this.a, ((osa) this.b).a(), f14.b, new ax9(j, this, (Continuation) null));
        this.h.setValue(this, i[0], u);
    }
}
