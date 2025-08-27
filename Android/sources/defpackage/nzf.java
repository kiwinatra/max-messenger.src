package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.math.MathKt;
import kotlin.ranges.RangesKt;

/* renamed from: nzf  reason: default package */
public final class nzf extends Drawable {
    public final mv4 a;
    public final w4d b;
    public Function1 c;
    public final j5 d;
    public qa7 e;
    public qa7 f;
    public final int g;
    public String h;

    public nzf(Context context) {
        tp6 tp6 = new tp6(context.getResources());
        tp6.b = 0;
        mv4 mv4 = new mv4(tp6.a());
        z7d e2 = mv4.e();
        if (e2 != null) {
            e2.setCallback(new xf(4, this));
        }
        this.a = mv4;
        this.b = new w4d();
        this.d = new j5(5, this);
        this.g = MathKt.roundToInt(((float) 32) * vo4.c().getDisplayMetrics().density);
        d();
    }

    public static qa7 b(qa7 qa7, int i, int i2) {
        ra7 b2 = ra7.b(qa7);
        b2.d = (i <= 0 || i2 <= 0) ? null : new v3d(c44.DEFAULT_ASPECT_RATIO, i, i2, 12);
        return b2.a();
    }

    public final void a(qa7 qa7, qa7 qa72) {
        int i;
        r2f r2f;
        mv4 mv4 = this.a;
        if (qa7 == null) {
            mv4.i((gv4) null);
            return;
        }
        boolean isEmpty = getBounds().isEmpty();
        int i2 = this.g;
        if (isEmpty) {
            i = i2;
        } else if (getBounds().width() < getBounds().height()) {
            i2 = RangesKt.coerceAtLeast(getBounds().width(), i2);
            i = MathKt.roundToInt((((float) i2) / ((float) getBounds().width())) * ((float) getBounds().height()));
        } else {
            int coerceAtLeast = RangesKt.coerceAtLeast(getBounds().height(), i2);
            int i3 = coerceAtLeast;
            i2 = MathKt.roundToInt((((float) coerceAtLeast) / ((float) getBounds().height())) * ((float) getBounds().width()));
            i = i3;
        }
        if (qa72 != null) {
            ba7 B = ld9.B();
            qa7 b2 = b(qa7, i2, i);
            B.getClass();
            aa7 aa7 = new aa7(B, b2, (Object) null);
            ba7 B2 = ld9.B();
            qa7 b3 = b(qa72, i2, i);
            B2.getClass();
            r2f = new se7(CollectionsKt.listOf(aa7, new aa7(B2, b3, (Object) null)), false);
        } else {
            ba7 B3 = ld9.B();
            qa7 b4 = b(qa7, i2, i);
            B3.getClass();
            r2f = new aa7(B3, b4, (Object) null);
        }
        this.b.a(r2f);
        if (mv4.v == null) {
            d();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x000e, code lost:
        r3 = defpackage.o54.e(r3);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void c(android.net.Uri r2, java.lang.String r3) {
        /*
            r1 = this;
            java.lang.String r0 = r1.h
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r0, (java.lang.Object) r3)
            if (r0 == 0) goto L_0x0009
            return
        L_0x0009:
            r1.h = r3
            r0 = 0
            if (r3 == 0) goto L_0x001d
            android.net.Uri r3 = defpackage.o54.e(r3)
            if (r3 == 0) goto L_0x001d
            ra7 r3 = defpackage.ra7.d(r3)
            qa7 r3 = r3.a()
            goto L_0x001e
        L_0x001d:
            r3 = r0
        L_0x001e:
            r1.e = r3
            if (r2 == 0) goto L_0x002a
            ra7 r2 = defpackage.ra7.d(r2)
            qa7 r0 = r2.a()
        L_0x002a:
            r1.f = r0
            qa7 r2 = r1.e
            mv4 r3 = r1.a
            if (r2 != 0) goto L_0x0039
            if (r0 == 0) goto L_0x0035
            goto L_0x0039
        L_0x0035:
            r3.h()
            goto L_0x003c
        L_0x0039:
            r3.g()
        L_0x003c:
            qa7 r2 = r1.e
            qa7 r3 = r1.f
            r1.a(r2, r3)
            r1.invalidateSelf()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nzf.c(android.net.Uri, java.lang.String):void");
    }

    public final void d() {
        knb a2 = ld9.p.get();
        a2.g = this.b;
        a2.h = this.d;
        mv4 mv4 = this.a;
        a2.l = mv4.v;
        a2.k = true;
        mv4.i(a2.a());
    }

    public final void draw(Canvas canvas) {
        z7d e2 = this.a.e();
        if (e2 != null) {
            e2.draw(canvas);
        }
    }

    public final int getOpacity() {
        z7d e2 = this.a.e();
        if (e2 != null) {
            return e2.getOpacity();
        }
        return -3;
    }

    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        z7d e2 = this.a.e();
        if (e2 != null) {
            e2.setBounds(0, 0, rect.width(), rect.height());
        }
        a(this.e, this.f);
        invalidateSelf();
    }

    public final void setAlpha(int i) {
        z7d e2 = this.a.e();
        if (e2 != null) {
            e2.setAlpha(i);
        }
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        z7d e2 = this.a.e();
        if (e2 != null) {
            e2.setColorFilter(colorFilter);
        }
    }

    public nzf(Context context, Uri uri, String str) {
        this(context);
        c(uri, str);
    }
}
