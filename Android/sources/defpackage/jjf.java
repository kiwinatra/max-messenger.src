package defpackage;

/* renamed from: jjf  reason: default package */
public final class jjf implements lcd {
    public final lcd a;
    public final long b;

    public jjf(lcd lcd, long j) {
        this.a = lcd;
        this.b = j;
    }

    public final void b() {
        this.a.b();
    }

    public final boolean c() {
        return this.a.c();
    }

    public final int e(long j) {
        return this.a.e(j - this.b);
    }

    public final int f(ox0 ox0, ba4 ba4, int i) {
        int f = this.a.f(ox0, ba4, i);
        if (f == -4) {
            ba4.x += this.b;
        }
        return f;
    }
}
