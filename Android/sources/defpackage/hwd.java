package defpackage;

import java.util.ArrayList;
import java.util.concurrent.Executor;

/* renamed from: hwd  reason: default package */
public final class hwd {
    public final gwd a;

    public hwd(int i, ArrayList arrayList, Executor executor, kt1 kt1) {
        this.a = new gwd(i, arrayList, executor, kt1);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof hwd)) {
            return false;
        }
        return this.a.equals(((hwd) obj).a);
    }

    public final int hashCode() {
        return this.a.a.hashCode();
    }
}
