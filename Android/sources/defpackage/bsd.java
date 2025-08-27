package defpackage;

import android.content.Context;
import android.text.Layout;
import android.text.TextPaint;
import android.text.TextUtils;
import kotlin.Lazy;
import kotlin.LazyKt;

/* renamed from: bsd  reason: default package */
public final class bsd {
    public final Context a;
    public final Lazy b;
    public final Lazy c;
    public final Lazy d;
    public final Lazy e;
    public final q3d f;
    public final q3d g;

    public bsd(Context context, Lazy lazy, Lazy lazy2, Lazy lazy3, ogf ogf, int i) {
        this.a = context;
        this.b = lazy;
        this.c = lazy2;
        this.d = LazyKt.lazy(new we9(i, 2));
        this.e = lazy3;
        this.f = new q3d(new ifb(26, this));
        this.g = new q3d(new vra(18, ogf, this));
    }

    public static /* synthetic */ Layout b(bsd bsd, String str, boolean z, int i) {
        if ((i & 2) != 0) {
            z = false;
        }
        return bsd.a(str, z, 0);
    }

    public final Layout a(CharSequence charSequence, boolean z, int i) {
        Lazy lazy = this.d;
        Layout layout = (Layout) ((tb8) lazy.getValue()).c(charSequence);
        if (layout != null) {
            return layout;
        }
        Lazy lazy2 = this.c;
        Lazy lazy3 = this.b;
        q3d q3d = this.g;
        if (!z) {
            Layout b2 = ((ds7) lazy3.getValue()).a(charSequence, (TextPaint) q3d.getValue(), ((et0) lazy2.getValue()).b() - i, 1, false, TextUtils.TruncateAt.END);
            ((tb8) lazy.getValue()).d(charSequence, b2);
            return b2;
        }
        duc duc = new duc(6);
        Layout i2 = m5a.i(this.a, (ds7) lazy3.getValue(), charSequence, ((et0) lazy2.getValue()).b() - i, (TextPaint) q3d.getValue(), duc);
        ((tb8) lazy.getValue()).d(charSequence, i2);
        return i2;
    }

    public final void c() {
        Lazy lazy = this.d;
        if (lazy.isInitialized()) {
            ((tb8) lazy.getValue()).i(-1);
            this.f.a();
            this.g.a();
        }
    }

    public bsd(Context context, Lazy lazy, Lazy lazy2, Lazy lazy3) {
        this(context, lazy, lazy2, lazy3, tr2.i, 200);
    }
}
