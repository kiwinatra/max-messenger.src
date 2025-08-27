package defpackage;

import java.nio.ByteBuffer;

/* renamed from: ba4  reason: default package */
public class ba4 extends ty {
    public final int X;
    public ea6 c;
    public final h44 o = new h44(1);
    public ByteBuffer v;
    public boolean w;
    public long x;
    public ByteBuffer y;
    public final int z;

    static {
        cs8.a("media3.decoder");
    }

    public ba4(int i) {
        super(3);
        this.z = i;
        this.X = 0;
    }

    public final ByteBuffer A(int i) {
        int i2 = this.z;
        if (i2 == 1) {
            return ByteBuffer.allocate(i);
        }
        if (i2 == 2) {
            return ByteBuffer.allocateDirect(i);
        }
        ByteBuffer byteBuffer = this.v;
        throw new IllegalStateException(a81.l("Buffer too small (", byteBuffer == null ? 0 : byteBuffer.capacity(), " < ", i, ")"));
    }

    public final void B(int i) {
        int i2 = i + this.X;
        ByteBuffer byteBuffer = this.v;
        if (byteBuffer == null) {
            this.v = A(i2);
            return;
        }
        int capacity = byteBuffer.capacity();
        int position = byteBuffer.position();
        int i3 = i2 + position;
        if (capacity >= i3) {
            this.v = byteBuffer;
            return;
        }
        ByteBuffer A = A(i3);
        A.order(byteBuffer.order());
        if (position > 0) {
            byteBuffer.flip();
            A.put(byteBuffer);
        }
        this.v = A;
    }

    public final void C() {
        ByteBuffer byteBuffer = this.v;
        if (byteBuffer != null) {
            byteBuffer.flip();
        }
        ByteBuffer byteBuffer2 = this.y;
        if (byteBuffer2 != null) {
            byteBuffer2.flip();
        }
    }

    public void z() {
        this.b = 0;
        ByteBuffer byteBuffer = this.v;
        if (byteBuffer != null) {
            byteBuffer.clear();
        }
        ByteBuffer byteBuffer2 = this.y;
        if (byteBuffer2 != null) {
            byteBuffer2.clear();
        }
        this.w = false;
    }
}
