package defpackage;

import java.util.ArrayList;
import java.util.List;

/* renamed from: g85  reason: default package */
public final class g85 implements uye {
    public List a;

    public /* synthetic */ g85(List list) {
        this.a = list;
    }

    public c63 a(huf huf, String str) {
        ArrayList arrayList = new ArrayList();
        for (b1g a2 : this.a) {
            igf a3 = a2.a(huf, str);
            if (a3 != null) {
                arrayList.add(a3);
            }
        }
        if (!(!arrayList.isEmpty())) {
            arrayList = null;
        }
        if (arrayList != null) {
            return new c63(arrayList);
        }
        return null;
    }

    public int d(long j) {
        return -1;
    }

    public long k(int i) {
        return 0;
    }

    public List p(long j) {
        return this.a;
    }

    public int t() {
        return 1;
    }
}
