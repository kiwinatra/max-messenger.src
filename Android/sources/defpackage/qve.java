package defpackage;

/* renamed from: qve  reason: default package */
public final class qve {
    public final long a;
    public final int b;
    public final int c;

    public qve(int i, int i2, int i3, long j) {
        j = (i3 & 1) != 0 ? 0 : j;
        i = (i3 & 2) != 0 ? -1 : i;
        i2 = (i3 & 4) != 0 ? -1 : i2;
        this.a = j;
        this.b = i;
        this.c = i2;
    }
}
