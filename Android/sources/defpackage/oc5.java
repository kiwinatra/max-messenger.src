package defpackage;

import android.media.MediaFormat;

/* renamed from: oc5  reason: default package */
public final class oc5 implements q5g, yu1, rpb {
    public q5g a;
    public yu1 b;
    public q5g c;
    public yu1 o;

    public final void a(int i, Object obj) {
        if (i == 7) {
            this.a = (q5g) obj;
        } else if (i == 8) {
            this.b = (yu1) obj;
        } else if (i == 10000) {
            wge wge = (wge) obj;
            if (wge == null) {
                this.c = null;
                this.o = null;
                return;
            }
            this.c = wge.getVideoFrameMetadataListener();
            this.o = wge.getCameraMotionListener();
        }
    }

    public final void b(long j, float[] fArr) {
        yu1 yu1 = this.o;
        if (yu1 != null) {
            yu1.b(j, fArr);
        }
        yu1 yu12 = this.b;
        if (yu12 != null) {
            yu12.b(j, fArr);
        }
    }

    public final void c() {
        yu1 yu1 = this.o;
        if (yu1 != null) {
            yu1.c();
        }
        yu1 yu12 = this.b;
        if (yu12 != null) {
            yu12.c();
        }
    }

    public final void d(long j, long j2, ca6 ca6, MediaFormat mediaFormat) {
        q5g q5g = this.c;
        if (q5g != null) {
            q5g.d(j, j2, ca6, mediaFormat);
        }
        q5g q5g2 = this.a;
        if (q5g2 != null) {
            q5g2.d(j, j2, ca6, mediaFormat);
        }
    }
}
