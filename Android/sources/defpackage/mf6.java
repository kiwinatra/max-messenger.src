package defpackage;

import android.graphics.drawable.Animatable;

/* renamed from: mf6  reason: default package */
public final class mf6 implements jy3 {
    public static final mf6 b = new mf6();
    public final /* synthetic */ bj0 a = new Object();

    static {
        n54.b("WrappingUtils");
    }

    public static String g() {
        return wj6.k("Fresco:ControllerListener[", iif.a(Thread.currentThread()), "]");
    }

    public final void a(String str, k97 k97, Animatable animatable) {
        this.a.getClass();
    }

    public final void b(String str, Throwable th) {
        String g = g();
        z68.f(g, "onFailure " + str, th);
    }

    public final void c(Object obj, String str) {
        this.a.getClass();
    }

    public final void d(String str) {
        this.a.getClass();
    }

    public final void e(String str, k97 k97) {
        this.a.getClass();
    }

    public final void f(String str, Throwable th) {
        String g = g();
        z68.f(g, "onIntermediateImageFailed " + str, th);
    }
}
