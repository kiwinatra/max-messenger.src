package defpackage;

import java.util.Collections;
import java.util.List;

/* renamed from: ty1  reason: default package */
public final class ty1 implements uye {
    public final /* synthetic */ int a;
    public final List b;

    public /* synthetic */ ty1(int i, List list) {
        this.a = i;
        this.b = list;
    }

    public final int d(long j) {
        switch (this.a) {
            case 0:
                return j < 0 ? 0 : -1;
            default:
                return -1;
        }
    }

    public final long k(int i) {
        switch (this.a) {
            case 0:
                y64.g(i == 0);
                return 0;
            default:
                return 0;
        }
    }

    public final List p(long j) {
        switch (this.a) {
            case 0:
                return j >= 0 ? this.b : Collections.emptyList();
            default:
                return this.b;
        }
    }

    public final int t() {
        switch (this.a) {
            case 0:
                return 1;
            default:
                return 1;
        }
    }
}
