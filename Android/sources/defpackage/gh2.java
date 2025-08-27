package defpackage;

import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.reflect.KProperty;

/* renamed from: gh2  reason: default package */
public final class gh2 extends xag implements cv, ps8 {
    public static final /* synthetic */ KProperty[] P0;
    public final Lazy A0;
    public final wie B0;
    public final wie C0;
    public final wie D0;
    public final Lazy E0;
    public final Lazy F0;
    public final xme G0;
    public final xme H0;
    public final s85 I0;
    public final Lazy J0;
    public final Lazy K0;
    public final ch2 L0;
    public final xme M0;
    public final etc N0;
    public final Lazy O0;
    public final Lazy X;
    public final Lazy Y;
    public final Lazy Z = LazyKt.lazy(new r52(9));
    public final long b;
    public final eg2 c;
    public final qx2 o;
    public final fa9 v;
    public final Lazy v0;
    public final rl w;
    public final cud w0;
    public final sv0 x;
    public final vj5 x0;
    public final Lazy y;
    public final Lazy y0;
    public final Lazy z;
    public final AtomicReference z0;

    static {
        Class<gh2> cls = gh2.class;
        P0 = new KProperty[]{rae.s(cls, "attachClickJob", "getAttachClickJob()Lkotlinx/coroutines/Job;", 0), rae.s(cls, "confirmationBottomSheetJob", "getConfirmationBottomSheetJob()Lkotlinx/coroutines/Job;", 0), rae.s(cls, "editMessageJob", "getEditMessageJob()Lkotlinx/coroutines/Job;", 0)};
    }

    public gh2(long j, eg2 eg2, he2 he2) {
        eg2 eg22 = eg2;
        jxb jxb = jxb.a;
        Lazy h = jxb.getAccessor().h(c48.class);
        Lazy h2 = jxb.getAccessor().h(uz4.class);
        Lazy h3 = jxb.getAccessor().h(na9.class);
        Lazy h4 = jxb.getAccessor().h(rk5.class);
        Lazy f = jxb.f();
        Lazy h5 = jxb.getAccessor().h(o20.class);
        Lazy h6 = jxb.getAccessor().h(cpb.class);
        jtb jtb = (jtb) jxb.getAccessor().g(jtb.class);
        ed2 ed2 = (ed2) jxb.getAccessor().h(ed2.class).getValue();
        r62 r62 = (r62) jxb.getAccessor().g(r62.class);
        gcf gcf = (gcf) jxb.getAccessor().g(gcf.class);
        jbf jbf = (jbf) jxb.getAccessor().g(jbf.class);
        m95 m95 = (m95) jxb.getAccessor().h(m95.class).getValue();
        sv0 sv0 = (sv0) jxb.getAccessor().g(sv0.class);
        Lazy h7 = jxb.getAccessor().h(e0b.class);
        j89 j89 = (j89) jxb.getAccessor().g(j89.class);
        this.b = j;
        this.c = eg22;
        this.o = (qx2) jxb.c().getValue();
        this.v = (fa9) jxb.getAccessor().g(fa9.class);
        this.w = (rl) jxb.getAccessor().h(rl.class).getValue();
        this.x = sv0;
        this.y = h;
        this.z = h2;
        this.X = h3;
        this.Y = h4;
        this.v0 = h7;
        ltb ltb = (ltb) jtb;
        this.w0 = ltb.b;
        this.x0 = ltb.e;
        this.y0 = h6;
        this.z0 = new AtomicReference((Object) null);
        this.A0 = f;
        this.B0 = o5a.U();
        this.C0 = o5a.U();
        this.D0 = o5a.U();
        this.E0 = LazyKt.lazy(new r52(10));
        this.F0 = LazyKt.lazy(new s2(18, (Object) j89, (Object) jtb));
        this.G0 = f6e.a(new gz9());
        this.H0 = f6e.a(new gz9());
        this.I0 = new s85(0);
        this.J0 = LazyKt.lazy(new fg2(this, r62, ed2, jtb, gcf, jbf, m95));
        this.K0 = LazyKt.lazy(new nm1(7, this));
        this.L0 = new ch2(0, this);
        xme a = f6e.a(jg2.d);
        this.M0 = a;
        this.N0 = new etc(a);
        this.O0 = LazyKt.lazy(LazyThreadSafetyMode.NONE, new gg2(0, jtb, ed2, h5, h6));
        a32 o2 = o();
        a89 a89 = o2 != null ? o2.c : null;
        if (a89 != null) {
            sv0.d(this);
            if (eg22 == eg2.b) {
                cpb cpb = (cpb) h6.getValue();
                ((xy9) cpb.a).e(cpb.g);
                cpb.c();
            }
            se2 r = r();
            if (r != null) {
                r.v.a(r.c.c(new wu(r, a89, 0)));
                r.x = this;
            }
            bs0.K(bs0.F(new ps5(new wb(8, new on2(new etc((tz9) MapsKt__MapsKt.getOrPut(r62.F, Long.valueOf(j), new r52(0))), 28), this), new ig2(this, (Continuation) null), 5), ((osa) q()).a()), this.a);
            bs0.K(bs0.F(new ps5(new dtc(he2.b), new zw(7, (Object) this), 5), ((osa) q()).a()), this.a);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0063, code lost:
        r11 = (defpackage.a89) r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0065, code lost:
        if (r11 != null) goto L_0x006b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x006b, code lost:
        r9 = r9.r();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x006f, code lost:
        if (r9 == null) goto L_0x00dd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0071, code lost:
        r9.v.a(r9.c.c(new defpackage.wu(r9, r11, 0)));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00b9, code lost:
        if (((defpackage.gz9) r9.G0.getValue()).b(((defpackage.ae2) r10).a) != false) goto L_0x00bf;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00bf, code lost:
        r10 = ((defpackage.osa) r9.q()).c();
        r11 = new defpackage.sg2(r9, (kotlin.coroutines.Continuation) null);
        r0.a = null;
        r0.b = null;
        r0.v = 3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00d9, code lost:
        if (defpackage.ev0.I(r10, r11, r0) != r1) goto L_0x00dd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x010a, code lost:
        if (((defpackage.gz9) r9.G0.getValue()).b(((defpackage.be2) r10).a) != false) goto L_0x0110;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0110, code lost:
        r10 = ((defpackage.osa) r9.q()).c();
        r11 = new defpackage.tg2(r9, (kotlin.coroutines.Continuation) null);
        r0.a = null;
        r0.b = null;
        r0.v = 5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x012a, code lost:
        if (defpackage.ev0.I(r10, r11, r0) != r1) goto L_0x00dd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:?, code lost:
        return kotlin.Unit.INSTANCE;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:?, code lost:
        return kotlin.Unit.INSTANCE;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:?, code lost:
        return kotlin.Unit.INSTANCE;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:?, code lost:
        return kotlin.Unit.INSTANCE;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:?, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:?, code lost:
        return r1;
     */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x002f  */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0038  */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x003d  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0045  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x004b  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0027  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object j(defpackage.gh2 r9, defpackage.fe2 r10, kotlin.coroutines.Continuation r11) {
        /*
            r9.getClass()
            boolean r0 = r11 instanceof defpackage.rg2
            if (r0 == 0) goto L_0x0016
            r0 = r11
            rg2 r0 = (defpackage.rg2) r0
            int r1 = r0.v
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0016
            int r1 = r1 - r2
            r0.v = r1
            goto L_0x001b
        L_0x0016:
            rg2 r0 = new rg2
            r0.<init>(r9, r11)
        L_0x001b:
            java.lang.Object r11 = r0.c
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.v
            r3 = 0
            switch(r2) {
                case 0: goto L_0x004b;
                case 1: goto L_0x0045;
                case 2: goto L_0x003d;
                case 3: goto L_0x0038;
                case 4: goto L_0x002f;
                case 5: goto L_0x0038;
                case 6: goto L_0x0038;
                default: goto L_0x0027;
            }
        L_0x0027:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L_0x002f:
            fe2 r10 = r0.b
            gh2 r9 = r0.a
            kotlin.ResultKt.throwOnFailure(r11)
            goto L_0x00fa
        L_0x0038:
            kotlin.ResultKt.throwOnFailure(r11)
            goto L_0x00dd
        L_0x003d:
            fe2 r10 = r0.b
            gh2 r9 = r0.a
            kotlin.ResultKt.throwOnFailure(r11)
            goto L_0x00a9
        L_0x0045:
            gh2 r9 = r0.a
            kotlin.ResultKt.throwOnFailure(r11)
            goto L_0x0063
        L_0x004b:
            kotlin.ResultKt.throwOnFailure(r11)
            boolean r11 = r10 instanceof defpackage.zd2
            if (r11 == 0) goto L_0x0083
            zd2 r10 = (defpackage.zd2) r10
            long r10 = r10.a
            r0.a = r9
            r2 = 1
            r0.v = r2
            java.lang.Object r11 = r9.t(r10, r0)
            if (r11 != r1) goto L_0x0063
            goto L_0x01e9
        L_0x0063:
            a89 r11 = (defpackage.a89) r11
            if (r11 != 0) goto L_0x006b
            kotlin.Unit r1 = kotlin.Unit.INSTANCE
            goto L_0x01e9
        L_0x006b:
            se2 r9 = r9.r()
            if (r9 == 0) goto L_0x00dd
            wu r10 = new wu
            r0 = 0
            r10.<init>(r9, r11, r0)
            ea5 r11 = r9.c
            mq4 r10 = r11.c(r10)
            kc3 r9 = r9.v
            r9.a(r10)
            goto L_0x00dd
        L_0x0083:
            boolean r11 = r10 instanceof defpackage.ae2
            if (r11 == 0) goto L_0x00e1
            r11 = r10
            ae2 r11 = (defpackage.ae2) r11
            long r4 = r11.a
            xme r2 = r9.H0
            java.lang.Object r2 = r2.getValue()
            gz9 r2 = (defpackage.gz9) r2
            long r6 = r11.a
            boolean r11 = r2.b(r6)
            r0.a = r9
            r0.b = r10
            r2 = 2
            r0.v = r2
            java.lang.Object r11 = r9.w(r4, r11, r0)
            if (r11 != r1) goto L_0x00a9
            goto L_0x01e9
        L_0x00a9:
            xme r11 = r9.G0
            java.lang.Object r11 = r11.getValue()
            gz9 r11 = (defpackage.gz9) r11
            ae2 r10 = (defpackage.ae2) r10
            long r4 = r10.a
            boolean r10 = r11.b(r4)
            if (r10 != 0) goto L_0x00bf
            kotlin.Unit r1 = kotlin.Unit.INSTANCE
            goto L_0x01e9
        L_0x00bf:
            gaf r10 = r9.q()
            osa r10 = (defpackage.osa) r10
            gc8 r10 = r10.c()
            sg2 r11 = new sg2
            r11.<init>(r9, r3)
            r0.a = r3
            r0.b = r3
            r9 = 3
            r0.v = r9
            java.lang.Object r9 = defpackage.ev0.I(r10, r11, r0)
            if (r9 != r1) goto L_0x00dd
            goto L_0x01e9
        L_0x00dd:
            kotlin.Unit r1 = kotlin.Unit.INSTANCE
            goto L_0x01e9
        L_0x00e1:
            boolean r11 = r10 instanceof defpackage.be2
            r2 = 0
            if (r11 == 0) goto L_0x012e
            r11 = r10
            be2 r11 = (defpackage.be2) r11
            long r4 = r11.a
            r0.a = r9
            r0.b = r10
            r11 = 4
            r0.v = r11
            java.lang.Object r11 = r9.w(r4, r2, r0)
            if (r11 != r1) goto L_0x00fa
            goto L_0x01e9
        L_0x00fa:
            xme r11 = r9.G0
            java.lang.Object r11 = r11.getValue()
            gz9 r11 = (defpackage.gz9) r11
            be2 r10 = (defpackage.be2) r10
            long r4 = r10.a
            boolean r10 = r11.b(r4)
            if (r10 != 0) goto L_0x0110
            kotlin.Unit r1 = kotlin.Unit.INSTANCE
            goto L_0x01e9
        L_0x0110:
            gaf r10 = r9.q()
            osa r10 = (defpackage.osa) r10
            gc8 r10 = r10.c()
            tg2 r11 = new tg2
            r11.<init>(r9, r3)
            r0.a = r3
            r0.b = r3
            r9 = 5
            r0.v = r9
            java.lang.Object r9 = defpackage.ev0.I(r10, r11, r0)
            if (r9 != r1) goto L_0x00dd
            goto L_0x01e9
        L_0x012e:
            boolean r11 = r10 instanceof defpackage.de2
            if (r11 == 0) goto L_0x015f
            xme r11 = r9.G0
            java.lang.Object r11 = r11.getValue()
            gz9 r11 = (defpackage.gz9) r11
            de2 r10 = (defpackage.de2) r10
            long r3 = r10.a
            long[] r5 = r11.a
            int r11 = r11.b
            r6 = r2
        L_0x0143:
            if (r6 >= r11) goto L_0x0152
            r7 = r5[r6]
            int r7 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r7 != 0) goto L_0x014f
            kotlin.Unit r1 = kotlin.Unit.INSTANCE
            goto L_0x01e9
        L_0x014f:
            int r6 = r6 + 1
            goto L_0x0143
        L_0x0152:
            r11 = 6
            r0.v = r11
            long r10 = r10.a
            java.lang.Object r9 = r9.w(r10, r2, r0)
            if (r9 != r1) goto L_0x00dd
            goto L_0x01e9
        L_0x015f:
            boolean r11 = r10 instanceof defpackage.ce2
            if (r11 == 0) goto L_0x01ea
            etc r11 = r9.N0
            ome r11 = r11.a
            java.lang.Object r11 = r11.getValue()
            jg2 r11 = (defpackage.jg2) r11
            java.util.List r11 = r11.a
            java.lang.Iterable r11 = (java.lang.Iterable) r11
            java.util.ArrayList r0 = new java.util.ArrayList
            int r1 = kotlin.collections.CollectionsKt__IterablesKt.collectionSizeOrDefault(r11, 10)
            r0.<init>(r1)
            java.util.Iterator r11 = r11.iterator()
        L_0x017e:
            boolean r1 = r11.hasNext()
            if (r1 == 0) goto L_0x0196
            java.lang.Object r1 = r11.next()
            m29 r1 = (defpackage.m29) r1
            long r1 = r1.m()
            java.lang.Long r1 = kotlin.coroutines.jvm.internal.Boxing.boxLong(r1)
            r0.add(r1)
            goto L_0x017e
        L_0x0196:
            java.util.ArrayList r11 = new java.util.ArrayList
            r11.<init>()
            java.util.Iterator r0 = r0.iterator()
        L_0x019f:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x01c3
            java.lang.Object r1 = r0.next()
            r2 = r1
            java.lang.Number r2 = (java.lang.Number) r2
            long r2 = r2.longValue()
            r4 = r10
            ce2 r4 = (defpackage.ce2) r4
            java.util.List r4 = r4.a
            java.lang.Long r2 = kotlin.coroutines.jvm.internal.Boxing.boxLong(r2)
            boolean r2 = r4.contains(r2)
            if (r2 == 0) goto L_0x019f
            r11.add(r1)
            goto L_0x019f
        L_0x01c3:
            java.util.Set r10 = kotlin.collections.CollectionsKt.toSet(r11)
            boolean r11 = r10.isEmpty()
            if (r11 == 0) goto L_0x01d0
            kotlin.Unit r1 = kotlin.Unit.INSTANCE
            goto L_0x01e9
        L_0x01d0:
            se2 r9 = r9.r()
            if (r9 == 0) goto L_0x00dd
            c r11 = new c
            r0 = 5
            r11.<init>(r0, r9, r10)
            ea5 r10 = r9.c
            mq4 r10 = r10.c(r11)
            kc3 r9 = r9.v
            r9.a(r10)
            goto L_0x00dd
        L_0x01e9:
            return r1
        L_0x01ea:
            kotlin.NoWhenBranchMatchedException r9 = new kotlin.NoWhenBranchMatchedException
            r9.<init>()
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gh2.j(gh2, fe2, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0056  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00b1  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00e3  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object k(defpackage.gh2 r18, defpackage.i29 r19, kotlin.coroutines.Continuation r20) {
        /*
            r0 = r18
            r1 = r19
            r2 = r20
            r18.getClass()
            boolean r3 = r2 instanceof defpackage.dh2
            if (r3 == 0) goto L_0x001c
            r3 = r2
            dh2 r3 = (defpackage.dh2) r3
            int r4 = r3.v
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r4 & r5
            if (r6 == 0) goto L_0x001c
            int r4 = r4 - r5
            r3.v = r4
            goto L_0x0021
        L_0x001c:
            dh2 r3 = new dh2
            r3.<init>(r0, r2)
        L_0x0021:
            java.lang.Object r2 = r3.c
            java.lang.Object r14 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r4 = r3.v
            r5 = 4
            r6 = 3
            r15 = 2
            r7 = 1
            if (r4 == 0) goto L_0x0056
            if (r4 == r7) goto L_0x004c
            if (r4 == r15) goto L_0x0045
            if (r4 == r6) goto L_0x0040
            if (r4 != r5) goto L_0x0038
            goto L_0x0040
        L_0x0038:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x0040:
            kotlin.ResultKt.throwOnFailure(r2)
            goto L_0x00ef
        L_0x0045:
            gh2 r0 = r3.a
            kotlin.ResultKt.throwOnFailure(r2)
            goto L_0x00df
        L_0x004c:
            long r0 = r3.b
            gh2 r4 = r3.a
            kotlin.ResultKt.throwOnFailure(r2)
            r5 = r0
            r0 = r4
            goto L_0x00a7
        L_0x0056:
            kotlin.ResultKt.throwOnFailure(r2)
            a32 r2 = r18.o()
            if (r2 == 0) goto L_0x014c
            g29 r4 = r1.Y
            boolean r8 = r4 instanceof defpackage.d29
            kotlin.Lazy r9 = r0.Y
            long r12 = r2.a
            if (r8 == 0) goto L_0x00f2
            java.lang.Object r2 = r9.getValue()
            r4 = r2
            rk5 r4 = (defpackage.rk5) r4
            h29 r2 = r1.X
            int r2 = r2.ordinal()
            if (r2 == 0) goto L_0x0088
            if (r2 == r7) goto L_0x0085
            if (r2 != r15) goto L_0x007f
            cl5 r2 = defpackage.cl5.c
            goto L_0x008a
        L_0x007f:
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x0085:
            cl5 r2 = defpackage.cl5.b
            goto L_0x008a
        L_0x0088:
            cl5 r2 = defpackage.cl5.a
        L_0x008a:
            r3.a = r0
            r3.b = r12
            r3.v = r7
            long r7 = r1.b
            java.lang.String r9 = r1.y
            java.lang.String r10 = r1.v
            java.lang.String r11 = r1.z
            r5 = r12
            r16 = r12
            r12 = r2
            r13 = r3
            java.lang.Object r2 = r4.a(r5, r7, r9, r10, r11, r12, r13)
            if (r2 != r14) goto L_0x00a5
            goto L_0x014e
        L_0x00a5:
            r5 = r16
        L_0x00a7:
            h4b r2 = (defpackage.h4b) r2
            e4b r1 = defpackage.e4b.a
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r2, (java.lang.Object) r1)
            if (r1 != 0) goto L_0x00ef
            boolean r1 = r2 instanceof defpackage.f4b
            if (r1 == 0) goto L_0x00c6
            s85 r0 = r0.I0
            ef2 r1 = new ef2
            f4b r2 = (defpackage.f4b) r2
            android.content.Intent r3 = r2.a
            android.net.Uri r2 = r2.b
            r1.<init>(r3, r2)
            defpackage.xag.h(r0, r1)
            goto L_0x00ef
        L_0x00c6:
            boolean r1 = r2 instanceof defpackage.g4b
            if (r1 == 0) goto L_0x00e9
            g4b r2 = (defpackage.g4b) r2
            java.lang.String r7 = r2.b
            r3.a = r0
            r3.v = r15
            r10 = 1
            long r8 = r2.a
            r4 = r0
            r11 = r3
            java.lang.Object r2 = r4.u(r5, r7, r8, r10, r11)
            if (r2 != r14) goto L_0x00df
            goto L_0x014e
        L_0x00df:
            mf2 r2 = (defpackage.mf2) r2
            if (r2 == 0) goto L_0x00ef
            s85 r0 = r0.I0
            defpackage.xag.h(r0, r2)
            goto L_0x00ef
        L_0x00e9:
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x00ef:
            kotlin.Unit r14 = kotlin.Unit.INSTANCE
            goto L_0x014e
        L_0x00f2:
            r16 = r12
            boolean r2 = r4 instanceof defpackage.e29
            xme r0 = r0.H0
            long r7 = r1.b
            if (r2 == 0) goto L_0x011e
            java.lang.Object r0 = r0.getValue()
            gz9 r0 = (defpackage.gz9) r0
            r0.b(r7)
            java.lang.Object r0 = r9.getValue()
            r4 = r0
            rk5 r4 = (defpackage.rk5) r4
            r3.v = r6
            java.lang.String r11 = r1.y
            long r7 = r1.b
            long r9 = r1.c
            r5 = r16
            r12 = r3
            java.lang.Object r0 = r4.b(r5, r7, r9, r11, r12)
            if (r0 != r14) goto L_0x00ef
            goto L_0x014e
        L_0x011e:
            boolean r2 = r4 instanceof defpackage.f29
            if (r2 == 0) goto L_0x0146
            java.lang.Object r0 = r0.getValue()
            gz9 r0 = (defpackage.gz9) r0
            r0.a(r7)
            java.lang.Object r0 = r9.getValue()
            r4 = r0
            rk5 r4 = (defpackage.rk5) r4
            r3.v = r5
            long r7 = r1.b
            long r9 = r1.c
            java.lang.String r11 = r1.y
            java.lang.String r12 = r1.v
            r5 = r16
            r13 = r3
            java.lang.Object r0 = r4.c(r5, r7, r9, r11, r12, r13)
            if (r0 != r14) goto L_0x00ef
            goto L_0x014e
        L_0x0146:
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x014c:
            kotlin.Unit r14 = kotlin.Unit.INSTANCE
        L_0x014e:
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gh2.k(gh2, i29, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public static final void l(gh2 gh2) {
        e0b e0b = (e0b) gh2.v0.getValue();
        e0b.h(new igf(lxa.O1));
        e0b.f(new o0b(cad.K));
        e0b.j();
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0039  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00ab  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0026  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object m(defpackage.gh2 r7, java.util.List r8, kotlin.coroutines.Continuation r9) {
        /*
            r7.getClass()
            boolean r0 = r9 instanceof defpackage.fh2
            if (r0 == 0) goto L_0x0016
            r0 = r9
            fh2 r0 = (defpackage.fh2) r0
            int r1 = r0.v
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0016
            int r1 = r1 - r2
            r0.v = r1
            goto L_0x001b
        L_0x0016:
            fh2 r0 = new fh2
            r0.<init>(r7, r9)
        L_0x001b:
            java.lang.Object r9 = r0.c
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.v
            r3 = 1
            if (r2 == 0) goto L_0x0039
            if (r2 != r3) goto L_0x0031
            long r7 = r0.b
            gh2 r0 = r0.a
            kotlin.ResultKt.throwOnFailure(r9)
            goto L_0x00a3
        L_0x0031:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L_0x0039:
            kotlin.ResultKt.throwOnFailure(r9)
            xme r9 = r7.M0
            java.lang.Object r9 = r9.getValue()
            jg2 r9 = (defpackage.jg2) r9
            java.util.List r9 = r9.a
            boolean r9 = r9.isEmpty()
            if (r9 == 0) goto L_0x00ba
            eg2 r9 = defpackage.eg2.a
            eg2 r2 = r7.c
            if (r2 != r9) goto L_0x00ba
            int r9 = r8.size()
            java.util.ListIterator r8 = r8.listIterator(r9)
        L_0x005a:
            boolean r9 = r8.hasPrevious()
            r2 = 0
            if (r9 == 0) goto L_0x0079
            java.lang.Object r9 = r8.previous()
            r4 = r9
            gz6 r4 = (defpackage.gz6) r4
            boolean r5 = r4 instanceof defpackage.a89
            if (r5 == 0) goto L_0x005a
            a89 r4 = (defpackage.a89) r4
            ha9 r4 = r4.a
            if (r4 == 0) goto L_0x005a
            boolean r4 = r4.o()
            if (r4 != r3) goto L_0x005a
            goto L_0x007a
        L_0x0079:
            r9 = r2
        L_0x007a:
            boolean r8 = r9 instanceof defpackage.a89
            if (r8 == 0) goto L_0x0081
            r2 = r9
            a89 r2 = (defpackage.a89) r2
        L_0x0081:
            if (r2 == 0) goto L_0x0088
            ha9 r8 = r2.a
            long r8 = r8.b
            goto L_0x008a
        L_0x0088:
            r8 = 0
        L_0x008a:
            java.util.HashSet r2 = defpackage.b10.A0
            r0.a = r7
            r0.b = r8
            r0.v = r3
            qx2 r3 = r7.o
            my2 r3 = (defpackage.my2) r3
            long r4 = r7.b
            java.lang.Object r0 = r3.t(r4, r2, r0)
            if (r0 != r1) goto L_0x009f
            goto L_0x00bc
        L_0x009f:
            r6 = r0
            r0 = r7
            r7 = r8
            r9 = r6
        L_0x00a3:
            z62 r9 = (defpackage.z62) r9
            long r1 = r9.d
            int r9 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r9 == 0) goto L_0x00ba
            qx2 r9 = r0.o
            hg2 r1 = new hg2
            r2 = 0
            r1.<init>(r7, r2)
            my2 r9 = (defpackage.my2) r9
            long r7 = r0.b
            r9.h(r7, r1)
        L_0x00ba:
            kotlin.Unit r1 = kotlin.Unit.INSTANCE
        L_0x00bc:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gh2.m(gh2, java.util.List, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final os8 d() {
        os8 os8 = (os8) this.z0.get();
        if (os8 != null) {
            return os8;
        }
        Set<String> set = (Set) this.K0.getValue();
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(set, 10));
        for (String a : set) {
            arrayList.add(b10.a(a));
        }
        return new os8(0, 0, CollectionsKt.toSet(arrayList), this.b);
    }

    public final void i() {
        this.x.f(this);
        if (this.c == eg2.b) {
            ((cpb) this.y0.getValue()).a();
        }
    }

    public final void n(m29 m29, boolean z2) {
        aje u = ev0.u(this.a, ((osa) q()).b(), f14.b, new ng2(this, m29, z2, (Continuation) null));
        this.D0.setValue(this, P0[2], u);
    }

    public final a32 o() {
        return (a32) ((my2) this.o).o(this.b).a.getValue();
    }

    public final gaf q() {
        return (gaf) this.A0.getValue();
    }

    public final se2 r() {
        return (se2) this.J0.getValue();
    }

    public final void s() {
        se2 r = r();
        if (r != null) {
            ev0.v(this.a, ((osa) q()).b().plus(caa.a), (f14) null, new wg2(this, r, (Continuation) null), 2);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0033  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0064 A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object t(long r5, kotlin.coroutines.Continuation r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof defpackage.og2
            if (r0 == 0) goto L_0x0013
            r0 = r7
            og2 r0 = (defpackage.og2) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.c = r1
            goto L_0x0018
        L_0x0013:
            og2 r0 = new og2
            r0.<init>(r4, r7)
        L_0x0018:
            java.lang.Object r7 = r0.a
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L_0x0033
            if (r2 != r3) goto L_0x002b
            kotlin.ResultKt.throwOnFailure(r7)     // Catch:{ all -> 0x0029 }
            goto L_0x004d
        L_0x0029:
            r4 = move-exception
            goto L_0x0054
        L_0x002b:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L_0x0033:
            kotlin.ResultKt.throwOnFailure(r7)
            kotlin.Result$Companion r7 = kotlin.Result.Companion     // Catch:{ all -> 0x0029 }
            kotlin.Lazy r4 = r4.y     // Catch:{ all -> 0x0029 }
            java.lang.Object r4 = r4.getValue()     // Catch:{ all -> 0x0029 }
            c48 r4 = (defpackage.c48) r4     // Catch:{ all -> 0x0029 }
            mka r4 = r4.a(r5, r3)     // Catch:{ all -> 0x0029 }
            r0.c = r3     // Catch:{ all -> 0x0029 }
            java.lang.Object r7 = defpackage.bs0.f(r4, r0)     // Catch:{ all -> 0x0029 }
            if (r7 != r1) goto L_0x004d
            return r1
        L_0x004d:
            a89 r7 = (defpackage.a89) r7     // Catch:{ all -> 0x0029 }
            java.lang.Object r4 = kotlin.Result.m23constructorimpl(r7)     // Catch:{ all -> 0x0029 }
            goto L_0x005e
        L_0x0054:
            kotlin.Result$Companion r5 = kotlin.Result.Companion
            java.lang.Object r4 = kotlin.ResultKt.createFailure(r4)
            java.lang.Object r4 = kotlin.Result.m23constructorimpl(r4)
        L_0x005e:
            boolean r5 = kotlin.Result.m29isFailureimpl(r4)
            if (r5 == 0) goto L_0x0065
            r4 = 0
        L_0x0065:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gh2.t(long, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x003b  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0073 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0075  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0026  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object u(long r15, java.lang.String r17, long r18, boolean r20, kotlin.coroutines.Continuation r21) {
        /*
            r14 = this;
            r0 = r14
            r1 = r21
            boolean r2 = r1 instanceof defpackage.pg2
            if (r2 == 0) goto L_0x0016
            r2 = r1
            pg2 r2 = (defpackage.pg2) r2
            int r3 = r2.v
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L_0x0016
            int r3 = r3 - r4
            r2.v = r3
            goto L_0x001b
        L_0x0016:
            pg2 r2 = new pg2
            r2.<init>(r14, r1)
        L_0x001b:
            java.lang.Object r1 = r2.c
            java.lang.Object r3 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r4 = r2.v
            r5 = 1
            if (r4 == 0) goto L_0x003b
            if (r4 != r5) goto L_0x0033
            boolean r0 = r2.b
            java.lang.String r2 = r2.a
            kotlin.ResultKt.throwOnFailure(r1)
            r13 = r2
            r2 = r1
            r1 = r13
            goto L_0x006f
        L_0x0033:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x003b:
            kotlin.ResultKt.throwOnFailure(r1)
            cud r1 = r0.w0
            r1.getClass()
            ru.ok.tamtam.android.prefs.PmsKey r4 = ru.ok.tamtam.android.prefs.PmsKey.f86newmediaviewerenabled
            r6 = 0
            boolean r1 = r1.m(r4, r6)
            if (r1 == 0) goto L_0x005a
            ff2 r0 = new ff2
            r6 = r0
            r7 = r15
            r9 = r18
            r11 = r17
            r12 = r20
            r6.<init>(r7, r9, r11, r12)
            goto L_0x0091
        L_0x005a:
            r1 = r17
            r2.a = r1
            r4 = r20
            r2.b = r4
            r2.v = r5
            r5 = r18
            java.lang.Object r0 = r14.t(r5, r2)
            if (r0 != r3) goto L_0x006d
            return r3
        L_0x006d:
            r2 = r0
            r0 = r4
        L_0x006f:
            a89 r2 = (defpackage.a89) r2
            if (r2 != 0) goto L_0x0075
            r0 = 0
            return r0
        L_0x0075:
            jxb r3 = defpackage.jxb.a
            q4 r3 = r3.getAccessor()
            java.lang.Class<dt7> r4 = defpackage.dt7.class
            java.lang.Object r3 = r3.g(r4)
            dt7 r3 = (defpackage.dt7) r3
            r3.getClass()
            hd9 r3 = new hd9
            r3.<init>((defpackage.a89) r2)
            gf2 r2 = new gf2
            r2.<init>(r3, r1, r0)
            r0 = r2
        L_0x0091:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gh2.u(long, java.lang.String, long, boolean, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00ca, code lost:
        r15 = (defpackage.ns8) r2.O0.getValue();
        r12 = (java.util.Set) r2.K0.getValue();
        r4.a = r2;
        r4.b = r0;
        r4.c = r1;
        r4.o = r9;
        r4.v = r8;
        r4.w = r8;
        r4.x = r7;
        r4.X = r6;
        r15.getClass();
        r13 = r2.c.ordinal();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00fb, code lost:
        if (r13 == 0) goto L_0x011e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00fd, code lost:
        if (r13 == r6) goto L_0x0119;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0100, code lost:
        if (r13 == 2) goto L_0x0114;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0102, code lost:
        if (r13 != 3) goto L_0x010e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0104, code lost:
        r10 = r15.a(r11, r12, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0108, code lost:
        r23 = r1;
        r21 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0113, code lost:
        throw new kotlin.NoWhenBranchMatchedException();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0114, code lost:
        r10 = r15.c(r11, r12, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0119, code lost:
        r10 = r15.b(r11, r12, r1, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x011e, code lost:
        r13 = r11.a.x0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x0122, code lost:
        if (r13 == null) goto L_0x0158;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0124, code lost:
        r13 = (java.util.List) r13.b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x0128, code lost:
        if (r13 == null) goto L_0x0158;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x012a, code lost:
        r14 = new java.util.ArrayList();
        r13 = r13.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x0139, code lost:
        if (r13.hasNext() == false) goto L_0x015c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x013b, code lost:
        r10 = r13.next();
        r5 = (defpackage.l20) r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x014c, code lost:
        if (r12.contains(r5.a.toString()) == false) goto L_0x0155;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x0150, code lost:
        if (r5.s != false) goto L_0x0155;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x0152, code lost:
        r14.add(r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x0158, code lost:
        r14 = kotlin.collections.CollectionsKt.emptyList();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x0161, code lost:
        if (r14.size() <= 1) goto L_0x0165;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x0163, code lost:
        r10 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x0165, code lost:
        r10 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x0166, code lost:
        r14 = r14;
        r5 = defpackage.e14.a(r4.getContext());
        r6 = new java.util.ArrayList(kotlin.collections.CollectionsKt__IterablesKt.collectionSizeOrDefault(r14, 10));
        r18 = r14.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x0181, code lost:
        if (r18.hasNext() == false) goto L_0x01ad;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x0183, code lost:
        r21 = r2;
        r2 = r12;
        r19 = r15;
        r12 = new defpackage.ms8(r18.next(), (kotlin.coroutines.Continuation) null, r11, r10, r19);
        r6.add(defpackage.ev0.d(r5, (defpackage.q04) null, r2, 3));
        r2 = r21;
        r1 = r1;
        r15 = r19;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x01ad, code lost:
        r23 = r1;
        r21 = r2;
        r10 = defpackage.j4b.g(r6, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x01b6, code lost:
        if (r10 != r3) goto L_0x01b9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x01b8, code lost:
        return r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x01b9, code lost:
        r11 = r21;
        r1 = r4;
        r2 = r7;
        r4 = r8;
        r7 = r4;
        r8 = r9;
        r9 = r23;
        r20 = r10;
        r10 = r0;
        r0 = r20;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x015c, code lost:
        r14 = r14;
     */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x004b  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0080  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x01de  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x01e9  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x01f4  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object v(java.util.List r22, java.lang.Long r23, kotlin.coroutines.Continuation r24) {
        /*
            r21 = this;
            r0 = r24
            boolean r1 = r0 instanceof defpackage.qg2
            if (r1 == 0) goto L_0x0017
            r1 = r0
            qg2 r1 = (defpackage.qg2) r1
            int r2 = r1.X
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L_0x0017
            int r2 = r2 - r3
            r1.X = r2
            r2 = r21
            goto L_0x001e
        L_0x0017:
            qg2 r1 = new qg2
            r2 = r21
            r1.<init>(r2, r0)
        L_0x001e:
            java.lang.Object r0 = r1.y
            java.lang.Object r3 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r4 = r1.X
            r5 = -1
            r6 = 1
            if (r4 == 0) goto L_0x004b
            if (r4 != r6) goto L_0x0043
            int r2 = r1.x
            java.util.ArrayList r4 = r1.w
            java.util.ArrayList r7 = r1.v
            java.util.List r8 = r1.o
            java.util.List r8 = (java.util.List) r8
            java.lang.Long r9 = r1.c
            java.util.List r10 = r1.b
            java.util.List r10 = (java.util.List) r10
            gh2 r11 = r1.a
            kotlin.ResultKt.throwOnFailure(r0)
            goto L_0x01c7
        L_0x0043:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x004b:
            kotlin.ResultKt.throwOnFailure(r0)
            r0 = r22
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.Iterator r0 = r0.iterator()
        L_0x005b:
            boolean r7 = r0.hasNext()
            if (r7 == 0) goto L_0x006d
            java.lang.Object r7 = r0.next()
            boolean r8 = r7 instanceof defpackage.a89
            if (r8 == 0) goto L_0x005b
            r4.add(r7)
            goto L_0x005b
        L_0x006d:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            int r7 = r4.size()
            int r7 = r7 - r6
            r8 = r0
            r9 = r4
            r0 = r22
            r4 = r1
            r1 = r23
        L_0x007e:
            if (r5 >= r7) goto L_0x01de
            java.lang.Object r11 = r9.get(r7)
            a89 r11 = (defpackage.a89) r11
            kotlin.Lazy r12 = r2.K0
            java.lang.Object r12 = r12.getValue()
            java.util.Set r12 = (java.util.Set) r12
            ha9 r13 = r11.a
            w28 r13 = r13.x0
            if (r13 != 0) goto L_0x009a
        L_0x0094:
            r23 = r1
            r21 = r2
            goto L_0x01d5
        L_0x009a:
            java.lang.Object r13 = r13.b
            java.util.List r13 = (java.util.List) r13
            java.lang.Iterable r13 = (java.lang.Iterable) r13
            boolean r14 = r13 instanceof java.util.Collection
            if (r14 == 0) goto L_0x00ae
            r14 = r13
            java.util.Collection r14 = (java.util.Collection) r14
            boolean r14 = r14.isEmpty()
            if (r14 == 0) goto L_0x00ae
            goto L_0x0094
        L_0x00ae:
            java.util.Iterator r13 = r13.iterator()
        L_0x00b2:
            boolean r14 = r13.hasNext()
            if (r14 == 0) goto L_0x0094
            java.lang.Object r14 = r13.next()
            l20 r14 = (defpackage.l20) r14
            g20 r14 = r14.a
            java.lang.String r14 = r14.toString()
            boolean r14 = r12.contains(r14)
            if (r14 == 0) goto L_0x00b2
            kotlin.Lazy r12 = r2.O0
            java.lang.Object r12 = r12.getValue()
            r15 = r12
            ns8 r15 = (defpackage.ns8) r15
            kotlin.Lazy r12 = r2.K0
            java.lang.Object r12 = r12.getValue()
            java.util.Set r12 = (java.util.Set) r12
            r4.a = r2
            r13 = r0
            java.util.List r13 = (java.util.List) r13
            r4.b = r13
            r4.c = r1
            r13 = r9
            java.util.List r13 = (java.util.List) r13
            r4.o = r13
            r4.v = r8
            r4.w = r8
            r4.x = r7
            r4.X = r6
            r15.getClass()
            eg2 r13 = r2.c
            int r13 = r13.ordinal()
            r14 = 3
            if (r13 == 0) goto L_0x011e
            if (r13 == r6) goto L_0x0119
            r10 = 2
            if (r13 == r10) goto L_0x0114
            if (r13 != r14) goto L_0x010e
            java.lang.Object r10 = r15.a(r11, r12, r4)
        L_0x0108:
            r23 = r1
            r21 = r2
            goto L_0x01b6
        L_0x010e:
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x0114:
            java.lang.Object r10 = r15.c(r11, r12, r4)
            goto L_0x0108
        L_0x0119:
            java.lang.Object r10 = r15.b(r11, r12, r1, r4)
            goto L_0x0108
        L_0x011e:
            ha9 r13 = r11.a
            w28 r13 = r13.x0
            if (r13 == 0) goto L_0x0158
            java.lang.Object r13 = r13.b
            java.util.List r13 = (java.util.List) r13
            if (r13 == 0) goto L_0x0158
            java.lang.Iterable r13 = (java.lang.Iterable) r13
            java.util.ArrayList r14 = new java.util.ArrayList
            r14.<init>()
            java.util.Iterator r13 = r13.iterator()
        L_0x0135:
            boolean r16 = r13.hasNext()
            if (r16 == 0) goto L_0x015c
            java.lang.Object r10 = r13.next()
            r5 = r10
            l20 r5 = (defpackage.l20) r5
            g20 r6 = r5.a
            java.lang.String r6 = r6.toString()
            boolean r6 = r12.contains(r6)
            if (r6 == 0) goto L_0x0155
            boolean r5 = r5.s
            if (r5 != 0) goto L_0x0155
            r14.add(r10)
        L_0x0155:
            r5 = -1
            r6 = 1
            goto L_0x0135
        L_0x0158:
            java.util.List r14 = kotlin.collections.CollectionsKt.emptyList()
        L_0x015c:
            int r5 = r14.size()
            r6 = 1
            if (r5 <= r6) goto L_0x0165
            r10 = 1
            goto L_0x0166
        L_0x0165:
            r10 = 0
        L_0x0166:
            java.lang.Iterable r14 = (java.lang.Iterable) r14
            kotlin.coroutines.CoroutineContext r5 = r4.getContext()
            jx3 r5 = defpackage.e14.a(r5)
            java.util.ArrayList r6 = new java.util.ArrayList
            int r12 = kotlin.collections.CollectionsKt__IterablesKt.collectionSizeOrDefault(r14, 10)
            r6.<init>(r12)
            java.util.Iterator r18 = r14.iterator()
        L_0x017d:
            boolean r12 = r18.hasNext()
            if (r12 == 0) goto L_0x01ad
            java.lang.Object r13 = r18.next()
            ms8 r14 = new ms8
            r16 = 0
            r12 = r14
            r23 = r1
            r21 = r2
            r2 = r14
            r1 = 3
            r14 = r16
            r19 = r15
            r15 = r11
            r16 = r10
            r17 = r19
            r12.<init>(r13, r14, r15, r16, r17)
            r12 = 0
            nk4 r2 = defpackage.ev0.d(r5, r12, r2, r1)
            r6.add(r2)
            r2 = r21
            r1 = r23
            r15 = r19
            goto L_0x017d
        L_0x01ad:
            r23 = r1
            r21 = r2
            java.lang.Object r1 = defpackage.j4b.g(r6, r4)
            r10 = r1
        L_0x01b6:
            if (r10 != r3) goto L_0x01b9
            return r3
        L_0x01b9:
            r11 = r21
            r1 = r4
            r2 = r7
            r4 = r8
            r7 = r4
            r8 = r9
            r9 = r23
            r20 = r10
            r10 = r0
            r0 = r20
        L_0x01c7:
            java.util.Collection r0 = (java.util.Collection) r0
            r4.addAll(r0)
            r4 = r1
            r1 = r9
            r0 = r10
            r5 = -1
            r9 = r8
            r8 = r7
            r7 = r2
            r2 = r11
            goto L_0x01da
        L_0x01d5:
            r2 = r21
            r1 = r23
            r5 = -1
        L_0x01da:
            int r7 = r7 + r5
            r6 = 1
            goto L_0x007e
        L_0x01de:
            r1 = r0
            java.util.Collection r1 = (java.util.Collection) r1
            boolean r2 = r1.isEmpty()
            r6 = 1
            r2 = r2 ^ r6
            if (r2 == 0) goto L_0x01f4
            r2 = 0
            java.lang.Object r3 = r0.get(r2)
            boolean r3 = r3 instanceof defpackage.fz6
            if (r3 == 0) goto L_0x01f5
            r3 = r6
            goto L_0x01f6
        L_0x01f4:
            r2 = 0
        L_0x01f5:
            r3 = r2
        L_0x01f6:
            boolean r1 = r1.isEmpty()
            r1 = r1 ^ r6
            if (r1 == 0) goto L_0x0206
            java.lang.Object r0 = defpackage.a81.i(r6, r0)
            boolean r0 = r0 instanceof defpackage.fz6
            if (r0 == 0) goto L_0x0206
            goto L_0x0207
        L_0x0206:
            r6 = r2
        L_0x0207:
            jg2 r0 = new jg2
            r0.<init>(r8, r6, r3)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gh2.v(java.util.List, java.lang.Long, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00ca  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00cf  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00e7 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00f0  */
    public final java.lang.Object w(long r8, boolean r10, kotlin.coroutines.Continuation r11) {
        /*
            r7 = this;
            boolean r0 = r11 instanceof defpackage.ug2
            if (r0 == 0) goto L_0x0013
            r0 = r11
            ug2 r0 = (defpackage.ug2) r0
            int r1 = r0.z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.z = r1
            goto L_0x0018
        L_0x0013:
            ug2 r0 = new ug2
            r0.<init>(r7, r11)
        L_0x0018:
            java.lang.Object r11 = r0.x
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.z
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L_0x004d
            if (r2 == r4) goto L_0x0043
            if (r2 != r3) goto L_0x003b
            boolean r7 = r0.w
            long r8 = r0.v
            java.lang.Object r10 = r0.o
            tz9 r2 = r0.c
            java.util.List r4 = r0.b
            java.util.List r4 = (java.util.List) r4
            gh2 r5 = r0.a
            kotlin.ResultKt.throwOnFailure(r11)
            goto L_0x00e8
        L_0x003b:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L_0x0043:
            boolean r10 = r0.w
            long r8 = r0.v
            gh2 r7 = r0.a
            kotlin.ResultKt.throwOnFailure(r11)
            goto L_0x0092
        L_0x004d:
            kotlin.ResultKt.throwOnFailure(r11)
            xme r11 = r7.M0
            java.lang.Object r11 = r11.getValue()
            jg2 r11 = (defpackage.jg2) r11
            java.util.List r11 = r11.a
            java.lang.Iterable r11 = (java.lang.Iterable) r11
            boolean r2 = r11 instanceof java.util.Collection
            if (r2 == 0) goto L_0x006b
            r2 = r11
            java.util.Collection r2 = (java.util.Collection) r2
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto L_0x006b
            goto L_0x00f6
        L_0x006b:
            java.util.Iterator r11 = r11.iterator()
        L_0x006f:
            boolean r2 = r11.hasNext()
            if (r2 == 0) goto L_0x00f6
            java.lang.Object r2 = r11.next()
            m29 r2 = (defpackage.m29) r2
            long r5 = r2.m()
            int r2 = (r5 > r8 ? 1 : (r5 == r8 ? 0 : -1))
            if (r2 != 0) goto L_0x006f
            r0.a = r7
            r0.v = r8
            r0.w = r10
            r0.z = r4
            java.lang.Object r11 = r7.t(r8, r0)
            if (r11 != r1) goto L_0x0092
            return r1
        L_0x0092:
            a89 r11 = (defpackage.a89) r11
            if (r11 != 0) goto L_0x0099
            kotlin.Unit r7 = kotlin.Unit.INSTANCE
            return r7
        L_0x0099:
            se2 r2 = r7.r()
            if (r2 == 0) goto L_0x00b0
            wu r4 = new wu
            r5 = 1
            r4.<init>(r2, r11, r5)
            ea5 r11 = r2.c
            mq4 r11 = r11.c(r4)
            kc3 r2 = r2.v
            r2.a(r11)
        L_0x00b0:
            se2 r11 = r7.r()
            if (r11 == 0) goto L_0x00f3
            zz6 r11 = r11.b
            java.util.ArrayList r11 = r11.e()
            xme r2 = r7.M0
            r5 = r7
            r7 = r10
            r4 = r11
        L_0x00c1:
            java.lang.Object r10 = r2.getValue()
            r11 = r10
            jg2 r11 = (defpackage.jg2) r11
            if (r7 == 0) goto L_0x00cf
            java.lang.Long r11 = kotlin.coroutines.jvm.internal.Boxing.boxLong(r8)
            goto L_0x00d0
        L_0x00cf:
            r11 = 0
        L_0x00d0:
            r0.a = r5
            r6 = r4
            java.util.List r6 = (java.util.List) r6
            r0.b = r6
            r0.c = r2
            r0.o = r10
            r0.v = r8
            r0.w = r7
            r0.z = r3
            java.lang.Object r11 = r5.v(r4, r11, r0)
            if (r11 != r1) goto L_0x00e8
            return r1
        L_0x00e8:
            jg2 r11 = (defpackage.jg2) r11
            boolean r10 = r2.b(r10, r11)
            if (r10 == 0) goto L_0x00c1
            kotlin.Unit r7 = kotlin.Unit.INSTANCE
            return r7
        L_0x00f3:
            kotlin.Unit r7 = kotlin.Unit.INSTANCE
            return r7
        L_0x00f6:
            kotlin.Unit r7 = kotlin.Unit.INSTANCE
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gh2.w(long, boolean, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final void x(int i, m29 m29) {
        CharSequence charSequence;
        CharSequence charSequence2;
        CharSequence charSequence3;
        int i2 = jxa.Z;
        s85 s85 = this.I0;
        if (i == i2) {
            xag.h(s85, new if2(this.b, m29.m()));
        } else if (i != jxa.Y) {
            int i3 = jxa.d0;
            j29 j29 = null;
            jx3 jx3 = this.a;
            if (i == i3) {
                aje u = ev0.u(jx3, ((osa) q()).b(), f14.b, new xg2(this, m29, (Continuation) null));
                this.C0.setValue(this, P0[1], u);
            } else if (i == jxa.X) {
                n(m29, true);
            } else if (i == jxa.W) {
                n(m29, false);
            } else if (i == jxa.a0) {
                if (m29 instanceof j29) {
                    j29 = (j29) m29;
                }
                if (j29 != null && (charSequence3 = j29.x) != null) {
                    xag.h(s85, new hf2(charSequence3.toString()));
                }
            } else if (i == jxa.V) {
                if (m29 instanceof j29) {
                    j29 = (j29) m29;
                }
                if (j29 != null && (charSequence2 = j29.x) != null) {
                    xag.h(s85, new df2(charSequence2.toString()));
                    e0b e0b = (e0b) this.v0.getValue();
                    e0b.h(new igf(lxa.o1));
                    e0b.f(new o0b(cad.w));
                    e0b.j();
                }
            } else if (i == jxa.c0) {
                if (m29 instanceof j29) {
                    j29 = (j29) m29;
                }
                if (j29 != null && (charSequence = j29.x) != null) {
                    xag.h(s85, new kf2(charSequence.toString()));
                }
            } else if (i == jxa.b0 && (m29 instanceof l29)) {
                ev0.v(jx3, ((osa) q()).b(), (f14) null, new bh2(this, m29, (Continuation) null), 2);
            }
        } else if (m29 instanceof i29) {
            i29 i29 = (i29) m29;
            xag.h(s85, new jf2(Long.valueOf(i29.c), i29.b, false));
        } else if (m29 instanceof j29) {
            j29 j292 = (j29) m29;
            xag.h(s85, new jf2(Long.valueOf(j292.c), j292.b, true));
        } else if (m29 instanceof l29) {
            l29 l29 = (l29) m29;
            xag.h(s85, new jf2(Long.valueOf(l29.c), l29.b, true));
        } else if (m29 instanceof c29) {
            c29 c29 = (c29) m29;
            xag.h(s85, new jf2(Long.valueOf(c29.c), c29.b, false));
        } else {
            throw new NoWhenBranchMatchedException();
        }
    }
}
