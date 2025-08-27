package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.text.Layout;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import androidx.appcompat.widget.AppCompatTextView;
import java.util.Collection;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.IntCompanionObject;
import kotlin.math.MathKt;
import kotlin.ranges.RangesKt;
import kotlin.uuid.Uuid;

/* renamed from: a6e  reason: default package */
public final class a6e extends ViewGroup implements a84, dsd, wff, yy6, tsc, tc9, l6b, asd, iy7 {
    public final Lazy A0;
    public final Lazy B0;
    public final Lazy C0;
    public final Lazy D0;
    public final z74 E0;
    public final krc a;
    public final oc9 b;
    public final m6b c;
    public final yrd o;
    public final Function1 v;
    public final Lazy v0;
    public ws0 w;
    public final Lazy w0;
    public final Paint x;
    public final esd x0;
    public final Rect y = new Rect();
    public p23 y0;
    public boolean z;
    public final lf9 z0;

    /* JADX WARNING: type inference failed for: r2v0, types: [m6b, java.lang.Object] */
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public a6e(Context context, hq7 hq7) {
        super(context);
        krc krc = new krc();
        oc9 oc9 = new oc9();
        ? obj = new Object();
        yrd yrd = new yrd();
        this.a = krc;
        this.b = oc9;
        this.c = obj;
        this.o = yrd;
        this.v = hq7;
        js9 js9 = fu4.k;
        this.w = js9.e(getContext()).f().a().a(true);
        Paint paint = new Paint(1);
        paint.setColor(getInternalBubbleBackgroundColor());
        this.x = paint;
        y5e y5e = new y5e(this, 0);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.v0 = LazyKt.lazy(lazyThreadSafetyMode, y5e);
        this.w0 = LazyKt.lazy(lazyThreadSafetyMode, new y5e(this, 1));
        this.x0 = new esd(this);
        lf9 lf9 = new lf9(context, 0);
        lf9.setId(cwa.N);
        lf9.setLinkLongClickListener(new nqd(6, this));
        lf9.setOnLongClickListener(new z20(16, this));
        lf9.setSingleClickAction(new z5e(this, 0));
        lf9.setTryToSingleClickAction(new z5e(this, 1));
        this.z0 = lf9;
        this.A0 = LazyKt.lazy(lazyThreadSafetyMode, new x5e(context, this, 1));
        this.B0 = LazyKt.lazy(lazyThreadSafetyMode, new x5e(context, this, 2));
        this.C0 = LazyKt.lazy(lazyThreadSafetyMode, new x5e(context, this, 3));
        this.D0 = LazyKt.lazy(lazyThreadSafetyMode, new x5e(context, this, 0));
        z74 z74 = new z74(context);
        z74.setBackgroundEnabled(false);
        this.E0 = z74;
        krc.b = this;
        oc9.b = this;
        yrd.b = this;
        addView(lf9, new ViewGroup.LayoutParams(-2, -2));
        addView(z74, new ViewGroup.LayoutParams(-2, -2));
        setClipChildren(true);
        setClickable(true);
        setOutlineProvider(ViewOutlineProvider.BACKGROUND);
        ejd ejd = r89.y;
        k2b f = js9.e(getContext()).f();
        ejd.getClass();
        setBackground(ejd.a(f));
        setTransitionGroup(true);
    }

    public static AppCompatTextView a(Context context, a6e a6e) {
        AppCompatTextView appCompatTextView = new AppCompatTextView(context, (AttributeSet) null);
        ogf ogf = puf.a;
        tr2.k.b(appCompatTextView, uy4.b);
        appCompatTextView.setTextColor(a6e.getAdditionalTextColor());
        appCompatTextView.setEmojiCompatEnabled(false);
        appCompatTextView.setMaxLines(1);
        appCompatTextView.setEllipsize(TextUtils.TruncateAt.END);
        a6e.addView(appCompatTextView, new ViewGroup.LayoutParams(-2, -2));
        return appCompatTextView;
    }

    public static RippleDrawable b(a6e a6e) {
        float f = vo4.c().getDisplayMetrics().density * 12.0f;
        int internalBubbleBackgroundContentColor = a6e.getInternalBubbleBackgroundContentColor();
        float[] fArr = new float[8];
        for (int i = 0; i < 8; i++) {
            fArr[i] = f;
        }
        return new RippleDrawable(ColorStateList.valueOf(internalBubbleBackgroundContentColor), (Drawable) null, new ShapeDrawable(new RoundRectShape(fArr, (RectF) null, (float[]) null)));
    }

    public static AppCompatTextView c(Context context, a6e a6e) {
        AppCompatTextView appCompatTextView = new AppCompatTextView(context, (AttributeSet) null);
        ogf ogf = puf.a;
        tr2.f.b(appCompatTextView, uy4.b);
        appCompatTextView.setTextColor(a6e.getAdditionalTextColor());
        appCompatTextView.setEmojiCompatEnabled(false);
        appCompatTextView.setMaxLines(5);
        appCompatTextView.setEllipsize(TextUtils.TruncateAt.END);
        a6e.addView(appCompatTextView, new ViewGroup.LayoutParams(-2, -2));
        return appCompatTextView;
    }

    public static AppCompatTextView f(Context context, a6e a6e) {
        AppCompatTextView appCompatTextView = new AppCompatTextView(context, (AttributeSet) null);
        ogf ogf = puf.a;
        tr2.i.b(appCompatTextView, uy4.b);
        appCompatTextView.setTextColor(a6e.getTitleColor());
        appCompatTextView.setEmojiCompatEnabled(false);
        appCompatTextView.setMaxLines(3);
        appCompatTextView.setEllipsize(TextUtils.TruncateAt.END);
        a6e.addView(appCompatTextView, new ViewGroup.LayoutParams(-2, -2));
        return appCompatTextView;
    }

    private final int getAdditionalTextColor() {
        return this.w.b.e;
    }

    /* access modifiers changed from: private */
    public final ShapeDrawable getBorderDrawable() {
        return (ShapeDrawable) this.w0.getValue();
    }

    private final int getInternalBubbleBackgroundBorderColor() {
        return this.w.d.c;
    }

    private final int getInternalBubbleBackgroundColor() {
        return this.w.a.h;
    }

    private final int getInternalBubbleBackgroundContentColor() {
        fu4.k.e(getContext()).f().b().a.getClass();
        return -1907998;
    }

    /* access modifiers changed from: private */
    public final RippleDrawable getRippleDrawable() {
        return (RippleDrawable) this.v0.getValue();
    }

    private final int getTitleColor() {
        return this.w.b.d;
    }

    public static ShapeDrawable i(a6e a6e) {
        float f = vo4.c().getDisplayMetrics().density * 12.0f;
        float[] fArr = new float[8];
        for (int i = 0; i < 8; i++) {
            fArr[i] = f;
        }
        ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(fArr, (RectF) null, (float[]) null));
        shapeDrawable.getPaint().setColor(a6e.getInternalBubbleBackgroundBorderColor());
        shapeDrawable.getPaint().setStrokeWidth(vo4.c().getDisplayMetrics().density * 1.0f);
        shapeDrawable.getPaint().setStyle(Paint.Style.STROKE);
        return shapeDrawable;
    }

    public final void d(List list, Function2 function2) {
        lf9 lf9 = this.z0;
        CharSequence text = lf9.getText();
        if (text != null) {
            Collection collection = list;
            if (collection == null || collection.isEmpty() || function2 == null) {
                lf9.b(true);
            } else {
                lf9.c((List) function2.invoke(text.toString(), list));
            }
        }
    }

    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        RippleDrawable rippleDrawable = getRippleDrawable();
        Rect rect = this.y;
        rippleDrawable.setBounds(rect);
        getRippleDrawable().draw(canvas);
        getBorderDrawable().setBounds(rect);
        getBorderDrawable().draw(canvas);
    }

    public final void drawableStateChanged() {
        super.drawableStateChanged();
        getRippleDrawable().setState(getDrawableState());
        getBorderDrawable().setState(getDrawableState());
        invalidate();
    }

    public final void e(ws0 ws0) {
        this.b.e(ws0);
    }

    public final void g(xd9 xd9, boolean z2) {
        this.a.g(xd9, z2);
    }

    public int getAliasWidthWithPaddings() {
        return this.o.g0();
    }

    public boolean getDependOnOutsideView() {
        return this.c.a;
    }

    public p23 getOnLinkLongClickListener() {
        return this.y0;
    }

    public final void h(CharSequence charSequence, boolean z2) {
        this.E0.c(charSequence, z2);
    }

    public final void l(ws0 ws0, boolean z2) {
        this.a.l(ws0, z2);
    }

    public final void m(ws0 ws0) {
        this.w = ws0;
        Lazy lazy = this.B0;
        if (lazy.isInitialized()) {
            ((AppCompatTextView) lazy.getValue()).setTextColor(getTitleColor());
        }
        Lazy lazy2 = this.A0;
        if (lazy2.isInitialized()) {
            ((AppCompatTextView) lazy2.getValue()).setTextColor(getAdditionalTextColor());
        }
        Lazy lazy3 = this.C0;
        if (lazy3.isInitialized()) {
            ((AppCompatTextView) lazy3.getValue()).setTextColor(getAdditionalTextColor());
        }
        this.x.setColor(getInternalBubbleBackgroundColor());
        getRippleDrawable().setColor(ColorStateList.valueOf(getInternalBubbleBackgroundContentColor()));
        getBorderDrawable().getPaint().setColor(getInternalBubbleBackgroundBorderColor());
        setDateTextColor(ws0.c.a);
    }

    public final void n() {
        this.b.n();
    }

    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Rect rect = this.y;
        if (!rect.isEmpty()) {
            float f = vo4.c().getDisplayMetrics().density * 12.0f;
            canvas.drawRoundRect(new RectF(rect), f, f, this.x);
        }
    }

    public final void onLayout(boolean z2, int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        float f = (float) 10;
        int roundToInt = MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f);
        float f2 = (float) 8;
        int roundToInt2 = MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f2);
        int roundToInt3 = MathKt.roundToInt(f2 * vo4.c().getDisplayMetrics().density);
        esd esd = this.x0;
        if (y7e.L(esd.b)) {
            esd.c(roundToInt, roundToInt3);
            i5 = g63.b((float) 4, vo4.c().getDisplayMetrics().density, esd.a() + roundToInt3);
        } else {
            i5 = roundToInt;
        }
        yrd yrd = this.o;
        if (y7e.L((Lazy) yrd.c) && y7e.L(esd.b)) {
            yrd.S((getMeasuredWidth() - roundToInt) - yrd.L(), ((esd.a() / 2) - (yrd.K() / 2)) + roundToInt3);
        }
        oc9 oc9 = this.b;
        if (y7e.L((Lazy) oc9.c)) {
            oc9.S(roundToInt, i5);
            i5 += oc9.K();
        }
        lf9 lf9 = this.z0;
        ev0.x(lf9, roundToInt, i5, 0, 12);
        int roundToInt4 = MathKt.roundToInt(((float) 6) * vo4.c().getDisplayMetrics().density) + lf9.getMeasuredHeight() + i5 + roundToInt2;
        int i7 = roundToInt + roundToInt2;
        Lazy lazy = this.A0;
        if (y7e.L(lazy)) {
            AppCompatTextView appCompatTextView = (AppCompatTextView) lazy.getValue();
            ev0.x(appCompatTextView, i7, roundToInt4, 0, 12);
            i6 = appCompatTextView.getMeasuredHeight() + roundToInt4;
        } else {
            i6 = roundToInt4;
        }
        Lazy lazy2 = this.B0;
        if (y7e.L(lazy2)) {
            AppCompatTextView appCompatTextView2 = (AppCompatTextView) lazy2.getValue();
            ev0.x(appCompatTextView2, i7, i6, 0, 12);
            i6 += appCompatTextView2.getMeasuredHeight();
        }
        Lazy lazy3 = this.C0;
        if (y7e.L(lazy3)) {
            AppCompatTextView appCompatTextView3 = (AppCompatTextView) lazy3.getValue();
            ev0.x(appCompatTextView3, i7, i6, 0, 12);
            i6 += appCompatTextView3.getMeasuredHeight();
        }
        Lazy lazy4 = this.D0;
        if (y7e.L(lazy4)) {
            s87 s87 = (s87) lazy4.getValue();
            boolean z3 = this.z;
            if (z3) {
                roundToInt4 = i6 + roundToInt2;
            }
            ev0.x(s87, z3 ? roundToInt : ((getMeasuredWidth() - roundToInt) - roundToInt2) - s87.getMeasuredWidth(), roundToInt4, 0, 12);
            float f3 = this.z ? c44.DEFAULT_ASPECT_RATIO : vo4.c().getDisplayMetrics().density * 4.0f;
            float f4 = this.z ? vo4.c().getDisplayMetrics().density * 12.0f : 4.0f * vo4.c().getDisplayMetrics().density;
            ((sp6) s87.getHierarchy()).n(b9d.a(f3, f3, f4, f4));
            s87.getMeasuredHeight();
        }
        krc krc = this.a;
        if (y7e.L((Lazy) krc.c)) {
            krc.S(MathKt.roundToInt(f * vo4.c().getDisplayMetrics().density), a81.e((float) 2, vo4.c().getDisplayMetrics().density, a81.e(f, vo4.c().getDisplayMetrics().density, getMeasuredHeight())) - krc.K());
        }
        int measuredWidth = getMeasuredWidth();
        z74 z74 = this.E0;
        ev0.x(z74, (measuredWidth - z74.getMeasuredWidth()) - roundToInt, a81.e((float) 4, vo4.c().getDisplayMetrics().density, getMeasuredHeight() - z74.getMeasuredHeight()), 0, 12);
    }

    public final void onMeasure(int i, int i2) {
        int i3;
        int i4;
        int i5 = i2;
        int size = getDependOnOutsideView() ? View.MeasureSpec.getSize(i) : a81.f((float) 10, vo4.c().getDisplayMetrics().density, 2, View.MeasureSpec.getSize(i));
        float f = (float) 10;
        int roundToInt = MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f);
        lf9 lf9 = this.z0;
        lf9.d();
        int i6 = roundToInt * 2;
        int max = Math.max(lf9.getMeasuredWidth() + i6, size);
        int i7 = max - i6;
        float f2 = (float) 8;
        int roundToInt2 = MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f2);
        yrd yrd = this.o;
        boolean L = y7e.L((Lazy) yrd.c);
        esd esd = this.x0;
        if (L && y7e.L(esd.b)) {
            yrd.T(View.MeasureSpec.makeMeasureSpec(i7, IntCompanionObject.MIN_VALUE), i5);
            max = Math.max(max, yrd.L());
        }
        if (y7e.L(esd.b)) {
            esd.d(View.MeasureSpec.makeMeasureSpec(i7, IntCompanionObject.MIN_VALUE), i5);
            max = Math.max(max, esd.b() + i6 + yrd.g0());
            i3 = g63.b((float) 4, vo4.c().getDisplayMetrics().density, esd.a() + MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f2));
        } else {
            i3 = roundToInt;
        }
        oc9 oc9 = this.b;
        if (y7e.L((Lazy) oc9.c)) {
            oc9.T(View.MeasureSpec.makeMeasureSpec(max, IntCompanionObject.MIN_VALUE), i5);
            max = Math.max(max, (MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f) * 2) + oc9.L());
            i3 += oc9.K();
        }
        int e = tr1.e((float) 6, vo4.c().getDisplayMetrics().density, lf9.getMeasuredHeight(), i3);
        int i8 = roundToInt2 * 2;
        int i9 = i7 - i8;
        Lazy lazy = this.D0;
        boolean z2 = false;
        boolean z3 = true;
        if (y7e.L(lazy)) {
            s87 s87 = (s87) lazy.getValue();
            boolean z4 = s87.getImageAttach().c * 2 >= i7;
            this.z = z4;
            if (z4) {
                s87.measure(View.MeasureSpec.makeMeasureSpec(i7, IntCompanionObject.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(MathKt.roundToInt(((float) Uuid.SIZE_BITS) * vo4.c().getDisplayMetrics().density), 1073741824));
            } else {
                int roundToInt3 = MathKt.roundToInt(((float) 32) * vo4.c().getDisplayMetrics().density);
                s87.measure(View.MeasureSpec.makeMeasureSpec(roundToInt3, 1073741824), View.MeasureSpec.makeMeasureSpec(roundToInt3, 1073741824));
                i9 -= roundToInt3 + roundToInt2;
            }
            z2 = true;
        }
        Lazy lazy2 = this.A0;
        if (y7e.L(lazy2)) {
            i4 = IntCompanionObject.MIN_VALUE;
            ((AppCompatTextView) lazy2.getValue()).measure(View.MeasureSpec.makeMeasureSpec(i9, IntCompanionObject.MIN_VALUE), i5);
            z2 = true;
        } else {
            i4 = IntCompanionObject.MIN_VALUE;
        }
        Lazy lazy3 = this.B0;
        if (y7e.L(lazy3)) {
            ((AppCompatTextView) lazy3.getValue()).measure(View.MeasureSpec.makeMeasureSpec(i9, i4), i5);
            z2 = true;
        }
        Lazy lazy4 = this.C0;
        if (y7e.L(lazy4)) {
            ((AppCompatTextView) lazy4.getValue()).measure(View.MeasureSpec.makeMeasureSpec(i9, i4), i5);
        } else {
            z3 = z2;
        }
        if (z3) {
            int w2 = y7e.w(lazy4) + y7e.w(lazy3) + y7e.w(lazy2) + i8;
            int w3 = (this.z ? y7e.w(lazy) + w2 : RangesKt.coerceAtLeast(w2, y7e.w(lazy) + i8)) + e;
            this.y.set(roundToInt, e, max - roundToInt, w3);
            e = w3;
        }
        krc krc = this.a;
        if (y7e.L((Lazy) krc.c)) {
            krc.T(View.MeasureSpec.makeMeasureSpec(size, IntCompanionObject.MIN_VALUE), i5);
            e = tr1.e(f, vo4.c().getDisplayMetrics().density, krc.K(), e);
        }
        z74 z74 = this.E0;
        z74.measure(i, i5);
        setMeasuredDimension(max, e + (y7e.L((Lazy) krc.c) ? MathKt.roundToInt(f * vo4.c().getDisplayMetrics().density) : g63.b(f2, vo4.c().getDisplayMetrics().density, z74.getMeasuredHeight() + MathKt.roundToInt(((float) 2) * vo4.c().getDisplayMetrics().density))));
    }

    public final void q(boolean z2) {
        this.a.q(z2);
    }

    public void setAlias(Layout layout) {
        this.o.setAlias(layout);
    }

    public void setAliasColor(int i) {
        this.o.setAliasColor(i);
    }

    public void setChipObserver(jqc jqc) {
        this.a.setChipObserver(jqc);
    }

    public void setDateBackgroundColor(int i) {
    }

    public void setDateTextColor(int i) {
        this.E0.setTextColor(i);
    }

    public void setDateViewStatus(hcg hcg) {
        this.E0.setStatus(hcg);
    }

    public void setDependOnOutsideView(boolean z2) {
        this.c.a = z2;
    }

    public void setForwardClickListener(Function1<? super gc9, Unit> function1) {
        this.b.w = function1;
    }

    public void setIsIncoming(boolean z2) {
        this.a.v = z2;
    }

    public void setLink(nc9 nc9) {
        this.b.setLink(nc9);
    }

    public void setOnClickListener(Function1<? super hqc, Unit> function1) {
        this.a.w = function1;
    }

    public void setOnLinkLongClickListener(p23 p23) {
        this.y0 = p23;
    }

    public void setReplyClickListener(Function2<? super Long, ? super Long, Unit> function2) {
        this.b.v = function2;
    }

    public void setSenderName(Layout layout) {
        this.x0.e(layout);
    }

    public void setSenderNameColor(int i) {
        this.x0.f(i);
    }

    public void setStackFromEnd(boolean z2) {
        this.a.y = z2;
    }

    public void setTextMessageColors(ws0 ws0) {
        this.z0.setTextColors(ws0);
    }

    public void setTextMessageLayout(jf9 jf9) {
        this.z0.setLayout(jf9);
    }

    public void setTextMessageLinkClickListener(ny7 ny7) {
        this.z0.setLinkListener(ny7);
    }
}
