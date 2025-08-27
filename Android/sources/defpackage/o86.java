package defpackage;

/* renamed from: o86  reason: default package */
public final class o86 extends ad9 {
    public static volatile o86[] i;
    public long a = 0;
    public String b = "";
    public String c = "";
    public String d = "";
    public long e = 0;
    public String f = "";
    public String g = "";
    public String h = "";

    public o86() {
        this.cachedSize = -1;
    }

    public final int computeSerializedSize() {
        long j = this.a;
        int h2 = j != 0 ? j43.h(1, j) : 0;
        if (!this.b.equals("")) {
            h2 += j43.l(2, this.b);
        }
        if (!this.c.equals("")) {
            h2 += j43.l(3, this.c);
        }
        if (!this.d.equals("")) {
            h2 += j43.l(4, this.d);
        }
        long j2 = this.e;
        if (j2 != 0) {
            h2 += j43.h(5, j2);
        }
        if (!this.f.equals("")) {
            h2 += j43.l(6, this.f);
        }
        if (!this.g.equals("")) {
            h2 += j43.l(7, this.g);
        }
        return !this.h.equals("") ? h2 + j43.l(8, this.h) : h2;
    }

    public final ad9 mergeFrom(i43 i43) {
        while (true) {
            int s = i43.s();
            if (s == 0) {
                break;
            } else if (s == 8) {
                this.a = i43.q();
            } else if (s == 18) {
                this.b = i43.r();
            } else if (s == 26) {
                this.c = i43.r();
            } else if (s == 34) {
                this.d = i43.r();
            } else if (s == 40) {
                this.e = i43.q();
            } else if (s == 50) {
                this.f = i43.r();
            } else if (s == 58) {
                this.g = i43.r();
            } else if (s == 66) {
                this.h = i43.r();
            } else if (!i43.u(s)) {
                break;
            }
        }
        return this;
    }

    public final void writeTo(j43 j43) {
        long j = this.a;
        if (j != 0) {
            j43.x(1, j);
        }
        if (!this.b.equals("")) {
            j43.E(2, this.b);
        }
        if (!this.c.equals("")) {
            j43.E(3, this.c);
        }
        if (!this.d.equals("")) {
            j43.E(4, this.d);
        }
        long j2 = this.e;
        if (j2 != 0) {
            j43.x(5, j2);
        }
        if (!this.f.equals("")) {
            j43.E(6, this.f);
        }
        if (!this.g.equals("")) {
            j43.E(7, this.g);
        }
        if (!this.h.equals("")) {
            j43.E(8, this.h);
        }
    }
}
