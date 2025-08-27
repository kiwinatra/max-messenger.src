package defpackage;

import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.Unit;

/* renamed from: gu4  reason: default package */
public final class gu4 implements Callable {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object o;

    public /* synthetic */ gu4(Object obj, Collection collection, long j, int i) {
        this.a = i;
        this.o = obj;
        this.c = collection;
        this.b = j;
    }

    public final Object call() {
        switch (this.a) {
            case 0:
                iu4 iu4 = (iu4) this.o;
                mi miVar = iu4.c;
                i6d i6d = iu4.a;
                gf6 E = miVar.E();
                E.k(1, this.b);
                String str = (String) this.c;
                if (str == null) {
                    E.X(2);
                } else {
                    E.h(2, str);
                }
                try {
                    i6d.c();
                    E.n();
                    i6d.r();
                    i6d.l();
                    miVar.S(E);
                    return null;
                } catch (Throwable th) {
                    miVar.S(E);
                    throw th;
                }
            case 1:
                StringBuilder o2 = tr1.o("DELETE FROM messages WHERE chat_id = ? AND id in (");
                List<Long> list = (List) this.c;
                n79.c(o2, list.size());
                o2.append(")");
                String sb = o2.toString();
                aj9 aj9 = (aj9) this.o;
                gf6 d = aj9.a.d(sb);
                d.k(1, this.b);
                int i = 2;
                for (Long l : list) {
                    if (l == null) {
                        d.X(i);
                    } else {
                        d.k(i, l.longValue());
                    }
                    i++;
                }
                i6d i6d2 = aj9.a;
                i6d2.c();
                try {
                    d.n();
                    i6d2.r();
                    return Unit.INSTANCE;
                } finally {
                    i6d2.l();
                }
            default:
                StringBuilder o3 = tr1.o("DELETE FROM folder_and_chats WHERE folderId IN (");
                Collection<String> collection = (Collection) this.c;
                int size = collection.size();
                n79.c(o3, size);
                o3.append(") AND chatId = ");
                o3.append("?");
                String sb2 = o3.toString();
                c6d c6d = (c6d) this.o;
                gf6 d2 = c6d.a.d(sb2);
                int i2 = 1;
                for (String str2 : collection) {
                    if (str2 == null) {
                        d2.X(i2);
                    } else {
                        d2.h(i2, str2);
                    }
                    i2++;
                }
                d2.k(size + 1, this.b);
                i6d i6d3 = c6d.a;
                i6d3.c();
                try {
                    d2.n();
                    i6d3.r();
                    return Unit.INSTANCE;
                } finally {
                    i6d3.l();
                }
        }
    }

    public gu4(iu4 iu4, long j, String str) {
        this.a = 0;
        this.o = iu4;
        this.b = j;
        this.c = str;
    }
}
