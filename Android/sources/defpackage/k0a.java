package defpackage;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import java.util.Collections;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import ru.ok.messages.constructor.MessageConstructorView;
import ru.ok.messages.stickers.FrgGifsLoader;
import ru.ok.messages.stickers.FrgStickersLoader;

/* renamed from: k0a  reason: default package */
public final class k0a extends w1 {
    public final a32 X = null;
    public or7 Y;
    public long Z;
    public final n99 b;
    public final h48 c;
    public final lk3 o;
    public final p99 v;
    public final km3 w;
    public final nd x;
    public final yva y;
    public final i1a z;

    public k0a(n99 n99, p99 p99, po5 po5, lk3 lk3, yva yva, FrgStickersLoader frgStickersLoader, FrgGifsLoader frgGifsLoader, mre mre, ni3 ni3, e4 e4Var, jd8 jd8, ltb ltb, h48 h48, bcf bcf, km3 km3, nd ndVar, moe moe, jbf jbf, ai5 ai5, ve4 ve4, n1a n1a) {
        this.b = n99;
        this.v = p99;
        this.y = yva;
        this.w = km3;
        this.x = ndVar;
        this.o = lk3;
        sff a = tff.o.a();
        a.k = true;
        tff tff = new tff(a);
        Lazy lazy = LazyKt.lazy(new c28(16, n1a));
        if (lazy != null) {
            i1a i1a = r1;
            i1a i1a2 = new i1a(this, tff, frgStickersLoader, frgGifsLoader, mre, ni3, e4Var, jd8, ltb, h48, moe, yva, jbf, ai5, ve4, lazy);
            this.z = i1a;
            p1a p1a = i1a.c;
            i1a i1a3 = i1a;
            n1a n1a2 = n1a;
            n1a2.a(p1a);
            n1a2.b(i1a3);
            this.c = h48;
            p99.getClass();
            p99 p992 = p99;
            try {
                p992.a.d(p992);
            } catch (Exception e) {
                z68.f("p99", "register: exception", e);
            }
            p992.f = this;
            return;
        }
        throw new NullPointerException("suggestsInput is null");
    }

    public final String W() {
        i1a i1a = this.z;
        return i1a == null ? "" : i1a.c.a0();
    }

    public final List X(CharSequence charSequence) {
        a32 a32 = this.X;
        if (a32 == null || cvg.A(charSequence)) {
            return null;
        }
        yva yva = this.y;
        yva.getClass();
        m72 m72 = a32.b;
        boolean z2 = m72.e.size() >= m72.c();
        wa9 wa9 = wa9.a;
        return yva.o.c(charSequence, z2);
    }

    public final void Y(k50 k50) {
        a0(new ur0((cbe) k50));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x004f, code lost:
        if ((r2 == null ? false : r2.x0.Z()) != false) goto L_0x005a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void Z() {
        /*
            r7 = this;
            boolean r0 = r7.U()
            if (r0 != 0) goto L_0x0007
            return
        L_0x0007:
            i1a r0 = r7.z
            r0.d()
            k1a r1 = r0.f
            r1.getClass()
            sv0 r2 = r1.v     // Catch:{ Exception -> 0x0016 }
            r2.d(r1)     // Catch:{ Exception -> 0x0016 }
        L_0x0016:
            boolean r2 = r1.U()
            if (r2 == 0) goto L_0x003d
            f2a r2 = r1.a
            i3a r2 = (defpackage.i3a) r2
            boolean r3 = r2.c0()
            if (r3 != 0) goto L_0x0027
            goto L_0x003a
        L_0x0027:
            ok8 r3 = r2.w0
            int r3 = r3.getScrollState()
            if (r3 != 0) goto L_0x0035
            g5b r2 = r2.x0
            r2.j()
            goto L_0x003a
        L_0x0035:
            ok8 r2 = r2.w0
            r2.x()
        L_0x003a:
            r1.Y()
        L_0x003d:
            f2a r2 = r1.a
            if (r2 == 0) goto L_0x0052
            i3a r2 = (defpackage.i3a) r2
            ok8 r2 = r2.w0
            if (r2 != 0) goto L_0x0049
            r2 = 0
            goto L_0x004f
        L_0x0049:
            b4a r2 = r2.x0
            boolean r2 = r2.Z()
        L_0x004f:
            if (r2 == 0) goto L_0x0052
            goto L_0x005a
        L_0x0052:
            j1a r2 = new j1a
            r2.<init>(r1)
            r1.V(r2)
        L_0x005a:
            zj0 r1 = new zj0
            r2 = 19
            r1.<init>(r2)
            h1a r2 = r0.d
            r2.V(r1)
            a2a r1 = r0.e
            r1.getClass()
            sv0 r2 = r1.w     // Catch:{ Exception -> 0x0070 }
            r2.d(r1)     // Catch:{ Exception -> 0x0070 }
        L_0x0070:
            mre r2 = r1.o
            java.util.Set r3 = r2.b
            r3.add(r1)
            i1a r3 = r1.v
            k0a r3 = r3.a
            r3.getClass()
            r1.a0()
            boolean r3 = r1.U()
            r4 = 2
            r5 = 1
            if (r3 != 0) goto L_0x008b
            goto L_0x0156
        L_0x008b:
            f2a r3 = r1.a
            j4a r3 = (defpackage.j4a) r3
            ru.ok.messages.stickers.widgets.StickersView r3 = r3.x0
            ose r3 = r3.getCurrentInputType()
            int r3 = r3.ordinal()
            if (r3 == 0) goto L_0x0131
            if (r3 == r5) goto L_0x00ed
            if (r3 != r4) goto L_0x00cd
            f2a r1 = r1.a
            j4a r1 = (defpackage.j4a) r1
            java.util.concurrent.atomic.AtomicReference r3 = r2.i
            java.lang.Object r3 = r3.get()
            lre r3 = (defpackage.lre) r3
            java.lang.Object r3 = r3.b
            java.util.List r3 = (java.util.List) r3
            cre r2 = r2.a
            ao1 r2 = r2.j
            boolean r2 = defpackage.jbd.d(r2)
            r2 = r2 ^ r5
            ru.ok.messages.stickers.widgets.StickersView r1 = r1.x0
            ose r6 = defpackage.ose.STICKER_SETS
            rse r1 = r1.v
            c0 r1 = r1.E(r6)
            boolean r6 = r1 instanceof defpackage.yqe
            if (r6 == 0) goto L_0x0156
            yqe r1 = (defpackage.yqe) r1
            r1.b(r3, r2)
            goto L_0x0156
        L_0x00cd:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.util.Locale r0 = java.util.Locale.ENGLISH
            f2a r0 = r1.a
            j4a r0 = (defpackage.j4a) r0
            ru.ok.messages.stickers.widgets.StickersView r0 = r0.x0
            ose r0 = r0.getCurrentInputType()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Unexpected value: "
            r1.<init>(r2)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            r7.<init>(r0)
            throw r7
        L_0x00ed:
            ru.ok.messages.stickers.FrgGifsLoader r2 = r1.c
            java.util.ArrayList r3 = r2.C1
            java.util.List r3 = java.util.Collections.unmodifiableList(r3)
            boolean r3 = r3.isEmpty()
            if (r3 == 0) goto L_0x0111
            f2a r3 = r1.a
            j4a r3 = (defpackage.j4a) r3
            java.lang.CharSequence r3 = r3.Z()
            boolean r3 = defpackage.cvg.A(r3)
            if (r3 == 0) goto L_0x0111
            boolean r3 = r2.J1
            if (r3 != 0) goto L_0x0111
            r2.j3()
            goto L_0x0156
        L_0x0111:
            f2a r1 = r1.a
            j4a r1 = (defpackage.j4a) r1
            java.util.ArrayList r3 = r2.C1
            java.util.List r3 = java.util.Collections.unmodifiableList(r3)
            boolean r2 = r2.J1
            ru.ok.messages.stickers.widgets.StickersView r1 = r1.x0
            ose r6 = defpackage.ose.GIFS
            rse r1 = r1.v
            c0 r1 = r1.E(r6)
            boolean r6 = r1 instanceof defpackage.wr6
            if (r6 == 0) goto L_0x0156
            wr6 r1 = (defpackage.wr6) r1
            r1.b(r3, r2)
            goto L_0x0156
        L_0x0131:
            ru.ok.messages.stickers.FrgStickersLoader r2 = r1.b
            java.util.List r3 = r2.D1
            boolean r6 = r3.isEmpty()
            if (r6 == 0) goto L_0x014d
            f2a r6 = r1.a
            j4a r6 = (defpackage.j4a) r6
            java.lang.CharSequence r6 = r6.Z()
            boolean r6 = defpackage.cvg.A(r6)
            if (r6 == 0) goto L_0x014d
            r2.h3()
            goto L_0x0156
        L_0x014d:
            f2a r1 = r1.a
            j4a r1 = (defpackage.j4a) r1
            ru.ok.messages.stickers.widgets.StickersView r1 = r1.x0
            r1.setStickers((java.util.List<defpackage.vte>) r3)
        L_0x0156:
            p1a r1 = r0.c
            f2a r1 = r1.a
            if (r1 != 0) goto L_0x015d
            goto L_0x0173
        L_0x015d:
            s3a r1 = (defpackage.s3a) r1
            mu8 r2 = r1.w
            s60 r3 = r1.v
            r2.z(r3)
            java.util.Set r2 = r3.k
            r2.add(r1)
            r3.p()
            sv0 r1 = r3.h     // Catch:{ Exception -> 0x0173 }
            r1.d(r3)     // Catch:{ Exception -> 0x0173 }
        L_0x0173:
            kotlin.Lazy r0 = r0.g
            java.lang.Object r0 = r0.getValue()
            n1a r0 = (defpackage.n1a) r0
            r0.e()
            f2a r0 = r7.a
            l2a r0 = (defpackage.l2a) r0
            int r1 = r0.w0
            p99 r2 = r7.v
            if (r1 != r4) goto L_0x0192
            java.util.concurrent.CopyOnWriteArrayList r7 = r2.g
            java.util.List r7 = java.util.Collections.unmodifiableList(r7)
            r0.d0(r7)
            goto L_0x01b4
        L_0x0192:
            r0 = 3
            if (r1 != r0) goto L_0x01b4
            r7.e0()
            om0 r0 = r2.k
            java.lang.Object r0 = r0.J()
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            boolean r0 = defpackage.cvg.A(r0)
            r0 = r0 ^ r5
            if (r0 == 0) goto L_0x01ab
            r7.d0()
            goto L_0x01b4
        L_0x01ab:
            f2a r7 = r7.a
            l2a r7 = (defpackage.l2a) r7
            ru.ok.messages.constructor.MessageConstructorView r7 = r7.x
            r7.h()
        L_0x01b4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.k0a.Z():void");
    }

    public final void a0(ur0 ur0) {
        d8b d8b;
        View focusedChild;
        z68.c("k0a", "sendMedia: medias = %d, ttl = %d, caption = %s, collage = %b", Integer.valueOf(((List) ur0.d).size()), Integer.valueOf(ur0.b), (CharSequence) ur0.e, Boolean.valueOf(ur0.c));
        i1a i1a = this.z;
        if (i1a != null) {
            f2a f2a = i1a.c.a;
            if (f2a != null) {
                Context context = (Context) ((s3a) f2a).b;
                if (context instanceof Activity) {
                    hd8.B((Activity) context);
                }
            }
            i3a i3a = (i3a) i1a.f.a;
            if (i3a.c0() && (focusedChild = i3a.w0.getFocusedChild()) != null) {
                hd8.C(focusedChild.getContext(), focusedChild);
            }
            f2a f2a2 = i1a.d.a;
            if (!(f2a2 == null || (d8b = ((u2a) f2a2).X) == null)) {
                d8b.d();
            }
            i1a.a();
        }
        W();
        List X2 = X(i1a.c.Y());
        this.o.getClass();
        kk3 kk3 = new kk3(3);
        kk3.c = X2;
        c0(new kk3(kk3));
    }

    public final void b0(long[] jArr) {
        ck3 b2 = this.v.b(this.Z);
        if (b2 != null) {
            this.x.f("CONSTRUCTOR_SEND", b2.o);
        }
        z68.c("p99", "sendToChat: messages is empty", new Object[0]);
    }

    public final void c0(kk3 kk3) {
        long j = this.Z;
        a32 a32 = this.X;
        if (a32 != null) {
            long j2 = a32.a;
        }
        this.v.getClass();
        Long valueOf = Long.valueOf(j);
        int i = kk3.b;
        z68.c("p99", "sendToConstructor, constructorId = %d, paramsType = %s", valueOf, g63.q(i));
        tr1.y(i);
    }

    public final void d0() {
        l2a l2a = (l2a) this.a;
        p99 p99 = this.v;
        p99.getClass();
        List emptyList = Collections.emptyList();
        String str = p99.h;
        String str2 = p99.i;
        l2a.w0 = 3;
        l2a.y.setState(ik3.b);
        l2a.x.g(str, str2, emptyList);
        if (l2a.y.getScrollState() == 0) {
            l2a.y.post(new j2a(l2a, 0));
        }
    }

    public final void e0() {
        ck3 b2 = this.v.b(this.Z);
        a32 a32 = this.X;
        String r = a32 != null ? a32.r() : null;
        l2a l2a = (l2a) this.a;
        l2a.w0 = 3;
        MessageConstructorView messageConstructorView = l2a.x;
        messageConstructorView.L0.setText(messageConstructorView.A0.k.c(b2.c));
        if (!cvg.A(r)) {
            messageConstructorView.M0.setText(r);
            messageConstructorView.M0.setVisibility(0);
            iq.u(messageConstructorView.L0, 0);
        } else {
            messageConstructorView.M0.setVisibility(8);
            iq.u(messageConstructorView.L0, messageConstructorView.o.k);
        }
        messageConstructorView.N0.b(((qra) ym.e()).m().p(b2.a, false), false);
        l2a.y.setState(ik3.b);
        if (l2a.y.getScrollState() != 2) {
            l2a.y.post(new j2a(l2a, 2));
        }
    }

    public final void f0(long j) {
        z68.c("k0a", "startConstructor: constructorId = %d", Long.valueOf(j));
        if (this.a != null) {
            this.Z = j;
            e0();
            ((l2a) this.a).x.h();
            h48 h48 = this.c;
            CharSequence charSequence = h48.f.j;
            if (charSequence != null) {
                charSequence.toString();
            }
            h48.f.q();
            X(this.z.c.Y());
            this.o.getClass();
            long j2 = this.Z;
            a32 a32 = this.X;
            if (a32 != null) {
                long j3 = a32.a;
            }
            this.v.getClass();
            z68.c("p99", "sendToConstructor, constructorId = %d, paramsType = %s", Long.valueOf(j2), g63.q(1));
            tr1.y(1);
        }
    }
}
