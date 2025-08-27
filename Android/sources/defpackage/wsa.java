package defpackage;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.GradientDrawable;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.style.ReplacementSpan;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.Interpolator;
import java.text.DecimalFormat;
import java.util.NoSuchElementException;
import kotlin.KotlinVersion;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;
import kotlin.properties.Delegates;
import kotlin.reflect.KProperty;
import kotlin.text.StringsKt;

/* renamed from: wsa  reason: default package */
public final class wsa extends View implements phf, x86 {
    public static final /* synthetic */ KProperty[] M0;
    public final GradientDrawable A0;
    public boolean B0;
    public final vsa C0;
    public final vsa D0;
    public final TextPaint E0;
    public final vsa F0;
    public final vsa G0;
    public final vsa H0;
    public long I0;
    public Interpolator J0;
    public int K0;
    public tsa L0;
    public boolean a;
    public int b = -1;
    public psa c = psa.o;
    public ValueAnimator o;
    public float v = 1.0f;
    public int v0;
    public StaticLayout w;
    public int w0;
    public StaticLayout x;
    public final int x0;
    public StaticLayout y;
    public final int y0;
    public StaticLayout z;
    public final int z0;

    static {
        Class<wsa> cls = wsa.class;
        M0 = new KProperty[]{rae.s(cls, "textFont", "getTextFont()Lone/me/sdk/design/dynamicfont/DynamicFont;", 0), rae.s(cls, "typography", "getTypography()Lone/me/sdk/design/TextStyle;", 0), rae.s(cls, "appearance", "getAppearance()Lone/me/common/counter/OneMeCounter$Appearance;", 0), rae.s(cls, "hasBackgroundStroke", "getHasBackgroundStroke()Z", 0), rae.s(cls, "hasBackground", "getHasBackground()Z", 0)};
    }

    public wsa(Context context) {
        super(context, (AttributeSet) null);
        float f = (float) 20;
        this.x0 = MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f);
        this.y0 = MathKt.roundToInt(f * vo4.c().getDisplayMetrics().density);
        this.z0 = MathKt.roundToInt(((float) 6) * vo4.c().getDisplayMetrics().density);
        float f2 = vo4.c().getDisplayMetrics().density * 20.0f;
        GradientDrawable P = i8b.P((Integer) null, (Integer) null, (Integer) null, new float[]{f2, f2, f2, f2, f2, f2, f2, f2});
        this.A0 = P;
        Delegates delegates = Delegates.INSTANCE;
        uy4 uy4 = uy4.a;
        this.C0 = new vsa(this, 0);
        this.D0 = new vsa((Object) puf.n, this);
        TextPaint textPaint = new TextPaint(1);
        getTypography().a(textPaint, getResources().getDisplayMetrics(), uy4.b);
        this.E0 = textPaint;
        qsa qsa = qsa.a;
        this.F0 = new vsa(this, 2);
        this.G0 = new vsa(this, 3);
        this.H0 = new vsa(this, 4);
        this.I0 = 400;
        this.K0 = KotlinVersion.MAX_COMPONENT_VALUE;
        this.L0 = tsa.b;
        setBackground(P);
        f(fu4.k.e(getContext()).f());
    }

    public static String e(int i) {
        String format;
        String str;
        long j = (long) i;
        int i2 = (j > 1000000000 ? 1 : (j == 1000000000 ? 0 : -1));
        DecimalFormat decimalFormat = yxe.a;
        if (i2 >= 0) {
            format = decimalFormat.format(((double) j) / 1.0E9d);
            str = "B";
        } else if (j >= 1000000) {
            format = decimalFormat.format(((double) j) / 1000000.0d);
            str = "M";
        } else if (j >= 1000) {
            format = decimalFormat.format(((double) j) / 1000.0d);
            str = "K";
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append(j);
            return sb.toString();
        }
        return tr1.j(format, str);
    }

    /* access modifiers changed from: private */
    public final uy4 getTextFont() {
        return (uy4) this.C0.getValue(this, M0[0]);
    }

    private final ogf getTypography() {
        return (ogf) this.D0.getValue(this, M0[1]);
    }

    private final void setCounterWithoutAnimation(int i) {
        this.b = i;
        this.w0 = this.v0;
        String e = e(i);
        int measureText = (int) this.E0.measureText(e);
        this.v0 = measureText;
        this.w = i(e, measureText);
        if (this.v0 != this.w0) {
            requestLayout();
        } else {
            invalidate();
        }
    }

    private final void setTextFont(uy4 uy4) {
        this.C0.setValue(this, M0[0], uy4);
    }

    @JvmName(name = "setTypographyInternal")
    private final void setTypographyInternal(ogf ogf) {
        this.D0.setValue(this, M0[1], ogf);
    }

    public final void a(uy4 uy4) {
        boolean z2 = true;
        this.B0 = true;
        setTextFont(uy4);
        getTypography().a(this.E0, getResources().getDisplayMetrics(), uy4);
        int ordinal = this.L0.ordinal();
        if (ordinal == 0) {
            int i = this.b;
            this.b = -1;
            ValueAnimator valueAnimator = this.o;
            if (valueAnimator == null || !valueAnimator.isStarted()) {
                z2 = false;
            }
            g(i, z2);
        } else if (ordinal == 1) {
            this.L0 = tsa.b;
            ValueAnimator valueAnimator2 = this.o;
            if (valueAnimator2 != null) {
                valueAnimator2.end();
            }
            this.b = 0;
            this.w = null;
            requestLayout();
        } else if (ordinal == 2) {
            h();
        } else {
            throw new NoWhenBranchMatchedException();
        }
        this.B0 = false;
        requestLayout();
        invalidate();
    }

    public final int c(String str) {
        if (str.length() != 0) {
            char charAt = str.charAt(0);
            TextPaint textPaint = this.E0;
            float measureText = textPaint.measureText(String.valueOf(charAt));
            int lastIndex = StringsKt.getLastIndex(str);
            int i = 1;
            if (1 <= lastIndex) {
                while (true) {
                    measureText = Math.max(measureText, textPaint.measureText(String.valueOf(str.charAt(i))));
                    if (i == lastIndex) {
                        break;
                    }
                    i++;
                }
            }
            return (int) measureText;
        }
        throw new NoSuchElementException();
    }

    public final void d(Canvas canvas) {
        StaticLayout staticLayout = this.w;
        if (staticLayout != null) {
            int save = canvas.save();
            canvas.translate(((float) (canvas.getWidth() - this.v0)) / 2.0f, ((float) (getHeight() - staticLayout.getHeight())) / 2.0f);
            try {
                Unit unit = Unit.INSTANCE;
                staticLayout.draw(canvas);
            } finally {
                canvas.restoreToCount(save);
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0060  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0093  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00ac  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void f(defpackage.k2b r11) {
        /*
            r10 = this;
            boolean r0 = r10.isEnabled()
            android.text.TextPaint r1 = r10.E0
            android.graphics.drawable.GradientDrawable r2 = r10.A0
            r3 = 4609434218613702656(0x3ff8000000000000, double:1.5)
            r5 = 4
            r6 = 3
            r7 = 2
            r8 = 1
            if (r0 == 0) goto L_0x00cb
            qsa r0 = r10.getAppearance()
            int r0 = r0.ordinal()
            r9 = -1
            if (r0 == 0) goto L_0x004b
            if (r0 == r8) goto L_0x0040
            if (r0 == r7) goto L_0x0039
            if (r0 == r6) goto L_0x0030
            if (r0 != r5) goto L_0x002a
            xef r0 = r11.getText()
            int r0 = r0.e
            goto L_0x0053
        L_0x002a:
            kotlin.NoWhenBranchMatchedException r10 = new kotlin.NoWhenBranchMatchedException
            r10.<init>()
            throw r10
        L_0x0030:
            xef r0 = r11.getText()
            r0.getClass()
        L_0x0037:
            r0 = r9
            goto L_0x0053
        L_0x0039:
            xef r0 = r11.getText()
            int r0 = r0.f
            goto L_0x0053
        L_0x0040:
            xef r0 = r11.getText()
            r0.getClass()
            r0 = -15987442(0xffffffffff0c0d0e, float:-1.861597E38)
            goto L_0x0053
        L_0x004b:
            xef r0 = r11.getText()
            r0.getClass()
            goto L_0x0037
        L_0x0053:
            r1.setColor(r0)
            qsa r0 = r10.getAppearance()
            int r0 = r0.ordinal()
            if (r0 == 0) goto L_0x0093
            if (r0 == r8) goto L_0x0089
            if (r0 == r7) goto L_0x0080
            if (r0 == r6) goto L_0x0077
            if (r0 != r5) goto L_0x0071
            df0 r0 = r11.c()
            cf0 r0 = r0.a
            int r9 = r0.c
            goto L_0x009f
        L_0x0071:
            kotlin.NoWhenBranchMatchedException r10 = new kotlin.NoWhenBranchMatchedException
            r10.<init>()
            throw r10
        L_0x0077:
            df0 r0 = r11.c()
            cf0 r0 = r0.a
            int r9 = r0.e
            goto L_0x009f
        L_0x0080:
            df0 r0 = r11.c()
            cf0 r0 = r0.a
            int r9 = r0.g
            goto L_0x009f
        L_0x0089:
            df0 r0 = r11.c()
            cf0 r0 = r0.a
            r0.getClass()
            goto L_0x009f
        L_0x0093:
            df0 r0 = r11.c()
            cf0 r0 = r0.a
            r0.getClass()
            r9 = -16745729(0xffffffffff007aff, float:-1.7077982E38)
        L_0x009f:
            android.content.res.ColorStateList r0 = android.content.res.ColorStateList.valueOf(r9)
            r2.setColor(r0)
            boolean r0 = r10.getHasBackgroundStroke()
            if (r0 == 0) goto L_0x017e
            android.content.res.Resources r0 = defpackage.vo4.c()
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()
            float r0 = r0.density
            double r5 = (double) r0
            double r5 = r5 * r3
            int r0 = kotlin.math.MathKt.roundToInt((double) r5)
            fye r11 = r11.h()
            int r11 = r11.f
            android.content.res.ColorStateList r11 = android.content.res.ColorStateList.valueOf(r11)
            r2.setStroke(r0, r11)
            goto L_0x017e
        L_0x00cb:
            qsa r0 = r10.getAppearance()
            int r0 = r0.ordinal()
            if (r0 == 0) goto L_0x0107
            if (r0 == r8) goto L_0x00fe
            if (r0 == r7) goto L_0x00f5
            if (r0 == r6) goto L_0x00ec
            if (r0 != r5) goto L_0x00e6
            ene r0 = r11.b()
            gne r0 = r0.c
            int r0 = r0.h
            goto L_0x010f
        L_0x00e6:
            kotlin.NoWhenBranchMatchedException r10 = new kotlin.NoWhenBranchMatchedException
            r10.<init>()
            throw r10
        L_0x00ec:
            ene r0 = r11.b()
            gne r0 = r0.c
            int r0 = r0.e
            goto L_0x010f
        L_0x00f5:
            ene r0 = r11.b()
            gne r0 = r0.c
            int r0 = r0.h
            goto L_0x010f
        L_0x00fe:
            ene r0 = r11.b()
            gne r0 = r0.c
            int r0 = r0.h
            goto L_0x010f
        L_0x0107:
            ene r0 = r11.b()
            gne r0 = r0.c
            int r0 = r0.e
        L_0x010f:
            r1.setColor(r0)
            qsa r0 = r10.getAppearance()
            int r0 = r0.ordinal()
            if (r0 == 0) goto L_0x014c
            if (r0 == r8) goto L_0x0143
            if (r0 == r7) goto L_0x013c
            if (r0 == r6) goto L_0x0133
            if (r0 != r5) goto L_0x012d
            ene r0 = r11.b()
            dne r0 = r0.a
            int r0 = r0.h
            goto L_0x0154
        L_0x012d:
            kotlin.NoWhenBranchMatchedException r10 = new kotlin.NoWhenBranchMatchedException
            r10.<init>()
            throw r10
        L_0x0133:
            ene r0 = r11.b()
            dne r0 = r0.a
            int r0 = r0.j
            goto L_0x0154
        L_0x013c:
            df0 r0 = r11.c()
            int r0 = r0.j
            goto L_0x0154
        L_0x0143:
            ene r0 = r11.b()
            dne r0 = r0.a
            int r0 = r0.i
            goto L_0x0154
        L_0x014c:
            ene r0 = r11.b()
            dne r0 = r0.a
            int r0 = r0.r
        L_0x0154:
            android.content.res.ColorStateList r0 = android.content.res.ColorStateList.valueOf(r0)
            r2.setColor(r0)
            boolean r0 = r10.getHasBackgroundStroke()
            if (r0 == 0) goto L_0x017e
            android.content.res.Resources r0 = defpackage.vo4.c()
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()
            float r0 = r0.density
            double r5 = (double) r0
            double r5 = r5 * r3
            int r0 = kotlin.math.MathKt.roundToInt((double) r5)
            fye r11 = r11.h()
            int r11 = r11.f
            android.content.res.ColorStateList r11 = android.content.res.ColorStateList.valueOf(r11)
            r2.setStroke(r0, r11)
        L_0x017e:
            int r11 = r1.getColor()
            int r11 = r11 >> 24
            r11 = r11 & 255(0xff, float:3.57E-43)
            r10.K0 = r11
            r10.invalidate()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wsa.f(k2b):void");
    }

    public final void g(int i, boolean z2) {
        int i2;
        psa psa;
        if (i != this.b && !Intrinsics.areEqual((Object) e(i), (Object) e(this.b))) {
            this.L0 = tsa.a;
            ValueAnimator valueAnimator = this.o;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            if (!z2 || this.L0 == tsa.b || ((i2 = this.b) == 0 && i > 0)) {
                setCounterWithoutAnimation(i);
                return;
            }
            if (i2 < 0) {
                this.E0.setAlpha(0);
                this.A0.setAlpha(0);
                psa = psa.a;
            } else {
                psa = psa.c;
            }
            this.c = psa;
            this.v = c44.DEFAULT_ASPECT_RATIO;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{c44.DEFAULT_ASPECT_RATIO, 1.0f});
            psa psa2 = this.c;
            int[] iArr = usa.$EnumSwitchMapping$0;
            ofFloat.setInterpolator(iArr[psa2.ordinal()] == 1 ? this.J0 : null);
            ofFloat.setDuration(iArr[this.c.ordinal()] == 1 ? this.I0 : 150);
            ofFloat.addUpdateListener(new z00(16, (Object) this));
            ofFloat.addListener(new wh(0, ofFloat, new c28(20, this)));
            this.o = ofFloat;
            String e = e(i);
            String e2 = e(this.b);
            if (this.w != null) {
                if (e2.length() == e.length()) {
                    int c2 = c(e2);
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(e2);
                    SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(e);
                    SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder(e);
                    int length = e2.length();
                    for (int i3 = 0; i3 < length; i3++) {
                        if (e2.charAt(i3) == e.charAt(i3)) {
                            int i4 = i3 + 1;
                            spannableStringBuilder.setSpan(new ReplacementSpan(), i3, i4, 0);
                            spannableStringBuilder2.setSpan(new ReplacementSpan(), i3, i4, 0);
                            spannableStringBuilder3.setSpan(new ssa(c2), i3, i4, 0);
                        } else {
                            int i5 = i3 + 1;
                            spannableStringBuilder.setSpan(new ssa(c2), i3, i5, 0);
                            spannableStringBuilder2.setSpan(new ssa(c2), i3, i5, 0);
                            spannableStringBuilder3.setSpan(new ReplacementSpan(), i3, i5, 0);
                        }
                    }
                    int length2 = e2.length() * c2;
                    this.x = i(spannableStringBuilder, length2);
                    this.z = i(spannableStringBuilder3, length2);
                    this.y = i(spannableStringBuilder2, length2);
                } else {
                    this.x = this.w;
                }
            }
            this.w0 = this.v0;
            this.a = i > this.b;
            ValueAnimator valueAnimator2 = this.o;
            if (valueAnimator2 != null) {
                valueAnimator2.start();
            }
            if (i >= 0) {
                int c3 = c(e);
                this.v0 = e.length() * c3;
                SpannableStringBuilder spannableStringBuilder4 = new SpannableStringBuilder(e);
                int length3 = e.length();
                int i6 = 0;
                while (i6 < length3) {
                    int i7 = i6 + 1;
                    spannableStringBuilder4.setSpan(new ssa(c3), i6, i7, 0);
                    i6 = i7;
                }
                Unit unit = Unit.INSTANCE;
                this.w = i(spannableStringBuilder4, this.v0);
            }
            this.b = i;
            if (this.v0 != this.w0) {
                requestLayout();
            }
        }
    }

    public final qsa getAppearance() {
        return (qsa) this.F0.getValue(this, M0[2]);
    }

    public final boolean getHasBackground() {
        return ((Boolean) this.H0.getValue(this, M0[4])).booleanValue();
    }

    public final boolean getHasBackgroundStroke() {
        return ((Boolean) this.G0.getValue(this, M0[3])).booleanValue();
    }

    public final long getReplaceDuration() {
        return this.I0;
    }

    public final Interpolator getReplaceInterpolator() {
        return this.J0;
    }

    public final void h() {
        this.L0 = tsa.c;
        ValueAnimator valueAnimator = this.o;
        if (valueAnimator != null) {
            valueAnimator.end();
        }
        this.b = 0;
        int measureText = (int) this.E0.measureText("!");
        this.v0 = measureText;
        this.w = i("!", measureText);
        if (this.v0 != this.w0) {
            requestLayout();
        } else {
            invalidate();
        }
    }

    public final StaticLayout i(CharSequence charSequence, int i) {
        return StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), this.E0, i).setAlignment(Layout.Alignment.ALIGN_CENTER).setIncludePad(false).setMaxLines(1).build();
    }

    public final void onDraw(Canvas canvas) {
        psa psa;
        super.onDraw(canvas);
        float f = this.v;
        boolean z2 = false;
        boolean z3 = !(f == 1.0f);
        TextPaint textPaint = this.E0;
        if (!z3 || !((psa = this.c) == psa.a || psa == psa.b)) {
            if (!(!(f == 1.0f)) || this.c != psa.c) {
                if (f == 1.0f) {
                    z2 = true;
                }
                if (!(!z2)) {
                    d(canvas);
                    return;
                }
                return;
            }
            float f2 = f * ((float) 2);
            if (f2 > 1.0f) {
                f2 = 1.0f;
            }
            canvas.save();
            StaticLayout staticLayout = this.y;
            if (staticLayout != null) {
                float height = (((float) (getHeight() - staticLayout.getHeight())) / 2.0f) + ((1.0f - f2) * ((float) MathKt.roundToInt((this.a ? (float) 13 : (float) -13) * vo4.c().getDisplayMetrics().density)));
                int save = canvas.save();
                canvas.translate(((float) (canvas.getWidth() - this.v0)) / 2.0f, height);
                try {
                    textPaint.setAlpha((int) (((float) this.K0) * f2));
                    Unit unit = Unit.INSTANCE;
                    staticLayout.draw(canvas);
                } finally {
                    canvas.restoreToCount(save);
                }
            } else {
                StaticLayout staticLayout2 = this.w;
                if (staticLayout2 != null) {
                    float height2 = (((float) (getHeight() - staticLayout2.getHeight())) / 2.0f) + ((1.0f - f2) * ((float) MathKt.roundToInt((this.a ? (float) 13 : (float) -13) * vo4.c().getDisplayMetrics().density)));
                    int save2 = canvas.save();
                    canvas.translate(((float) (canvas.getWidth() - this.v0)) / 2.0f, height2);
                    try {
                        textPaint.setAlpha((int) (((float) this.K0) * f2));
                        Unit unit2 = Unit.INSTANCE;
                        staticLayout2.draw(canvas);
                    } finally {
                        canvas.restoreToCount(save2);
                    }
                }
            }
            StaticLayout staticLayout3 = this.x;
            if (staticLayout3 != null) {
                float height3 = (((float) (getHeight() - staticLayout3.getHeight())) / 2.0f) + (((float) MathKt.roundToInt((this.a ? (float) -13 : (float) 13) * vo4.c().getDisplayMetrics().density)) * f2);
                int save3 = canvas.save();
                canvas.translate(((float) (canvas.getWidth() - this.v0)) / 2.0f, height3);
                try {
                    textPaint.setAlpha((int) ((1.0f - f2) * ((float) this.K0)));
                    Unit unit3 = Unit.INSTANCE;
                    staticLayout3.draw(canvas);
                } finally {
                    canvas.restoreToCount(save3);
                }
            }
            StaticLayout staticLayout4 = this.z;
            if (staticLayout4 != null) {
                int save4 = canvas.save();
                canvas.translate(((float) (canvas.getWidth() - this.v0)) / 2.0f, ((float) (getHeight() - this.z.getHeight())) / 2.0f);
                try {
                    textPaint.setAlpha(this.K0);
                    Unit unit4 = Unit.INSTANCE;
                    staticLayout4.draw(canvas);
                } finally {
                    canvas.restoreToCount(save4);
                }
            }
            textPaint.setAlpha(this.K0);
            canvas.restore();
            return;
        }
        d(canvas);
        this.A0.setAlpha((int) (this.v * ((float) KotlinVersion.MAX_COMPONENT_VALUE)));
        textPaint.setAlpha((int) (this.v * ((float) this.K0)));
    }

    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        String e = e(this.b);
        int c2 = c(e) * e.length();
        if (getHasBackground()) {
            int i3 = this.x0;
            c2 = c2 > i3 / 2 ? c2 + (this.z0 * 2) : i3;
        }
        Paint.FontMetrics fontMetrics = this.E0.getFontMetrics();
        setMeasuredDimension(c2, Math.max((int) ((float) Math.ceil((double) (fontMetrics.descent - fontMetrics.ascent))), this.y0));
    }

    public final void onThemeChanged(k2b k2b) {
        f(k2b);
    }

    public final void setAppearance(qsa qsa) {
        this.F0.setValue(this, M0[2], qsa);
    }

    public void setEnabled(boolean z2) {
        super.setEnabled(z2);
        f(fu4.k.e(getContext()).f());
    }

    public final void setHasBackground(boolean z2) {
        this.H0.setValue(this, M0[4], Boolean.valueOf(z2));
    }

    public final void setHasBackgroundStroke(boolean z2) {
        this.G0.setValue(this, M0[3], Boolean.valueOf(z2));
    }

    public final void setReplaceDuration(long j) {
        this.I0 = j;
    }

    public final void setReplaceInterpolator(Interpolator interpolator) {
        this.J0 = interpolator;
    }

    public final void setTextColor(int i) {
        TextPaint textPaint = this.E0;
        textPaint.setColor(j4b.l0(1.0f, i));
        this.K0 = textPaint.getAlpha();
        invalidate();
    }

    public final void setTypography(ogf ogf) {
        setTypographyInternal(ogf);
    }
}
