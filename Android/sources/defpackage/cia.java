package defpackage;

import java.util.Objects;

/* renamed from: cia  reason: default package */
public final class cia extends jha {
    public final /* synthetic */ int a;
    public final t2f b;

    public /* synthetic */ cia(t2f t2f, int i) {
        this.a = i;
        this.b = t2f;
    }

    public final void w(cla cla) {
        t2f t2f = this.b;
        switch (this.a) {
            case 0:
                try {
                    Object obj = t2f.get();
                    Objects.requireNonNull(obj, "The supplier returned a null ObservableSource");
                    ((oka) obj).a(cla);
                    return;
                } catch (Throwable th) {
                    hd8.Z(th);
                    p45.b(th, cla);
                    return;
                }
            default:
                try {
                    Object obj2 = t2f.get();
                    if (obj2 != null) {
                        o95 o95 = p95.a;
                        th = (Throwable) obj2;
                        p45.b(th, cla);
                        return;
                    }
                    throw p95.b("Supplier returned a null Throwable.");
                } catch (Throwable th2) {
                    th = th2;
                    hd8.Z(th);
                }
        }
    }
}
