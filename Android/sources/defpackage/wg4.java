package defpackage;

/* renamed from: wg4  reason: default package */
public final class wg4 implements bn8, cn8 {
    public final /* synthetic */ int a = 0;
    public boolean b;
    public boolean c;
    public final Object o;
    public final Object v;
    public Object w;
    public Object x;

    public wg4(ed5 ed5, b7f b7f) {
        this.v = ed5;
        this.o = new tw8(b7f);
        this.b = true;
    }

    public boolean J() {
        if (this.b) {
            ((tw8) this.o).getClass();
            return false;
        }
        cn8 cn8 = (cn8) this.x;
        cn8.getClass();
        return cn8.J();
    }

    public fob c() {
        bn8 bn8 = (bn8) this.x;
        if (bn8 != null) {
            return bn8.c();
        }
        return (fob) ((tw8) this.o).w;
    }

    public final long e() {
        switch (this.a) {
            case 0:
                if (this.b) {
                    return ((tw8) this.o).e();
                }
                bn8 bn8 = (bn8) this.x;
                bn8.getClass();
                return bn8.e();
            default:
                if (this.b) {
                    return ((tw8) this.o).e();
                }
                cn8 cn8 = (cn8) this.x;
                cn8.getClass();
                return cn8.e();
        }
    }

    public void f(gob gob) {
        cn8 cn8 = (cn8) this.x;
        if (cn8 != null) {
            cn8.f(gob);
            gob = ((cn8) this.x).c();
        }
        ((tw8) this.o).f(gob);
    }

    public void g(fob fob) {
        bn8 bn8 = (bn8) this.x;
        if (bn8 != null) {
            bn8.g(fob);
            fob = ((bn8) this.x).c();
        }
        ((tw8) this.o).g(fob);
    }

    /* renamed from: c  reason: collision with other method in class */
    public gob m1540c() {
        cn8 cn8 = (cn8) this.x;
        if (cn8 != null) {
            return cn8.c();
        }
        return (gob) ((tw8) this.o).w;
    }

    public wg4(vg4 vg4, c7f c7f) {
        this.v = vg4;
        this.o = new tw8(c7f);
        this.b = true;
    }
}
