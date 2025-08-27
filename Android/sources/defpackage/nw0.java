package defpackage;

import java.nio.ByteBuffer;
import java.util.Arrays;

/* renamed from: nw0  reason: default package */
public final class nw0 {
    public final ByteBuffer[] a;
    public final int b;
    public final int c;
    public final int d;

    public nw0(ByteBuffer[] byteBufferArr) {
        int length = byteBufferArr.length;
        this.a = byteBufferArr;
        this.b = 0;
        this.c = length;
        this.d = length;
        if (byteBufferArr.length < length) {
            throw new IllegalStateException("Check failed.".toString());
        }
    }

    public final long a() {
        long j = 0;
        for (int i = this.b; i < this.d; i++) {
            j += (long) this.a[i].remaining();
        }
        return j;
    }

    public final String toString() {
        StringBuilder p = tr1.p("ByteBufferSet[", Arrays.toString(this.a), ":");
        p.append(this.b);
        p.append(":");
        return wj6.l(p, this.c, "]");
    }

    public nw0(ByteBuffer byteBuffer) {
        this(new ByteBuffer[]{byteBuffer});
    }
}
