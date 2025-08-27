package defpackage;

/* renamed from: e9c  reason: default package */
public final class e9c extends ad9 {
    public String a;
    public String b;
    public String c;
    public a9c d;
    public String e;
    public c9c f;

    public final int computeSerializedSize() {
        int l = !this.a.equals("") ? j43.l(1, this.a) : 0;
        if (!this.b.equals("")) {
            l += j43.l(2, this.b);
        }
        if (!this.c.equals("")) {
            l += j43.l(3, this.c);
        }
        a9c a9c = this.d;
        if (a9c != null) {
            l += j43.i(4, a9c);
        }
        if (!this.e.equals("")) {
            l += j43.l(5, this.e);
        }
        c9c c9c = this.f;
        return c9c != null ? l + j43.i(6, c9c) : l;
    }

    /* JADX WARNING: type inference failed for: r0v6, types: [ad9, a9c] */
    /* JADX WARNING: type inference failed for: r0v10, types: [ad9, c9c] */
    public final ad9 mergeFrom(i43 i43) {
        while (true) {
            int s = i43.s();
            if (s == 0) {
                break;
            } else if (s == 10) {
                this.a = i43.r();
            } else if (s == 18) {
                this.b = i43.r();
            } else if (s == 26) {
                this.c = i43.r();
            } else if (s == 34) {
                if (this.d == null) {
                    ? ad9 = new ad9();
                    ad9.a = null;
                    ad9.b = c44.DEFAULT_ASPECT_RATIO;
                    ad9.c = ct.f;
                    ad9.cachedSize = -1;
                    this.d = ad9;
                }
                i43.j(this.d);
            } else if (s == 42) {
                this.e = i43.r();
            } else if (s == 50) {
                if (this.f == null) {
                    ? ad92 = new ad9();
                    if (d9c.f == null) {
                        synchronized (bj7.b) {
                            try {
                                if (d9c.f == null) {
                                    d9c.f = new d9c[0];
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                    }
                    ad92.a = d9c.f;
                    if (z8c.c == null) {
                        synchronized (bj7.b) {
                            try {
                                if (z8c.c == null) {
                                    z8c.c = new z8c[0];
                                }
                            } catch (Throwable th2) {
                                throw th2;
                            }
                        }
                    }
                    ad92.b = z8c.c;
                    ad92.c = null;
                    ad92.d = false;
                    ad92.cachedSize = -1;
                    this.f = ad92;
                }
                i43.j(this.f);
            } else if (!i43.u(s)) {
                break;
            }
        }
        return this;
    }

    public final void writeTo(j43 j43) {
        if (!this.a.equals("")) {
            j43.E(1, this.a);
        }
        if (!this.b.equals("")) {
            j43.E(2, this.b);
        }
        if (!this.c.equals("")) {
            j43.E(3, this.c);
        }
        a9c a9c = this.d;
        if (a9c != null) {
            j43.y(4, a9c);
        }
        if (!this.e.equals("")) {
            j43.E(5, this.e);
        }
        c9c c9c = this.f;
        if (c9c != null) {
            j43.y(6, c9c);
        }
    }
}
