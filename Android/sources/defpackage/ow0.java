package defpackage;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import kotlin.UByte;

/* renamed from: ow0  reason: default package */
public enum ow0 {
    ;

    public static void a(int i, ByteBuffer byteBuffer) {
        if (i < 0 || i >= byteBuffer.capacity()) {
            throw new ArrayIndexOutOfBoundsException(i);
        }
    }

    public static void b(ByteBuffer byteBuffer, int i, int i2) {
        if (i2 < 0) {
            throw new IllegalArgumentException("lengths must be >= 0");
        } else if (i2 > 0) {
            a(i, byteBuffer);
            a((i + i2) - 1, byteBuffer);
        }
    }

    public static ByteBuffer c(ByteBuffer byteBuffer) {
        ByteOrder order = byteBuffer.order();
        ByteOrder byteOrder = w0g.a;
        return order.equals(byteOrder) ? byteBuffer : byteBuffer.duplicate().order(byteOrder);
    }

    public static int d(int i, ByteBuffer byteBuffer) {
        return ((byteBuffer.get(i + 1) & UByte.MAX_VALUE) << 8) | (byteBuffer.get(i) & UByte.MAX_VALUE);
    }

    public static void e(ByteBuffer byteBuffer, int i, int i2) {
        byteBuffer.put(i, (byte) i2);
        byteBuffer.put(i + 1, (byte) (i2 >>> 8));
    }
}
