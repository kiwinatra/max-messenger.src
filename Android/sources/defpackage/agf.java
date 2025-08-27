package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.google.android.exoplayer2.text.SubtitleDecoderException;
import java.util.Collections;
import java.util.List;
import kotlin.jvm.internal.LongCompanionObject;

/* renamed from: agf  reason: default package */
public final class agf extends ok0 implements Handler.Callback {
    public boolean A0;
    public boolean B0;
    public int C0;
    public ca6 D0;
    public wye E0;
    public bze F0;
    public dze G0;
    public dze H0;
    public int I0;
    public long J0;
    public final Handler v0;
    public final mc5 w0;
    public final ece x0;
    public final xe8 y0;
    public boolean z0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public agf(mc5 mc5, Looper looper) {
        super(3);
        Handler handler;
        ece ece = ece.w;
        this.w0 = mc5;
        if (looper == null) {
            handler = null;
        } else {
            int i = t0g.a;
            handler = new Handler(looper, this);
        }
        this.v0 = handler;
        this.x0 = ece;
        this.y0 = new xe8(13, false);
        this.J0 = -9223372036854775807L;
    }

    public final int A(ca6 ca6) {
        this.x0.getClass();
        String str = ca6.Z;
        if (!"text/vtt".equals(str) && !"text/x-ssa".equals(str) && !"application/ttml+xml".equals(str) && !"application/x-mp4-vtt".equals(str) && !"application/x-subrip".equals(str) && !"application/x-quicktime-tx3g".equals(str) && !"application/cea-608".equals(str) && !"application/x-mp4-cea-608".equals(str) && !"application/cea-708".equals(str) && !"application/dvbsubs".equals(str) && !"application/pgs".equals(str) && !"text/x-exoplayer-cues".equals(str)) {
            return uq9.i(ca6.Z) ? ok0.b(1, 0, 0) : ok0.b(0, 0, 0);
        }
        return ok0.b(ca6.N0 == 0 ? 4 : 2, 0, 0);
    }

    public final long C() {
        if (this.I0 == -1) {
            return LongCompanionObject.MAX_VALUE;
        }
        this.G0.getClass();
        return this.I0 >= this.G0.t() ? LongCompanionObject.MAX_VALUE : this.G0.k(this.I0);
    }

    public final void D(SubtitleDecoderException subtitleDecoderException) {
        String valueOf = String.valueOf(this.D0);
        StringBuilder sb = new StringBuilder(valueOf.length() + 39);
        sb.append("Subtitle decoding failed. streamFormat=");
        sb.append(valueOf);
        iq.a(sb.toString(), subtitleDecoderException);
        List emptyList = Collections.emptyList();
        Handler handler = this.v0;
        if (handler != null) {
            handler.obtainMessage(0, emptyList).sendToTarget();
        } else {
            sc5 sc5 = this.w0.a;
            sc5.d1 = emptyList;
            sc5.Z.r(27, new x52(8, emptyList));
        }
        F();
        wye wye = this.E0;
        wye.getClass();
        wye.release();
        this.E0 = null;
        this.C0 = 0;
        E();
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x009b, code lost:
        if (r2.equals("application/pgs") == false) goto L_0x001d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00ef, code lost:
        r6.E0 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00f1, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void E() {
        /*
            r6 = this;
            r0 = 1
            r6.B0 = r0
            ca6 r1 = r6.D0
            r1.getClass()
            ece r2 = r6.x0
            r2.getClass()
            java.lang.String r2 = r1.Z
            if (r2 == 0) goto L_0x00f2
            int r3 = r1.M0
            java.util.List r1 = r1.w0
            r4 = -1
            int r5 = r2.hashCode()
            switch(r5) {
                case -1351681404: goto L_0x009f;
                case -1248334819: goto L_0x0095;
                case -1026075066: goto L_0x008a;
                case -1004728940: goto L_0x007f;
                case 691401887: goto L_0x0074;
                case 822864842: goto L_0x0069;
                case 930165504: goto L_0x005e;
                case 1201784583: goto L_0x0053;
                case 1566015601: goto L_0x0047;
                case 1566016562: goto L_0x003a;
                case 1668750253: goto L_0x002d;
                case 1693976202: goto L_0x0020;
                default: goto L_0x001d;
            }
        L_0x001d:
            r0 = r4
            goto L_0x00aa
        L_0x0020:
            java.lang.String r0 = "application/ttml+xml"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L_0x0029
            goto L_0x001d
        L_0x0029:
            r0 = 11
            goto L_0x00aa
        L_0x002d:
            java.lang.String r0 = "application/x-subrip"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L_0x0036
            goto L_0x001d
        L_0x0036:
            r0 = 10
            goto L_0x00aa
        L_0x003a:
            java.lang.String r0 = "application/cea-708"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L_0x0043
            goto L_0x001d
        L_0x0043:
            r0 = 9
            goto L_0x00aa
        L_0x0047:
            java.lang.String r0 = "application/cea-608"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L_0x0050
            goto L_0x001d
        L_0x0050:
            r0 = 8
            goto L_0x00aa
        L_0x0053:
            java.lang.String r0 = "text/x-exoplayer-cues"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L_0x005c
            goto L_0x001d
        L_0x005c:
            r0 = 7
            goto L_0x00aa
        L_0x005e:
            java.lang.String r0 = "application/x-mp4-cea-608"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L_0x0067
            goto L_0x001d
        L_0x0067:
            r0 = 6
            goto L_0x00aa
        L_0x0069:
            java.lang.String r0 = "text/x-ssa"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L_0x0072
            goto L_0x001d
        L_0x0072:
            r0 = 5
            goto L_0x00aa
        L_0x0074:
            java.lang.String r0 = "application/x-quicktime-tx3g"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L_0x007d
            goto L_0x001d
        L_0x007d:
            r0 = 4
            goto L_0x00aa
        L_0x007f:
            java.lang.String r0 = "text/vtt"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L_0x0088
            goto L_0x001d
        L_0x0088:
            r0 = 3
            goto L_0x00aa
        L_0x008a:
            java.lang.String r0 = "application/x-mp4-vtt"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L_0x0093
            goto L_0x001d
        L_0x0093:
            r0 = 2
            goto L_0x00aa
        L_0x0095:
            java.lang.String r5 = "application/pgs"
            boolean r5 = r2.equals(r5)
            if (r5 != 0) goto L_0x00aa
            goto L_0x001d
        L_0x009f:
            java.lang.String r0 = "application/dvbsubs"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L_0x00a9
            goto L_0x001d
        L_0x00a9:
            r0 = 0
        L_0x00aa:
            switch(r0) {
                case 0: goto L_0x00ea;
                case 1: goto L_0x00e4;
                case 2: goto L_0x00de;
                case 3: goto L_0x00d8;
                case 4: goto L_0x00d2;
                case 5: goto L_0x00cc;
                case 6: goto L_0x00c6;
                case 7: goto L_0x00c0;
                case 8: goto L_0x00c6;
                case 9: goto L_0x00ba;
                case 10: goto L_0x00b4;
                case 11: goto L_0x00ae;
                default: goto L_0x00ad;
            }
        L_0x00ad:
            goto L_0x00f2
        L_0x00ae:
            ttf r0 = new ttf
            r0.<init>()
            goto L_0x00ef
        L_0x00b4:
            mye r0 = new mye
            r0.<init>()
            goto L_0x00ef
        L_0x00ba:
            ly1 r0 = new ly1
            r0.<init>(r3, r1)
            goto L_0x00ef
        L_0x00c0:
            gy r0 = new gy
            r0.<init>()
            goto L_0x00ef
        L_0x00c6:
            ey1 r0 = new ey1
            r0.<init>(r2, r3)
            goto L_0x00ef
        L_0x00cc:
            vhe r0 = new vhe
            r0.<init>(r1)
            goto L_0x00ef
        L_0x00d2:
            duf r0 = new duf
            r0.<init>(r1)
            goto L_0x00ef
        L_0x00d8:
            omg r0 = new omg
            r0.<init>()
            goto L_0x00ef
        L_0x00de:
            cy4 r0 = new cy4
            r0.<init>()
            goto L_0x00ef
        L_0x00e4:
            pdb r0 = new pdb
            r0.<init>()
            goto L_0x00ef
        L_0x00ea:
            cy4 r0 = new cy4
            r0.<init>(r1)
        L_0x00ef:
            r6.E0 = r0
            return
        L_0x00f2:
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            java.lang.String r0 = java.lang.String.valueOf(r2)
            int r1 = r0.length()
            java.lang.String r2 = "Attempted to create decoder for unsupported MIME type: "
            if (r1 == 0) goto L_0x0105
            java.lang.String r0 = r2.concat(r0)
            goto L_0x010a
        L_0x0105:
            java.lang.String r0 = new java.lang.String
            r0.<init>(r2)
        L_0x010a:
            r6.<init>(r0)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.agf.E():void");
    }

    public final void F() {
        this.F0 = null;
        this.I0 = -1;
        dze dze = this.G0;
        if (dze != null) {
            dze.z();
            this.G0 = null;
        }
        dze dze2 = this.H0;
        if (dze2 != null) {
            dze2.z();
            this.H0 = null;
        }
    }

    public final boolean handleMessage(Message message) {
        if (message.what == 0) {
            List list = (List) message.obj;
            sc5 sc5 = this.w0.a;
            sc5.d1 = list;
            sc5.Z.r(27, new x52(8, list));
            return true;
        }
        throw new IllegalStateException();
    }

    public final String k() {
        return "TextRenderer";
    }

    public final boolean m() {
        return this.A0;
    }

    public final boolean n() {
        return true;
    }

    public final void o() {
        this.D0 = null;
        this.J0 = -9223372036854775807L;
        List emptyList = Collections.emptyList();
        Handler handler = this.v0;
        if (handler != null) {
            handler.obtainMessage(0, emptyList).sendToTarget();
        } else {
            sc5 sc5 = this.w0.a;
            sc5.d1 = emptyList;
            sc5.Z.r(27, new x52(8, emptyList));
        }
        F();
        wye wye = this.E0;
        wye.getClass();
        wye.release();
        this.E0 = null;
        this.C0 = 0;
    }

    public final void q(long j, boolean z) {
        List emptyList = Collections.emptyList();
        Handler handler = this.v0;
        if (handler != null) {
            handler.obtainMessage(0, emptyList).sendToTarget();
        } else {
            sc5 sc5 = this.w0.a;
            sc5.d1 = emptyList;
            sc5.Z.r(27, new x52(8, emptyList));
        }
        this.z0 = false;
        this.A0 = false;
        this.J0 = -9223372036854775807L;
        if (this.C0 != 0) {
            F();
            wye wye = this.E0;
            wye.getClass();
            wye.release();
            this.E0 = null;
            this.C0 = 0;
            E();
            return;
        }
        F();
        wye wye2 = this.E0;
        wye2.getClass();
        wye2.flush();
    }

    public final void u(ca6[] ca6Arr, long j, long j2) {
        this.D0 = ca6Arr[0];
        if (this.E0 != null) {
            this.C0 = 1;
        } else {
            E();
        }
    }

    public final void w(long j, long j2) {
        boolean z;
        xe8 xe8 = this.y0;
        if (this.Y) {
            long j3 = this.J0;
            if (j3 != -9223372036854775807L && j >= j3) {
                F();
                this.A0 = true;
            }
        }
        if (!this.A0) {
            if (this.H0 == null) {
                wye wye = this.E0;
                wye.getClass();
                wye.b(j);
                try {
                    wye wye2 = this.E0;
                    wye2.getClass();
                    this.H0 = wye2.d();
                } catch (SubtitleDecoderException e) {
                    D(e);
                    return;
                }
            }
            if (this.w == 2) {
                if (this.G0 != null) {
                    long C = C();
                    z = false;
                    while (C <= j) {
                        this.I0++;
                        C = C();
                        z = true;
                    }
                } else {
                    z = false;
                }
                dze dze = this.H0;
                if (dze != null) {
                    if (dze.h(4)) {
                        if (!z && C() == LongCompanionObject.MAX_VALUE) {
                            if (this.C0 == 2) {
                                F();
                                wye wye3 = this.E0;
                                wye3.getClass();
                                wye3.release();
                                this.E0 = null;
                                this.C0 = 0;
                                E();
                            } else {
                                F();
                                this.A0 = true;
                            }
                        }
                    } else if (dze.c <= j) {
                        dze dze2 = this.G0;
                        if (dze2 != null) {
                            dze2.z();
                        }
                        this.I0 = dze.d(j);
                        this.G0 = dze;
                        this.H0 = null;
                        z = true;
                    }
                }
                if (z) {
                    this.G0.getClass();
                    List p = this.G0.p(j);
                    Handler handler = this.v0;
                    if (handler != null) {
                        handler.obtainMessage(0, p).sendToTarget();
                    } else {
                        sc5 sc5 = this.w0.a;
                        sc5.d1 = p;
                        sc5.Z.r(27, new x52(8, p));
                    }
                }
                if (this.C0 != 2) {
                    while (!this.z0) {
                        try {
                            bze bze = this.F0;
                            if (bze == null) {
                                wye wye4 = this.E0;
                                wye4.getClass();
                                bze = (bze) wye4.f();
                                if (bze != null) {
                                    this.F0 = bze;
                                } else {
                                    return;
                                }
                            }
                            if (this.C0 == 1) {
                                bze.b = 4;
                                wye wye5 = this.E0;
                                wye5.getClass();
                                wye5.l(bze);
                                this.F0 = null;
                                this.C0 = 2;
                                return;
                            }
                            int v = v(xe8, bze, 0);
                            if (v == -4) {
                                if (bze.h(4)) {
                                    this.z0 = true;
                                    this.B0 = false;
                                } else {
                                    ca6 ca6 = (ca6) xe8.c;
                                    if (ca6 != null) {
                                        bze.X = ca6.y0;
                                        bze.C();
                                        this.B0 &= !bze.h(1);
                                    } else {
                                        return;
                                    }
                                }
                                if (!this.B0) {
                                    wye wye6 = this.E0;
                                    wye6.getClass();
                                    wye6.l(bze);
                                    this.F0 = null;
                                }
                            } else if (v == -3) {
                                return;
                            }
                        } catch (SubtitleDecoderException e2) {
                            D(e2);
                            return;
                        }
                    }
                }
            }
        }
    }
}
