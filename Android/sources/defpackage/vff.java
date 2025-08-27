package defpackage;

import android.content.Context;
import android.text.Layout;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import java.util.Collection;
import java.util.List;
import kotlin.Lazy;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.IntCompanionObject;
import kotlin.math.MathKt;
import kotlin.reflect.KProperty;

/* renamed from: vff  reason: default package */
public class vff extends ViewGroup implements dsd, a84, wff, yy6, t99, tsc, tc9, l6b, asd, iy7 {
    public final krc a;
    public final oc9 b;
    public final m6b c;
    public final yrd o;
    public final esd v = new esd(this);
    public final int v0;
    public final lf9 w;
    public final int w0;
    public final z74 x;
    public p23 x0;
    public final int y;
    public final int z;

    /* JADX WARNING: type inference failed for: r2v0, types: [m6b, java.lang.Object] */
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public vff(Context context) {
        super(context);
        krc krc = new krc();
        oc9 oc9 = new oc9();
        ? obj = new Object();
        yrd yrd = new yrd();
        this.a = krc;
        this.b = oc9;
        this.c = obj;
        this.o = yrd;
        lf9 lf9 = new lf9(context, 0);
        lf9.setId(cwa.N);
        this.w = lf9;
        z74 z74 = new z74(context);
        this.x = z74;
        this.y = MathKt.roundToInt(((float) 8) * vo4.c().getDisplayMetrics().density);
        this.z = MathKt.roundToInt(((float) 10) * vo4.c().getDisplayMetrics().density);
        float f = (float) 4;
        this.v0 = MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f);
        this.w0 = MathKt.roundToInt(f * vo4.c().getDisplayMetrics().density);
        krc.b = this;
        oc9.b = this;
        yrd.b = this;
        setLayoutParams(new ViewGroup.MarginLayoutParams(-2, -2));
        addView(lf9, new ViewGroup.LayoutParams(-2, -2));
        addView(z74, new ViewGroup.LayoutParams(-2, -2));
        ejd ejd = r89.y;
        k2b f2 = fu4.k.e(getContext()).f();
        ejd.getClass();
        setBackground(ejd.a(f2));
        setWillNotDraw(false);
        lf9.setSingleClickAction(new uff(this, 0));
        lf9.setTryToSingleClickAction(new uff(this, 1));
        lf9.setOnLongClickListener(new z20(18, this));
        lf9.setLinkLongClickListener(new nqd(24, this));
    }

    public final void d(List list, Function2 function2) {
        CharSequence text = getText();
        if (text != null) {
            Collection collection = list;
            lf9 lf9 = this.w;
            if (collection == null || collection.isEmpty() || function2 == null) {
                KProperty[] kPropertyArr = lf9.F0;
                lf9.b(true);
                return;
            }
            lf9.c((List) function2.invoke(text.toString(), list));
        }
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

    public final int getContentHorizontalPadding$message_list_release() {
        return this.z;
    }

    public final int getContentTopPadding$message_list_release() {
        return this.y;
    }

    public final z74 getDate$message_list_release() {
        return this.x;
    }

    public boolean getDependOnOutsideView() {
        return this.c.a;
    }

    public final oc9 getMessageLinkDelegate() {
        return this.b;
    }

    public final lf9 getMessageTextView$message_list_release() {
        return this.w;
    }

    public p23 getOnLinkLongClickListener() {
        return this.x0;
    }

    public final krc getReactionsDelegate() {
        return this.a;
    }

    public final yrd getSenderAliasDelegate() {
        return this.o;
    }

    public final int getSenderBottomMargin$message_list_release() {
        return this.v0;
    }

    public final esd getSenderNameViewStub$message_list_release() {
        return this.v;
    }

    public final int getStatusBottomMargin$message_list_release() {
        return this.w0;
    }

    public final CharSequence getText() {
        return this.w.getText();
    }

    public void h(CharSequence charSequence, boolean z2) {
        this.x.c(charSequence, z2);
    }

    public boolean i(MotionEvent motionEvent) {
        return false;
    }

    public final void l(ws0 ws0, boolean z2) {
        this.a.l(ws0, z2);
    }

    public final void n() {
        this.b.n();
    }

    public void onLayout(boolean z2, int i, int i2, int i3, int i4) {
        int i5;
        esd esd = this.v;
        boolean L = y7e.L(esd.b);
        int i6 = this.z;
        int i7 = this.y;
        if (L) {
            esd.c(i6, i7);
            i5 = tr1.e((float) 4, vo4.c().getDisplayMetrics().density, esd.a(), i7);
        } else {
            i5 = i7;
        }
        yrd yrd = this.o;
        if (y7e.L((Lazy) yrd.c) && y7e.L(esd.b)) {
            yrd.S((getMeasuredWidth() - i6) - yrd.L(), ((esd.a() / 2) - (yrd.K() / 2)) + i7);
        }
        oc9 oc9 = this.b;
        if (y7e.L((Lazy) oc9.c)) {
            oc9.S(i6, i5);
            i5 = tr1.e((float) 4, vo4.c().getDisplayMetrics().density, oc9.K(), i5);
        }
        lf9 lf9 = this.w;
        ev0.x(lf9, i6, i5, 0, 12);
        int measuredHeight = lf9.getMeasuredHeight() + i5;
        krc krc = this.a;
        if (y7e.L((Lazy) krc.c)) {
            krc.S(i6, MathKt.roundToInt(((float) 8) * vo4.c().getDisplayMetrics().density) + measuredHeight);
            krc.K();
        }
        int measuredWidth = getMeasuredWidth();
        z74 z74 = this.x;
        ev0.x(z74, (measuredWidth - z74.getMeasuredWidth()) - i6, a81.e((float) 4, vo4.c().getDisplayMetrics().density, getMeasuredHeight() - z74.getMeasuredHeight()), 0, 12);
    }

    public void onMeasure(int i, int i2) {
        int i3;
        float f = (float) 10;
        int f2 = a81.f(f, vo4.c().getDisplayMetrics().density, 2, View.MeasureSpec.getSize(i));
        lf9 lf9 = this.w;
        lf9.d();
        int measuredWidth = getDependOnOutsideView() ? f2 : lf9.getMeasuredWidth();
        int measuredHeight = lf9.getMeasuredHeight();
        yrd yrd = this.o;
        boolean L = y7e.L((Lazy) yrd.c);
        esd esd = this.v;
        if (L && y7e.L(esd.b)) {
            yrd.T(View.MeasureSpec.makeMeasureSpec(f2, IntCompanionObject.MIN_VALUE), i2);
            measuredWidth = Math.max(measuredWidth, yrd.L());
        }
        if (y7e.L(esd.b)) {
            esd.d(View.MeasureSpec.makeMeasureSpec(f2, IntCompanionObject.MIN_VALUE), i2);
            measuredWidth = Math.max(measuredWidth, esd.b() + yrd.g0());
            measuredHeight = tr1.e((float) 4, vo4.c().getDisplayMetrics().density, esd.a(), measuredHeight);
        }
        oc9 oc9 = this.b;
        if (y7e.L((Lazy) oc9.c)) {
            oc9.T(View.MeasureSpec.makeMeasureSpec(f2, IntCompanionObject.MIN_VALUE), i2);
            measuredWidth = Math.max(measuredWidth, oc9.L());
            measuredHeight = tr1.e((float) 4, vo4.c().getDisplayMetrics().density, oc9.K(), measuredHeight);
        }
        krc krc = this.a;
        if (y7e.L((Lazy) krc.c)) {
            krc.T(View.MeasureSpec.makeMeasureSpec(f2, IntCompanionObject.MIN_VALUE), i2);
            measuredWidth = Math.max(measuredWidth, krc.L());
            measuredHeight = tr1.e(f, vo4.c().getDisplayMetrics().density, krc.K(), measuredHeight);
        }
        z74 z74 = this.x;
        z74.measure(i, i2);
        Layout layout = lf9.getLayout();
        if (y7e.L((Lazy) krc.c)) {
            i3 = krc.L();
        } else if (layout != null) {
            int lineCount = layout.getLineCount();
            i3 = lineCount == 1 ? lf9.getMeasuredWidth() : MathKt.roundToInt(layout.getLineRight(lineCount - 1));
        } else {
            i3 = f2;
        }
        int b2 = g63.b(f, vo4.c().getDisplayMetrics().density, z74.getMeasuredWidth() + g63.b((float) 6, vo4.c().getDisplayMetrics().density, i3));
        if (b2 < f2) {
            measuredWidth = Math.max(measuredWidth, b2);
        } else {
            measuredHeight = g63.b((float) 12, vo4.c().getDisplayMetrics().density, measuredHeight);
        }
        setMeasuredDimension((MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f) * 2) + measuredWidth, tr1.e(f, vo4.c().getDisplayMetrics().density, MathKt.roundToInt(((float) 8) * vo4.c().getDisplayMetrics().density), measuredHeight));
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
        this.x.setBackgroundColor(i);
    }

    public void setDateTextColor(int i) {
        this.x.setTextColor(i);
    }

    public void setDateViewStatus(hcg hcg) {
        this.x.setStatus(hcg);
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

    public final void setMaxHeightForClip(int i) {
        this.w.setMaxHeightForClip(i);
    }

    public void setOnClickListener(Function1<? super hqc, Unit> function1) {
        this.a.w = function1;
    }

    public void setOnLinkLongClickListener(p23 p23) {
        this.x0 = p23;
    }

    public void setReplyClickListener(Function2<? super Long, ? super Long, Unit> function2) {
        this.b.v = function2;
    }

    public void setSenderName(Layout layout) {
        this.v.e(layout);
    }

    public void setSenderNameColor(int i) {
        this.v.f(i);
    }

    public void setStackFromEnd(boolean z2) {
        this.a.y = z2;
    }

    public void setTextMessageColors(ws0 ws0) {
        this.w.setTextColors(ws0);
    }

    public void setTextMessageLayout(jf9 jf9) {
        this.w.setLayout(jf9);
    }

    public void setTextMessageLinkClickListener(ny7 ny7) {
        this.w.setLinkListener(ny7);
    }
}
