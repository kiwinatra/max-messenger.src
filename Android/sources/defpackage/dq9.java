package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.ArrayList;
import java.util.List;

/* renamed from: dq9  reason: default package */
public final class dq9 extends ok0 implements Handler.Callback {
    public boolean A0;
    public boolean B0;
    public long C0;
    public long D0;
    public rp9 E0;
    public final wc8 v0;
    public final mc5 w0;
    public final Handler x0;
    public final wp9 y0;
    public kr7 z0;

    /* JADX WARNING: type inference failed for: r3v2, types: [wp9, aa4] */
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public dq9(mc5 mc5, Looper looper) {
        super(5);
        Handler handler;
        wc8 wc8 = wc8.o;
        this.w0 = mc5;
        if (looper == null) {
            handler = null;
        } else {
            int i = t0g.a;
            handler = new Handler(looper, this);
        }
        this.x0 = handler;
        this.v0 = wc8;
        this.y0 = new aa4(1);
        this.D0 = -9223372036854775807L;
    }

    public final int A(ca6 ca6) {
        if (!this.v0.u(ca6)) {
            return ok0.b(0, 0, 0);
        }
        return ok0.b(ca6.N0 == 0 ? 4 : 2, 0, 0);
    }

    public final void C(rp9 rp9, ArrayList arrayList) {
        int i = 0;
        while (true) {
            pp9[] pp9Arr = rp9.a;
            if (i < pp9Arr.length) {
                ca6 h = pp9Arr[i].h();
                if (h != null) {
                    wc8 wc8 = this.v0;
                    if (wc8.u(h)) {
                        kr7 e = wc8.e(h);
                        byte[] n = pp9Arr[i].n();
                        n.getClass();
                        wp9 wp9 = this.y0;
                        wp9.z();
                        wp9.B(n.length);
                        wp9.o.put(n);
                        wp9.C();
                        rp9 o = e.o(wp9);
                        if (o != null) {
                            C(o, arrayList);
                        }
                        i++;
                    }
                }
                arrayList.add(pp9Arr[i]);
                i++;
            } else {
                return;
            }
        }
    }

    public final void D(rp9 rp9) {
        mc5 mc5 = this.w0;
        sc5 sc5 = mc5.a;
        rs8 a = sc5.h1.a();
        int i = 0;
        while (true) {
            pp9[] pp9Arr = rp9.a;
            if (i >= pp9Arr.length) {
                break;
            }
            pp9Arr[i].o(a);
            i++;
        }
        sc5.h1 = new ts8(a);
        ts8 n1 = sc5.n1();
        boolean equals = n1.equals(sc5.S0);
        d23 d23 = sc5.Z;
        if (!equals) {
            sc5.S0 = n1;
            d23.q(14, new rt3(29, (Object) mc5));
        }
        d23.q(28, new lc5(1, (Object) rp9));
        d23.h();
    }

    public final boolean handleMessage(Message message) {
        if (message.what == 0) {
            D((rp9) message.obj);
            return true;
        }
        throw new IllegalStateException();
    }

    public final String k() {
        return "MetadataRenderer";
    }

    public final boolean m() {
        return this.B0;
    }

    public final boolean n() {
        return true;
    }

    public final void o() {
        this.E0 = null;
        this.D0 = -9223372036854775807L;
        this.z0 = null;
    }

    public final void q(long j, boolean z) {
        this.E0 = null;
        this.D0 = -9223372036854775807L;
        this.A0 = false;
        this.B0 = false;
    }

    public final void u(ca6[] ca6Arr, long j, long j2) {
        this.z0 = this.v0.e(ca6Arr[0]);
    }

    public final void w(long j, long j2) {
        boolean z = true;
        while (z) {
            if (!this.A0 && this.E0 == null) {
                wp9 wp9 = this.y0;
                wp9.z();
                xe8 xe8 = this.b;
                xe8.j();
                int v = v(xe8, wp9, 0);
                if (v == -4) {
                    if (wp9.h(4)) {
                        this.A0 = true;
                    } else {
                        wp9.X = this.C0;
                        wp9.C();
                        kr7 kr7 = this.z0;
                        int i = t0g.a;
                        rp9 o = kr7.o(wp9);
                        if (o != null) {
                            ArrayList arrayList = new ArrayList(o.a.length);
                            C(o, arrayList);
                            if (!arrayList.isEmpty()) {
                                this.E0 = new rp9((List) arrayList);
                                this.D0 = wp9.w;
                            }
                        }
                    }
                } else if (v == -5) {
                    ca6 ca6 = (ca6) xe8.c;
                    ca6.getClass();
                    this.C0 = ca6.y0;
                }
            }
            rp9 rp9 = this.E0;
            if (rp9 == null || this.D0 > j) {
                z = false;
            } else {
                Handler handler = this.x0;
                if (handler != null) {
                    handler.obtainMessage(0, rp9).sendToTarget();
                } else {
                    D(rp9);
                }
                this.E0 = null;
                this.D0 = -9223372036854775807L;
                z = true;
            }
            if (this.A0 && this.E0 == null) {
                this.B0 = true;
            }
        }
    }
}
