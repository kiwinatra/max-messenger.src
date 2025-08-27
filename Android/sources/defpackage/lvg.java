package defpackage;

import java.util.Arrays;

/* renamed from: lvg  reason: default package */
public final class lvg {
    public final bm a;
    public final tj5 b;

    public /* synthetic */ lvg(bm bmVar, tj5 tj5) {
        this.a = bmVar;
        this.b = tj5;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof lvg)) {
            lvg lvg = (lvg) obj;
            return kne.o(this.a, lvg.a) && kne.o(this.b, lvg.b);
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }

    public final String toString() {
        fj fjVar = new fj((Object) this);
        fjVar.k(this.a, "key");
        fjVar.k(this.b, "feature");
        return fjVar.toString();
    }
}
