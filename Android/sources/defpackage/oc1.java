package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
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
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.IntCompanionObject;
import kotlin.math.MathKt;
import kotlin.reflect.KProperty;

/* renamed from: oc1  reason: default package */
public final class oc1 extends ViewGroup implements a84, dsd, tsc, asd {
    public final krc a;
    public final yrd b;
    public final Lazy c = LazyKt.lazy(new j6(25, this));
    public final esd o = new esd(this);
    public final TextView v;
    public final int v0;
    public final TextView w;
    public boolean w0;
    public final AppCompatImageView x;
    public boolean x0;
    public final z74 y;
    public final int z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public oc1(Context context) {
        super(context);
        krc krc = new krc();
        yrd yrd = new yrd();
        this.a = krc;
        this.b = yrd;
        TextView textView = new TextView(context);
        ogf ogf = puf.a;
        tr2.i.b(textView, uy4.b);
        textView.setTextColor(getTitleColor());
        textView.setMaxLines(1);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        this.v = textView;
        TextView textView2 = new TextView(context);
        tr2.f.b(textView2, uy4.b);
        textView2.setTextColor(getSubtitleColor());
        textView2.setMaxLines(1);
        textView2.setEllipsize(truncateAt);
        this.w = textView2;
        AppCompatImageView appCompatImageView = new AppCompatImageView(context, (AttributeSet) null);
        appCompatImageView.setBackground(getIconBackground());
        int roundToInt = MathKt.roundToInt(((float) 6) * vo4.c().getDisplayMetrics().density);
        appCompatImageView.setPadding(roundToInt, roundToInt, roundToInt, roundToInt);
        this.x = appCompatImageView;
        z74 z74 = new z74(context);
        z74.setBackgroundEnabled(false);
        this.y = z74;
        this.z = MathKt.roundToInt(((float) 10) * vo4.c().getDisplayMetrics().density);
        int roundToInt2 = MathKt.roundToInt(((float) 40) * vo4.c().getDisplayMetrics().density);
        this.v0 = roundToInt2;
        krc.b = this;
        yrd.b = this;
        setLayoutParams(new ViewGroup.MarginLayoutParams(-2, -2));
        addView(appCompatImageView, new ViewGroup.LayoutParams(roundToInt2, roundToInt2));
        addView(textView, new ViewGroup.LayoutParams(-2, -2));
        addView(textView2, new ViewGroup.LayoutParams(-2, -2));
        addView(z74, new ViewGroup.LayoutParams(-2, -2));
        setClipChildren(true);
        setOutlineProvider(ViewOutlineProvider.BACKGROUND);
        ejd ejd = r89.y;
        k2b f = fu4.k.e(getContext()).f();
        ejd.getClass();
        setBackground(ejd.a(f));
        setWillNotDraw(false);
        setTransitionGroup(true);
    }

    public static ShapeDrawable a(oc1 oc1) {
        ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(new float[]{vo4.c().getDisplayMetrics().density * 12.0f, vo4.c().getDisplayMetrics().density * 12.0f, vo4.c().getDisplayMetrics().density * 12.0f, vo4.c().getDisplayMetrics().density * 12.0f, vo4.c().getDisplayMetrics().density * 12.0f, vo4.c().getDisplayMetrics().density * 12.0f, vo4.c().getDisplayMetrics().density * 12.0f, vo4.c().getDisplayMetrics().density * 12.0f}, (RectF) null, (float[]) null));
        shapeDrawable.getPaint().setColor(oc1.getIconBackgroundColor());
        return shapeDrawable;
    }

    private final ws0 getColors() {
        return fu4.k.e(getContext()).f().a().a(this.x0);
    }

    private final ShapeDrawable getIconBackground() {
        return (ShapeDrawable) this.c.getValue();
    }

    private final int getIconBackgroundColor() {
        return getColors().a.i;
    }

    private final int getIconColor() {
        boolean z2 = this.x0;
        js9 js9 = fu4.k;
        return (!z2 || !this.w0) ? z2 ? js9.e(getContext()).f().getIcon().f : getColors().c.f : js9.e(getContext()).f().getIcon().c;
    }

    private final int getSubtitleColor() {
        return getColors().b.e;
    }

    private final int getTitleColor() {
        return getColors().b.d;
    }

    private final void setIcon(Drawable drawable) {
        AppCompatImageView appCompatImageView = this.x;
        appCompatImageView.setImageDrawable(drawable);
        appCompatImageView.setImageTintList(ColorStateList.valueOf(getIconColor()));
    }

    private final void setSubtitle(CharSequence charSequence) {
        this.w.setText(charSequence);
    }

    private final void setTitle(CharSequence charSequence) {
        this.v.setText(charSequence);
    }

    public final void b() {
        this.v.setTextColor(getTitleColor());
        this.w.setTextColor(getSubtitleColor());
        this.x.setImageTintList(ColorStateList.valueOf(getIconColor()));
        getIconBackground().getPaint().setColor(getIconBackgroundColor());
        this.y.setTextColor(getColors().c.a);
    }

    public final void c(i01 i01) {
        this.x0 = i01.f;
        this.w0 = i01.c;
        setTitle(i01.a);
        setSubtitle(i01.b);
        setIcon(i01.d);
    }

    public final void g(xd9 xd9, boolean z2) {
        this.a.g(xd9, z2);
    }

    public int getAliasWidthWithPaddings() {
        return this.b.g0();
    }

    public final void h(CharSequence charSequence, boolean z2) {
        KProperty[] kPropertyArr = z74.B0;
        this.y.c(charSequence, false);
    }

    public final void l(ws0 ws0, boolean z2) {
        this.a.l(ws0, z2);
    }

    public final void onLayout(boolean z2, int i, int i2, int i3, int i4) {
        int i5;
        esd esd = this.o;
        boolean L = y7e.L(esd.b);
        int i6 = this.z;
        if (L) {
            esd.c(i6, i6);
            i5 = tr1.e((float) 4, vo4.c().getDisplayMetrics().density, esd.a(), i6);
        } else {
            i5 = i6;
        }
        yrd yrd = this.b;
        if (y7e.L((Lazy) yrd.c) && y7e.L(esd.b)) {
            yrd.S((getMeasuredWidth() - i6) - yrd.L(), ((esd.a() / 2) - (yrd.K() / 2)) + i6);
        }
        AppCompatImageView appCompatImageView = this.x;
        int i7 = this.v0;
        int i8 = i6 + i7;
        ev0.w(appCompatImageView, i6, i5, i8, i7 + i5);
        int i9 = i8 + i6;
        TextView textView = this.v;
        ev0.x(textView, i9, i5, 0, 12);
        int measuredHeight = textView.getMeasuredHeight() + i5;
        TextView textView2 = this.w;
        ev0.x(textView2, i9, measuredHeight, 0, 12);
        int measuredHeight2 = textView2.getMeasuredHeight() + measuredHeight;
        krc krc = this.a;
        if (y7e.L((Lazy) krc.c)) {
            float f = (float) 10;
            krc.S(MathKt.roundToInt(f * vo4.c().getDisplayMetrics().density), g63.b(f, vo4.c().getDisplayMetrics().density, measuredHeight2));
        }
        int measuredWidth = getMeasuredWidth();
        z74 z74 = this.y;
        ev0.x(z74, (measuredWidth - z74.getMeasuredWidth()) - i6, a81.e((float) 4, vo4.c().getDisplayMetrics().density, getMeasuredHeight() - z74.getMeasuredHeight()), 0, 12);
    }

    public final void onMeasure(int i, int i2) {
        int i3;
        float f = (float) 10;
        int f2 = a81.f(f, vo4.c().getDisplayMetrics().density, 2, View.MeasureSpec.getSize(i));
        int roundToInt = MathKt.roundToInt(((float) 8) * vo4.c().getDisplayMetrics().density) * 2;
        yrd yrd = this.b;
        boolean L = y7e.L((Lazy) yrd.c);
        esd esd = this.o;
        if (L && y7e.L(esd.b)) {
            yrd.T(View.MeasureSpec.makeMeasureSpec(f2, IntCompanionObject.MIN_VALUE), i2);
        }
        if (y7e.L(esd.b)) {
            esd.d(View.MeasureSpec.makeMeasureSpec(f2, IntCompanionObject.MIN_VALUE), i2);
            i3 = yrd.g0() + esd.b();
            roundToInt = tr1.e((float) 4, vo4.c().getDisplayMetrics().density, esd.a(), roundToInt);
        } else {
            i3 = 0;
        }
        z74 z74 = this.y;
        z74.measure(i, i2);
        this.x.measure(View.MeasureSpec.makeMeasureSpec(f2, 1073741824), i2);
        int i4 = this.v0;
        int i5 = this.z;
        int i6 = f2 - (i4 + i5);
        TextView textView = this.v;
        textView.measure(View.MeasureSpec.makeMeasureSpec(i6, IntCompanionObject.MIN_VALUE), i2);
        TextView textView2 = this.w;
        textView2.measure(View.MeasureSpec.makeMeasureSpec(i6, IntCompanionObject.MIN_VALUE), i2);
        int i7 = i5 * 2;
        int min = i7 + Math.min(f2, z74.getMeasuredWidth() + Math.max(textView.getMeasuredWidth(), Math.max(textView2.getMeasuredWidth(), i3)) + i4);
        int measuredHeight = z74.getMeasuredHeight() + textView.getMeasuredHeight() + textView2.getMeasuredHeight() + roundToInt;
        krc krc = this.a;
        if (y7e.L((Lazy) krc.c)) {
            krc.T(View.MeasureSpec.makeMeasureSpec(f2, IntCompanionObject.MIN_VALUE), i2);
            min = Math.max(min, krc.L());
            measuredHeight = tr1.e(f, vo4.c().getDisplayMetrics().density, krc.K(), measuredHeight);
        }
        setMeasuredDimension(min, measuredHeight);
    }

    public final void q(boolean z2) {
        this.a.q(z2);
    }

    public void setAlias(Layout layout) {
        this.b.setAlias(layout);
    }

    public void setAliasColor(int i) {
        this.b.setAliasColor(i);
    }

    public void setChipObserver(jqc jqc) {
        this.a.setChipObserver(jqc);
    }

    public void setDateBackgroundColor(int i) {
    }

    public void setDateTextColor(int i) {
        this.y.setTextColor(i);
    }

    public void setDateViewStatus(hcg hcg) {
        this.y.setStatus(hcg);
    }

    public void setIsIncoming(boolean z2) {
        this.a.v = z2;
    }

    public void setOnClickListener(Function1<? super hqc, Unit> function1) {
        this.a.w = function1;
    }

    public void setSenderName(Layout layout) {
        this.o.e(layout);
    }

    public void setSenderNameColor(int i) {
        this.o.f(i);
    }

    public void setStackFromEnd(boolean z2) {
        this.a.y = z2;
    }
}
