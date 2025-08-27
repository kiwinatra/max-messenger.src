package defpackage;

import java.util.Collections;
import java.util.List;

/* renamed from: w8b  reason: default package */
public final class w8b implements uye {
    public final List a;
    public final List b;

    public /* synthetic */ w8b(List list, List list2) {
        this.a = list;
        this.b = list2;
    }

    public int d(long j) {
        int i;
        Long valueOf = Long.valueOf(j);
        int i2 = t0g.a;
        List list = this.b;
        int binarySearch = Collections.binarySearch(list, valueOf);
        if (binarySearch < 0) {
            i = ~binarySearch;
        } else {
            int size = list.size();
            do {
                binarySearch++;
                if (binarySearch >= size || ((Comparable) list.get(binarySearch)).compareTo(valueOf) != 0) {
                    i = binarySearch;
                }
                binarySearch++;
                break;
            } while (((Comparable) list.get(binarySearch)).compareTo(valueOf) != 0);
            i = binarySearch;
        }
        if (i < list.size()) {
            return i;
        }
        return -1;
    }

    public long k(int i) {
        boolean z = false;
        y64.g(i >= 0);
        List list = this.b;
        if (i < list.size()) {
            z = true;
        }
        y64.g(z);
        return ((Long) list.get(i)).longValue();
    }

    public List p(long j) {
        int e = t0g.e(Long.valueOf(j), this.b, false);
        return e == -1 ? Collections.emptyList() : (List) this.a.get(e);
    }

    public int t() {
        return this.b.size();
    }
}
