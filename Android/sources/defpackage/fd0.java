package defpackage;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import kotlin.Lazy;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;

/* renamed from: fd0  reason: default package */
public final class fd0 extends Drawable implements phf {
    public static final /* synthetic */ KProperty[] X = {rae.s(fd0.class, "isGradientEnabled", "isGradientEnabled$common_release()Z", 0)};
    public static final int[][] Y = bs0.h;
    public final joa a;
    public final int[] b;
    public final Lazy c;
    public final Lazy o;
    public final Rect v = new Rect();
    public final char[] w;
    public final Lazy x;
    public final Drawable y;
    public final ed0 z;

    /* JADX WARNING: Removed duplicated region for block: B:29:0x00bc  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public fd0(defpackage.joa r7, defpackage.gd0 r8, defpackage.k2b r9) {
        /*
            r6 = this;
            r0 = 1
            r1 = 0
            r6.<init>()
            r6.a = r7
            long r2 = r8.a
            int[][] r7 = Y
            int r4 = r7.length
            long r4 = (long) r4
            long r2 = r2 % r4
            long r2 = java.lang.Math.abs(r2)
            int r2 = (int) r2
            r7 = r7[r2]
            r6.b = r7
            dd0 r7 = new dd0
            r7.<init>(r9, r1)
            kotlin.LazyThreadSafetyMode r2 = kotlin.LazyThreadSafetyMode.NONE
            kotlin.Lazy r7 = kotlin.LazyKt.lazy((kotlin.LazyThreadSafetyMode) r2, r7)
            r6.c = r7
            dd0 r7 = new dd0
            r7.<init>(r9, r0)
            kotlin.Lazy r7 = kotlin.LazyKt.lazy((kotlin.LazyThreadSafetyMode) r2, r7)
            r6.o = r7
            android.graphics.Rect r7 = new android.graphics.Rect
            r7.<init>()
            r6.v = r7
            r7 = 2
            char[] r7 = new char[r7]
            r7[r1] = r1
            r7[r0] = r1
            java.lang.CharSequence r8 = r8.b
            int r3 = r8.length()
            r4 = 0
            if (r3 != 0) goto L_0x0047
            goto L_0x0076
        L_0x0047:
            java.lang.Character r3 = kotlin.text.StringsKt.getOrNull(r8, r1)
            if (r3 == 0) goto L_0x005a
            char r3 = r3.charValue()
            char r3 = java.lang.Character.toUpperCase(r3)
            java.lang.Character r3 = java.lang.Character.valueOf(r3)
            goto L_0x005b
        L_0x005a:
            r3 = r4
        L_0x005b:
            java.lang.Character r5 = kotlin.text.StringsKt.getOrNull(r8, r0)
            if (r5 == 0) goto L_0x006a
            char r5 = r5.charValue()
            char r5 = java.lang.Character.toUpperCase(r5)
            goto L_0x006b
        L_0x006a:
            r5 = r1
        L_0x006b:
            if (r3 != 0) goto L_0x006e
            goto L_0x0076
        L_0x006e:
            char r3 = r3.charValue()
            r7[r1] = r3
            r7[r0] = r5
        L_0x0076:
            r6.w = r7
            m r7 = new m
            r0 = 14
            r7.<init>(r0)
            kotlin.Lazy r7 = kotlin.LazyKt.lazy((kotlin.LazyThreadSafetyMode) r2, r7)
            r6.x = r7
            kotlin.properties.Delegates r7 = kotlin.properties.Delegates.INSTANCE
            ed0 r7 = new ed0
            r7.<init>((defpackage.fd0) r6, (defpackage.k2b) r9)
            r6.z = r7
            int r7 = r8.length()
            boolean r9 = r8 instanceof android.text.Spanned     // Catch:{ all -> 0x00a3 }
            if (r9 == 0) goto L_0x0099
            android.text.Spanned r8 = (android.text.Spanned) r8     // Catch:{ all -> 0x00a3 }
            goto L_0x009a
        L_0x0099:
            r8 = r4
        L_0x009a:
            if (r8 == 0) goto L_0x00a3
            java.lang.Class<dge> r9 = defpackage.dge.class
            java.lang.Object[] r7 = r8.getSpans(r1, r7, r9)     // Catch:{ all -> 0x00a3 }
            goto L_0x00a4
        L_0x00a3:
            r7 = r4
        L_0x00a4:
            dge[] r7 = (defpackage.dge[]) r7
            if (r7 == 0) goto L_0x00b4
            java.lang.Object r7 = kotlin.collections.ArraysKt.firstOrNull((T[]) r7)
            dge r7 = (defpackage.dge) r7
            if (r7 == 0) goto L_0x00b4
            android.graphics.drawable.Drawable r4 = r7.a()
        L_0x00b4:
            r6.y = r4
            joa r7 = r6.a
            boolean r7 = r7 instanceof defpackage.ioa
            if (r7 == 0) goto L_0x00cb
            kotlin.Lazy r7 = r6.x
            java.lang.Object r7 = r7.getValue()
            android.graphics.Path r7 = (android.graphics.Path) r7
            android.graphics.Rect r8 = r6.getBounds()
            defpackage.t4e.a(r7, r8)
        L_0x00cb:
            r6.c()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fd0.<init>(joa, gd0, k2b):void");
    }

    public final Paint a() {
        return (Paint) this.c.getValue();
    }

    public final Paint b() {
        return (Paint) this.o.getValue();
    }

    public final void c() {
        LinearGradient linearGradient;
        Paint a2 = a();
        if (((Boolean) this.z.getValue(this, X[0])).booleanValue()) {
            linearGradient = new LinearGradient((float) getBounds().left, (float) getBounds().top, (float) getBounds().right, (float) getBounds().bottom, this.b, (float[]) null, Shader.TileMode.CLAMP);
        } else {
            linearGradient = null;
        }
        a2.setShader(linearGradient);
    }

    public final void draw(Canvas canvas) {
        joa joa = this.a;
        if (joa instanceof goa) {
            canvas.drawCircle(getBounds().exactCenterX(), getBounds().exactCenterY(), ((float) getBounds().width()) / 2.0f, a());
        } else if (joa instanceof ioa) {
            canvas.drawPath((Path) this.x.getValue(), a());
        } else if (!Intrinsics.areEqual((Object) joa, (Object) hoa.a)) {
            throw new NoWhenBranchMatchedException();
        }
        b().setTextSize(((float) getBounds().height()) * 0.33f);
        Paint b2 = b();
        char[] cArr = this.w;
        int length = cArr.length;
        Rect rect = this.v;
        b2.getTextBounds(cArr, 0, length, rect);
        float exactCenterX = getBounds().exactCenterX() - rect.exactCenterX();
        float exactCenterY = getBounds().exactCenterY() - rect.exactCenterY();
        Drawable drawable = this.y;
        if (drawable != null) {
            int i = b().getFontMetricsInt().descent - b().getFontMetricsInt().ascent;
            drawable.setBounds(0, 0, i, i);
            float exactCenterX2 = getBounds().exactCenterX() - ((float) (drawable.getBounds().width() / 2));
            float exactCenterY2 = getBounds().exactCenterY() - ((float) (drawable.getBounds().height() / 2));
            int save = canvas.save();
            canvas.translate(exactCenterX2, exactCenterY2);
            try {
                drawable.draw(canvas);
            } finally {
                canvas.restoreToCount(save);
            }
        } else {
            canvas.drawText(cArr, 0, cArr.length, exactCenterX, exactCenterY, b());
        }
    }

    public final int getOpacity() {
        return -3;
    }

    public final void onBoundsChange(Rect rect) {
        if (this.a instanceof ioa) {
            t4e.a((Path) this.x.getValue(), rect);
        }
        c();
        invalidateSelf();
    }

    public final void onThemeChanged(k2b k2b) {
        if (!((Boolean) this.z.getValue(this, X[0])).booleanValue()) {
            b().setColor(k2b.getText().e);
            a().setColor(k2b.c().j);
            invalidateSelf();
        }
    }

    public final void setAlpha(int i) {
        a().setAlpha(i);
        invalidateSelf();
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        a().setColorFilter(colorFilter);
        invalidateSelf();
    }
}
