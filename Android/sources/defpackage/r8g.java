package defpackage;

import android.media.MediaCodec;
import androidx.media3.common.VideoFrameProcessingException;
import androidx.media3.transformer.ExportException;

/* renamed from: r8g  reason: default package */
public final class r8g extends dcd {
    public final g6d e;
    public final q8g f;
    public final ba4 g;
    public final long h;
    public volatile long i = -9223372036854775807L;
    public boolean j;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public r8g(android.content.Context r14, defpackage.ea6 r15, defpackage.hrf r16, defpackage.t9a r17, java.util.List r18, defpackage.v5g r19, defpackage.f43 r20, defpackage.g0a r21, defpackage.jrf r22, defpackage.ni3 r23, defpackage.rx0 r24, long r25, boolean r27) {
        /*
            r13 = this;
            r0 = r13
            r1 = r15
            r2 = r21
            r13.<init>(r15, r2)
            r3 = r25
            r0.h = r3
            r3 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r0.i = r3
            m53 r3 = r1.A
            r3.getClass()
            int r4 = r3.c
            r5 = 2
            if (r4 != r5) goto L_0x0036
            java.lang.String r4 = r1.n
            java.lang.String r6 = "image/jpeg_r"
            boolean r4 = java.util.Objects.equals(r4, r6)
            if (r4 == 0) goto L_0x0033
            m53 r4 = new m53
            r12 = 0
            r11 = -1
            r7 = 6
            r8 = 1
            r9 = 7
            r6 = r4
            r10 = r11
            r6.<init>(r7, r8, r9, r10, r11, r12)
            goto L_0x0037
        L_0x0033:
            m53 r4 = defpackage.m53.h
            goto L_0x0037
        L_0x0036:
            r4 = r3
        L_0x0037:
            q8g r12 = new q8g
            ba6 r1 = r15.a()
            r1.z = r4
            ea6 r8 = new ea6
            r8.<init>(r1)
            b0a r1 = r2.b
            tb7 r9 = r1.C(r5)
            r6 = r12
            r7 = r20
            r10 = r16
            r11 = r23
            r6.<init>(r7, r8, r9, r10, r11)
            r0.f = r12
            ba4 r1 = new ba4
            r2 = 0
            r1.<init>(r2)
            r0.g = r1
            int r1 = r12.g
            if (r1 != r5) goto L_0x006c
            boolean r1 = defpackage.m53.g(r3)
            if (r1 == 0) goto L_0x006c
            m53 r1 = defpackage.m53.h
            r5 = r1
            goto L_0x006d
        L_0x006c:
            r5 = r4
        L_0x006d:
            g6d r10 = new g6d     // Catch:{ VideoFrameProcessingException -> 0x007a }
            if (r27 == 0) goto L_0x007c
            dbe r1 = new dbe     // Catch:{ VideoFrameProcessingException -> 0x007a }
            r2 = 20
            r1.<init>(r2)     // Catch:{ VideoFrameProcessingException -> 0x007a }
        L_0x0078:
            r4 = r1
            goto L_0x0084
        L_0x007a:
            r0 = move-exception
            goto L_0x0098
        L_0x007c:
            p1e r1 = new p1e     // Catch:{ VideoFrameProcessingException -> 0x007a }
            r2 = r19
            r1.<init>((java.lang.Object) r2)     // Catch:{ VideoFrameProcessingException -> 0x007a }
            goto L_0x0078
        L_0x0084:
            r1 = r10
            r2 = r13
            r3 = r14
            r6 = r22
            r7 = r24
            r8 = r17
            r9 = r18
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9)     // Catch:{ VideoFrameProcessingException -> 0x007a }
            r0.e = r10     // Catch:{ VideoFrameProcessingException -> 0x007a }
            r10.c()     // Catch:{ VideoFrameProcessingException -> 0x007a }
            return
        L_0x0098:
            androidx.media3.transformer.ExportException r1 = new androidx.media3.transformer.ExportException
            java.lang.String r2 = "Video frame processing error"
            r3 = 5001(0x1389, float:7.008E-42)
            r1.<init>(r2, r0, r3)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.r8g.<init>(android.content.Context, ea6, hrf, t9a, java.util.List, v5g, f43, g0a, jrf, ni3, rx0, long, boolean):void");
    }

    public final gu6 j(e05 e05, ea6 ea6, int i2) {
        try {
            return ((trf) this.e.b).d(i2);
        } catch (VideoFrameProcessingException e2) {
            throw new ExportException("Video frame processing error", e2, 5001);
        }
    }

    public final ba4 k() {
        ba4 ba4 = this.g;
        q8g q8g = this.f;
        MediaCodec.BufferInfo bufferInfo = null;
        ba4.v = q8g.i != null ? q8g.i.c() : null;
        if (this.g.v == null) {
            return null;
        }
        q8g q8g2 = this.f;
        if (q8g2.i != null) {
            md4 md4 = q8g2.i;
            if (md4.f(false)) {
                bufferInfo = md4.a;
            }
        }
        bufferInfo.getClass();
        if (bufferInfo.presentationTimeUs == 0) {
            if (((trf) this.e.b).f() != this.j || this.i == -9223372036854775807L || bufferInfo.size <= 0) {
                this.j = true;
            } else {
                bufferInfo.presentationTimeUs = this.i;
            }
        }
        ba4 ba42 = this.g;
        ba42.x = bufferInfo.presentationTimeUs;
        ba42.b = bufferInfo.flags;
        return ba42;
    }

    public final ea6 l() {
        q8g q8g = this.f;
        if (q8g.i == null) {
            return null;
        }
        md4 md4 = q8g.i;
        md4.f(false);
        ea6 ea6 = md4.j;
        if (ea6 == null || q8g.j == 0) {
            return ea6;
        }
        ba6 a = ea6.a();
        a.v = q8g.j;
        return new ea6(a);
    }

    public final boolean m() {
        q8g q8g = this.f;
        return q8g.i != null && q8g.i.d();
    }

    public final void o() {
        this.e.release();
        q8g q8g = this.f;
        if (q8g.i != null) {
            q8g.i.h();
        }
        q8g.k = true;
    }

    public final void p() {
        q8g q8g = this.f;
        if (q8g.i != null) {
            q8g.i.i();
        }
    }
}
