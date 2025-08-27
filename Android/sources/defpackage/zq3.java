package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.text.Layout;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.IntCompanionObject;
import kotlin.math.MathKt;
import kotlin.reflect.KProperty;
import one.me.sdk.uikit.common.avatar.OneMeAvatarView;

/* renamed from: zq3  reason: default package */
public final class zq3 extends ViewGroup implements a84, dsd, tsc, tc9, asd {
    public final krc a;
    public final oc9 b;
    public final yrd c;
    public final Function1 o;
    public final Lazy v = LazyKt.lazy(new nm1(17, this));
    public final Lazy v0;
    public final esd w = new esd(this);
    public final Lazy w0;
    public final TextView x;
    public final z74 x0;
    public final TextView y;
    public final int y0;
    public final OneMeAvatarView z;
    public boolean z0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zq3(Context context, hq7 hq7) {
        super(context);
        krc krc = new krc();
        oc9 oc9 = new oc9();
        yrd yrd = new yrd();
        this.a = krc;
        this.b = oc9;
        this.c = yrd;
        this.o = hq7;
        TextView textView = new TextView(context);
        ogf ogf = puf.a;
        tr2.i.b(textView, uy4.b);
        textView.setTextColor(getTitleColor());
        textView.setMaxLines(1);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        this.x = textView;
        TextView textView2 = new TextView(context);
        tr2.f.b(textView2, uy4.b);
        textView2.setTextColor(getSubtitleColor());
        this.y = textView2;
        OneMeAvatarView oneMeAvatarView = new OneMeAvatarView(context, (AttributeSet) null);
        this.z = oneMeAvatarView;
        yq3 yq3 = new yq3(context, this, 0);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.v0 = LazyKt.lazy(lazyThreadSafetyMode, yq3);
        this.w0 = LazyKt.lazy(lazyThreadSafetyMode, new yq3(context, this, 1));
        z74 z74 = new z74(context);
        z74.setBackgroundEnabled(false);
        this.x0 = z74;
        this.y0 = 4;
        krc.b = this;
        oc9.b = this;
        yrd.b = this;
        setLayoutParams(new ViewGroup.MarginLayoutParams(-2, -2));
        float f = (float) 44;
        addView(oneMeAvatarView, new ViewGroup.LayoutParams(MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f), MathKt.roundToInt(f * vo4.c().getDisplayMetrics().density)));
        addView(textView, new ViewGroup.LayoutParams(-2, -2));
        addView(textView2, new ViewGroup.LayoutParams(-2, -2));
        addView(z74, new ViewGroup.LayoutParams(-2, -2));
        setClipChildren(true);
        setOutlineProvider(ViewOutlineProvider.BACKGROUND);
        ejd ejd = r89.y;
        k2b f2 = fu4.k.e(getContext()).f();
        ejd.getClass();
        setBackground(ejd.a(f2));
        setWillNotDraw(false);
        setTransitionGroup(true);
    }

    public static AppCompatImageView a(Context context, zq3 zq3) {
        AppCompatImageView appCompatImageView = new AppCompatImageView(context, (AttributeSet) null);
        appCompatImageView.setBackground(zq3.getIconBackground());
        int roundToInt = MathKt.roundToInt(((float) 4) * vo4.c().getDisplayMetrics().density);
        appCompatImageView.setPadding(roundToInt, roundToInt, roundToInt, roundToInt);
        float f = (float) 32;
        zq3.addView(appCompatImageView, new ViewGroup.LayoutParams(MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f), MathKt.roundToInt(f * vo4.c().getDisplayMetrics().density)));
        appCompatImageView.requestLayout();
        return appCompatImageView;
    }

    public static AppCompatImageView b(Context context, zq3 zq3) {
        AppCompatImageView appCompatImageView = new AppCompatImageView(context, (AttributeSet) null);
        appCompatImageView.setBackground(zq3.getIconBackground());
        int roundToInt = MathKt.roundToInt(((float) 4) * vo4.c().getDisplayMetrics().density);
        appCompatImageView.setPadding(roundToInt, roundToInt, roundToInt, roundToInt);
        float f = (float) 32;
        zq3.addView(appCompatImageView, new ViewGroup.LayoutParams(MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f), MathKt.roundToInt(f * vo4.c().getDisplayMetrics().density)));
        appCompatImageView.requestLayout();
        return appCompatImageView;
    }

    public static ShapeDrawable c(zq3 zq3) {
        ShapeDrawable shapeDrawable = new ShapeDrawable(new OvalShape());
        shapeDrawable.getPaint().setColor(zq3.getIconBackgroundColor());
        return shapeDrawable;
    }

    private final ws0 getColors() {
        return fu4.k.e(getContext()).f().a().a(this.z0);
    }

    private final ShapeDrawable getIconBackground() {
        return (ShapeDrawable) this.v.getValue();
    }

    private final int getIconBackgroundColor() {
        return getColors().a.g;
    }

    private final int getIconColor() {
        return getColors().c.d;
    }

    private final int getSubtitleColor() {
        return getColors().b.e;
    }

    private final int getTitleColor() {
        return getColors().b.d;
    }

    private final void setSubtitle(CharSequence charSequence) {
        this.y.setText(charSequence);
    }

    private final void setTitle(CharSequence charSequence) {
        this.x.setText(charSequence);
    }

    public final void d() {
        this.x.setTextColor(getTitleColor());
        this.y.setTextColor(getSubtitleColor());
        getIconBackground().getPaint().setColor(getIconBackgroundColor());
        this.x0.setTextColor(getColors().c.a);
        Lazy lazy = this.w0;
        if (lazy.isInitialized()) {
            ((AppCompatImageView) lazy.getValue()).setImageTintList(ColorStateList.valueOf(getIconColor()));
        }
        Lazy lazy2 = this.v0;
        if (lazy2.isInitialized()) {
            ((AppCompatImageView) lazy2.getValue()).setImageTintList(ColorStateList.valueOf(getIconColor()));
        }
    }

    public final void e(ws0 ws0) {
        this.b.e(ws0);
    }

    public final void f(Lazy lazy, Drawable drawable) {
        if (drawable != null) {
            AppCompatImageView appCompatImageView = (AppCompatImageView) lazy.getValue();
            int roundToInt = MathKt.roundToInt(((float) 8) * vo4.c().getDisplayMetrics().density);
            appCompatImageView.setPadding(roundToInt, roundToInt, roundToInt, roundToInt);
            appCompatImageView.setImageDrawable(drawable);
            appCompatImageView.setImageTintList(ColorStateList.valueOf(getIconColor()));
            appCompatImageView.setVisibility(0);
        } else if (lazy.isInitialized()) {
            AppCompatImageView appCompatImageView2 = (AppCompatImageView) lazy.getValue();
            appCompatImageView2.setImageDrawable((Drawable) null);
            appCompatImageView2.setVisibility(8);
        }
    }

    public final void g(xd9 xd9, boolean z2) {
        this.a.g(xd9, z2);
    }

    public int getAliasWidthWithPaddings() {
        return this.c.g0();
    }

    public final void h(CharSequence charSequence, boolean z2) {
        KProperty[] kPropertyArr = z74.B0;
        this.x0.c(charSequence, false);
    }

    public final void i(dl3 dl3) {
        this.z0 = dl3.g;
        setTitle(dl3.b);
        setSubtitle(dl3.h);
        goa goa = goa.a;
        OneMeAvatarView oneMeAvatarView = this.z;
        oneMeAvatarView.setAvatarShape(goa);
        oneMeAvatarView.f(new gd0(dl3.e, dl3.a), true);
        oneMeAvatarView.setAvatarUrl(dl3.d);
        Drawable drawable = dl3.j;
        Lazy lazy = this.w0;
        f(lazy, drawable);
        Drawable drawable2 = dl3.i;
        Lazy lazy2 = this.v0;
        f(lazy2, drawable2);
        if (lazy.isInitialized()) {
            ct.G((AppCompatImageView) lazy.getValue(), 300, new xq3(this, dl3, 0));
        }
        if (lazy2.isInitialized()) {
            ct.G((AppCompatImageView) lazy2.getValue(), 300, new xq3(this, dl3, 1));
        }
    }

    public final void l(ws0 ws0, boolean z2) {
        this.a.l(ws0, z2);
    }

    public final void n() {
        this.b.n();
    }

    public final void onLayout(boolean z2, int i, int i2, int i3, int i4) {
        int i5;
        float f;
        int i6;
        int i7;
        float f2 = (float) 8;
        int roundToInt = MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f2);
        float f3 = (float) 10;
        int roundToInt2 = MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f3);
        int roundToInt3 = MathKt.roundToInt(((float) 32) * vo4.c().getDisplayMetrics().density);
        int roundToInt4 = MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f3);
        esd esd = this.w;
        if (y7e.L(esd.b)) {
            esd.c(roundToInt4, roundToInt2);
            i5 = tr1.e((float) 4, vo4.c().getDisplayMetrics().density, esd.a(), roundToInt2);
        } else {
            i5 = roundToInt2;
        }
        yrd yrd = this.c;
        if (y7e.L((Lazy) yrd.c) && y7e.L(esd.b)) {
            yrd.S((getMeasuredWidth() - roundToInt4) - yrd.L(), ((esd.a() / 2) - (yrd.K() / 2)) + roundToInt2);
        }
        oc9 oc9 = this.b;
        if (y7e.L((Lazy) oc9.c)) {
            oc9.S(roundToInt4, i5);
            i5 = tr1.e((float) 4, vo4.c().getDisplayMetrics().density, oc9.K(), i5);
        }
        OneMeAvatarView oneMeAvatarView = this.z;
        int measuredWidth = oneMeAvatarView.getMeasuredWidth() + roundToInt + roundToInt4;
        TextView textView = this.x;
        int measuredHeight = textView.getMeasuredHeight();
        TextView textView2 = this.y;
        if (textView2.getMeasuredHeight() + measuredHeight > oneMeAvatarView.getMeasuredHeight()) {
            ev0.x(textView, measuredWidth, i5, 0, 12);
            ev0.x(textView2, measuredWidth, textView.getBottom(), 0, 12);
            i6 = MathKt.roundToInt((((float) (textView2.getMeasuredHeight() + textView.getMeasuredHeight())) / 2.0f) + ((float) textView.getTop()));
            ev0.x(oneMeAvatarView, roundToInt4, i6 - (oneMeAvatarView.getMeasuredHeight() / 2), 0, 12);
            i7 = textView2.getMeasuredHeight() + textView.getMeasuredHeight() + i5;
            f = f3;
        } else {
            ev0.x(oneMeAvatarView, roundToInt4, i5, 0, 12);
            int measuredHeight2 = (oneMeAvatarView.getMeasuredHeight() / 2) + i5;
            f = f3;
            ev0.w(textView, measuredWidth, measuredHeight2 - textView.getMeasuredHeight(), textView.getMeasuredWidth() + measuredWidth, textView.getMeasuredHeight() + measuredHeight2);
            ev0.x(textView2, measuredWidth, measuredHeight2, 0, 12);
            i7 = oneMeAvatarView.getMeasuredHeight() + i5;
            i6 = measuredHeight2;
        }
        int i8 = i6 - (roundToInt3 / 2);
        int measuredWidth2 = getMeasuredWidth() - roundToInt2;
        Lazy lazy = this.w0;
        if (y7e.L(lazy)) {
            int i9 = measuredWidth2 - roundToInt3;
            ev0.w((AppCompatImageView) lazy.getValue(), i9, i8, measuredWidth2, i8 + roundToInt3);
            measuredWidth2 = i9 - roundToInt;
        }
        Lazy lazy2 = this.v0;
        if (y7e.L(lazy2)) {
            ev0.w((AppCompatImageView) lazy2.getValue(), measuredWidth2 - roundToInt3, i8, measuredWidth2, roundToInt3 + i8);
        }
        krc krc = this.a;
        if (y7e.L((Lazy) krc.c)) {
            krc.S(MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f), g63.b(f2, vo4.c().getDisplayMetrics().density, i7));
            krc.K();
        }
        int measuredWidth3 = getMeasuredWidth();
        z74 z74 = this.x0;
        int measuredWidth4 = (measuredWidth3 - z74.getMeasuredWidth()) - roundToInt;
        int e = a81.e((float) 6, vo4.c().getDisplayMetrics().density, getMeasuredHeight() - z74.getMeasuredHeight());
        iq.J(measuredWidth4, e, z74.getMeasuredWidth() + measuredWidth4, z74.getMeasuredHeight() + e, z74, (View) z74.getParent());
    }

    public final void onMeasure(int i, int i2) {
        int i3;
        int i4;
        int i5 = i2;
        int size = View.MeasureSpec.getSize(i);
        float f = (float) 10;
        int f2 = a81.f(f, vo4.c().getDisplayMetrics().density, 2, size);
        int roundToInt = MathKt.roundToInt(((float) 32) * vo4.c().getDisplayMetrics().density);
        int roundToInt2 = MathKt.roundToInt(((float) 44) * vo4.c().getDisplayMetrics().density);
        float f3 = (float) 8;
        int roundToInt3 = MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f3);
        int roundToInt4 = MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f);
        int i6 = roundToInt + roundToInt3;
        Integer valueOf = Integer.valueOf(i6);
        Lazy lazy = this.w0;
        if (!y7e.L(lazy)) {
            valueOf = 0;
        }
        int intValue = f2 - valueOf.intValue();
        Integer valueOf2 = Integer.valueOf(i6);
        Lazy lazy2 = this.v0;
        if (!y7e.L(lazy2)) {
            valueOf2 = 0;
        }
        int intValue2 = (((intValue - valueOf2.intValue()) - (roundToInt2 + roundToInt3)) - roundToInt4) - roundToInt4;
        yrd yrd = this.c;
        boolean L = y7e.L((Lazy) yrd.c);
        esd esd = this.w;
        if (L && y7e.L(esd.b)) {
            yrd.T(View.MeasureSpec.makeMeasureSpec(f2, IntCompanionObject.MIN_VALUE), i5);
        }
        if (y7e.L(esd.b)) {
            esd.d(View.MeasureSpec.makeMeasureSpec(f2, IntCompanionObject.MIN_VALUE), i5);
            i3 = g63.b((float) this.y0, vo4.c().getDisplayMetrics().density, esd.a() + roundToInt3);
        } else {
            i3 = MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f);
        }
        oc9 oc9 = this.b;
        if (y7e.L((Lazy) oc9.c)) {
            oc9.T(View.MeasureSpec.makeMeasureSpec(f2, IntCompanionObject.MIN_VALUE), i5);
            i3 += oc9.K();
        }
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(roundToInt2, 1073741824);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(roundToInt2, 1073741824);
        OneMeAvatarView oneMeAvatarView = this.z;
        oneMeAvatarView.measure(makeMeasureSpec, makeMeasureSpec2);
        TextView textView = this.x;
        textView.measure(View.MeasureSpec.makeMeasureSpec(intValue2, 1073741824), i5);
        TextView textView2 = this.y;
        textView2.measure(View.MeasureSpec.makeMeasureSpec(intValue2, IntCompanionObject.MIN_VALUE), i5);
        if (y7e.L(lazy)) {
            ((AppCompatImageView) lazy.getValue()).measure(View.MeasureSpec.makeMeasureSpec(roundToInt, 1073741824), i5);
        }
        if (y7e.L(lazy2)) {
            ((AppCompatImageView) lazy2.getValue()).measure(View.MeasureSpec.makeMeasureSpec(roundToInt, 1073741824), i5);
        }
        int max = Math.max(oneMeAvatarView.getMeasuredHeight(), textView2.getMeasuredHeight() + textView.getMeasuredHeight()) + i3;
        krc krc = this.a;
        if (y7e.L((Lazy) krc.c)) {
            krc.T(View.MeasureSpec.makeMeasureSpec(f2, IntCompanionObject.MIN_VALUE), i5);
            max = tr1.e(f3, vo4.c().getDisplayMetrics().density, krc.K(), max);
        }
        z74 z74 = this.x0;
        z74.measure(i, i5);
        float f4 = (float) 6;
        int b2 = g63.b(f, vo4.c().getDisplayMetrics().density, z74.getMeasuredWidth() + g63.b(f4, vo4.c().getDisplayMetrics().density, krc.L()));
        if (!y7e.L((Lazy) krc.c) || b2 >= f2) {
            i4 = tr1.e(f4, vo4.c().getDisplayMetrics().density, z74.getMeasuredHeight(), max);
        } else {
            i4 = g63.b(f, vo4.c().getDisplayMetrics().density, max);
        }
        setMeasuredDimension(size, i4);
    }

    public final void q(boolean z2) {
        this.a.q(z2);
    }

    public void setAlias(Layout layout) {
        this.c.setAlias(layout);
    }

    public void setAliasColor(int i) {
        this.c.setAliasColor(i);
    }

    public void setChipObserver(jqc jqc) {
        this.a.setChipObserver(jqc);
    }

    public void setDateBackgroundColor(int i) {
    }

    public void setDateTextColor(int i) {
        this.x0.setTextColor(i);
    }

    public void setDateViewStatus(hcg hcg) {
        this.x0.setStatus(hcg);
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

    public void setReplyClickListener(Function2<? super Long, ? super Long, Unit> function2) {
        this.b.v = function2;
    }

    public void setSenderName(Layout layout) {
        this.w.e(layout);
    }

    public void setSenderNameColor(int i) {
        this.w.f(i);
    }

    public void setStackFromEnd(boolean z2) {
        this.a.y = z2;
    }
}
