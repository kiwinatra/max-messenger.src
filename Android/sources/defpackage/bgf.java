package defpackage;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Parcel;
import androidx.media3.extractor.text.SubtitleDecoderException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Objects;
import kotlin.jvm.internal.LongCompanionObject;

/* renamed from: bgf  reason: default package */
public final class bgf extends pk0 implements Handler.Callback {
    public final cd4 A0;
    public final ba4 B0;
    public p44 C0;
    public final yye D0;
    public boolean E0;
    public int F0;
    public xye G0;
    public cze H0;
    public eze I0;
    public eze J0;
    public int K0;
    public final Handler L0;
    public final nc5 M0;
    public final ox0 N0;
    public boolean O0;
    public boolean P0;
    public ea6 Q0;
    public long R0;
    public long S0;
    public long T0;

    /* JADX WARNING: type inference failed for: r3v2, types: [cd4, java.lang.Object] */
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public bgf(nc5 nc5, Looper looper) {
        super(3);
        Handler handler;
        yu9 yu9 = yye.c0;
        this.M0 = nc5;
        if (looper == null) {
            handler = null;
        } else {
            int i = v0g.a;
            handler = new Handler(looper, this);
        }
        this.L0 = handler;
        this.D0 = yu9;
        this.A0 = new Object();
        this.B0 = new ba4(1);
        this.N0 = new ox0(12, false);
        this.T0 = -9223372036854775807L;
        this.R0 = -9223372036854775807L;
        this.S0 = -9223372036854775807L;
    }

    public final int D(ea6 ea6) {
        if (!Objects.equals(ea6.n, "application/x-media3-cues")) {
            yu9 yu9 = (yu9) this.D0;
            yu9.getClass();
            if (!((ece) yu9.b).k(ea6)) {
                String str = ea6.n;
                if (!Objects.equals(str, "application/cea-608") && !Objects.equals(str, "application/x-mp4-cea-608") && !Objects.equals(str, "application/cea-708")) {
                    return vq9.j(str) ? pk0.b(1, 0, 0, 0) : pk0.b(0, 0, 0, 0);
                }
            }
        }
        return pk0.b(ea6.K == 0 ? 4 : 2, 0, 0, 0);
    }

    public final void F() {
        boolean z = Objects.equals(this.Q0.n, "application/cea-608") || Objects.equals(this.Q0.n, "application/x-mp4-cea-608") || Objects.equals(this.Q0.n, "application/cea-708");
        n79.m("Legacy decoding is disabled, can't handle " + this.Q0.n + " samples (expected application/x-media3-cues).", z);
    }

    public final long G() {
        if (this.K0 == -1) {
            return LongCompanionObject.MAX_VALUE;
        }
        this.I0.getClass();
        return this.K0 >= this.I0.t() ? LongCompanionObject.MAX_VALUE : this.I0.k(this.K0);
    }

    public final long H(long j) {
        boolean z = false;
        n79.n(j != -9223372036854775807L);
        if (this.R0 != -9223372036854775807L) {
            z = true;
        }
        n79.n(z);
        return j - this.R0;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0030, code lost:
        if (r3.equals("application/cea-608") == false) goto L_0x001d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void I() {
        /*
            r7 = this;
            r0 = 1
            r7.E0 = r0
            ea6 r1 = r7.Q0
            r1.getClass()
            yye r2 = r7.D0
            yu9 r2 = (defpackage.yu9) r2
            r2.getClass()
            java.lang.String r3 = r1.n
            if (r3 == 0) goto L_0x004f
            int r4 = r1.G
            r5 = -1
            int r6 = r3.hashCode()
            switch(r6) {
                case 930165504: goto L_0x0033;
                case 1566015601: goto L_0x002a;
                case 1566016562: goto L_0x001f;
                default: goto L_0x001d;
            }
        L_0x001d:
            r0 = r5
            goto L_0x003d
        L_0x001f:
            java.lang.String r0 = "application/cea-708"
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L_0x0028
            goto L_0x001d
        L_0x0028:
            r0 = 2
            goto L_0x003d
        L_0x002a:
            java.lang.String r6 = "application/cea-608"
            boolean r6 = r3.equals(r6)
            if (r6 != 0) goto L_0x003d
            goto L_0x001d
        L_0x0033:
            java.lang.String r0 = "application/x-mp4-cea-608"
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L_0x003c
            goto L_0x001d
        L_0x003c:
            r0 = 0
        L_0x003d:
            switch(r0) {
                case 0: goto L_0x0049;
                case 1: goto L_0x0049;
                case 2: goto L_0x0041;
                default: goto L_0x0040;
            }
        L_0x0040:
            goto L_0x004f
        L_0x0041:
            my1 r0 = new my1
            java.util.List r1 = r1.q
            r0.<init>(r4, r1)
            goto L_0x0070
        L_0x0049:
            fy1 r0 = new fy1
            r0.<init>(r3, r4)
            goto L_0x0070
        L_0x004f:
            java.lang.Object r0 = r2.b
            ece r0 = (defpackage.ece) r0
            boolean r2 = r0.k(r1)
            if (r2 == 0) goto L_0x0078
            ize r0 = r0.t(r1)
            co0 r1 = new co0
            java.lang.Class r2 = r0.getClass()
            java.lang.String r2 = r2.getSimpleName()
            java.lang.String r3 = "Decoder"
            r2.concat(r3)
            r1.<init>((defpackage.ize) r0)
            r0 = r1
        L_0x0070:
            r7.G0 = r0
            long r1 = r7.Z
            r0.a(r1)
            return
        L_0x0078:
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Attempted to create decoder for unsupported MIME type: "
            java.lang.String r0 = defpackage.a81.m(r0, r3)
            r7.<init>(r0)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bgf.I():void");
    }

    public final void K(o44 o44) {
        tb7 tb7 = o44.a;
        nc5 nc5 = this.M0;
        nc5.a.Z.m(27, new x52(9, tb7));
        tc5 tc5 = nc5.a;
        tc5.g1 = o44;
        tc5.Z.m(27, new rt3(28, (Object) o44));
    }

    public final void L() {
        this.H0 = null;
        this.K0 = -1;
        eze eze = this.I0;
        if (eze != null) {
            eze.A();
            this.I0 = null;
        }
        eze eze2 = this.J0;
        if (eze2 != null) {
            eze2.A();
            this.J0 = null;
        }
    }

    public final boolean handleMessage(Message message) {
        if (message.what == 1) {
            K((o44) message.obj);
            return true;
        }
        throw new IllegalStateException();
    }

    public final String l() {
        return "TextRenderer";
    }

    public final boolean n() {
        return this.P0;
    }

    public final boolean p() {
        return true;
    }

    public final void q() {
        this.Q0 = null;
        this.T0 = -9223372036854775807L;
        o44 o44 = new o44(H(this.S0), k0d.v);
        Handler handler = this.L0;
        if (handler != null) {
            handler.obtainMessage(1, o44).sendToTarget();
        } else {
            K(o44);
        }
        this.R0 = -9223372036854775807L;
        this.S0 = -9223372036854775807L;
        if (this.G0 != null) {
            L();
            xye xye = this.G0;
            xye.getClass();
            xye.release();
            this.G0 = null;
            this.F0 = 0;
        }
    }

    public final void s(long j, boolean z) {
        this.S0 = j;
        p44 p44 = this.C0;
        if (p44 != null) {
            p44.clear();
        }
        o44 o44 = new o44(H(this.S0), k0d.v);
        Handler handler = this.L0;
        if (handler != null) {
            handler.obtainMessage(1, o44).sendToTarget();
        } else {
            K(o44);
        }
        this.O0 = false;
        this.P0 = false;
        this.T0 = -9223372036854775807L;
        ea6 ea6 = this.Q0;
        if (ea6 != null && !Objects.equals(ea6.n, "application/x-media3-cues")) {
            if (this.F0 != 0) {
                L();
                xye xye = this.G0;
                xye.getClass();
                xye.release();
                this.G0 = null;
                this.F0 = 0;
                I();
                return;
            }
            L();
            xye xye2 = this.G0;
            xye2.getClass();
            xye2.flush();
            xye2.a(this.Z);
        }
    }

    public final void x(ea6[] ea6Arr, long j, long j2) {
        this.R0 = j2;
        ea6 ea6 = ea6Arr[0];
        this.Q0 = ea6;
        if (!Objects.equals(ea6.n, "application/x-media3-cues")) {
            F();
            if (this.G0 != null) {
                this.F0 = 1;
            } else {
                I();
            }
        } else {
            this.C0 = this.Q0.H == 1 ? new q79() : new bpa(3);
        }
    }

    public final void z(long j, long j2) {
        boolean z;
        long j3;
        long j4 = j;
        if (this.w0) {
            long j5 = this.T0;
            if (j5 != -9223372036854775807L && j4 >= j5) {
                L();
                this.P0 = true;
            }
        }
        if (!this.P0) {
            ea6 ea6 = this.Q0;
            ea6.getClass();
            boolean equals = Objects.equals(ea6.n, "application/x-media3-cues");
            Handler handler = this.L0;
            int i = 0;
            ox0 ox0 = this.N0;
            if (equals) {
                this.C0.getClass();
                if (!this.O0) {
                    ba4 ba4 = this.B0;
                    if (y(ox0, ba4, 0) == -4) {
                        if (ba4.h(4)) {
                            this.O0 = true;
                        } else {
                            ba4.C();
                            ByteBuffer byteBuffer = ba4.v;
                            byteBuffer.getClass();
                            long j6 = ba4.x;
                            byte[] array = byteBuffer.array();
                            int arrayOffset = byteBuffer.arrayOffset();
                            int limit = byteBuffer.limit();
                            this.A0.getClass();
                            Parcel obtain = Parcel.obtain();
                            obtain.unmarshall(array, arrayOffset, limit);
                            obtain.setDataPosition(0);
                            Bundle readBundle = obtain.readBundle(Bundle.class.getClassLoader());
                            obtain.recycle();
                            ArrayList parcelableArrayList = readBundle.getParcelableArrayList("c");
                            parcelableArrayList.getClass();
                            qb7 o = tb7.o();
                            while (i < parcelableArrayList.size()) {
                                Bundle bundle = (Bundle) parcelableArrayList.get(i);
                                bundle.getClass();
                                o.a(n44.a(bundle));
                                i++;
                            }
                            q44 q44 = new q44(j6, readBundle.getLong("d"), o.j());
                            ba4.z();
                            i = this.C0.e(q44, j4);
                        }
                    }
                }
                long c = this.C0.c(this.S0);
                int i2 = (c > Long.MIN_VALUE ? 1 : (c == Long.MIN_VALUE ? 0 : -1));
                if (i2 == 0 && this.O0 && i == 0) {
                    this.P0 = true;
                }
                if (i2 != 0 && c <= j4) {
                    i = 1;
                }
                if (i != 0) {
                    tb7 g = this.C0.g(j4);
                    long k = this.C0.k(j4);
                    o44 o44 = new o44(H(k), g);
                    if (handler != null) {
                        handler.obtainMessage(1, o44).sendToTarget();
                    } else {
                        K(o44);
                    }
                    this.C0.m(k);
                }
                this.S0 = j4;
                return;
            }
            F();
            this.S0 = j4;
            if (this.J0 == null) {
                xye xye = this.G0;
                xye.getClass();
                xye.b(j4);
                try {
                    xye xye2 = this.G0;
                    xye2.getClass();
                    this.J0 = (eze) xye2.d();
                } catch (SubtitleDecoderException e) {
                    i8b.p("Subtitle decoding failed. streamFormat=" + this.Q0, e);
                    o44 o442 = new o44(H(this.S0), k0d.v);
                    if (handler != null) {
                        handler.obtainMessage(1, o442).sendToTarget();
                    } else {
                        K(o442);
                    }
                    L();
                    xye xye3 = this.G0;
                    xye3.getClass();
                    xye3.release();
                    this.G0 = null;
                    this.F0 = 0;
                    I();
                    return;
                }
            }
            if (this.y == 2) {
                if (this.I0 != null) {
                    long G = G();
                    z = false;
                    while (G <= j4) {
                        this.K0++;
                        G = G();
                        z = true;
                    }
                } else {
                    z = false;
                }
                eze eze = this.J0;
                if (eze != null) {
                    if (eze.h(4)) {
                        if (!z && G() == LongCompanionObject.MAX_VALUE) {
                            if (this.F0 == 2) {
                                L();
                                xye xye4 = this.G0;
                                xye4.getClass();
                                xye4.release();
                                this.G0 = null;
                                this.F0 = 0;
                                I();
                            } else {
                                L();
                                this.P0 = true;
                            }
                        }
                    } else if (eze.c <= j4) {
                        eze eze2 = this.I0;
                        if (eze2 != null) {
                            eze2.A();
                        }
                        this.K0 = eze.d(j4);
                        this.I0 = eze;
                        this.J0 = null;
                        z = true;
                    }
                }
                if (z) {
                    this.I0.getClass();
                    int d = this.I0.d(j4);
                    if (d == 0 || this.I0.t() == 0) {
                        j3 = this.I0.c;
                    } else if (d == -1) {
                        eze eze3 = this.I0;
                        j3 = eze3.k(eze3.t() - 1);
                    } else {
                        j3 = this.I0.k(d - 1);
                    }
                    o44 o443 = new o44(H(j3), this.I0.p(j4));
                    if (handler != null) {
                        handler.obtainMessage(1, o443).sendToTarget();
                    } else {
                        K(o443);
                    }
                }
                if (this.F0 != 2) {
                    while (!this.O0) {
                        try {
                            cze cze = this.H0;
                            if (cze == null) {
                                xye xye5 = this.G0;
                                xye5.getClass();
                                cze = (cze) xye5.f();
                                if (cze != null) {
                                    this.H0 = cze;
                                } else {
                                    return;
                                }
                            }
                            if (this.F0 == 1) {
                                cze.b = 4;
                                xye xye6 = this.G0;
                                xye6.getClass();
                                xye6.c(cze);
                                this.H0 = null;
                                this.F0 = 2;
                                return;
                            }
                            int y = y(ox0, cze, 0);
                            if (y == -4) {
                                if (cze.h(4)) {
                                    this.O0 = true;
                                    this.E0 = false;
                                } else {
                                    ea6 ea62 = (ea6) ox0.b;
                                    if (ea62 != null) {
                                        cze.Y = ea62.s;
                                        cze.C();
                                        this.E0 &= !cze.h(1);
                                    } else {
                                        return;
                                    }
                                }
                                if (!this.E0) {
                                    xye xye7 = this.G0;
                                    xye7.getClass();
                                    xye7.c(cze);
                                    this.H0 = null;
                                }
                            } else if (y == -3) {
                                return;
                            }
                        } catch (SubtitleDecoderException e2) {
                            i8b.p("Subtitle decoding failed. streamFormat=" + this.Q0, e2);
                            o44 o444 = new o44(H(this.S0), k0d.v);
                            if (handler != null) {
                                handler.obtainMessage(1, o444).sendToTarget();
                            } else {
                                K(o444);
                            }
                            L();
                            xye xye8 = this.G0;
                            xye8.getClass();
                            xye8.release();
                            this.G0 = null;
                            this.F0 = 0;
                            I();
                            return;
                        }
                    }
                }
            }
        }
    }
}
