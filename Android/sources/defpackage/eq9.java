package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.ArrayList;

/* renamed from: eq9  reason: default package */
public final class eq9 extends pk0 implements Handler.Callback {
    public final js9 A0;
    public final nc5 B0;
    public final Handler C0;
    public final xp9 D0;
    public m58 E0;
    public boolean F0;
    public boolean G0;
    public long H0;
    public sp9 I0;
    public long J0;

    /* JADX WARNING: type inference failed for: r3v2, types: [xp9, ba4] */
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public eq9(nc5 nc5, Looper looper) {
        super(5);
        Handler handler;
        js9 js9 = js9.v;
        this.B0 = nc5;
        if (looper == null) {
            handler = null;
        } else {
            int i = v0g.a;
            handler = new Handler(looper, this);
        }
        this.C0 = handler;
        this.A0 = js9;
        this.D0 = new ba4(1);
        this.J0 = -9223372036854775807L;
    }

    public final int D(ea6 ea6) {
        if (!this.A0.m(ea6)) {
            return pk0.b(0, 0, 0, 0);
        }
        return pk0.b(ea6.K == 0 ? 4 : 2, 0, 0, 0);
    }

    public final void F(sp9 sp9, ArrayList arrayList) {
        int i = 0;
        while (true) {
            qp9[] qp9Arr = sp9.a;
            if (i < qp9Arr.length) {
                ea6 h = qp9Arr[i].h();
                if (h != null) {
                    js9 js9 = this.A0;
                    if (js9.m(h)) {
                        m58 d = js9.d(h);
                        byte[] n = qp9Arr[i].n();
                        n.getClass();
                        xp9 xp9 = this.D0;
                        xp9.z();
                        xp9.B(n.length);
                        xp9.v.put(n);
                        xp9.C();
                        sp9 k = d.k(xp9);
                        if (k != null) {
                            F(k, arrayList);
                        }
                        i++;
                    }
                }
                arrayList.add(qp9Arr[i]);
                i++;
            } else {
                return;
            }
        }
    }

    public final long G(long j) {
        boolean z = false;
        n79.n(j != -9223372036854775807L);
        if (this.J0 != -9223372036854775807L) {
            z = true;
        }
        n79.n(z);
        return j - this.J0;
    }

    public final void H(sp9 sp9) {
        nc5 nc5 = this.B0;
        tc5 tc5 = nc5.a;
        ss8 a = tc5.n1.a();
        int i = 0;
        while (true) {
            qp9[] qp9Arr = sp9.a;
            if (i >= qp9Arr.length) {
                break;
            }
            qp9Arr[i].u(a);
            i++;
        }
        tc5.n1 = a.a();
        us8 p1 = tc5.p1();
        boolean equals = p1.equals(tc5.V0);
        m56 m56 = tc5.Z;
        if (!equals) {
            tc5.V0 = p1;
            m56.j(14, new lc5(0, (Object) nc5));
        }
        m56.j(28, new lc5(2, (Object) sp9));
        m56.h();
    }

    public final boolean handleMessage(Message message) {
        if (message.what == 1) {
            H((sp9) message.obj);
            return true;
        }
        throw new IllegalStateException();
    }

    public final String l() {
        return "MetadataRenderer";
    }

    public final boolean n() {
        return this.G0;
    }

    public final boolean p() {
        return true;
    }

    public final void q() {
        this.I0 = null;
        this.E0 = null;
        this.J0 = -9223372036854775807L;
    }

    public final void s(long j, boolean z) {
        this.I0 = null;
        this.F0 = false;
        this.G0 = false;
    }

    public final void x(ea6[] ea6Arr, long j, long j2) {
        this.E0 = this.A0.d(ea6Arr[0]);
        sp9 sp9 = this.I0;
        if (sp9 != null) {
            long j3 = this.J0;
            long j4 = sp9.b;
            long j5 = (j3 + j4) - j2;
            if (j4 != j5) {
                sp9 = new sp9(j5, sp9.a);
            }
            this.I0 = sp9;
        }
        this.J0 = j2;
    }

    public final void z(long j, long j2) {
        boolean z = true;
        while (z) {
            if (!this.F0 && this.I0 == null) {
                xp9 xp9 = this.D0;
                xp9.z();
                ox0 ox0 = this.c;
                ox0.u();
                int y = y(ox0, xp9, 0);
                if (y == -4) {
                    if (xp9.h(4)) {
                        this.F0 = true;
                    } else if (xp9.x >= this.Z) {
                        xp9.Y = this.H0;
                        xp9.C();
                        m58 m58 = this.E0;
                        int i = v0g.a;
                        sp9 k = m58.k(xp9);
                        if (k != null) {
                            ArrayList arrayList = new ArrayList(k.a.length);
                            F(k, arrayList);
                            if (!arrayList.isEmpty()) {
                                this.I0 = new sp9(G(xp9.x), (qp9[]) arrayList.toArray(new qp9[0]));
                            }
                        }
                    }
                } else if (y == -5) {
                    ea6 ea6 = (ea6) ox0.b;
                    ea6.getClass();
                    this.H0 = ea6.s;
                }
            }
            sp9 sp9 = this.I0;
            if (sp9 == null || sp9.b > G(j)) {
                z = false;
            } else {
                sp9 sp92 = this.I0;
                Handler handler = this.C0;
                if (handler != null) {
                    handler.obtainMessage(1, sp92).sendToTarget();
                } else {
                    H(sp92);
                }
                this.I0 = null;
                z = true;
            }
            if (this.F0 && this.I0 == null) {
                this.G0 = true;
            }
        }
    }
}
