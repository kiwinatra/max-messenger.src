package defpackage;

import java.util.LinkedHashSet;
import java.util.Objects;

/* renamed from: s6f  reason: default package */
public final /* synthetic */ class s6f implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ t6f b;
    public final /* synthetic */ t6f c;

    public /* synthetic */ s6f(t6f t6f, t6f t6f2, int i) {
        this.a = i;
        this.b = t6f;
        this.c = t6f2;
    }

    public final void run() {
        switch (this.a) {
            case 0:
                t6f t6f = this.b;
                Objects.requireNonNull(t6f.e);
                t6f.e.g(this.c);
                return;
            default:
                t6f t6f2 = this.b;
                t6f t6f3 = this.c;
                kq9 kq9 = t6f2.b;
                synchronized (kq9.b) {
                    ((LinkedHashSet) kq9.c).remove(t6f2);
                    ((LinkedHashSet) kq9.o).remove(t6f2);
                }
                t6f2.g(t6f3);
                if (t6f2.f != null) {
                    Objects.requireNonNull(t6f2.e);
                    t6f2.e.c(t6f3);
                    return;
                }
                t6f2.toString();
                return;
        }
    }
}
