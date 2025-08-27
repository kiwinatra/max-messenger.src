package defpackage;

/* renamed from: ya5  reason: default package */
public final class ya5 {
    public final long a;
    public final long b;

    public ya5(long j, long j2) {
        if (j2 == 0) {
            this.a = 0;
            this.b = 1;
            return;
        }
        this.a = j;
        this.b = j2;
    }

    public final String toString() {
        return this.a + "/" + this.b;
    }
}
