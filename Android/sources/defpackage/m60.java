package defpackage;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* renamed from: m60  reason: default package */
public interface m60 {
    public static final ByteBuffer a = ByteBuffer.allocateDirect(0).order(ByteOrder.nativeOrder());

    ByteBuffer a();

    void b(ByteBuffer byteBuffer);

    void c();

    boolean d();

    j60 e(j60 j60);

    long f(long j) {
        return j;
    }

    void flush();

    boolean isActive();

    void reset();
}
