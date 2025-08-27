package defpackage;

import android.os.Build;
import android.view.View;
import android.view.Window;
import android.view.WindowInsetsController;

/* renamed from: log  reason: default package */
public final class log {
    public final ld8 a;

    /* JADX WARNING: type inference failed for: r1v0, types: [java.lang.Object, p3a] */
    /* JADX WARNING: type inference failed for: r2v0, types: [rfe, java.lang.Object, yu9] */
    public log(WindowInsetsController windowInsetsController) {
        ? obj = new Object();
        ? yu9 = new yu9(7, (Object) null);
        yu9.o = windowInsetsController;
        obj.a = yu9;
        this.a = new kog(windowInsetsController, obj);
    }

    public final void a(boolean z) {
        this.a.s0(z);
    }

    public final void b(boolean z) {
        this.a.t0(z);
    }

    public log(Window window, View view) {
        p3a p3a = new p3a(view);
        if (Build.VERSION.SDK_INT >= 30) {
            kog kog = new kog(window.getInsetsController(), p3a);
            kog.x0 = window;
            this.a = kog;
            return;
        }
        this.a = new jog(window, p3a);
    }
}
