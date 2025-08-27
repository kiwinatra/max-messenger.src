package defpackage;

import java.nio.ByteBuffer;

/* renamed from: hu0  reason: default package */
public final class hu0 {
    public final int a;
    public final int b;
    public final ByteBuffer c;
    public long d;

    public hu0(ByteBuffer byteBuffer, ba0 ba0, int i, int i2) {
        byteBuffer.rewind();
        int limit = byteBuffer.limit() - byteBuffer.position();
        if (limit == ba0.a) {
            this.a = i;
            this.b = i2;
            this.c = byteBuffer;
            this.d = ba0.b;
            return;
        }
        StringBuilder o = wj6.o(limit, "Byte buffer size is not match with packet info: ", " != ");
        o.append(ba0.a);
        throw new IllegalStateException(o.toString());
    }

    public final ba0 a(ByteBuffer byteBuffer) {
        int i;
        long j = this.d;
        ByteBuffer byteBuffer2 = this.c;
        int position = byteBuffer2.position();
        int position2 = byteBuffer.position();
        if (byteBuffer2.remaining() > byteBuffer.remaining()) {
            i = byteBuffer.remaining();
            this.d += m5a.u(this.b, m5a.Q(this.a, (long) i));
            ByteBuffer duplicate = byteBuffer2.duplicate();
            duplicate.position(position).limit(position + i);
            byteBuffer.put(duplicate).limit(position2 + i).position(position2);
        } else {
            i = byteBuffer2.remaining();
            byteBuffer.put(byteBuffer2).limit(position2 + i).position(position2);
        }
        byteBuffer2.position(position + i);
        return new ba0(i, j);
    }
}
