package defpackage;

import java.nio.ByteBuffer;

/* renamed from: em0  reason: default package */
public final class em0 extends ba4 {
    public long Y;
    public int Z;
    public int v0;

    public final boolean D(ba4 ba4) {
        ByteBuffer byteBuffer;
        n79.g(!ba4.h(1073741824));
        n79.g(!ba4.h(268435456));
        n79.g(!ba4.h(4));
        if (E()) {
            if (this.Z >= this.v0) {
                return false;
            }
            ByteBuffer byteBuffer2 = ba4.v;
            if (!(byteBuffer2 == null || (byteBuffer = this.v) == null)) {
                if (byteBuffer2.remaining() + byteBuffer.position() > 3072000) {
                    return false;
                }
            }
        }
        int i = this.Z;
        this.Z = i + 1;
        if (i == 0) {
            this.x = ba4.x;
            if (ba4.h(1)) {
                this.b = 1;
            }
        }
        ByteBuffer byteBuffer3 = ba4.v;
        if (byteBuffer3 != null) {
            B(byteBuffer3.remaining());
            this.v.put(byteBuffer3);
        }
        this.Y = ba4.x;
        return true;
    }

    public final boolean E() {
        return this.Z > 0;
    }

    public final void z() {
        super.z();
        this.Z = 0;
    }
}
