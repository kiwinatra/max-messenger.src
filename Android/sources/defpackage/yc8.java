package defpackage;

import java.util.ArrayList;
import java.util.List;
import ru.ok.tamtam.search.MainSearchLoaderImpl$NotFoundException;

/* renamed from: yc8  reason: default package */
public final /* synthetic */ class yc8 implements qk3 {
    public final /* synthetic */ int a;
    public final /* synthetic */ fd8 b;
    public final /* synthetic */ String c;

    public /* synthetic */ yc8(fd8 fd8, String str, int i) {
        this.a = i;
        this.b = fd8;
        this.c = str;
    }

    public final void accept(Object obj) {
        String str = this.c;
        fd8 fd8 = this.b;
        switch (this.a) {
            case 0:
                mp2 mp2 = (mp2) obj;
                fd8.getClass();
                List<he9> list = mp2.c;
                ArrayList arrayList = new ArrayList(list.size());
                for (he9 he9 : list) {
                    try {
                        b89 b89 = he9.b;
                        List list2 = he9.o;
                        arrayList.add(new ald(3, he9.c, (ArrayList) list2, (a32) null, (vk3) null, b89, he9.a, (bac) null));
                    } catch (Throwable th) {
                        throw new RuntimeException(th);
                    }
                }
                fd8.m.addAll(arrayList);
                ArrayList arrayList2 = fd8.p;
                arrayList2.addAll(arrayList);
                String str2 = mp2.v;
                if (str2 == null || !str2.equals("0")) {
                    fd8.r = mp2.v;
                } else {
                    fd8.r = null;
                }
                vc8 vc8 = fd8.h;
                if (vc8 != null) {
                    vc8.f(str, fd8.m);
                    vc8 vc82 = fd8.h;
                    new ArrayList(arrayList2);
                    vc82.getClass();
                    return;
                }
                return;
            case 1:
                Throwable th2 = (Throwable) obj;
                fd8.getClass();
                z68.f("fd8", "searchChatsAndMessages: exception", th2);
                fd8.g.a(new MainSearchLoaderImpl$NotFoundException(str, th2));
                return;
            default:
                Throwable th3 = (Throwable) obj;
                fd8.getClass();
                z68.f("fd8", "searchChats: exception", th3);
                fd8.g.a(new MainSearchLoaderImpl$NotFoundException(str, th3));
                return;
        }
    }
}
