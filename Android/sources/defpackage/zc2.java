package defpackage;

import java.util.ArrayList;
import java.util.List;

/* renamed from: zc2  reason: default package */
public final class zc2 implements dz6 {
    public final /* synthetic */ z62 b;
    public final /* synthetic */ a32 c;
    public final /* synthetic */ t70 d;

    public zc2(z62 z62, a32 a32, t70 t70) {
        this.b = z62;
        this.c = a32;
        this.d = t70;
    }

    public final long g() {
        return this.b.c;
    }

    public final long h() {
        long j = this.b.d;
        if (j != 0) {
            return j;
        }
        long j2 = this.c.b.j;
        long j3 = this.d.b;
        return j2 == j3 ? j3 : j;
    }

    public final List i() {
        ArrayList arrayList = new ArrayList(this.b.e);
        arrayList.addAll(this.c.b.n.d(bl4.REGULAR));
        hd8.H(arrayList);
        t70 t70 = this.d;
        if (((f72) hd8.r(t70.c, arrayList).getSecond()) == null) {
            long j = t70.c;
            arrayList.add(new f72(j, j));
        }
        return arrayList;
    }
}
