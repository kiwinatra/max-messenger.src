package defpackage;

import java.util.Comparator;

/* renamed from: fcf  reason: default package */
public final /* synthetic */ class fcf implements Comparator {
    public final /* synthetic */ Iterable a;
    public final /* synthetic */ zi6 b;

    public /* synthetic */ fcf(Iterable iterable, zi6 zi6) {
        this.a = iterable;
        this.b = zi6;
    }

    public final int compare(Object obj, Object obj2) {
        zi6 zi6 = this.b;
        int i = 0;
        int i2 = -1;
        int i3 = -1;
        for (Long l : this.a) {
            try {
                if (l.equals(zi6.apply(obj))) {
                    i2 = i;
                } else if (l.equals(zi6.apply(obj2))) {
                    i3 = i;
                }
                if (i2 != -1 && i3 != -1) {
                    break;
                }
                i++;
            } catch (Throwable th) {
                throw new RuntimeException(th);
            }
        }
        if (i2 < i3) {
            return -1;
        }
        return i2 == i3 ? 0 : 1;
    }
}
