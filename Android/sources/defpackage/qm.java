package defpackage;

/* renamed from: qm  reason: default package */
public abstract class qm {
    public final long a;
    public fbf b;
    public rm c;

    public qm(long j) {
        this.a = j;
    }

    public abstract fbf g();

    public final rl i() {
        rm rmVar = this.c;
        if (rmVar == null) {
            rmVar = null;
        }
        return rmVar.a();
    }

    public final doa j() {
        rm rmVar = this.c;
        if (rmVar == null) {
            rmVar = null;
        }
        return (doa) rmVar.f.getValue();
    }

    public final sv0 k() {
        rm rmVar = this.c;
        if (rmVar == null) {
            rmVar = null;
        }
        return rmVar.b();
    }

    public final r62 l() {
        rm rmVar = this.c;
        if (rmVar == null) {
            rmVar = null;
        }
        return rmVar.c();
    }

    public final km3 m() {
        rm rmVar = this.c;
        if (rmVar == null) {
            rmVar = null;
        }
        return (km3) rmVar.n.getValue();
    }

    public final k78 n() {
        rm rmVar = this.c;
        if (rmVar == null) {
            rmVar = null;
        }
        return (k78) rmVar.X.getValue();
    }

    public final fa9 o() {
        rm rmVar = this.c;
        if (rmVar == null) {
            rmVar = null;
        }
        return rmVar.d();
    }

    public final is9 p() {
        rm rmVar = this.c;
        if (rmVar == null) {
            rmVar = null;
        }
        return (is9) rmVar.p.getValue();
    }

    public final jtb q() {
        rm rmVar = this.c;
        if (rmVar == null) {
            rmVar = null;
        }
        return (jtb) rmVar.c.getValue();
    }

    public final fbf r() {
        if (this.b == null) {
            this.b = g();
        }
        return this.b;
    }

    public final eef s() {
        rm rmVar = this.c;
        if (rmVar == null) {
            rmVar = null;
        }
        return rmVar.e();
    }

    public String toString() {
        String simpleName = getClass().getSimpleName();
        return simpleName + "/requestId: " + this.a;
    }
}
