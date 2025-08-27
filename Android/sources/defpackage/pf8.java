package defpackage;

/* renamed from: pf8  reason: default package */
public final class pf8 {
    public final s58 a;
    public final long b;
    public final long c;
    public final tf8 d;
    public final String e;
    public final String f;
    public final float g;
    public final boolean h;
    public final boolean i;
    public final long j;
    public final boolean k;
    public final String l;

    public pf8(of8 of8) {
        this.a = of8.a;
        this.b = of8.b;
        this.c = of8.c;
        this.d = of8.d;
        this.e = of8.e;
        this.f = of8.f;
        this.g = of8.g;
        this.h = of8.h;
        this.i = of8.i;
        this.j = of8.j;
        this.k = of8.k;
        this.l = of8.l;
    }

    public final of8 a() {
        of8 of8 = new of8(this.a);
        of8.b = this.b;
        of8.c = this.c;
        of8.d = this.d;
        of8.e = this.e;
        of8.f = this.f;
        of8.g = this.g;
        of8.h = this.h;
        of8.i = this.i;
        of8.j = this.j;
        of8.k = this.k;
        of8.l = this.l;
        return of8;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MarkerData{location=");
        sb.append(this.a);
        sb.append(", contactId=");
        sb.append(this.b);
        sb.append(", messageId=");
        sb.append(this.c);
        sb.append(", markerWeight=");
        sb.append(this.d);
        sb.append(", title='");
        sb.append(this.e);
        sb.append("', address='");
        sb.append(this.f);
        sb.append("', distance=");
        sb.append(this.g);
        sb.append(", live=");
        sb.append(this.h);
        sb.append(", decoding=");
        sb.append(this.i);
        sb.append(", date=");
        sb.append(this.j);
        sb.append(", active=");
        sb.append(this.k);
        sb.append(", deviceId='");
        return wj6.n(sb, this.l, "'}");
    }
}
