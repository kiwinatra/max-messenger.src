package defpackage;

import java.util.UUID;

/* renamed from: jdg  reason: default package */
public final class jdg extends ob6 {
    public final String b;
    public int c;

    public jdg(qu1 qu1) {
        super(qu1);
        this.b = "virtual-" + qu1.e() + "-" + UUID.randomUUID().toString();
    }

    public final int c() {
        return m(0);
    }

    public final String e() {
        return this.b;
    }

    public final int m(int i) {
        return grf.h(this.a.m(i) - this.c);
    }
}
