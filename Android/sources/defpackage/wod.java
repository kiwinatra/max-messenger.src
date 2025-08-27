package defpackage;

/* renamed from: wod  reason: default package */
public final class wod implements Comparable {
    public final long a;
    public final q74 b;

    public wod(long j, q74 q74) {
        this.a = j;
        this.b = q74;
    }

    public final int compareTo(Object obj) {
        long j = ((wod) obj).a;
        int i = v0g.a;
        int i2 = (this.a > j ? 1 : (this.a == j ? 0 : -1));
        if (i2 < 0) {
            return -1;
        }
        return i2 == 0 ? 0 : 1;
    }
}
