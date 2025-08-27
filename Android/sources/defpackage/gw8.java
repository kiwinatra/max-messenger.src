package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;

/* renamed from: gw8  reason: default package */
public abstract class gw8 extends hw8 {
    public final Object a = new Object();
    public Executor b;
    public er7 c;
    public nv8 d;
    public ArrayList e;

    public String j() {
        return null;
    }

    public String k() {
        return null;
    }

    public final void l(nv8 nv8, ArrayList arrayList) {
        if (nv8 != null) {
            synchronized (this.a) {
                try {
                    Executor executor = this.b;
                    if (executor != null) {
                        executor.execute(new ew8(this, this.c, nv8, arrayList, 1));
                    } else {
                        this.d = nv8;
                        this.e = new ArrayList(arrayList);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return;
        }
        throw new NullPointerException("groupRoute must not be null");
    }

    public abstract void m(String str);

    public abstract void n(String str);

    public abstract void o(List list);
}
