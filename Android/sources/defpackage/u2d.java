package defpackage;

import android.net.Uri;
import java.util.ArrayList;
import java.util.List;

/* renamed from: u2d  reason: default package */
public final class u2d extends w2d {
    public final nob X;
    public final String y;
    public final cpc z;

    public u2d(long j, ca6 ca6, List list, rod rod, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3) {
        super(ca6, list, rod, arrayList, arrayList2, arrayList3);
        Uri.parse(((ll0) list.get(0)).a);
        long j2 = rod.e;
        nob nob = null;
        cpc cpc = j2 <= 0 ? null : new cpc(rod.d, (String) null, j2);
        this.z = cpc;
        this.y = null;
        this.X = cpc == null ? new nob((Object) new cpc(0, (String) null, -1)) : nob;
    }

    public final String a() {
        return this.y;
    }

    public final p64 c() {
        return this.X;
    }

    public final cpc d() {
        return this.z;
    }
}
