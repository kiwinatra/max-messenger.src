package defpackage;

import android.content.Context;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.reflect.KProperty;

/* renamed from: hjg  reason: default package */
public final class hjg extends xag {
    public static final /* synthetic */ KProperty[] M0 = {rae.s(hjg.class, "reloadWebAppJob", "getReloadWebAppJob()Lkotlinx/coroutines/Job;", 0)};
    public final tgg A0;
    public final xme B0;
    public final xme C0;
    public final xme D0;
    public final xme E0;
    public boolean F0;
    public volatile String G0;
    public final etc H0;
    public final s85 I0;
    public lo7 J0;
    public final ConcurrentHashMap K0;
    public pm7 L0;
    public final Lazy X;
    public final Lazy Y;
    public final Lazy Z;
    public final long b;
    public final kfg c;
    public final Long o;
    public final String v;
    public final Lazy v0;
    public final r10 w;
    public final Lazy w0;
    public final x23 x;
    public final Lazy x0;
    public final e24 y;
    public tfg y0;
    public final er6 z;
    public final wie z0 = o5a.U();

    /* JADX WARNING: type inference failed for: r7v0, types: [r10, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r6v4, types: [tgg, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r6v7, types: [kotlin.coroutines.jvm.internal.SuspendLambda, kotlin.jvm.functions.Function2] */
    /* JADX WARNING: type inference failed for: r5v5, types: [kotlin.coroutines.jvm.internal.SuspendLambda, kotlin.jvm.functions.Function4] */
    public hjg(long j, kfg kfg, Long l, String str) {
        long j2 = j;
        xfg xfg = xfg.a;
        Class<x23> cls = x23.class;
        long s = ((qjd) ((x23) xfg.getAccessor().g(cls))).s();
        bud bud = (bud) xfg.getAccessor().g(bud.class);
        ? obj = new Object();
        obj.a = j2;
        obj.b = s;
        obj.c = (Context) xfg.getAccessor().g(Context.class);
        obj.d = LazyKt.lazy(new plg(obj, bud, 0));
        obj.e = LazyKt.lazy(new plg(obj, bud, 1));
        po7 po7 = (po7) xfg.getAccessor().g(po7.class);
        Lazy h = xfg.getAccessor().h(gaf.class);
        Lazy h2 = xfg.getAccessor().h(qx2.class);
        Lazy h3 = xfg.getAccessor().h(eu3.class);
        Lazy h4 = xfg.getAccessor().h(sfg.class);
        Lazy h5 = xfg.getAccessor().h(uk5.class);
        Lazy h6 = xfg.getAccessor().h(vfg.class);
        this.b = j2;
        this.c = kfg;
        this.o = l;
        this.v = str;
        this.w = obj;
        this.x = (x23) xfg.getAccessor().g(cls);
        this.y = (e24) xfg.getAccessor().g(e24.class);
        this.z = (er6) xfg.getAccessor().g(er6.class);
        this.X = h;
        this.Y = h2;
        this.Z = h3;
        this.v0 = h4;
        this.w0 = h5;
        this.x0 = LazyKt.lazy(LazyThreadSafetyMode.NONE, new a2d(12, h6));
        jx3 jx3 = this.a;
        Iterable iterable = po7.b;
        ? obj2 = new Object();
        obj2.a = jx3;
        obj2.b = (gaf) po7.a.getValue();
        obj2.c = iterable;
        obj2.o = o54.a(0, 7, (cu0) null);
        Iterable<xo7> iterable2 = iterable;
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(iterable2, 10));
        for (xo7 b2 : iterable2) {
            arrayList.add(bs0.Q(b2.b()));
        }
        int i = vu5.a;
        bs0.K(bs0.F(new ps5(new g12(arrayList, EmptyCoroutineContext.INSTANCE, -2, cu0.a, 1), new qo7(obj2, (Continuation) null), 5), ((osa) ((gaf) obj2.b)).b()), (d14) obj2.a);
        this.A0 = obj2;
        xme a = f6e.a(h7b.a);
        this.B0 = a;
        Boolean bool = Boolean.FALSE;
        xme a2 = f6e.a(bool);
        this.C0 = a2;
        this.D0 = f6e.a(bool);
        bs5 w2 = bs0.w(new i21(bs0.L(a, new SuspendLambda(2, (Continuation<Object>) null)), a2, new t86(3, (Continuation) null, 4), 4));
        kyd kyd = new kyd(new on2(((eu3) h3.getValue()).c(j2), 28), 12);
        xme a3 = f6e.a("");
        this.E0 = a3;
        bs5 w3 = bs0.w(bs0.u(a3, kyd, w2, new SuspendLambda(4, (Continuation<Object>) null)));
        mjg mjg = new mjg("", false, kjg.a);
        this.H0 = bs0.X(w3, this.a, z6e.a, mjg);
        this.I0 = new s85(0);
        this.K0 = new ConcurrentHashMap();
        xag.g(this, (CoroutineContext) null, (f14) null, new uig(this, (Continuation) null), 3);
        xag.g(this, ((osa) ((gaf) h.getValue())).a(), (f14) null, new bjg(this, (Continuation) null), 2);
    }

    /* JADX WARNING: type inference failed for: r8v26, types: [lo7] */
    /* JADX WARNING: type inference failed for: r8v27, types: [lo7] */
    /* JADX WARNING: type inference failed for: r8v28, types: [lo7] */
    /* JADX WARNING: type inference failed for: r8v30, types: [lo7] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0060  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00a6  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00af  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00fb  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0104  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x014b  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x0151  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x0196  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x019e  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0029  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object j(defpackage.hjg r8, defpackage.ywe r9, kotlin.coroutines.Continuation r10) {
        /*
            r8.getClass()
            boolean r0 = r10 instanceof defpackage.cjg
            if (r0 == 0) goto L_0x0016
            r0 = r10
            cjg r0 = (defpackage.cjg) r0
            int r1 = r0.o
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0016
            int r1 = r1 - r2
            r0.o = r1
            goto L_0x001b
        L_0x0016:
            cjg r0 = new cjg
            r0.<init>(r8, r10)
        L_0x001b:
            java.lang.Object r10 = r0.b
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.o
            r3 = 4
            r4 = 3
            r5 = 2
            r6 = 1
            if (r2 == 0) goto L_0x0060
            if (r2 == r6) goto L_0x0057
            if (r2 == r5) goto L_0x004d
            if (r2 == r4) goto L_0x0043
            if (r2 != r3) goto L_0x003b
            lo7 r8 = r0.a
            r9 = r8
            ywe r9 = (defpackage.ywe) r9
            kotlin.ResultKt.throwOnFailure(r10)
            goto L_0x018e
        L_0x003b:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L_0x0043:
            lo7 r8 = r0.a
            r9 = r8
            ywe r9 = (defpackage.ywe) r9
            kotlin.ResultKt.throwOnFailure(r10)
            goto L_0x0147
        L_0x004d:
            lo7 r8 = r0.a
            r9 = r8
            ywe r9 = (defpackage.ywe) r9
            kotlin.ResultKt.throwOnFailure(r10)
            goto L_0x00f3
        L_0x0057:
            lo7 r8 = r0.a
            r9 = r8
            ywe r9 = (defpackage.ywe) r9
            kotlin.ResultKt.throwOnFailure(r10)
            goto L_0x009e
        L_0x0060:
            kotlin.ResultKt.throwOnFailure(r10)
            boolean r10 = r9 instanceof defpackage.xwe
            r10 r2 = r8.w
            r7 = 0
            if (r10 == 0) goto L_0x00bd
            r10 = r9
            xwe r10 = (defpackage.xwe) r10
            java.lang.String r3 = r10.c
            java.lang.String r8 = r8.G0
            if (r8 == 0) goto L_0x0077
            boolean r7 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r3, (java.lang.Object) r8)
        L_0x0077:
            boolean r8 = r10.f
            if (r7 != 0) goto L_0x0087
            bkg r9 = new bkg
            r9.<init>(r8)
            r10.b(r9)
            kotlin.Unit r1 = kotlin.Unit.INSTANCE
            goto L_0x01aa
        L_0x0087:
            olg r8 = r2.b(r8)
            r2 = r9
            lo7 r2 = (defpackage.lo7) r2
            r0.a = r2
            r0.o = r6
            java.lang.String r0 = r10.d
            java.lang.String r10 = r10.e
            java.lang.Boolean r10 = r8.a(r0, r10)
            if (r10 != r1) goto L_0x009e
            goto L_0x01aa
        L_0x009e:
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            boolean r8 = r10.booleanValue()
            if (r8 == 0) goto L_0x00af
            xwe r9 = (defpackage.xwe) r9
            kotlin.Unit r8 = kotlin.Unit.INSTANCE
            r9.a(r8)
            goto L_0x01a8
        L_0x00af:
            xwe r9 = (defpackage.xwe) r9
            ekg r8 = new ekg
            boolean r10 = r9.f
            r8.<init>(r10)
            r9.b(r8)
            goto L_0x01a8
        L_0x00bd:
            boolean r10 = r9 instanceof defpackage.wwe
            if (r10 == 0) goto L_0x0112
            r10 = r9
            wwe r10 = (defpackage.wwe) r10
            java.lang.String r3 = r10.c
            java.lang.String r8 = r8.G0
            if (r8 == 0) goto L_0x00ce
            boolean r7 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r3, (java.lang.Object) r8)
        L_0x00ce:
            boolean r8 = r10.e
            if (r7 != 0) goto L_0x00de
            bkg r9 = new bkg
            r9.<init>(r8)
            r10.b(r9)
            kotlin.Unit r1 = kotlin.Unit.INSTANCE
            goto L_0x01aa
        L_0x00de:
            olg r8 = r2.b(r8)
            r2 = r9
            lo7 r2 = (defpackage.lo7) r2
            r0.a = r2
            r0.o = r5
            java.lang.String r10 = r10.d
            java.lang.Boolean r10 = r8.remove(r10)
            if (r10 != r1) goto L_0x00f3
            goto L_0x01aa
        L_0x00f3:
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            boolean r8 = r10.booleanValue()
            if (r8 == 0) goto L_0x0104
            wwe r9 = (defpackage.wwe) r9
            kotlin.Unit r8 = kotlin.Unit.INSTANCE
            r9.a(r8)
            goto L_0x01a8
        L_0x0104:
            wwe r9 = (defpackage.wwe) r9
            bkg r8 = new bkg
            boolean r10 = r9.e
            r8.<init>(r10)
            r9.b(r8)
            goto L_0x01a8
        L_0x0112:
            boolean r10 = r9 instanceof defpackage.vwe
            if (r10 == 0) goto L_0x015c
            r10 = r9
            vwe r10 = (defpackage.vwe) r10
            java.lang.String r3 = r10.c
            java.lang.String r8 = r8.G0
            if (r8 == 0) goto L_0x0123
            boolean r7 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r3, (java.lang.Object) r8)
        L_0x0123:
            if (r7 != 0) goto L_0x0131
            akg r8 = new akg
            r8.<init>()
            r10.b(r8)
            kotlin.Unit r1 = kotlin.Unit.INSTANCE
            goto L_0x01aa
        L_0x0131:
            boolean r8 = r10.e
            olg r8 = r2.b(r8)
            r2 = r9
            lo7 r2 = (defpackage.lo7) r2
            r0.a = r2
            r0.o = r4
            java.lang.String r10 = r10.d
            java.lang.String r10 = r8.get(r10)
            if (r10 != r1) goto L_0x0147
            goto L_0x01aa
        L_0x0147:
            java.lang.String r10 = (java.lang.String) r10
            if (r10 == 0) goto L_0x0151
            vwe r9 = (defpackage.vwe) r9
            r9.a(r10)
            goto L_0x01a8
        L_0x0151:
            vwe r9 = (defpackage.vwe) r9
            akg r8 = new akg
            r8.<init>()
            r9.b(r8)
            goto L_0x01a8
        L_0x015c:
            boolean r10 = r9 instanceof defpackage.uwe
            if (r10 == 0) goto L_0x01ab
            r10 = r9
            uwe r10 = (defpackage.uwe) r10
            java.lang.String r4 = r10.c
            java.lang.String r8 = r8.G0
            if (r8 == 0) goto L_0x016d
            boolean r7 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r4, (java.lang.Object) r8)
        L_0x016d:
            if (r7 != 0) goto L_0x017a
            akg r8 = new akg
            r8.<init>()
            r10.b(r8)
            kotlin.Unit r1 = kotlin.Unit.INSTANCE
            goto L_0x01aa
        L_0x017a:
            boolean r8 = r10.d
            olg r8 = r2.b(r8)
            r10 = r9
            lo7 r10 = (defpackage.lo7) r10
            r0.a = r10
            r0.o = r3
            java.lang.Boolean r10 = r8.clear()
            if (r10 != r1) goto L_0x018e
            goto L_0x01aa
        L_0x018e:
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            boolean r8 = r10.booleanValue()
            if (r8 == 0) goto L_0x019e
            uwe r9 = (defpackage.uwe) r9
            kotlin.Unit r8 = kotlin.Unit.INSTANCE
            r9.a(r8)
            goto L_0x01a8
        L_0x019e:
            uwe r9 = (defpackage.uwe) r9
            akg r8 = new akg
            r8.<init>()
            r9.b(r8)
        L_0x01a8:
            kotlin.Unit r1 = kotlin.Unit.INSTANCE
        L_0x01aa:
            return r1
        L_0x01ab:
            kotlin.NoWhenBranchMatchedException r8 = new kotlin.NoWhenBranchMatchedException
            r8.<init>()
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hjg.j(hjg, ywe, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0036  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0026  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object k(defpackage.hjg r4, defpackage.lo7 r5, kotlin.coroutines.Continuation r6) {
        /*
            r4.getClass()
            boolean r0 = r6 instanceof defpackage.djg
            if (r0 == 0) goto L_0x0016
            r0 = r6
            djg r0 = (defpackage.djg) r0
            int r1 = r0.o
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0016
            int r1 = r1 - r2
            r0.o = r1
            goto L_0x001b
        L_0x0016:
            djg r0 = new djg
            r0.<init>(r4, r6)
        L_0x001b:
            java.lang.Object r6 = r0.b
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.o
            r3 = 1
            if (r2 == 0) goto L_0x0036
            if (r2 != r3) goto L_0x002e
            hjg r4 = r0.a
            kotlin.ResultKt.throwOnFailure(r6)
            goto L_0x0054
        L_0x002e:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L_0x0036:
            kotlin.ResultKt.throwOnFailure(r6)
            lo7 r6 = r4.J0
            if (r6 == 0) goto L_0x0045
            v0 r2 = new v0
            r2.<init>()
            r6.b(r2)
        L_0x0045:
            r4.J0 = r5
            r0.a = r4
            r0.o = r3
            xme r5 = r4.E0
            java.lang.Object r6 = defpackage.bs0.z(r5, r0)
            if (r6 != r1) goto L_0x0054
            goto L_0x0062
        L_0x0054:
            java.lang.String r6 = (java.lang.String) r6
            s85 r4 = r4.I0
            qig r5 = new qig
            r5.<init>(r6)
            defpackage.xag.h(r4, r5)
            kotlin.Unit r1 = kotlin.Unit.INSTANCE
        L_0x0062:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hjg.k(hjg, lo7, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final void i() {
        zgg zgg = (zgg) this.x0.getValue();
        ((sv0) zgg.a.getValue()).f(zgg);
        this.y0 = null;
        for (xo7 d : (List) this.A0.c) {
            d.d((tfg) null);
        }
    }

    public final void l(boolean z2) {
        lo7 lo7 = this.J0;
        if (lo7 != null) {
            if (z2) {
                eu3 eu3 = (eu3) this.Z.getValue();
                vk3 r = eu3.a.r();
                if (r == null) {
                    r = eu3.a(((Number) eu3.b.getValue()).longValue());
                }
                lo7.a(String.valueOf(r.s()));
                return;
            }
            lo7.b(new Throwable());
        }
    }
}
