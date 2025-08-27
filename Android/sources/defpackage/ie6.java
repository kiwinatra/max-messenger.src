package defpackage;

import android.net.Uri;
import android.text.TextUtils;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;

/* renamed from: ie6  reason: default package */
public final class ie6 implements fe6 {
    public ce6 a = ce6.d;
    public final String b = ie6.class.getName();
    public final Lazy c;
    public final Lazy d;
    public final Lazy e;
    public final Lazy f;
    public final int g;
    public final int h;
    public final int[] i;
    public y38 j;
    public x0d k;

    public ie6(Lazy lazy, Lazy lazy2, Lazy lazy3) {
        ce6 ce6 = ce6.d;
        this.c = lazy2;
        this.d = lazy3;
        this.e = lazy;
        this.f = LazyKt.lazy(new u75(11, this));
        this.g = MathKt.roundToInt(((float) 120) * vo4.c().getDisplayMetrics().density);
        this.h = MathKt.roundToInt(((float) 146) * vo4.c().getDisplayMetrics().density);
        this.i = new int[2];
    }

    public final ce6 h() {
        return this.a;
    }

    public final boolean i() {
        g4g g4g = this.a.a;
        if (g4g == null) {
            z68.f(this.b, "You should call init before prepare!", (Throwable) null);
            return false;
        }
        Uri h2 = g4g.h();
        int i2 = v0g.a;
        String scheme = h2.getScheme();
        if (TextUtils.isEmpty(scheme) || "file".equals(scheme)) {
            y38 y38 = this.j;
            if (y38 == null || !y38.i()) {
                return false;
            }
        } else {
            x0d x0d = this.k;
            if (x0d == null || !x0d.i()) {
                return false;
            }
        }
        return true;
    }

    public final Object j(long j2, Continuation continuation) {
        g4g g4g = this.a.a;
        if (g4g == null) {
            z68.f(this.b, "You should call setVideoContent before extractFrame!", (Throwable) null);
            return null;
        }
        Uri h2 = g4g.h();
        int i2 = v0g.a;
        String scheme = h2.getScheme();
        if (TextUtils.isEmpty(scheme) || "file".equals(scheme)) {
            y38 y38 = this.j;
            if (y38 != null) {
                return y38.j(j2, continuation);
            }
        } else {
            x0d x0d = this.k;
            if (x0d != null) {
                return x0d.j(j2, continuation);
            }
        }
        return null;
    }

    public final void k(ce6 ce6) {
        g4g g4g;
        if (!Intrinsics.areEqual((Object) ce6, (Object) this.a) && (g4g = ce6.a) != null) {
            if (ce6.b == 0 || ce6.c == 0) {
                int width = g4g.getWidth();
                int height = g4g.getHeight();
                int[] iArr = this.i;
                int i2 = this.g;
                if (width <= 0 || height <= 0) {
                    iArr[0] = i2;
                    iArr[1] = i2;
                    Unit unit = Unit.INSTANCE;
                } else if (width < height) {
                    ryg.p(i2, i2, width, height, iArr);
                } else {
                    int i3 = this.h;
                    ryg.p(i3, i3, width, height, iArr);
                }
                this.a = new ce6(g4g, iArr[0], iArr[1]);
            } else {
                this.a = ce6;
            }
            Uri h2 = g4g.h();
            int i4 = v0g.a;
            String scheme = h2.getScheme();
            if (TextUtils.isEmpty(scheme) || "file".equals(scheme)) {
                if (this.j == null) {
                    this.j = new y38((gaf) this.d.getValue(), (ccb) this.c.getValue());
                }
                y38 y38 = this.j;
                if (y38 != null) {
                    y38.a = this.a;
                    return;
                }
                return;
            }
            if (this.k == null) {
                this.k = new x0d((ba7) this.f.getValue());
            }
            x0d x0d = this.k;
            if (x0d != null) {
                x0d.c = this.a;
            }
        }
    }

    public final void prepare() {
        g4g g4g = this.a.a;
        String str = this.b;
        if (g4g == null) {
            z68.f(str, "You should call init before prepare!", (Throwable) null);
        } else if (!i()) {
            z68.p(str, "Can't extract video frame");
        } else {
            Uri h2 = g4g.h();
            int i2 = v0g.a;
            String scheme = h2.getScheme();
            if (TextUtils.isEmpty(scheme) || "file".equals(scheme)) {
                y38 y38 = this.j;
                if (y38 != null) {
                    y38.prepare();
                    return;
                }
                return;
            }
            x0d x0d = this.k;
            if (x0d != null) {
                x0d.prepare();
            }
        }
    }
}
