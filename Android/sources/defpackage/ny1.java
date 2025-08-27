package defpackage;

/* renamed from: ny1  reason: default package */
public final class ny1 extends bze implements Comparable {
    public long Y;

    public final int compareTo(Object obj) {
        ny1 ny1 = (ny1) obj;
        if (h(4) == ny1.h(4)) {
            long j = this.w - ny1.w;
            if (j == 0) {
                j = this.Y - ny1.Y;
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
