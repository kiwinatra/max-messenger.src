package defpackage;

/* renamed from: zng  reason: default package */
public abstract class zng {
    public final iog a;
    public wh7[] b;

    public zng() {
        this(new iog());
    }

    public final void a() {
        wh7[] wh7Arr = this.b;
        if (wh7Arr != null) {
            wh7 wh7 = wh7Arr[0];
            wh7 wh72 = wh7Arr[1];
            iog iog = this.a;
            if (wh72 == null) {
                wh72 = iog.a.f(2);
            }
            if (wh7 == null) {
                wh7 = iog.a.f(1);
            }
            f(wh7.a(wh7, wh72));
            wh7 wh73 = this.b[4];
            if (wh73 != null) {
                e(wh73);
            }
            wh7 wh74 = this.b[5];
            if (wh74 != null) {
                d(wh74);
            }
            wh7 wh75 = this.b[6];
            if (wh75 != null) {
                g(wh75);
            }
        }
    }

    public abstract iog b();

    public void c(int i, wh7 wh7) {
        char c;
        if (this.b == null) {
            this.b = new wh7[9];
        }
        for (int i2 = 1; i2 <= 256; i2 <<= 1) {
            if ((i & i2) != 0) {
                wh7[] wh7Arr = this.b;
                if (i2 != 1) {
                    c = 2;
                    if (i2 == 2) {
                        c = 1;
                    } else if (i2 != 4) {
                        c = 8;
                        if (i2 == 8) {
                            c = 3;
                        } else if (i2 == 16) {
                            c = 4;
                        } else if (i2 == 32) {
                            c = 5;
                        } else if (i2 == 64) {
                            c = 6;
                        } else if (i2 == 128) {
                            c = 7;
                        } else if (i2 != 256) {
                            throw new IllegalArgumentException(wj6.h(i2, "type needs to be >= FIRST and <= LAST, type="));
                        }
                    }
                } else {
                    c = 0;
                }
                wh7Arr[c] = wh7;
            }
        }
    }

    public abstract void d(wh7 wh7);

    public abstract void e(wh7 wh7);

    public abstract void f(wh7 wh7);

    public abstract void g(wh7 wh7);

    public void h(int i, boolean z) {
    }

    public zng(iog iog) {
        this.a = iog;
    }
}
