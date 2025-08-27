package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

/* renamed from: nga  reason: default package */
public final class nga implements Callable {
    public final /* synthetic */ int a;
    public final /* synthetic */ List b;
    public final /* synthetic */ oga c;

    public /* synthetic */ nga(oga oga, ArrayList arrayList, int i) {
        this.a = i;
        this.c = oga;
        this.b = arrayList;
    }

    /* JADX INFO: finally extract failed */
    public final Object call() {
        switch (this.a) {
            case 0:
                oga oga = this.c;
                i6d i6d = oga.a;
                i6d.c();
                try {
                    oga.b.a0(this.b);
                    i6d.r();
                    i6d.l();
                    return null;
                } catch (Throwable th) {
                    i6d.l();
                    throw th;
                }
            default:
                StringBuilder o = tr1.o("DELETE FROM notifications_tracker_messages WHERE chat_id||'_'||message_id in (");
                List<String> list = this.b;
                n79.c(o, list.size());
                o.append(")");
                String sb = o.toString();
                oga oga2 = this.c;
                gf6 d = oga2.a.d(sb);
                int i = 1;
                for (String str : list) {
                    if (str == null) {
                        d.X(i);
                    } else {
                        d.h(i, str);
                    }
                    i++;
                }
                i6d i6d2 = oga2.a;
                i6d2.c();
                try {
                    Integer valueOf = Integer.valueOf(d.n());
                    i6d2.r();
                    return valueOf;
                } finally {
                    i6d2.l();
                }
        }
    }
}
