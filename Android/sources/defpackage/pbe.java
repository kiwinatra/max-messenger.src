package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: pbe  reason: default package */
public final class pbe extends AtomicReference implements ube, mq4, ya3 {
    public final /* synthetic */ int a = 0;
    public final Object b;

    public pbe(gce gce) {
        this.b = gce;
    }

    public void a(Object obj) {
        mq4 mq4;
        Object obj2 = get();
        qq4 qq4 = qq4.a;
        if (obj2 != qq4 && (mq4 = (mq4) getAndSet(qq4)) != qq4) {
            gce gce = (gce) this.b;
            if (obj == null) {
                try {
                    gce.onError(p95.b("onSuccess called with a null value."));
                } finally {
                    if (mq4 != null) {
                        mq4.dispose();
                    }
                }
            } else {
                gce.a(obj);
            }
        }
    }

    public void b() {
        tia tia = (tia) this.b;
        tia.v.c(this);
        tia.b();
    }

    public void c(mq4 mq4) {
        qq4.e(this, mq4);
    }

    public boolean d(Throwable th) {
        mq4 mq4;
        if (th == null) {
            th = p95.b("onError called with a null Throwable.");
        }
        Object obj = get();
        qq4 qq4 = qq4.a;
        if (obj == qq4 || (mq4 = (mq4) getAndSet(qq4)) == qq4) {
            return false;
        }
        try {
            ((gce) this.b).onError(th);
        } finally {
            if (mq4 != null) {
                mq4.dispose();
            }
        }
    }

    public final void dispose() {
        switch (this.a) {
            case 0:
                qq4.a(this);
                return;
            default:
                qq4.a(this);
                return;
        }
    }

    public final boolean f() {
        switch (this.a) {
            case 0:
                return qq4.b((mq4) get());
            default:
                return qq4.b((mq4) get());
        }
    }

    public final void onError(Throwable th) {
        switch (this.a) {
            case 0:
                if (!d(th)) {
                    n54.D(th);
                    return;
                }
                return;
            default:
                tia tia = (tia) this.b;
                tia.v.c(this);
                tia.onError(th);
                return;
        }
    }

    public String toString() {
        switch (this.a) {
            case 0:
                String simpleName = pbe.class.getSimpleName();
                String atomicReference = super.toString();
                return simpleName + "{" + atomicReference + "}";
            default:
                return super.toString();
        }
    }

    public pbe(tia tia) {
        this.b = tia;
    }
}
