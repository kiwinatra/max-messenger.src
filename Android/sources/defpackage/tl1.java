package defpackage;

import android.content.Context;
import android.graphics.Point;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;

/* renamed from: tl1  reason: default package */
public final class tl1 extends ConstraintLayout {
    public static final /* synthetic */ int P0 = 0;
    public sl1 E0;
    public Boolean F0;
    public final Lazy G0;
    public ymf H0;
    public final TextView I0;
    public final TextView J0;
    public final p8d K0;
    public final p8d L0;
    public final ViewStub M0;
    public final Lazy N0;
    public boolean O0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public tl1(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Context context2 = context;
        lj1 lj1 = new lj1(4);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.G0 = LazyKt.lazy(lazyThreadSafetyMode, lj1);
        p8d p8d = new p8d(context2, (AttributeSet) null);
        p8d.setId(kgc.call_collapsing);
        p8d.P(p8d, pec.ic_down_chevron_24);
        p8d.setAccessibility(Integer.valueOf(ykc.call_collapsing_accessibility));
        k8d k8d = k8d.a;
        p8d.setMode(k8d);
        p8d.setListener(new rl1(this, 0));
        float f = (float) 40;
        p8d.setImageSize(new l8d(MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f), MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f)));
        p8d.setLayoutParams(new fj3(-2, -2));
        float f2 = (float) 3;
        p8d.setButtonPadding(MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f2));
        TextView textView = new TextView(context2);
        textView.setId(kgc.call_name);
        textView.setGravity(8388611);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        textView.setMaxLines(1);
        puf.m.b(textView, uy4.b);
        xef xef = l2b.i;
        textView.setTextColor(xef.e);
        textView.setVisibility(8);
        this.I0 = textView;
        TextView textView2 = new TextView(context2);
        textView2.setId(kgc.call_status);
        textView2.setEllipsize(truncateAt);
        textView2.setMaxLines(1);
        textView2.setGravity(8388611);
        puf.o.b(textView2, uy4.b);
        textView2.setTextColor(xef.g);
        textView2.setVisibility(8);
        this.J0 = textView2;
        p8d p8d2 = new p8d(context2, (AttributeSet) null);
        p8d2.setId(qqa.S);
        p8d2.setMode(k8d);
        p8d.P(p8d2, pqa.P);
        p8d2.setAccessibility(Integer.valueOf(sqa.G));
        p8d2.setListener(new ba(9, this, p8d2));
        p8d2.setButtonPadding(MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f2));
        p8d2.setImageSize(new l8d(MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f), MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f)));
        p8d2.setLayoutParams(new fj3(-2, -2));
        this.K0 = p8d2;
        p8d p8d3 = new p8d(context2, (AttributeSet) null);
        p8d3.setId(qqa.K0);
        p8d.P(p8d3, pqa.g);
        p8d3.setAccessibility(Integer.valueOf(sqa.E0));
        p8d3.setMode(k8d);
        p8d3.setButtonPadding(MathKt.roundToInt(f2 * vo4.c().getDisplayMetrics().density));
        p8d3.setImageSize(new l8d(MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f), MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f)));
        p8d3.setLayoutParams(new fj3(-2, -2));
        p8d3.setListener(new rl1(this, 1));
        this.L0 = p8d3;
        this.N0 = LazyKt.lazy(lazyThreadSafetyMode, new s2(15, (Object) context2, (Object) this));
        setLayoutParams(new fj3(-1, -2));
        int roundToInt = MathKt.roundToInt(f * vo4.c().getDisplayMetrics().density);
        ViewStub viewStub = new ViewStub(context2);
        viewStub.setId(qqa.R);
        this.M0 = viewStub;
        addView(p8d, roundToInt, roundToInt);
        addView(textView, 0, -2);
        addView(textView2, 0, -2);
        addView(p8d2, roundToInt, roundToInt);
        addView(viewStub, roundToInt, roundToInt);
        addView(p8d3, roundToInt, roundToInt);
        pj3 h = ct.h(this);
        int id = p8d.getId();
        h.e(id, 6, 0, 6);
        h.e(id, 3, 0, 3);
        h.e(id, 4, 0, 4);
        int id2 = textView.getId();
        h.e(id2, 6, p8d.getId(), 7);
        float f3 = (float) 12;
        new ila(h, 6, id2, 4).e(MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f3));
        h.e(id2, 3, p8d.getId(), 3);
        h.e(id2, 4, textView2.getId(), 3);
        h.e(id2, 7, p8d3.getId(), 6);
        new ila(h, 7, id2, 4).e(MathKt.roundToInt(f3 * vo4.c().getDisplayMetrics().density));
        h.j(id2).d.l0 = true;
        h.j(id2).d.W = 2;
        int id3 = textView2.getId();
        h.e(id3, 6, textView.getId(), 6);
        h.e(id3, 3, textView.getId(), 4);
        h.e(id3, 7, textView.getId(), 7);
        h.e(id3, 4, p8d.getId(), 4);
        h.j(id3).d.l0 = true;
        int id4 = p8d3.getId();
        h.e(id4, 7, p8d2.getId(), 6);
        tr1.u((float) 8, vo4.c().getDisplayMetrics().density, new ila(h, 7, id4, 4));
        h.e(id4, 3, 0, 3);
        h.e(id4, 4, 0, 4);
        int id5 = p8d2.getId();
        h.e(id5, 7, viewStub.getId(), 6);
        h.e(id5, 3, 0, 3);
        h.e(id5, 4, 0, 4);
        int id6 = viewStub.getId();
        h.e(id6, 7, 0, 7);
        h.e(id6, 3, 0, 3);
        h.e(id6, 4, 0, 4);
        h.a(this);
    }

    public static View L(Context context, tl1 tl1) {
        View view = new View(context);
        view.setId(qqa.R);
        view.setVisibility(8);
        float f = (float) 40;
        view.setLayoutParams(new ViewGroup.MarginLayoutParams(MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f), MathKt.roundToInt(f * vo4.c().getDisplayMetrics().density)));
        ct.G(view, 300, new x4(tl1, view));
        view.setBackground(tl1.getRecordDrawable());
        return view;
    }

    public static Unit M(boolean z, tl1 tl1, smf smf) {
        if (z) {
            tl1.getRecordDrawable().start();
            tl1.O(smf);
        } else {
            tl1.getRecordDrawable().stop();
            ymf ymf = tl1.H0;
            if (ymf != null) {
                ymf.a();
            }
        }
        return Unit.INSTANCE;
    }

    private final View getRecordButton() {
        return (View) this.N0.getValue();
    }

    private final xxc getRecordDrawable() {
        return (xxc) this.G0.getValue();
    }

    public final void N(boolean z, smf smf) {
        ViewStub viewStub = this.M0;
        if (!z && !y7e.I(viewStub)) {
            return;
        }
        if (this.O0 != z) {
            this.O0 = z;
            y7e.C(viewStub, getRecordButton(), (Function0) null);
            p8d p8d = this.K0;
            ViewGroup.LayoutParams layoutParams = p8d.getLayoutParams();
            if (layoutParams != null) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                marginLayoutParams.rightMargin = MathKt.roundToInt(((float) (z ? 8 : 0)) * vo4.c().getDisplayMetrics().density);
                p8d.setLayoutParams(marginLayoutParams);
                y7e.k(getRecordButton(), this.O0, 0, new x91(z, this, smf, 2), 2);
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        } else if (y7e.I(viewStub)) {
            O(smf);
        }
    }

    public final void O(smf smf) {
        if (smf == null) {
            ymf ymf = this.H0;
            if (ymf != null) {
                ymf.dismiss();
                return;
            }
            return;
        }
        int[] iArr = new int[2];
        getRecordButton().getLocationOnScreen(iArr);
        Point point = new Point(a81.e((float) 18, vo4.c().getDisplayMetrics().density, (hi7.v(getContext()) - iArr[0]) - (getRecordButton().getWidth() / 2)), getRecordButton().getHeight() + iArr[1]);
        ymf ymf2 = this.H0;
        if (ymf2 == null || !ymf2.isShowing()) {
            ymf ymf3 = this.H0;
            if (ymf3 != null) {
                ymf3.dismiss();
            }
            ymf ymf4 = new ymf(getContext(), getRecordButton(), (Function0) new m(24), (Function0) new lj1(5), (Function0) null, wmf.a, vmf.b);
            ymf4.d(smf.a);
            TextView textView = ymf4.z;
            textView.setText(smf.b.a(textView.getContext()));
            CharSequence text = textView.getText();
            textView.setVisibility((text == null || text.length() == 0) ^ true ? 0 : 8);
            j6 j6Var = new j6(29, this);
            ImageView imageView = ymf4.X;
            imageView.setVisibility(0);
            ct.G(imageView, 300, new kqc(20, (Object) j6Var, (Object) ymf4));
            TextView textView2 = ymf4.y;
            ViewGroup.LayoutParams layoutParams = textView2.getLayoutParams();
            if (layoutParams != null) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                marginLayoutParams.setMarginEnd(MathKt.roundToInt(((float) 12) * vo4.c().getDisplayMetrics().density));
                textView2.setLayoutParams(marginLayoutParams);
                ymf4.showAtLocation(ymf4.a, 8388661, point.x - (ymf4.getWidth() / 2), point.y);
                View contentView = ymf4.getContentView();
                if (contentView != null) {
                    ymf.b(ymf4, contentView, true, (umf) null, 6);
                }
                ymf4.setOnDismissListener(new w01(2, this));
                this.H0 = ymf4;
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
    }

    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (y7e.I(this.M0) && this.O0) {
            getRecordDrawable().start();
        }
    }

    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (y7e.I(this.M0)) {
            getRecordDrawable().stop();
        }
    }

    public final void setAddUserState(boolean z) {
        y7e.k(this.L0, z, 0, (Function1) null, 6);
    }

    public final void setClickListener(sl1 sl1) {
        this.E0 = sl1;
    }

    public final void setMoreButtonVisible(boolean z) {
        y7e.k(this.K0, z, 0, (Function1) null, 6);
    }

    public final void setStatus(CharSequence charSequence) {
        TextView textView = this.J0;
        if (!Intrinsics.areEqual((Object) textView.getText(), (Object) charSequence)) {
            textView.setText(charSequence);
        }
    }

    public final void setTitle(CharSequence charSequence) {
        TextView textView = this.I0;
        if (!Intrinsics.areEqual((Object) textView.getText(), (Object) charSequence)) {
            textView.setText(charSequence);
        }
    }
}
