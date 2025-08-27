package defpackage;

import android.os.Bundle;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.NoWhenBranchMatchedException;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;

/* renamed from: em2  reason: default package */
public final class em2 extends gwb {
    public final Lazy f;
    public final Lazy g;
    public final Lazy h;
    public final Lazy i;
    public final Lazy j;
    public final String k = em2.class.getName();
    public final Lazy l;
    public final Lazy m;
    public final Lazy n;
    public final Lazy o;
    public final Lazy p;
    public final Lazy q;
    public final Lazy r;
    public final AtomicLong s;

    public em2(long j2, d14 d14) {
        super(j2);
        jxb jxb = jxb.a;
        Lazy c = jxb.c();
        this.f = c;
        this.g = jxb.e();
        Lazy f2 = jxb.f();
        this.h = f2;
        this.i = jxb.g();
        this.j = jxb.d();
        this.l = jxb.getAccessor().h(fz7.class);
        this.m = LazyKt.lazy(new r52(19));
        this.n = LazyKt.lazy(new r52(20));
        this.o = jxb.getAccessor().h(jz1.class);
        r52 r52 = new r52(21);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.p = LazyKt.lazy(lazyThreadSafetyMode, r52);
        this.q = LazyKt.lazy(lazyThreadSafetyMode, new r52(22));
        this.r = jxb.getAccessor().h(sn7.class);
        this.s = new AtomicLong();
        bs0.K(bs0.F(new ps5(new on2(new wb(9, new sbd(new dm2(new on2(((my2) ((qx2) c.getValue())).o(j2), 28), (Continuation) null, d14, this)), this), 28), new wq0(2, this, em2.class, "emitState", "emitState(Lone/me/profile/viewmodel/logic/Profile$State;)V", 4, 6), 5), ((osa) ((gaf) f2.getValue())).a()), d14);
    }

    public final h6c A(long j2) {
        String f2;
        vk3 vk3 = (vk3) ((eu3) this.g.getValue()).c(j2).a.getValue();
        if (vk3 == null || (f2 = vk3.f()) == null) {
            return null;
        }
        swb swb = (swb) this.q.getValue();
        qr2 k2 = k();
        swb.getClass();
        int ordinal = k2.ordinal();
        if (ordinal == 0) {
            kgf kgf = new kgf(lxa.g2, ArraysKt.toList((T[]) new Object[]{f2}));
            int i2 = jxa.A0;
            igf igf = new igf(lxa.a2);
            og3 og3 = og3.a;
            return new c6c(kgf, (ngf) null, CollectionsKt.listOf(new pg3(i2, igf, og3), new pg3(jxa.C0, new igf(lxa.c2), og3), new pg3(jxa.B0, new igf(lxa.b2), og3.b)), o54.f(TuplesKt.to("profile:participant_id_for_action", Long.valueOf(j2))));
        } else if (ordinal == 1 || ordinal == 2 || ordinal == 3) {
            return swb.c();
        } else {
            throw new NoWhenBranchMatchedException();
        }
    }

    public final Unit D(Continuation continuation) {
        return Unit.INSTANCE;
    }

    public final a32 E() {
        return (a32) ((my2) ((qx2) this.f.getValue())).o(this.a).a.getValue();
    }

    public final Unit a(Continuation continuation) {
        return Unit.INSTANCE;
    }

    public final boolean b() {
        a32 E = E();
        if (E != null) {
            return E.a();
        }
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0033  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object c(java.lang.String r6, android.graphics.RectF r7, kotlin.coroutines.Continuation r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof defpackage.xl2
            if (r0 == 0) goto L_0x0013
            r0 = r8
            xl2 r0 = (defpackage.xl2) r0
            int r1 = r0.o
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.o = r1
            goto L_0x0018
        L_0x0013:
            xl2 r0 = new xl2
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
            a32 r8 = r5.E()
            if (r8 != 0) goto L_0x003f
            kotlin.Unit r5 = kotlin.Unit.INSTANCE
            return r5
        L_0x003f:
            a20 r7 = defpackage.j4b.l(r7)
            java.util.concurrent.atomic.AtomicLong r2 = r5.s
            kotlin.Lazy r5 = r5.o
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
        throw new UnsupportedOperationException("Method not decompiled: defpackage.em2.c(java.lang.String, android.graphics.RectF, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final void d() {
    }

    public final j91 e() {
        return new y4c(this.a, txb.LOCAL_CHAT);
    }

    public final long g() {
        return this.s.get();
    }

    public final String h() {
        m72 m72;
        a32 E = E();
        if (E == null || (m72 = E.b) == null) {
            return null;
        }
        return m72.I;
    }

    public final Long i() {
        return Long.valueOf(this.a);
    }

    public final Long j() {
        a32 E = E();
        if (E != null) {
            return Long.valueOf(E.b.a);
        }
        return null;
    }

    public final qr2 k() {
        a32 E = E();
        return (E == null || !E.K()) ? qr2.a : qr2.c;
    }

    public final txb l() {
        return txb.LOCAL_CHAT;
    }

    public final long m() {
        return this.a;
    }

    public final Object n(Continuation continuation) {
        return E();
    }

    public final boolean p() {
        a32 E = E();
        return E != null && E.K();
    }

    public final boolean q() {
        a32 E = E();
        return E != null && E.e0();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x004e, code lost:
        r7 = r7.b;
     */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0039  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object t(kotlin.coroutines.Continuation r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof defpackage.yl2
            if (r0 == 0) goto L_0x0013
            r0 = r7
            yl2 r0 = (defpackage.yl2) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.c = r1
            goto L_0x0018
        L_0x0013:
            yl2 r0 = new yl2
            r0.<init>(r6, r7)
        L_0x0018:
            java.lang.Object r7 = r0.a
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.c
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L_0x0039
            if (r2 == r4) goto L_0x0035
            if (r2 != r3) goto L_0x002d
            kotlin.ResultKt.throwOnFailure(r7)
            goto L_0x006e
        L_0x002d:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x0035:
            kotlin.ResultKt.throwOnFailure(r7)
            goto L_0x0067
        L_0x0039:
            kotlin.ResultKt.throwOnFailure(r7)
            a32 r7 = r6.E()
            if (r7 == 0) goto L_0x0068
            boolean r7 = r7.T()
            if (r7 != r4) goto L_0x0068
            a32 r7 = r6.E()
            if (r7 == 0) goto L_0x0055
            m72 r7 = r7.b
            if (r7 == 0) goto L_0x0055
            java.lang.String r7 = r7.I
            goto L_0x0056
        L_0x0055:
            r7 = r5
        L_0x0056:
            kotlin.Lazy r6 = r6.r
            java.lang.Object r6 = r6.getValue()
            sn7 r6 = (defpackage.sn7) r6
            r0.c = r4
            java.lang.Object r6 = r6.a(r7, r0)
            if (r6 != r1) goto L_0x0067
            return r1
        L_0x0067:
            return r5
        L_0x0068:
            r0.c = r3
            if (r1 != 0) goto L_0x006d
            return r1
        L_0x006d:
            r7 = r5
        L_0x006e:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.em2.t(kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final Unit u() {
        a32 E = E();
        fwb fwb = (fwb) this.e.a.getValue();
        if (E == null || fwb == null) {
            return Unit.INSTANCE;
        }
        List i2 = E.i();
        String h2 = E.h(kl0.b, jl0.a);
        owb owb = fwb.a;
        f(fwb.a(fwb, new owb(owb.a, owb.b, i2, h2, owb.e, owb.f, owb.g, owb.h, owb.i, owb.j), (List) null, 6));
        return Unit.INSTANCE;
    }

    public final Object v(long j2, boolean z, Continuation continuation) {
        Object I = ev0.I(((osa) ((gaf) this.h.getValue())).b(), new zl2(this, j2, z, (Continuation) null), continuation);
        return I == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? I : Unit.INSTANCE;
    }

    public final pa4 x() {
        wc8 wc8 = txb.b;
        r4c.b.getClass();
        return new pa4(":profile/avatars?id=" + this.a + "&type=local_chat");
    }

    public final h6c y() {
        owb owb;
        CharSequence charSequence;
        fwb fwb = (fwb) this.e.a.getValue();
        if (fwb == null || (owb = fwb.a) == null || (charSequence = owb.e) == null) {
            return null;
        }
        qr2 k2 = k();
        a32 E = E();
        Lazy lazy = this.q;
        if (E == null || !E.d()) {
            return ((swb) lazy.getValue()).a(charSequence, k2);
        }
        swb swb = (swb) lazy.getValue();
        swb.getClass();
        int ordinal = k2.ordinal();
        if (ordinal == 0) {
            kgf kgf = new kgf(lxa.n1, ArraysKt.toList((T[]) new Object[]{charSequence}));
            List createListBuilder = CollectionsKt.createListBuilder();
            createListBuilder.add(new pg3(jxa.Q, new igf(lxa.k1), og3.a));
            createListBuilder.add(new pg3(jxa.y, new igf(lxa.l1), og3.c));
            Unit unit = Unit.INSTANCE;
            return new c6c(kgf, (ngf) null, CollectionsKt.build(createListBuilder), (Bundle) null);
        } else if (ordinal == 1) {
            return swb.c();
        } else {
            if (ordinal == 2) {
                kgf kgf2 = new kgf(lxa.j1, ArraysKt.toList((T[]) new Object[]{charSequence}));
                igf igf = new igf(lxa.i1);
                List createListBuilder2 = CollectionsKt.createListBuilder();
                createListBuilder2.add(new pg3(jxa.Q, new igf(lxa.k1), og3.a));
                createListBuilder2.add(new pg3(jxa.y, new igf(lxa.l1), og3.c));
                Unit unit2 = Unit.INSTANCE;
                return new c6c(kgf2, igf, CollectionsKt.build(createListBuilder2), (Bundle) null);
            } else if (ordinal == 3) {
                return swb.c();
            } else {
                throw new NoWhenBranchMatchedException();
            }
        }
    }

    public final List z() {
        a32 E = E();
        if (E == null) {
            return CollectionsKt.emptyList();
        }
        boolean K = E.K();
        Lazy lazy = this.p;
        if (K) {
            nxb nxb = (nxb) lazy.getValue();
            boolean c0 = E.c0();
            boolean e0 = E.e0();
            boolean d0 = E.d0();
            nxb.getClass();
            List createListBuilder = CollectionsKt.createListBuilder();
            createListBuilder.add(nxb.a());
            if (e0) {
                createListBuilder.add((ow3) nxb.b.getValue());
            }
            if (d0) {
                createListBuilder.add((ow3) nxb.j.getValue());
            }
            if (c0) {
                createListBuilder.add((ow3) nxb.g.getValue());
            }
            return CollectionsKt.build(createListBuilder);
        } else if (!E.L()) {
            return CollectionsKt.emptyList();
        } else {
            nxb nxb2 = (nxb) lazy.getValue();
            boolean c02 = E.c0();
            nxb2.getClass();
            List createListBuilder2 = CollectionsKt.createListBuilder();
            createListBuilder2.add(nxb2.a());
            createListBuilder2.add((ow3) nxb2.b.getValue());
            createListBuilder2.add((ow3) nxb2.i.getValue());
            if (c02) {
                createListBuilder2.add((ow3) nxb2.f.getValue());
            }
            return CollectionsKt.build(createListBuilder2);
        }
    }
}
