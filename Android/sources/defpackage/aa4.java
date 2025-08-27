package defpackage;

import java.nio.ByteBuffer;

/* renamed from: aa4  reason: default package */
public class aa4 extends ty {
    public final h44 c = new h44(0);
    public ByteBuffer o;
    public boolean v;
    public long w;
    public ByteBuffer x;
    public final int y;
    public final int z;

    static {
        gd5.a("goog.exo.decoder");
    }

    public aa4(int i) {
        super(2);
        this.y = i;
        this.z = 0;
    }

    public final ByteBuffer A(int i) {
        int i2 = this.y;
        if (i2 == 1) {
            return ByteBuffer.allocate(i);
        }
        if (i2 == 2) {
            return ByteBuffer.allocateDirect(i);
        }
        ByteBuffer byteBuffer = this.o;
        int capacity = byteBuffer == null ? 0 : byteBuffer.capacity();
        StringBuilder sb = new StringBuilder(44);
        sb.append("Buffer too small (");
        sb.append(capacity);
        sb.append(" < ");
        sb.append(i);
        sb.append(")");
        throw new IllegalStateException(sb.toString());
    }

    public final void B(int i) {
        int i2 = i + this.z;
        ByteBuffer byteBuffer = this.o;
        if (byteBuffer == null) {
            this.o = A(i2);
            return;
        }
        int capacity = byteBuffer.capacity();
        int position = byteBuffer.position();
        int i3 = i2 + position;
        if (capacity >= i3) {
            this.o = byteBuffer;
            return;
        }
        ByteBuffer A = A(i3);
        A.order(byteBuffer.order());
        if (position > 0) {
            byteBuffer.flip();
            A.put(byteBuffer);
        }
        this.o = A;
    }

    public final void C() {
        ByteBuffer byteBuffer = this.o;
        if (byteBuffer != null) {
            byteBuffer.flip();
        }
        ByteBuffer byteBuffer2 = this.x;
        if (byteBuffer2 != null) {
            byteBuffer2.flip();
        }
    }

    public void z() {
        this.b = 0;
        ByteBuffer byteBuffer = this.o;
        if (byteBuffer != null) {
            byteBuffer.clear();
        }
        ByteBuffer byteBuffer2 = this.x;
        if (byteBuffer2 != null) {
            byteBuffer2.clear();
        }
        this.v = false;
    }
}
