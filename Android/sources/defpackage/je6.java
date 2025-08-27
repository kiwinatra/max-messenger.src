package defpackage;

/* renamed from: je6  reason: default package */
public final class je6 {
    public final m53 a;
    public final int b;
    public final int c;
    public final float d;
    public final long e;

    public je6(m53 m53, int i, int i2, float f, long j) {
        boolean z = false;
        boolean z2 = i > 0;
        n79.f("width must be positive, but is: " + i, z2);
        z = i2 > 0 ? true : z;
        n79.f("height must be positive, but is: " + i2, z);
        this.a = m53;
        this.b = i;
        this.c = i2;
        this.d = f;
        this.e = j;
    }
}
