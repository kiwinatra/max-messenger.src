package defpackage;

import java.nio.ByteBuffer;

/* renamed from: v64  reason: default package */
public final class v64 extends hhd {
    public final int b;
    public final long c;

    public v64(int i, long j, boolean z, boolean z2, boolean z3, boolean z4, ByteBuffer byteBuffer) {
        this.b = i;
        this.c = j;
        byte b2 = this.a;
        if (z) {
            this.a = (byte) (b2 | 1);
        } else {
            this.a = (byte) (b2 & -2);
        }
        byte b3 = this.a;
        if (z2) {
            this.a = (byte) (b3 | 2);
        } else {
            this.a = (byte) (b3 & -3);
        }
        byte b4 = this.a;
        if (z3) {
            this.a = (byte) (b4 | 4);
        } else {
            this.a = (byte) (b4 & -5);
        }
        byte b5 = this.a;
        if (z4) {
            this.a = (byte) (b5 | 8);
        } else {
            this.a = (byte) (b5 & -9);
        }
    }

    public final ByteBuffer a() {
        ByteBuffer allocate = ByteBuffer.allocate(11);
        allocate.put((byte) 1);
        allocate.putShort((short) this.b);
        allocate.putInt((int) this.c);
        allocate.put((byte) 1);
        allocate.putShort((short) 0);
        allocate.put(this.a);
        allocate.rewind();
        return allocate;
    }
}
