package defpackage;

import java.util.List;

/* renamed from: nv  reason: default package */
public final class nv implements Runnable {
    public final /* synthetic */ List a;
    public final /* synthetic */ List b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Runnable o;
    public final /* synthetic */ ov v;

    public nv(ov ovVar, List list, List list2, int i, Runnable runnable) {
        this.v = ovVar;
        this.a = list;
        this.b = list2;
        this.c = i;
        this.o = runnable;
    }

    public final void run() {
        this.v.c.execute(new uj6((Object) this, (Object) h88.h(new mv(this)), false, 2));
    }
}
