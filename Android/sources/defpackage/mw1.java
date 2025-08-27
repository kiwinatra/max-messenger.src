package defpackage;

import io.reactivex.rxjava3.exceptions.OnErrorNotImplementedException;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: mw1  reason: default package */
public final class mw1 extends AtomicReference implements mq4, ya3 {
    public final /* synthetic */ int a;

    public /* synthetic */ mw1(int i) {
        this.a = i;
    }

    public void b() {
        lazySet(qq4.a);
    }

    public void c(mq4 mq4) {
        qq4.e(this, mq4);
    }

    public final void dispose() {
        bbd bbd;
        switch (this.a) {
            case 0:
                if (get() != null && (bbd = (bbd) getAndSet((Object) null)) != null) {
                    try {
                        bbd.a.b((CancellationException) null);
                        return;
                    } catch (Throwable th) {
                        hd8.Z(th);
                        n54.D(th);
                        return;
                    }
                } else {
                    return;
                }
            case 1:
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
                return get() == null;
            case 1:
                return get() == qq4.a;
            default:
                return qq4.b((mq4) get());
        }
    }

    public void onError(Throwable th) {
        lazySet(qq4.a);
        n54.D(new OnErrorNotImplementedException(th));
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ mw1(Object obj) {
        super(obj);
        this.a = 0;
    }

    public mw1(mw1 mw1) {
        this.a = 2;
        lazySet(mw1);
    }
}
