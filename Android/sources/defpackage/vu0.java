package defpackage;

import bolts.Task;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: vu0  reason: default package */
public final class vu0 {
    public final nl5 a;
    public final p7d b;
    public final ni0 c;
    public final Executor d;
    public final Executor e;
    public final t9a f;
    public final wie g;

    public vu0(nl5 nl5, p7d p7d, ni0 ni0, Executor executor, Executor executor2, t9a t9a) {
        this.a = nl5;
        this.b = p7d;
        this.c = ni0;
        this.d = executor;
        this.e = executor2;
        this.f = t9a;
        wie wie = new wie(0, false);
        wie.b = new HashMap();
        this.g = wie;
    }

    public final void a() {
        this.g.b0();
        try {
            Task.call(new h5(2, this), this.e);
        } catch (Exception e2) {
            bg5.n(e2, "Failed to schedule disk-cache clear", new Object[0]);
            Task.forError(e2);
        }
    }

    public final Task b(uae uae, AtomicBoolean atomicBoolean) {
        tf6.P();
        j55 c0 = this.g.c0(uae);
        if (c0 != null) {
            bg5.f(vu0.class, uae.a, "Found image for %s in staging area");
            this.f.getClass();
            Task forResult = Task.forResult(c0);
            if (forResult != null) {
                return forResult;
            }
        }
        return c(uae, atomicBoolean);
    }

    public final Task c(uae uae, AtomicBoolean atomicBoolean) {
        try {
            return Task.call(new uu0(atomicBoolean, this, uae, 0), this.d);
        } catch (Exception e2) {
            bg5.n(e2, "Failed to schedule disk-cache read for %s", uae.a);
            return Task.forError(e2);
        }
    }

    public final void d(qx0 qx0, j55 j55) {
        tf6.P();
        Executor executor = this.e;
        if (j55.k0(j55)) {
            wie wie = this.g;
            wie.l0(qx0, j55);
            j55 a2 = j55.a(j55);
            try {
                executor.execute(new ktg(this, qx0, a2, 7));
            } catch (Exception e2) {
                bg5.n(e2, "Failed to schedule disk-cache write for %s", qx0.c());
                wie.n0(qx0, j55);
                j55.b(a2);
            }
        } else {
            throw new IllegalStateException("Check failed.".toString());
        }
    }

    public final e69 e(uae uae) {
        f69 f69;
        String str = uae.a;
        t9a t9a = this.f;
        Class<vu0> cls = vu0.class;
        try {
            bg5.f(cls, str, "Disk cache read for %s");
            ml5 c2 = ((up4) this.a).c(uae);
            if (c2 == null) {
                bg5.f(cls, str, "Disk cache miss for %s");
                t9a.getClass();
                return null;
            }
            bg5.f(cls, str, "Found entry in disk cache for %s");
            t9a.getClass();
            FileInputStream fileInputStream = new FileInputStream(c2.a);
            try {
                p7d p7d = this.b;
                p7d.getClass();
                f69 = new f69((d69) p7d.b, (int) c2.a.length());
                ((ni0) p7d.c).l(fileInputStream, f69);
                e69 n = f69.n();
                f69.close();
                fileInputStream.close();
                bg5.f(cls, str, "Successful read from disk cache for %s");
                return n;
            } catch (Throwable th) {
                fileInputStream.close();
                throw th;
            }
        } catch (IOException e2) {
            bg5.n(e2, "Exception reading from cache for %s", str);
            t9a.getClass();
            throw e2;
        }
    }

    public final void f(qx0 qx0, j55 j55) {
        Class<vu0> cls = vu0.class;
        bg5.f(cls, qx0.c(), "About to write to disk-cache for key %s");
        try {
            ((up4) this.a).e(qx0, new ba(4, j55, this));
            this.f.getClass();
            bg5.f(cls, qx0.c(), "Successful disk-cache write for key %s");
        } catch (IOException e2) {
            bg5.n(e2, "Failed to write to disk-cache for key %s", qx0.c());
        }
    }
}
