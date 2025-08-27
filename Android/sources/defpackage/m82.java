package defpackage;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Lazy;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.reflect.KProperty;

/* renamed from: m82  reason: default package */
public final class m82 extends xz4 {
    public static final /* synthetic */ KProperty[] F;
    public final wie A;
    public final g85 B;
    public final boolean C;
    public final boolean D;
    public final boolean E;
    public final long o;
    public final AtomicBoolean p = new AtomicBoolean(false);
    public volatile boolean q;
    public final Lazy r;
    public final Lazy s;
    public final Lazy t;
    public final Lazy u;
    public final Lazy v;
    public final Lazy w;
    public final Lazy x;
    public final Lazy y;
    public final wie z;

    static {
        Class<m82> cls = m82.class;
        F = new KProperty[]{rae.s(cls, "leaveChatJob", "getLeaveChatJob()Lkotlinx/coroutines/Job;", 0), rae.s(cls, "deleteChatJob", "getDeleteChatJob()Lkotlinx/coroutines/Job;", 0)};
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public m82(long j, d14 d14) {
        super(d14);
        boolean z2 = true;
        this.o = j;
        bzb bzb = bzb.a;
        this.r = bzb.c();
        Lazy d = bzb.d();
        this.s = d;
        this.t = bzb.e();
        this.u = bzb.getAccessor().h(e1d.class);
        this.v = bzb.getAccessor().h(jqg.class);
        this.w = bzb.getAccessor().h(lz1.class);
        this.x = bzb.getAccessor().h(jz1.class);
        this.y = bzb.getAccessor().h(d1d.class);
        this.z = o5a.U();
        this.A = o5a.U();
        this.B = new g85(CollectionsKt.listOf(new Object(), new Object()));
        a32 p2 = p();
        this.C = p2 != null && p2.K();
        a32 p3 = p();
        this.D = p3 != null && p3.e0();
        a32 p4 = p();
        this.E = (p4 == null || !p4.u()) ? false : z2;
        bs0.K(bs0.F(new ps5(new wb(7, new sbd(new j82(new on2(((my2) ((qx2) d.getValue())).o(j), 28), (Continuation) null, this)), this), new y72(this, (Continuation) null), 5), ((osa) q()).a()), d14);
    }

    public static final Unit n(m82 m82) {
        aje u2 = ev0.u(m82.a, ((osa) m82.q()).b(), f14.b, new b82(m82, (Continuation) null));
        m82.A.setValue(m82, F[1], u2);
        return Unit.INSTANCE;
    }

    public static final nz4 o(m82 m82, a32 a32) {
        m82.getClass();
        String h = a32.h(kl0.c, jl0.a);
        long j = a32.b.a;
        a32.m0();
        return new nz4(h, j, a32.v0, a32.r(), (c63) null, a32.l(), a32.b.r0);
    }

    public final void a(int i) {
        ev0.v(this.a, ((osa) q()).a(), (f14) null, new z72(i, this, (Continuation) null), 2);
    }

    public final void b() {
        KProperty[] kPropertyArr = F;
        KProperty kProperty = kPropertyArr[1];
        wie wie = this.A;
        pm7 pm7 = (pm7) wie.getValue(this, kProperty);
        if (pm7 != null) {
            pm7.b((CancellationException) null);
        }
        wie.setValue(this, kPropertyArr[1], (Object) null);
        KProperty kProperty2 = kPropertyArr[0];
        wie wie2 = this.z;
        pm7 pm72 = (pm7) wie2.getValue(this, kProperty2);
        if (pm72 != null) {
            pm72.b((CancellationException) null);
        }
        wie2.setValue(this, kPropertyArr[0], (Object) null);
    }

    public final boolean d() {
        return this.q;
    }

    public final long e() {
        return this.o;
    }

    public final void g(int i) {
        ev0.v(this.a, ((osa) q()).a(), (f14) null, new d82(i, this, (Continuation) null), 2);
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0033  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object h(java.lang.String r6, android.graphics.RectF r7, kotlin.coroutines.Continuation r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof defpackage.e82
            if (r0 == 0) goto L_0x0013
            r0 = r8
            e82 r0 = (defpackage.e82) r0
            int r1 = r0.o
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.o = r1
            goto L_0x0018
        L_0x0013:
            e82 r0 = new e82
            r0.<init>(r5, r8)
        L_0x0018:
            java.lang.Object r8 = r0.b
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.o
            r3 = 1
            if (r2 == 0) goto L_0x0033
            if (r2 != r3) goto L_0x002b
            java.util.concurrent.atomic.AtomicLong r5 = r0.a
            kotlin.ResultKt.throwOnFailure(r8)
            goto L_0x005b
        L_0x002b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x0033:
            kotlin.ResultKt.throwOnFailure(r8)
            a32 r8 = r5.p()
            if (r8 != 0) goto L_0x003f
            kotlin.Unit r5 = kotlin.Unit.INSTANCE
            return r5
        L_0x003f:
            a20 r7 = defpackage.j4b.l(r7)
            java.util.concurrent.atomic.AtomicLong r2 = r5.n
            kotlin.Lazy r5 = r5.x
            java.lang.Object r5 = r5.getValue()
            jz1 r5 = (defpackage.jz1) r5
            r0.a = r2
            r0.o = r3
            long r3 = r8.a
            java.lang.Long r8 = r5.a(r3, r7, r6)
            if (r8 != r1) goto L_0x005a
            return r1
        L_0x005a:
            r5 = r2
        L_0x005b:
            java.lang.Number r8 = (java.lang.Number) r8
            long r6 = r8.longValue()
            r5.set(r6)
            kotlin.Unit r5 = kotlin.Unit.INSTANCE
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.m82.h(java.lang.String, android.graphics.RectF, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final Unit i() {
        a32 p2 = p();
        if (p2 == null) {
            return Unit.INSTANCE;
        }
        xme xme = this.c;
        azb azb = (azb) xme.getValue();
        xme.setValue(azb != null ? azb.a(azb, p2.b.d(), false, 126) : null);
        return Unit.INSTANCE;
    }

    public final void j() {
        ev0.v(this.a, ((osa) q()).b(), (f14) null, new f82(this, (Continuation) null), 2);
    }

    public final void k() {
        ev0.v(this.a, ((osa) q()).a(), (f14) null, new g82(this, (Continuation) null), 2);
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0032  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object l(kotlin.coroutines.Continuation r12) {
        /*
            r11 = this;
            boolean r0 = r12 instanceof defpackage.k82
            if (r0 == 0) goto L_0x0013
            r0 = r12
            k82 r0 = (defpackage.k82) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.c = r1
            goto L_0x0018
        L_0x0013:
            k82 r0 = new k82
            r0.<init>(r11, r12)
        L_0x0018:
            java.lang.Object r12 = r0.a
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L_0x0032
            if (r2 != r3) goto L_0x002a
            kotlin.ResultKt.throwOnFailure(r12)
            goto L_0x00ad
        L_0x002a:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L_0x0032:
            kotlin.ResultKt.throwOnFailure(r12)
            xme r12 = r11.k
            java.lang.Object r2 = r12.getValue()
            nz4 r2 = (defpackage.nz4) r2
            r4 = 0
            if (r2 != 0) goto L_0x0045
            java.lang.Boolean r11 = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(r4)
            return r11
        L_0x0045:
            a32 r5 = r11.p()
            if (r5 != 0) goto L_0x0050
            java.lang.Boolean r11 = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(r4)
            return r11
        L_0x0050:
            huf r6 = defpackage.huf.a
            java.lang.Object r7 = r12.getValue()
            nz4 r7 = (defpackage.nz4) r7
            r8 = 0
            if (r7 == 0) goto L_0x005e
            java.lang.String r7 = r7.d
            goto L_0x005f
        L_0x005e:
            r7 = r8
        L_0x005f:
            if (r7 != 0) goto L_0x0063
            java.lang.String r7 = ""
        L_0x0063:
            g85 r9 = r11.B
            c63 r6 = r9.a(r6, r7)
            if (r6 != 0) goto L_0x006d
            r7 = r3
            goto L_0x006e
        L_0x006d:
            r7 = r4
        L_0x006e:
            java.lang.Object r9 = r12.getValue()
            nz4 r9 = (defpackage.nz4) r9
            if (r9 == 0) goto L_0x007d
            r10 = 111(0x6f, float:1.56E-43)
            nz4 r6 = defpackage.nz4.c(r9, r8, r6, r8, r10)
            goto L_0x007e
        L_0x007d:
            r6 = r8
        L_0x007e:
            r12.setValue(r6)
            qz4 r12 = r11.f()
            java.util.List r12 = r12.a(r11)
            xme r6 = r11.d
            r6.setValue(r12)
            if (r7 != 0) goto L_0x0095
            java.lang.Boolean r11 = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(r4)
            return r11
        L_0x0095:
            gaf r12 = r11.q()
            osa r12 = (defpackage.osa) r12
            q04 r12 = r12.b()
            l82 r4 = new l82
            r4.<init>(r2, r11, r5, r8)
            r0.c = r3
            java.lang.Object r11 = defpackage.ev0.I(r12, r4, r0)
            if (r11 != r1) goto L_0x00ad
            return r1
        L_0x00ad:
            java.lang.Boolean r11 = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(r3)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.m82.l(kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final void m(int i, String str) {
        nz4 nz4;
        xme xme = this.k;
        if (i == 1) {
            nz4 nz42 = (nz4) xme.getValue();
            if (nz42 != null) {
                xme.m((Object) null, nz4.c(nz42, str, (c63) null, (String) null, 103));
            }
        } else if (i == 4 && (nz4 = (nz4) xme.getValue()) != null) {
            xme.m((Object) null, nz4.c(nz4, (String) null, (c63) null, str, 95));
        }
    }

    public final a32 p() {
        return (a32) ((my2) ((qx2) this.s.getValue())).o(this.o).a.getValue();
    }

    public final gaf q() {
        return (gaf) this.t.getValue();
    }
}
