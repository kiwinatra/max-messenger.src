package defpackage;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Parcelable;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOverlay;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityManager;
import java.math.BigDecimal;
import java.math.MathContext;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;
import kotlin.jvm.internal.IntCompanionObject;

/* renamed from: wk0  reason: default package */
public abstract class wk0 extends View {
    public static final int D1 = hnc.Widget_MaterialComponents_Slider;
    public static final int E1 = edc.motionDurationMedium4;
    public static final int F1 = edc.motionDurationShort3;
    public static final int G1 = edc.motionEasingEmphasizedInterpolator;
    public static final int H1 = edc.motionEasingEmphasizedAccelerateInterpolator;
    public boolean A0 = false;
    public float A1;
    public ValueAnimator B0;
    public int B1;
    public ValueAnimator C0;
    public final rk0 C1;
    public final int D0;
    public final int E0;
    public final int F0;
    public final int G0;
    public final int H0;
    public final int I0;
    public final int J0;
    public final int K0;
    public final int L0;
    public int M0;
    public int N0;
    public int O0;
    public int P0;
    public int Q0;
    public int R0;
    public int S0;
    public int T0;
    public int U0 = -1;
    public int V0 = -1;
    public int W0;
    public int X0;
    public final int Y0;
    public float Z0;
    public final Paint a;
    public MotionEvent a1;
    public final Paint b;
    public boolean b1 = false;
    public final Paint c;
    public float c1;
    public float d1;
    public ArrayList e1 = new ArrayList();
    public int f1 = -1;
    public int g1 = -1;
    public float h1 = c44.DEFAULT_ASPECT_RATIO;
    public float[] i1;
    public boolean j1 = true;
    public int k1;
    public int l1;
    public int m1;
    public boolean n1 = false;
    public final Paint o;
    public boolean o1;
    public ColorStateList p1;
    public ColorStateList q1;
    public ColorStateList r1;
    public ColorStateList s1;
    public ColorStateList t1;
    public final Path u1 = new Path();
    public final Paint v;
    public tk0 v0;
    public final RectF v1 = new RectF();
    public final Paint w;
    public final int w0;
    public final RectF w1 = new RectF();
    public final Paint x;
    public final ArrayList x0 = new ArrayList();
    public final bh8 x1;
    public final uk0 y;
    public final ArrayList y0 = new ArrayList();
    public Drawable y1;
    public final AccessibilityManager z;
    public final ArrayList z0 = new ArrayList();
    public List z1;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public wk0(android.content.Context r18, android.util.AttributeSet r19, int r20) {
        /*
            r17 = this;
            r0 = r17
            r7 = r19
            r8 = r20
            int r9 = D1
            r1 = r18
            android.content.Context r1 = defpackage.fh8.a(r1, r7, r8, r9)
            r0.<init>(r1, r7, r8)
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r0.x0 = r1
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r0.y0 = r1
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r0.z0 = r1
            r10 = 0
            r0.A0 = r10
            r1 = -1
            r0.U0 = r1
            r0.V0 = r1
            r0.b1 = r10
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r0.e1 = r2
            r0.f1 = r1
            r0.g1 = r1
            r11 = 0
            r0.h1 = r11
            r12 = 1
            r0.j1 = r12
            r0.n1 = r10
            android.graphics.Path r1 = new android.graphics.Path
            r1.<init>()
            r0.u1 = r1
            android.graphics.RectF r1 = new android.graphics.RectF
            r1.<init>()
            r0.v1 = r1
            android.graphics.RectF r1 = new android.graphics.RectF
            r1.<init>()
            r0.w1 = r1
            bh8 r13 = new bh8
            r13.<init>()
            r0.x1 = r13
            java.util.List r1 = java.util.Collections.emptyList()
            r0.z1 = r1
            r0.B1 = r10
            rk0 r1 = new rk0
            r14 = r0
            wde r14 = (defpackage.wde) r14
            r1.<init>(r14)
            r0.C1 = r1
            android.content.Context r15 = r17.getContext()
            android.graphics.Paint r1 = new android.graphics.Paint
            r1.<init>()
            r0.a = r1
            android.graphics.Paint r1 = new android.graphics.Paint
            r1.<init>()
            r0.b = r1
            android.graphics.Paint r1 = new android.graphics.Paint
            r1.<init>(r12)
            r0.c = r1
            android.graphics.Paint$Style r2 = android.graphics.Paint.Style.FILL
            r1.setStyle(r2)
            android.graphics.PorterDuffXfermode r3 = new android.graphics.PorterDuffXfermode
            android.graphics.PorterDuff$Mode r4 = android.graphics.PorterDuff.Mode.CLEAR
            r3.<init>(r4)
            r1.setXfermode(r3)
            android.graphics.Paint r1 = new android.graphics.Paint
            r1.<init>(r12)
            r0.o = r1
            r1.setStyle(r2)
            android.graphics.Paint r1 = new android.graphics.Paint
            r1.<init>()
            r0.v = r1
            android.graphics.Paint$Style r3 = android.graphics.Paint.Style.STROKE
            r1.setStyle(r3)
            android.graphics.Paint$Cap r4 = android.graphics.Paint.Cap.ROUND
            r1.setStrokeCap(r4)
            android.graphics.Paint r1 = new android.graphics.Paint
            r1.<init>()
            r0.w = r1
            r1.setStyle(r3)
            r1.setStrokeCap(r4)
            android.graphics.Paint r1 = new android.graphics.Paint
            r1.<init>()
            r0.x = r1
            r1.setStyle(r2)
            r1.setStrokeCap(r4)
            android.content.res.Resources r1 = r15.getResources()
            int r2 = defpackage.iec.mtrl_slider_widget_height
            int r2 = r1.getDimensionPixelSize(r2)
            r0.L0 = r2
            int r2 = defpackage.iec.mtrl_slider_track_side_padding
            int r2 = r1.getDimensionPixelOffset(r2)
            r0.E0 = r2
            r0.P0 = r2
            int r2 = defpackage.iec.mtrl_slider_thumb_radius
            int r2 = r1.getDimensionPixelSize(r2)
            r0.F0 = r2
            int r2 = defpackage.iec.mtrl_slider_track_height
            int r2 = r1.getDimensionPixelSize(r2)
            r0.G0 = r2
            int r2 = defpackage.iec.mtrl_slider_tick_radius
            int r2 = r1.getDimensionPixelSize(r2)
            r0.H0 = r2
            int r2 = defpackage.iec.mtrl_slider_tick_radius
            int r2 = r1.getDimensionPixelSize(r2)
            r0.I0 = r2
            int r2 = defpackage.iec.mtrl_slider_tick_min_spacing
            int r2 = r1.getDimensionPixelSize(r2)
            r0.J0 = r2
            int r2 = defpackage.iec.mtrl_slider_label_padding
            int r1 = r1.getDimensionPixelSize(r2)
            r0.Y0 = r1
            int[] r6 = defpackage.tnc.Slider
            int[] r5 = new int[r10]
            defpackage.vhf.a(r15, r7, r8, r9)
            r1 = r15
            r2 = r19
            r3 = r6
            r4 = r20
            r16 = r5
            r5 = r9
            r10 = r6
            r6 = r16
            defpackage.vhf.b(r1, r2, r3, r4, r5, r6)
            android.content.res.TypedArray r1 = r15.obtainStyledAttributes(r7, r10, r8, r9)
            int r2 = defpackage.tnc.Slider_labelStyle
            int r3 = defpackage.hnc.Widget_MaterialComponents_Tooltip
            int r2 = r1.getResourceId(r2, r3)
            r0.w0 = r2
            int r2 = defpackage.tnc.Slider_android_valueFrom
            float r2 = r1.getFloat(r2, r11)
            r0.c1 = r2
            int r2 = defpackage.tnc.Slider_android_valueTo
            r3 = 1065353216(0x3f800000, float:1.0)
            float r2 = r1.getFloat(r2, r3)
            r0.d1 = r2
            float r2 = r0.c1
            java.lang.Float r2 = java.lang.Float.valueOf(r2)
            java.lang.Float[] r2 = new java.lang.Float[]{r2}
            r0.setValues((java.lang.Float[]) r2)
            int r2 = defpackage.tnc.Slider_android_stepSize
            float r2 = r1.getFloat(r2, r11)
            r0.h1 = r2
            android.content.Context r2 = r17.getContext()
            r3 = 48
            float r2 = defpackage.ct.j(r3, r2)
            double r2 = (double) r2
            double r2 = java.lang.Math.ceil(r2)
            float r2 = (float) r2
            int r3 = defpackage.tnc.Slider_minTouchTargetSize
            float r2 = r1.getDimension(r3, r2)
            double r2 = (double) r2
            double r2 = java.lang.Math.ceil(r2)
            int r2 = (int) r2
            r0.K0 = r2
            int r2 = defpackage.tnc.Slider_trackColor
            boolean r2 = r1.hasValue(r2)
            if (r2 == 0) goto L_0x0188
            int r3 = defpackage.tnc.Slider_trackColor
            goto L_0x018a
        L_0x0188:
            int r3 = defpackage.tnc.Slider_trackColorInactive
        L_0x018a:
            if (r2 == 0) goto L_0x018f
            int r2 = defpackage.tnc.Slider_trackColor
            goto L_0x0191
        L_0x018f:
            int r2 = defpackage.tnc.Slider_trackColorActive
        L_0x0191:
            android.content.res.ColorStateList r3 = defpackage.m5a.C(r15, r1, r3)
            if (r3 == 0) goto L_0x0198
            goto L_0x019e
        L_0x0198:
            int r3 = defpackage.rdc.material_slider_inactive_track_color
            android.content.res.ColorStateList r3 = defpackage.q8.j(r3, r15)
        L_0x019e:
            r0.setTrackInactiveTintList(r3)
            android.content.res.ColorStateList r2 = defpackage.m5a.C(r15, r1, r2)
            if (r2 == 0) goto L_0x01a8
            goto L_0x01ae
        L_0x01a8:
            int r2 = defpackage.rdc.material_slider_active_track_color
            android.content.res.ColorStateList r2 = defpackage.q8.j(r2, r15)
        L_0x01ae:
            r0.setTrackActiveTintList(r2)
            int r2 = defpackage.tnc.Slider_thumbColor
            android.content.res.ColorStateList r2 = defpackage.m5a.C(r15, r1, r2)
            r13.l(r2)
            int r2 = defpackage.tnc.Slider_thumbStrokeColor
            boolean r2 = r1.hasValue(r2)
            if (r2 == 0) goto L_0x01cb
            int r2 = defpackage.tnc.Slider_thumbStrokeColor
            android.content.res.ColorStateList r2 = defpackage.m5a.C(r15, r1, r2)
            r0.setThumbStrokeColor(r2)
        L_0x01cb:
            int r2 = defpackage.tnc.Slider_thumbStrokeWidth
            float r2 = r1.getDimension(r2, r11)
            r0.setThumbStrokeWidth(r2)
            int r2 = defpackage.tnc.Slider_haloColor
            android.content.res.ColorStateList r2 = defpackage.m5a.C(r15, r1, r2)
            if (r2 == 0) goto L_0x01dd
            goto L_0x01e3
        L_0x01dd:
            int r2 = defpackage.rdc.material_slider_halo_color
            android.content.res.ColorStateList r2 = defpackage.q8.j(r2, r15)
        L_0x01e3:
            r0.setHaloTintList(r2)
            int r2 = defpackage.tnc.Slider_tickVisible
            boolean r2 = r1.getBoolean(r2, r12)
            r0.j1 = r2
            int r2 = defpackage.tnc.Slider_tickColor
            boolean r2 = r1.hasValue(r2)
            if (r2 == 0) goto L_0x01f9
            int r3 = defpackage.tnc.Slider_tickColor
            goto L_0x01fb
        L_0x01f9:
            int r3 = defpackage.tnc.Slider_tickColorInactive
        L_0x01fb:
            if (r2 == 0) goto L_0x0200
            int r2 = defpackage.tnc.Slider_tickColor
            goto L_0x0202
        L_0x0200:
            int r2 = defpackage.tnc.Slider_tickColorActive
        L_0x0202:
            android.content.res.ColorStateList r3 = defpackage.m5a.C(r15, r1, r3)
            if (r3 == 0) goto L_0x0209
            goto L_0x020f
        L_0x0209:
            int r3 = defpackage.rdc.material_slider_inactive_tick_marks_color
            android.content.res.ColorStateList r3 = defpackage.q8.j(r3, r15)
        L_0x020f:
            r0.setTickInactiveTintList(r3)
            android.content.res.ColorStateList r2 = defpackage.m5a.C(r15, r1, r2)
            if (r2 == 0) goto L_0x0219
            goto L_0x021f
        L_0x0219:
            int r2 = defpackage.rdc.material_slider_active_tick_marks_color
            android.content.res.ColorStateList r2 = defpackage.q8.j(r2, r15)
        L_0x021f:
            r0.setTickActiveTintList(r2)
            int r2 = defpackage.tnc.Slider_thumbTrackGapSize
            r3 = 0
            int r2 = r1.getDimensionPixelSize(r2, r3)
            r0.setThumbTrackGapSize(r2)
            int r2 = defpackage.tnc.Slider_trackStopIndicatorSize
            int r2 = r1.getDimensionPixelSize(r2, r3)
            r0.setTrackStopIndicatorSize(r2)
            int r2 = defpackage.tnc.Slider_trackInsideCornerSize
            int r2 = r1.getDimensionPixelSize(r2, r3)
            r0.setTrackInsideCornerSize(r2)
            int r2 = defpackage.tnc.Slider_thumbRadius
            int r2 = r1.getDimensionPixelSize(r2, r3)
            int r4 = defpackage.tnc.Slider_thumbWidth
            int r2 = r2 * 2
            int r4 = r1.getDimensionPixelSize(r4, r2)
            int r5 = defpackage.tnc.Slider_thumbHeight
            int r2 = r1.getDimensionPixelSize(r5, r2)
            r0.setThumbWidth(r4)
            r0.setThumbHeight(r2)
            int r2 = defpackage.tnc.Slider_haloRadius
            int r2 = r1.getDimensionPixelSize(r2, r3)
            r0.setHaloRadius(r2)
            int r2 = defpackage.tnc.Slider_thumbElevation
            float r2 = r1.getDimension(r2, r11)
            r0.setThumbElevation(r2)
            int r2 = defpackage.tnc.Slider_trackHeight
            int r2 = r1.getDimensionPixelSize(r2, r3)
            r0.setTrackHeight(r2)
            int r2 = defpackage.tnc.Slider_tickRadiusActive
            int r3 = r0.W0
            int r3 = r3 / 2
            int r2 = r1.getDimensionPixelSize(r2, r3)
            r0.setTickActiveRadius(r2)
            int r2 = defpackage.tnc.Slider_tickRadiusInactive
            int r3 = r0.W0
            int r3 = r3 / 2
            int r2 = r1.getDimensionPixelSize(r2, r3)
            r0.setTickInactiveRadius(r2)
            int r2 = defpackage.tnc.Slider_labelBehavior
            r3 = 0
            int r2 = r1.getInt(r2, r3)
            r0.setLabelBehavior(r2)
            int r2 = defpackage.tnc.Slider_android_enabled
            boolean r2 = r1.getBoolean(r2, r12)
            if (r2 != 0) goto L_0x02a2
            r0.setEnabled(r3)
        L_0x02a2:
            r1.recycle()
            r0.setFocusable(r12)
            r0.setClickable(r12)
            r13.m()
            android.view.ViewConfiguration r1 = android.view.ViewConfiguration.get(r15)
            int r1 = r1.getScaledTouchSlop()
            r0.D0 = r1
            uk0 r1 = new uk0
            r1.<init>(r14)
            r0.y = r1
            defpackage.gag.j(r0, r1)
            android.content.Context r1 = r17.getContext()
            java.lang.String r2 = "accessibility"
            java.lang.Object r1 = r1.getSystemService(r2)
            android.view.accessibility.AccessibilityManager r1 = (android.view.accessibility.AccessibilityManager) r1
            r0.z = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wk0.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    public final boolean B(float f) {
        return i(new BigDecimal(Float.toString(f)).subtract(new BigDecimal(Float.toString(this.c1)), MathContext.DECIMAL64).doubleValue());
    }

    public final float C(float f) {
        return (o(f) * ((float) this.m1)) + ((float) this.P0);
    }

    public final void a(Drawable drawable) {
        int intrinsicWidth = drawable.getIntrinsicWidth();
        int intrinsicHeight = drawable.getIntrinsicHeight();
        if (intrinsicWidth == -1 && intrinsicHeight == -1) {
            drawable.setBounds(0, 0, this.Q0, this.R0);
            return;
        }
        float max = ((float) Math.max(this.Q0, this.R0)) / ((float) Math.max(intrinsicWidth, intrinsicHeight));
        drawable.setBounds(0, 0, (int) (((float) intrinsicWidth) * max), (int) (((float) intrinsicHeight) * max));
    }

    public final int b() {
        int i = this.M0 / 2;
        int i2 = this.N0;
        int i3 = 0;
        if (i2 == 1 || i2 == 3) {
            i3 = ((rmf) this.x0.get(0)).getIntrinsicHeight();
        }
        return i + i3;
    }

    public final ValueAnimator c(boolean z2) {
        int i;
        TimeInterpolator timeInterpolator;
        float f = 1.0f;
        float f2 = z2 ? 0.0f : 1.0f;
        ValueAnimator valueAnimator = z2 ? this.C0 : this.B0;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            f2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            valueAnimator.cancel();
        }
        if (!z2) {
            f = 0.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{f2, f});
        if (z2) {
            i = ld8.n0(E1, 83, getContext());
            timeInterpolator = ld8.o0(getContext(), G1, xg.e);
        } else {
            i = ld8.n0(F1, 117, getContext());
            timeInterpolator = ld8.o0(getContext(), H1, xg.c);
        }
        ofFloat.setDuration((long) i);
        ofFloat.setInterpolator(timeInterpolator);
        ofFloat.addUpdateListener(new sk0(0, this));
        return ofFloat;
    }

    public final void d(Canvas canvas, int i, int i2, float f, Drawable drawable) {
        canvas.save();
        canvas.translate(((float) (this.P0 + ((int) (o(f) * ((float) i))))) - (((float) drawable.getBounds().width()) / 2.0f), ((float) i2) - (((float) drawable.getBounds().height()) / 2.0f));
        drawable.draw(canvas);
        canvas.restore();
    }

    public final boolean dispatchHoverEvent(MotionEvent motionEvent) {
        return this.y.m(motionEvent) || super.dispatchHoverEvent(motionEvent);
    }

    public final void drawableStateChanged() {
        super.drawableStateChanged();
        this.a.setColor(h(this.t1));
        this.b.setColor(h(this.s1));
        this.v.setColor(h(this.r1));
        this.w.setColor(h(this.q1));
        this.x.setColor(h(this.s1));
        Iterator it = this.x0.iterator();
        while (it.hasNext()) {
            rmf rmf = (rmf) it.next();
            if (rmf.isStateful()) {
                rmf.setState(getDrawableState());
            }
        }
        bh8 bh8 = this.x1;
        if (bh8.isStateful()) {
            bh8.setState(getDrawableState());
        }
        Paint paint = this.o;
        paint.setColor(h(this.p1));
        paint.setAlpha(63);
    }

    public final void e() {
        if (!this.A0) {
            this.A0 = true;
            ValueAnimator c2 = c(true);
            this.B0 = c2;
            this.C0 = null;
            c2.start();
        }
        ArrayList arrayList = this.x0;
        Iterator it = arrayList.iterator();
        for (int i = 0; i < this.e1.size() && it.hasNext(); i++) {
            if (i != this.g1) {
                q((rmf) it.next(), ((Float) this.e1.get(i)).floatValue());
            }
        }
        if (it.hasNext()) {
            q((rmf) it.next(), ((Float) this.e1.get(this.g1)).floatValue());
            return;
        }
        throw new IllegalStateException(String.format("Not enough labels(%d) to display all the values(%d)", new Object[]{Integer.valueOf(arrayList.size()), Integer.valueOf(this.e1.size())}));
    }

    public final void f() {
        if (this.A0) {
            this.A0 = false;
            ValueAnimator c2 = c(false);
            this.C0 = c2;
            this.B0 = null;
            c2.addListener(new z6(2, (Object) this));
            this.C0.start();
        }
    }

    public final float[] g() {
        float floatValue = ((Float) this.e1.get(0)).floatValue();
        float floatValue2 = ((Float) a81.h(1, this.e1)).floatValue();
        if (this.e1.size() == 1) {
            floatValue = this.c1;
        }
        float o2 = o(floatValue);
        float o3 = o(floatValue2);
        if (k()) {
            return new float[]{o3, o2};
        }
        return new float[]{o2, o3};
    }

    public final int getAccessibilityFocusedVirtualViewId() {
        return this.y.k;
    }

    public float getMinSeparation() {
        return c44.DEFAULT_ASPECT_RATIO;
    }

    public abstract int getThumbRadius();

    public abstract float getValueFrom();

    public abstract float getValueTo();

    public List<Float> getValues() {
        return new ArrayList(this.e1);
    }

    public final int h(ColorStateList colorStateList) {
        return colorStateList.getColorForState(getDrawableState(), colorStateList.getDefaultColor());
    }

    public final boolean i(double d) {
        double doubleValue = new BigDecimal(Double.toString(d)).divide(new BigDecimal(Float.toString(this.h1)), MathContext.DECIMAL64).doubleValue();
        return Math.abs(((double) Math.round(doubleValue)) - doubleValue) < 1.0E-4d;
    }

    public final boolean j(MotionEvent motionEvent) {
        if (motionEvent.getToolType(0) == 3) {
            return false;
        }
        for (ViewParent parent = getParent(); parent instanceof ViewGroup; parent = parent.getParent()) {
            ViewGroup viewGroup = (ViewGroup) parent;
            if ((viewGroup.canScrollVertically(1) || viewGroup.canScrollVertically(-1)) && viewGroup.shouldDelayChildPressedState()) {
                return true;
            }
        }
        return false;
    }

    public final boolean k() {
        WeakHashMap weakHashMap = gag.a;
        return getLayoutDirection() == 1;
    }

    public final void l() {
        if (this.h1 > c44.DEFAULT_ASPECT_RATIO) {
            z();
            int min = Math.min((int) (((this.d1 - this.c1) / this.h1) + 1.0f), (this.m1 / this.J0) + 1);
            float[] fArr = this.i1;
            if (fArr == null || fArr.length != min * 2) {
                this.i1 = new float[(min * 2)];
            }
            float f = ((float) this.m1) / ((float) (min - 1));
            for (int i = 0; i < min * 2; i += 2) {
                float[] fArr2 = this.i1;
                fArr2[i] = ((((float) i) / 2.0f) * f) + ((float) this.P0);
                fArr2[i + 1] = (float) b();
            }
        }
    }

    public final boolean m(int i) {
        int i2 = this.g1;
        long j = ((long) i2) + ((long) i);
        long size = (long) (this.e1.size() - 1);
        if (j < 0) {
            j = 0;
        } else if (j > size) {
            j = size;
        }
        int i3 = (int) j;
        this.g1 = i3;
        if (i3 == i2) {
            return false;
        }
        if (this.f1 != -1) {
            this.f1 = i3;
        }
        v();
        postInvalidate();
        return true;
    }

    public final void n(int i) {
        if (k()) {
            i = i == Integer.MIN_VALUE ? IntCompanionObject.MAX_VALUE : -i;
        }
        m(i);
    }

    public final float o(float f) {
        float f2 = this.c1;
        float f3 = (f - f2) / (this.d1 - f2);
        return k() ? 1.0f - f3 : f3;
    }

    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        getViewTreeObserver().addOnScrollChangedListener(this.C1);
        Iterator it = this.x0.iterator();
        while (it.hasNext()) {
            rmf rmf = (rmf) it.next();
            ViewGroup m = ct.m(this);
            if (m == null) {
                rmf.getClass();
            } else {
                rmf.getClass();
                int[] iArr = new int[2];
                m.getLocationOnScreen(iArr);
                rmf.T0 = iArr[0];
                m.getWindowVisibleDisplayFrame(rmf.M0);
                m.addOnLayoutChangeListener(rmf.L0);
            }
        }
    }

    public final void onDetachedFromWindow() {
        tk0 tk0 = this.v0;
        if (tk0 != null) {
            removeCallbacks(tk0);
        }
        this.A0 = false;
        Iterator it = this.x0.iterator();
        while (it.hasNext()) {
            rmf rmf = (rmf) it.next();
            p1e n = ct.n(this);
            if (n != null) {
                ((ViewOverlay) n.a).remove(rmf);
                ViewGroup m = ct.m(this);
                if (m == null) {
                    rmf.getClass();
                } else {
                    m.removeOnLayoutChangeListener(rmf.L0);
                }
            }
        }
        getViewTreeObserver().removeOnScrollChangedListener(this.C1);
        super.onDetachedFromWindow();
    }

    /* JADX WARNING: Removed duplicated region for block: B:112:0x0180 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x009f  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x0172  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onDraw(android.graphics.Canvas r19) {
        /*
            r18 = this;
            r6 = r18
            r7 = r19
            boolean r0 = r6.o1
            if (r0 == 0) goto L_0x000e
            r18.z()
            r18.l()
        L_0x000e:
            super.onDraw(r19)
            int r8 = r18.b()
            java.util.ArrayList r0 = r6.e1
            r9 = 0
            java.lang.Object r0 = r0.get(r9)
            java.lang.Float r0 = (java.lang.Float) r0
            float r0 = r0.floatValue()
            java.util.ArrayList r1 = r6.e1
            r10 = 1
            java.lang.Object r1 = defpackage.a81.h(r10, r1)
            java.lang.Float r1 = (java.lang.Float) r1
            float r11 = r1.floatValue()
            float r1 = r6.d1
            int r1 = (r11 > r1 ? 1 : (r11 == r1 ? 0 : -1))
            android.graphics.RectF r12 = r6.v1
            r13 = 3
            r15 = 1073741824(0x40000000, float:2.0)
            if (r1 < 0) goto L_0x0048
            java.util.ArrayList r1 = r6.e1
            int r1 = r1.size()
            if (r1 <= r10) goto L_0x00cc
            float r1 = r6.c1
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x00cc
        L_0x0048:
            int r0 = r6.m1
            float[] r16 = r18.g()
            int r1 = r6.P0
            float r2 = (float) r1
            r3 = r16[r10]
            float r5 = (float) r0
            float r3 = r3 * r5
            float r2 = r2 + r3
            int r3 = r1 + r0
            float r3 = (float) r3
            int r3 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            android.graphics.Paint r4 = r6.a
            if (r3 >= 0) goto L_0x0076
            int r3 = r6.T0
            if (r3 <= 0) goto L_0x0079
            float r3 = (float) r3
            float r2 = r2 + r3
            float r3 = (float) r8
            int r10 = r6.O0
            float r10 = (float) r10
            float r10 = r10 / r15
            float r14 = r3 - r10
            int r1 = r1 + r0
            float r0 = (float) r1
            float r0 = r0 + r10
            float r10 = r10 + r3
            r12.set(r2, r14, r0, r10)
            r6.x(r7, r4, r12, r13)
        L_0x0076:
            r14 = r4
            r10 = r5
            goto L_0x0093
        L_0x0079:
            android.graphics.Paint$Style r1 = android.graphics.Paint.Style.STROKE
            r4.setStyle(r1)
            android.graphics.Paint$Cap r1 = android.graphics.Paint.Cap.ROUND
            r4.setStrokeCap(r1)
            float r10 = (float) r8
            int r1 = r6.P0
            int r1 = r1 + r0
            float r3 = (float) r1
            r0 = r19
            r1 = r2
            r2 = r10
            r14 = r4
            r4 = r10
            r10 = r5
            r5 = r14
            r0.drawLine(r1, r2, r3, r4, r5)
        L_0x0093:
            int r0 = r6.P0
            float r1 = (float) r0
            r2 = r16[r9]
            float r2 = r2 * r10
            float r3 = r2 + r1
            int r1 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r1 <= 0) goto L_0x00cc
            int r1 = r6.T0
            if (r1 <= 0) goto L_0x00b7
            float r0 = (float) r0
            int r2 = r6.O0
            float r2 = (float) r2
            float r2 = r2 / r15
            float r0 = r0 - r2
            float r4 = (float) r8
            float r5 = r4 - r2
            float r1 = (float) r1
            float r3 = r3 - r1
            float r2 = r2 + r4
            r12.set(r0, r5, r3, r2)
            r0 = 2
            r6.x(r7, r14, r12, r0)
            goto L_0x00cc
        L_0x00b7:
            android.graphics.Paint$Style r0 = android.graphics.Paint.Style.STROKE
            r14.setStyle(r0)
            android.graphics.Paint$Cap r0 = android.graphics.Paint.Cap.ROUND
            r14.setStrokeCap(r0)
            int r0 = r6.P0
            float r1 = (float) r0
            float r4 = (float) r8
            r0 = r19
            r2 = r4
            r5 = r14
            r0.drawLine(r1, r2, r3, r4, r5)
        L_0x00cc:
            float r0 = r6.c1
            int r0 = (r11 > r0 ? 1 : (r11 == r0 ? 0 : -1))
            if (r0 <= 0) goto L_0x0194
            int r0 = r6.m1
            float[] r1 = r18.g()
            int r2 = r6.P0
            float r2 = (float) r2
            r3 = 1
            r4 = r1[r3]
            float r0 = (float) r0
            float r4 = r4 * r0
            float r3 = r4 + r2
            r1 = r1[r9]
            float r1 = r1 * r0
            float r1 = r1 + r2
            int r0 = r6.T0
            if (r0 <= 0) goto L_0x00ec
            r0 = 1
            goto L_0x00ed
        L_0x00ec:
            r0 = r9
        L_0x00ed:
            android.graphics.Paint r5 = r6.b
            if (r0 == 0) goto L_0x0183
            java.util.ArrayList r0 = r6.e1
            int r0 = r0.size()
            r2 = 1
            if (r0 != r2) goto L_0x0104
            boolean r0 = r18.k()
            if (r0 == 0) goto L_0x0102
            r0 = r13
            goto L_0x0105
        L_0x0102:
            r0 = 2
            goto L_0x0105
        L_0x0104:
            r0 = 4
        L_0x0105:
            r2 = r9
        L_0x0106:
            java.util.ArrayList r4 = r6.e1
            int r4 = r4.size()
            if (r2 >= r4) goto L_0x0194
            java.util.ArrayList r4 = r6.e1
            int r4 = r4.size()
            r10 = 1
            if (r4 <= r10) goto L_0x0146
            if (r2 <= 0) goto L_0x012b
            java.util.ArrayList r1 = r6.e1
            int r3 = r2 + -1
            java.lang.Object r1 = r1.get(r3)
            java.lang.Float r1 = (java.lang.Float) r1
            float r1 = r1.floatValue()
            float r1 = r6.C(r1)
        L_0x012b:
            java.util.ArrayList r3 = r6.e1
            java.lang.Object r3 = r3.get(r2)
            java.lang.Float r3 = (java.lang.Float) r3
            float r3 = r3.floatValue()
            float r3 = r6.C(r3)
            boolean r4 = r18.k()
            if (r4 == 0) goto L_0x0146
            r17 = r3
            r3 = r1
            r1 = r17
        L_0x0146:
            int r4 = defpackage.tr1.y(r0)
            r10 = 1
            if (r4 == r10) goto L_0x0164
            r10 = 2
            if (r4 == r10) goto L_0x0159
            if (r4 == r13) goto L_0x0153
            goto L_0x016d
        L_0x0153:
            int r4 = r6.T0
            float r4 = (float) r4
            float r1 = r1 + r4
        L_0x0157:
            float r3 = r3 - r4
            goto L_0x016d
        L_0x0159:
            int r4 = r6.T0
            float r4 = (float) r4
            float r1 = r1 + r4
            int r4 = r6.O0
            float r4 = (float) r4
            float r4 = r4 / r15
            float r4 = r4 + r3
            r3 = r4
            goto L_0x016d
        L_0x0164:
            int r4 = r6.O0
            float r4 = (float) r4
            float r4 = r4 / r15
            float r1 = r1 - r4
            int r4 = r6.T0
            float r4 = (float) r4
            goto L_0x0157
        L_0x016d:
            int r4 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r4 < 0) goto L_0x0172
            goto L_0x0180
        L_0x0172:
            float r4 = (float) r8
            int r10 = r6.O0
            float r10 = (float) r10
            float r10 = r10 / r15
            float r11 = r4 - r10
            float r10 = r10 + r4
            r12.set(r1, r11, r3, r10)
            r6.x(r7, r5, r12, r0)
        L_0x0180:
            int r2 = r2 + 1
            goto L_0x0106
        L_0x0183:
            android.graphics.Paint$Style r0 = android.graphics.Paint.Style.STROKE
            r5.setStyle(r0)
            android.graphics.Paint$Cap r0 = android.graphics.Paint.Cap.ROUND
            r5.setStrokeCap(r0)
            float r4 = (float) r8
            r0 = r19
            r2 = r4
            r0.drawLine(r1, r2, r3, r4, r5)
        L_0x0194:
            boolean r0 = r6.j1
            if (r0 == 0) goto L_0x01f0
            float r0 = r6.h1
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 > 0) goto L_0x01a0
            goto L_0x01f0
        L_0x01a0:
            float[] r0 = r18.g()
            r1 = r0[r9]
            float[] r2 = r6.i1
            int r2 = r2.length
            float r2 = (float) r2
            float r2 = r2 / r15
            r3 = 1065353216(0x3f800000, float:1.0)
            float r2 = r2 - r3
            float r2 = r2 * r1
            double r1 = (double) r2
            double r1 = java.lang.Math.ceil(r1)
            int r1 = (int) r1
            r2 = 1
            r0 = r0[r2]
            float[] r2 = r6.i1
            int r2 = r2.length
            float r2 = (float) r2
            float r2 = r2 / r15
            float r2 = r2 - r3
            float r2 = r2 * r0
            double r2 = (double) r2
            double r2 = java.lang.Math.floor(r2)
            int r0 = (int) r2
            android.graphics.Paint r2 = r6.v
            if (r1 <= 0) goto L_0x01d0
            float[] r3 = r6.i1
            int r4 = r1 * 2
            r7.drawPoints(r3, r9, r4, r2)
        L_0x01d0:
            if (r1 > r0) goto L_0x01e2
            float[] r3 = r6.i1
            int r4 = r1 * 2
            int r1 = r0 - r1
            r5 = 1
            int r1 = r1 + r5
            r10 = 2
            int r1 = r1 * r10
            android.graphics.Paint r11 = r6.w
            r7.drawPoints(r3, r4, r1, r11)
            goto L_0x01e4
        L_0x01e2:
            r5 = 1
            r10 = 2
        L_0x01e4:
            int r0 = r0 + r5
            int r0 = r0 * r10
            float[] r1 = r6.i1
            int r3 = r1.length
            if (r0 >= r3) goto L_0x01f0
            int r3 = r1.length
            int r3 = r3 - r0
            r7.drawPoints(r1, r0, r3, r2)
        L_0x01f0:
            int r0 = r6.W0
            if (r0 > 0) goto L_0x01f5
            goto L_0x023d
        L_0x01f5:
            java.util.ArrayList r0 = r6.e1
            int r0 = r0.size()
            android.graphics.Paint r1 = r6.x
            r2 = 1
            if (r0 < r2) goto L_0x021a
            java.util.ArrayList r0 = r6.e1
            java.lang.Object r0 = defpackage.a81.h(r2, r0)
            java.lang.Float r0 = (java.lang.Float) r0
            float r0 = r0.floatValue()
            float r2 = r6.d1
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 >= 0) goto L_0x021a
            float r0 = r6.C(r2)
            float r2 = (float) r8
            r7.drawPoint(r0, r2, r1)
        L_0x021a:
            java.util.ArrayList r0 = r6.e1
            int r0 = r0.size()
            r2 = 1
            if (r0 <= r2) goto L_0x023d
            java.util.ArrayList r0 = r6.e1
            java.lang.Object r0 = r0.get(r9)
            java.lang.Float r0 = (java.lang.Float) r0
            float r0 = r0.floatValue()
            float r2 = r6.c1
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 <= 0) goto L_0x023d
            float r0 = r6.C(r2)
            float r2 = (float) r8
            r7.drawPoint(r0, r2, r1)
        L_0x023d:
            boolean r0 = r6.b1
            if (r0 != 0) goto L_0x0247
            boolean r0 = r18.isFocused()
            if (r0 == 0) goto L_0x027c
        L_0x0247:
            boolean r0 = r18.isEnabled()
            if (r0 == 0) goto L_0x027c
            int r0 = r6.m1
            android.graphics.drawable.Drawable r1 = r18.getBackground()
            boolean r1 = r1 instanceof android.graphics.drawable.RippleDrawable
            r2 = 1
            r1 = r1 ^ r2
            if (r1 == 0) goto L_0x027c
            int r1 = r6.P0
            float r1 = (float) r1
            java.util.ArrayList r2 = r6.e1
            int r3 = r6.g1
            java.lang.Object r2 = r2.get(r3)
            java.lang.Float r2 = (java.lang.Float) r2
            float r2 = r2.floatValue()
            float r2 = r6.o(r2)
            float r0 = (float) r0
            float r2 = r2 * r0
            float r2 = r2 + r1
            int r0 = (int) r2
            float r0 = (float) r0
            float r1 = (float) r8
            int r2 = r6.S0
            float r2 = (float) r2
            android.graphics.Paint r3 = r6.o
            r7.drawCircle(r0, r1, r2, r3)
        L_0x027c:
            r18.w()
            int r10 = r6.m1
        L_0x0281:
            java.util.ArrayList r0 = r6.e1
            int r0 = r0.size()
            if (r9 >= r0) goto L_0x02e7
            java.util.ArrayList r0 = r6.e1
            java.lang.Object r0 = r0.get(r9)
            java.lang.Float r0 = (java.lang.Float) r0
            float r4 = r0.floatValue()
            android.graphics.drawable.Drawable r5 = r6.y1
            if (r5 == 0) goto L_0x02a3
            r0 = r18
            r1 = r19
            r2 = r10
            r3 = r8
            r0.d(r1, r2, r3, r4, r5)
            goto L_0x02e4
        L_0x02a3:
            java.util.List r0 = r6.z1
            int r0 = r0.size()
            if (r9 >= r0) goto L_0x02be
            java.util.List r0 = r6.z1
            java.lang.Object r0 = r0.get(r9)
            r5 = r0
            android.graphics.drawable.Drawable r5 = (android.graphics.drawable.Drawable) r5
            r0 = r18
            r1 = r19
            r2 = r10
            r3 = r8
            r0.d(r1, r2, r3, r4, r5)
            goto L_0x02e4
        L_0x02be:
            boolean r0 = r18.isEnabled()
            if (r0 != 0) goto L_0x02d9
            int r0 = r6.P0
            float r0 = (float) r0
            float r1 = r6.o(r4)
            float r2 = (float) r10
            float r1 = r1 * r2
            float r1 = r1 + r0
            float r0 = (float) r8
            int r2 = r18.getThumbRadius()
            float r2 = (float) r2
            android.graphics.Paint r3 = r6.c
            r7.drawCircle(r1, r0, r2, r3)
        L_0x02d9:
            bh8 r5 = r6.x1
            r0 = r18
            r1 = r19
            r2 = r10
            r3 = r8
            r0.d(r1, r2, r3, r4, r5)
        L_0x02e4:
            int r9 = r9 + 1
            goto L_0x0281
        L_0x02e7:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wk0.onDraw(android.graphics.Canvas):void");
    }

    public final void onFocusChanged(boolean z2, int i, Rect rect) {
        super.onFocusChanged(z2, i, rect);
        uk0 uk0 = this.y;
        if (!z2) {
            this.f1 = -1;
            uk0.j(this.g1);
            return;
        }
        if (i == 1) {
            m(IntCompanionObject.MAX_VALUE);
        } else if (i == 2) {
            m(IntCompanionObject.MIN_VALUE);
        } else if (i == 17) {
            n(IntCompanionObject.MAX_VALUE);
        } else if (i == 66) {
            n(IntCompanionObject.MIN_VALUE);
        }
        uk0.w(this.g1);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v1, resolved type: java.lang.Float} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v6, resolved type: java.lang.Boolean} */
    /* JADX WARNING: type inference failed for: r3v0 */
    /* JADX WARNING: type inference failed for: r3v15 */
    /* JADX WARNING: type inference failed for: r3v16 */
    /* JADX WARNING: type inference failed for: r3v17 */
    /* JADX WARNING: type inference failed for: r3v18 */
    /* JADX WARNING: type inference failed for: r3v19 */
    /* JADX WARNING: type inference failed for: r3v20 */
    /* JADX WARNING: type inference failed for: r3v21 */
    /* JADX WARNING: type inference failed for: r3v22 */
    /* JADX WARNING: type inference failed for: r3v23 */
    /* JADX WARNING: type inference failed for: r3v24 */
    /* JADX WARNING: type inference failed for: r3v25 */
    /* JADX WARNING: type inference failed for: r3v26 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean onKeyDown(int r14, android.view.KeyEvent r15) {
        /*
            r13 = this;
            boolean r0 = r13.isEnabled()
            if (r0 != 0) goto L_0x000b
            boolean r13 = super.onKeyDown(r14, r15)
            return r13
        L_0x000b:
            java.util.ArrayList r0 = r13.e1
            int r0 = r0.size()
            r1 = 0
            r2 = 1
            if (r0 != r2) goto L_0x0017
            r13.f1 = r1
        L_0x0017:
            int r0 = r13.f1
            r3 = 0
            r4 = 70
            r5 = 69
            r6 = 81
            r7 = 66
            r8 = 61
            r9 = -1
            if (r0 != r9) goto L_0x0083
            if (r14 == r8) goto L_0x0057
            if (r14 == r7) goto L_0x004d
            if (r14 == r6) goto L_0x0047
            if (r14 == r5) goto L_0x0041
            if (r14 == r4) goto L_0x0047
            switch(r14) {
                case 21: goto L_0x003b;
                case 22: goto L_0x0035;
                case 23: goto L_0x004d;
                default: goto L_0x0034;
            }
        L_0x0034:
            goto L_0x0077
        L_0x0035:
            r13.n(r2)
            java.lang.Boolean r3 = java.lang.Boolean.TRUE
            goto L_0x0077
        L_0x003b:
            r13.n(r9)
            java.lang.Boolean r3 = java.lang.Boolean.TRUE
            goto L_0x0077
        L_0x0041:
            r13.m(r9)
            java.lang.Boolean r3 = java.lang.Boolean.TRUE
            goto L_0x0077
        L_0x0047:
            r13.m(r2)
            java.lang.Boolean r3 = java.lang.Boolean.TRUE
            goto L_0x0077
        L_0x004d:
            int r0 = r13.g1
            r13.f1 = r0
            r13.postInvalidate()
            java.lang.Boolean r3 = java.lang.Boolean.TRUE
            goto L_0x0077
        L_0x0057:
            boolean r0 = r15.hasNoModifiers()
            if (r0 == 0) goto L_0x0066
            boolean r0 = r13.m(r2)
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r0)
            goto L_0x0077
        L_0x0066:
            boolean r0 = r15.isShiftPressed()
            if (r0 == 0) goto L_0x0075
            boolean r0 = r13.m(r9)
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r0)
            goto L_0x0077
        L_0x0075:
            java.lang.Boolean r3 = java.lang.Boolean.FALSE
        L_0x0077:
            if (r3 == 0) goto L_0x007e
            boolean r13 = r3.booleanValue()
            goto L_0x0082
        L_0x007e:
            boolean r13 = super.onKeyDown(r14, r15)
        L_0x0082:
            return r13
        L_0x0083:
            boolean r0 = r13.n1
            boolean r10 = r15.isLongPress()
            r0 = r0 | r10
            r13.n1 = r0
            r10 = 1065353216(0x3f800000, float:1.0)
            r11 = 0
            if (r0 == 0) goto L_0x00af
            float r0 = r13.h1
            int r11 = (r0 > r11 ? 1 : (r0 == r11 ? 0 : -1))
            if (r11 != 0) goto L_0x0098
            goto L_0x0099
        L_0x0098:
            r10 = r0
        L_0x0099:
            float r0 = r13.d1
            float r11 = r13.c1
            float r0 = r0 - r11
            float r0 = r0 / r10
            r11 = 20
            float r11 = (float) r11
            int r12 = (r0 > r11 ? 1 : (r0 == r11 ? 0 : -1))
            if (r12 > 0) goto L_0x00a7
            goto L_0x00b7
        L_0x00a7:
            float r0 = r0 / r11
            int r0 = java.lang.Math.round(r0)
            float r0 = (float) r0
            float r10 = r10 * r0
            goto L_0x00b7
        L_0x00af:
            float r0 = r13.h1
            int r11 = (r0 > r11 ? 1 : (r0 == r11 ? 0 : -1))
            if (r11 != 0) goto L_0x00b6
            goto L_0x00b7
        L_0x00b6:
            r10 = r0
        L_0x00b7:
            r0 = 21
            if (r14 == r0) goto L_0x00dd
            r0 = 22
            if (r14 == r0) goto L_0x00d1
            if (r14 == r5) goto L_0x00cb
            if (r14 == r4) goto L_0x00c6
            if (r14 == r6) goto L_0x00c6
            goto L_0x00e9
        L_0x00c6:
            java.lang.Float r3 = java.lang.Float.valueOf(r10)
            goto L_0x00e9
        L_0x00cb:
            float r0 = -r10
            java.lang.Float r3 = java.lang.Float.valueOf(r0)
            goto L_0x00e9
        L_0x00d1:
            boolean r0 = r13.k()
            if (r0 == 0) goto L_0x00d8
            float r10 = -r10
        L_0x00d8:
            java.lang.Float r3 = java.lang.Float.valueOf(r10)
            goto L_0x00e9
        L_0x00dd:
            boolean r0 = r13.k()
            if (r0 == 0) goto L_0x00e4
            goto L_0x00e5
        L_0x00e4:
            float r10 = -r10
        L_0x00e5:
            java.lang.Float r3 = java.lang.Float.valueOf(r10)
        L_0x00e9:
            if (r3 == 0) goto L_0x010d
            java.util.ArrayList r14 = r13.e1
            int r15 = r13.f1
            java.lang.Object r14 = r14.get(r15)
            java.lang.Float r14 = (java.lang.Float) r14
            float r14 = r14.floatValue()
            float r15 = r3.floatValue()
            float r15 = r15 + r14
            int r14 = r13.f1
            boolean r14 = r13.s(r15, r14)
            if (r14 == 0) goto L_0x010c
            r13.v()
            r13.postInvalidate()
        L_0x010c:
            return r2
        L_0x010d:
            r0 = 23
            if (r14 == r0) goto L_0x0131
            if (r14 == r8) goto L_0x011a
            if (r14 == r7) goto L_0x0131
            boolean r13 = super.onKeyDown(r14, r15)
            return r13
        L_0x011a:
            boolean r14 = r15.hasNoModifiers()
            if (r14 == 0) goto L_0x0125
            boolean r13 = r13.m(r2)
            return r13
        L_0x0125:
            boolean r14 = r15.isShiftPressed()
            if (r14 == 0) goto L_0x0130
            boolean r13 = r13.m(r9)
            return r13
        L_0x0130:
            return r1
        L_0x0131:
            r13.f1 = r9
            r13.postInvalidate()
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wk0.onKeyDown(int, android.view.KeyEvent):boolean");
    }

    public final boolean onKeyUp(int i, KeyEvent keyEvent) {
        this.n1 = false;
        return super.onKeyUp(i, keyEvent);
    }

    public final void onMeasure(int i, int i2) {
        int i3 = this.M0;
        int i4 = this.N0;
        int i5 = 0;
        if (i4 == 1 || i4 == 3) {
            i5 = ((rmf) this.x0.get(0)).getIntrinsicHeight();
        }
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(i3 + i5, 1073741824));
    }

    public final void onRestoreInstanceState(Parcelable parcelable) {
        vk0 vk0 = (vk0) parcelable;
        super.onRestoreInstanceState(vk0.getSuperState());
        this.c1 = vk0.a;
        this.d1 = vk0.b;
        r(vk0.c);
        this.h1 = vk0.o;
        if (vk0.v) {
            requestFocus();
        }
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [android.view.View$BaseSavedState, android.os.Parcelable, vk0] */
    public final Parcelable onSaveInstanceState() {
        ? baseSavedState = new View.BaseSavedState(super.onSaveInstanceState());
        baseSavedState.a = this.c1;
        baseSavedState.b = this.d1;
        baseSavedState.c = new ArrayList(this.e1);
        baseSavedState.o = this.h1;
        baseSavedState.v = hasFocus();
        return baseSavedState;
    }

    public void onSizeChanged(int i, int i2, int i3, int i4) {
        this.m1 = Math.max(i - (this.P0 * 2), 0);
        l();
        v();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0036, code lost:
        if (r2 != 3) goto L_0x013f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean onTouchEvent(android.view.MotionEvent r8) {
        /*
            r7 = this;
            boolean r0 = r7.isEnabled()
            r1 = 0
            if (r0 != 0) goto L_0x0008
            return r1
        L_0x0008:
            float r0 = r8.getX()
            int r2 = r7.P0
            float r2 = (float) r2
            float r2 = r0 - r2
            int r3 = r7.m1
            float r3 = (float) r3
            float r2 = r2 / r3
            r7.A1 = r2
            r3 = 0
            float r2 = java.lang.Math.max(r3, r2)
            r7.A1 = r2
            r3 = 1065353216(0x3f800000, float:1.0)
            float r2 = java.lang.Math.min(r3, r2)
            r7.A1 = r2
            int r2 = r8.getActionMasked()
            r3 = -1
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L_0x00f2
            int r6 = r7.D0
            if (r2 == r5) goto L_0x0075
            if (r2 == r4) goto L_0x003a
            r0 = 3
            if (r2 == r0) goto L_0x0075
            goto L_0x013f
        L_0x003a:
            boolean r2 = r7.b1
            if (r2 != 0) goto L_0x005b
            boolean r2 = r7.j(r8)
            if (r2 == 0) goto L_0x0051
            float r2 = r7.Z0
            float r0 = r0 - r2
            float r0 = java.lang.Math.abs(r0)
            float r2 = (float) r6
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 >= 0) goto L_0x0051
            return r1
        L_0x0051:
            android.view.ViewParent r0 = r7.getParent()
            r0.requestDisallowInterceptTouchEvent(r5)
            r7.p()
        L_0x005b:
            r0 = r7
            wde r0 = (defpackage.wde) r0
            int r2 = r0.getActiveThumbIndex()
            if (r2 == r3) goto L_0x0065
            goto L_0x0068
        L_0x0065:
            r0.setActiveThumbIndex(r1)
        L_0x0068:
            r7.b1 = r5
            r7.t()
            r7.v()
            r7.invalidate()
            goto L_0x013f
        L_0x0075:
            r7.b1 = r1
            android.view.MotionEvent r0 = r7.a1
            if (r0 == 0) goto L_0x00b8
            int r0 = r0.getActionMasked()
            if (r0 != 0) goto L_0x00b8
            android.view.MotionEvent r0 = r7.a1
            float r0 = r0.getX()
            float r2 = r8.getX()
            float r0 = r0 - r2
            float r0 = java.lang.Math.abs(r0)
            float r2 = (float) r6
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 > 0) goto L_0x00b8
            android.view.MotionEvent r0 = r7.a1
            float r0 = r0.getY()
            float r4 = r8.getY()
            float r0 = r0 - r4
            float r0 = java.lang.Math.abs(r0)
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 > 0) goto L_0x00b8
            r0 = r7
            wde r0 = (defpackage.wde) r0
            int r2 = r0.getActiveThumbIndex()
            if (r2 == r3) goto L_0x00b2
            goto L_0x00b5
        L_0x00b2:
            r0.setActiveThumbIndex(r1)
        L_0x00b5:
            r7.p()
        L_0x00b8:
            int r0 = r7.f1
            if (r0 == r3) goto L_0x00ee
            r7.t()
            r7.v()
            int r0 = r7.T0
            if (r0 <= 0) goto L_0x00d6
            int r0 = r7.U0
            if (r0 == r3) goto L_0x00d6
            int r1 = r7.V0
            if (r1 == r3) goto L_0x00d6
            r7.setThumbWidth(r0)
            int r0 = r7.V0
            r7.setThumbTrackGapSize(r0)
        L_0x00d6:
            r7.f1 = r3
            java.util.ArrayList r0 = r7.z0
            java.util.Iterator r0 = r0.iterator()
            boolean r1 = r0.hasNext()
            if (r1 != 0) goto L_0x00e5
            goto L_0x00ee
        L_0x00e5:
            java.lang.Object r7 = r0.next()
            defpackage.rae.w(r7)
            r7 = 0
            throw r7
        L_0x00ee:
            r7.invalidate()
            goto L_0x013f
        L_0x00f2:
            r7.Z0 = r0
            boolean r0 = r7.j(r8)
            if (r0 == 0) goto L_0x00fb
            goto L_0x013f
        L_0x00fb:
            android.view.ViewParent r0 = r7.getParent()
            r0.requestDisallowInterceptTouchEvent(r5)
            r0 = r7
            wde r0 = (defpackage.wde) r0
            int r2 = r0.getActiveThumbIndex()
            if (r2 == r3) goto L_0x010c
            goto L_0x010f
        L_0x010c:
            r0.setActiveThumbIndex(r1)
        L_0x010f:
            r7.requestFocus()
            r7.b1 = r5
            r7.t()
            r7.v()
            int r0 = r7.T0
            if (r0 <= 0) goto L_0x0139
            int r1 = r7.Q0
            r7.U0 = r1
            r7.V0 = r0
            float r0 = (float) r1
            r1 = 1056964608(0x3f000000, float:0.5)
            float r0 = r0 * r1
            int r0 = java.lang.Math.round(r0)
            int r1 = r7.Q0
            int r1 = r1 - r0
            r7.setThumbWidth(r0)
            int r0 = r7.T0
            int r1 = r1 / r4
            int r0 = r0 - r1
            r7.setThumbTrackGapSize(r0)
        L_0x0139:
            r7.invalidate()
            r7.p()
        L_0x013f:
            boolean r0 = r7.b1
            r7.setPressed(r0)
            android.view.MotionEvent r8 = android.view.MotionEvent.obtain(r8)
            r7.a1 = r8
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wk0.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public final void onVisibilityChanged(View view, int i) {
        p1e n;
        super.onVisibilityChanged(view, i);
        if (i != 0 && (n = ct.n(this)) != null) {
            Iterator it = this.x0.iterator();
            while (it.hasNext()) {
                ((ViewOverlay) n.a).remove((rmf) it.next());
            }
        }
    }

    public final void p() {
        Iterator it = this.z0.iterator();
        if (it.hasNext()) {
            rae.w(it.next());
            throw null;
        }
    }

    public final void q(rmf rmf, float f) {
        String format = String.format(((float) ((int) f)) == f ? "%.0f" : "%.2f", new Object[]{Float.valueOf(f)});
        if (!TextUtils.equals(rmf.H0, format)) {
            rmf.H0 = format;
            rmf.K0.e = true;
            rmf.invalidateSelf();
        }
        int o2 = (this.P0 + ((int) (o(f) * ((float) this.m1)))) - (rmf.getIntrinsicWidth() / 2);
        int b2 = b() - ((this.R0 / 2) + this.Y0);
        rmf.setBounds(o2, b2 - rmf.getIntrinsicHeight(), rmf.getIntrinsicWidth() + o2, b2);
        Rect rect = new Rect(rmf.getBounds());
        im4.b(ct.m(this), this, rect);
        rmf.setBounds(rect);
        ((ViewOverlay) ct.n(this).a).add(rmf);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00ef, code lost:
        r4 = r2.getResourceId(r4, 0);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void r(java.util.ArrayList r11) {
        /*
            r10 = this;
            boolean r0 = r11.isEmpty()
            if (r0 != 0) goto L_0x01f2
            java.util.Collections.sort(r11)
            java.util.ArrayList r0 = r10.e1
            int r0 = r0.size()
            int r1 = r11.size()
            if (r0 != r1) goto L_0x001e
            java.util.ArrayList r0 = r10.e1
            boolean r0 = r0.equals(r11)
            if (r0 == 0) goto L_0x001e
            return
        L_0x001e:
            r10.e1 = r11
            r11 = 1
            r10.o1 = r11
            r0 = 0
            r10.g1 = r0
            r10.v()
            java.util.ArrayList r1 = r10.x0
            int r2 = r1.size()
            java.util.ArrayList r3 = r10.e1
            int r3 = r3.size()
            if (r2 <= r3) goto L_0x007d
            java.util.ArrayList r2 = r10.e1
            int r2 = r2.size()
            int r3 = r1.size()
            java.util.List r2 = r1.subList(r2, r3)
            java.util.Iterator r3 = r2.iterator()
        L_0x0049:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x007a
            java.lang.Object r4 = r3.next()
            rmf r4 = (defpackage.rmf) r4
            java.util.WeakHashMap r5 = defpackage.gag.a
            boolean r5 = r10.isAttachedToWindow()
            if (r5 == 0) goto L_0x0049
            p1e r5 = defpackage.ct.n(r10)
            if (r5 == 0) goto L_0x0049
            java.lang.Object r5 = r5.a
            android.view.ViewOverlay r5 = (android.view.ViewOverlay) r5
            r5.remove(r4)
            android.view.ViewGroup r5 = defpackage.ct.m(r10)
            if (r5 != 0) goto L_0x0074
            r4.getClass()
            goto L_0x0049
        L_0x0074:
            dr0 r4 = r4.L0
            r5.removeOnLayoutChangeListener(r4)
            goto L_0x0049
        L_0x007a:
            r2.clear()
        L_0x007d:
            int r2 = r1.size()
            java.util.ArrayList r3 = r10.e1
            int r3 = r3.size()
            if (r2 >= r3) goto L_0x01a2
            android.content.Context r2 = r10.getContext()
            int r7 = r10.w0
            rmf r9 = new rmf
            r9.<init>(r2, r7)
            int[] r5 = defpackage.tnc.Tooltip
            int[] r8 = new int[r0]
            android.content.Context r3 = r9.I0
            r4 = 0
            r6 = 0
            android.content.res.TypedArray r2 = defpackage.vhf.d(r3, r4, r5, r6, r7, r8)
            android.content.Context r3 = r9.I0
            android.content.res.Resources r4 = r3.getResources()
            int r5 = defpackage.iec.mtrl_tooltip_arrowSize
            int r4 = r4.getDimensionPixelSize(r5)
            r9.S0 = r4
            int r4 = defpackage.tnc.Tooltip_showMarker
            boolean r4 = r2.getBoolean(r4, r11)
            r9.R0 = r4
            if (r4 == 0) goto L_0x00ce
            ah8 r4 = r9.a
            j4e r4 = r4.a
            ypg r4 = r4.e()
            fla r5 = r9.s()
            r4.k = r5
            j4e r4 = r4.c()
            r9.setShapeAppearanceModel(r4)
            goto L_0x00d0
        L_0x00ce:
            r9.S0 = r0
        L_0x00d0:
            int r4 = defpackage.tnc.Tooltip_android_text
            java.lang.CharSequence r4 = r2.getText(r4)
            java.lang.CharSequence r5 = r9.H0
            boolean r5 = android.text.TextUtils.equals(r5, r4)
            dff r6 = r9.K0
            if (r5 != 0) goto L_0x00e7
            r9.H0 = r4
            r6.e = r11
            r9.invalidateSelf()
        L_0x00e7:
            int r4 = defpackage.tnc.Tooltip_android_textAppearance
            boolean r5 = r2.hasValue(r4)
            if (r5 == 0) goto L_0x00fb
            int r4 = r2.getResourceId(r4, r0)
            if (r4 == 0) goto L_0x00fb
            vef r5 = new vef
            r5.<init>(r3, r4)
            goto L_0x00fc
        L_0x00fb:
            r5 = 0
        L_0x00fc:
            if (r5 == 0) goto L_0x010e
            int r4 = defpackage.tnc.Tooltip_android_textColor
            boolean r4 = r2.hasValue(r4)
            if (r4 == 0) goto L_0x010e
            int r4 = defpackage.tnc.Tooltip_android_textColor
            android.content.res.ColorStateList r4 = defpackage.m5a.C(r3, r2, r4)
            r5.j = r4
        L_0x010e:
            r6.c(r5, r3)
            int r4 = defpackage.edc.colorOnBackground
            java.lang.Class<rmf> r5 = defpackage.rmf.class
            java.lang.String r6 = r5.getCanonicalName()
            int r4 = defpackage.ld9.z(r4, r3, r6)
            r6 = 16842801(0x1010031, float:2.3693695E-38)
            java.lang.String r7 = r5.getCanonicalName()
            int r6 = defpackage.ld9.z(r6, r3, r7)
            r7 = 229(0xe5, float:3.21E-43)
            int r6 = defpackage.w53.h(r6, r7)
            r7 = 153(0x99, float:2.14E-43)
            int r4 = defpackage.w53.h(r4, r7)
            int r4 = defpackage.w53.f(r4, r6)
            int r6 = defpackage.tnc.Tooltip_backgroundTint
            int r4 = r2.getColor(r6, r4)
            android.content.res.ColorStateList r4 = android.content.res.ColorStateList.valueOf(r4)
            r9.l(r4)
            int r4 = defpackage.edc.colorSurface
            java.lang.String r5 = r5.getCanonicalName()
            int r3 = defpackage.ld9.z(r4, r3, r5)
            android.content.res.ColorStateList r3 = android.content.res.ColorStateList.valueOf(r3)
            r9.n(r3)
            int r3 = defpackage.tnc.Tooltip_android_padding
            int r3 = r2.getDimensionPixelSize(r3, r0)
            r9.N0 = r3
            int r3 = defpackage.tnc.Tooltip_android_minWidth
            int r3 = r2.getDimensionPixelSize(r3, r0)
            r9.O0 = r3
            int r3 = defpackage.tnc.Tooltip_android_minHeight
            int r3 = r2.getDimensionPixelSize(r3, r0)
            r9.P0 = r3
            int r3 = defpackage.tnc.Tooltip_android_layout_margin
            int r3 = r2.getDimensionPixelSize(r3, r0)
            r9.Q0 = r3
            r2.recycle()
            r1.add(r9)
            java.util.WeakHashMap r2 = defpackage.gag.a
            boolean r2 = r10.isAttachedToWindow()
            if (r2 == 0) goto L_0x007d
            android.view.ViewGroup r2 = defpackage.ct.m(r10)
            if (r2 != 0) goto L_0x018c
            goto L_0x007d
        L_0x018c:
            r3 = 2
            int[] r3 = new int[r3]
            r2.getLocationOnScreen(r3)
            r3 = r3[r0]
            r9.T0 = r3
            android.graphics.Rect r3 = r9.M0
            r2.getWindowVisibleDisplayFrame(r3)
            dr0 r3 = r9.L0
            r2.addOnLayoutChangeListener(r3)
            goto L_0x007d
        L_0x01a2:
            int r2 = r1.size()
            if (r2 != r11) goto L_0x01a9
            r11 = r0
        L_0x01a9:
            java.util.Iterator r1 = r1.iterator()
        L_0x01ad:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x01c2
            java.lang.Object r2 = r1.next()
            rmf r2 = (defpackage.rmf) r2
            float r3 = (float) r11
            ah8 r4 = r2.a
            r4.k = r3
            r2.invalidateSelf()
            goto L_0x01ad
        L_0x01c2:
            java.util.ArrayList r11 = r10.y0
            java.util.Iterator r11 = r11.iterator()
        L_0x01c8:
            boolean r1 = r11.hasNext()
            if (r1 == 0) goto L_0x01ee
            java.lang.Object r1 = r11.next()
            ek0 r1 = (defpackage.ek0) r1
            java.util.ArrayList r2 = r10.e1
            java.util.Iterator r2 = r2.iterator()
        L_0x01da:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x01c8
            java.lang.Object r3 = r2.next()
            java.lang.Float r3 = (java.lang.Float) r3
            float r3 = r3.floatValue()
            r1.A(r10, r3, r0)
            goto L_0x01da
        L_0x01ee:
            r10.postInvalidate()
            return
        L_0x01f2:
            java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
            java.lang.String r11 = "At least one value must be set"
            r10.<init>(r11)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wk0.r(java.util.ArrayList):void");
    }

    public final boolean s(float f, int i) {
        this.g1 = i;
        if (((double) Math.abs(f - ((Float) this.e1.get(i)).floatValue())) < 1.0E-4d) {
            return false;
        }
        float minSeparation = getMinSeparation();
        if (this.B1 == 0) {
            if (minSeparation == c44.DEFAULT_ASPECT_RATIO) {
                minSeparation = 0.0f;
            } else {
                float f2 = (minSeparation - ((float) this.P0)) / ((float) this.m1);
                float f3 = this.c1;
                minSeparation = i2a.f(f3, this.d1, f2, f3);
            }
        }
        if (k()) {
            minSeparation = -minSeparation;
        }
        int i2 = i + 1;
        int i3 = i - 1;
        this.e1.set(i, Float.valueOf(h88.k(f, i3 < 0 ? this.c1 : minSeparation + ((Float) this.e1.get(i3)).floatValue(), i2 >= this.e1.size() ? this.d1 : ((Float) this.e1.get(i2)).floatValue() - minSeparation)));
        Iterator it = this.y0.iterator();
        while (it.hasNext()) {
            ((ek0) it.next()).A(this, ((Float) this.e1.get(i)).floatValue(), true);
        }
        AccessibilityManager accessibilityManager = this.z;
        if (accessibilityManager != null && accessibilityManager.isEnabled()) {
            tk0 tk0 = this.v0;
            if (tk0 == null) {
                this.v0 = new tk0(this);
            } else {
                removeCallbacks(tk0);
            }
            tk0 tk02 = this.v0;
            tk02.b = i;
            postDelayed(tk02, 200);
        }
        return true;
    }

    public void setActiveThumbIndex(int i) {
        this.f1 = i;
    }

    public void setCustomThumbDrawablesForValues(int... iArr) {
        Drawable[] drawableArr = new Drawable[iArr.length];
        for (int i = 0; i < iArr.length; i++) {
            drawableArr[i] = getResources().getDrawable(iArr[i]);
        }
        setCustomThumbDrawablesForValues(drawableArr);
    }

    public void setEnabled(boolean z2) {
        super.setEnabled(z2);
        setLayerType(z2 ? 0 : 2, (Paint) null);
    }

    public abstract void setHaloRadius(int i);

    public abstract void setHaloTintList(ColorStateList colorStateList);

    public abstract void setLabelBehavior(int i);

    public void setSeparationUnit(int i) {
        this.B1 = i;
        this.o1 = true;
        postInvalidate();
    }

    public abstract void setThumbElevation(float f);

    public abstract void setThumbHeight(int i);

    public abstract void setThumbStrokeColor(ColorStateList colorStateList);

    public abstract void setThumbStrokeWidth(float f);

    public abstract void setThumbTrackGapSize(int i);

    public abstract void setThumbWidth(int i);

    public abstract void setTickActiveRadius(int i);

    public abstract void setTickActiveTintList(ColorStateList colorStateList);

    public abstract void setTickInactiveRadius(int i);

    public abstract void setTickInactiveTintList(ColorStateList colorStateList);

    public abstract void setTrackActiveTintList(ColorStateList colorStateList);

    public abstract void setTrackHeight(int i);

    public abstract void setTrackInactiveTintList(ColorStateList colorStateList);

    public abstract void setTrackInsideCornerSize(int i);

    public abstract void setTrackStopIndicatorSize(int i);

    public void setValues(Float... fArr) {
        ArrayList arrayList = new ArrayList();
        Collections.addAll(arrayList, fArr);
        r(arrayList);
    }

    public final void t() {
        double d;
        float f = this.A1;
        float f2 = this.h1;
        if (f2 > c44.DEFAULT_ASPECT_RATIO) {
            int i = (int) ((this.d1 - this.c1) / f2);
            d = ((double) Math.round(f * ((float) i))) / ((double) i);
        } else {
            d = (double) f;
        }
        if (k()) {
            d = 1.0d - d;
        }
        float f3 = this.d1;
        float f4 = this.c1;
        s((float) ((d * ((double) (f3 - f4))) + ((double) f4)), this.f1);
    }

    public final void u(int i, Rect rect) {
        int o2 = this.P0 + ((int) (o(getValues().get(i).floatValue()) * ((float) this.m1)));
        int b2 = b();
        int max = Math.max(this.Q0 / 2, this.K0 / 2);
        int max2 = Math.max(this.R0 / 2, this.K0 / 2);
        rect.set(o2 - max, b2 - max2, o2 + max, b2 + max2);
    }

    public final void v() {
        if (!(!(getBackground() instanceof RippleDrawable)) && getMeasuredWidth() > 0) {
            Drawable background = getBackground();
            if (background instanceof RippleDrawable) {
                int o2 = (int) ((o(((Float) this.e1.get(this.g1)).floatValue()) * ((float) this.m1)) + ((float) this.P0));
                int b2 = b();
                int i = this.S0;
                ru4.f(background, o2 - i, b2 - i, o2 + i, b2 + i);
            }
        }
    }

    public final void w() {
        int i = this.N0;
        if (i == 0 || i == 1) {
            if (this.f1 == -1 || !isEnabled()) {
                f();
            } else {
                e();
            }
        } else if (i == 2) {
            f();
        } else if (i == 3) {
            if (isEnabled()) {
                Rect rect = new Rect();
                ct.m(this).getHitRect(rect);
                if (getLocalVisibleRect(rect)) {
                    e();
                    return;
                }
            }
            f();
        } else {
            throw new IllegalArgumentException("Unexpected labelBehavior: " + this.N0);
        }
    }

    public final void x(Canvas canvas, Paint paint, RectF rectF, int i) {
        float f;
        float f2 = ((float) this.O0) / 2.0f;
        int y2 = tr1.y(i);
        if (y2 == 1) {
            f = (float) this.X0;
        } else if (y2 != 2) {
            if (y2 == 3) {
                f2 = (float) this.X0;
            }
            f = f2;
        } else {
            f = f2;
            f2 = (float) this.X0;
        }
        paint.setStyle(Paint.Style.FILL);
        paint.setStrokeCap(Paint.Cap.BUTT);
        paint.setAntiAlias(true);
        Path path = this.u1;
        path.reset();
        if (rectF.width() >= f2 + f) {
            path.addRoundRect(rectF, new float[]{f2, f2, f, f, f, f, f2, f2}, Path.Direction.CW);
            canvas.drawPath(path, paint);
            return;
        }
        float min = Math.min(f2, f);
        float max = Math.max(f2, f);
        canvas.save();
        path.addRoundRect(rectF, min, min, Path.Direction.CW);
        canvas.clipPath(path);
        int y3 = tr1.y(i);
        RectF rectF2 = this.w1;
        if (y3 == 1) {
            float f3 = rectF.left;
            rectF2.set(f3, rectF.top, (2.0f * max) + f3, rectF.bottom);
        } else if (y3 != 2) {
            rectF2.set(rectF.centerX() - max, rectF.top, rectF.centerX() + max, rectF.bottom);
        } else {
            float f4 = rectF.right;
            rectF2.set(f4 - (2.0f * max), rectF.top, f4, rectF.bottom);
        }
        canvas.drawRoundRect(rectF2, max, max, paint);
        canvas.restore();
    }

    public final void y() {
        boolean z2;
        int max = Math.max(this.L0, Math.max(this.O0 + getPaddingBottom() + getPaddingTop(), getPaddingBottom() + getPaddingTop() + this.R0));
        boolean z3 = false;
        if (max == this.M0) {
            z2 = false;
        } else {
            this.M0 = max;
            z2 = true;
        }
        int max2 = Math.max(Math.max(Math.max((this.Q0 / 2) - this.F0, 0), Math.max((this.O0 - this.G0) / 2, 0)), Math.max(Math.max(this.k1 - this.H0, 0), Math.max(this.l1 - this.I0, 0))) + this.E0;
        if (this.P0 != max2) {
            this.P0 = max2;
            WeakHashMap weakHashMap = gag.a;
            if (isLaidOut()) {
                this.m1 = Math.max(getWidth() - (this.P0 * 2), 0);
                l();
            }
            z3 = true;
        }
        if (z2) {
            requestLayout();
        } else if (z3) {
            postInvalidate();
        }
    }

    public final void z() {
        if (this.o1) {
            float f = this.c1;
            float f2 = this.d1;
            if (f >= f2) {
                float f3 = this.c1;
                float f4 = this.d1;
                throw new IllegalStateException("valueFrom(" + f3 + ") must be smaller than valueTo(" + f4 + ")");
            } else if (f2 <= f) {
                float f5 = this.d1;
                float f6 = this.c1;
                throw new IllegalStateException("valueTo(" + f5 + ") must be greater than valueFrom(" + f6 + ")");
            } else if (this.h1 <= c44.DEFAULT_ASPECT_RATIO || B(f2)) {
                Iterator it = this.e1.iterator();
                while (it.hasNext()) {
                    Float f7 = (Float) it.next();
                    if (f7.floatValue() < this.c1 || f7.floatValue() > this.d1) {
                        float f8 = this.c1;
                        float f9 = this.d1;
                        throw new IllegalStateException("Slider value(" + f7 + ") must be greater or equal to valueFrom(" + f8 + "), and lower or equal to valueTo(" + f9 + ")");
                    } else if (this.h1 > c44.DEFAULT_ASPECT_RATIO && !B(f7.floatValue())) {
                        float f10 = this.c1;
                        float f11 = this.h1;
                        throw new IllegalStateException("Value(" + f7 + ") must be equal to valueFrom(" + f10 + ") plus a multiple of stepSize(" + f11 + ") when using stepSize(" + f11 + ")");
                    }
                }
                float minSeparation = getMinSeparation();
                if (minSeparation >= c44.DEFAULT_ASPECT_RATIO) {
                    float f12 = this.h1;
                    if (f12 > c44.DEFAULT_ASPECT_RATIO && minSeparation > c44.DEFAULT_ASPECT_RATIO) {
                        if (this.B1 != 1) {
                            float f13 = this.h1;
                            throw new IllegalStateException("minSeparation(" + minSeparation + ") cannot be set as a dimension when using stepSize(" + f13 + ")");
                        } else if (minSeparation < f12 || !i((double) minSeparation)) {
                            float f14 = this.h1;
                            throw new IllegalStateException("minSeparation(" + minSeparation + ") must be greater or equal and a multiple of stepSize(" + f14 + ") when using stepSize(" + f14 + ")");
                        }
                    }
                    this.o1 = false;
                    return;
                }
                throw new IllegalStateException("minSeparation(" + minSeparation + ") must be greater or equal to 0");
            } else {
                float f15 = this.h1;
                float f16 = this.c1;
                float f17 = this.d1;
                throw new IllegalStateException("The stepSize(" + f15 + ") must be 0, or a factor of the valueFrom(" + f16 + ")-valueTo(" + f17 + ") range");
            }
        }
    }

    public void setValues(List<Float> list) {
        r(new ArrayList(list));
    }

    public void setCustomThumbDrawablesForValues(Drawable... drawableArr) {
        this.y1 = null;
        this.z1 = new ArrayList();
        for (Drawable mutate : drawableArr) {
            List list = this.z1;
            Drawable newDrawable = mutate.mutate().getConstantState().newDrawable();
            a(newDrawable);
            list.add(newDrawable);
        }
        postInvalidate();
    }
}
