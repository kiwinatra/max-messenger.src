package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/* renamed from: xc8  reason: default package */
public final /* synthetic */ class xc8 implements qk3, zi6 {
    public final /* synthetic */ int a;
    public final /* synthetic */ fd8 b;

    public /* synthetic */ xc8(fd8 fd8, int i) {
        this.a = i;
        this.b = fd8;
    }

    public void accept(Object obj) {
        switch (this.a) {
            case 0:
                fd8 fd8 = this.b;
                fd8.getClass();
                fd8.n = ((ed8) obj).b;
                return;
            default:
                Throwable th = (Throwable) obj;
                fd8 fd82 = this.b;
                fd82.getClass();
                z68.f("fd8", "searchMessages: exception", th);
                fd82.g.a(th);
                return;
        }
    }

    /* JADX WARNING: type inference failed for: r13v6, types: [aac, java.lang.Object, ibf] */
    public Object apply(Object obj) {
        switch (this.a) {
            case 2:
                fd8 fd8 = this.b;
                aac aac = (aac) obj;
                fd8.getClass();
                List list = aac.c;
                List list2 = fd8.n;
                d9a d9a = tld.b;
                list.removeAll((List) list.stream().filter(new rld(list2, (List) list2.stream().filter(new lm3(2)).map(new mm3(7)).collect(Collectors.toList()), (List) list2.stream().filter(new lm3(3)).map(new mm3(8)).collect(Collectors.toList()), 1)).collect(Collectors.toList()));
                int i = aac.o;
                Long l = aac.v;
                ? ibf = new ibf();
                ibf.c = list;
                ibf.o = i;
                ibf.v = l;
                return ibf;
            default:
                mp2 mp2 = (mp2) obj;
                fd8 fd82 = this.b;
                fd82.getClass();
                List<he9> list3 = mp2.c;
                ArrayList arrayList = new ArrayList(list3.size());
                for (he9 he9 : list3) {
                    try {
                        b89 b89 = he9.b;
                        List list4 = he9.o;
                        arrayList.add(new ald(3, he9.c, (ArrayList) list4, (a32) null, (vk3) null, b89, he9.a, (bac) null));
                    } catch (Throwable th) {
                        throw new RuntimeException(th);
                    }
                }
                String str = mp2.v;
                if (str == null || !str.equals("0")) {
                    fd82.r = mp2.v;
                } else {
                    fd82.r = null;
                }
                return arrayList;
        }
    }
}
