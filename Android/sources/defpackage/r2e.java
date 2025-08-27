package defpackage;

import android.os.Bundle;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: r2e  reason: default package */
public final class r2e extends j91 {
    public static final r2e e;
    public static final r2e f;
    public static final r2e g;
    public static final r2e h;
    public static final r2e i = new r2e(new igf(rza.x), CollectionsKt.listOf(new q2e(qza.v, new igf(rza.d)), new q2e(qza.x, new igf(rza.f)), new q2e(qza.w, new igf(rza.e))));
    public final ngf b;
    public final List c;
    public final Bundle d = null;

    static {
        igf igf = new igf(rza.q);
        int i2 = rza.a;
        q2e q2e = new q2e(qza.s, new igf(i2));
        int i3 = rza.g;
        q2e q2e2 = new q2e(qza.u, new igf(i3));
        int i4 = rza.c;
        e = new r2e(igf, CollectionsKt.listOf(q2e, q2e2, new q2e(qza.t, new igf(i4))));
        f = new r2e(new igf(rza.n), CollectionsKt.listOf(new q2e(qza.g, new igf(i2)), new q2e(qza.i, new igf(i3)), new q2e(qza.h, new igf(i4))));
        g = new r2e(new igf(rza.j), CollectionsKt.listOf(new q2e(qza.a, new igf(i2)), new q2e(qza.c, new igf(i3)), new q2e(qza.b, new igf(i4))));
        h = new r2e(new igf(rza.y), CollectionsKt.listOf(new q2e(qza.d, new igf(i2)), new q2e(qza.f, new igf(i3)), new q2e(qza.e, new igf(rza.b))));
    }

    public r2e(igf igf, List list) {
        super(14);
        this.b = igf;
        this.c = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r2e)) {
            return false;
        }
        r2e r2e = (r2e) obj;
        return Intrinsics.areEqual((Object) this.b, (Object) r2e.b) && Intrinsics.areEqual((Object) this.c, (Object) r2e.c) && Intrinsics.areEqual((Object) this.d, (Object) r2e.d);
    }

    public final int hashCode() {
        int i2 = rae.i(this.c, this.b.hashCode() * 31, 31);
        Bundle bundle = this.d;
        return i2 + (bundle == null ? 0 : bundle.hashCode());
    }

    public final String toString() {
        return "OpenConfirmationDialog(title=" + this.b + ", buttons=" + this.c + ", payload=" + this.d + ")";
    }
}
