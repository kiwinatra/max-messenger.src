package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.TextUtils;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.TextView;
import java.lang.ref.WeakReference;

/* renamed from: gp  reason: default package */
public final class gp {
    public final TextView a;
    public ci3 b;
    public ci3 c;
    public ci3 d;
    public ci3 e;
    public ci3 f;
    public ci3 g;
    public ci3 h;
    public final np i;
    public int j = 0;
    public int k = -1;
    public Typeface l;
    public boolean m;

    public gp(TextView textView) {
        this.a = textView;
        this.i = new np(textView);
    }

    public static ci3 c(Context context, ho hoVar, int i2) {
        ColorStateList h2;
        synchronized (hoVar) {
            h2 = hoVar.a.h(i2, context);
        }
        if (h2 == null) {
            return null;
        }
        ci3 ci3 = new ci3(2);
        ci3.c = true;
        ci3.d = h2;
        return ci3;
    }

    public static void h(TextView textView, InputConnection inputConnection, EditorInfo editorInfo) {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 < 30 && inputConnection != null) {
            CharSequence text = textView.getText();
            if (i2 >= 30) {
                lx3.c(editorInfo, text);
                return;
            }
            text.getClass();
            if (i2 >= 30) {
                lx3.c(editorInfo, text);
                return;
            }
            int i3 = editorInfo.initialSelStart;
            int i4 = editorInfo.initialSelEnd;
            int i5 = i3 > i4 ? i4 : i3;
            if (i3 <= i4) {
                i3 = i4;
            }
            int length = text.length();
            if (i5 < 0 || i3 > length) {
                iq.Z(editorInfo, (CharSequence) null, 0, 0);
                return;
            }
            int i6 = editorInfo.inputType & 4095;
            if (i6 == 129 || i6 == 225 || i6 == 18) {
                iq.Z(editorInfo, (CharSequence) null, 0, 0);
            } else if (length <= 2048) {
                iq.Z(editorInfo, text, i5, i3);
            } else {
                int i7 = i3 - i5;
                int i8 = i7 > 1024 ? 0 : i7;
                int i9 = 2048 - i8;
                int min = Math.min(text.length() - i3, i9 - Math.min(i5, (int) (((double) i9) * 0.8d)));
                int min2 = Math.min(i5, i9 - min);
                int i10 = i5 - min2;
                if (Character.isLowSurrogate(text.charAt(i10))) {
                    i10++;
                    min2--;
                }
                if (Character.isHighSurrogate(text.charAt((i3 + min) - 1))) {
                    min--;
                }
                int i11 = min2 + i8;
                iq.Z(editorInfo, i8 != i7 ? TextUtils.concat(new CharSequence[]{text.subSequence(i10, i10 + min2), text.subSequence(i3, min + i3)}) : text.subSequence(i10, i11 + min + i10), min2, i11);
            }
        }
    }

    public final void a(Drawable drawable, ci3 ci3) {
        if (drawable != null && ci3 != null) {
            ho.e(drawable, ci3, this.a.getDrawableState());
        }
    }

    public final void b() {
        ci3 ci3 = this.b;
        TextView textView = this.a;
        if (!(ci3 == null && this.c == null && this.d == null && this.e == null)) {
            Drawable[] compoundDrawables = textView.getCompoundDrawables();
            a(compoundDrawables[0], this.b);
            a(compoundDrawables[1], this.c);
            a(compoundDrawables[2], this.d);
            a(compoundDrawables[3], this.e);
        }
        if (this.f != null || this.g != null) {
            Drawable[] compoundDrawablesRelative = textView.getCompoundDrawablesRelative();
            a(compoundDrawablesRelative[0], this.f);
            a(compoundDrawablesRelative[2], this.g);
        }
    }

    public final ColorStateList d() {
        ci3 ci3 = this.h;
        if (ci3 != null) {
            return (ColorStateList) ci3.d;
        }
        return null;
    }

    public final PorterDuff.Mode e() {
        ci3 ci3 = this.h;
        if (ci3 != null) {
            return (PorterDuff.Mode) ci3.e;
        }
        return null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:202:0x03bf  */
    /* JADX WARNING: Removed duplicated region for block: B:204:0x03c7  */
    /* JADX WARNING: Removed duplicated region for block: B:213:0x03f7  */
    /* JADX WARNING: Removed duplicated region for block: B:221:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void f(android.util.AttributeSet r21, int r22) {
        /*
            r20 = this;
            r0 = r20
            r8 = r21
            r9 = r22
            r10 = 17
            android.widget.TextView r12 = r0.a
            android.content.Context r13 = r12.getContext()
            ho r14 = defpackage.ho.a()
            int[] r1 = defpackage.koc.AppCompatTextHelper
            r15 = 0
            g6d r7 = defpackage.g6d.w(r13, r8, r1, r9, r15)
            android.content.Context r2 = r12.getContext()
            int[] r3 = defpackage.koc.AppCompatTextHelper
            java.util.WeakHashMap r1 = defpackage.gag.a
            java.lang.Object r1 = r7.c
            r5 = r1
            android.content.res.TypedArray r5 = (android.content.res.TypedArray) r5
            r16 = 0
            r1 = r12
            r4 = r21
            r6 = r22
            r11 = r7
            r7 = r16
            defpackage.bag.d(r1, r2, r3, r4, r5, r6, r7)
            int r1 = defpackage.koc.AppCompatTextHelper_android_textAppearance
            java.lang.Object r2 = r11.c
            android.content.res.TypedArray r2 = (android.content.res.TypedArray) r2
            r7 = -1
            int r1 = r2.getResourceId(r1, r7)
            int r3 = defpackage.koc.AppCompatTextHelper_android_drawableLeft
            boolean r3 = r2.hasValue(r3)
            if (r3 == 0) goto L_0x0052
            int r3 = defpackage.koc.AppCompatTextHelper_android_drawableLeft
            int r3 = r2.getResourceId(r3, r15)
            ci3 r3 = c(r13, r14, r3)
            r0.b = r3
        L_0x0052:
            int r3 = defpackage.koc.AppCompatTextHelper_android_drawableTop
            boolean r3 = r2.hasValue(r3)
            if (r3 == 0) goto L_0x0066
            int r3 = defpackage.koc.AppCompatTextHelper_android_drawableTop
            int r3 = r2.getResourceId(r3, r15)
            ci3 r3 = c(r13, r14, r3)
            r0.c = r3
        L_0x0066:
            int r3 = defpackage.koc.AppCompatTextHelper_android_drawableRight
            boolean r3 = r2.hasValue(r3)
            if (r3 == 0) goto L_0x007a
            int r3 = defpackage.koc.AppCompatTextHelper_android_drawableRight
            int r3 = r2.getResourceId(r3, r15)
            ci3 r3 = c(r13, r14, r3)
            r0.d = r3
        L_0x007a:
            int r3 = defpackage.koc.AppCompatTextHelper_android_drawableBottom
            boolean r3 = r2.hasValue(r3)
            if (r3 == 0) goto L_0x008e
            int r3 = defpackage.koc.AppCompatTextHelper_android_drawableBottom
            int r3 = r2.getResourceId(r3, r15)
            ci3 r3 = c(r13, r14, r3)
            r0.e = r3
        L_0x008e:
            int r3 = defpackage.koc.AppCompatTextHelper_android_drawableStart
            boolean r3 = r2.hasValue(r3)
            if (r3 == 0) goto L_0x00a2
            int r3 = defpackage.koc.AppCompatTextHelper_android_drawableStart
            int r3 = r2.getResourceId(r3, r15)
            ci3 r3 = c(r13, r14, r3)
            r0.f = r3
        L_0x00a2:
            int r3 = defpackage.koc.AppCompatTextHelper_android_drawableEnd
            boolean r3 = r2.hasValue(r3)
            if (r3 == 0) goto L_0x00b6
            int r3 = defpackage.koc.AppCompatTextHelper_android_drawableEnd
            int r2 = r2.getResourceId(r3, r15)
            ci3 r2 = c(r13, r14, r2)
            r0.g = r2
        L_0x00b6:
            r11.x()
            android.text.method.TransformationMethod r2 = r12.getTransformationMethod()
            boolean r2 = r2 instanceof android.text.method.PasswordTransformationMethod
            if (r1 == r7) goto L_0x0107
            int[] r3 = defpackage.koc.TextAppearance
            g6d r4 = new g6d
            android.content.res.TypedArray r1 = r13.obtainStyledAttributes(r1, r3)
            r4.<init>((int) r10, (java.lang.Object) r13, (java.lang.Object) r1)
            if (r2 != 0) goto L_0x00de
            int r3 = defpackage.koc.TextAppearance_textAllCaps
            boolean r3 = r1.hasValue(r3)
            if (r3 == 0) goto L_0x00de
            int r3 = defpackage.koc.TextAppearance_textAllCaps
            boolean r3 = r1.getBoolean(r3, r15)
            r5 = 1
            goto L_0x00e0
        L_0x00de:
            r3 = r15
            r5 = r3
        L_0x00e0:
            r0.k(r13, r4)
            int r6 = defpackage.koc.TextAppearance_textLocale
            boolean r6 = r1.hasValue(r6)
            if (r6 == 0) goto L_0x00f2
            int r6 = defpackage.koc.TextAppearance_textLocale
            java.lang.String r6 = r1.getString(r6)
            goto L_0x00f3
        L_0x00f2:
            r6 = 0
        L_0x00f3:
            int r11 = defpackage.koc.TextAppearance_fontVariationSettings
            boolean r11 = r1.hasValue(r11)
            if (r11 == 0) goto L_0x0102
            int r11 = defpackage.koc.TextAppearance_fontVariationSettings
            java.lang.String r1 = r1.getString(r11)
            goto L_0x0103
        L_0x0102:
            r1 = 0
        L_0x0103:
            r4.x()
            goto L_0x010b
        L_0x0107:
            r3 = r15
            r5 = r3
            r1 = 0
            r6 = 0
        L_0x010b:
            int[] r4 = defpackage.koc.TextAppearance
            g6d r11 = new g6d
            android.content.res.TypedArray r4 = r13.obtainStyledAttributes(r8, r4, r9, r15)
            r11.<init>((int) r10, (java.lang.Object) r13, (java.lang.Object) r4)
            if (r2 != 0) goto L_0x0127
            int r10 = defpackage.koc.TextAppearance_textAllCaps
            boolean r10 = r4.hasValue(r10)
            if (r10 == 0) goto L_0x0127
            int r3 = defpackage.koc.TextAppearance_textAllCaps
            boolean r3 = r4.getBoolean(r3, r15)
            r5 = 1
        L_0x0127:
            int r10 = defpackage.koc.TextAppearance_textLocale
            boolean r10 = r4.hasValue(r10)
            if (r10 == 0) goto L_0x0135
            int r6 = defpackage.koc.TextAppearance_textLocale
            java.lang.String r6 = r4.getString(r6)
        L_0x0135:
            int r10 = defpackage.koc.TextAppearance_fontVariationSettings
            boolean r10 = r4.hasValue(r10)
            if (r10 == 0) goto L_0x0143
            int r1 = defpackage.koc.TextAppearance_fontVariationSettings
            java.lang.String r1 = r4.getString(r1)
        L_0x0143:
            int r10 = defpackage.koc.TextAppearance_android_textSize
            boolean r10 = r4.hasValue(r10)
            if (r10 == 0) goto L_0x0157
            int r10 = defpackage.koc.TextAppearance_android_textSize
            int r4 = r4.getDimensionPixelSize(r10, r7)
            if (r4 != 0) goto L_0x0157
            r4 = 0
            r12.setTextSize(r15, r4)
        L_0x0157:
            r0.k(r13, r11)
            r11.x()
            if (r2 != 0) goto L_0x0164
            if (r5 == 0) goto L_0x0164
            r12.setAllCaps(r3)
        L_0x0164:
            android.graphics.Typeface r2 = r0.l
            if (r2 == 0) goto L_0x0175
            int r3 = r0.k
            if (r3 != r7) goto L_0x0172
            int r3 = r0.j
            r12.setTypeface(r2, r3)
            goto L_0x0175
        L_0x0172:
            r12.setTypeface(r2)
        L_0x0175:
            if (r1 == 0) goto L_0x017a
            defpackage.ep.d(r12, r1)
        L_0x017a:
            if (r6 == 0) goto L_0x0183
            android.os.LocaleList r1 = defpackage.dp.a(r6)
            defpackage.dp.b(r12, r1)
        L_0x0183:
            int[] r1 = defpackage.koc.AppCompatTextView
            np r10 = r0.i
            android.content.Context r11 = r10.i
            android.content.res.TypedArray r6 = r11.obtainStyledAttributes(r8, r1, r9, r15)
            android.widget.TextView r0 = r10.h
            android.content.Context r1 = r0.getContext()
            int[] r2 = defpackage.koc.AppCompatTextView
            r18 = 0
            r3 = r21
            r4 = r6
            r5 = r22
            r9 = r6
            r6 = r18
            defpackage.bag.d(r0, r1, r2, r3, r4, r5, r6)
            int r0 = defpackage.koc.AppCompatTextView_autoSizeTextType
            boolean r0 = r9.hasValue(r0)
            if (r0 == 0) goto L_0x01b2
            int r0 = defpackage.koc.AppCompatTextView_autoSizeTextType
            int r0 = r9.getInt(r0, r15)
            r10.a = r0
        L_0x01b2:
            int r0 = defpackage.koc.AppCompatTextView_autoSizeStepGranularity
            boolean r0 = r9.hasValue(r0)
            r1 = -1082130432(0xffffffffbf800000, float:-1.0)
            if (r0 == 0) goto L_0x01c3
            int r0 = defpackage.koc.AppCompatTextView_autoSizeStepGranularity
            float r0 = r9.getDimension(r0, r1)
            goto L_0x01c4
        L_0x01c3:
            r0 = r1
        L_0x01c4:
            int r2 = defpackage.koc.AppCompatTextView_autoSizeMinTextSize
            boolean r2 = r9.hasValue(r2)
            if (r2 == 0) goto L_0x01d3
            int r2 = defpackage.koc.AppCompatTextView_autoSizeMinTextSize
            float r2 = r9.getDimension(r2, r1)
            goto L_0x01d4
        L_0x01d3:
            r2 = r1
        L_0x01d4:
            int r3 = defpackage.koc.AppCompatTextView_autoSizeMaxTextSize
            boolean r3 = r9.hasValue(r3)
            if (r3 == 0) goto L_0x01e3
            int r3 = defpackage.koc.AppCompatTextView_autoSizeMaxTextSize
            float r3 = r9.getDimension(r3, r1)
            goto L_0x01e4
        L_0x01e3:
            r3 = r1
        L_0x01e4:
            int r4 = defpackage.koc.AppCompatTextView_autoSizePresetSizes
            boolean r4 = r9.hasValue(r4)
            if (r4 == 0) goto L_0x021d
            int r4 = defpackage.koc.AppCompatTextView_autoSizePresetSizes
            int r4 = r9.getResourceId(r4, r15)
            if (r4 <= 0) goto L_0x021d
            android.content.res.Resources r5 = r9.getResources()
            android.content.res.TypedArray r4 = r5.obtainTypedArray(r4)
            int r5 = r4.length()
            int[] r6 = new int[r5]
            if (r5 <= 0) goto L_0x021a
        L_0x0204:
            if (r15 >= r5) goto L_0x0211
            int r19 = r4.getDimensionPixelSize(r15, r7)
            r6[r15] = r19
            r17 = 1
            int r15 = r15 + 1
            goto L_0x0204
        L_0x0211:
            int[] r5 = defpackage.np.a(r6)
            r10.f = r5
            r10.c()
        L_0x021a:
            r4.recycle()
        L_0x021d:
            r9.recycle()
            boolean r4 = r10.d()
            r5 = 2
            if (r4 == 0) goto L_0x0259
            int r4 = r10.a
            r6 = 1
            if (r4 != r6) goto L_0x025c
            boolean r4 = r10.g
            if (r4 != 0) goto L_0x0255
            android.content.res.Resources r4 = r11.getResources()
            android.util.DisplayMetrics r4 = r4.getDisplayMetrics()
            int r6 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r6 != 0) goto L_0x0242
            r2 = 1094713344(0x41400000, float:12.0)
            float r2 = android.util.TypedValue.applyDimension(r5, r2, r4)
        L_0x0242:
            int r6 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r6 != 0) goto L_0x024c
            r3 = 1121976320(0x42e00000, float:112.0)
            float r3 = android.util.TypedValue.applyDimension(r5, r3, r4)
        L_0x024c:
            int r4 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r4 != 0) goto L_0x0252
            r0 = 1065353216(0x3f800000, float:1.0)
        L_0x0252:
            r10.e(r2, r3, r0)
        L_0x0255:
            r10.b()
            goto L_0x025c
        L_0x0259:
            r0 = 0
            r10.a = r0
        L_0x025c:
            int r0 = r10.a
            if (r0 == 0) goto L_0x0289
            int[] r0 = r10.f
            int r2 = r0.length
            if (r2 <= 0) goto L_0x0289
            int r2 = defpackage.ep.a(r12)
            float r2 = (float) r2
            int r2 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r2 == 0) goto L_0x0285
            float r0 = r10.d
            int r0 = java.lang.Math.round(r0)
            float r2 = r10.e
            int r2 = java.lang.Math.round(r2)
            float r3 = r10.c
            int r3 = java.lang.Math.round(r3)
            r4 = 0
            defpackage.ep.b(r12, r0, r2, r3, r4)
            goto L_0x0289
        L_0x0285:
            r4 = 0
            defpackage.ep.c(r12, r0, r4)
        L_0x0289:
            int[] r0 = defpackage.koc.AppCompatTextView
            android.content.res.TypedArray r0 = r13.obtainStyledAttributes(r8, r0)
            int r2 = defpackage.koc.AppCompatTextView_drawableLeftCompat
            int r2 = r0.getResourceId(r2, r7)
            if (r2 == r7) goto L_0x029c
            android.graphics.drawable.Drawable r2 = r14.b(r13, r2)
            goto L_0x029d
        L_0x029c:
            r2 = 0
        L_0x029d:
            int r3 = defpackage.koc.AppCompatTextView_drawableTopCompat
            int r3 = r0.getResourceId(r3, r7)
            if (r3 == r7) goto L_0x02aa
            android.graphics.drawable.Drawable r3 = r14.b(r13, r3)
            goto L_0x02ab
        L_0x02aa:
            r3 = 0
        L_0x02ab:
            int r4 = defpackage.koc.AppCompatTextView_drawableRightCompat
            int r4 = r0.getResourceId(r4, r7)
            if (r4 == r7) goto L_0x02b8
            android.graphics.drawable.Drawable r4 = r14.b(r13, r4)
            goto L_0x02b9
        L_0x02b8:
            r4 = 0
        L_0x02b9:
            int r6 = defpackage.koc.AppCompatTextView_drawableBottomCompat
            int r6 = r0.getResourceId(r6, r7)
            if (r6 == r7) goto L_0x02c6
            android.graphics.drawable.Drawable r6 = r14.b(r13, r6)
            goto L_0x02c7
        L_0x02c6:
            r6 = 0
        L_0x02c7:
            int r8 = defpackage.koc.AppCompatTextView_drawableStartCompat
            int r8 = r0.getResourceId(r8, r7)
            if (r8 == r7) goto L_0x02d4
            android.graphics.drawable.Drawable r8 = r14.b(r13, r8)
            goto L_0x02d5
        L_0x02d4:
            r8 = 0
        L_0x02d5:
            int r9 = defpackage.koc.AppCompatTextView_drawableEndCompat
            int r9 = r0.getResourceId(r9, r7)
            if (r9 == r7) goto L_0x02e2
            android.graphics.drawable.Drawable r9 = r14.b(r13, r9)
            goto L_0x02e3
        L_0x02e2:
            r9 = 0
        L_0x02e3:
            r10 = 3
            if (r8 != 0) goto L_0x032d
            if (r9 == 0) goto L_0x02e9
            goto L_0x032d
        L_0x02e9:
            if (r2 != 0) goto L_0x02f1
            if (r3 != 0) goto L_0x02f1
            if (r4 != 0) goto L_0x02f1
            if (r6 == 0) goto L_0x034a
        L_0x02f1:
            android.graphics.drawable.Drawable[] r8 = r12.getCompoundDrawablesRelative()
            r9 = 0
            r11 = r8[r9]
            if (r11 != 0) goto L_0x031c
            r14 = r8[r5]
            if (r14 == 0) goto L_0x02ff
            goto L_0x031c
        L_0x02ff:
            android.graphics.drawable.Drawable[] r8 = r12.getCompoundDrawables()
            if (r2 == 0) goto L_0x0306
            goto L_0x0308
        L_0x0306:
            r2 = r8[r9]
        L_0x0308:
            if (r3 == 0) goto L_0x030b
            goto L_0x030e
        L_0x030b:
            r3 = 1
            r3 = r8[r3]
        L_0x030e:
            if (r4 == 0) goto L_0x0311
            goto L_0x0313
        L_0x0311:
            r4 = r8[r5]
        L_0x0313:
            if (r6 == 0) goto L_0x0316
            goto L_0x0318
        L_0x0316:
            r6 = r8[r10]
        L_0x0318:
            r12.setCompoundDrawablesWithIntrinsicBounds(r2, r3, r4, r6)
            goto L_0x034a
        L_0x031c:
            if (r3 == 0) goto L_0x031f
            goto L_0x0322
        L_0x031f:
            r2 = 1
            r3 = r8[r2]
        L_0x0322:
            if (r6 == 0) goto L_0x0325
            goto L_0x0327
        L_0x0325:
            r6 = r8[r10]
        L_0x0327:
            r2 = r8[r5]
            r12.setCompoundDrawablesRelativeWithIntrinsicBounds(r11, r3, r2, r6)
            goto L_0x034a
        L_0x032d:
            android.graphics.drawable.Drawable[] r2 = r12.getCompoundDrawablesRelative()
            if (r8 == 0) goto L_0x0334
            goto L_0x0337
        L_0x0334:
            r4 = 0
            r8 = r2[r4]
        L_0x0337:
            if (r3 == 0) goto L_0x033a
            goto L_0x033d
        L_0x033a:
            r3 = 1
            r3 = r2[r3]
        L_0x033d:
            if (r9 == 0) goto L_0x0340
            goto L_0x0342
        L_0x0340:
            r9 = r2[r5]
        L_0x0342:
            if (r6 == 0) goto L_0x0345
            goto L_0x0347
        L_0x0345:
            r6 = r2[r10]
        L_0x0347:
            r12.setCompoundDrawablesRelativeWithIntrinsicBounds(r8, r3, r9, r6)
        L_0x034a:
            int r2 = defpackage.koc.AppCompatTextView_drawableTint
            boolean r2 = r0.hasValue(r2)
            if (r2 == 0) goto L_0x036f
            int r2 = defpackage.koc.AppCompatTextView_drawableTint
            boolean r3 = r0.hasValue(r2)
            if (r3 == 0) goto L_0x0368
            r3 = 0
            int r3 = r0.getResourceId(r2, r3)
            if (r3 == 0) goto L_0x0368
            android.content.res.ColorStateList r3 = defpackage.q8.j(r3, r13)
            if (r3 == 0) goto L_0x0368
            goto L_0x036c
        L_0x0368:
            android.content.res.ColorStateList r3 = r0.getColorStateList(r2)
        L_0x036c:
            defpackage.tgf.f(r12, r3)
        L_0x036f:
            int r2 = defpackage.koc.AppCompatTextView_drawableTintMode
            boolean r2 = r0.hasValue(r2)
            if (r2 == 0) goto L_0x0385
            int r2 = defpackage.koc.AppCompatTextView_drawableTintMode
            int r2 = r0.getInt(r2, r7)
            r3 = 0
            android.graphics.PorterDuff$Mode r2 = defpackage.yu4.c(r2, r3)
            defpackage.tgf.g(r12, r2)
        L_0x0385:
            int r2 = defpackage.koc.AppCompatTextView_firstBaselineToTopHeight
            int r2 = r0.getDimensionPixelSize(r2, r7)
            int r3 = defpackage.koc.AppCompatTextView_lastBaselineToBottomHeight
            int r3 = r0.getDimensionPixelSize(r3, r7)
            int r4 = defpackage.koc.AppCompatTextView_lineHeight
            boolean r4 = r0.hasValue(r4)
            if (r4 == 0) goto L_0x03b8
            int r4 = defpackage.koc.AppCompatTextView_lineHeight
            android.util.TypedValue r4 = r0.peekValue(r4)
            if (r4 == 0) goto L_0x03af
            int r5 = r4.type
            r6 = 5
            if (r5 != r6) goto L_0x03af
            int r4 = r4.data
            r5 = r4 & 15
            float r4 = android.util.TypedValue.complexToFloat(r4)
            goto L_0x03ba
        L_0x03af:
            int r4 = defpackage.koc.AppCompatTextView_lineHeight
            int r4 = r0.getDimensionPixelSize(r4, r7)
            float r4 = (float) r4
        L_0x03b6:
            r5 = r7
            goto L_0x03ba
        L_0x03b8:
            r4 = r1
            goto L_0x03b6
        L_0x03ba:
            r0.recycle()
            if (r2 == r7) goto L_0x03c5
            defpackage.bs0.p(r2)
            defpackage.ugf.d(r12, r2)
        L_0x03c5:
            if (r3 == r7) goto L_0x03f3
            defpackage.bs0.p(r3)
            android.text.TextPaint r0 = r12.getPaint()
            android.graphics.Paint$FontMetricsInt r0 = r0.getFontMetricsInt()
            boolean r2 = r12.getIncludeFontPadding()
            if (r2 == 0) goto L_0x03db
            int r0 = r0.bottom
            goto L_0x03dd
        L_0x03db:
            int r0 = r0.descent
        L_0x03dd:
            int r2 = java.lang.Math.abs(r0)
            if (r3 <= r2) goto L_0x03f3
            int r3 = r3 - r0
            int r0 = r12.getPaddingLeft()
            int r2 = r12.getPaddingTop()
            int r6 = r12.getPaddingRight()
            r12.setPadding(r0, r2, r6, r3)
        L_0x03f3:
            int r0 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x041b
            if (r5 != r7) goto L_0x03fe
            int r0 = (int) r4
            androidx.core.widget.a.a(r12, r0)
            goto L_0x041b
        L_0x03fe:
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 34
            if (r0 < r1) goto L_0x0408
            defpackage.vgf.a(r12, r5, r4)
            goto L_0x041b
        L_0x0408:
            android.content.res.Resources r0 = r12.getResources()
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()
            float r0 = android.util.TypedValue.applyDimension(r5, r4, r0)
            int r0 = java.lang.Math.round(r0)
            androidx.core.widget.a.a(r12, r0)
        L_0x041b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gp.f(android.util.AttributeSet, int):void");
    }

    public final void g(int i2, Context context) {
        String string;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i2, koc.TextAppearance);
        g6d g6d = new g6d(17, (Object) context, (Object) obtainStyledAttributes);
        boolean hasValue = obtainStyledAttributes.hasValue(koc.TextAppearance_textAllCaps);
        TextView textView = this.a;
        if (hasValue) {
            textView.setAllCaps(obtainStyledAttributes.getBoolean(koc.TextAppearance_textAllCaps, false));
        }
        if (obtainStyledAttributes.hasValue(koc.TextAppearance_android_textSize) && obtainStyledAttributes.getDimensionPixelSize(koc.TextAppearance_android_textSize, -1) == 0) {
            textView.setTextSize(0, c44.DEFAULT_ASPECT_RATIO);
        }
        k(context, g6d);
        if (obtainStyledAttributes.hasValue(koc.TextAppearance_fontVariationSettings) && (string = obtainStyledAttributes.getString(koc.TextAppearance_fontVariationSettings)) != null) {
            ep.d(textView, string);
        }
        g6d.x();
        Typeface typeface = this.l;
        if (typeface != null) {
            textView.setTypeface(typeface, this.j);
        }
    }

    public final void i(ColorStateList colorStateList) {
        if (this.h == null) {
            this.h = new ci3(2);
        }
        ci3 ci3 = this.h;
        ci3.d = colorStateList;
        ci3.c = colorStateList != null;
        this.b = ci3;
        this.c = ci3;
        this.d = ci3;
        this.e = ci3;
        this.f = ci3;
        this.g = ci3;
    }

    public final void j(PorterDuff.Mode mode) {
        if (this.h == null) {
            this.h = new ci3(2);
        }
        ci3 ci3 = this.h;
        ci3.e = mode;
        ci3.b = mode != null;
        this.b = ci3;
        this.c = ci3;
        this.d = ci3;
        this.e = ci3;
        this.f = ci3;
        this.g = ci3;
    }

    public final void k(Context context, g6d g6d) {
        String string;
        int i2 = koc.TextAppearance_android_textStyle;
        int i3 = this.j;
        TypedArray typedArray = (TypedArray) g6d.c;
        this.j = typedArray.getInt(i2, i3);
        int i4 = typedArray.getInt(koc.TextAppearance_android_textFontWeight, -1);
        this.k = i4;
        if (i4 != -1) {
            this.j &= 2;
        }
        boolean z = true;
        if (typedArray.hasValue(koc.TextAppearance_android_fontFamily) || typedArray.hasValue(koc.TextAppearance_fontFamily)) {
            this.l = null;
            int i5 = typedArray.hasValue(koc.TextAppearance_fontFamily) ? koc.TextAppearance_fontFamily : koc.TextAppearance_android_fontFamily;
            int i6 = this.k;
            int i7 = this.j;
            if (!context.isRestricted()) {
                try {
                    Typeface s = g6d.s(i5, this.j, new bp(this, i6, i7, new WeakReference(this.a)));
                    if (s != null) {
                        if (this.k != -1) {
                            this.l = fp.a(Typeface.create(s, 0), this.k, (this.j & 2) != 0);
                        } else {
                            this.l = s;
                        }
                    }
                    this.m = this.l == null;
                } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
                }
            }
            if (this.l == null && (string = typedArray.getString(i5)) != null) {
                if (this.k != -1) {
                    Typeface create = Typeface.create(string, 0);
                    int i8 = this.k;
                    if ((this.j & 2) == 0) {
                        z = false;
                    }
                    this.l = fp.a(create, i8, z);
                    return;
                }
                this.l = Typeface.create(string, this.j);
            }
        } else if (typedArray.hasValue(koc.TextAppearance_android_typeface)) {
            this.m = false;
            int i9 = typedArray.getInt(koc.TextAppearance_android_typeface, 1);
            if (i9 == 1) {
                this.l = Typeface.SANS_SERIF;
            } else if (i9 == 2) {
                this.l = Typeface.SERIF;
            } else if (i9 == 3) {
                this.l = Typeface.MONOSPACE;
            }
        }
    }
}
