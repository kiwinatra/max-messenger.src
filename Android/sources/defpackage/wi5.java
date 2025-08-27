package defpackage;

import java.util.List;
import java.util.concurrent.Callable;

/* renamed from: wi5  reason: default package */
public final class wi5 implements Callable {
    public final /* synthetic */ int a;
    public final /* synthetic */ List b;
    public final /* synthetic */ xi5 c;

    public /* synthetic */ wi5(xi5 xi5, List list, int i) {
        this.a = i;
        this.c = xi5;
        this.b = list;
    }

    /* JADX INFO: finally extract failed */
    public final Object call() {
        switch (this.a) {
            case 0:
                xi5 xi5 = this.c;
                i6d i6d = xi5.a;
                i6d.c();
                try {
                    xi5.b.a0(this.b);
                    i6d.r();
                    i6d.l();
                    return null;
                } catch (Throwable th) {
                    i6d.l();
                    throw th;
                }
            default:
                StringBuilder o = tr1.o("DELETE FROM favorite_stickers WHERE id IN (");
                int i = 1;
                List<Long> list = this.b;
                n79.c(o, list == null ? 1 : list.size());
                o.append(")");
                String sb = o.toString();
                xi5 xi52 = this.c;
                gf6 d = xi52.a.d(sb);
                if (list == null) {
                    d.X(1);
                } else {
                    for (Long l : list) {
                        if (l == null) {
                            d.X(i);
                        } else {
                            d.k(i, l.longValue());
                        }
                        i++;
                    }
                }
                i6d i6d2 = xi52.a;
                i6d2.c();
                try {
                    d.n();
                    i6d2.r();
                    i6d2.l();
                    return null;
                } catch (Throwable th2) {
                    i6d2.l();
                    throw th2;
                }
        }
    }
}
