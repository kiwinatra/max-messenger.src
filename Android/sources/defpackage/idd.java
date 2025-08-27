package defpackage;

import java.io.Closeable;

/* renamed from: idd  reason: default package */
public final class idd implements zu7, Closeable {
    public final String a;
    public final hdd b;
    public boolean c;

    public idd(String str, hdd hdd) {
        this.a = str;
        this.b = hdd;
    }

    public final void a(mdd mdd, ju7 ju7) {
        if (!this.c) {
            this.c = true;
            ju7.a(this);
            mdd.c(this.a, this.b.e);
            return;
        }
        throw new IllegalStateException("Already attached to lifecycleOwner".toString());
    }

    public final void close() {
    }

    public final void d(jv7 jv7, hu7 hu7) {
        if (hu7 == hu7.ON_DESTROY) {
            this.c = false;
            jv7.getLifecycle().b(this);
        }
    }
}
