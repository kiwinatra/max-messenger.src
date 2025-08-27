package defpackage;

import java.nio.ByteBuffer;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.io.ConstantsKt;

/* renamed from: zt0  reason: default package */
public final class zt0 {
    public static final Lazy h = LazyKt.lazy(new m(21));
    public final String a;
    public final boolean b;
    public final tt0 c;
    public final int d = 17408;
    public final String e;
    public ByteBuffer f;
    public int g;

    public zt0(String str, boolean z, tt0 tt0) {
        this.a = str;
        this.b = z;
        this.c = tt0;
        this.e = g63.i(zt0.class.getName(), "/", str);
        this.g = ConstantsKt.DEFAULT_BLOCK_SIZE;
    }

    public final boolean a() {
        if (this.f == null) {
            return false;
        }
        this.c.b(e());
        this.f = null;
        return true;
    }

    public final void b() {
        if (this.f != null) {
            ByteBuffer e2 = e();
            int capacity = e2.capacity();
            String str = this.a;
            int i = this.d;
            if (capacity < i) {
                int min = Math.min(e2.capacity() * 2, i);
                int capacity2 = e2.capacity();
                z68.c(this.e, "enlarging buffer " + str + ", increasing from " + capacity2 + " to " + min, new Object[0]);
                tt0 tt0 = this.c;
                ByteBuffer a2 = tt0.a(min);
                ByteBuffer e3 = e();
                e3.flip();
                a2.put(e3);
                if (this.b) {
                    f(0);
                }
                tt0.b(e3);
                this.f = a2;
                this.g = min;
                return;
            }
            int capacity3 = e2.capacity();
            throw new IllegalStateException((str + " buffer insufficient despite having capacity of " + capacity3).toString());
        }
    }

    public final void c() {
        if (this.f == null) {
            this.f = this.c.a(this.g);
        }
    }

    public final boolean d() {
        ByteBuffer byteBuffer = this.f;
        if (byteBuffer == null || byteBuffer.position() != 0) {
            return false;
        }
        return a();
    }

    public final ByteBuffer e() {
        ByteBuffer byteBuffer = this.f;
        if (byteBuffer != null) {
            return byteBuffer;
        }
        throw new IllegalArgumentException("Required value was null.".toString());
    }

    public final void f(int i) {
        if (this.f != null) {
            ByteBuffer e2 = e();
            e2.mark();
            e2.position(i);
            int remaining = e2.remaining();
            Lazy lazy = h;
            int min = Math.min(remaining, ((byte[]) lazy.getValue()).length);
            int i2 = 0;
            while (min > 0) {
                e2.put((byte[]) lazy.getValue(), 0, min);
                i2 += min;
                min = Math.min(remaining - i2, ((byte[]) lazy.getValue()).length);
            }
            e2.reset();
        }
    }

    public final String toString() {
        ByteBuffer byteBuffer = this.f;
        int i = this.g;
        StringBuilder sb = new StringBuilder("BufferHolder{name='");
        sb.append(this.a);
        sb.append("', allocator=");
        sb.append(this.c);
        sb.append(", plainData=");
        sb.append(this.b);
        sb.append(", maxSize=");
        sb.append(this.d);
        sb.append(", buffer=");
        sb.append(byteBuffer);
        sb.append(", lastSize=");
        return wj6.l(sb, i, "}");
    }
}
