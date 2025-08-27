package defpackage;

import java.util.List;
import java.util.concurrent.Callable;

/* renamed from: juc  reason: default package */
public final class juc implements Callable {
    public final /* synthetic */ int a;
    public final /* synthetic */ List b;
    public final /* synthetic */ kuc c;

    public /* synthetic */ juc(kuc kuc, List list, int i) {
        this.a = i;
        this.c = kuc;
        this.b = list;
    }

    /* JADX INFO: finally extract failed */
    public final Object call() {
        switch (this.a) {
            case 0:
                kuc kuc = this.c;
                i6d i6d = kuc.a;
                i6d.c();
                try {
                    kuc.b.a0(this.b);
                    i6d.r();
                    i6d.l();
                    return null;
                } catch (Throwable th) {
                    i6d.l();
                    throw th;
                }
            default:
                kuc kuc2 = this.c;
                i6d i6d2 = kuc2.a;
                i6d2.c();
                try {
                    kuc2.c.c0(this.b);
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
