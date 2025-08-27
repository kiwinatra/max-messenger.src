package defpackage;

/* renamed from: ixe  reason: default package */
public abstract class ixe {
    public final /* synthetic */ int a;
    public long b;
    public long c;
    public long d;
    public int e;
    public int f;
    public long g;
    public boolean h;
    public boolean i;
    public final Object j;
    public Object k;
    public Object l;
    public Object m;
    public Object n;

    public ixe(int i2) {
        this.a = i2;
        switch (i2) {
            case 1:
                this.j = new jla(1);
                this.n = new ox0(24, false);
                return;
            default:
                this.j = new jla(0);
                this.n = new xe8(26, false);
                return;
        }
    }

    public void a(long j2) {
        switch (this.a) {
            case 0:
                this.d = j2;
                return;
            default:
                this.d = j2;
                return;
        }
    }

    public abstract long b(l8b l8b);

    public abstract long c(g1g g1g);

    public abstract boolean d(l8b l8b, long j2, ox0 ox0);

    public abstract boolean e(g1g g1g, long j2, xe8 xe8);

    public void f(boolean z) {
        switch (this.a) {
            case 0:
                if (z) {
                    this.n = new xe8(26, false);
                    this.c = 0;
                    this.e = 0;
                } else {
                    this.e = 1;
                }
                this.b = -1;
                this.d = 0;
                return;
            default:
                if (z) {
                    this.n = new ox0(24, false);
                    this.c = 0;
                    this.e = 0;
                } else {
                    this.e = 1;
                }
                this.b = -1;
                this.d = 0;
                return;
        }
    }
}
