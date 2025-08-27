package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;
import kotlin.ranges.RangesKt;

/* renamed from: eoa  reason: default package */
public final class eoa extends Drawable {
    public final Context a;
    public final joa b;
    public final String c;
    public final mv4 d;
    public koa e;
    public final w4d f;
    public final j5 g;
    public String h;
    public qa7 i;
    public final int j;

    public /* synthetic */ eoa(Context context) {
        this(context, goa.a);
    }

    public final void a(qa7 qa7) {
        int i2;
        mv4 mv4 = this.d;
        if (qa7 == null) {
            mv4.i((gv4) null);
        } else {
            boolean isEmpty = getBounds().isEmpty();
            int i3 = this.j;
            if (isEmpty) {
                i2 = i3;
            } else if (getBounds().width() < getBounds().height()) {
                i3 = RangesKt.coerceAtLeast(getBounds().width(), i3);
                i2 = MathKt.roundToInt((((float) i3) / ((float) getBounds().width())) * ((float) getBounds().height()));
            } else {
                int coerceAtLeast = RangesKt.coerceAtLeast(getBounds().height(), i3);
                int i4 = coerceAtLeast;
                i3 = MathKt.roundToInt((((float) coerceAtLeast) / ((float) getBounds().height())) * ((float) getBounds().width()));
                i2 = i4;
            }
            hd0 hd0 = foa.a;
            v3d v3d = (i3 <= 0 || i2 <= 0) ? null : new v3d(c44.DEFAULT_ASPECT_RATIO, i3, i2, 12);
            joa joa = this.b;
            ra7 d2 = ra7.d(qa7.b);
            d2.g = oa7.b;
            d2.l = foa.a(joa);
            if (v3d != null) {
                d2.d = v3d;
            }
            d2.k = uub.o;
            qa7 a2 = d2.a();
            ba7 B = ld9.B();
            B.getClass();
            aa7 aa7 = new aa7(B, a2, (Object) null);
            w4d w4d = this.f;
            w4d.a(aa7);
            if (mv4.v == null) {
                knb a3 = ld9.p.get();
                a3.g = w4d;
                a3.h = this.g;
                a3.l = mv4.v;
                a3.k = true;
                mv4.i(a3.a());
            }
        }
        invalidateSelf();
    }

    public final void b(gd0 gd0) {
        mv4 mv4 = this.d;
        if (gd0 != null && (gd0.a != 0 || gd0.b.length() != 0)) {
            fd0 fd0 = new fd0(this.b, gd0, fu4.k.e(this.a).f());
            lv4 lv4 = mv4.o;
            lv4.getClass();
            ((sp6) lv4).i(fd0, 1);
            this.e = koa.c;
        } else if (this.e == koa.c) {
            lv4 lv42 = mv4.o;
            lv42.getClass();
            ((sp6) lv42).i((Drawable) null, 1);
            this.e = koa.a;
        }
        invalidateSelf();
    }

    public final void c(String str) {
        qa7 qa7;
        if (!Intrinsics.areEqual((Object) this.h, (Object) str)) {
            this.h = str;
            if (str == null || str.length() == 0) {
                qa7 = null;
            } else {
                hd0 hd0 = foa.a;
                qa7 = foa.b(str, this.b, 4);
            }
            this.i = qa7;
            mv4 mv4 = this.d;
            if (qa7 != null) {
                mv4.g();
            } else {
                mv4.h();
            }
            a(this.i);
            invalidateSelf();
        }
    }

    public final void draw(Canvas canvas) {
        z7d e2 = this.d.e();
        if (e2 != null) {
            Drawable.Callback callback = e2.getCallback();
            e2.setCallback((Drawable.Callback) null);
            e2.draw(canvas);
            e2.setCallback(callback);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eoa)) {
            return false;
        }
        eoa eoa = (eoa) obj;
        return Intrinsics.areEqual((Object) this.b, (Object) eoa.b) && Intrinsics.areEqual((Object) this.h, (Object) eoa.h);
    }

    public final int getAlpha() {
        z7d e2 = this.d.e();
        return e2 != null ? e2.getAlpha() : super.getAlpha();
    }

    public final int getIntrinsicHeight() {
        this.d.getClass();
        return -1;
    }

    public final int getIntrinsicWidth() {
        this.d.getClass();
        return -1;
    }

    public final int getOpacity() {
        return -3;
    }

    public final int hashCode() {
        int hashCode = this.b.hashCode() * 31;
        String str = this.h;
        return hashCode + (str != null ? str.hashCode() : 0);
    }

    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        z7d e2 = this.d.e();
        if (e2 != null) {
            Drawable.Callback callback = e2.getCallback();
            e2.setCallback((Drawable.Callback) null);
            e2.setBounds(0, 0, rect.width(), rect.height());
            e2.setCallback(callback);
        }
        a(this.i);
    }

    public final void setAlpha(int i2) {
        z7d e2 = this.d.e();
        if (e2 != null) {
            e2.setAlpha(i2);
        }
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        z7d e2 = this.d.e();
        if (e2 != null) {
            e2.setColorFilter(colorFilter);
        }
    }

    public eoa(Context context, joa joa) {
        this.a = context;
        this.b = joa;
        this.c = eoa.class.getName();
        tp6 tp6 = new tp6(context.getResources());
        tp6.b = 0;
        mv4 mv4 = new mv4(tp6.a());
        z7d e2 = mv4.e();
        if (e2 != null) {
            e2.setCallback(new xf(2, this));
        }
        this.d = mv4;
        this.e = koa.a;
        w4d w4d = new w4d();
        this.f = w4d;
        j5 j5Var = new j5(1, this);
        this.g = j5Var;
        this.j = MathKt.roundToInt(((float) 32) * vo4.c().getDisplayMetrics().density);
        knb a2 = ld9.p.get();
        a2.g = w4d;
        a2.h = j5Var;
        a2.l = mv4.v;
        a2.k = true;
        mv4.i(a2.a());
    }
}
