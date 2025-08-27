package defpackage;

import java.util.List;
import kotlin.collections.CollectionsKt;

/* renamed from: kld  reason: default package */
public final class kld {
    public static final kld c = new kld(jld.a, CollectionsKt.emptyList());
    public final jld a;
    public final List b;

    public kld(jld jld, List list) {
        this.a = jld;
        this.b = list;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x000a, code lost:
        r5 = (defpackage.kld) r5;
        r1 = r5.a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r5) {
        /*
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = r5 instanceof defpackage.kld
            r2 = 0
            if (r1 != 0) goto L_0x000a
            return r2
        L_0x000a:
            kld r5 = (defpackage.kld) r5
            jld r1 = r5.a
            jld r3 = r4.a
            if (r3 == r1) goto L_0x0013
            return r2
        L_0x0013:
            java.util.List r4 = r4.b
            java.util.List r5 = r5.b
            boolean r4 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r4, (java.lang.Object) r5)
            if (r4 != 0) goto L_0x001e
            return r2
        L_0x001e:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kld.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SearchState(state=");
        sb.append(this.a);
        sb.append(", content=");
        return tr1.l(sb, this.b, ")");
    }
}
