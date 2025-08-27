package defpackage;

import android.graphics.Rect;
import android.view.View;

/* renamed from: wrc  reason: default package */
public final class wrc implements Runnable {
    public final /* synthetic */ yrc a;
    public final /* synthetic */ pzc b;
    public final /* synthetic */ long c;
    public final /* synthetic */ vrc o;
    public final /* synthetic */ boolean v;

    public wrc(View view, yrc yrc, pzc pzc, long j, vrc vrc, boolean z) {
        this.a = yrc;
        this.b = pzc;
        this.c = j;
        this.o = vrc;
        this.v = z;
    }

    public final void run() {
        if (!this.a.f(this.b.q())) {
            this.a.f.remove(Long.valueOf(this.c));
            this.a.e.remove(this.o);
            View findViewById = this.b.a.findViewById(this.o.c.a.toString().hashCode());
            Rect c2 = yrc.c(this.a, findViewById);
            if (c2 != null) {
                String str = this.a.d;
                a67 a67 = z68.b;
                if (a67 != null && a67.c()) {
                    w78 w78 = w78.o;
                    boolean z = this.v;
                    a67.d(w78, str, "Play pending reaction effect, by place:" + c2 + ", onCreation:" + z, (Throwable) null);
                }
                yrc yrc = this.a;
                vrc vrc = this.o;
                yrc.d(yrc, vrc.b, vrc.a, c2);
                if (this.v) {
                    this.b.a.addOnLayoutChangeListener(new xrc(this.a, findViewById, this.c));
                }
            }
        }
    }
}
