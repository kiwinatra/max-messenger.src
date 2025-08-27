package defpackage;

import android.net.Uri;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import ru.ok.tamtam.util.HandledException;

/* renamed from: q5e  reason: default package */
public final class q5e {
    public final nd a;
    public final sv0 b;
    public final dbe c;
    public final m95 d;
    public final jqg e;

    public q5e(nd ndVar, sv0 sv0, dbe dbe, m95 m95, jqg jqg) {
        this.a = ndVar;
        this.b = sv0;
        this.c = dbe;
        this.d = m95;
        this.e = jqg;
    }

    public final ArrayList a(int i, String str, List list) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Uri uri = (Uri) it.next();
            if (uri == null || cvg.A(uri.toString())) {
                z68.f("q5e", "Failed to send media, uri is empty or null", (Throwable) null);
            } else {
                if (i == 7) {
                    this.a.f("ACTION_FILE_SEND", "share");
                }
                cbe cbe = new cbe(i, uri.toString());
                ArrayList arrayList2 = new ArrayList();
                arrayList2.add(cbe);
                fvd fvd = new fvd(0, arrayList2);
                fvd.o = true;
                fvd.m = str;
                fvd.n = null;
                arrayList.add(fvd);
            }
        }
        return arrayList;
    }

    /* JADX WARNING: type inference failed for: r8v9, types: [hvd, zud, java.lang.Object] */
    public final void b(u9 u9Var, List list, String str, List list2) {
        List list3;
        u9 u9Var2 = u9Var;
        String str2 = str;
        z68.c("q5e", "share", new Object[0]);
        if (u9Var2 != null) {
            ArrayList arrayList = new ArrayList();
            if (u9Var2.b == 0 && !cvg.A((String) u9Var2.c)) {
                arrayList.add(new kvd(0, ((String) u9Var2.c).trim(), true, CollectionsKt.emptyList()));
            }
            if (((ArrayList) u9Var2.o) != null) {
                if (u9Var.B()) {
                    arrayList.addAll(a(1, (String) u9Var2.c, (ArrayList) u9Var2.o));
                } else {
                    if (!cvg.A((String) u9Var2.c)) {
                        arrayList.add(new kvd(0, ((String) u9Var2.c).trim(), true, CollectionsKt.emptyList()));
                    }
                    arrayList.addAll(a(1, (String) null, (ArrayList) u9Var2.o));
                }
            }
            if (((ArrayList) u9Var2.v) != null) {
                if (u9Var.B()) {
                    arrayList.addAll(a(3, (String) u9Var2.c, (ArrayList) u9Var2.v));
                } else {
                    if (!cvg.A((String) u9Var2.c)) {
                        arrayList.add(new kvd(0, ((String) u9Var2.c).trim(), true, CollectionsKt.emptyList()));
                    }
                    arrayList.addAll(a(3, (String) null, (ArrayList) u9Var2.v));
                }
            }
            if (((ArrayList) u9Var2.w) != null) {
                if (!cvg.A((String) u9Var2.c)) {
                    arrayList.add(new kvd(0, ((String) u9Var2.c).trim(), true, CollectionsKt.emptyList()));
                }
                arrayList.addAll(a(7, (String) null, (ArrayList) u9Var2.w));
            }
            if (!cvg.A((String) u9Var2.x)) {
                String str3 = (String) u9Var2.x;
                if (!cvg.A(str3)) {
                    ? hvd = new hvd(0);
                    hvd.l = str3;
                    list3 = Collections.singletonList(hvd);
                } else {
                    list3 = Collections.emptyList();
                }
                arrayList.addAll(list3);
            }
            if (str2 != null) {
                String trim = str.trim();
                if (!arrayList.isEmpty() && !cvg.A(trim)) {
                    arrayList.add(0, new kvd(0, trim, true, list2 == null ? CollectionsKt.emptyList() : list2));
                }
            }
            z68.c("q5e", "share: queue size = %d; chats count = %d", Integer.valueOf(arrayList.size()), Integer.valueOf(list.size()));
            if (arrayList.isEmpty()) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    ((Long) it.next()).getClass();
                    this.b.c(new mj0("file.local.unknown.error"));
                }
                ((uta) this.d).c(new HandledException("Try to share empty queue. Description = %s chats size = %d, shareData = %s", str2, Integer.valueOf(list.size()), u9Var2), true);
                return;
            }
            this.c.getClass();
            ArrayDeque arrayDeque = new ArrayDeque(arrayList.size());
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                arrayDeque.add(((hvd) it2.next()).a());
            }
            z68.c("dbe", "tasks size = %d", Integer.valueOf(arrayDeque.size()));
            for (int i = 0; i < list.size(); i++) {
                kud kud = new kud(((Long) list.get(i)).longValue(), new ArrayDeque(arrayDeque), 2);
                kud.h = null;
                this.e.a(new jvd(kud));
            }
        }
    }
}
