package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* renamed from: ad8  reason: default package */
public final /* synthetic */ class ad8 implements qk3 {
    public final /* synthetic */ int a;
    public final /* synthetic */ fd8 b;
    public final /* synthetic */ long c;
    public final /* synthetic */ String o;

    public /* synthetic */ ad8(fd8 fd8, long j, String str, int i) {
        this.a = i;
        this.b = fd8;
        this.c = j;
        this.o = str;
    }

    public final void accept(Object obj) {
        int size;
        boolean z;
        switch (this.a) {
            case 0:
                fd8 fd8 = this.b;
                long j = this.c;
                String str = this.o;
                cd8 cd8 = (cd8) obj;
                fd8.getClass();
                synchronized (cd8) {
                    size = cd8.b.size();
                }
                z68.j("fd8", "searchChatsAndMessages %d, finish %d ms", Integer.valueOf(size), Long.valueOf(TimeUnit.NANOSECONDS.toMillis(System.nanoTime() - j)));
                ArrayList arrayList = new ArrayList(cd8.b);
                fd8.m = arrayList;
                if (!arrayList.isEmpty()) {
                    try {
                        fd8.e.d(fd8);
                    } catch (Exception unused) {
                    }
                }
                if (arrayList.isEmpty()) {
                    synchronized (cd8) {
                        z = cd8.a.contains(dd8.a) && cd8.a.contains(dd8.c) && cd8.a.contains(dd8.b);
                    }
                    if (!z) {
                        return;
                    }
                }
                if (fd8.h != null) {
                    z68.j("fd8", "searchChatsAndMessages, notify listener", new Object[0]);
                    fd8.h.f(str, arrayList);
                    return;
                }
                return;
            default:
                fd8 fd82 = this.b;
                long j2 = this.c;
                String str2 = this.o;
                List list = (List) obj;
                fd82.getClass();
                z68.j("fd8", "searchChats %d, finish %dms", Integer.valueOf(list.size()), Long.valueOf(System.currentTimeMillis() - j2));
                fd82.n = list;
                if (!list.isEmpty()) {
                    try {
                        fd82.e.d(fd82);
                    } catch (Exception unused2) {
                    }
                }
                vc8 vc8 = fd82.h;
                if (vc8 != null) {
                    vc8.a(str2, list);
                    return;
                }
                return;
        }
    }
}
