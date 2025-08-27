package defpackage;

import java.util.ArrayList;
import java.util.List;

/* renamed from: xc2  reason: default package */
public final class xc2 implements dz6 {
    public final /* synthetic */ z62 b;
    public final /* synthetic */ srd c;

    public xc2(srd srd, z62 z62) {
        this.c = srd;
        this.b = z62;
    }

    public final long g() {
        return this.b.c;
    }

    public final long h() {
        long j = this.b.d;
        if (j == 0) {
            srd srd = this.c;
            long j2 = ((a32) srd.a).b.j;
            long j3 = ((ha9) srd.b).b;
            if (j2 == j3) {
                return j3;
            }
        }
        return j;
    }

    public final List i() {
        ArrayList arrayList = new ArrayList(this.b.e);
        srd srd = this.c;
        arrayList.addAll(((a32) srd.a).b.n.d(bl4.REGULAR));
        hd8.H(arrayList);
        ha9 ha9 = (ha9) srd.b;
        if (((f72) hd8.r(ha9.o, arrayList).getSecond()) == null) {
            long j = ha9.o;
            arrayList.add(new f72(j, j));
        }
        return new ArrayList(arrayList);
    }
}
