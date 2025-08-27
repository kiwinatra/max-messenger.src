package defpackage;

import android.net.Uri;
import java.util.ArrayList;
import java.util.List;

/* renamed from: v2d  reason: default package */
public final class v2d extends x2d {
    public final bpa X;
    public final String y;
    public final dpc z;

    public v2d(long j, ea6 ea6, List list, sod sod, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3) {
        super(ea6, list, sod, arrayList, arrayList2, arrayList3);
        Uri.parse(((ml0) list.get(0)).a);
        long j2 = sod.e;
        bpa bpa = null;
        dpc dpc = j2 <= 0 ? null : new dpc(sod.d, (String) null, j2);
        this.z = dpc;
        this.y = null;
        this.X = dpc == null ? new bpa(6, new dpc(0, (String) null, -1)) : bpa;
    }

    public final String a() {
        return this.y;
    }

    public final q64 c() {
        return this.X;
    }

    public final dpc d() {
        return this.z;
    }
}
