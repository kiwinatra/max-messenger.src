package defpackage;

import java.util.Set;
import kotlin.Unit;

/* renamed from: k14  reason: default package */
public final class k14 extends qj7 {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k14(String[] strArr, Object obj, int i) {
        super(strArr);
        this.b = i;
        this.c = obj;
    }

    public final void a(Set set) {
        switch (this.b) {
            case 0:
                ((x02) this.c).s(Unit.INSTANCE);
                return;
            case 1:
                gs U = gs.U();
                r7d r7d = ((s7d) this.c).u;
                if (U.o.U()) {
                    r7d.run();
                    return;
                } else {
                    U.V(r7d);
                    return;
                }
            default:
                ((yha) ((oia) this.c)).d(te8.g);
                return;
        }
    }
}
