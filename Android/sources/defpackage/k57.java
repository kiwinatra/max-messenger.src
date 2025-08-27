package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Lazy;

/* renamed from: k57  reason: default package */
public final class k57 extends AtomicReference implements mq4, z47 {
    public final Lazy a;
    public final int b;
    public final String c;
    public final String o;
    public final String v;
    public final jfd w;
    public final cla x;
    public final AtomicBoolean y = new AtomicBoolean();
    public long z;

    public k57(cla cla, Lazy lazy, int i, String str, String str2, String str3, jfd jfd) {
        this.a = lazy;
        this.b = i;
        this.c = str;
        this.o = str2;
        this.v = str3;
        this.w = jfd;
        this.x = cla;
    }

    public final void a(boolean z2) {
        if (this.y.compareAndSet(false, true)) {
            jfd jfd = this.w;
            if (!jfd.f()) {
                jfd.dispose();
            }
            if (z2) {
                z68.c("l57", "cancelUpload", new Object[0]);
                go5 go5 = (go5) get();
                if (go5 != null) {
                    synchronized (go5) {
                        try {
                            if (!go5.b) {
                                if (go5.a != null && !go5.a.v0) {
                                    go5.a.e();
                                }
                                go5.b = true;
                            }
                        } catch (Throwable th) {
                            while (true) {
                                throw th;
                            }
                        }
                    }
                }
            }
        }
    }

    public final void b(String str, u47 u47) {
        if (!this.y.get()) {
            this.w.a(new x55((Object) this, (Object) str, (Object) u47, 9));
        }
    }

    public final void dispose() {
        a(true);
    }

    public final boolean f() {
        return this.y.get();
    }
}
