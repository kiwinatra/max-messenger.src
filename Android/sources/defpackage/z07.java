package defpackage;

/* renamed from: z07  reason: default package */
public abstract class z07 implements Comparable {
    public final long X;
    public final boolean Y;
    public final String a;
    public final x07 b;
    public final long c;
    public final int o;
    public final long v;
    public final yv4 w;
    public final String x;
    public final String y;
    public final long z;

    public z07(String str, x07 x07, long j, int i, long j2, yv4 yv4, String str2, String str3, long j3, long j4, boolean z2) {
        this.a = str;
        this.b = x07;
        this.c = j;
        this.o = i;
        this.v = j2;
        this.w = yv4;
        this.x = str2;
        this.y = str3;
        this.z = j3;
        this.X = j4;
        this.Y = z2;
    }

    public final int compareTo(Object obj) {
        Long l = (Long) obj;
        long longValue = l.longValue();
        long j = this.v;
        if (j > longValue) {
            return 1;
        }
        return j < l.longValue() ? -1 : 0;
    }
}
