package defpackage;

/* renamed from: oy1  reason: default package */
public final class oy1 extends cze implements Comparable {
    public long Z;

    public final int compareTo(Object obj) {
        oy1 oy1 = (oy1) obj;
        if (h(4) == oy1.h(4)) {
            long j = this.x - oy1.x;
            if (j == 0) {
                j = this.Z - oy1.Z;
                if (j == 0) {
                    return 0;
                }
            }
            if (j <= 0) {
                return -1;
            }
        } else if (!h(4)) {
            return -1;
        }
        return 1;
    }
}
