package defpackage;

import java.nio.ByteBuffer;

/* renamed from: av1  reason: default package */
public final class av1 extends pk0 {
    public final ba4 A0 = new ba4(1);
    public final l8b B0 = new l8b();
    public long C0;
    public pc5 D0;
    public long E0;

    public av1() {
        super(6);
    }

    public final int D(ea6 ea6) {
        return "application/x-camera-motion".equals(ea6.n) ? pk0.b(4, 0, 0, 0) : pk0.b(0, 0, 0, 0);
    }

    public final void a(int i, Object obj) {
        if (i == 8) {
            this.D0 = (pc5) obj;
        }
    }

    public final String l() {
        return "CameraMotionRenderer";
    }

    public final boolean n() {
        return m();
    }

    public final boolean p() {
        return true;
    }

    public final void q() {
        pc5 pc5 = this.D0;
        if (pc5 != null) {
            pc5.c();
        }
    }

    public final void s(long j, boolean z) {
        this.E0 = Long.MIN_VALUE;
        pc5 pc5 = this.D0;
        if (pc5 != null) {
            pc5.c();
        }
    }

    public final void x(ea6[] ea6Arr, long j, long j2) {
        this.C0 = j2;
    }

    public final void z(long j, long j2) {
        float[] fArr;
        while (!m() && this.E0 < 100000 + j) {
            ba4 ba4 = this.A0;
            ba4.z();
            ox0 ox0 = this.c;
            ox0.u();
            if (y(ox0, ba4, 0) == -4 && !ba4.h(4)) {
                long j3 = ba4.x;
                this.E0 = j3;
                boolean z = j3 < this.Z;
                if (this.D0 != null && !z) {
                    ba4.C();
                    ByteBuffer byteBuffer = ba4.v;
                    int i = v0g.a;
                    if (byteBuffer.remaining() != 16) {
                        fArr = null;
                    } else {
                        byte[] array = byteBuffer.array();
                        int limit = byteBuffer.limit();
                        l8b l8b = this.B0;
                        l8b.E(limit, array);
                        l8b.G(byteBuffer.arrayOffset() + 4);
                        float[] fArr2 = new float[3];
                        for (int i2 = 0; i2 < 3; i2++) {
                            fArr2[i2] = Float.intBitsToFloat(l8b.i());
                        }
                        fArr = fArr2;
                    }
                    if (fArr != null) {
                        this.D0.b(this.E0 - this.C0, fArr);
                    }
                }
            } else {
                return;
            }
        }
    }
}
