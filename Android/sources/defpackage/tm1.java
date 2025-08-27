package defpackage;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.view.animation.DecelerateInterpolator;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.List;
import kotlin.KotlinVersion;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;
import kotlin.properties.Delegates;
import kotlin.reflect.KProperty;
import kotlin.text.StringsKt;
import one.me.sdk.uikit.common.avatar.OneMeAvatarView;

/* renamed from: tm1  reason: default package */
public final class tm1 extends ConstraintLayout implements oi1, mi1 {
    public static final /* synthetic */ KProperty[] m1;
    public final OneMeAvatarView E0;
    public final Lazy F0;
    public final Lazy G0;
    public final Lazy H0;
    public final Lazy I0;
    public final Lazy J0;
    public final Lazy K0;
    public final Lazy L0;
    public final Lazy M0;
    public final ViewStub N0;
    public final ViewStub O0;
    public final ViewStub P0;
    public final ViewStub Q0;
    public final ViewStub R0;
    public final ViewStub S0;
    public final ViewStub T0;
    public final GestureDetector U0;
    public Boolean V0;
    public Boolean W0;
    public Boolean X0;
    public CharSequence Y0;
    public CharSequence Z0;
    public CharSequence a1;
    public rm1 b1;
    public Function0 c1;
    public ze1 d1 = ze1.c;
    public AnimatorSet e1;
    public final Lazy f1;
    public final Lazy g1;
    public final Lazy h1;
    public final Lazy i1;
    public final Lazy j1;
    public final sm1 k1;
    public final sm1 l1;

    static {
        Class<tm1> cls = tm1.class;
        m1 = new KProperty[]{rae.s(cls, "mode", "getMode()Lone/me/calls/ui/view/CallUserLargeView$Companion$ActionsMode;", 0), rae.s(cls, "backgroundState", "getBackgroundState()Lone/me/calls/ui/view/CallUserLargeView$Companion$BackgroundState;", 0)};
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public tm1(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Context context2 = context;
        v4 v4Var = new v4(context2, 13);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.F0 = LazyKt.lazy(lazyThreadSafetyMode, v4Var);
        this.G0 = LazyKt.lazy(lazyThreadSafetyMode, new v4(context2, 15));
        this.H0 = LazyKt.lazy(lazyThreadSafetyMode, new lm1(context2, this, 1));
        this.I0 = LazyKt.lazy(lazyThreadSafetyMode, new v4(context2, 16));
        this.J0 = LazyKt.lazy(lazyThreadSafetyMode, new v4(context2, 17));
        this.K0 = LazyKt.lazy(lazyThreadSafetyMode, new v4(context2, 18));
        this.L0 = LazyKt.lazy(lazyThreadSafetyMode, new lm1(context2, this, 0));
        this.M0 = LazyKt.lazy(lazyThreadSafetyMode, new v4(context2, 12));
        this.f1 = LazyKt.lazy(lazyThreadSafetyMode, new lj1(7));
        this.g1 = LazyKt.lazy(lazyThreadSafetyMode, new lj1(8));
        this.h1 = LazyKt.lazy(lazyThreadSafetyMode, new lj1(9));
        this.i1 = LazyKt.lazy(lazyThreadSafetyMode, new lj1(10));
        this.j1 = LazyKt.lazy(lazyThreadSafetyMode, new v4(context2, 14));
        Delegates delegates = Delegates.INSTANCE;
        pm1 pm1 = pm1.a;
        this.k1 = new sm1(this, 0);
        qm1 qm1 = qm1.a;
        this.l1 = new sm1(this, 1);
        setLayoutParams(new fj3(-1, -1));
        OneMeAvatarView oneMeAvatarView = new OneMeAvatarView(context2, (AttributeSet) null);
        oneMeAvatarView.setId(qqa.Q0);
        oneMeAvatarView.setAvatarShape(goa.a);
        this.E0 = oneMeAvatarView;
        ViewStub viewStub = new ViewStub(context2);
        viewStub.setId(qqa.R0);
        this.O0 = viewStub;
        ViewStub viewStub2 = new ViewStub(context2);
        viewStub2.setId(qqa.S0);
        this.N0 = viewStub2;
        ViewStub viewStub3 = new ViewStub(context2);
        viewStub3.setId(qqa.Y0);
        this.P0 = viewStub3;
        ViewStub viewStub4 = new ViewStub(context2);
        viewStub4.setId(qqa.U0);
        this.Q0 = viewStub4;
        ViewStub viewStub5 = new ViewStub(context2);
        viewStub5.setId(qqa.V0);
        this.R0 = viewStub5;
        ViewStub viewStub6 = new ViewStub(context2);
        viewStub6.setId(qqa.X0);
        this.S0 = viewStub6;
        ViewStub viewStub7 = new ViewStub(context2);
        viewStub7.setId(qqa.W0);
        this.T0 = viewStub7;
        this.U0 = new GestureDetector(context2, new q00(5, this));
        float f = (float) 200;
        addView(oneMeAvatarView, MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f), MathKt.roundToInt(f * vo4.c().getDisplayMetrics().density));
        addView(viewStub3, -1, -1);
        addView(viewStub);
        addView(viewStub2);
        addView(viewStub4);
        addView(viewStub5);
        addView(viewStub6);
        addView(viewStub7);
        pj3 h = ct.h(this);
        int id = viewStub.getId();
        h.e(id, 3, 0, 3);
        tr1.u((float) 82, vo4.c().getDisplayMetrics().density, new ila(h, 3, id, 4));
        h.e(id, 6, 0, 6);
        float f2 = (float) 24;
        tr1.u(f2, vo4.c().getDisplayMetrics().density, new ila(h, 6, id, 4));
        h.e(id, 7, 0, 7);
        new ila(h, 7, id, 4).e(MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f2));
        h.e(id, 4, viewStub2.getId(), 3);
        h.j(id).d.W = 2;
        int id2 = viewStub2.getId();
        h.e(id2, 3, viewStub.getId(), 4);
        new ila(h, 3, id2, 4).e(MathKt.roundToInt(((float) 12) * vo4.c().getDisplayMetrics().density));
        h.e(id2, 6, viewStub.getId(), 6);
        new ila(h, 6, id2, 4).e(MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f2));
        h.e(id2, 7, viewStub.getId(), 7);
        new ila(h, 7, id2, 4).e(MathKt.roundToInt(f2 * vo4.c().getDisplayMetrics().density));
        h.e(id2, 4, oneMeAvatarView.getId(), 3);
        new ila(h, 4, id2, 4).e(MathKt.roundToInt(((float) 16) * vo4.c().getDisplayMetrics().density));
        int id3 = oneMeAvatarView.getId();
        h.e(id3, 3, 0, 3);
        h.e(id3, 4, 0, 4);
        h.e(id3, 6, 0, 6);
        h.e(id3, 7, 0, 7);
        h.j(id3).d.x = 0.45f;
        int id4 = viewStub6.getId();
        h.e(id4, 3, oneMeAvatarView.getId(), 4);
        tr1.u((float) 32, vo4.c().getDisplayMetrics().density, new ila(h, 3, id4, 4));
        h.e(id4, 6, 0, 6);
        h.e(id4, 7, 0, 7);
        int id5 = viewStub3.getId();
        h.e(id5, 4, 0, 4);
        h.e(id5, 3, 0, 3);
        h.e(id5, 6, 0, 6);
        h.e(id5, 7, 0, 7);
        int id6 = viewStub4.getId();
        h.e(id6, 6, 0, 6);
        h.e(id6, 7, viewStub5.getId(), 6);
        h.e(id6, 4, 0, 4);
        new ila(h, 4, id6, 4).e(MathKt.roundToInt(((float) 86) * vo4.c().getDisplayMetrics().density));
        h.j(id6).d.V = 2;
        int id7 = viewStub5.getId();
        h.e(id7, 7, 0, 7);
        h.e(id7, 6, viewStub4.getId(), 7);
        new ila(h, 6, id7, 4).e(MathKt.roundToInt(((float) 92) * vo4.c().getDisplayMetrics().density));
        h.e(id7, 4, viewStub4.getId(), 4);
        int id8 = viewStub7.getId();
        h.e(id8, 3, 0, 3);
        h.e(id8, 4, 0, 4);
        h.e(id8, 7, oneMeAvatarView.getId(), 7);
        h.j(id8).d.x = 0.56f;
        h.a(this);
    }

    public static Unit L(tm1 tm1, CharSequence charSequence) {
        tm1.getNameTextView().setText(charSequence);
        return Unit.INSTANCE;
    }

    public static on1 M(Context context, tm1 tm1) {
        on1 on1 = new on1(context);
        on1.setId(qqa.Y0);
        on1.setForeground(tm1.getForegroundDrawable());
        on1.setLayoutParams(new fj3(-1, -1));
        on1.setFullScreen(true);
        kne.S(on1, false);
        on1.setListener(new d9d(21, tm1));
        on1.setVideoLayoutUpdatesControllerProvider(new nm1(0, tm1));
        return on1;
    }

    public static Unit N(tm1 tm1, CharSequence charSequence) {
        tm1.getSpeakerLabelView().setLabel(charSequence);
        return Unit.INSTANCE;
    }

    public static ImageView O(Context context, tm1 tm1) {
        ImageView imageView = new ImageView(context);
        imageView.setId(qqa.W0);
        int roundToInt = MathKt.roundToInt(((float) 18) * vo4.c().getDisplayMetrics().density);
        imageView.setPadding(roundToInt, roundToInt, roundToInt, roundToInt);
        float f = (float) 72;
        imageView.setLayoutParams(new ViewGroup.MarginLayoutParams(MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f), MathKt.roundToInt(f * vo4.c().getDisplayMetrics().density)));
        imageView.setVisibility(8);
        imageView.setBackground(tm1.getLockedDrawable());
        imageView.setImageResource(pqa.x);
        imageView.setImageTintList(ColorStateList.valueOf(l2b.f.f));
        return imageView;
    }

    public static void R(jg jgVar, tm1 tm1) {
        float f = jgVar.a;
        int max = Math.max((int) (((float) tm1.getHeight()) * f), MathKt.roundToInt(((float) 100) * vo4.c().getDisplayMetrics().density));
        int i = y7e.I(tm1.P0) ? tm1.getRenderVideoView().w0 : false ? 0 : (int) (((float) KotlinVersion.MAX_COMPONENT_VALUE) * f);
        int backgroundCenterY = (int) (((float) tm1.getBackgroundCenterY()) * f);
        p7e background = tm1.getBackground();
        if (background != null) {
            background.setBounds(0, 0, tm1.getWidth(), max);
            background.a(backgroundCenterY);
            tm1.c0(i, true);
        }
    }

    public static void S(tm1 tm1, boolean z) {
        kne.S(tm1.getRenderVideoView(), z);
        boolean z2 = !z;
        if (y7e.F(tm1.E0) != z2) {
            y7e.k(tm1.E0, z2, 0, new om1(tm1, z2, 0), 2);
        }
        tm1.c0(z2 ? KotlinVersion.MAX_COMPONENT_VALUE : 0, false);
    }

    public static Unit T(tm1 tm1, CharSequence charSequence) {
        tm1.getStatusTextView().setText(charSequence);
        return Unit.INSTANCE;
    }

    /* access modifiers changed from: private */
    public final p7e getAnimatedBackground() {
        return (p7e) this.j1.getValue();
    }

    private final int getBackgroundCenterY() {
        OneMeAvatarView oneMeAvatarView = this.E0;
        return (oneMeAvatarView.getHeight() / 2) + oneMeAvatarView.getTop();
    }

    private final ImageView getBlockedLabelView() {
        return (ImageView) this.L0.getValue();
    }

    private final ShapeDrawable getDisableDrawable() {
        return (ShapeDrawable) this.g1.getValue();
    }

    private final GradientDrawable getForegroundDrawable() {
        return (GradientDrawable) this.i1.getValue();
    }

    private final ShapeDrawable getLockedDrawable() {
        return (ShapeDrawable) this.f1.getValue();
    }

    private final TextView getNameTextView() {
        return (TextView) this.F0.getValue();
    }

    /* access modifiers changed from: private */
    public final p8d getNegativeButtonView() {
        return (p8d) this.K0.getValue();
    }

    /* access modifiers changed from: private */
    public final p8d getPositiveButtonView() {
        return (p8d) this.J0.getValue();
    }

    private final on1 getRenderVideoView() {
        return (on1) this.H0.getValue();
    }

    private final wgd getScreenInfo() {
        return (wgd) this.M0.getValue();
    }

    private final jk1 getSpeakerLabelView() {
        return (jk1) this.I0.getValue();
    }

    private final TextView getStatusTextView() {
        return (TextView) this.G0.getValue();
    }

    private final InsetDrawable getTalkingDrawable() {
        return (InsetDrawable) this.h1.getValue();
    }

    /* access modifiers changed from: private */
    public static final void setNegativeAction$lambda$59$lambda$58(Function0 function0) {
        function0.invoke();
    }

    /* access modifiers changed from: private */
    public static final void setPositiveAction$lambda$61$lambda$60(Function0 function0) {
        function0.invoke();
    }

    public final void C(long j, List list, boolean z) {
        if (y7e.I(this.N0)) {
            y7e.b(list, getStatusTextView(), z);
        }
        if (y7e.I(this.O0)) {
            y7e.b(list, getNameTextView(), z);
        }
        float f = 1.0f;
        float f2 = z ? 0.0f : 1.0f;
        if (!z) {
            f = 0.0f;
        }
        jg jgVar = new jg("background", f2);
        if (!(y7e.I(this.P0) ? getRenderVideoView().w0 : false)) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat((Object) null, jgVar, new float[]{f2, f});
            ofFloat.addUpdateListener(new bn(1, jgVar, this));
            list.add(ofFloat);
            y7e.b(list, this.E0, z);
        }
    }

    public final void X(boolean z) {
        if (!Intrinsics.areEqual((Object) this.X0, (Object) Boolean.valueOf(z))) {
            ShapeDrawable shapeDrawable = null;
            y7e.C(this.T0, getBlockedLabelView(), (Function0) null);
            this.X0 = Boolean.valueOf(z);
            getBlockedLabelView().setVisibility(z ? 0 : 8);
            ShapeDrawable disableDrawable = getDisableDrawable();
            if (z) {
                shapeDrawable = disableDrawable;
            }
            this.E0.setForeground(shapeDrawable);
        }
    }

    public final void Y(boolean z) {
        if (!Intrinsics.areEqual((Object) this.W0, (Object) Boolean.valueOf(z))) {
            this.W0 = Boolean.valueOf(z);
            InsetDrawable talkingDrawable = getTalkingDrawable();
            if (!z) {
                talkingDrawable = null;
            }
            this.E0.setForeground(talkingDrawable);
        }
    }

    public final void Z(CharSequence charSequence, String str) {
        ViewStub viewStub = this.S0;
        if (((charSequence != null && !StringsKt.isBlank(charSequence)) || y7e.I(viewStub)) && !Intrinsics.areEqual((Object) this.a1, (Object) charSequence)) {
            y7e.C(viewStub, getSpeakerLabelView(), (Function0) null);
            this.a1 = charSequence;
            if (charSequence != null && !StringsKt.isBlank(charSequence)) {
                getSpeakerLabelView().setLabel(charSequence);
            }
            y7e.k(getSpeakerLabelView(), !(charSequence == null || StringsKt.isBlank(charSequence)), 0, new km1(this, charSequence, 2), 2);
            getSpeakerLabelView().setContentDescription(str);
        }
    }

    public final void a(boolean z) {
        if (z) {
            if (y7e.I(this.N0)) {
                TextView statusTextView = getStatusTextView();
                statusTextView.setTranslationY(c44.DEFAULT_ASPECT_RATIO);
                statusTextView.setAlpha(1.0f);
            }
            if (y7e.I(this.O0)) {
                TextView nameTextView = getNameTextView();
                nameTextView.setTranslationY(c44.DEFAULT_ASPECT_RATIO);
                nameTextView.setAlpha(1.0f);
            }
            OneMeAvatarView oneMeAvatarView = this.E0;
            oneMeAvatarView.setTranslationY(c44.DEFAULT_ASPECT_RATIO);
            oneMeAvatarView.setAlpha(1.0f);
            int i = y7e.I(this.P0) ? getRenderVideoView().w0 : false ? 0 : KotlinVersion.MAX_COMPONENT_VALUE;
            int height = getHeight();
            int backgroundCenterY = getBackgroundCenterY();
            p7e background = getBackground();
            if (background != null) {
                background.setBounds(0, 0, getWidth(), height);
                background.a(backgroundCenterY);
                c0(i, true);
            }
        }
    }

    public final void a0(int i, int i2, Function0 function0) {
        ViewStub viewStub = this.Q0;
        y7e.I(viewStub);
        y7e.C(viewStub, getNegativeButtonView(), (Function0) null);
        p8d negativeButtonView = getNegativeButtonView();
        negativeButtonView.setVisibility(0);
        if (negativeButtonView.getVisibility() == 0) {
            p8d.P(negativeButtonView, i);
            negativeButtonView.setAccessibility(Integer.valueOf(i2));
            negativeButtonView.setListener(new mm1(1, function0));
        }
    }

    public final void b0(boolean z, int i, int i2, Function0 function0) {
        ViewStub viewStub = this.R0;
        if (y7e.I(viewStub) || z) {
            y7e.C(viewStub, getPositiveButtonView(), (Function0) null);
            p8d positiveButtonView = getPositiveButtonView();
            positiveButtonView.setVisibility(z ? 0 : 8);
            if (positiveButtonView.getVisibility() == 0) {
                p8d.P(positiveButtonView, i);
                positiveButtonView.setAccessibility(Integer.valueOf(i2));
                positiveButtonView.setListener(new mm1(0, function0));
            }
        }
    }

    public final void c0(int i, boolean z) {
        Drawable background;
        int i2 = qqa.a;
        Object tag = getTag(i2);
        if ((tag == null && ((background = getBackground()) == null || background.getAlpha() != i)) || !Intrinsics.areEqual(tag, (Object) Integer.valueOf(i))) {
            AnimatorSet animatorSet = this.e1;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            long j = z ? 0 : 200;
            Drawable background2 = getBackground();
            int alpha = background2 != null ? background2.getAlpha() : 0;
            pg pgVar = new pg("alpha", alpha);
            setTag(i2, Integer.valueOf(i));
            AnimatorSet animatorSet2 = new AnimatorSet();
            animatorSet2.setDuration(j);
            animatorSet2.setInterpolator(new DecelerateInterpolator());
            ObjectAnimator ofInt = ObjectAnimator.ofInt((Object) null, pgVar, new int[]{alpha, i});
            ofInt.addUpdateListener(new yg(this, pgVar, 0));
            animatorSet2.addListener(new zg(this, i, 0));
            animatorSet2.play(ofInt);
            animatorSet2.start();
            this.e1 = animatorSet2;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0020, code lost:
        if ((r3 != null ? r3.a : false) == false) goto L_0x0022;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void d0(defpackage.o0g r8) {
        /*
            r7 = this;
            android.view.ViewStub r0 = r7.P0
            r1 = 0
            if (r8 == 0) goto L_0x0022
            boolean r2 = r8.b
            r3 = 0
            boolean r4 = r8.g
            if (r2 == 0) goto L_0x000f
            if (r4 == 0) goto L_0x000f
            goto L_0x001a
        L_0x000f:
            if (r4 == 0) goto L_0x0014
            x8g r3 = r8.h
            goto L_0x001a
        L_0x0014:
            boolean r2 = r8.c
            if (r2 == 0) goto L_0x001a
            x8g r3 = r8.d
        L_0x001a:
            if (r3 == 0) goto L_0x001f
            boolean r2 = r3.a
            goto L_0x0020
        L_0x001f:
            r2 = r1
        L_0x0020:
            if (r2 != 0) goto L_0x0029
        L_0x0022:
            boolean r2 = defpackage.y7e.I(r0)
            if (r2 != 0) goto L_0x0029
            return
        L_0x0029:
            on1 r2 = r7.getRenderVideoView()
            boolean r3 = defpackage.y7e.I(r0)
            if (r3 != 0) goto L_0x0067
            android.view.ViewParent r3 = r0.getParent()
            android.view.ViewGroup r3 = (android.view.ViewGroup) r3
            int r4 = r3.indexOfChild(r0)
            r3.removeViewInLayout(r0)
            android.view.ViewGroup$LayoutParams r5 = r0.getLayoutParams()
            android.view.ViewGroup$LayoutParams r6 = r2.getLayoutParams()
            int r6 = r6.height
            r5.height = r6
            android.view.ViewGroup$LayoutParams r6 = r2.getLayoutParams()
            int r6 = r6.width
            r5.width = r6
            int r0 = r0.getId()
            r2.setId(r0)
            r3.addView(r2, r4, r5)
            on1 r0 = r7.getRenderVideoView()
            defpackage.kne.S(r0, r1)
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
        L_0x0067:
            on1 r0 = r7.getRenderVideoView()
            int r2 = defpackage.on1.x0
            r0.w = r8
            r0.x = r1
            on1 r7 = r7.getRenderVideoView()
            r7.d()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tm1.d0(o0g):void");
    }

    public final qm1 getBackgroundState() {
        return (qm1) this.l1.getValue(this, m1[1]);
    }

    public final pm1 getMode() {
        return (pm1) this.k1.getValue(this, m1[0]);
    }

    public /* bridge */ /* synthetic */ boolean getShouldScaleMainOpponent() {
        return false;
    }

    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        p7e background = getBackground();
        if (background != null) {
            background.onThemeChanged(l2b.a);
        }
        p7e background2 = getBackground();
        if (background2 != null) {
            background2.start();
        }
    }

    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        p7e background = getBackground();
        if (background != null) {
            background.stop();
        }
    }

    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        p7e background;
        super.onLayout(z, i, i2, i3, i4);
        if (z && (background = getBackground()) != null) {
            background.a(getBackgroundCenterY());
        }
    }

    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (getScreenInfo().g) {
            getAnimatedBackground().o = Math.min(i, i2) / 4;
        }
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return this.U0.onTouchEvent(motionEvent);
    }

    public final void setAvatar(zd0 zd0) {
        gd0 gd0 = null;
        String str = zd0 != null ? zd0.b : null;
        OneMeAvatarView oneMeAvatarView = this.E0;
        oneMeAvatarView.setAvatarUrl(str);
        if (zd0 != null) {
            gd0 = zd0.a;
        }
        oneMeAvatarView.f(gd0, true);
    }

    public final void setBackgroundState(qm1 qm1) {
        this.l1.setValue(this, m1[1], qm1);
    }

    public final void setListener(rm1 rm1) {
        this.b1 = rm1;
    }

    public final void setMode(pm1 pm1) {
        this.k1.setValue(this, m1[0], pm1);
    }

    public final void setName(CharSequence charSequence) {
        ViewStub viewStub = this.O0;
        if ((y7e.I(viewStub) || charSequence != null) && !Intrinsics.areEqual((Object) this.Y0, (Object) charSequence)) {
            y7e.C(viewStub, getNameTextView(), (Function0) null);
            this.Y0 = charSequence;
            if (charSequence != null && !StringsKt.isBlank(charSequence)) {
                getNameTextView().setText(charSequence);
            }
            y7e.k(getNameTextView(), !(charSequence == null || StringsKt.isBlank(charSequence)), 0, new km1(this, charSequence, 1), 2);
        }
    }

    public final void setParticipantId(ze1 ze1) {
        this.d1 = ze1;
    }

    public final void setStatus(CharSequence charSequence) {
        ViewStub viewStub = this.N0;
        if ((y7e.I(viewStub) || charSequence != null) && !Intrinsics.areEqual((Object) this.Z0, (Object) charSequence)) {
            y7e.C(viewStub, getStatusTextView(), (Function0) null);
            this.Z0 = charSequence;
            if (charSequence != null && !StringsKt.isBlank(charSequence)) {
                getStatusTextView().setText(charSequence);
            }
            y7e.k(getStatusTextView(), !(charSequence == null || StringsKt.isBlank(charSequence)), 0, new km1(this, charSequence, 0), 2);
        }
    }

    public final void setVideoLayoutUpdatesControllerProvider(Function0<p6g> function0) {
        this.c1 = function0;
    }

    public final boolean verifyDrawable(Drawable drawable) {
        if (!super.verifyDrawable(drawable)) {
            p7e background = getBackground();
            if (background == null) {
                return false;
            }
            if (drawable != background) {
                int numberOfLayers = background.getNumberOfLayers();
                int i = 0;
                while (i < numberOfLayers) {
                    if (background.getDrawable(i) != drawable) {
                        i++;
                    }
                }
                return false;
            }
        }
        return true;
    }

    public final void x(boolean z) {
        if (z) {
            if (y7e.I(this.S0)) {
                getSpeakerLabelView().setAlpha(1.0f);
            }
            if (y7e.I(this.O0)) {
                getNameTextView().setAlpha(1.0f);
            }
            if (y7e.I(this.N0)) {
                getStatusTextView().setAlpha(1.0f);
            }
        }
    }

    public final void y(long j, List list, boolean z) {
        float f = 1.0f;
        float f2 = z ? 0.0f : 1.0f;
        if (!z) {
            f = 0.0f;
        }
        if (y7e.I(this.S0)) {
            jk1 speakerLabelView = getSpeakerLabelView();
            if (y7e.P(speakerLabelView, z)) {
                list.add(y7e.e(speakerLabelView, z, f2, f, j));
            }
        }
        if (y7e.I(this.O0)) {
            TextView nameTextView = getNameTextView();
            if (y7e.P(nameTextView, z)) {
                list.add(y7e.e(nameTextView, z, f2, f, j));
            }
        }
        if (y7e.I(this.N0)) {
            TextView statusTextView = getStatusTextView();
            if (y7e.P(statusTextView, z)) {
                list.add(y7e.e(statusTextView, z, f2, f, j));
            }
        }
    }

    public p7e getBackground() {
        Drawable background = super.getBackground();
        if (background instanceof p7e) {
            return (p7e) background;
        }
        return null;
    }
}
