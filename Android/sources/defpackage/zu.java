package defpackage;

import ru.ok.tamtam.util.HandledException;

/* renamed from: zu  reason: default package */
public final /* synthetic */ class zu implements qk3 {
    public final /* synthetic */ int a;
    public final /* synthetic */ se2 b;

    public /* synthetic */ zu(se2 se2, int i) {
        this.a = i;
        this.b = se2;
    }

    public final void accept(Object obj) {
        Throwable th = (Throwable) obj;
        switch (this.a) {
            case 0:
                dv dvVar = this.b.z;
                synchronized (dvVar) {
                    dvVar.b = -1;
                }
                return;
            case 1:
                se2 se2 = this.b;
                z68.f(se2.a, "loadPrev: exception", th);
                se2.w.a(new HandledException(th));
                return;
            case 2:
                dv dvVar2 = this.b.y;
                synchronized (dvVar2) {
                    dvVar2.b = -1;
                }
                return;
            default:
                se2 se22 = this.b;
                z68.f(se22.a, "load: exception", th);
                se22.w.a(new HandledException(th));
                return;
        }
    }
}
