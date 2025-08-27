package defpackage;

import java.util.ArrayList;

/* renamed from: cj0  reason: default package */
public abstract class cj0 implements h74 {
    public final boolean a;
    public final ArrayList b = new ArrayList(1);
    public int c;
    public p74 o;

    public cj0(boolean z) {
        this.a = z;
    }

    public final void O(arf arf) {
        arf.getClass();
        ArrayList arrayList = this.b;
        if (!arrayList.contains(arf)) {
            arrayList.add(arf);
            this.c++;
        }
    }

    public final void a(int i) {
        p74 p74 = this.o;
        int i2 = t0g.a;
        for (int i3 = 0; i3 < this.c; i3++) {
            ((vc4) ((arf) this.b.get(i3))).e(p74, this.a, i);
        }
    }

    public final void b() {
        p74 p74 = this.o;
        int i = t0g.a;
        for (int i2 = 0; i2 < this.c; i2++) {
            ((vc4) ((arf) this.b.get(i2))).f(p74, this.a);
        }
        this.o = null;
    }

    public final void c() {
        for (int i = 0; i < this.c; i++) {
            ((arf) this.b.get(i)).getClass();
        }
    }

    public final void d(p74 p74) {
        this.o = p74;
        for (int i = 0; i < this.c; i++) {
            ((vc4) ((arf) this.b.get(i))).g(p74, this.a);
        }
    }
}
