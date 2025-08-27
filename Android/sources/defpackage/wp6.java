package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.RectF;
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
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.IntCompanionObject;
import kotlin.math.MathKt;
import kotlin.reflect.KProperty;

/* renamed from: wp6  reason: default package */
public final class wp6 extends ViewGroup implements a84, dsd, tsc, tc9, asd {
    public final int A0;
    public final krc a;
    public final oc9 b;
    public final yrd c;
    public ws0 o;
    public final Lazy v = LazyKt.lazy(new u75(20, this));
    public final z74 v0;
    public final esd w = new esd(this);
    public final int w0;
    public final TextView x;
    public final int x0;
    public final TextView y;
    public final int y0;
    public final AppCompatImageView z;
    public final int z0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public wp6(Context context) {
        super(context);
        krc krc = new krc();
        oc9 oc9 = new oc9();
        yrd yrd = new yrd();
        this.a = krc;
        this.b = oc9;
        this.c = yrd;
        js9 js9 = fu4.k;
        this.o = js9.e(getContext()).f().a().e();
        TextView textView = new TextView(context);
        ogf ogf = puf.a;
        tr2.i.b(textView, uy4.b);
        textView.setTextColor(getTitleColor());
        textView.setMaxLines(1);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        this.x = textView;
        TextView textView2 = new TextView(context);
        tr2.f.b(textView2, uy4.b);
        textView2.setTextColor(getSubtitleColor());
        textView2.setMaxLines(1);
        textView2.setEllipsize(truncateAt);
        this.y = textView2;
        AppCompatImageView appCompatImageView = new AppCompatImageView(context, (AttributeSet) null);
        appCompatImageView.setBackground(getIconBackground());
        int roundToInt = MathKt.roundToInt(((float) 6) * vo4.c().getDisplayMetrics().density);
        appCompatImageView.setPadding(roundToInt, roundToInt, roundToInt, roundToInt);
        this.z = appCompatImageView;
        z74 z74 = new z74(context);
        z74.setBackgroundEnabled(false);
        this.v0 = z74;
        this.w0 = MathKt.roundToInt(((float) 10) * vo4.c().getDisplayMetrics().density);
        float f = (float) 4;
        this.x0 = MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f);
        this.y0 = MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f);
        this.z0 = MathKt.roundToInt(f * vo4.c().getDisplayMetrics().density);
        int roundToInt2 = MathKt.roundToInt(((float) 40) * vo4.c().getDisplayMetrics().density);
        this.A0 = roundToInt2;
        oc9.b = this;
        krc.b = this;
        yrd.b = this;
        setLayoutParams(new ViewGroup.MarginLayoutParams(-2, -2));
        addView(appCompatImageView, new ViewGroup.LayoutParams(roundToInt2, roundToInt2));
        addView(textView, new ViewGroup.LayoutParams(-2, -2));
        addView(textView2, new ViewGroup.LayoutParams(-2, -2));
        addView(z74, new ViewGroup.LayoutParams(-2, -2));
        setOutlineProvider(ViewOutlineProvider.BACKGROUND);
        ejd ejd = r89.y;
        k2b f2 = js9.e(getContext()).f();
        ejd.getClass();
        setBackground(ejd.a(f2));
    }

    public static ShapeDrawable a(wp6 wp6) {
        float f = vo4.c().getDisplayMetrics().density * 12.0f;
        float[] fArr = new float[8];
        for (int i = 0; i < 8; i++) {
            fArr[i] = f;
        }
        ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(fArr, (RectF) null, (float[]) null));
        shapeDrawable.getPaint().setColor(wp6.getIconBackgroundColor());
        return shapeDrawable;
    }

    private final ShapeDrawable getIconBackground() {
        return (ShapeDrawable) this.v.getValue();
    }

    private final int getIconBackgroundColor() {
        return this.o.a.i;
    }

    private final int getIconColor() {
        return this.o.c.f;
    }

    private final int getSubtitleColor() {
        return this.o.b.e;
    }

    private final int getTitleColor() {
        return this.o.b.d;
    }

    public final void b(vp6 vp6, boolean z2) {
        this.o = fu4.k.e(getContext()).f().a().a(z2);
        TextView textView = this.x;
        textView.setText(vp6.b);
        textView.setTextColor(getTitleColor());
        TextView textView2 = this.y;
        textView2.setText(vp6.c);
        textView2.setTextColor(getSubtitleColor());
        AppCompatImageView appCompatImageView = this.z;
        appCompatImageView.setImageResource(cad.R);
        appCompatImageView.setImageTintList(ColorStateList.valueOf(getIconColor()));
    }

    public final void c(ws0 ws0) {
        this.o = ws0;
        this.x.setTextColor(getTitleColor());
        this.y.setTextColor(getSubtitleColor());
        this.z.setImageTintList(ColorStateList.valueOf(getIconColor()));
        getIconBackground().getPaint().setColor(getIconBackgroundColor());
        this.v0.setTextColor(this.o.c.a);
    }

    public final void e(ws0 ws0) {
        this.b.e(ws0);
    }

    public final void g(xd9 xd9, boolean z2) {
        this.a.g(xd9, z2);
    }

    public int getAliasWidthWithPaddings() {
        return this.c.g0();
    }

    public final void h(CharSequence charSequence, boolean z2) {
        KProperty[] kPropertyArr = z74.B0;
        this.v0.c(charSequence, false);
    }

    public final void l(ws0 ws0, boolean z2) {
        this.a.l(ws0, z2);
    }

    public final void n() {
        this.b.n();
    }

    public final void onLayout(boolean z2, int i, int i2, int i3, int i4) {
        int i5;
        esd esd = this.w;
        boolean L = y7e.L(esd.b);
        int i6 = this.w0;
        if (L) {
            esd.c(i6, i6);
            i5 = esd.a() + this.x0 + i6;
        } else {
            i5 = i6;
        }
        yrd yrd = this.c;
        boolean L2 = y7e.L((Lazy) yrd.c);
        int i7 = this.w0;
        if (L2 && y7e.L(esd.b)) {
            yrd.S((getMeasuredWidth() - i7) - yrd.L(), ((esd.a() / 2) - (yrd.K() / 2)) + i7);
        }
        oc9 oc9 = this.b;
        if (y7e.L((Lazy) oc9.c)) {
            oc9.S(i6, i5);
            i5 += oc9.K() + this.z0;
        }
        AppCompatImageView appCompatImageView = this.z;
        int i8 = this.A0;
        int i9 = i5;
        ct.A(i6, i9, i6 + i8, i5 + i8, appCompatImageView, this);
        int i10 = i6 + i8 + i7;
        TextView textView = this.x;
        int i11 = i10;
        ct.A(i11, i9, textView.getMeasuredWidth() + i10, textView.getMeasuredHeight() + i5, textView, this);
        int measuredHeight = textView.getMeasuredHeight() + i5;
        TextView textView2 = this.y;
        ct.A(i11, measuredHeight, textView2.getMeasuredWidth() + i10, textView2.getMeasuredHeight() + measuredHeight, textView2, this);
        int bottom = appCompatImageView.getBottom();
        krc krc = this.a;
        if (y7e.L((Lazy) krc.c)) {
            float f = (float) 10;
            krc.S(MathKt.roundToInt(f * vo4.c().getDisplayMetrics().density), g63.b(f, vo4.c().getDisplayMetrics().density, bottom));
            krc.K();
        }
        int measuredWidth = getMeasuredWidth();
        z74 z74 = this.v0;
        int measuredWidth2 = (measuredWidth - z74.getMeasuredWidth()) - i7;
        int measuredHeight2 = (getMeasuredHeight() - z74.getMeasuredHeight()) - this.y0;
        z74 z742 = this.v0;
        ct.A(measuredWidth2, measuredHeight2, z742.getMeasuredWidth() + measuredWidth2, z74.getMeasuredHeight() + measuredHeight2, z742, this);
    }

    public final void onMeasure(int i, int i2) {
        int i3;
        int size = View.MeasureSpec.getSize(i);
        int i4 = this.w0;
        int i5 = size - (i4 * 2);
        yrd yrd = this.c;
        boolean L = y7e.L((Lazy) yrd.c);
        esd esd = this.w;
        int i6 = 0;
        if (L && y7e.L(esd.b)) {
            yrd.T(View.MeasureSpec.makeMeasureSpec(i5, IntCompanionObject.MIN_VALUE), i2);
            i6 = Math.max(0, yrd.L());
        }
        if (y7e.L(esd.b)) {
            esd.d(View.MeasureSpec.makeMeasureSpec(i5, IntCompanionObject.MIN_VALUE), i2);
            i6 = Math.max(i6, (i4 * 2) + esd.b() + yrd.g0());
            i3 = esd.a() + this.x0 + i4;
        } else {
            i3 = i4;
        }
        oc9 oc9 = this.b;
        if (y7e.L((Lazy) oc9.c)) {
            oc9.T(View.MeasureSpec.makeMeasureSpec(i5, IntCompanionObject.MIN_VALUE), i2);
            i6 = Math.max(i6, (i4 * 2) + oc9.L());
            i3 += oc9.K() + this.z0;
        }
        z74 z74 = this.v0;
        z74.measure(i, i2);
        this.z.measure(View.MeasureSpec.makeMeasureSpec(i5, 1073741824), i2);
        int i7 = this.A0;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec((i5 - i7) - (i4 * 2), IntCompanionObject.MIN_VALUE);
        TextView textView = this.x;
        textView.measure(makeMeasureSpec, i2);
        TextView textView2 = this.y;
        textView2.measure(makeMeasureSpec, i2);
        int max = Math.max(Math.min(i5, z74.getMeasuredWidth() + Math.max(textView.getMeasuredWidth(), textView2.getMeasuredWidth()) + i7) + i4, i6);
        int measuredHeight = z74.getMeasuredHeight() + g63.b((float) 2, vo4.c().getDisplayMetrics().density, textView.getMeasuredHeight() + textView2.getMeasuredHeight()) + this.y0 + i3;
        krc krc = this.a;
        if (y7e.L((Lazy) krc.c)) {
            krc.T(View.MeasureSpec.makeMeasureSpec(i5, IntCompanionObject.MIN_VALUE), i2);
            max = Math.max(max, krc.L());
            measuredHeight = tr1.e((float) 10, vo4.c().getDisplayMetrics().density, krc.K(), measuredHeight);
        }
        setMeasuredDimension(max, measuredHeight);
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
        this.v0.setTextColor(i);
    }

    public void setDateViewStatus(hcg hcg) {
        this.v0.setStatus(hcg);
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
