package defpackage;

import android.os.Build;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import java.util.Collection;
import java.util.Iterator;
import java.util.ListIterator;
import kotlin.collections.ArrayDeque;

/* renamed from: fma  reason: default package */
public final class fma {
    public final Runnable a;
    public final ArrayDeque b = new ArrayDeque();
    public xla c;
    public final OnBackInvokedCallback d;
    public OnBackInvokedDispatcher e;
    public boolean f;
    public boolean g;

    public fma(Runnable runnable) {
        this.a = runnable;
        int i = Build.VERSION.SDK_INT;
        if (i >= 33) {
            this.d = i >= 34 ? cma.a.a(new yla(this, 0), new yla(this, 1), new zla(this, 0), new zla(this, 1)) : ama.a.a(new zla(this, 2));
        }
    }

    public final void a(jv7 jv7, xla xla) {
        ju7 lifecycle = jv7.getLifecycle();
        if (((lv7) lifecycle).d != iu7.a) {
            xla.b.add(new dma(this, lifecycle, xla));
            f();
            xla.c = new rh9(5, (Object) this);
        }
    }

    public final ema b(xla xla) {
        this.b.add(xla);
        ema ema = new ema(this, xla);
        xla.b.add(ema);
        f();
        xla.c = new rh9(6, (Object) this);
        return ema;
    }

    public final void c() {
        Object obj;
        xla xla = this.c;
        if (xla == null) {
            ArrayDeque arrayDeque = this.b;
            ListIterator listIterator = arrayDeque.listIterator(arrayDeque.size());
            while (true) {
                if (!listIterator.hasPrevious()) {
                    obj = null;
                    break;
                }
                obj = listIterator.previous();
                if (((xla) obj).a) {
                    break;
                }
            }
            xla = (xla) obj;
        }
        this.c = null;
        if (xla != null) {
            xla.a();
        }
    }

    public final void d() {
        Object obj;
        xla xla = this.c;
        if (xla == null) {
            ArrayDeque arrayDeque = this.b;
            ListIterator listIterator = arrayDeque.listIterator(arrayDeque.size());
            while (true) {
                if (!listIterator.hasPrevious()) {
                    obj = null;
                    break;
                }
                obj = listIterator.previous();
                if (((xla) obj).a) {
                    break;
                }
            }
            xla = (xla) obj;
        }
        this.c = null;
        if (xla != null) {
            xla.b();
            return;
        }
        Runnable runnable = this.a;
        if (runnable != null) {
            runnable.run();
        }
    }

    public final void e(boolean z) {
        OnBackInvokedDispatcher onBackInvokedDispatcher = this.e;
        OnBackInvokedCallback onBackInvokedCallback = this.d;
        if (onBackInvokedDispatcher != null && onBackInvokedCallback != null) {
            ama ama = ama.a;
            if (z && !this.f) {
                ama.b(onBackInvokedDispatcher, 0, onBackInvokedCallback);
                this.f = true;
            } else if (!z && this.f) {
                ama.c(onBackInvokedDispatcher, onBackInvokedCallback);
                this.f = false;
            }
        }
    }

    public final void f() {
        boolean z = this.g;
        ArrayDeque arrayDeque = this.b;
        boolean z2 = false;
        if (!(arrayDeque instanceof Collection) || !arrayDeque.isEmpty()) {
            Iterator it = arrayDeque.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (((xla) it.next()).a) {
                        z2 = true;
                        break;
                    }
                } else {
                    break;
                }
            }
        }
        this.g = z2;
        if (z2 != z && Build.VERSION.SDK_INT >= 33) {
            e(z2);
        }
    }
}
