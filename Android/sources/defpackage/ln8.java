package defpackage;

import android.content.Context;
import android.media.AudioTrack;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.support.v4.media.session.PlaybackStateCompat;
import androidx.media3.exoplayer.audio.AudioSink$ConfigurationException;
import androidx.media3.exoplayer.audio.AudioSink$InitializationException;
import androidx.media3.exoplayer.audio.AudioSink$WriteException;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import kotlin.io.ConstantsKt;

/* renamed from: ln8  reason: default package */
public final class ln8 extends wn8 implements cn8 {
    public final Context O1;
    public final p7d P1;
    public final j70 Q1;
    public int R1;
    public boolean S1;
    public boolean T1;
    public ea6 U1;
    public ea6 V1;
    public long W1;
    public boolean X1;
    public boolean Y1;
    public boolean Z1;
    public int a2 = -1000;

    public ln8(Context context, gn8 gn8, Handler handler, nc5 nc5, sc4 sc4) {
        super(1, gn8, 44100.0f);
        this.O1 = context.getApplicationContext();
        this.Q1 = sc4;
        this.P1 = new p7d(3, (Object) handler, (Object) nc5);
        sc4.s = new e4(25, (Object) this);
    }

    public final int A0(on8 on8, ea6 ea6) {
        int i;
        if (!"OMX.google.raw.decoder".equals(on8.a) || (i = v0g.a) >= 24 || (i == 23 && v0g.P(this.O1))) {
            return ea6.o;
        }
        return -1;
    }

    public final void B0() {
        long j;
        ArrayDeque arrayDeque;
        long j2;
        long j3;
        boolean n = n();
        sc4 sc4 = (sc4) this.Q1;
        if (!sc4.l() || sc4.N) {
            j = Long.MIN_VALUE;
        } else {
            long min = Math.min(sc4.i.a(n), v0g.Y(sc4.u.e, sc4.h()));
            while (true) {
                arrayDeque = sc4.j;
                if (arrayDeque.isEmpty() || min < ((kc4) arrayDeque.getFirst()).c) {
                    long j4 = min - sc4.C.c;
                    boolean isEmpty = arrayDeque.isEmpty();
                    aqg aqg = sc4.b;
                } else {
                    sc4.C = (kc4) arrayDeque.remove();
                }
            }
            long j42 = min - sc4.C.c;
            boolean isEmpty2 = arrayDeque.isEmpty();
            aqg aqg2 = sc4.b;
            if (isEmpty2) {
                vfe vfe = (vfe) aqg2.c;
                if (vfe.isActive()) {
                    if (vfe.o >= PlaybackStateCompat.ACTION_PLAY_FROM_MEDIA_ID) {
                        long j5 = vfe.n;
                        tfe tfe = vfe.j;
                        tfe.getClass();
                        long j6 = j5 - ((long) ((tfe.l * tfe.c) * 2));
                        int i = vfe.h.a;
                        int i2 = vfe.g.a;
                        j3 = i == i2 ? v0g.a0(j42, j6, vfe.o, RoundingMode.FLOOR) : v0g.a0(j42, j6 * ((long) i), vfe.o * ((long) i2), RoundingMode.FLOOR);
                    } else {
                        j3 = (long) (((double) vfe.c) * ((double) j42));
                    }
                    j42 = j3;
                }
                j2 = sc4.C.b + j42;
            } else {
                kc4 kc4 = (kc4) arrayDeque.getFirst();
                j2 = kc4.b - v0g.A(kc4.c - min, sc4.C.a.a);
            }
            long j7 = ((iae) aqg2.b).q;
            j = v0g.Y(sc4.u.e, j7) + j2;
            long j8 = sc4.j0;
            if (j7 > j8) {
                long Y = v0g.Y(sc4.u.e, j7 - j8);
                sc4.j0 = j7;
                sc4.k0 += Y;
                if (sc4.l0 == null) {
                    sc4.l0 = new Handler(Looper.myLooper());
                }
                sc4.l0.removeCallbacksAndMessages((Object) null);
                sc4.l0.postDelayed(new pr1(27, sc4), 100);
            }
        }
        if (j != Long.MIN_VALUE) {
            if (!this.X1) {
                j = Math.max(this.W1, j);
            }
            this.W1 = j;
            this.X1 = false;
        }
    }

    public final ea4 G(on8 on8, ea6 ea6, ea6 ea62) {
        ea4 b = on8.b(ea6, ea62);
        int i = 0;
        boolean z = this.O0 == null && u0(ea62);
        int i2 = b.e;
        if (z) {
            i2 |= 32768;
        }
        if (A0(on8, ea62) > this.R1) {
            i2 |= 64;
        }
        int i3 = i2;
        if (i3 == 0) {
            i = b.d;
        }
        return new ea4(on8.a, ea6, ea62, i, i3);
    }

    public final boolean J() {
        boolean z = this.Z1;
        this.Z1 = false;
        return z;
    }

    public final float S(float f, ea6[] ea6Arr) {
        int i = -1;
        for (ea6 ea6 : ea6Arr) {
            int i2 = ea6.C;
            if (i2 != -1) {
                i = Math.max(i, i2);
            }
        }
        if (i == -1) {
            return -1.0f;
        }
        return ((float) i) * f;
    }

    public final ArrayList T(rx0 rx0, ea6 ea6, boolean z) {
        k0d k0d;
        if (ea6.n == null) {
            k0d = k0d.v;
        } else {
            if (((sc4) this.Q1).f(ea6) != 0) {
                List e = fo8.e(false, "audio/raw", false);
                on8 on8 = e.isEmpty() ? null : (on8) e.get(0);
                if (on8 != null) {
                    k0d = tb7.t(on8);
                }
            }
            k0d = fo8.g(rx0, ea6, z, false);
        }
        return fo8.h(ea6, k0d);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00d0, code lost:
        if ("AXON 7 mini".equals(r2) == false) goto L_0x00d3;
     */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0084  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0086  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00b3  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00ef  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x011c  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x0127  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x0141  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x0143  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final defpackage.en8 U(defpackage.on8 r12, defpackage.ea6 r13, android.media.MediaCrypto r14, float r15) {
        /*
            r11 = this;
            ea6[] r0 = r11.X
            r0.getClass()
            int r1 = r11.A0(r12, r13)
            int r2 = r0.length
            r3 = 1
            r4 = 0
            if (r2 != r3) goto L_0x000f
            goto L_0x0028
        L_0x000f:
            int r2 = r0.length
            r5 = r4
        L_0x0011:
            if (r5 >= r2) goto L_0x0028
            r6 = r0[r5]
            ea4 r7 = r12.b(r13, r6)
            int r7 = r7.d
            if (r7 == 0) goto L_0x0025
            int r6 = r11.A0(r12, r6)
            int r1 = java.lang.Math.max(r1, r6)
        L_0x0025:
            int r5 = r5 + 1
            goto L_0x0011
        L_0x0028:
            r11.R1 = r1
            int r0 = defpackage.v0g.a
            r1 = 24
            java.lang.String r2 = r12.a
            if (r0 >= r1) goto L_0x0060
            java.lang.String r5 = "OMX.SEC.aac.dec"
            boolean r5 = r5.equals(r2)
            if (r5 == 0) goto L_0x0060
            java.lang.String r5 = "samsung"
            java.lang.String r6 = defpackage.v0g.c
            boolean r5 = r5.equals(r6)
            if (r5 == 0) goto L_0x0060
            java.lang.String r5 = defpackage.v0g.b
            java.lang.String r6 = "zeroflte"
            boolean r6 = r5.startsWith(r6)
            if (r6 != 0) goto L_0x005e
            java.lang.String r6 = "herolte"
            boolean r6 = r5.startsWith(r6)
            if (r6 != 0) goto L_0x005e
            java.lang.String r6 = "heroqlte"
            boolean r5 = r5.startsWith(r6)
            if (r5 == 0) goto L_0x0060
        L_0x005e:
            r5 = r3
            goto L_0x0061
        L_0x0060:
            r5 = r4
        L_0x0061:
            r11.S1 = r5
            java.lang.String r5 = "OMX.google.opus.decoder"
            boolean r5 = r2.equals(r5)
            if (r5 != 0) goto L_0x0086
            java.lang.String r5 = "c2.android.opus.decoder"
            boolean r5 = r2.equals(r5)
            if (r5 != 0) goto L_0x0086
            java.lang.String r5 = "OMX.google.vorbis.decoder"
            boolean r5 = r2.equals(r5)
            if (r5 != 0) goto L_0x0086
            java.lang.String r5 = "c2.android.vorbis.decoder"
            boolean r2 = r2.equals(r5)
            if (r2 == 0) goto L_0x0084
            goto L_0x0086
        L_0x0084:
            r2 = r4
            goto L_0x0087
        L_0x0086:
            r2 = r3
        L_0x0087:
            r11.T1 = r2
            int r2 = r11.R1
            android.media.MediaFormat r7 = new android.media.MediaFormat
            r7.<init>()
            java.lang.String r5 = "mime"
            java.lang.String r6 = r12.c
            r7.setString(r5, r6)
            int r5 = r13.B
            java.lang.String r6 = "channel-count"
            r7.setInteger(r6, r5)
            java.lang.String r5 = "sample-rate"
            int r6 = r13.C
            r7.setInteger(r5, r6)
            java.util.List r5 = r13.q
            defpackage.hsg.C(r7, r5)
            java.lang.String r5 = "max-input-size"
            defpackage.hsg.x(r7, r5, r2)
            r2 = 23
            if (r0 < r2) goto L_0x00d8
            java.lang.String r5 = "priority"
            r7.setInteger(r5, r4)
            r5 = -1082130432(0xffffffffbf800000, float:-1.0)
            int r5 = (r15 > r5 ? 1 : (r15 == r5 ? 0 : -1))
            if (r5 == 0) goto L_0x00d8
            if (r0 != r2) goto L_0x00d3
            java.lang.String r2 = defpackage.v0g.d
            java.lang.String r5 = "ZTE B2017G"
            boolean r5 = r5.equals(r2)
            if (r5 != 0) goto L_0x00d8
            java.lang.String r5 = "AXON 7 mini"
            boolean r2 = r5.equals(r2)
            if (r2 == 0) goto L_0x00d3
            goto L_0x00d8
        L_0x00d3:
            java.lang.String r2 = "operating-rate"
            r7.setFloat(r2, r15)
        L_0x00d8:
            r15 = 28
            java.lang.String r2 = r13.n
            if (r0 > r15) goto L_0x00eb
            java.lang.String r15 = "audio/ac4"
            boolean r15 = r15.equals(r2)
            if (r15 == 0) goto L_0x00eb
            java.lang.String r15 = "ac4-is-sync"
            r7.setInteger(r15, r3)
        L_0x00eb:
            java.lang.String r15 = "audio/raw"
            if (r0 < r1) goto L_0x0118
            ba6 r1 = new ba6
            r1.<init>()
            java.lang.String r3 = defpackage.vq9.l(r15)
            r1.m = r3
            int r3 = r13.B
            r1.A = r3
            r1.B = r6
            r3 = 4
            r1.C = r3
            ea6 r5 = new ea6
            r5.<init>(r1)
            j70 r1 = r11.Q1
            sc4 r1 = (defpackage.sc4) r1
            int r1 = r1.f(r5)
            r5 = 2
            if (r1 != r5) goto L_0x0118
            java.lang.String r1 = "pcm-encoding"
            r7.setInteger(r1, r3)
        L_0x0118:
            r1 = 32
            if (r0 < r1) goto L_0x0123
            java.lang.String r1 = "max-output-channel-count"
            r3 = 99
            r7.setInteger(r1, r3)
        L_0x0123:
            r1 = 35
            if (r0 < r1) goto L_0x0133
            int r0 = r11.a2
            int r0 = -r0
            int r0 = java.lang.Math.max(r4, r0)
            java.lang.String r1 = "importance"
            r7.setInteger(r1, r0)
        L_0x0133:
            java.lang.String r0 = r12.b
            boolean r0 = r15.equals(r0)
            if (r0 == 0) goto L_0x0143
            boolean r15 = r15.equals(r2)
            if (r15 != 0) goto L_0x0143
            r15 = r13
            goto L_0x0144
        L_0x0143:
            r15 = 0
        L_0x0144:
            r11.V1 = r15
            en8 r11 = new en8
            r9 = 0
            r5 = r11
            r6 = r12
            r8 = r13
            r10 = r14
            r5.<init>(r6, r7, r8, r9, r10)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ln8.U(on8, ea6, android.media.MediaCrypto, float):en8");
    }

    public final void V(ba4 ba4) {
        ea6 ea6;
        ic4 ic4;
        if (v0g.a >= 29 && (ea6 = ba4.c) != null && Objects.equals(ea6.n, "audio/opus") && this.s1) {
            ByteBuffer byteBuffer = ba4.y;
            byteBuffer.getClass();
            ea6 ea62 = ba4.c;
            ea62.getClass();
            if (byteBuffer.remaining() == 8) {
                int i = (int) ((byteBuffer.order(ByteOrder.LITTLE_ENDIAN).getLong() * 48000) / 1000000000);
                sc4 sc4 = (sc4) this.Q1;
                AudioTrack audioTrack = sc4.w;
                if (audioTrack != null && sc4.m(audioTrack) && (ic4 = sc4.u) != null && ic4.k) {
                    sc4.w.setOffloadDelayPadding(ea62.E, i);
                }
            }
        }
    }

    public final void a(int i, Object obj) {
        j70 j70 = this.Q1;
        if (i == 2) {
            obj.getClass();
            float floatValue = ((Float) obj).floatValue();
            sc4 sc4 = (sc4) j70;
            if (sc4.P != floatValue) {
                sc4.P = floatValue;
                if (sc4.l()) {
                    if (v0g.a >= 21) {
                        sc4.w.setVolume(sc4.P);
                        return;
                    }
                    AudioTrack audioTrack = sc4.w;
                    float f = sc4.P;
                    audioTrack.setStereoVolume(f, f);
                }
            }
        } else if (i == 3) {
            i30 i30 = (i30) obj;
            i30.getClass();
            sc4 sc42 = (sc4) j70;
            if (!sc42.A.equals(i30)) {
                sc42.A = i30;
                if (!sc42.d0) {
                    y30 y30 = sc42.y;
                    if (y30 != null) {
                        y30.j = i30;
                        y30.a(u30.b((Context) y30.b, i30, (g40) y30.i));
                    }
                    sc42.d();
                }
            }
        } else if (i == 6) {
            cd0 cd0 = (cd0) obj;
            cd0.getClass();
            sc4 sc43 = (sc4) j70;
            if (!sc43.b0.equals(cd0)) {
                if (sc43.w != null) {
                    sc43.b0.getClass();
                }
                sc43.b0 = cd0;
            }
        } else if (i != 12) {
            boolean z = false;
            if (i == 16) {
                obj.getClass();
                this.a2 = ((Integer) obj).intValue();
                in8 in8 = this.U0;
                if (in8 != null && v0g.a >= 35) {
                    Bundle bundle = new Bundle();
                    bundle.putInt("importance", Math.max(0, -this.a2));
                    in8.setParameters(bundle);
                }
            } else if (i == 9) {
                obj.getClass();
                sc4 sc44 = (sc4) j70;
                sc44.E = ((Boolean) obj).booleanValue();
                kc4 kc4 = new kc4(sc44.t() ? gob.d : sc44.D, -9223372036854775807L, -9223372036854775807L);
                if (sc44.l()) {
                    sc44.B = kc4;
                } else {
                    sc44.C = kc4;
                }
            } else if (i == 10) {
                obj.getClass();
                int intValue = ((Integer) obj).intValue();
                sc4 sc45 = (sc4) j70;
                if (sc45.a0 != intValue) {
                    sc45.a0 = intValue;
                    if (intValue != 0) {
                        z = true;
                    }
                    sc45.Z = z;
                    sc45.d();
                }
            } else if (i == 11) {
                this.P0 = (vc5) obj;
            }
        } else if (v0g.a >= 23) {
            jn8.a(j70, obj);
        }
    }

    public final void a0(Exception exc) {
        i8b.p("Audio codec error", exc);
        p7d p7d = this.P1;
        Handler handler = (Handler) p7d.b;
        if (handler != null) {
            handler.post(new e70(p7d, exc, 0));
        }
    }

    public final void b0(long j, String str, long j2) {
        p7d p7d = this.P1;
        Handler handler = (Handler) p7d.b;
        if (handler != null) {
            handler.post(new d70(p7d, str, j, j2, 1));
        }
    }

    public final gob c() {
        return ((sc4) this.Q1).D;
    }

    public final void c0(String str) {
        p7d p7d = this.P1;
        Handler handler = (Handler) p7d.b;
        if (handler != null) {
            handler.post(new c(8, p7d, str));
        }
    }

    public final ea4 d0(ox0 ox0) {
        ea6 ea6 = (ea6) ox0.b;
        ea6.getClass();
        this.U1 = ea6;
        ea4 d0 = super.d0(ox0);
        p7d p7d = this.P1;
        Handler handler = (Handler) p7d.b;
        if (handler != null) {
            handler.post(new ktg(p7d, ea6, d0, 3));
        }
        return d0;
    }

    public final long e() {
        if (this.y == 2) {
            B0();
        }
        return this.W1;
    }

    public final void e0(ea6 ea6, MediaFormat mediaFormat) {
        int i;
        ea6 ea62 = this.V1;
        boolean z = true;
        int[] iArr = null;
        if (ea62 != null) {
            ea6 = ea62;
        } else if (this.U0 != null) {
            mediaFormat.getClass();
            int C = "audio/raw".equals(ea6.n) ? ea6.D : (v0g.a < 24 || !mediaFormat.containsKey("pcm-encoding")) ? mediaFormat.containsKey("v-bits-per-sample") ? v0g.C(mediaFormat.getInteger("v-bits-per-sample")) : 2 : mediaFormat.getInteger("pcm-encoding");
            ba6 ba6 = new ba6();
            ba6.m = vq9.l("audio/raw");
            ba6.C = C;
            ba6.D = ea6.E;
            ba6.E = ea6.F;
            ba6.j = ea6.k;
            ba6.k = ea6.l;
            ba6.a = ea6.a;
            ba6.b = ea6.b;
            ba6.c = tb7.p(ea6.c);
            ba6.d = ea6.d;
            ba6.e = ea6.e;
            ba6.f = ea6.f;
            ba6.A = mediaFormat.getInteger("channel-count");
            ba6.B = mediaFormat.getInteger("sample-rate");
            ea6 ea63 = new ea6(ba6);
            boolean z2 = this.S1;
            int i2 = ea63.B;
            if (z2 && i2 == 6 && (i = ea6.B) < 6) {
                iArr = new int[i];
                for (int i3 = 0; i3 < i; i3++) {
                    iArr[i3] = i3;
                }
            } else if (this.T1) {
                if (i2 == 3) {
                    iArr = new int[]{0, 2, 1};
                } else if (i2 == 5) {
                    iArr = new int[]{0, 2, 1, 3, 4};
                } else if (i2 == 6) {
                    iArr = new int[]{0, 2, 1, 5, 3, 4};
                } else if (i2 == 7) {
                    iArr = new int[]{0, 2, 1, 6, 5, 3, 4};
                } else if (i2 == 8) {
                    iArr = new int[]{0, 2, 1, 7, 5, 6, 3, 4};
                }
            }
            ea6 = ea63;
        }
        try {
            int i4 = v0g.a;
            j70 j70 = this.Q1;
            if (i4 >= 29) {
                if (this.s1) {
                    s1d s1d = this.o;
                    s1d.getClass();
                    if (s1d.a != 0) {
                        s1d s1d2 = this.o;
                        s1d2.getClass();
                        int i5 = s1d2.a;
                        sc4 sc4 = (sc4) j70;
                        sc4.getClass();
                        if (i4 < 29) {
                            z = false;
                        }
                        n79.n(z);
                        sc4.l = i5;
                    }
                }
                sc4 sc42 = (sc4) j70;
                sc42.getClass();
                if (i4 < 29) {
                    z = false;
                }
                n79.n(z);
                sc42.l = 0;
            }
            ((sc4) j70).b(ea6, iArr);
        } catch (AudioSink$ConfigurationException e) {
            throw g(e, e.a, false, 5001);
        }
    }

    public final void f(gob gob) {
        sc4 sc4 = (sc4) this.Q1;
        sc4.getClass();
        sc4.D = new gob(v0g.i(gob.a, 0.1f, 8.0f), v0g.i(gob.b, 0.1f, 8.0f));
        if (sc4.t()) {
            sc4.s();
            return;
        }
        kc4 kc4 = new kc4(gob, -9223372036854775807L, -9223372036854775807L);
        if (sc4.l()) {
            sc4.B = kc4;
        } else {
            sc4.C = kc4;
        }
    }

    public final void f0() {
        this.Q1.getClass();
    }

    public final void h0() {
        ((sc4) this.Q1).M = true;
    }

    public final cn8 k() {
        return this;
    }

    public final String l() {
        return "MediaCodecAudioRenderer";
    }

    public final boolean l0(long j, long j2, in8 in8, ByteBuffer byteBuffer, int i, int i2, int i3, long j3, boolean z, boolean z2, ea6 ea6) {
        int i4;
        int i5;
        byteBuffer.getClass();
        if (this.V1 == null || (i2 & 2) == 0) {
            j70 j70 = this.Q1;
            if (z) {
                if (in8 != null) {
                    in8.releaseOutputBuffer(i, false);
                }
                this.J1.g += i3;
                ((sc4) j70).M = true;
                return true;
            }
            try {
                if (!((sc4) j70).i(byteBuffer, j3, i3)) {
                    return false;
                }
                if (in8 != null) {
                    in8.releaseOutputBuffer(i, false);
                }
                this.J1.f += i3;
                return true;
            } catch (AudioSink$InitializationException e) {
                ea6 ea62 = this.U1;
                if (this.s1) {
                    s1d s1d = this.o;
                    s1d.getClass();
                    if (s1d.a != 0) {
                        i4 = 5004;
                        throw g(e, ea62, e.b, i4);
                    }
                }
                i4 = 5001;
                throw g(e, ea62, e.b, i4);
            } catch (AudioSink$WriteException e2) {
                if (this.s1) {
                    s1d s1d2 = this.o;
                    s1d2.getClass();
                    if (s1d2.a != 0) {
                        i5 = 5003;
                        throw g(e2, ea6, e2.b, i5);
                    }
                }
                i5 = 5002;
                throw g(e2, ea6, e2.b, i5);
            }
        } else {
            in8.getClass();
            in8.releaseOutputBuffer(i, false);
            return true;
        }
    }

    public final boolean n() {
        if (this.F1) {
            sc4 sc4 = (sc4) this.Q1;
            if (!sc4.l() || (sc4.V && !sc4.j())) {
                return true;
            }
        }
        return false;
    }

    public final void o0() {
        try {
            sc4 sc4 = (sc4) this.Q1;
            if (!sc4.V && sc4.l() && sc4.c()) {
                sc4.p();
                sc4.V = true;
            }
        } catch (AudioSink$WriteException e) {
            throw g(e, e.c, e.b, this.s1 ? 5003 : 5002);
        }
    }

    public final boolean p() {
        return ((sc4) this.Q1).j() || super.p();
    }

    public final void q() {
        p7d p7d = this.P1;
        this.Y1 = true;
        this.U1 = null;
        try {
            ((sc4) this.Q1).d();
            try {
                super.q();
            } finally {
                p7d.t(this.J1);
            }
        } catch (Throwable th) {
            super.q();
            throw th;
        } finally {
            p7d.t(this.J1);
        }
    }

    public final void r(boolean z, boolean z2) {
        z94 z94 = new z94(1);
        this.J1 = z94;
        p7d p7d = this.P1;
        Handler handler = (Handler) p7d.b;
        if (handler != null) {
            handler.post(new y60(p7d, z94, 0));
        }
        s1d s1d = this.o;
        s1d.getClass();
        boolean z3 = s1d.b;
        boolean z4 = false;
        j70 j70 = this.Q1;
        if (z3) {
            sc4 sc4 = (sc4) j70;
            sc4.getClass();
            if (v0g.a >= 21) {
                z4 = true;
            }
            n79.n(z4);
            n79.n(sc4.Z);
            if (!sc4.d0) {
                sc4.d0 = true;
                sc4.d();
            }
        } else {
            sc4 sc42 = (sc4) j70;
            if (sc42.d0) {
                sc42.d0 = false;
                sc42.d();
            }
        }
        mpb mpb = this.w;
        mpb.getClass();
        sc4 sc43 = (sc4) j70;
        sc43.r = mpb;
        c7f c7f = this.x;
        c7f.getClass();
        sc43.i.J = c7f;
    }

    public final void s(long j, boolean z) {
        super.s(j, z);
        ((sc4) this.Q1).d();
        this.W1 = j;
        this.Z1 = false;
        this.X1 = true;
    }

    public final void t() {
        w30 w30;
        y30 y30 = ((sc4) this.Q1).y;
        if (y30 != null && y30.a) {
            y30.h = null;
            int i = v0g.a;
            Context context = (Context) y30.b;
            if (i >= 23 && (w30 = (w30) y30.e) != null) {
                v30.b(context, w30);
            }
            ao aoVar = (ao) y30.f;
            if (aoVar != null) {
                context.unregisterReceiver(aoVar);
            }
            x30 x30 = (x30) y30.g;
            if (x30 != null) {
                x30.a.unregisterContentObserver(x30);
            }
            y30.a = false;
        }
    }

    public final void u() {
        j70 j70 = this.Q1;
        this.Z1 = false;
        try {
            I();
            n0();
            aw4 aw4 = this.O0;
            if (aw4 != null) {
                aw4.f((gw4) null);
            }
            this.O0 = null;
            if (this.Y1) {
                this.Y1 = false;
                ((sc4) j70).r();
            }
        } catch (Throwable th) {
            if (this.Y1) {
                this.Y1 = false;
                ((sc4) j70).r();
            }
            throw th;
        }
    }

    public final boolean u0(ea6 ea6) {
        s1d s1d = this.o;
        s1d.getClass();
        if (s1d.a != 0) {
            int z0 = z0(ea6);
            if ((z0 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0) {
                s1d s1d2 = this.o;
                s1d2.getClass();
                if (s1d2.a == 2 || (z0 & 1024) != 0 || (ea6.E == 0 && ea6.F == 0)) {
                    return true;
                }
            }
        }
        return ((sc4) this.Q1).f(ea6) != 0;
    }

    public final void v() {
        ((sc4) this.Q1).o();
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v6, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v5, resolved type: on8} */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0047, code lost:
        if ((r4.isEmpty() ? null : (defpackage.on8) r4.get(0)) != null) goto L_0x0049;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x006e  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0073  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int v0(defpackage.rx0 r14, defpackage.ea6 r15) {
        /*
            r13 = this;
            java.lang.String r0 = r15.n
            boolean r0 = defpackage.vq9.h(r0)
            r1 = 0
            if (r0 != 0) goto L_0x000e
            int r13 = defpackage.pk0.b(r1, r1, r1, r1)
            return r13
        L_0x000e:
            int r0 = defpackage.v0g.a
            r2 = 21
            if (r0 < r2) goto L_0x0017
            r0 = 32
            goto L_0x0018
        L_0x0017:
            r0 = r1
        L_0x0018:
            r2 = 1
            int r3 = r15.K
            if (r3 == 0) goto L_0x001f
            r4 = r2
            goto L_0x0020
        L_0x001f:
            r4 = r1
        L_0x0020:
            r5 = 2
            if (r3 == 0) goto L_0x0028
            if (r3 != r5) goto L_0x0026
            goto L_0x0028
        L_0x0026:
            r3 = r1
            goto L_0x0029
        L_0x0028:
            r3 = r2
        L_0x0029:
            r6 = 0
            java.lang.String r7 = "audio/raw"
            r8 = 8
            r9 = 4
            j70 r10 = r13.Q1
            if (r3 == 0) goto L_0x005b
            if (r4 == 0) goto L_0x0049
            java.util.List r4 = defpackage.fo8.e(r1, r7, r1)
            boolean r11 = r4.isEmpty()
            if (r11 == 0) goto L_0x0041
            r4 = r6
            goto L_0x0047
        L_0x0041:
            java.lang.Object r4 = r4.get(r1)
            on8 r4 = (defpackage.on8) r4
        L_0x0047:
            if (r4 == 0) goto L_0x005b
        L_0x0049:
            int r13 = r13.z0(r15)
            r4 = r10
            sc4 r4 = (defpackage.sc4) r4
            int r4 = r4.f(r15)
            if (r4 == 0) goto L_0x005c
            int r13 = defpackage.pk0.b(r9, r8, r0, r13)
            return r13
        L_0x005b:
            r13 = r1
        L_0x005c:
            java.lang.String r4 = r15.n
            boolean r11 = r7.equals(r4)
            if (r11 == 0) goto L_0x0073
            r11 = r10
            sc4 r11 = (defpackage.sc4) r11
            int r11 = r11.f(r15)
            if (r11 == 0) goto L_0x006e
            goto L_0x0073
        L_0x006e:
            int r13 = defpackage.pk0.b(r2, r1, r1, r1)
            return r13
        L_0x0073:
            ba6 r11 = new ba6
            r11.<init>()
            java.lang.String r12 = defpackage.vq9.l(r7)
            r11.m = r12
            int r12 = r15.B
            r11.A = r12
            int r12 = r15.C
            r11.B = r12
            r11.C = r5
            ea6 r12 = new ea6
            r12.<init>(r11)
            sc4 r10 = (defpackage.sc4) r10
            int r11 = r10.f(r12)
            if (r11 == 0) goto L_0x0115
            if (r4 != 0) goto L_0x009a
            k0d r14 = defpackage.k0d.v
            goto L_0x00bd
        L_0x009a:
            int r4 = r10.f(r15)
            if (r4 == 0) goto L_0x00b9
            java.util.List r4 = defpackage.fo8.e(r1, r7, r1)
            boolean r7 = r4.isEmpty()
            if (r7 == 0) goto L_0x00ab
            goto L_0x00b2
        L_0x00ab:
            java.lang.Object r4 = r4.get(r1)
            r6 = r4
            on8 r6 = (defpackage.on8) r6
        L_0x00b2:
            if (r6 == 0) goto L_0x00b9
            k0d r14 = defpackage.tb7.t(r6)
            goto L_0x00bd
        L_0x00b9:
            k0d r14 = defpackage.fo8.g(r14, r15, r1, r1)
        L_0x00bd:
            boolean r4 = r14.isEmpty()
            if (r4 == 0) goto L_0x00c8
            int r13 = defpackage.pk0.b(r2, r1, r1, r1)
            return r13
        L_0x00c8:
            if (r3 != 0) goto L_0x00cf
            int r13 = defpackage.pk0.b(r5, r1, r1, r1)
            return r13
        L_0x00cf:
            java.lang.Object r3 = r14.get(r1)
            on8 r3 = (defpackage.on8) r3
            boolean r4 = r3.d(r15)
            if (r4 != 0) goto L_0x00f2
            r5 = r2
        L_0x00dc:
            int r6 = r14.o
            if (r5 >= r6) goto L_0x00f2
            java.lang.Object r6 = r14.get(r5)
            on8 r6 = (defpackage.on8) r6
            boolean r7 = r6.d(r15)
            if (r7 == 0) goto L_0x00ef
            r14 = r1
            r3 = r6
            goto L_0x00f4
        L_0x00ef:
            int r5 = r5 + 1
            goto L_0x00dc
        L_0x00f2:
            r14 = r2
            r2 = r4
        L_0x00f4:
            if (r2 == 0) goto L_0x00f7
            goto L_0x00f8
        L_0x00f7:
            r9 = 3
        L_0x00f8:
            if (r2 == 0) goto L_0x0102
            boolean r15 = r3.e(r15)
            if (r15 == 0) goto L_0x0102
            r8 = 16
        L_0x0102:
            boolean r15 = r3.g
            if (r15 == 0) goto L_0x0109
            r15 = 64
            goto L_0x010a
        L_0x0109:
            r15 = r1
        L_0x010a:
            if (r14 == 0) goto L_0x010e
            r1 = 128(0x80, float:1.794E-43)
        L_0x010e:
            r14 = r9 | r8
            r14 = r14 | r0
            r14 = r14 | r15
            r14 = r14 | r1
            r13 = r13 | r14
            return r13
        L_0x0115:
            int r13 = defpackage.pk0.b(r2, r1, r1, r1)
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ln8.v0(rx0, ea6):int");
    }

    public final void w() {
        B0();
        sc4 sc4 = (sc4) this.Q1;
        sc4.Y = false;
        if (sc4.l()) {
            x70 x70 = sc4.i;
            x70.d();
            if (x70.y == -9223372036854775807L) {
                v70 v70 = x70.f;
                v70.getClass();
                v70.a();
            } else {
                x70.A = x70.b();
                if (!sc4.m(sc4.w)) {
                    return;
                }
            }
            sc4.w.pause();
        }
    }

    public final int z0(ea6 ea6) {
        a60 e = ((sc4) this.Q1).e(ea6);
        if (!e.a) {
            return 0;
        }
        int i = e.b ? 1536 : ConstantsKt.MINIMUM_BLOCK_SIZE;
        return e.c ? i | 2048 : i;
    }
}
