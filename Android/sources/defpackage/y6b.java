package defpackage;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* renamed from: y6b  reason: default package */
public final class y6b extends z6b {
    public final ByteBuffer d;

    public y6b(byte[] bArr, int i, int i2) {
        super(bArr, i2 >> 2, i);
        this.d = ByteBuffer.wrap(bArr, i, i2).order(ByteOrder.LITTLE_ENDIAN);
    }

    public final short a(int i) {
        return (short) (((int) ((((double) this.d.getFloat(i << 2)) + 1.0d) * 32767.5d)) - 32768);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PCM float (");
        int i = this.a;
        sb.append(i);
        sb.append(") {");
        if (i > 0) {
            ByteBuffer byteBuffer = this.d;
            sb.append(byteBuffer.getFloat(0));
            for (int i2 = 1; i2 < i; i2++) {
                sb.append(", ");
                sb.append(byteBuffer.getFloat(i2 << 2));
            }
        }
        sb.append('}');
        return sb.toString();
    }
}
