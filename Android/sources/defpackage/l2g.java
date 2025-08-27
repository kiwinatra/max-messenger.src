package defpackage;

import android.content.Context;
import kotlin.jvm.functions.Function1;
import one.me.sdk.richvector.EnhancedVectorDrawable;

/* renamed from: l2g  reason: default package */
public final class l2g extends EnhancedVectorDrawable implements phf {
    public final m2g a;
    public final Function1 b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public l2g(Context context, m2g m2g, Function1 function1) {
        super(context, m2g == m2g.SMALL ? cad.h2 : cad.i2);
        this.a = m2g;
        this.b = function1;
        onThemeChanged(fu4.k.e(context).f());
    }

    public final void onThemeChanged(k2b k2b) {
        k2g k2g = (k2g) this.b.invoke(k2b);
        hi7.Y(this, "mark_path", k2g.a);
        hi7.Y(this, "background_path", k2g.b);
    }
}
