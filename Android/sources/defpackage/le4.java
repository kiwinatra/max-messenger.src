package defpackage;

import android.os.Handler;

/* renamed from: le4  reason: default package */
public final class le4 implements mw4 {
    public final fw4 a;
    public zv4 b;
    public boolean c;
    public final /* synthetic */ oe4 o;

    public le4(oe4 oe4, fw4 fw4) {
        this.o = oe4;
        this.a = fw4;
    }

    public final void release() {
        Handler handler = this.o.u;
        handler.getClass();
        t0g.H(handler, new pr1(28, this));
    }
}
