package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.SpannedString;
import android.text.TextPaint;
import android.text.TextUtils;
import androidx.work.WorkRequest;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.math.MathKt;
import kotlin.ranges.RangesKt;

/* renamed from: z89  reason: default package */
public final class z89 {
    public final Lazy A;
    public final Lazy B;
    public final Lazy C;
    public final Context a;
    public final String b = z89.class.getName();
    public final Lazy c;
    public final Lazy d;
    public final Lazy e;
    public final Lazy f;
    public final Lazy g;
    public final q3d h;
    public final Lazy i;
    public final Lazy j;
    public final Lazy k;
    public final Lazy l;
    public final Lazy m;
    public final Lazy n;
    public final Lazy o;
    public final Lazy p;
    public final Lazy q;
    public final Lazy r;
    public final Lazy s;
    public final Lazy t;
    public final Lazy u;
    public final Lazy v;
    public final Lazy w;
    public final Lazy x;
    public final Lazy y;
    public final Lazy z;

    public z89(Context context, Lazy lazy, Lazy lazy2, Lazy lazy3, Lazy lazy4, Lazy lazy5) {
        this.a = context;
        this.c = lazy;
        this.d = lazy2;
        this.e = lazy3;
        this.f = lazy4;
        this.g = lazy5;
        this.h = new q3d(new w89(this, 0));
        this.i = LazyKt.lazy(new w89(this, 2));
        this.j = LazyKt.lazy(new w89(this, 5));
        this.k = LazyKt.lazy(new w89(this, 6));
        this.l = LazyKt.lazy(new w89(this, 7));
        this.m = LazyKt.lazy(new w89(this, 8));
        this.n = LazyKt.lazy(new w89(this, 9));
        this.o = LazyKt.lazy(new w89(this, 10));
        this.p = LazyKt.lazy(new w89(this, 12));
        this.q = LazyKt.lazy(new w89(this, 13));
        this.r = LazyKt.lazy(new w89(this, 11));
        this.s = LazyKt.lazy(new w89(this, 14));
        this.t = LazyKt.lazy(new w89(this, 15));
        this.u = LazyKt.lazy(new w89(this, 16));
        this.v = LazyKt.lazy(new w89(this, 17));
        this.w = LazyKt.lazy(new w89(this, 18));
        this.x = LazyKt.lazy(new w89(this, 19));
        this.y = LazyKt.lazy(new w89(this, 20));
        this.z = LazyKt.lazy(new w89(this, 21));
        this.A = LazyKt.lazy(new w89(this, 1));
        this.B = LazyKt.lazy(new w89(this, 3));
        this.C = LazyKt.lazy(new w89(this, 4));
    }

    public final Layout a(xz xzVar) {
        d();
        return e().a(tr1.j((String) this.s.getValue(), ":"), (TextPaint) this.k.getValue(), b(xzVar, 0), 1, false, TextUtils.TruncateAt.END);
    }

    public final int b(xz xzVar, int i2) {
        int b2;
        o00 o00 = xzVar.d;
        if (o00 instanceof toe) {
            b2 = MathKt.roundToInt(((float) ((toe) o00).a.x) * vo4.c().getDisplayMetrics().density) - (MathKt.roundToInt(((float) 10) * vo4.c().getDisplayMetrics().density) * 2);
        } else {
            boolean z2 = o00 instanceof l50;
            Lazy lazy = this.e;
            if (z2) {
                int g2 = ((et0) lazy.getValue()).g();
                float f2 = (float) 192;
                return (((int) ((((float) a81.e(f2, vo4.c().getDisplayMetrics().density, g2)) * (((float) (RangesKt.coerceIn(((l50) o00).j, 1000, (long) WorkRequest.DEFAULT_BACKOFF_DELAY_MILLIS) - 1000)) / ((float) 29000))) + ((float) MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f2)))) - (MathKt.roundToInt(((float) 10) * vo4.c().getDisplayMetrics().density) * 2)) - i2;
            }
            b2 = ((et0) lazy.getValue()).b();
        }
        return b2 - i2;
    }

    public final Layout c(Drawable drawable, String str, xz xzVar) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        j4b.b(spannableStringBuilder, "​", new y89(drawable));
        j4b.b(spannableStringBuilder, "​", new bge(MathKt.roundToInt(((float) 2) * vo4.c().getDisplayMetrics().density)));
        spannableStringBuilder.append(str);
        SpannedString spannedString = new SpannedString(spannableStringBuilder);
        d();
        return e().a(spannedString, (TextPaint) this.j.getValue(), b(xzVar, MathKt.roundToInt(((float) 8) * vo4.c().getDisplayMetrics().density)), 1, false, TextUtils.TruncateAt.END);
    }

    public final void d() {
        q3d q3d = this.h;
        if (q3d.getValue() != ((rta) this.g.getValue()).a.getValue()) {
            q3d.a();
            boolean isInitialized = this.i.isInitialized();
            Context context = this.a;
            if (isInitialized) {
                tr2.j.a(f(), context.getResources().getDisplayMetrics(), (uy4) q3d.getValue());
            }
            Lazy lazy = this.j;
            if (lazy.isInitialized()) {
                tr2.f.a((TextPaint) lazy.getValue(), context.getResources().getDisplayMetrics(), (uy4) q3d.getValue());
            }
            Lazy lazy2 = this.k;
            if (lazy2.isInitialized()) {
                tr2.g.a((TextPaint) lazy2.getValue(), context.getResources().getDisplayMetrics(), (uy4) q3d.getValue());
            }
            Lazy lazy3 = this.l;
            if (lazy3.isInitialized()) {
                tr2.c.a((TextPaint) lazy3.getValue(), context.getResources().getDisplayMetrics(), (uy4) q3d.getValue());
            }
            Lazy lazy4 = this.m;
            if (lazy4.isInitialized()) {
                tr2.i.a((TextPaint) lazy4.getValue(), context.getResources().getDisplayMetrics(), (uy4) q3d.getValue());
            }
        }
    }

    public final ds7 e() {
        return (ds7) this.d.getValue();
    }

    public final TextPaint f() {
        return (TextPaint) this.i.getValue();
    }
}
