package defpackage;

import java.util.Collections;
import java.util.List;

/* renamed from: fuf  reason: default package */
public final class fuf implements uye {
    public static final fuf b = new fuf();
    public final List a;

    public fuf(m44 m44) {
        this.a = Collections.singletonList(m44);
    }

    public final int d(long j) {
        return j < 0 ? 0 : -1;
    }

    public final long k(int i) {
        y64.g(i == 0);
        return 0;
    }

    public final List p(long j) {
        return j >= 0 ? this.a : Collections.emptyList();
    }

    public final int t() {
        return 1;
    }

    public fuf() {
        this.a = Collections.emptyList();
    }
}
