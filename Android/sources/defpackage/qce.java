package defpackage;

/* renamed from: qce  reason: default package */
public final class qce implements lcd {
    public int a;
    public boolean b;
    public final /* synthetic */ sce c;

    public qce(sce sce) {
        this.c = sce;
    }

    public final void a() {
        if (!this.b) {
            sce sce = this.c;
            sce.v.l(vq9.g(sce.X.n), sce.X, 0, (Object) null, 0);
            this.b = true;
        }
    }

    public final void b() {
        sce sce = this.c;
        if (!sce.Y) {
            sce.z.b();
        }
    }

    public final boolean c() {
        return this.c.Z;
    }

    public final int e(long j) {
        a();
        if (j <= 0 || this.a == 2) {
            return 0;
        }
        this.a = 2;
        return 1;
    }

    public final int f(ox0 ox0, ba4 ba4, int i) {
        a();
        sce sce = this.c;
        boolean z = sce.Z;
        if (z && sce.v0 == null) {
            this.a = 2;
        }
        int i2 = this.a;
        if (i2 == 2) {
            ba4.a(4);
            return -4;
        } else if ((i & 2) != 0 || i2 == 0) {
            ox0.b = sce.X;
            this.a = 1;
            return -5;
        } else if (!z) {
            return -3;
        } else {
            sce.v0.getClass();
            ba4.a(1);
            ba4.x = 0;
            if ((i & 4) == 0) {
                ba4.B(sce.w0);
                ba4.v.put(sce.v0, 0, sce.w0);
            }
            if ((i & 1) == 0) {
                this.a = 2;
            }
            return -4;
        }
    }
}
