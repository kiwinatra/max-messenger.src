package defpackage;

/* renamed from: pwd  reason: default package */
public final class pwd {
    public String a;
    public volatile int b;
    public long c;
    public boolean d;
    public String e;
    public long f;
    public long g;

    public final iq5 a() {
        long j = this.f;
        if (j != 0) {
            long j2 = this.g;
            if (j2 != 0 && j2 > j) {
                this.c = (long) ((int) (j2 - j));
            }
        }
        return new iq5(this.a, this.b, this.c, this.d, this.e);
    }
}
