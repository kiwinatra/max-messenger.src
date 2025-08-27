package defpackage;

import java.util.Collections;
import java.util.List;

/* renamed from: l10  reason: default package */
public final class l10 {
    public final String a;
    public final String b;
    public final int c;
    public final int d;
    public final long e;
    public final List f;

    static {
        k10 k10 = new k10();
        if (k10.f == null) {
            k10.f = Collections.emptyList();
        }
        new l10(k10);
    }

    public l10(k10 k10) {
        this.a = k10.a;
        this.b = k10.b;
        this.c = k10.c;
        this.d = k10.d;
        this.e = k10.e;
        this.f = k10.f;
    }

    public final boolean a() {
        return this.d == 3;
    }

    public final boolean b() {
        return c() || a() || d();
    }

    public final boolean c() {
        return this.d == 5;
    }

    public final boolean d() {
        return this.d == 4;
    }

    public final boolean e() {
        return this.c == 2;
    }
}
