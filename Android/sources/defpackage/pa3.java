package defpackage;

import java.util.Queue;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: pa3  reason: default package */
public final class pa3 extends AtomicReference implements ta3, mq4, cla, ya3 {
    public static final Object c = new Object();
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ pa3(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    public boolean a(Throwable th) {
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
            ((ya3) this.b).onError(th);
        } finally {
            if (mq4 != null) {
                mq4.dispose();
            }
        }
    }

    public final void b() {
        mq4 mq4;
        switch (this.a) {
            case 0:
                Object obj = get();
                qq4 qq4 = qq4.a;
                if (obj != qq4 && (mq4 = (mq4) getAndSet(qq4)) != qq4) {
                    try {
                        ((ya3) this.b).b();
                        if (mq4 == null) {
                            return;
                        }
                        return;
                    } finally {
                        if (mq4 != null) {
                            mq4.dispose();
                        }
                    }
                } else {
                    return;
                }
            case 1:
                ((Queue) this.b).offer(lea.a);
                return;
            default:
                via via = (via) this.b;
                via.v.c(this);
                via.b();
                return;
        }
    }

    public void c(mq4 mq4) {
        switch (this.a) {
            case 1:
                qq4.e(this, mq4);
                return;
            default:
                qq4.e(this, mq4);
                return;
        }
    }

    public void d(Object obj) {
        ((Queue) this.b).offer(obj);
    }

    public final void dispose() {
        switch (this.a) {
            case 0:
                qq4.a(this);
                return;
            case 1:
                if (qq4.a(this)) {
                    ((Queue) this.b).offer(c);
                    return;
                }
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
            case 1:
                return get() == qq4.a;
            default:
                return qq4.b((mq4) get());
        }
    }

    public void onError(Throwable th) {
        switch (this.a) {
            case 1:
                ((Queue) this.b).offer(new jea(th));
                return;
            default:
                via via = (via) this.b;
                via.v.c(this);
                via.onError(th);
                return;
        }
    }

    public String toString() {
        switch (this.a) {
            case 0:
                String simpleName = pa3.class.getSimpleName();
                String atomicReference = super.toString();
                return simpleName + "{" + atomicReference + "}";
            default:
                return super.toString();
        }
    }

    public pa3(via via) {
        this.a = 2;
        this.b = via;
    }
}
