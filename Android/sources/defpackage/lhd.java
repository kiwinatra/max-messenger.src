package defpackage;

import android.content.Context;
import org.webrtc.EglBase;

/* renamed from: lhd  reason: default package */
public final class lhd implements y48 {
    public final voc a;
    public final rx3 b;
    public volatile boolean c;
    public xd6 o;
    public be6 v;
    public volatile pe6 w;
    public volatile boolean x = false;
    public final khd y = new khd(this, 2);

    public lhd(EglBase.Context context, Context context2, voc voc, p1e p1e, i8d i8d) {
        rx3 rx3 = new rx3("SSSendControl");
        this.b = rx3;
        this.a = voc;
        rx3.c(new qx4(this, context, context2, p1e, voc, i8d, 1));
    }

    public final void a(int i, int i2) {
        this.b.c(new wt0(this, i, i2, 3));
    }
}
