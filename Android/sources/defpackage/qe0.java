package defpackage;

/* renamed from: qe0  reason: default package */
public final class qe0 implements tf5 {
    public final /* synthetic */ int a;
    public final l8b b;
    public final nce c;

    public qe0(int i) {
        this.a = i;
        switch (i) {
            case 1:
                this.b = new l8b(4);
                this.c = new nce(-1, -1, "image/heif");
                return;
            case 2:
                this.b = new l8b(4);
                this.c = new nce(-1, -1, "image/webp");
                return;
            default:
                this.b = new l8b(4);
                this.c = new nce(-1, -1, "image/avif");
                return;
        }
    }

    private final void a() {
    }

    private final void b() {
    }

    private final void c() {
    }

    public final void U(xf5 xf5) {
        switch (this.a) {
            case 0:
                this.c.U(xf5);
                return;
            case 1:
                this.c.U(xf5);
                return;
            default:
                this.c.U(xf5);
                return;
        }
    }

    public final void d(long j, long j2) {
        switch (this.a) {
            case 0:
                this.c.d(j, j2);
                return;
            case 1:
                this.c.d(j, j2);
                return;
            default:
                this.c.d(j, j2);
                return;
        }
    }

    public final int g(vf5 vf5, yl4 yl4) {
        switch (this.a) {
            case 0:
                return this.c.g(vf5, yl4);
            case 1:
                return this.c.g(vf5, yl4);
            default:
                return this.c.g(vf5, yl4);
        }
    }

    public final boolean n(vf5 vf5) {
        switch (this.a) {
            case 0:
                ((hf4) vf5).a(4, false);
                hf4 hf4 = (hf4) vf5;
                l8b l8b = this.b;
                l8b.D(4);
                hf4.q(l8b.a, 0, 4, false);
                if (l8b.w() != ((long) 1718909296)) {
                    return false;
                }
                l8b.D(4);
                hf4.q(l8b.a, 0, 4, false);
                return l8b.w() == ((long) 1635150182);
            case 1:
                ((hf4) vf5).a(4, false);
                hf4 hf42 = (hf4) vf5;
                l8b l8b2 = this.b;
                l8b2.D(4);
                hf42.q(l8b2.a, 0, 4, false);
                if (l8b2.w() != ((long) 1718909296)) {
                    return false;
                }
                l8b2.D(4);
                hf42.q(l8b2.a, 0, 4, false);
                return l8b2.w() == ((long) 1751476579);
            default:
                l8b l8b3 = this.b;
                l8b3.D(4);
                ((hf4) vf5).q(l8b3.a, 0, 4, false);
                if (l8b3.w() != 1380533830) {
                    return false;
                }
                hf4 hf43 = (hf4) vf5;
                hf43.a(4, false);
                l8b3.D(4);
                hf43.q(l8b3.a, 0, 4, false);
                return l8b3.w() == 1464156752;
        }
    }

    public final void release() {
        int i = this.a;
    }
}
