package defpackage;

import java.lang.ref.WeakReference;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;

/* renamed from: ifg  reason: default package */
public final class ifg implements mq4, nq4 {
    public final kc3 a = new Object();
    public final HashSet b = new HashSet();

    /* JADX WARNING: type inference failed for: r0v0, types: [mq4, java.lang.Object, java.lang.ref.WeakReference] */
    public final synchronized boolean a(mq4 mq4) {
        boolean a2;
        ? weakReference = new WeakReference(mq4);
        a2 = this.a.a(weakReference);
        if (a2) {
            this.b.add(weakReference);
        }
        return a2;
    }

    public final synchronized boolean b(mq4 mq4) {
        boolean z;
        z = false;
        try {
            kc3 kc3 = this.a;
            Objects.requireNonNull(kc3);
            Iterator it = this.b.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                jfg jfg = (jfg) it.next();
                if (((mq4) jfg.get()) == mq4) {
                    it.remove();
                    z = kc3.b(jfg);
                    break;
                }
            }
        } catch (Throwable th) {
            z68.f("ifg", "delete: failed", th);
            return false;
        }
        return z;
    }

    public final synchronized boolean c(mq4 mq4) {
        boolean z;
        z = false;
        try {
            kc3 kc3 = this.a;
            Objects.requireNonNull(kc3);
            Iterator it = this.b.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                jfg jfg = (jfg) it.next();
                if (((mq4) jfg.get()) == mq4) {
                    it.remove();
                    z = kc3.c(jfg);
                    break;
                }
            }
        } catch (Throwable th) {
            z68.f("ifg", "delete: failed", th);
            return false;
        }
        return z;
    }

    public final synchronized void d() {
        this.a.d();
        this.b.clear();
    }

    public final synchronized void dispose() {
        this.a.dispose();
        this.b.clear();
    }

    public final boolean f() {
        return this.a.b;
    }
}
