package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

/* renamed from: wba  reason: default package */
public final class wba {
    public final sv0 a;
    public final hs7 b;
    public final hs7 c;
    public final hs7 d;

    public wba(sv0 sv0, hs7 hs7, hs7 hs72, hs7 hs73) {
        this.a = sv0;
        this.b = hs7;
        this.c = hs72;
        this.d = hs73;
    }

    public static void a(a32 a32, qwa qwa) {
        m72 m72 = a32.b;
        int i = m72.m;
        long j = m72.a;
        if (i > 0) {
            qwa.d(Collections.singleton(Long.valueOf(j)));
        } else {
            qwa.a(j);
        }
    }

    public final void b(a32 a32, Collection collection, bl4 bl4) {
        z68.c("wba", "onNotifMsgDelete, %s", bl4.name());
        if (a32 != null) {
            boolean a2 = bl4.a();
            sv0 sv0 = this.a;
            hs7 hs7 = this.c;
            long j = a32.a;
            if (a2) {
                ArrayList l = ((fa9) hs7.get()).l(j, collection);
                ArrayList arrayList = new ArrayList(l.size());
                Iterator it = l.iterator();
                while (it.hasNext()) {
                    try {
                        arrayList.add(Long.valueOf(((ha9) it.next()).b));
                    } catch (Throwable th) {
                        throw new RuntimeException(th);
                    }
                }
                ((a74) ((fa9) hs7.get()).a).c.d().o(j, arrayList, qe9.DELETED);
                sv0.c(new kv9(j, arrayList, bl4));
                return;
            }
            ArrayList l2 = ((fa9) hs7.get()).l(j, collection);
            ArrayList arrayList2 = new ArrayList(l2.size());
            Iterator it2 = l2.iterator();
            while (it2.hasNext()) {
                try {
                    arrayList2.add(Long.valueOf(((ha9) it2.next()).b));
                } catch (Throwable th2) {
                    throw new RuntimeException(th2);
                }
            }
            ((fa9) hs7.get()).d(j, arrayList2);
            if (bl4.b()) {
                ((r62) this.b.get()).A(j);
            }
            sv0.c(new kv9(j, arrayList2, bl4));
            if (bl4.b()) {
                a(a32, (qwa) this.d.get());
            }
        }
    }
}
