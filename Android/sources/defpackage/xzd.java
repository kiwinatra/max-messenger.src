package defpackage;

import android.os.Bundle;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: xzd  reason: default package */
public final class xzd extends j91 {
    public static final xzd f;
    public static final xzd g = new xzd(new igf(vza.u), CollectionsKt.listOf(new wzd(new igf(vza.s), tza.n, false), new wzd(new igf(vza.t), tza.o, false)), (jgd) null, (Bundle) null, 12);
    public static final xzd h;
    public static final xzd i;
    public static final xzd j;
    public static final xzd k = new xzd(new igf(vza.r), CollectionsKt.listOf(new wzd(new igf(vza.q), tza.k, true), new wzd(new igf(vza.p), tza.j, false)), (jgd) null, (Bundle) null, 12);
    public final ngf b;
    public final List c;
    public final jgd d;
    public final Bundle e;

    static {
        igf igf = new igf(vza.v);
        jgd jgd = jgd.SETTINGS_PRIVACY_SAFE_MODE_ONLINE;
        int i2 = qad.P1;
        f = new xzd(igf, CollectionsKt.listOf(new wzd(new igf(i2), tza.l, false), new wzd(new igf(qad.C5), tza.m, false)), jgd, (Bundle) null, 8);
        igf igf2 = new igf(vza.o);
        jgd jgd2 = jgd.SETTINGS_PRIVACY_SAFE_MODE_CALLS;
        int i3 = qad.m;
        h = new xzd(igf2, CollectionsKt.listOf(new wzd(new igf(i3), tza.h, false), new wzd(new igf(i2), tza.i, false)), jgd2, (Bundle) null, 8);
        i = new xzd(new igf(vza.w), CollectionsKt.listOf(new wzd(new igf(i3), tza.p, false), new wzd(new igf(i2), tza.q, false)), jgd.SETTINGS_PRIVACY_SAFE_MODE_SEARCH_BY_PHONE, (Bundle) null, 8);
        j = new xzd(new igf(vza.n), CollectionsKt.listOf(new wzd(new igf(i3), tza.f, false), new wzd(new igf(i2), tza.g, false)), jgd.SETTINGS_PRIVACY_SAFE_MODE_INVITE, (Bundle) null, 8);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public xzd(ngf ngf, List list, jgd jgd, Bundle bundle, int i2) {
        super(13);
        jgd = (i2 & 4) != 0 ? null : jgd;
        bundle = (i2 & 8) != 0 ? null : bundle;
        this.b = ngf;
        this.c = list;
        this.d = jgd;
        this.e = bundle;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xzd)) {
            return false;
        }
        xzd xzd = (xzd) obj;
        return Intrinsics.areEqual((Object) this.b, (Object) xzd.b) && Intrinsics.areEqual((Object) this.c, (Object) xzd.c) && this.d == xzd.d && Intrinsics.areEqual((Object) this.e, (Object) xzd.e);
    }

    public final int hashCode() {
        int i2 = rae.i(this.c, this.b.hashCode() * 31, 31);
        int i3 = 0;
        jgd jgd = this.d;
        int hashCode = (i2 + (jgd == null ? 0 : jgd.hashCode())) * 31;
        Bundle bundle = this.e;
        if (bundle != null) {
            i3 = bundle.hashCode();
        }
        return hashCode + i3;
    }

    public final String toString() {
        return "OpenConfirmationDialog(title=" + this.b + ", buttons=" + this.c + ", statScreen=" + this.d + ", payload=" + this.e + ")";
    }
}
