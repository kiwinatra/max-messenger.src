package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import androidx.appcompat.widget.AppCompatImageButton;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.math.MathKt;
import ru.ok.messages.stickers.widgets.StickerView;

/* renamed from: ve9  reason: default package */
public final class ve9 extends FrameLayout implements cse, bif, o23 {
    public final int a = getContext().getResources().getDimensionPixelSize(ydc.attach_drawable);
    public a89 b;
    public l20 c;
    public final r20 o;
    public final te9 v;
    public gb8 v0;
    public AppCompatImageButton w;
    public View.OnLongClickListener w0;
    public final rf9 x;
    public final Lazy x0;
    public final fa9 y;
    public ue9 z;

    public ve9(Context context) {
        super(context, (AttributeSet) null, 0);
        this.o = new r20(context);
        sjd sjd = (sjd) tr1.h((qra) ym.e());
        this.x = (rf9) sjd.getAccessor().g(rf9.class);
        this.y = sjd.r();
        te9 te9 = new te9(this, getContext());
        this.v = te9;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        int roundToInt = MathKt.roundToInt(((float) 4) * vo4.c().getDisplayMetrics().density);
        layoutParams.setMargins(roundToInt, roundToInt, roundToInt, roundToInt);
        Unit unit = Unit.INSTANCE;
        addView(te9, layoutParams);
        c();
        this.x0 = LazyKt.lazy(new j35(22, (Object) context, (Object) this));
    }

    private final GestureDetector getGestureDetector() {
        return (GestureDetector) this.x0.getValue();
    }

    public final boolean a() {
        a89 a89 = this.b;
        return (a89 == null || this.c == null || t20.b(a89.a)) ? false : true;
    }

    /* JADX WARNING: type inference failed for: r1v1, types: [android.view.ViewGroup$LayoutParams] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void b(boolean r13) {
        /*
            r12 = this;
            r0 = 2
            te9 r1 = r12.v
            boe r2 = r1.y
            if (r2 != 0) goto L_0x0008
            return
        L_0x0008:
            boolean r3 = r2.w0
            r4 = 8
            if (r3 != 0) goto L_0x011d
            java.lang.String r2 = r2.w
            boolean r2 = defpackage.cvg.A(r2)
            r2 = r2 ^ 1
            if (r2 != 0) goto L_0x001a
            goto L_0x011d
        L_0x001a:
            androidx.appcompat.widget.AppCompatImageButton r2 = r12.w
            r3 = 0
            if (r2 != 0) goto L_0x0112
            if (r13 != 0) goto L_0x0022
            return
        L_0x0022:
            androidx.appcompat.widget.AppCompatImageButton r2 = new androidx.appcompat.widget.AppCompatImageButton
            android.content.Context r5 = r12.getContext()
            r11 = 0
            r2.<init>(r5, r11)
            r12.w = r2
            android.widget.ImageView$ScaleType r5 = android.widget.ImageView.ScaleType.CENTER_INSIDE
            r2.setScaleType(r5)
            r5 = 6
            float r5 = (float) r5
            android.content.res.Resources r6 = defpackage.vo4.c()
            android.util.DisplayMetrics r6 = r6.getDisplayMetrics()
            float r6 = r6.density
            float r5 = r5 * r6
            int r5 = kotlin.math.MathKt.roundToInt((float) r5)
            r2.setPadding(r5, r5, r5, r5)
            int r5 = defpackage.nad.f1
            r2.setImageResource(r5)
            float r5 = (float) r4
            android.content.res.Resources r6 = defpackage.vo4.c()
            android.util.DisplayMetrics r6 = r6.getDisplayMetrics()
            float r6 = r6.density
            float r6 = r6 * r5
            int r6 = kotlin.math.MathKt.roundToInt((float) r6)
            android.content.res.Resources r7 = defpackage.vo4.c()
            android.util.DisplayMetrics r7 = r7.getDisplayMetrics()
            float r7 = r7.density
            float r7 = r7 * r5
            int r7 = kotlin.math.MathKt.roundToInt((float) r7)
            android.content.res.Resources r8 = defpackage.vo4.c()
            android.util.DisplayMetrics r8 = r8.getDisplayMetrics()
            float r8 = r8.density
            float r8 = r8 * r5
            int r8 = kotlin.math.MathKt.roundToInt((float) r8)
            android.content.res.Resources r9 = defpackage.vo4.c()
            android.util.DisplayMetrics r9 = r9.getDisplayMetrics()
            float r9 = r9.density
            float r5 = r5 * r9
            int r9 = kotlin.math.MathKt.roundToInt((float) r5)
            r5 = r6
            r6 = r7
            r7 = r8
            r8 = r9
            r9 = r12
            r10 = r2
            defpackage.b59.x(r5, r6, r7, r8, r9, r10)
            android.widget.FrameLayout$LayoutParams r5 = new android.widget.FrameLayout$LayoutParams
            r6 = 28
            float r6 = (float) r6
            android.content.res.Resources r7 = defpackage.vo4.c()
            android.util.DisplayMetrics r7 = r7.getDisplayMetrics()
            float r7 = r7.density
            float r7 = r7 * r6
            int r7 = kotlin.math.MathKt.roundToInt((float) r7)
            android.content.res.Resources r8 = defpackage.vo4.c()
            android.util.DisplayMetrics r8 = r8.getDisplayMetrics()
            float r8 = r8.density
            float r6 = r6 * r8
            int r6 = kotlin.math.MathKt.roundToInt((float) r6)
            r5.<init>(r7, r6)
            android.view.ViewGroup$LayoutParams r6 = r1.getLayoutParams()
            boolean r7 = r6 instanceof android.view.ViewGroup.MarginLayoutParams
            if (r7 == 0) goto L_0x00c7
            android.view.ViewGroup$MarginLayoutParams r6 = (android.view.ViewGroup.MarginLayoutParams) r6
            int r6 = r6.getMarginEnd()
            goto L_0x00c8
        L_0x00c7:
            r6 = r3
        L_0x00c8:
            float r7 = (float) r0
            android.content.res.Resources r8 = defpackage.vo4.c()
            android.util.DisplayMetrics r8 = r8.getDisplayMetrics()
            float r8 = r8.density
            float r8 = r8 * r7
            int r8 = kotlin.math.MathKt.roundToInt((float) r8)
            int r8 = r8 + r6
            r5.setMarginEnd(r8)
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            boolean r6 = r1 instanceof android.view.ViewGroup.MarginLayoutParams
            if (r6 == 0) goto L_0x00e7
            r11 = r1
            android.view.ViewGroup$MarginLayoutParams r11 = (android.view.ViewGroup.MarginLayoutParams) r11
        L_0x00e7:
            if (r11 == 0) goto L_0x00ec
            int r1 = r11.bottomMargin
            goto L_0x00ed
        L_0x00ec:
            r1 = r3
        L_0x00ed:
            android.content.res.Resources r6 = defpackage.vo4.c()
            android.util.DisplayMetrics r6 = r6.getDisplayMetrics()
            float r6 = r6.density
            int r1 = defpackage.g63.b(r7, r6, r1)
            r5.bottomMargin = r1
            r1 = 8388693(0x800055, float:1.1755063E-38)
            r5.gravity = r1
            kotlin.Unit r1 = kotlin.Unit.INSTANCE
            r12.addView(r2, r5)
            u99 r1 = new u99
            r1.<init>((int) r0, (java.lang.Object) r12)
            defpackage.ct.G(r2, 300, r1)
            r12.c()
        L_0x0112:
            androidx.appcompat.widget.AppCompatImageButton r12 = r12.w
            if (r12 == 0) goto L_0x011c
            if (r13 == 0) goto L_0x0119
            r4 = r3
        L_0x0119:
            r12.setVisibility(r4)
        L_0x011c:
            return
        L_0x011d:
            androidx.appcompat.widget.AppCompatImageButton r12 = r12.w
            if (r12 == 0) goto L_0x0124
            r12.setVisibility(r4)
        L_0x0124:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ve9.b(boolean):void");
    }

    public final void c() {
        scf scf;
        if (!isInEditMode()) {
            if (isInEditMode()) {
                scf = vi4.f0;
            } else {
                Context context = getContext();
                Lazy lazy = scf.b0;
                scf = j4b.k0(context);
            }
            AppCompatImageButton appCompatImageButton = this.w;
            if (appCompatImageButton != null) {
                appCompatImageButton.setColorFilter(scf.u, PorterDuff.Mode.SRC_IN);
                int i = scf.s;
                appCompatImageButton.setBackground(i8b.T(i8b.K(Integer.valueOf(i), (Integer) null, (Integer) null), i8b.K(Integer.valueOf(j4b.l0(0.8f, i)), (Integer) null, (Integer) null), (GradientDrawable) null));
            }
        }
    }

    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        if (a()) {
            this.o.b(canvas, true);
        }
    }

    public List<View> getClickableChildren() {
        te9 te9 = this.v;
        return CollectionsKt.listOf(te9, te9.z, te9.v0);
    }

    public final StickerView getStickerView() {
        return this.v;
    }

    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return a();
    }

    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        int measuredWidth = getMeasuredWidth() / 2;
        int measuredHeight = getMeasuredHeight() / 2;
        int i5 = this.a / 2;
        this.o.setBounds(measuredWidth - i5, measuredHeight - i5, measuredWidth + i5, measuredHeight + i5);
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (a()) {
            return getGestureDetector().onTouchEvent(motionEvent);
        }
        return true;
    }

    public final void setListener(ue9 ue9) {
        this.z = ue9;
    }

    public final void setLottieLayer(gb8 gb8) {
        this.v0 = gb8;
        this.v.setLottieLayer(gb8);
    }

    public void setOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        super.setOnLongClickListener(onLongClickListener);
        this.v.setOnLongClickListener(onLongClickListener);
        this.w0 = onLongClickListener;
    }

    public final void setStickerMediaPlayerController(ju8 ju8) {
        this.v.setStickerMediaPlayerController(ju8);
    }
}
