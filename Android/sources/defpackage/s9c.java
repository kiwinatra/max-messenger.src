package defpackage;

/* renamed from: s9c  reason: default package */
public final class s9c extends xi0 {
    public static final /* synthetic */ int l = 0;
    public final ph3 j;
    public final int k;

    public s9c(ph3 ph3, fn4 fn4, rh3 rh3, int i, ni3 ni3, cm cmVar, die die) {
        super(fn4, rh3, ni3, cmVar, die);
        this.j = ph3;
        this.k = i;
    }

    public final int c() {
        return Integer.parseInt(this.j.b);
    }

    public final void close() {
    }

    public final void f(boolean z) {
    }

    public final String h() {
        return this.j.a;
    }

    public final int i() {
        return this.k;
    }

    public final String toString() {
        return "ProxyClient{connectionHost=" + this.j + '}';
    }
}
