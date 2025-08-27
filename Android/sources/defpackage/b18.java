package defpackage;

import android.content.Context;
import java.util.Collections;
import java.util.List;

/* renamed from: b18  reason: default package */
public final class b18 extends hnf implements t18 {
    public final f3a b;
    public n18 c;

    public b18(Context context, f3a f3a) {
        this.b = f3a;
    }

    public final void K(long j) {
        f3a f3a = this.b;
        if (f3a != null) {
            f3a.K(j);
        }
    }

    public final void a(boolean z) {
    }

    public final List d() {
        n18 n18 = this.c;
        if (n18 == null) {
            return null;
        }
        return Collections.singletonList(n18);
    }

    public final void l0(long j) {
    }

    public final void o(boolean z, boolean z2, long j, long j2) {
        f3a f3a = this.b;
        if (f3a != null) {
            f3a.o(z, z2, j, j2);
        }
    }
}
