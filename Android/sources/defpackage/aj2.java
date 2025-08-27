package defpackage;

import android.content.Context;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Lazy;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;

/* renamed from: aj2  reason: default package */
public final class aj2 extends xag implements ps8 {
    public static final /* synthetic */ KProperty[] b1;
    public final Lazy A0;
    public final Lazy B0;
    public final Lazy C0;
    public ek9 D0;
    public final Set E0;
    public final Set F0;
    public final AtomicReference G0;
    public final AtomicReference H0;
    public final AtomicReference I0;
    public final AtomicReference J0;
    public final AtomicLong K0;
    public final s85 L0;
    public final s85 M0;
    public final xme N0;
    public final etc O0;
    public final xme P0;
    public final etc Q0;
    public final xme R0;
    public final etc S0;
    public final xme T0;
    public final etc U0;
    public final n6e V0;
    public final dtc W0;
    public final rl X;
    public final wie X0;
    public final cj9 Y;
    public final wie Y0;
    public final String Z = aj2.class.getName();
    public final wie Z0;
    public final wie a1;
    public final long b;
    public final String c;
    public final long o;
    public final boolean v;
    public final Lazy v0;
    public final boolean w;
    public final Lazy w0;
    public final Context x;
    public final Lazy x0;
    public final to9 y;
    public final Lazy y0;
    public final gaf z;
    public final Lazy z0;

    static {
        Class<aj2> cls = aj2.class;
        b1 = new KProperty[]{rae.s(cls, "videoFetchJob", "getVideoFetchJob()Lkotlinx/coroutines/Job;", 0), rae.s(cls, "newPageJob", "getNewPageJob()Lkotlinx/coroutines/Job;", 0), rae.s(cls, "actionJob", "getActionJob()Lkotlinx/coroutines/Job;", 0), rae.s(cls, "loadFrameJob", "getLoadFrameJob()Lkotlinx/coroutines/Job;", 0)};
    }

    public aj2(Lazy lazy, Lazy lazy2, Lazy lazy3, Lazy lazy4, Lazy lazy5, Lazy lazy6, Lazy lazy7, Lazy lazy8, Lazy lazy9, long j, String str, long j2, boolean z2, boolean z3, Context context, to9 to9, gaf gaf, rl rlVar, cj9 cj9) {
        gaf gaf2 = gaf;
        cj9 cj92 = cj9;
        this.b = j;
        this.c = str;
        this.o = j2;
        this.v = z2;
        this.w = z3;
        this.x = context;
        this.y = to9;
        this.z = gaf2;
        this.X = rlVar;
        this.Y = cj92;
        this.v0 = lazy;
        this.w0 = lazy3;
        this.x0 = lazy4;
        this.y0 = lazy5;
        this.z0 = lazy6;
        this.A0 = lazy7;
        this.B0 = lazy8;
        this.C0 = lazy9;
        b10 b10 = b10.PHOTO;
        b10 b102 = b10.VIDEO;
        this.E0 = SetsKt.setOf("PHOTO", "VIDEO");
        this.F0 = SetsKt.setOf(b10, b102);
        this.G0 = new AtomicReference((Object) null);
        this.H0 = new AtomicReference(new zh2(false, false));
        this.I0 = new AtomicReference((Object) null);
        this.J0 = new AtomicReference((Object) null);
        this.K0 = new AtomicLong();
        this.L0 = new s85(0);
        this.M0 = new s85(0);
        xme a = f6e.a(ai2.c);
        this.N0 = a;
        this.O0 = new etc(a);
        xme a2 = f6e.a(new yh2("", "", "", new xh2((de6) null, false, false, 7)));
        this.P0 = a2;
        this.Q0 = new etc(a2);
        xme a3 = f6e.a(new bi2((ngf) null));
        this.R0 = a3;
        this.S0 = new etc(a3);
        xme a4 = f6e.a(new ci2((fr8) null, 3));
        this.T0 = a4;
        this.U0 = new etc(a4);
        n6e a5 = m5a.a(1, 0, cu0.b);
        this.V0 = a5;
        this.W0 = new dtc(a5);
        this.X0 = o5a.U();
        this.Y0 = o5a.U();
        this.Z0 = o5a.U();
        this.a1 = o5a.U();
        osa osa = (osa) gaf2;
        Lazy lazy10 = lazy2;
        xag.g(this, osa.b(), (f14) null, new vh2(this, lazy2, (Continuation) null), 2);
        bs0.K(bs0.F(new ps5(cj92.e, new wh2(this, (Continuation) null), 5), osa.b()), this.a);
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x003e  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0085  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x008f  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0028  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object j(defpackage.aj2 r6, java.util.List r7, kotlin.coroutines.Continuation r8) {
        /*
            r6.getClass()
            boolean r0 = r8 instanceof defpackage.di2
            if (r0 == 0) goto L_0x0016
            r0 = r8
            di2 r0 = (defpackage.di2) r0
            int r1 = r0.o
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0016
            int r1 = r1 - r2
            r0.o = r1
            goto L_0x001b
        L_0x0016:
            di2 r0 = new di2
            r0.<init>(r6, r8)
        L_0x001b:
            java.lang.Object r8 = r0.b
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.o
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L_0x003e
            if (r2 == r4) goto L_0x0038
            if (r2 != r3) goto L_0x0030
            kotlin.ResultKt.throwOnFailure(r8)
            goto L_0x009a
        L_0x0030:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x0038:
            aj2 r6 = r0.a
            kotlin.ResultKt.throwOnFailure(r8)
            goto L_0x007f
        L_0x003e:
            kotlin.ResultKt.throwOnFailure(r8)
            xme r8 = r6.N0
            java.lang.Object r8 = r8.getValue()
            ai2 r8 = (defpackage.ai2) r8
            java.util.List r8 = r8.a
            r2 = r8
            java.util.Collection r2 = (java.util.Collection) r2
            boolean r2 = r2.isEmpty()
            r2 = r2 ^ r4
            if (r2 == 0) goto L_0x009a
            int r2 = r7.size()
            int r8 = r8.size()
            if (r2 == r8) goto L_0x009a
            java.lang.String r8 = r6.Z
            java.lang.String r2 = "Media viewer. Items count changed. Try request new totalCount"
            defpackage.z68.c(r8, r2, new java.lang.Object[0])
            java.lang.Object r7 = kotlin.collections.CollectionsKt.firstOrNull(r7)
            hr8 r7 = (defpackage.hr8) r7
            if (r7 == 0) goto L_0x0082
            long r7 = r7.m()
            r0.a = r6
            r0.o = r4
            to9 r2 = r6.y
            java.lang.Object r8 = r2.a(r7, r0)
            if (r8 != r1) goto L_0x007f
            goto L_0x009c
        L_0x007f:
            ha9 r8 = (defpackage.ha9) r8
            goto L_0x0083
        L_0x0082:
            r8 = r5
        L_0x0083:
            if (r8 != 0) goto L_0x008f
            java.lang.String r6 = r6.Z
            java.lang.String r7 = "Media viewer. Items count changed. Can't request new totalCount, msg is null"
            defpackage.z68.p(r6, r7)
            kotlin.Unit r1 = kotlin.Unit.INSTANCE
            goto L_0x009c
        L_0x008f:
            r0.a = r5
            r0.o = r3
            java.lang.Object r6 = r6.A(r8, r0)
            if (r6 != r1) goto L_0x009a
            goto L_0x009c
        L_0x009a:
            kotlin.Unit r1 = kotlin.Unit.INSTANCE
        L_0x009c:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aj2.j(aj2, java.util.List, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0036  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x006c  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x012a A[EDGE_INSN: B:58:0x012a->B:55:0x012a ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0026  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object k(defpackage.aj2 r5, defpackage.fb9 r6, kotlin.coroutines.Continuation r7) {
        /*
            r5.getClass()
            boolean r0 = r7 instanceof defpackage.fi2
            if (r0 == 0) goto L_0x0016
            r0 = r7
            fi2 r0 = (defpackage.fi2) r0
            int r1 = r0.o
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0016
            int r1 = r1 - r2
            r0.o = r1
            goto L_0x001b
        L_0x0016:
            fi2 r0 = new fi2
            r0.<init>(r5, r7)
        L_0x001b:
            java.lang.Object r7 = r0.b
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.o
            r3 = 1
            if (r2 == 0) goto L_0x0036
            if (r2 != r3) goto L_0x002e
            aj2 r5 = r0.a
            kotlin.ResultKt.throwOnFailure(r7)
            goto L_0x004f
        L_0x002e:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x0036:
            kotlin.ResultKt.throwOnFailure(r7)
            boolean r7 = r6 instanceof defpackage.za9
            to9 r2 = r5.y
            if (r7 == 0) goto L_0x00a3
            za9 r6 = (defpackage.za9) r6
            java.util.Collection r6 = r6.a
            r0.a = r5
            r0.o = r3
            java.lang.Object r7 = r2.b(r6, r0)
            if (r7 != r1) goto L_0x004f
            goto L_0x012c
        L_0x004f:
            java.util.List r7 = (java.util.List) r7
            java.lang.Iterable r7 = (java.lang.Iterable) r7
            boolean r6 = r7 instanceof java.util.Collection
            if (r6 == 0) goto L_0x0062
            r6 = r7
            java.util.Collection r6 = (java.util.Collection) r6
            boolean r6 = r6.isEmpty()
            if (r6 == 0) goto L_0x0062
            goto L_0x012a
        L_0x0062:
            java.util.Iterator r6 = r7.iterator()
        L_0x0066:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L_0x012a
            java.lang.Object r7 = r6.next()
            ha9 r7 = (defpackage.ha9) r7
            boolean r0 = r7.o()
            if (r0 == 0) goto L_0x0066
            g20 r0 = defpackage.g20.c
            boolean r0 = r7.n(r0)
            if (r0 != 0) goto L_0x0088
            g20 r0 = defpackage.g20.o
            boolean r7 = r7.n(r0)
            if (r7 == 0) goto L_0x0066
        L_0x0088:
            java.lang.String r6 = r5.Z
            java.lang.String r7 = "Media viewer. On add new msg with media"
            defpackage.z68.c(r6, r7, new java.lang.Object[0])
            qx2 r6 = r5.q()
            gl1 r7 = new gl1
            r0 = 14
            r7.<init>(r0)
            my2 r6 = (defpackage.my2) r6
            long r0 = r5.b
            r6.h(r0, r7)
            goto L_0x012a
        L_0x00a3:
            boolean r7 = r6 instanceof defpackage.cb9
            if (r7 == 0) goto L_0x012a
            java.util.concurrent.atomic.AtomicReference r7 = r5.I0
            java.lang.Object r7 = r7.get()
            java.lang.String r7 = (java.lang.String) r7
            xme r0 = r5.N0
            java.lang.Object r0 = r0.getValue()
            ai2 r0 = (defpackage.ai2) r0
            java.util.List r0 = r0.a
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.Iterator r0 = r0.iterator()
        L_0x00bf:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x00d7
            java.lang.Object r1 = r0.next()
            r3 = r1
            hr8 r3 = (defpackage.hr8) r3
            java.lang.String r3 = r3.v()
            boolean r3 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r3, (java.lang.Object) r7)
            if (r3 == 0) goto L_0x00bf
            goto L_0x00d8
        L_0x00d7:
            r1 = 0
        L_0x00d8:
            hr8 r1 = (defpackage.hr8) r1
            if (r1 != 0) goto L_0x00df
            kotlin.Unit r1 = kotlin.Unit.INSTANCE
            goto L_0x012c
        L_0x00df:
            cb9 r6 = (defpackage.cb9) r6
            java.util.Collection r6 = r6.a
            long r3 = r1.m()
            java.lang.Long r7 = kotlin.coroutines.jvm.internal.Boxing.boxLong(r3)
            boolean r6 = r6.contains(r7)
            if (r6 == 0) goto L_0x0113
            h85 r6 = new h85
            boolean r7 = r1 instanceof defpackage.yq8
            if (r7 == 0) goto L_0x00fa
            int r7 = defpackage.dra.a
            goto L_0x0100
        L_0x00fa:
            boolean r7 = r1 instanceof defpackage.fr8
            if (r7 == 0) goto L_0x010d
            int r7 = defpackage.dra.b
        L_0x0100:
            java.lang.Integer r7 = kotlin.coroutines.jvm.internal.Boxing.boxInt(r7)
            r6.<init>(r7)
            s85 r5 = r5.L0
            defpackage.xag.h(r5, r6)
            goto L_0x012a
        L_0x010d:
            kotlin.NoWhenBranchMatchedException r5 = new kotlin.NoWhenBranchMatchedException
            r5.<init>()
            throw r5
        L_0x0113:
            ek9 r5 = r5.D0
            if (r5 == 0) goto L_0x012a
            long r6 = r1.m()
            z6d r0 = r2.a
            aj9 r0 = r0.d()
            long r6 = r0.k(r6)
            gx r5 = (defpackage.gx) r5
            r5.r(r6)
        L_0x012a:
            kotlin.Unit r1 = kotlin.Unit.INSTANCE
        L_0x012c:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aj2.k(aj2, fb9, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0043  */
    /* JADX WARNING: Removed duplicated region for block: B:42:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0027  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object l(defpackage.aj2 r9, int r10, java.util.List r11, kotlin.coroutines.Continuation r12) {
        /*
            r9.getClass()
            boolean r0 = r12 instanceof defpackage.ji2
            if (r0 == 0) goto L_0x0016
            r0 = r12
            ji2 r0 = (defpackage.ji2) r0
            int r1 = r0.v
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0016
            int r1 = r1 - r2
            r0.v = r1
            goto L_0x001b
        L_0x0016:
            ji2 r0 = new ji2
            r0.<init>(r9, r12)
        L_0x001b:
            java.lang.Object r12 = r0.c
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.v
            r3 = 1
            r4 = 2
            if (r2 == 0) goto L_0x0043
            if (r2 == r3) goto L_0x0038
            if (r2 != r4) goto L_0x0030
            kotlin.ResultKt.throwOnFailure(r12)
            goto L_0x00cd
        L_0x0030:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L_0x0038:
            hr8 r9 = r0.b
            aj2 r10 = r0.a
            kotlin.ResultKt.throwOnFailure(r12)
            r12 = r9
            r9 = r10
            goto L_0x00bf
        L_0x0043:
            kotlin.ResultKt.throwOnFailure(r12)
            java.util.concurrent.atomic.AtomicReference r12 = r9.I0
            java.lang.Object r12 = r12.get()
            java.lang.String r12 = (java.lang.String) r12
            xme r2 = r9.N0
            r5 = -1
            if (r12 == 0) goto L_0x007a
            java.lang.Object r6 = r2.getValue()
            ai2 r6 = (defpackage.ai2) r6
            java.util.List r6 = r6.a
            java.util.Iterator r6 = r6.iterator()
            r7 = 0
        L_0x0060:
            boolean r8 = r6.hasNext()
            if (r8 == 0) goto L_0x007a
            java.lang.Object r8 = r6.next()
            hr8 r8 = (defpackage.hr8) r8
            java.lang.String r8 = r8.v()
            boolean r8 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r8, (java.lang.Object) r12)
            if (r8 == 0) goto L_0x0077
            goto L_0x007b
        L_0x0077:
            int r7 = r7 + 1
            goto L_0x0060
        L_0x007a:
            r7 = r5
        L_0x007b:
            if (r10 < 0) goto L_0x007e
            goto L_0x009d
        L_0x007e:
            if (r7 < 0) goto L_0x009c
            java.lang.Object r10 = r2.getValue()
            ai2 r10 = (defpackage.ai2) r10
            java.util.List r10 = r10.a
            int r10 = r10.size()
            int r12 = r11.size()
            if (r10 >= r12) goto L_0x009a
            int r12 = r11.size()
            int r10 = r10 - r7
            int r10 = r12 - r10
            goto L_0x009d
        L_0x009a:
            r10 = r7
            goto L_0x009d
        L_0x009c:
            r10 = r5
        L_0x009d:
            if (r10 < 0) goto L_0x00cd
            r12 = r11
            java.util.Collection r12 = (java.util.Collection) r12
            int r12 = r12.size()
            if (r10 >= r12) goto L_0x00cd
            java.lang.Object r12 = r11.get(r10)
            hr8 r12 = (defpackage.hr8) r12
            int r11 = r11.size()
            r0.a = r9
            r0.b = r12
            r0.v = r3
            java.lang.Object r10 = r9.y(r10, r12, r11, r0)
            if (r10 != r1) goto L_0x00bf
            goto L_0x00cf
        L_0x00bf:
            r10 = 0
            r0.a = r10
            r0.b = r10
            r0.v = r4
            java.lang.Object r9 = r9.x(r12, r0)
            if (r9 != r1) goto L_0x00cd
            goto L_0x00cf
        L_0x00cd:
            kotlin.Unit r1 = kotlin.Unit.INSTANCE
        L_0x00cf:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aj2.l(aj2, int, java.util.List, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v9, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v4, resolved type: ha9} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x005b  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x00b3  */
    /* JADX WARNING: Removed duplicated region for block: B:31:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:32:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:33:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object m(defpackage.aj2 r10, defpackage.ha9 r11, kotlin.coroutines.Continuation r12) {
        /*
            r10.getClass()
            boolean r0 = r12 instanceof defpackage.li2
            if (r0 == 0) goto L_0x0016
            r0 = r12
            li2 r0 = (defpackage.li2) r0
            int r1 = r0.v
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0016
            int r1 = r1 - r2
            r0.v = r1
            goto L_0x001b
        L_0x0016:
            li2 r0 = new li2
            r0.<init>(r10, r12)
        L_0x001b:
            java.lang.Object r12 = r0.c
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.v
            r3 = 4
            r4 = 3
            r5 = 1
            r6 = 2
            r7 = 0
            if (r2 == 0) goto L_0x005b
            if (r2 == r5) goto L_0x0050
            if (r2 == r6) goto L_0x0049
            if (r2 == r4) goto L_0x003f
            if (r2 != r3) goto L_0x0037
            kotlin.ResultKt.throwOnFailure(r12)
            goto L_0x00c1
        L_0x0037:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L_0x003f:
            java.lang.Object r10 = r0.b
            hr8 r10 = (defpackage.hr8) r10
            aj2 r11 = r0.a
            kotlin.ResultKt.throwOnFailure(r12)
            goto L_0x00b4
        L_0x0049:
            aj2 r10 = r0.a
            kotlin.ResultKt.throwOnFailure(r12)
        L_0x004e:
            r11 = r10
            goto L_0x0088
        L_0x0050:
            java.lang.Object r10 = r0.b
            r11 = r10
            ha9 r11 = (defpackage.ha9) r11
            aj2 r10 = r0.a
            kotlin.ResultKt.throwOnFailure(r12)
            goto L_0x0071
        L_0x005b:
            kotlin.ResultKt.throwOnFailure(r12)
            qx2 r12 = r10.q()
            r0.a = r10
            r0.b = r11
            r0.v = r5
            long r8 = r10.b
            java.lang.Object r12 = r12.d(r8, r0)
            if (r12 != r1) goto L_0x0071
            goto L_0x00c3
        L_0x0071:
            a32 r12 = (defpackage.a32) r12
            kotlin.Lazy r2 = r10.w0
            java.lang.Object r2 = r2.getValue()
            msa r2 = (defpackage.msa) r2
            r0.a = r10
            r0.b = r7
            r0.v = r6
            java.lang.Object r12 = r2.g(r12, r11, r0)
            if (r12 != r1) goto L_0x004e
            goto L_0x00c3
        L_0x0088:
            one.me.messages.list.loader.MessageModel r12 = (one.me.messages.list.loader.MessageModel) r12
            java.util.List r10 = defpackage.le8.a(r12)
            xme r12 = r11.N0
            ai2 r2 = new ai2
            r5 = 0
            r2.<init>(r10, r6, r5)
            r12.getClass()
            r12.m(r7, r2)
            java.lang.Object r12 = kotlin.collections.CollectionsKt.first(r10)
            hr8 r12 = (defpackage.hr8) r12
            int r10 = r10.size()
            r0.a = r11
            r0.b = r12
            r0.v = r4
            java.lang.Object r10 = r11.y(r5, r12, r10, r0)
            if (r10 != r1) goto L_0x00b3
            goto L_0x00c3
        L_0x00b3:
            r10 = r12
        L_0x00b4:
            r0.a = r7
            r0.b = r7
            r0.v = r3
            java.lang.Object r10 = r11.x(r10, r0)
            if (r10 != r1) goto L_0x00c1
            goto L_0x00c3
        L_0x00c1:
            kotlin.Unit r1 = kotlin.Unit.INSTANCE
        L_0x00c3:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aj2.m(aj2, ha9, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public static final boolean n(aj2 aj2, os8 os8) {
        if (os8 != null) {
            if (os8.d == aj2.b) {
                Set<b10> set = os8.c;
                ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(set, 10));
                for (b10 obj : set) {
                    arrayList.add(obj.toString());
                }
                if (CollectionsKt.toHashSet(arrayList).containsAll(aj2.E0)) {
                    return true;
                }
            }
        } else {
            aj2.getClass();
        }
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x0057  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0088  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00d8  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x012c  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x0136  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x002c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A(defpackage.ha9 r20, kotlin.coroutines.Continuation r21) {
        /*
            r19 = this;
            r0 = r19
            r1 = r21
            r2 = 1
            boolean r3 = r1 instanceof defpackage.oi2
            if (r3 == 0) goto L_0x0019
            r3 = r1
            oi2 r3 = (defpackage.oi2) r3
            int r4 = r3.v
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r4 & r5
            if (r6 == 0) goto L_0x0019
            int r4 = r4 - r5
            r3.v = r4
        L_0x0017:
            r9 = r3
            goto L_0x001f
        L_0x0019:
            oi2 r3 = new oi2
            r3.<init>(r0, r1)
            goto L_0x0017
        L_0x001f:
            java.lang.Object r1 = r9.c
            java.lang.Object r3 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r4 = r9.v
            r10 = 0
            r5 = 3
            r6 = 2
            if (r4 == 0) goto L_0x0057
            if (r4 == r2) goto L_0x004d
            if (r4 == r6) goto L_0x0043
            if (r4 != r5) goto L_0x003b
            java.lang.Object r0 = r9.b
            aj2 r2 = r9.a
            kotlin.ResultKt.throwOnFailure(r1)
            goto L_0x0125
        L_0x003b:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x0043:
            aj2 r4 = r9.a
            kotlin.ResultKt.throwOnFailure(r1)     // Catch:{ all -> 0x004a }
            goto L_0x00bf
        L_0x004a:
            r0 = move-exception
            goto L_0x00c7
        L_0x004d:
            java.lang.Object r0 = r9.b
            ha9 r0 = (defpackage.ha9) r0
            aj2 r4 = r9.a
            kotlin.ResultKt.throwOnFailure(r1)
            goto L_0x0074
        L_0x0057:
            kotlin.ResultKt.throwOnFailure(r1)
            qx2 r1 = r19.q()
            long r7 = r0.b
            r9.a = r0
            r4 = r20
            r9.b = r4
            r9.v = r2
            java.lang.Object r1 = r1.d(r7, r9)
            if (r1 != r3) goto L_0x006f
            return r3
        L_0x006f:
            r18 = r4
            r4 = r0
            r0 = r18
        L_0x0074:
            a32 r1 = (defpackage.a32) r1
            long r7 = r0.c
            r11 = 0
            int r7 = (r7 > r11 ? 1 : (r7 == r11 ? 0 : -1))
            if (r7 == 0) goto L_0x0136
            m72 r7 = r1.b
            long r7 = r7.a
            int r7 = (r7 > r11 ? 1 : (r7 == r11 ? 0 : -1))
            if (r7 != 0) goto L_0x0088
            goto L_0x0136
        L_0x0088:
            java.lang.String r7 = r4.Z
            java.lang.String r8 = "Media viewer. Start request media total count."
            defpackage.z68.c(r7, r8, new java.lang.Object[0])
            yt r7 = new yt
            m72 r1 = r1.b
            long r12 = r1.a
            long r0 = r0.c
            java.lang.Long r14 = kotlin.coroutines.jvm.internal.Boxing.boxLong(r0)
            java.util.Set r15 = r4.F0
            java.lang.Integer r16 = kotlin.coroutines.jvm.internal.Boxing.boxInt(r2)
            java.lang.Integer r17 = kotlin.coroutines.jvm.internal.Boxing.boxInt(r2)
            r11 = r7
            r11.<init>((long) r12, (java.lang.Long) r14, (java.util.Set) r15, (java.lang.Integer) r16, (java.lang.Integer) r17)
            kotlin.Result$Companion r0 = kotlin.Result.Companion     // Catch:{ all -> 0x004a }
            pi2 r0 = new pi2     // Catch:{ all -> 0x004a }
            r0.<init>(r4, r7, r10)     // Catch:{ all -> 0x004a }
            r9.a = r4     // Catch:{ all -> 0x004a }
            r9.b = r10     // Catch:{ all -> 0x004a }
            r9.v = r6     // Catch:{ all -> 0x004a }
            r6 = 500(0x1f4, double:2.47E-321)
            java.lang.Object r1 = defpackage.okf.c(r6, r0, r9)     // Catch:{ all -> 0x004a }
            if (r1 != r3) goto L_0x00bf
            return r3
        L_0x00bf:
            bd2 r1 = (defpackage.bd2) r1     // Catch:{ all -> 0x004a }
            java.lang.Object r0 = kotlin.Result.m23constructorimpl(r1)     // Catch:{ all -> 0x004a }
        L_0x00c5:
            r1 = r4
            goto L_0x00d2
        L_0x00c7:
            kotlin.Result$Companion r1 = kotlin.Result.Companion
            java.lang.Object r0 = kotlin.ResultKt.createFailure(r0)
            java.lang.Object r0 = kotlin.Result.m23constructorimpl(r0)
            goto L_0x00c5
        L_0x00d2:
            boolean r4 = kotlin.Result.m30isSuccessimpl(r0)
            if (r4 == 0) goto L_0x0126
            r4 = r0
            bd2 r4 = (defpackage.bd2) r4
            java.lang.String r6 = r1.Z
            a67 r7 = defpackage.z68.b
            if (r7 != 0) goto L_0x00e2
            goto L_0x00fb
        L_0x00e2:
            boolean r8 = r7.c()
            if (r8 == 0) goto L_0x00fb
            w78 r8 = defpackage.w78.o
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            java.lang.String r12 = "Media viewer. Success request media total count: "
            r11.<init>(r12)
            r11.append(r4)
            java.lang.String r11 = r11.toString()
            r7.d(r8, r6, r11, r10)
        L_0x00fb:
            if (r4 == 0) goto L_0x0126
            java.util.concurrent.atomic.AtomicReference r6 = r1.J0
            n01 r7 = new n01
            r7.<init>(r2, r4)
            r6.updateAndGet(r7)
            qx2 r2 = r1.q()
            long r6 = r1.b
            java.util.Set r8 = r1.F0
            int r11 = r4.v
            r9.a = r1
            r9.b = r0
            r9.v = r5
            r4 = r2
            my2 r4 = (defpackage.my2) r4
            r5 = r6
            r7 = r8
            r8 = r11
            java.lang.Object r2 = r4.v(r5, r7, r8, r9)
            if (r2 != r3) goto L_0x0124
            return r3
        L_0x0124:
            r2 = r1
        L_0x0125:
            r1 = r2
        L_0x0126:
            java.lang.Throwable r0 = kotlin.Result.m26exceptionOrNullimpl(r0)
            if (r0 == 0) goto L_0x0133
            java.lang.String r0 = r1.Z
            java.lang.String r1 = "Media viewer. Fail request media total count."
            defpackage.z68.f(r0, r1, r10)
        L_0x0133:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        L_0x0136:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aj2.A(ha9, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final os8 d() {
        os8 os8 = (os8) this.G0.get();
        return os8 == null ? new os8(0, 0, this.F0, this.b) : os8;
    }

    public final void i() {
        ek9 ek9 = this.D0;
        if (ek9 != null) {
            ((gx) ek9).h();
        }
        cj9 cj9 = this.Y;
        cj9.a.f(cj9);
    }

    public final void o(long j, String str) {
        String str2 = this.Z;
        a67 a67 = z68.b;
        if (a67 != null && a67.c()) {
            w78 w78 = w78.o;
            a67.d(w78, str2, "Media viewer. Call fetch video msg:" + j + ", attach:" + str, (Throwable) null);
        }
        this.X0.setValue(this, b1[0], ev0.u(this.a, ((osa) this.z).b(), f14.b, new ei2(this, j, str, (Continuation) null)));
    }

    public final qx2 q() {
        return (qx2) this.v0.getValue();
    }

    public final hr8 r() {
        Object obj;
        String str = (String) this.I0.get();
        Iterator it = ((ai2) this.N0.getValue()).a.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (Intrinsics.areEqual((Object) ((hr8) obj).v(), (Object) str)) {
                break;
            }
        }
        return (hr8) obj;
    }

    public final hr8 t(long j, String str) {
        Object obj;
        Iterator it = ((ai2) this.O0.a.getValue()).a.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            hr8 hr8 = (hr8) obj;
            if (hr8.m() == j && Intrinsics.areEqual((Object) str, (Object) hr8.v())) {
                break;
            }
        }
        return (hr8) obj;
    }

    public final void u(long j, String str) {
        hr8 r = r();
        if (r != null && r.m() == j && Intrinsics.areEqual((Object) r.v(), (Object) str)) {
            xag.h(this.L0, new i85(m09.v, false));
        }
    }

    public final void v(long j, String str) {
        hr8 r = r();
        if (r != null && r.m() == j && Intrinsics.areEqual((Object) r.v(), (Object) str)) {
            xag.h(this.L0, new i85(m09.o, false));
        }
    }

    public final void w(long j, String str) {
        hr8 r = r();
        if (r != null && r.m() == j && Intrinsics.areEqual((Object) r.v(), (Object) str)) {
            xag.h(this.L0, new i85(m09.a, false));
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x003e  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0057  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x005a  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0078  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x007b  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object x(defpackage.hr8 r10, kotlin.coroutines.Continuation r11) {
        /*
            r9 = this;
            boolean r0 = r11 instanceof defpackage.ki2
            if (r0 == 0) goto L_0x0013
            r0 = r11
            ki2 r0 = (defpackage.ki2) r0
            int r1 = r0.v
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.v = r1
            goto L_0x0018
        L_0x0013:
            ki2 r0 = new ki2
            r0.<init>(r9, r11)
        L_0x0018:
            java.lang.Object r11 = r0.c
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.v
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L_0x003e
            if (r2 == r4) goto L_0x0038
            if (r2 != r3) goto L_0x0030
            ha9 r9 = r0.b
            aj2 r10 = r0.a
            kotlin.ResultKt.throwOnFailure(r11)
            goto L_0x0074
        L_0x0030:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L_0x0038:
            aj2 r9 = r0.a
            kotlin.ResultKt.throwOnFailure(r11)
            goto L_0x0052
        L_0x003e:
            kotlin.ResultKt.throwOnFailure(r11)
            to9 r11 = r9.y
            long r5 = r10.m()
            r0.a = r9
            r0.v = r4
            java.lang.Object r11 = r11.a(r5, r0)
            if (r11 != r1) goto L_0x0052
            return r1
        L_0x0052:
            r10 = r11
            ha9 r10 = (defpackage.ha9) r10
            if (r10 != 0) goto L_0x005a
            kotlin.Unit r9 = kotlin.Unit.INSTANCE
            return r9
        L_0x005a:
            kotlin.Lazy r11 = r9.x0
            java.lang.Object r11 = r11.getValue()
            eu3 r11 = (defpackage.eu3) r11
            long r4 = r10.w
            r0.a = r9
            r0.b = r10
            r0.v = r3
            java.lang.Object r11 = r11.b(r4, r0)
            if (r11 != r1) goto L_0x0071
            return r1
        L_0x0071:
            r8 = r10
            r10 = r9
            r9 = r8
        L_0x0074:
            vk3 r11 = (defpackage.vk3) r11
            if (r11 != 0) goto L_0x007b
            kotlin.Unit r9 = kotlin.Unit.INSTANCE
            return r9
        L_0x007b:
            xme r0 = r10.P0
            yh2 r1 = new yh2
            java.lang.String r11 = r11.f()
            if (r11 != 0) goto L_0x0087
            java.lang.String r11 = ""
        L_0x0087:
            kotlin.Lazy r2 = r10.y0
            java.lang.Object r2 = r2.getValue()
            yva r2 = (defpackage.yva) r2
            long r3 = r9.o
            a33 r5 = r2.c
            long r5 = r5.m()
            p01 r5 = defpackage.j4b.z(r3, r5)
            int r5 = r5.b
            int r5 = defpackage.tr1.y(r5)
            switch(r5) {
                case 0: goto L_0x0116;
                case 1: goto L_0x0116;
                case 2: goto L_0x0116;
                case 3: goto L_0x00fd;
                case 4: goto L_0x00d8;
                case 5: goto L_0x00d8;
                case 6: goto L_0x00d8;
                case 7: goto L_0x00b3;
                case 8: goto L_0x00d8;
                case 9: goto L_0x00aa;
                default: goto L_0x00a4;
            }
        L_0x00a4:
            java.lang.IncompatibleClassChangeError r9 = new java.lang.IncompatibleClassChangeError
            r9.<init>()
            throw r9
        L_0x00aa:
            android.content.Context r2 = r2.a
            int r3 = defpackage.tmc.presence_unknown_date
            java.lang.String r2 = r2.getString(r3)
            goto L_0x0122
        L_0x00b3:
            a33 r2 = r2.c
            java.util.Locale r2 = r2.u()
            java.lang.String r5 = "dd MMM yyyy"
            monitor-enter(r5)
            java.text.SimpleDateFormat r6 = defpackage.j4b.r     // Catch:{ all -> 0x00d5 }
            if (r6 != 0) goto L_0x00c9
            java.text.SimpleDateFormat r6 = new java.text.SimpleDateFormat     // Catch:{ all -> 0x00d5 }
            java.lang.String r7 = "dd MMM yyyy"
            r6.<init>(r7, r2)     // Catch:{ all -> 0x00d5 }
            defpackage.j4b.r = r6     // Catch:{ all -> 0x00d5 }
        L_0x00c9:
            java.text.SimpleDateFormat r2 = defpackage.j4b.r     // Catch:{ all -> 0x00d5 }
            java.lang.Long r3 = java.lang.Long.valueOf(r3)     // Catch:{ all -> 0x00d5 }
            java.lang.String r2 = r2.format(r3)     // Catch:{ all -> 0x00d5 }
            monitor-exit(r5)     // Catch:{ all -> 0x00d5 }
            goto L_0x0122
        L_0x00d5:
            r9 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x00d5 }
            throw r9
        L_0x00d8:
            a33 r2 = r2.c
            java.util.Locale r2 = r2.u()
            java.lang.String r5 = "dd MMM"
            monitor-enter(r5)
            java.text.SimpleDateFormat r6 = defpackage.j4b.q     // Catch:{ all -> 0x00fa }
            if (r6 != 0) goto L_0x00ee
            java.text.SimpleDateFormat r6 = new java.text.SimpleDateFormat     // Catch:{ all -> 0x00fa }
            java.lang.String r7 = "dd MMM"
            r6.<init>(r7, r2)     // Catch:{ all -> 0x00fa }
            defpackage.j4b.q = r6     // Catch:{ all -> 0x00fa }
        L_0x00ee:
            java.text.SimpleDateFormat r2 = defpackage.j4b.q     // Catch:{ all -> 0x00fa }
            java.lang.Long r3 = java.lang.Long.valueOf(r3)     // Catch:{ all -> 0x00fa }
            java.lang.String r2 = r2.format(r3)     // Catch:{ all -> 0x00fa }
            monitor-exit(r5)     // Catch:{ all -> 0x00fa }
            goto L_0x0122
        L_0x00fa:
            r9 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x00fa }
            throw r9
        L_0x00fd:
            android.content.Context r5 = r2.a
            int r6 = defpackage.tmc.tt_dates_yesterday_format
            a33 r7 = r2.c
            java.util.Locale r7 = r7.u()
            android.content.Context r2 = r2.a
            java.lang.String r2 = defpackage.j4b.s(r2, r3, r7)
            java.lang.Object[] r2 = new java.lang.Object[]{r2}
            java.lang.String r2 = r5.getString(r6, r2)
            goto L_0x0122
        L_0x0116:
            a33 r5 = r2.c
            java.util.Locale r5 = r5.u()
            android.content.Context r2 = r2.a
            java.lang.String r2 = defpackage.j4b.s(r2, r3, r5)
        L_0x0122:
            kotlin.Lazy r3 = r10.y0
            java.lang.Object r3 = r3.getValue()
            yva r3 = (defpackage.yva) r3
            java.lang.String r4 = r9.y
            java.util.List r9 = r9.P0
            ogf r5 = defpackage.puf.D
            r5.getClass()
            uy4 r6 = defpackage.uy4.b
            long r5 = r5.g(r6)
            float r5 = defpackage.so4.e(r5)
            android.content.res.Resources r6 = defpackage.vo4.c()
            android.util.DisplayMetrics r6 = r6.getDisplayMetrics()
            float r6 = r6.density
            float r5 = r5 * r6
            int r5 = (int) r5
            java.lang.CharSequence r9 = r3.l(r5, r4, r9)
            if (r9 != 0) goto L_0x0151
            java.lang.String r9 = ""
        L_0x0151:
            xh2 r3 = new xh2
            kotlin.Lazy r10 = r10.C0
            java.lang.Object r10 = r10.getValue()
            uj5 r10 = (defpackage.uj5) r10
            vj5 r10 = (defpackage.vj5) r10
            r10.getClass()
            ru.ok.tamtam.android.prefs.PmsKey r4 = ru.ok.tamtam.android.prefs.PmsKey.f76mediaviewervideocollageenabled
            r5 = 0
            boolean r10 = r10.m(r4, r5)
            r4 = 3
            r6 = 0
            r3.<init>(r6, r5, r10, r4)
            r1.<init>(r11, r2, r9, r3)
            r0.getClass()
            r0.m(r6, r1)
            kotlin.Unit r9 = kotlin.Unit.INSTANCE
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aj2.x(hr8, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x003d  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00bf  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00cd  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x011d  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object y(int r10, defpackage.hr8 r11, int r12, kotlin.coroutines.Continuation r13) {
        /*
            r9 = this;
            boolean r0 = r13 instanceof defpackage.mi2
            if (r0 == 0) goto L_0x0013
            r0 = r13
            mi2 r0 = (defpackage.mi2) r0
            int r1 = r0.y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.y = r1
            goto L_0x0018
        L_0x0013:
            mi2 r0 = new mi2
            r0.<init>(r9, r13)
        L_0x0018:
            java.lang.Object r13 = r0.w
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.y
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L_0x003d
            if (r2 != r3) goto L_0x0035
            int r12 = r0.v
            int r10 = r0.o
            zh2 r9 = r0.c
            bd2 r11 = r0.b
            aj2 r0 = r0.a
            kotlin.ResultKt.throwOnFailure(r13)
            goto L_0x00b6
        L_0x0035:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L_0x003d:
            kotlin.ResultKt.throwOnFailure(r13)
            java.lang.String r13 = r9.Z
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r5 = "Media viewer. Prepare toolbar state by position:"
            r2.<init>(r5)
            r2.append(r10)
            java.lang.String r2 = r2.toString()
            defpackage.z68.c(r13, r2, new java.lang.Object[0])
            boolean r13 = r9.w
            if (r13 == 0) goto L_0x0084
            boolean r10 = r11 instanceof defpackage.yq8
            if (r10 == 0) goto L_0x0063
            int r10 = defpackage.dra.i
            igf r11 = new igf
            r11.<init>(r10)
            goto L_0x006e
        L_0x0063:
            boolean r10 = r11 instanceof defpackage.fr8
            if (r10 == 0) goto L_0x007e
            int r10 = defpackage.dra.j
            igf r11 = new igf
            r11.<init>(r10)
        L_0x006e:
            xme r9 = r9.R0
            bi2 r10 = new bi2
            r10.<init>(r11)
            r9.getClass()
            r9.m(r4, r10)
            kotlin.Unit r9 = kotlin.Unit.INSTANCE
            return r9
        L_0x007e:
            kotlin.NoWhenBranchMatchedException r9 = new kotlin.NoWhenBranchMatchedException
            r9.<init>()
            throw r9
        L_0x0084:
            java.util.concurrent.atomic.AtomicReference r11 = r9.J0
            java.lang.Object r11 = r11.get()
            bd2 r11 = (defpackage.bd2) r11
            java.util.concurrent.atomic.AtomicReference r13 = r9.H0
            java.lang.Object r13 = r13.get()
            zh2 r13 = (defpackage.zh2) r13
            if (r11 == 0) goto L_0x0099
            int r0 = r11.v
            goto L_0x00c7
        L_0x0099:
            qx2 r2 = r9.q()
            long r5 = r9.b
            r0.a = r9
            r0.b = r11
            r0.c = r13
            r0.o = r10
            r0.v = r12
            r0.y = r3
            java.lang.Object r0 = r2.d(r5, r0)
            if (r0 != r1) goto L_0x00b2
            return r1
        L_0x00b2:
            r8 = r0
            r0 = r9
            r9 = r13
            r13 = r8
        L_0x00b6:
            a32 r13 = (defpackage.a32) r13
            m72 r13 = r13.b
            z62 r13 = r13.r
            if (r13 == 0) goto L_0x00bf
            goto L_0x00c1
        L_0x00bf:
            z62 r13 = defpackage.z62.g
        L_0x00c1:
            int r13 = r13.b
            r8 = r13
            r13 = r9
            r9 = r0
            r0 = r8
        L_0x00c7:
            boolean r13 = r13.b
            java.lang.String r1 = ", pos:"
            if (r13 != 0) goto L_0x011d
            java.lang.String r13 = r9.Z
            a67 r2 = defpackage.z68.b
            if (r2 != 0) goto L_0x00d4
            goto L_0x00f3
        L_0x00d4:
            boolean r5 = r2.c()
            if (r5 == 0) goto L_0x00f3
            w78 r5 = defpackage.w78.o
            if (r11 == 0) goto L_0x00e0
            r11 = r3
            goto L_0x00e1
        L_0x00e0:
            r11 = 0
        L_0x00e1:
            java.lang.String r6 = "Media viewer. Prepare count for toolbar by server, total:"
            java.lang.String r7 = ", fromResp:"
            java.lang.StringBuilder r1 = defpackage.a81.n(r6, r0, r1, r10, r7)
            r1.append(r11)
            java.lang.String r11 = r1.toString()
            r2.d(r5, r13, r11, r4)
        L_0x00f3:
            int r11 = r0 - r12
            boolean r13 = r9.v
            if (r13 == 0) goto L_0x00fa
            goto L_0x00fe
        L_0x00fa:
            int r10 = r10 + 1
            int r10 = r12 - r10
        L_0x00fe:
            int r12 = r12 - r10
            int r12 = r12 + r11
            if (r12 >= r3) goto L_0x0103
            goto L_0x0108
        L_0x0103:
            if (r12 <= r0) goto L_0x0107
            r3 = r0
            goto L_0x0108
        L_0x0107:
            r3 = r12
        L_0x0108:
            android.content.Context r10 = r9.x
            int r11 = defpackage.dra.h
            java.lang.Integer r12 = kotlin.coroutines.jvm.internal.Boxing.boxInt(r3)
            java.lang.Integer r13 = kotlin.coroutines.jvm.internal.Boxing.boxInt(r0)
            java.lang.Object[] r12 = new java.lang.Object[]{r12, r13}
            java.lang.String r10 = r10.getString(r11, r12)
            goto L_0x015c
        L_0x011d:
            java.lang.String r11 = r9.Z
            a67 r13 = defpackage.z68.b
            if (r13 != 0) goto L_0x0124
            goto L_0x013e
        L_0x0124:
            boolean r2 = r13.c()
            if (r2 == 0) goto L_0x013e
            w78 r2 = defpackage.w78.o
            java.lang.String r3 = "Media viewer. Prepare count for toolbar by local, s:"
            java.lang.String r5 = ", total:"
            java.lang.StringBuilder r1 = defpackage.a81.n(r3, r12, r1, r10, r5)
            r1.append(r0)
            java.lang.String r1 = r1.toString()
            r13.d(r2, r11, r1, r4)
        L_0x013e:
            boolean r11 = r9.v
            if (r11 == 0) goto L_0x0143
            goto L_0x0147
        L_0x0143:
            int r10 = r10 + 1
            int r10 = r12 - r10
        L_0x0147:
            android.content.Context r11 = r9.x
            int r13 = defpackage.dra.h
            int r12 = r12 - r10
            java.lang.Integer r10 = kotlin.coroutines.jvm.internal.Boxing.boxInt(r12)
            java.lang.Integer r12 = kotlin.coroutines.jvm.internal.Boxing.boxInt(r0)
            java.lang.Object[] r10 = new java.lang.Object[]{r10, r12}
            java.lang.String r10 = r11.getString(r13, r10)
        L_0x015c:
            bi2 r11 = new bi2
            mgf r12 = new mgf
            r12.<init>(r10)
            r11.<init>(r12)
            xme r9 = r9.R0
            r9.getClass()
            r9.m(r4, r11)
            kotlin.Unit r9 = kotlin.Unit.INSTANCE
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aj2.y(int, hr8, int, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final void z(int i) {
        aje g = xag.g(this, (CoroutineContext) null, f14.b, new ni2(this, i, (Continuation) null), 1);
        this.Z0.setValue(this, b1[2], g);
    }
}
