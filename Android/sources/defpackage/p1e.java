package defpackage;

import android.util.SparseArray;
import android.view.ViewGroup;
import androidx.camera.camera2.internal.compat.quirk.TorchFlashRequiredFor3aUpdateQuirk;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.reflect.KProperty;
import one.me.keyboardmedia.stickers.KeyboardStickersWidget;

/* renamed from: p1e  reason: default package */
public final class p1e implements n1e, p28, xte, nj6, srf {
    public final Object a;

    public /* synthetic */ p1e(Object obj) {
        this.a = obj;
    }

    public void A(int i, long j) {
        ((wzg) this.a).T(i, j);
    }

    public void B(int i, Object obj, l2h l2h) {
        azg azg = (azg) obj;
        wzg wzg = (wzg) this.a;
        wzg.S((i << 3) | 2);
        wzg.S(azg.a(l2h));
        l2h.c(azg, wzg.m);
    }

    public p01 C(s28 s28, long j, long j2, IOException iOException, int i) {
        xv1 xv1 = (xv1) this.a;
        if (xv1 != null) {
            n64 n64 = (n64) xv1.b;
            n64.getClass();
            iq.a("Failed to resolve time offset.", iOException);
            n64.s(true);
        }
        return w28.w;
    }

    public void D(int i, int i2) {
        ((wzg) this.a).M(i, i2);
    }

    public void E(int i, long j) {
        ((wzg) this.a).O(i, j);
    }

    public /* bridge */ /* synthetic */ void a(Object obj) {
        Void voidR = (Void) obj;
    }

    public void b(gpe gpe) {
        ((jse) this.a).w.a(gpe);
    }

    public void c(mqe mqe) {
        zq7 zq7 = ((jse) this.a).w;
        zq7.getClass();
        KProperty[] kPropertyArr = KeyboardStickersWidget.z;
        hwe e0 = zq7.a.e0();
        aje u = ev0.u(e0.a, ((osa) e0.b).b(), f14.b, new ewe(e0, mqe, (Continuation) null));
        e0.x0.setValue(e0, hwe.z0[1], u);
    }

    public void d(long j, boolean z) {
        ((Function2) this.a).invoke(Long.valueOf(j), Boolean.valueOf(z));
    }

    public void e(boolean z) {
        hz0 hz0 = (hz0) this.a;
        voc voc = hz0.T0;
        voc.log("OKRTCCall", "Screen capture has stopped, fast=" + z);
        hz0.y.post(new c70((Object) this, z, 15));
    }

    public void f(gpe gpe) {
        sr8 sr8 = (sr8) ((jse) this.a).w.a.b.getValue();
        long j = gpe.a;
        sr8.getClass();
        or8 or8 = new or8(j);
        s85 s85 = sr8.v;
        xag.h(s85, or8);
        xag.h(s85, nr8.a);
    }

    public void g(Throwable th) {
        t6f t6f;
        t6f t6f2 = (t6f) this.a;
        u6f u6f = (u6f) t6f2;
        synchronized (u6f.a) {
            try {
                List<lk4> list = u6f.j;
                if (list != null) {
                    for (lk4 b : list) {
                        b.b();
                    }
                    u6f.j = null;
                }
            } finally {
                while (true) {
                }
            }
        }
        u6f.t.d();
        kq9 kq9 = t6f2.b;
        Iterator it = kq9.g().iterator();
        while (it.hasNext() && (t6f = (t6f) it.next()) != t6f2) {
            u6f u6f2 = (u6f) t6f;
            synchronized (u6f2.a) {
                try {
                    List<lk4> list2 = u6f2.j;
                    if (list2 != null) {
                        for (lk4 b2 : list2) {
                            b2.b();
                        }
                        u6f2.j = null;
                    }
                } catch (Throwable th2) {
                    while (true) {
                        throw th2;
                    }
                }
            }
            u6f2.t.d();
        }
        synchronized (kq9.b) {
            ((LinkedHashSet) kq9.v).remove(t6f2);
        }
    }

    /* JADX WARNING: type inference failed for: r2v3, types: [hh8] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public defpackage.trf h(android.content.Context r14, defpackage.m53 r15, defpackage.rx0 r16, defpackage.k6g r17, defpackage.t9a r18, java.util.List r19, long r20) {
        /*
            r13 = this;
            dp4 r6 = defpackage.dp4.a
            r0 = 0
            r1 = 0
            r9 = r0
        L_0x0005:
            int r0 = r19.size()
            if (r1 >= r0) goto L_0x001d
            r0 = r19
            java.lang.Object r2 = r0.get(r1)
            hh8 r2 = (defpackage.hh8) r2
            boolean r3 = r2 instanceof defpackage.vtb
            if (r3 == 0) goto L_0x001a
            r9 = r2
            vtb r9 = (defpackage.vtb) r9
        L_0x001a:
            int r1 = r1 + 1
            goto L_0x0005
        L_0x001d:
            rrf r12 = new rrf
            r0 = r13
            java.lang.Object r0 = r0.a
            r2 = r0
            v5g r2 = (defpackage.v5g) r2
            r8 = 1
            r0 = r12
            r1 = r14
            r3 = r15
            r4 = r17
            r5 = r16
            r7 = r18
            r10 = r20
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.p1e.h(android.content.Context, m53, rx0, k6g, t9a, java.util.List, long):trf");
    }

    public void i(int i, int i2) {
        wzg wzg = (wzg) this.a;
        wzg.S(i << 3);
        wzg.S((i2 >> 31) ^ (i2 + i2));
    }

    public void j(int i, long j) {
        wzg wzg = (wzg) this.a;
        wzg.T(i, (j >> 63) ^ (j + j));
    }

    public void k(int i, List list) {
        boolean z = list instanceof c1h;
        int i2 = 0;
        wzg wzg = (wzg) this.a;
        if (z) {
            c1h c1h = (c1h) list;
            while (i2 < list.size()) {
                Object k = c1h.k(i2);
                if (k instanceof String) {
                    wzg.Q(i, (String) k);
                } else {
                    wzg.L(i, (fzg) k);
                }
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            wzg.Q(i, (String) list.get(i2));
            i2++;
        }
    }

    public void l(int i, int i2) {
        wzg wzg = (wzg) this.a;
        wzg.S(i << 3);
        wzg.S(i2);
    }

    public void m(int i, long j) {
        ((wzg) this.a).T(i, j);
    }

    public void n(s28 s28, long j, long j2, boolean z) {
    }

    public void o(int i, boolean z) {
        wzg wzg = (wzg) this.a;
        wzg.S(i << 3);
        wzg.J(z ? (byte) 1 : 0);
    }

    public void p(int i, fzg fzg) {
        ((wzg) this.a).L(i, fzg);
    }

    public void q(int i, List list) {
        for (int i2 = 0; i2 < list.size(); i2++) {
            ((wzg) this.a).L(i, (fzg) list.get(i2));
        }
    }

    public void r(double d, int i) {
        ((wzg) this.a).O(i, Double.doubleToRawLongBits(d));
    }

    public void t(int i, int i2) {
        wzg wzg = (wzg) this.a;
        wzg.S(i << 3);
        if (i2 >= 0) {
            wzg.S(i2);
        } else {
            wzg.U((long) i2);
        }
    }

    public void u(s28 s28, long j, long j2) {
        boolean z;
        xv1 xv1 = (xv1) this.a;
        if (xv1 != null) {
            synchronized (h88.f) {
                z = h88.g;
            }
            if (!z) {
                IOException iOException = new IOException(new ConcurrentModificationException());
                n64 n64 = (n64) xv1.b;
                n64.getClass();
                iq.a("Failed to resolve time offset.", iOException);
                n64.s(true);
                return;
            }
            xv1.u();
        }
    }

    public void v(int i, int i2) {
        ((wzg) this.a).M(i, i2);
    }

    public void w(int i, long j) {
        ((wzg) this.a).O(i, j);
    }

    public void x(float f, int i) {
        ((wzg) this.a).M(i, Float.floatToRawIntBits(f));
    }

    public void y(int i, Object obj, l2h l2h) {
        wzg wzg = (wzg) this.a;
        wzg.R(i, 3);
        l2h.c((azg) obj, wzg.m);
        wzg.R(i, 4);
    }

    public void z(int i, int i2) {
        wzg wzg = (wzg) this.a;
        wzg.S(i << 3);
        if (i2 >= 0) {
            wzg.S(i2);
        } else {
            wzg.U((long) i2);
        }
    }

    public p1e(wzg wzg) {
        Charset charset = y0h.a;
        this.a = wzg;
        wzg.m = this;
    }

    public p1e(ViewGroup viewGroup) {
        this.a = viewGroup.getOverlay();
    }

    public p1e() {
        this.a = new SparseArray();
    }

    public p1e(ykb ykb) {
        this.a = (TorchFlashRequiredFor3aUpdateQuirk) ykb.g(TorchFlashRequiredFor3aUpdateQuirk.class);
    }
}
