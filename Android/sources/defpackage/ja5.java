package defpackage;

import java.util.List;
import java.util.concurrent.Callable;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* renamed from: ja5  reason: default package */
public final class ja5 implements Callable {
    public final /* synthetic */ int a;
    public final Object b;
    public final Object c;
    public final Object o;

    public /* synthetic */ ja5(int i, Object obj, Object obj2, List list) {
        this.a = i;
        this.o = obj;
        this.b = list;
        this.c = obj2;
    }

    public final Object call() {
        switch (this.a) {
            case 0:
                Function1 function1 = (Function1) this.o;
                Function0 function0 = (Function0) this.c;
                Object invoke = function0 != null ? function0.invoke() : null;
                try {
                    return ((Callable) this.b).call();
                } finally {
                    if (function1 != null) {
                        function1.invoke(invoke);
                    }
                }
            case 1:
                StringBuilder o2 = tr1.o("DELETE FROM folder_and_chats WHERE folderId = ? AND chatId IN (");
                List<Long> list = (List) this.b;
                n79.c(o2, list.size());
                o2.append(")");
                String sb = o2.toString();
                c6d c6d = (c6d) this.o;
                gf6 d = c6d.a.d(sb);
                String str = (String) this.c;
                if (str == null) {
                    d.X(1);
                } else {
                    d.h(1, str);
                }
                int i = 2;
                for (Long l : list) {
                    if (l == null) {
                        d.X(i);
                    } else {
                        d.k(i, l.longValue());
                    }
                    i++;
                }
                i6d i6d = c6d.a;
                i6d.c();
                try {
                    d.n();
                    i6d.r();
                    return Unit.INSTANCE;
                } finally {
                    i6d.l();
                }
            default:
                StringBuilder o3 = tr1.o("UPDATE events SET status = ? WHERE id in (");
                List<Long> list2 = (List) this.b;
                n79.c(o3, list2.size());
                o3.append(")");
                String sb2 = o3.toString();
                rne rne = (rne) this.o;
                gf6 d2 = rne.a.d(sb2);
                d2.k(1, (long) ((r78) this.c).a);
                int i2 = 2;
                for (Long l2 : list2) {
                    if (l2 == null) {
                        d2.X(i2);
                    } else {
                        d2.k(i2, l2.longValue());
                    }
                    i2++;
                }
                i6d i6d2 = rne.a;
                i6d2.c();
                try {
                    d2.n();
                    i6d2.r();
                    return Unit.INSTANCE;
                } finally {
                    i6d2.l();
                }
        }
    }

    public ja5(Callable callable, fa5 fa5, ga5 ga5) {
        this.a = 0;
        this.b = callable;
        this.c = fa5;
        this.o = ga5;
    }
}
