package defpackage;

import android.os.Handler;
import android.view.ViewGroup;
import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: i0b  reason: default package */
public final class i0b implements e6f {
    public final /* synthetic */ j50 a;
    public final /* synthetic */ c1b b;
    public final /* synthetic */ f6f c;

    public i0b(j50 j50, c1b c1b, f6f f6f) {
        this.a = j50;
        this.b = c1b;
        this.c = f6f;
    }

    public final int a() {
        boolean z = true;
        if ((((z0b) this.a.o).v.a & 1) == 0) {
            z = false;
        }
        c1b c1b = this.b;
        if (z) {
            return c1b.getMeasuredHeight();
        }
        return a81.e((float) 12, vo4.c().getDisplayMetrics().density, this.c.getMeasuredHeight() - c1b.getMeasuredHeight());
    }

    public final int b() {
        if ((((z0b) this.a.o).v.a & 1) != 0) {
            return 0;
        }
        return this.c.getMeasuredHeight();
    }

    public final void c() {
        j50 j50 = this.a;
        ViewGroup viewGroup = (ViewGroup) ((WeakReference) j50.c).get();
        if (viewGroup != null) {
            viewGroup.post(new o99(13, j50));
        }
        Handler handler = l0b.a;
        AtomicBoolean atomicBoolean = l0b.d;
        if (atomicBoolean.compareAndSet(false, true)) {
            k0b k0b = l0b.b;
            if (k0b != null ? Intrinsics.areEqual(k0b.b.get(), (Object) (h0b) j50.y) : false) {
                l0b.b = null;
                if (l0b.c != null) {
                    l0b.c();
                }
            }
            atomicBoolean.set(false);
        }
    }
}
