package defpackage;

import android.graphics.drawable.Animatable;

/* renamed from: p43  reason: default package */
public final class p43 extends bj0 {
    public final /* synthetic */ q43 b;
    public final /* synthetic */ l43 c;

    public p43(q43 q43, l43 l43) {
        this.b = q43;
        this.c = l43;
    }

    public final void a(String str, k97 k97, Animatable animatable) {
        q43 q43 = this.b;
        q43.b.postInvalidate();
        q43.g.invoke(this.c.j());
    }

    public final void b(String str, Throwable th) {
        z68.f("CollageImageAttachDraweeWrapper", "onFailure", th);
    }
}
