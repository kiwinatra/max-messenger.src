package defpackage;

/* renamed from: pxg  reason: default package */
public final class pxg extends rxg {
    public final transient int c;
    public final transient int o;
    public final /* synthetic */ rxg v;

    public pxg(rxg rxg, int i, int i2) {
        this.v = rxg;
        this.c = i;
        this.o = i2;
    }

    public final int d() {
        return this.v.e() + this.c + this.o;
    }

    public final int e() {
        return this.v.e() + this.c;
    }

    public final boolean g() {
        return true;
    }

    public final Object get(int i) {
        vzg.N(i, this.o);
        return this.v.get(i + this.c);
    }

    public final Object[] l() {
        return this.v.l();
    }

    /* renamed from: m */
    public final rxg subList(int i, int i2) {
        vzg.R(i, i2, this.o);
        int i3 = this.c;
        return this.v.subList(i + i3, i2 + i3);
    }

    public final int size() {
        return this.o;
    }
}
