package defpackage;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* renamed from: qi0  reason: default package */
public abstract class qi0 implements m60 {
    public j60 b;
    public j60 c;
    public j60 d;
    public j60 e;
    public ByteBuffer f;
    public ByteBuffer g;
    public boolean h;

    public qi0() {
        ByteBuffer byteBuffer = m60.a;
        this.f = byteBuffer;
        this.g = byteBuffer;
        j60 j60 = j60.e;
        this.d = j60;
        this.e = j60;
        this.b = j60;
        this.c = j60;
    }

    public ByteBuffer a() {
        ByteBuffer byteBuffer = this.g;
        this.g = m60.a;
        return byteBuffer;
    }

    public final void c() {
        this.h = true;
        i();
    }

    public boolean d() {
        return this.h && this.g == m60.a;
    }

    public final j60 e(j60 j60) {
        this.d = j60;
        this.e = g(j60);
        return isActive() ? this.e : j60.e;
    }

    public final void flush() {
        this.g = m60.a;
        this.h = false;
        this.b = this.d;
        this.c = this.e;
        h();
    }

    public abstract j60 g(j60 j60);

    public void h() {
    }

    public void i() {
    }

    public boolean isActive() {
        return this.e != j60.e;
    }

    public void j() {
    }

    public final ByteBuffer k(int i) {
        if (this.f.capacity() < i) {
            this.f = ByteBuffer.allocateDirect(i).order(ByteOrder.nativeOrder());
        } else {
            this.f.clear();
        }
        ByteBuffer byteBuffer = this.f;
        this.g = byteBuffer;
        return byteBuffer;
    }

    public final void reset() {
        flush();
        this.f = m60.a;
        j60 j60 = j60.e;
        this.d = j60;
        this.e = j60;
        this.b = j60;
        this.c = j60;
        j();
    }
}
