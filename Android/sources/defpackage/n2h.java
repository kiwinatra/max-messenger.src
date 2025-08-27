package defpackage;

/* renamed from: n2h  reason: default package */
public final class n2h extends p2h {
    public final transient int c;
    public final transient int o;
    public final /* synthetic */ p2h v;

    public n2h(p2h p2h, int i, int i2) {
        this.v = p2h;
        this.c = i;
        this.o = i2;
    }

    public final Object[] b() {
        return this.v.b();
    }

    public final int d() {
        return this.v.d() + this.c;
    }

    public final int e() {
        return this.v.d() + this.c + this.o;
    }

    public final boolean f() {
        return true;
    }

    public final Object get(int i) {
        o54.T(i, this.o);
        return this.v.get(i + this.c);
    }

    /* renamed from: l */
    public final p2h subList(int i, int i2) {
        o54.U(i, i2, this.o);
        int i3 = this.c;
        return this.v.subList(i + i3, i2 + i3);
    }

    public final int size() {
        return this.o;
    }
}
