package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.util.AttributeSet;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;
import kotlin.math.MathKt;
import kotlin.properties.Delegates;
import kotlin.reflect.KProperty;
import kotlin.text.StringsKt;

/* renamed from: p8d  reason: default package */
public final class p8d extends ConstraintLayout {
    public static final /* synthetic */ KProperty[] Q0;
    public final Lazy E0;
    public final Lazy F0;
    public final Lazy G0;
    public final Lazy H0;
    public final Lazy I0;
    public m8d J0;
    public final Lazy K0;
    public final Lazy L0;
    public final Lazy M0;
    public final o8d N0 = new o8d(this, 0);
    public final o8d O0;
    public final o8d P0;

    static {
        Class<p8d> cls = p8d.class;
        Q0 = new KProperty[]{rae.s(cls, "mode", "getMode()Lone/me/calls/ui/view/RoundButtonView$Companion$ButtonStyle;", 0), rae.s(cls, "shape", "getShape()Lone/me/calls/ui/view/RoundButtonView$Companion$ButtonShape;", 0), rae.s(cls, "imageSize", "getImageSize()Lone/me/calls/ui/view/RoundButtonView$Companion$IconSize;", 0)};
    }

    public p8d(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a1b a1b = new a1b(context, 16);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.E0 = LazyKt.lazy(lazyThreadSafetyMode, a1b);
        this.F0 = LazyKt.lazy(lazyThreadSafetyMode, new a1b(context, 17));
        this.G0 = LazyKt.lazy(lazyThreadSafetyMode, new a1b(context, 18));
        this.H0 = LazyKt.lazy(lazyThreadSafetyMode, new a1b(context, 19));
        this.I0 = LazyKt.lazy(lazyThreadSafetyMode, new a1b(context, 20));
        this.K0 = LazyKt.lazy(lazyThreadSafetyMode, new mxb(28));
        this.L0 = LazyKt.lazy(lazyThreadSafetyMode, new ifb(22, this));
        this.M0 = LazyKt.lazy(lazyThreadSafetyMode, new mxb(29));
        Delegates delegates = Delegates.INSTANCE;
        k8d k8d = k8d.a;
        j8d j8d = j8d.a;
        this.O0 = new o8d(this, 1);
        float f = (float) 52;
        this.P0 = new o8d(new l8d(MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f), MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f)), this);
        addView(getIconView(), MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f), MathKt.roundToInt(f * vo4.c().getDisplayMetrics().density));
        addView(getStubCounterView());
        addView(getStubTitleView());
        ct.G(this, 300, new u99(22, (Object) this));
        Q();
        pj3 h = ct.h(this);
        int id = getIconView().getId();
        h.e(id, 3, 0, 3);
        h.e(id, 6, 0, 6);
        h.e(id, 7, getStubCounterView().getId(), 6);
        h.e(id, 4, getStubTitleView().getId(), 3);
        int id2 = getStubCounterView().getId();
        h.e(id2, 3, getIconView().getId(), 3);
        h.e(id2, 6, getIconView().getId(), 7);
        h.e(id2, 4, getIconView().getId(), 4);
        h.e(id2, 7, 0, 7);
        int id3 = getStubTitleView().getId();
        h.e(id3, 3, getIconView().getId(), 4);
        tr1.u((float) 8, vo4.c().getDisplayMetrics().density, new ila(h, 3, id3, 4));
        h.e(id3, 6, 0, 6);
        h.e(id3, 7, 0, 7);
        h.a(this);
    }

    public static ShapeDrawable L(p8d p8d) {
        return new ShapeDrawable(new RoundRectShape(p8d.getICON_BG_RADIUS(), (RectF) null, (float[]) null));
    }

    public static void P(p8d p8d, int i) {
        p8d.N(i, l2b.f.f);
    }

    private final int getContrastColor() {
        return -868664768;
    }

    private final TextView getCounterView() {
        return (TextView) this.H0.getValue();
    }

    private final ShapeDrawable getCurrentShape() {
        int i = n8d.$EnumSwitchMapping$0[getShape().ordinal()];
        if (i == 1) {
            return getShapeOvalDrawable();
        }
        if (i == 2) {
            return getShapeRectDrawable();
        }
        throw new NoWhenBranchMatchedException();
    }

    private final float[] getICON_BG_RADIUS() {
        return (float[]) this.K0.getValue();
    }

    /* access modifiers changed from: private */
    public final ImageView getIconView() {
        return (ImageView) this.G0.getValue();
    }

    private final int getInactiveColor() {
        l2b l2b = l2b.a;
        l2b.g.b.getClass();
        return -1552977290;
    }

    private final int getNegativeColor() {
        return l2b.d.a.e;
    }

    private final int getNeutralColor() {
        return l2b.d.a.g;
    }

    private final int getPositiveColor() {
        return l2b.d.a.k;
    }

    private final int getSelectedColor() {
        return l2b.g.a.b;
    }

    private final ShapeDrawable getShapeOvalDrawable() {
        return (ShapeDrawable) this.M0.getValue();
    }

    private final ShapeDrawable getShapeRectDrawable() {
        return (ShapeDrawable) this.L0.getValue();
    }

    private final ViewStub getStubCounterView() {
        return (ViewStub) this.E0.getValue();
    }

    private final ViewStub getStubTitleView() {
        return (ViewStub) this.F0.getValue();
    }

    private final TextView getTitleView() {
        return (TextView) this.I0.getValue();
    }

    public final void N(int i, int i2) {
        getIconView().setImageResource(i);
        getIconView().setImageTintList(ColorStateList.valueOf(i2));
    }

    public final void O(Drawable drawable, int i) {
        getIconView().setImageDrawable(drawable);
        getIconView().setImageTintList(ColorStateList.valueOf(i));
    }

    public final void Q() {
        Integer num;
        RippleDrawable rippleDrawable;
        switch (getMode().ordinal()) {
            case 0:
                num = Integer.valueOf(getNeutralColor());
                break;
            case 1:
                num = Integer.valueOf(getPositiveColor());
                break;
            case 2:
                num = Integer.valueOf(getNegativeColor());
                break;
            case 3:
                num = Integer.valueOf(getSelectedColor());
                break;
            case 4:
                num = Integer.valueOf(getContrastColor());
                break;
            case 5:
                num = Integer.valueOf(getInactiveColor());
                break;
            case 6:
                num = null;
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        ImageView iconView = getIconView();
        if (num != null) {
            int i = l2b.g.a.b;
            ShapeDrawable currentShape = getCurrentShape();
            currentShape.getPaint().setColor(num.intValue());
            rippleDrawable = new RippleDrawable(ColorStateList.valueOf(i), currentShape, (Drawable) null);
        } else {
            int i2 = fu4.k.e(getContext()).f().b().a.f;
            ShapeDrawable currentShape2 = getCurrentShape();
            currentShape2.getPaint().setColor(-1);
            rippleDrawable = new RippleDrawable(ColorStateList.valueOf(i2), (Drawable) null, currentShape2);
        }
        iconView.setBackground(rippleDrawable);
    }

    public final l8d getImageSize() {
        return (l8d) this.P0.getValue(this, Q0[2]);
    }

    public final k8d getMode() {
        return (k8d) this.N0.getValue(this, Q0[0]);
    }

    public final j8d getShape() {
        return (j8d) this.O0.getValue(this, Q0[1]);
    }

    public final void setAccessibility(ngf ngf) {
        getIconView().setContentDescription(ngf != null ? ngf.a(getContext()) : null);
    }

    public final void setButtonPadding(int i) {
        ImageView iconView = getIconView();
        int roundToInt = MathKt.roundToInt(((float) i) * vo4.c().getDisplayMetrics().density);
        iconView.setPadding(roundToInt, roundToInt, roundToInt, roundToInt);
    }

    public final void setIcon(Drawable drawable) {
        getIconView().setImageDrawable(drawable);
    }

    public final void setIconTint(int i) {
        getIconView().setImageTintList(ColorStateList.valueOf(i));
    }

    public final void setImageSize(l8d l8d) {
        this.P0.setValue(this, Q0[2], l8d);
    }

    public final void setListener(m8d m8d) {
        this.J0 = m8d;
    }

    public final void setMode(k8d k8d) {
        this.N0.setValue(this, Q0[0], k8d);
    }

    public final void setShape(j8d j8d) {
        this.O0.setValue(this, Q0[1], j8d);
    }

    public final void setText(String str) {
        if (y7e.I(getStubCounterView()) || (str != null && !StringsKt.isBlank(str))) {
            y7e.C(getStubCounterView(), getCounterView(), (Function0) null);
            getCounterView().setText(str);
            TextView counterView = getCounterView();
            int i = 0;
            if (!(!(str == null || StringsKt.isBlank(str)))) {
                i = 8;
            }
            counterView.setVisibility(i);
        }
    }

    public final void setTextColor(int i) {
        getCounterView().setTextColor(i);
    }

    public final void setTitle(ngf ngf) {
        if (y7e.I(getStubTitleView()) || ngf != null) {
            CharSequence charSequence = null;
            y7e.C(getStubTitleView(), getTitleView(), (Function0) null);
            TextView titleView = getTitleView();
            if (ngf != null) {
                charSequence = ngf.a(getContext());
            }
            titleView.setText(charSequence);
            getTitleView().setVisibility(ngf != null ? 0 : 8);
        }
    }

    public final void setAccessibility(Integer num) {
        String str;
        ImageView iconView = getIconView();
        if (num != null) {
            str = getContext().getString(num.intValue());
        } else {
            str = null;
        }
        iconView.setContentDescription(str);
    }

    public final void setAccessibility(String str) {
        getIconView().setContentDescription(str);
    }
}
