package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: kz7  reason: default package */
public final class kz7 implements zz7 {
    public List a;
    public ArrayList b;
    public final boolean c;
    public final AtomicInteger o;
    public final go1 v = m5a.F(new grg(24, this));
    public do1 w;

    public kz7(ArrayList arrayList, boolean z, ep4 ep4) {
        this.a = arrayList;
        this.b = new ArrayList(arrayList.size());
        this.c = z;
        this.o = new AtomicInteger(arrayList.size());
        d(new tj7(4, this), ryg.j());
        if (this.a.isEmpty()) {
            this.w.b(new ArrayList(this.b));
            return;
        }
        for (int i = 0; i < this.a.size(); i++) {
            this.b.add((Object) null);
        }
        List list = this.a;
        for (int i2 = 0; i2 < list.size(); i2++) {
            zz7 zz7 = (zz7) list.get(i2);
            zz7.d(new cp((Object) this, i2, (Object) zz7, 3), ep4);
        }
    }

    public final boolean cancel(boolean z) {
        List<zz7> list = this.a;
        if (list != null) {
            for (zz7 cancel : list) {
                cancel.cancel(z);
            }
        }
        return this.v.cancel(z);
    }

    public final void d(Runnable runnable, Executor executor) {
        this.v.b.d(runnable, executor);
    }

    public final Object get(long j, TimeUnit timeUnit) {
        return (List) this.v.b.get(j, timeUnit);
    }

    public final boolean isCancelled() {
        return this.v.isCancelled();
    }

    public final boolean isDone() {
        return this.v.b.isDone();
    }

    public final Object get() {
        List<zz7> list = this.a;
        if (list != null && !isDone()) {
            loop0:
            for (zz7 zz7 : list) {
                while (true) {
                    if (!zz7.isDone()) {
                        try {
                            zz7.get();
                        } catch (Error e) {
                            throw e;
                        } catch (InterruptedException e2) {
                            throw e2;
                        } catch (Throwable unused) {
                            if (this.c) {
                                break loop0;
                            }
                        }
                    }
                }
            }
        }
        return (List) this.v.b.get();
    }
}
