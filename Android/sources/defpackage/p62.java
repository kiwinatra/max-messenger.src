package defpackage;

import java.util.List;
import java.util.concurrent.Callable;

/* renamed from: p62  reason: default package */
public final /* synthetic */ class p62 implements Callable {
    public final /* synthetic */ r62 a;
    public final /* synthetic */ List b;
    public final /* synthetic */ String c;
    public final /* synthetic */ String o;

    public /* synthetic */ p62(r62 r62, List list, String str, String str2) {
        this.a = r62;
        this.b = list;
        this.c = str;
        this.o = str2;
    }

    /* JADX WARNING: type inference failed for: r3v3, types: [java.lang.Object, o10] */
    public final Object call() {
        r62 r62 = this.a;
        r62.getClass();
        StringBuilder sb = new StringBuilder("createMultiChat, contacts.size() = ");
        List list = this.b;
        sb.append(list.size());
        z68.c("r62", sb.toString(), new Object[0]);
        l72 l72 = l72.b;
        String str = this.o;
        String str2 = this.c;
        a32 b2 = r62.b(l72, list, str2, str);
        ? obj = new Object();
        obj.a = p10.b;
        obj.l = 3;
        obj.c = list;
        obj.d = str2;
        ((jqg) r62.w.get()).a(new lud(new kud(b2.a, obj.a(), 1), (byte) 0));
        return b2;
    }
}
