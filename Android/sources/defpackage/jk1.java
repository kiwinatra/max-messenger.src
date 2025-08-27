package defpackage;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.util.AttributeSet;
import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;

/* renamed from: jk1  reason: default package */
public final class jk1 extends ConstraintLayout implements uy3, mi1, kk1 {
    public final Lazy E0;
    public final Lazy F0;
    public final Lazy G0;
    public final AppCompatTextView H0;
    public final AppCompatImageView I0;
    public final AppCompatImageView J0;
    public ik1 K0;
    public Boolean L0;
    public Boolean M0;
    public Boolean N0;
    public CharSequence O0;
    public ze1 P0 = ze1.c;
    public p0g Q0;
    public vy3 R0;
    public lk1 S0;
    public mmb T0;

    public jk1(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        lj1 lj1 = new lj1(1);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.E0 = LazyKt.lazy(lazyThreadSafetyMode, lj1);
        this.F0 = LazyKt.lazy(lazyThreadSafetyMode, new v4(context, 9));
        this.G0 = LazyKt.lazy(lazyThreadSafetyMode, new j6(28, this));
        setLayoutParams(new fj3(-1, -2));
        float f = (float) 32;
        setPadding(MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f), 0, MathKt.roundToInt(f * vo4.c().getDisplayMetrics().density), 0);
        AppCompatImageView appCompatImageView = new AppCompatImageView(context, (AttributeSet) null);
        appCompatImageView.setId(kgc.call_video_rotation);
        appCompatImageView.setBackground(getBackgroundView());
        appCompatImageView.setImageResource(pec.ic_rotation_view_16);
        float f2 = (float) 5;
        int roundToInt = MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f2);
        appCompatImageView.setPadding(roundToInt, roundToInt, roundToInt, roundToInt);
        appCompatImageView.setVisibility(8);
        u67 u67 = l2b.f;
        appCompatImageView.setImageTintList(ColorStateList.valueOf(u67.f));
        this.I0 = appCompatImageView;
        AppCompatImageView appCompatImageView2 = new AppCompatImageView(context, (AttributeSet) null);
        appCompatImageView2.setId(kgc.call_pin);
        appCompatImageView2.setImageResource(pec.ic_pin_13);
        appCompatImageView2.setBackground(getBackgroundView());
        appCompatImageView2.setImageTintList(ColorStateList.valueOf(u67.f));
        int roundToInt2 = MathKt.roundToInt(f2 * vo4.c().getDisplayMetrics().density);
        appCompatImageView2.setPadding(roundToInt2, roundToInt2, roundToInt2, roundToInt2);
        appCompatImageView2.setVisibility(8);
        ct.G(appCompatImageView2, 300, new hk1(this, 1));
        this.J0 = appCompatImageView2;
        AppCompatTextView appCompatTextView = new AppCompatTextView(context, (AttributeSet) null);
        appCompatTextView.setId(kgc.call_user_full_name);
        appCompatTextView.setMaxLines(1);
        puf.o.b(appCompatTextView, uy4.b);
        appCompatTextView.setTextColor(l2b.i.e);
        appCompatTextView.setBackground(getBackgroundView());
        appCompatTextView.setGravity(17);
        float f3 = (float) 8;
        float f4 = (float) 7;
        appCompatTextView.setPadding(MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f3), MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f4), MathKt.roundToInt(f3 * vo4.c().getDisplayMetrics().density), MathKt.roundToInt(f4 * vo4.c().getDisplayMetrics().density));
        appCompatTextView.setVisibility(8);
        gsg.h(appCompatTextView);
        this.H0 = appCompatTextView;
        float f5 = (float) 26;
        addView(appCompatImageView2, MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f5), MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f5));
        addView(appCompatImageView, MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f5), MathKt.roundToInt(f5 * vo4.c().getDisplayMetrics().density));
        addView(appCompatTextView, -2, -2);
        if (!isLaidOut() || isLayoutRequested()) {
            addOnLayoutChangeListener(new dr0(1, this));
        } else {
            O(this.O0);
        }
        pj3 h = ct.h(this);
        int id = appCompatImageView2.getId();
        h.e(id, 3, 0, 3);
        h.e(id, 4, 0, 4);
        h.e(id, 7, appCompatTextView.getId(), 6);
        h.e(id, 6, 0, 6);
        h.j(id).d.V = 2;
        int id2 = appCompatTextView.getId();
        h.e(id2, 3, 0, 3);
        h.e(id2, 4, 0, 4);
        h.e(id2, 6, appCompatImageView2.getId(), 7);
        float f6 = (float) 4;
        new ila(h, 6, id2, 4).e(MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f6));
        h.e(id2, 7, appCompatImageView.getId(), 6);
        new ila(h, 7, id2, 4).e(MathKt.roundToInt(f6 * vo4.c().getDisplayMetrics().density));
        h.j(id2).d.l0 = true;
        int id3 = appCompatImageView.getId();
        h.e(id3, 3, 0, 3);
        h.e(id3, 4, 0, 4);
        h.e(id3, 6, appCompatTextView.getId(), 7);
        h.e(id3, 7, 0, 7);
        h.a(this);
    }

    public static int L(jk1 jk1) {
        return a81.f((float) 8, vo4.c().getDisplayMetrics().density, 2, a81.f((float) 32, vo4.c().getDisplayMetrics().density, 2, a81.f((float) 4, vo4.c().getDisplayMetrics().density, 2, a81.f((float) 26, vo4.c().getDisplayMetrics().density, 2, jk1.getCallScreen().b))));
    }

    private final float[] getBG_RADIUS() {
        return (float[]) this.E0.getValue();
    }

    private final Drawable getBackgroundView() {
        ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(getBG_RADIUS(), (RectF) null, (float[]) null));
        shapeDrawable.getPaint().setColor(Color.parseColor("#CC393A40"));
        return shapeDrawable;
    }

    private final wgd getCallScreen() {
        return (wgd) this.F0.getValue();
    }

    private final int getTargetWidth() {
        return ((Number) this.G0.getValue()).intValue();
    }

    public final void B() {
        N();
    }

    public final void M() {
        Boolean bool = this.M0;
        boolean booleanValue = bool != null ? bool.booleanValue() : false;
        CharSequence charSequence = this.O0;
        if (charSequence == null) {
            charSequence = "";
        }
        AppCompatTextView appCompatTextView = this.H0;
        if (booleanValue) {
            charSequence = getContext().getString(ykc.call_user_talking_accessibility);
        }
        appCompatTextView.setContentDescription(charSequence);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r0 = ((defpackage.zy3) r0).j;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void N() {
        /*
            r7 = this;
            vy3 r0 = r7.R0
            if (r0 == 0) goto L_0x0011
            zy3 r0 = (defpackage.zy3) r0
            ty3 r0 = r0.j
            if (r0 == 0) goto L_0x0011
            boolean r0 = r0.c
            if (r0 != 0) goto L_0x0011
            r0 = 0
        L_0x000f:
            r2 = r0
            goto L_0x001a
        L_0x0011:
            java.lang.Boolean r0 = r7.N0
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r0, (java.lang.Object) r1)
            goto L_0x000f
        L_0x001a:
            l r5 = new l
            r0 = 19
            r5.<init>(r0, r7)
            r6 = 2
            r3 = 0
            r1 = r7
            defpackage.y7e.k(r1, r2, r3, r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jk1.N():void");
    }

    public final void O(CharSequence charSequence) {
        int targetWidth = getTargetWidth();
        AppCompatTextView appCompatTextView = this.H0;
        appCompatTextView.post(new ktg(appCompatTextView, kne.g(charSequence, appCompatTextView, targetWidth), this, 12));
    }

    public /* bridge */ /* synthetic */ boolean getShouldScaleMainOpponent() {
        return false;
    }

    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        lk1 lk1 = this.S0;
        if (lk1 != null) {
            ((mk1) lk1).a.add(this);
        }
    }

    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        lk1 lk1 = this.S0;
        if (lk1 != null) {
            ((mk1) lk1).a.remove(this);
        }
    }

    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        O(this.O0);
    }

    public final void setActive(boolean z) {
        if (!Intrinsics.areEqual((Object) this.N0, (Object) Boolean.valueOf(z))) {
            this.N0 = Boolean.valueOf(z);
            N();
        }
    }

    public final void setCallSpeakerMediator(lk1 lk1) {
        this.S0 = lk1;
    }

    public final void setControlsMediator(vy3 vy3) {
        this.R0 = vy3;
    }

    public final void setLabel(CharSequence charSequence) {
        if (!Intrinsics.areEqual((Object) this.O0, (Object) charSequence)) {
            this.O0 = charSequence;
            O(charSequence);
        }
    }

    public final void setListener(ik1 ik1) {
        this.K0 = ik1;
    }

    public final void setParticipantId(ze1 ze1) {
        this.P0 = ze1;
    }

    public final void setPipBoundariesController(mmb mmb) {
        this.T0 = mmb;
    }

    public final List v(sy3 sy3, sy3 sy32) {
        List createListBuilder = CollectionsKt.createListBuilder();
        float abs = (Math.abs(sy3.d) - ((float) sy3.f)) * ((float) sy3.c);
        createListBuilder.add(ObjectAnimator.ofFloat(this, View.TRANSLATION_Y, new float[]{getTranslationY(), getTranslationY() + abs}));
        if (Intrinsics.areEqual((Object) this.N0, (Object) Boolean.TRUE)) {
            createListBuilder.add(h88.y(this, sy32.a));
        }
        return CollectionsKt.build(createListBuilder);
    }

    public final void x(boolean z) {
        if (z) {
            setAlpha(1.0f);
        }
    }

    public final void y(long j, List list, boolean z) {
        float f = z ? 0.0f : 1.0f;
        float f2 = z ? 1.0f : 0.0f;
        if (y7e.P(this, z)) {
            list.add(y7e.e(this, z, f, f2, j));
        }
    }
}
