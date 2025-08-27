package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.LayoutInflater;
import android.view.Surface;
import android.view.View;
import android.view.ViewGroup;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Lazy;
import kotlin.LazyKt;

/* renamed from: q2  reason: default package */
public abstract class q2 implements f2a, ds6 {
    public final Object a;
    public final Object b;
    public Object c;

    public q2(Context context) {
        this.a = Collections.newSetFromMap(new ConcurrentHashMap());
        this.b = context;
    }

    public gf6 E() {
        i6d i6d = (i6d) this.a;
        i6d.a();
        return ((AtomicBoolean) this.b).compareAndSet(false, true) ? (gf6) ((Lazy) this.c).getValue() : i6d.d(F());
    }

    public abstract String F();

    public void G() {
        synchronized (this.b) {
            try {
                t5g t5g = (t5g) this.c;
                if (t5g != null) {
                    ((gy0) this.a).w(t5g);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public Surface H() {
        throw new UnsupportedOperationException();
    }

    public abstract int I();

    public void J(View view) {
        this.c = view;
        M();
    }

    public void L(ViewGroup viewGroup, int i) {
        this.c = LayoutInflater.from((Context) this.b).inflate(i, viewGroup, false);
        M();
    }

    public abstract void M();

    public void N(tk3 tk3) {
        for (Object accept : (Set) this.a) {
            tk3.accept(accept);
        }
    }

    public void O(Bitmap bitmap, je6 je6, skf skf) {
        throw new UnsupportedOperationException();
    }

    public void P(int i, long j) {
        throw new UnsupportedOperationException();
    }

    public void Q(je6 je6) {
        throw new UnsupportedOperationException();
    }

    public void R(Object obj) {
        ((Set) this.a).add(obj);
    }

    public void S(gf6 gf6) {
        if (gf6 == ((gf6) ((Lazy) this.c).getValue())) {
            ((AtomicBoolean) this.b).set(false);
        }
    }

    public void T() {
    }

    public void U(je6 je6) {
    }

    public void V(qx9 qx9) {
        throw new UnsupportedOperationException();
    }

    public abstract void X(gi4 gi4);

    public abstract void Y();

    public abstract void release();

    public void w() {
        ((gy0) this.a).v(new dk4(5, this));
    }

    public q2(i6d i6d) {
        this.a = i6d;
        this.b = new AtomicBoolean(false);
        this.c = LazyKt.lazy(new ve(7, (Object) this));
    }

    public q2(gy0 gy0) {
        this.a = gy0;
        this.b = new Object();
    }
}
