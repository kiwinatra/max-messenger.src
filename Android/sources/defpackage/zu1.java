package defpackage;

import java.nio.ByteBuffer;
import kotlin.jvm.internal.IntCompanionObject;

/* renamed from: zu1  reason: default package */
public final class zu1 extends ok0 {
    public final aa4 v0 = new aa4(1);
    public final g1g w0 = new g1g(3, false);
    public long x0;
    public yu1 y0;
    public long z0;

    public zu1() {
        super(6);
    }

    public final int A(ca6 ca6) {
        return "application/x-camera-motion".equals(ca6.Z) ? ok0.b(4, 0, 0) : ok0.b(0, 0, 0);
    }

    public final void a(int i, Object obj) {
        if (i == 8) {
            this.y0 = (yu1) obj;
        }
    }

    public final String k() {
        return "CameraMotionRenderer";
    }

    public final boolean m() {
        return l();
    }

    public final boolean n() {
        return true;
    }

    public final void o() {
        yu1 yu1 = this.y0;
        if (yu1 != null) {
            yu1.c();
        }
    }

    public final void q(long j, boolean z) {
        this.z0 = Long.MIN_VALUE;
        yu1 yu1 = this.y0;
        if (yu1 != null) {
            yu1.c();
        }
    }

    public final void u(ca6[] ca6Arr, long j, long j2) {
        this.x0 = j2;
    }

    public final void w(long j, long j2) {
        float[] fArr;
        while (!l() && this.z0 < 100000 + j) {
            aa4 aa4 = this.v0;
            aa4.z();
            xe8 xe8 = this.b;
            xe8.j();
            if (v(xe8, aa4, 0) == -4 && !aa4.h(4)) {
                this.z0 = aa4.w;
                if (this.y0 != null && !aa4.h(IntCompanionObject.MIN_VALUE)) {
                    aa4.C();
                    ByteBuffer byteBuffer = aa4.o;
                    int i = t0g.a;
                    if (byteBuffer.remaining() != 16) {
                        fArr = null;
                    } else {
                        byte[] array = byteBuffer.array();
                        int limit = byteBuffer.limit();
                        g1g g1g = this.w0;
                        g1g.F(limit, array);
                        g1g.H(byteBuffer.arrayOffset() + 4);
                        float[] fArr2 = new float[3];
                        for (int i2 = 0; i2 < 3; i2++) {
                            fArr2[i2] = Float.intBitsToFloat(g1g.j());
                        }
                        fArr = fArr2;
                    }
                    if (fArr != null) {
                        this.y0.b(this.z0 - this.x0, fArr);
                    }
                }
            } else {
                return;
            }
        }
    }
}
