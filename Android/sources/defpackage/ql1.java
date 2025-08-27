package defpackage;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.Arrays;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.math.MathKt;
import kotlin.text.StringsKt;
import kotlin.time.DurationKt;

/* renamed from: ql1  reason: default package */
public final class ql1 extends ConstraintLayout {
    public final Lazy E0 = LazyKt.lazy(new lj1(3));
    public final p8d F0;
    public final p8d G0;
    public final AppCompatTextView H0;
    public final AppCompatTextView I0;
    public sl1 J0;
    public vag K0;
    public Integer L0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ql1(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Context context2 = context;
        setLayoutParams(new fj3(-1, -2));
        p8d p8d = new p8d(context2, (AttributeSet) null);
        p8d.setId(kgc.call_collapsing);
        p8d.P(p8d, pec.ic_chevron_down_24);
        p8d.setAccessibility(Integer.valueOf(ykc.call_collapsing_accessibility));
        k8d k8d = k8d.a;
        p8d.setMode(k8d);
        p8d.setListener(new ol1(this, 0));
        float f = (float) 40;
        p8d.setImageSize(new l8d(MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f), MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f)));
        float f2 = (float) 3;
        p8d.setButtonPadding(MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f2));
        p8d.setLayoutParams(new fj3(-2, -2));
        AppCompatTextView appCompatTextView = new AppCompatTextView(context2, (AttributeSet) null);
        appCompatTextView.setId(kgc.call_name);
        appCompatTextView.setGravity(17);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        appCompatTextView.setEllipsize(truncateAt);
        appCompatTextView.setMaxLines(1);
        ogf ogf = puf.n;
        ogf.b(appCompatTextView, uy4.b);
        l2b.i.getClass();
        appCompatTextView.setTextColor(-1);
        appCompatTextView.setVisibility(8);
        this.H0 = appCompatTextView;
        AppCompatTextView appCompatTextView2 = new AppCompatTextView(context2, (AttributeSet) null);
        appCompatTextView2.setId(kgc.call_status);
        appCompatTextView2.setEllipsize(truncateAt);
        appCompatTextView2.setMaxLines(1);
        appCompatTextView2.setGravity(17);
        ogf.b(appCompatTextView2, uy4.b);
        appCompatTextView2.setTextColor(-1);
        appCompatTextView2.setVisibility(8);
        this.I0 = appCompatTextView2;
        p8d p8d2 = new p8d(context2, (AttributeSet) null);
        p8d2.setId(kgc.call_mode);
        p8d.P(p8d2, pec.ic_call_mode_default_18);
        p8d2.setMode(k8d);
        float f3 = (float) 4;
        p8d2.setButtonPadding(MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f3));
        p8d2.setAccessibility(Integer.valueOf(ykc.call_video_mode_accessibility));
        p8d2.setListener(new ol1(this, 1));
        p8d2.setVisibility(4);
        p8d2.setImageSize(new l8d(MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f), MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f)));
        p8d2.setButtonPadding(MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f2));
        p8d2.setLayoutParams(new fj3(-2, -2));
        this.G0 = p8d2;
        p8d p8d3 = new p8d(context2, (AttributeSet) null);
        p8d3.setId(kgc.call_add_member);
        p8d.P(p8d3, pec.ic_add_user_18);
        p8d3.setButtonPadding(MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f3));
        p8d3.setAccessibility(Integer.valueOf(ykc.call_member_add_accessibility));
        p8d3.setTextColor(-1);
        p8d3.setMode(k8d);
        p8d3.setListener(new ol1(this, 2));
        p8d3.setMinWidth(MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f));
        p8d3.setShape(j8d.b);
        p8d3.setVisibility(4);
        p8d3.setButtonPadding(MathKt.roundToInt(f2 * vo4.c().getDisplayMetrics().density));
        p8d3.setImageSize(new l8d(-2, MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f)));
        p8d3.setLayoutParams(new fj3(-2, -2));
        this.F0 = p8d3;
        addView(p8d);
        addView(appCompatTextView, 0, -2);
        addView(appCompatTextView2, -2, -2);
        addView(p8d2);
        addView(p8d3);
        pj3 h = ct.h(this);
        int id = p8d.getId();
        h.e(id, 6, 0, 6);
        h.e(id, 3, 0, 3);
        int id2 = appCompatTextView.getId();
        h.e(id2, 7, p8d2.getId(), 6);
        new ila(h, 7, id2, 4).e(MathKt.roundToInt(((float) 8) * vo4.c().getDisplayMetrics().density));
        h.e(id2, 6, p8d.getId(), 7);
        tr1.u(f, vo4.c().getDisplayMetrics().density, new ila(h, 6, id2, 4));
        h.e(id2, 3, 0, 3);
        h.j(id2).d.l0 = true;
        int id3 = appCompatTextView2.getId();
        h.e(id3, 7, appCompatTextView.getId(), 7);
        h.e(id3, 6, appCompatTextView.getId(), 6);
        h.e(id3, 3, appCompatTextView.getId(), 4);
        new ila(h, 3, id3, 4).e(MathKt.roundToInt(((float) 2) * vo4.c().getDisplayMetrics().density));
        int id4 = p8d2.getId();
        h.e(id4, 7, p8d3.getId(), 6);
        new ila(h, 7, id4, 4).e(MathKt.roundToInt(f3 * vo4.c().getDisplayMetrics().density));
        h.e(id4, 6, appCompatTextView.getId(), 7);
        h.e(id4, 3, 0, 3);
        int id5 = p8d3.getId();
        h.e(id5, 7, 0, 7);
        h.e(id5, 3, 0, 3);
        h.a(this);
    }

    public static void L(ql1 ql1) {
        t21 contextMenuDelegate = ql1.getContextMenuDelegate();
        hx3 a = contextMenuDelegate.a(ql1.getContext(), n7.a, new ba(8, contextMenuDelegate, ql1));
        a.showAtLocation(ql1, 49, 0, ql1.getContextHeight());
        a.setOnDismissListener(new w01(1, ql1));
        l2b.f.getClass();
        p8d p8d = ql1.G0;
        p8d.setIconTint(-15987442);
        p8d.setMode(k8d.o);
    }

    /* JADX WARNING: type inference failed for: r4v1, types: [android.view.ViewGroup$LayoutParams] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final int getContextHeight() {
        /*
            r4 = this;
            int r0 = r4.getMeasuredHeight()
            android.view.ViewGroup$LayoutParams r1 = r4.getLayoutParams()
            boolean r2 = r1 instanceof android.view.ViewGroup.MarginLayoutParams
            r3 = 0
            if (r2 == 0) goto L_0x0010
            android.view.ViewGroup$MarginLayoutParams r1 = (android.view.ViewGroup.MarginLayoutParams) r1
            goto L_0x0011
        L_0x0010:
            r1 = r3
        L_0x0011:
            r2 = 0
            if (r1 == 0) goto L_0x0017
            int r1 = r1.bottomMargin
            goto L_0x0018
        L_0x0017:
            r1 = r2
        L_0x0018:
            int r0 = r0 + r1
            android.view.ViewGroup$LayoutParams r4 = r4.getLayoutParams()
            boolean r1 = r4 instanceof android.view.ViewGroup.MarginLayoutParams
            if (r1 == 0) goto L_0x0024
            r3 = r4
            android.view.ViewGroup$MarginLayoutParams r3 = (android.view.ViewGroup.MarginLayoutParams) r3
        L_0x0024:
            if (r3 == 0) goto L_0x0028
            int r2 = r3.topMargin
        L_0x0028:
            int r0 = r0 + r2
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ql1.getContextHeight():int");
    }

    private final t21 getContextMenuDelegate() {
        return (t21) this.E0.getValue();
    }

    public final void setCallTime(CharSequence charSequence) {
        AppCompatTextView appCompatTextView = this.I0;
        appCompatTextView.setText(charSequence);
        y7e.k(appCompatTextView, !(charSequence == null || StringsKt.isBlank(charSequence)), 0, (Function1) null, 6);
    }

    public final void setClickListener(sl1 sl1) {
        this.J0 = sl1;
    }

    public final void setMembers(Integer num) {
        String str;
        if (!Intrinsics.areEqual((Object) this.L0, (Object) num)) {
            this.L0 = num;
            boolean z = false;
            int i = num != null ? 0 : 4;
            p8d p8d = this.F0;
            p8d.setVisibility(i);
            if (num != null) {
                if (num.intValue() <= 1) {
                    z = true;
                }
                p8d.P(p8d, z ? pec.ic_add_user_18 : pec.ic_add_more_users_22);
                Integer num2 = z ^ true ? num : null;
                p8d.setText(num2 == null ? "" : num2.intValue() < 1000 ? num2.toString() : num2.intValue() < 1000000 ? getContext().getString(ykc.call_opponent_thousend_size, new Object[]{String.valueOf(num2.intValue() / 1000)}) : num2.intValue() < 100000000 ? getContext().getString(ykc.call_opponent_million_size, new Object[]{String.valueOf(num2.intValue() / DurationKt.NANOS_IN_MILLIS)}) : num2.toString());
                if (z) {
                    str = getContext().getString(ykc.call_member_add_accessibility);
                } else {
                    StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                    str = String.format(getContext().getString(ykc.call_member_add_more_accessibility), Arrays.copyOf(new Object[]{num.toString()}, 1));
                }
                p8d.setAccessibility(str);
            }
        }
    }

    public final void setMode(vag vag) {
        if (this.K0 != vag) {
            this.K0 = vag;
            int i = vag == null ? -1 : pl1.$EnumSwitchMapping$0[vag.ordinal()];
            Integer num = null;
            if (i != -1) {
                if (i == 1) {
                    num = Integer.valueOf(pec.ic_call_mode_default_18);
                } else if (i == 2) {
                    num = Integer.valueOf(pec.ic_call_mode_grid_24);
                } else if (i != 3) {
                    throw new NoWhenBranchMatchedException();
                }
            }
            p8d p8d = this.G0;
            if (num == null) {
                p8d.setVisibility(4);
            } else {
                p8d.setVisibility(0);
            }
            if (num != null) {
                p8d.P(p8d, num.intValue());
            }
        }
    }

    public final void setTitle(CharSequence charSequence) {
        AppCompatTextView appCompatTextView = this.H0;
        if (!Intrinsics.areEqual((Object) appCompatTextView.getText(), (Object) charSequence)) {
            appCompatTextView.setText(charSequence);
            y7e.k(appCompatTextView, !(charSequence == null || StringsKt.isBlank(charSequence)), 0, (Function1) null, 6);
        }
    }
}
