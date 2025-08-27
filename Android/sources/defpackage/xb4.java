package defpackage;

import java.nio.ByteBuffer;

/* renamed from: xb4  reason: default package */
public final class xb4 {
    public long a;
    public final j60 b;
    public final b22 c;
    public final /* synthetic */ yb4 d;

    public xb4(yb4 yb4, j60 j60, b22 b22, long j) {
        this.d = yb4;
        this.b = j60;
        this.a = j;
        this.c = b22;
    }

    public final void a(long j, ByteBuffer byteBuffer) {
        n79.g(j >= this.a);
        byteBuffer.position((((int) (j - this.a)) * this.b.d) + byteBuffer.position());
        this.a = j;
    }
}
