package defpackage;

import android.util.SparseBooleanArray;

/* renamed from: vq5  reason: default package */
public final class vq5 {
    public final /* synthetic */ int a;
    public final SparseBooleanArray b;
    public boolean c;

    public vq5(int i) {
        this.a = i;
        switch (i) {
            case 1:
                this.b = new SparseBooleanArray();
                return;
            default:
                this.b = new SparseBooleanArray();
                return;
        }
    }

    public final void a(int i) {
        switch (this.a) {
            case 0:
                y64.j(!this.c);
                this.b.append(i, true);
                return;
            default:
                n79.n(!this.c);
                this.b.append(i, true);
                return;
        }
    }

    public void b(xq5 xq5) {
        for (int i = 0; i < xq5.a.size(); i++) {
            a(xq5.b(i));
        }
    }

    public void c(int... iArr) {
        for (int a2 : iArr) {
            a(a2);
        }
    }

    public wq5 d() {
        y64.j(!this.c);
        this.c = true;
        return new wq5(this.b);
    }

    public xq5 e() {
        n79.n(!this.c);
        this.c = true;
        return new xq5(this.b);
    }
}
