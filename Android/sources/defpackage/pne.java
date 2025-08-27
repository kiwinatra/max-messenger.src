package defpackage;

import java.util.List;
import java.util.concurrent.Callable;
import kotlin.Unit;

/* renamed from: pne  reason: default package */
public final class pne implements Callable {
    public final /* synthetic */ int a;
    public final /* synthetic */ List b;
    public final /* synthetic */ rne c;

    public /* synthetic */ pne(rne rne, List list, int i) {
        this.a = i;
        this.c = rne;
        this.b = list;
    }

    public final Object call() {
        switch (this.a) {
            case 0:
                StringBuilder o = tr1.o("DELETE FROM events WHERE id in (");
                List<Long> list = this.b;
                n79.c(o, list.size());
                o.append(")");
                String sb = o.toString();
                rne rne = this.c;
                gf6 d = rne.a.d(sb);
                int i = 1;
                for (Long l : list) {
                    if (l == null) {
                        d.X(i);
                    } else {
                        d.k(i, l.longValue());
                    }
                    i++;
                }
                i6d i6d = rne.a;
                i6d.c();
                try {
                    d.n();
                    i6d.r();
                    return Unit.INSTANCE;
                } finally {
                    i6d.l();
                }
            default:
                rne rne2 = this.c;
                i6d i6d2 = rne2.a;
                i6d2.c();
                try {
                    rne2.b.a0(this.b);
                    i6d2.r();
                    return Unit.INSTANCE;
                } finally {
                    i6d2.l();
                }
        }
    }
}
