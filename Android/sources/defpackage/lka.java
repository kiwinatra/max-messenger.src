package defpackage;

import java.util.Collection;

/* renamed from: lka  reason: default package */
public final class lka extends r2 {
    public final /* synthetic */ int b;
    public final Object c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ lka(oka oka, Object obj, int i) {
        super(oka);
        this.b = i;
        this.c = obj;
    }

    public final void w(cla cla) {
        oka oka = this.a;
        Object obj = this.c;
        switch (this.b) {
            case 0:
                oka.a(new kka(cla, (dre) ((sm0) obj)));
                return;
            default:
                try {
                    Object obj2 = ((t2f) obj).get();
                    if (obj2 != null) {
                        o95 o95 = p95.a;
                        oka.a(new ab3(4, cla, (Collection) obj2));
                        return;
                    }
                    throw p95.b("The collectionSupplier returned a null Collection.");
                } catch (Throwable th) {
                    hd8.Z(th);
                    p45.b(th, cla);
                    return;
                }
        }
    }
}
