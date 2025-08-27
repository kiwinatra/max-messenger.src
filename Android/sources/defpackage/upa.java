package defpackage;

import android.content.Context;
import android.util.TypedValue;
import kotlin.Lazy;
import kotlin.LazyKt;

/* renamed from: upa  reason: default package */
public final class upa implements et0 {
    public final Context a;
    public final Lazy b;
    public final Lazy c = LazyKt.lazy(new tpa(this, 0));
    public final q3d d = new q3d(new tpa(this, 1));

    public upa(xe3 xe3, Context context, Lazy lazy) {
        this.a = context;
        this.b = lazy;
        xe3.a(xe3.c | xe3.d, new nj9(1, this));
    }

    public final float a(boolean z) {
        return TypedValue.applyDimension(2, ((Number) ((bvf) this.c.getValue()).a.getValue()).floatValue(), vo4.c().getDisplayMetrics()) + so4.c(tr2.e.g((uy4) ((rta) this.b.getValue()).a.getValue()), this.a);
    }

    public final int b() {
        return this.a.getResources().getConfiguration().orientation == 1 ? d() : d();
    }

    public final int c() {
        return fu4.k.e(this.a).f().a().a(true).b.b;
    }

    public final int d() {
        return a81.f((float) 10, vo4.c().getDisplayMetrics().density, 2, g());
    }

    public final int e() {
        return d();
    }

    public final int f(boolean z) {
        return fu4.k.e(this.a).f().a().a(z).b.d;
    }

    public final int g() {
        return ((Number) this.d.getValue()).intValue();
    }
}
