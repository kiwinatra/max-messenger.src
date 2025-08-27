package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.StateListDrawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatCheckBox;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.math.MathKt;
import kotlin.properties.Delegates;
import kotlin.reflect.KProperty;
import kotlin.text.StringsKt;
import one.me.sdk.uikit.common.avatar.OneMeAvatarView;
import one.me.sdk.uikit.common.button.OneMeButton;

/* renamed from: ol3  reason: default package */
public final class ol3 extends ConstraintLayout implements phf {
    public static final /* synthetic */ KProperty[] c1;
    public final OneMeAvatarView E0;
    public final AppCompatTextView F0;
    public final Lazy G0;
    public final Lazy H0;
    public final Lazy I0;
    public final Lazy J0;
    public final Lazy K0;
    public final Lazy L0;
    public final Lazy M0;
    public final Lazy N0;
    public final nl3 O0 = new nl3(this, 0);
    public final nl3 P0 = new nl3(this, 1);
    public final nl3 Q0 = new nl3(this, 2);
    public final Lazy R0;
    public final r3d S0;
    public final Lazy T0;
    public final Lazy U0;
    public final r3d V0;
    public final r3d W0;
    public final Lazy X0;
    public final Lazy Y0;
    public final Lazy Z0;
    public final int a1;
    public int b1;

    static {
        Class<ol3> cls = ol3.class;
        c1 = new KProperty[]{rae.s(cls, "isSelectionEnabled", "isSelectionEnabled()Z", 0), rae.s(cls, "isContactSelected", "isContactSelected()Z", 0), rae.s(cls, "customTheme", "getCustomTheme()Lone/me/sdk/design/OneMeTheme;", 0)};
    }

    public ol3(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        OneMeAvatarView oneMeAvatarView = new OneMeAvatarView(context, (AttributeSet) null);
        oneMeAvatarView.setId(dad.z);
        oneMeAvatarView.setAvatarShape(goa.a);
        this.E0 = oneMeAvatarView;
        AppCompatTextView appCompatTextView = new AppCompatTextView(context, (AttributeSet) null);
        appCompatTextView.setId(dad.D);
        appCompatTextView.setEllipsize(TextUtils.TruncateAt.END);
        appCompatTextView.setTextColor(fu4.k.e(appCompatTextView.getContext()).f().getText().e);
        puf.i.b(appCompatTextView, uy4.b);
        appCompatTextView.setSingleLine();
        this.F0 = appCompatTextView;
        ml3 ml3 = new ml3(context, this, 0);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.G0 = LazyKt.lazy(lazyThreadSafetyMode, ml3);
        this.H0 = LazyKt.lazy(lazyThreadSafetyMode, new ml3(context, this, 1));
        this.I0 = LazyKt.lazy(lazyThreadSafetyMode, new ml3(context, this, 2));
        this.J0 = LazyKt.lazy(lazyThreadSafetyMode, new ml3(context, this, 3));
        this.K0 = LazyKt.lazy(lazyThreadSafetyMode, new ml3(context, this, 4));
        this.L0 = LazyKt.lazy(lazyThreadSafetyMode, new v4(context, 29));
        this.M0 = LazyKt.lazy(lazyThreadSafetyMode, new ml3(context, this, 5));
        this.N0 = LazyKt.lazy(lazyThreadSafetyMode, new nm1(15, this));
        Delegates delegates = Delegates.INSTANCE;
        this.R0 = LazyKt.lazy(lazyThreadSafetyMode, new s01(12, (Object) this));
        this.S0 = cvg.I(new s01(10, (Object) this));
        this.T0 = LazyKt.lazy(lazyThreadSafetyMode, new s01(8, (Object) this));
        this.U0 = LazyKt.lazy(lazyThreadSafetyMode, new s01(9, (Object) this));
        this.V0 = cvg.I(new s01(14, (Object) this));
        this.W0 = cvg.I(new s01(15, (Object) this));
        this.X0 = LazyKt.lazy(lazyThreadSafetyMode, new s01(11, (Object) this));
        this.Y0 = LazyKt.lazy(lazyThreadSafetyMode, new s01(13, (Object) this));
        this.Z0 = LazyKt.lazy(lazyThreadSafetyMode, new s01(16, (Object) this));
        int roundToInt = MathKt.roundToInt(((float) 40) * vo4.c().getDisplayMetrics().density);
        this.a1 = roundToInt;
        int roundToInt2 = MathKt.roundToInt(((float) 60) * vo4.c().getDisplayMetrics().density);
        this.b1 = roundToInt;
        float f = (float) 12;
        float f2 = (float) 6;
        setPadding(MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f), MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f2), MathKt.roundToInt(f * vo4.c().getDisplayMetrics().density), MathKt.roundToInt(f2 * vo4.c().getDisplayMetrics().density));
        addView(oneMeAvatarView, new fj3(roundToInt, roundToInt));
        fj3 fj3 = new fj3(-2, MathKt.roundToInt(((float) 20) * vo4.c().getDisplayMetrics().density));
        fj3.E = c44.DEFAULT_ASPECT_RATIO;
        Unit unit = Unit.INSTANCE;
        addView(appCompatTextView, fj3);
        setLayoutParams(new fj3(-1, roundToInt2));
        U();
    }

    public static AppCompatCheckBox L(Context context, ol3 ol3) {
        AppCompatCheckBox appCompatCheckBox = new AppCompatCheckBox(context, (AttributeSet) null);
        appCompatCheckBox.setId(dad.B);
        appCompatCheckBox.setPadding(0, 0, 0, 0);
        appCompatCheckBox.setButtonDrawable((Drawable) null);
        appCompatCheckBox.setBackground(ol3.getCheckboxDrawable());
        appCompatCheckBox.setClickable(false);
        float f = (float) 24;
        ol3.addView(appCompatCheckBox, new fj3(MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f), MathKt.roundToInt(f * vo4.c().getDisplayMetrics().density)));
        return appCompatCheckBox;
    }

    public static final void M(ol3 ol3) {
        if (y7e.L(ol3.M0)) {
            ol3.getWithRadioButtonConstraint().a(ol3);
        } else {
            ol3.U();
        }
    }

    public static final pj3 N(ol3 ol3) {
        ol3.getClass();
        pj3 pj3 = new pj3();
        pj3.d(ol3);
        OneMeAvatarView oneMeAvatarView = ol3.E0;
        int id = oneMeAvatarView.getId();
        pj3.e(id, 3, 0, 3);
        pj3.e(id, 4, 0, 4);
        pj3.e(id, 6, 0, 6);
        AppCompatTextView appCompatTextView = ol3.F0;
        int id2 = appCompatTextView.getId();
        pj3.e(id2, 3, 0, 3);
        pj3.e(id2, 4, ol3.getMessageView().getId(), 3);
        pj3.e(id2, 6, oneMeAvatarView.getId(), 7);
        float f = (float) 12;
        tr1.u(f, vo4.c().getDisplayMetrics().density, new ila(pj3, 6, id2, 4));
        pj3.e(id2, 7, ol3.getButtonAudioCallView().getId(), 6);
        new ila(pj3, 7, id2, 4).e(MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f));
        pj3.j(id2).d.l0 = true;
        int id3 = ol3.getMessageView().getId();
        pj3.e(id3, 3, appCompatTextView.getId(), 4);
        tr1.u((float) 2, vo4.c().getDisplayMetrics().density, new ila(pj3, 3, id3, 4));
        pj3.e(id3, 4, 0, 4);
        pj3.e(id3, 6, oneMeAvatarView.getId(), 7);
        tr1.u(f, vo4.c().getDisplayMetrics().density, new ila(pj3, 6, id3, 4));
        pj3.e(id3, 7, ol3.getButtonAudioCallView().getId(), 6);
        new ila(pj3, 7, id3, 4).e(MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f));
        pj3.j(id3).d.l0 = true;
        int id4 = ol3.getButtonAudioCallView().getId();
        pj3.e(id4, 3, 0, 3);
        pj3.e(id4, 4, 0, 4);
        pj3.e(id4, 7, ol3.getButtonVideoCallView().getId(), 6);
        tr1.u(f, vo4.c().getDisplayMetrics().density, new ila(pj3, 7, id4, 4));
        int id5 = ol3.getButtonVideoCallView().getId();
        pj3.e(id5, 3, 0, 3);
        pj3.e(id5, 4, 0, 4);
        pj3.e(id5, 7, 0, 7);
        return pj3;
    }

    public static final pj3 O(ol3 ol3) {
        ol3.getClass();
        pj3 pj3 = new pj3();
        pj3.d(ol3);
        OneMeAvatarView oneMeAvatarView = ol3.E0;
        int id = oneMeAvatarView.getId();
        pj3.e(id, 3, 0, 3);
        pj3.e(id, 4, 0, 4);
        pj3.e(id, 6, 0, 6);
        int id2 = ol3.F0.getId();
        pj3.e(id2, 3, 0, 3);
        pj3.e(id2, 4, 0, 4);
        pj3.e(id2, 6, oneMeAvatarView.getId(), 7);
        float f = (float) 12;
        tr1.u(f, vo4.c().getDisplayMetrics().density, new ila(pj3, 6, id2, 4));
        pj3.e(id2, 7, ol3.getButtonView().getId(), 6);
        new ila(pj3, 7, id2, 4).e(MathKt.roundToInt(f * vo4.c().getDisplayMetrics().density));
        pj3.j(id2).d.l0 = true;
        int id3 = ol3.getButtonView().getId();
        pj3.e(id3, 3, 0, 3);
        pj3.e(id3, 4, 0, 4);
        pj3.e(id3, 7, 0, 7);
        return pj3;
    }

    public static final pj3 P(ol3 ol3) {
        ol3.getClass();
        pj3 pj3 = new pj3();
        pj3.d(ol3);
        OneMeAvatarView oneMeAvatarView = ol3.E0;
        int id = oneMeAvatarView.getId();
        pj3.e(id, 3, 0, 3);
        pj3.e(id, 4, 0, 4);
        pj3.e(id, 6, 0, 6);
        AppCompatTextView appCompatTextView = ol3.F0;
        int id2 = appCompatTextView.getId();
        pj3.e(id2, 3, 0, 3);
        pj3.e(id2, 4, 0, 4);
        pj3.e(id2, 6, oneMeAvatarView.getId(), 7);
        float f = (float) 12;
        tr1.u(f, vo4.c().getDisplayMetrics().density, new ila(pj3, 6, id2, 4));
        Lazy lazy = ol3.H0;
        if (y7e.L(lazy)) {
            pj3.e(id2, 7, ol3.getAliasView().getId(), 6);
            tr1.u(f, vo4.c().getDisplayMetrics().density, new ila(pj3, 7, id2, 4));
        } else {
            pj3.e(id2, 7, 0, 7);
            new ila(pj3, 7, id2, 4).e(0);
        }
        pj3.j(id2).d.l0 = true;
        if (y7e.L(lazy)) {
            int id3 = ol3.getAliasView().getId();
            pj3.e(id3, 3, appCompatTextView.getId(), 3);
            pj3.e(id3, 4, appCompatTextView.getId(), 4);
            pj3.e(id3, 7, 0, 7);
            new ila(pj3, 7, id3, 4).e(MathKt.roundToInt(f * vo4.c().getDisplayMetrics().density));
            pj3.j(id3).d.l0 = true;
        }
        return pj3;
    }

    public static final pj3 Q(ol3 ol3) {
        ol3.getClass();
        pj3 pj3 = new pj3();
        pj3.d(ol3);
        OneMeAvatarView oneMeAvatarView = ol3.E0;
        int id = oneMeAvatarView.getId();
        pj3.e(id, 3, 0, 3);
        pj3.e(id, 4, 0, 4);
        pj3.e(id, 6, 0, 6);
        AppCompatTextView appCompatTextView = ol3.F0;
        int id2 = appCompatTextView.getId();
        pj3.e(id2, 3, 0, 3);
        pj3.e(id2, 4, ol3.getMessageView().getId(), 3);
        pj3.e(id2, 6, oneMeAvatarView.getId(), 7);
        float f = (float) 12;
        tr1.u(f, vo4.c().getDisplayMetrics().density, new ila(pj3, 6, id2, 4));
        pj3.e(id2, 7, ol3.getButtonView().getId(), 6);
        new ila(pj3, 7, id2, 4).e(MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f));
        pj3.j(id2).d.l0 = true;
        int id3 = ol3.getMessageView().getId();
        pj3.e(id3, 3, appCompatTextView.getId(), 4);
        tr1.u((float) 2, vo4.c().getDisplayMetrics().density, new ila(pj3, 3, id3, 4));
        pj3.e(id3, 4, 0, 4);
        pj3.e(id3, 6, oneMeAvatarView.getId(), 7);
        tr1.u(f, vo4.c().getDisplayMetrics().density, new ila(pj3, 6, id3, 4));
        pj3.e(id3, 7, ol3.getButtonView().getId(), 6);
        new ila(pj3, 7, id3, 4).e(MathKt.roundToInt(f * vo4.c().getDisplayMetrics().density));
        pj3.j(id3).d.l0 = true;
        int id4 = ol3.getButtonView().getId();
        pj3.e(id4, 3, 0, 3);
        pj3.e(id4, 4, 0, 4);
        pj3.e(id4, 7, 0, 7);
        return pj3;
    }

    public static final pj3 R(ol3 ol3) {
        ol3.getClass();
        pj3 pj3 = new pj3();
        pj3.d(ol3);
        AppCompatTextView appCompatTextView = ol3.F0;
        int id = appCompatTextView.getId();
        pj3.e(id, 3, 0, 3);
        pj3.e(id, 4, ol3.getMessageView().getId(), 3);
        pj3.e(id, 6, 0, 6);
        new ila(pj3, 6, id, 4).e(0);
        pj3.e(id, 7, 0, 7);
        new ila(pj3, 7, id, 4).e(0);
        pj3.j(id).d.l0 = true;
        int id2 = ol3.getMessageView().getId();
        pj3.e(id2, 3, appCompatTextView.getId(), 4);
        tr1.u((float) 2, vo4.c().getDisplayMetrics().density, new ila(pj3, 3, id2, 4));
        pj3.e(id2, 4, 0, 4);
        pj3.e(id2, 6, 0, 6);
        new ila(pj3, 6, id2, 4).e(0);
        pj3.e(id2, 7, 0, 7);
        new ila(pj3, 7, id2, 4).e(0);
        pj3.j(id2).d.l0 = true;
        return pj3;
    }

    public static final pj3 S(ol3 ol3) {
        ol3.getClass();
        pj3 pj3 = new pj3();
        pj3.d(ol3);
        OneMeAvatarView oneMeAvatarView = ol3.E0;
        int id = oneMeAvatarView.getId();
        pj3.e(id, 3, 0, 3);
        pj3.e(id, 4, 0, 4);
        pj3.e(id, 6, 0, 6);
        AppCompatTextView appCompatTextView = ol3.F0;
        int id2 = appCompatTextView.getId();
        pj3.e(id2, 3, 0, 3);
        pj3.e(id2, 4, ol3.getMessageView().getId(), 3);
        pj3.e(id2, 6, oneMeAvatarView.getId(), 7);
        float f = (float) 12;
        tr1.u(f, vo4.c().getDisplayMetrics().density, new ila(pj3, 6, id2, 4));
        Lazy lazy = ol3.H0;
        if (y7e.L(lazy)) {
            pj3.e(id2, 7, ol3.getAliasView().getId(), 6);
            tr1.u(f, vo4.c().getDisplayMetrics().density, new ila(pj3, 7, id2, 4));
        } else {
            pj3.e(id2, 7, 0, 7);
            new ila(pj3, 7, id2, 4).e(0);
        }
        pj3.j(id2).d.l0 = true;
        int id3 = ol3.getMessageView().getId();
        pj3.e(id3, 3, appCompatTextView.getId(), 4);
        tr1.u((float) 2, vo4.c().getDisplayMetrics().density, new ila(pj3, 3, id3, 4));
        pj3.e(id3, 4, 0, 4);
        pj3.e(id3, 6, oneMeAvatarView.getId(), 7);
        tr1.u(f, vo4.c().getDisplayMetrics().density, new ila(pj3, 6, id3, 4));
        pj3.e(id3, 7, 0, 7);
        new ila(pj3, 7, id3, 4).e(0);
        pj3.j(id3).d.l0 = true;
        if (y7e.L(lazy)) {
            int id4 = ol3.getAliasView().getId();
            pj3.e(id4, 3, appCompatTextView.getId(), 3);
            pj3.e(id4, 4, ol3.getMessageView().getId(), 4);
            pj3.e(id4, 7, 0, 7);
            new ila(pj3, 7, id4, 4).e(MathKt.roundToInt(f * vo4.c().getDisplayMetrics().density));
            pj3.j(id4).d.l0 = true;
        }
        return pj3;
    }

    public static final pj3 T(ol3 ol3) {
        ol3.getClass();
        pj3 pj3 = new pj3();
        pj3.d(ol3);
        OneMeAvatarView oneMeAvatarView = ol3.E0;
        int id = oneMeAvatarView.getId();
        pj3.e(id, 3, 0, 3);
        pj3.e(id, 4, 0, 4);
        pj3.e(id, 6, 0, 6);
        pj3.g(id, ol3.b1);
        pj3.f(id, ol3.b1);
        AppCompatTextView appCompatTextView = ol3.F0;
        ni0 ni0 = new ni0((Object) pj3, appCompatTextView.getId(), 4);
        ni0.R(0);
        ni0.d(ol3.getMessageView().getId());
        float f = (float) 12;
        tr1.u(f, vo4.c().getDisplayMetrics().density, ni0.O(oneMeAvatarView.getId()));
        Lazy lazy = ol3.H0;
        if (y7e.L(lazy)) {
            tr1.u(f, vo4.c().getDisplayMetrics().density, ni0.v(ol3.getAliasView().getId()));
        } else {
            ni0.t(0).e(0);
        }
        ni0.k();
        ni0.T();
        int id2 = ol3.getMessageView().getId();
        pj3.e(id2, 3, appCompatTextView.getId(), 4);
        tr1.u((float) 2, vo4.c().getDisplayMetrics().density, new ila(pj3, 3, id2, 4));
        pj3.e(id2, 4, 0, 4);
        pj3.e(id2, 6, oneMeAvatarView.getId(), 7);
        tr1.u(f, vo4.c().getDisplayMetrics().density, new ila(pj3, 6, id2, 4));
        pj3.e(id2, 7, 0, 7);
        new ila(pj3, 7, id2, 4).e(0);
        pj3.j(id2).d.l0 = true;
        if (y7e.L(lazy)) {
            int id3 = ol3.getAliasView().getId();
            pj3.e(id3, 3, appCompatTextView.getId(), 3);
            pj3.e(id3, 4, ol3.getMessageView().getId(), 4);
            pj3.e(id3, 7, 0, 7);
            new ila(pj3, 7, id3, 4).e(MathKt.roundToInt(f * vo4.c().getDisplayMetrics().density));
            pj3.j(id3).d.l0 = true;
        }
        return pj3;
    }

    public static /* synthetic */ void b0(ol3 ol3, Integer num, zpa zpa, Function0 function0, int i) {
        if ((i & 2) != 0) {
            zpa = zpa.b;
        }
        ol3.a0(num, zpa, xpa.c, function0);
    }

    private final TextView getAliasView() {
        return (TextView) this.H0.getValue();
    }

    private final AppCompatImageView getButtonAudioCallView() {
        return (AppCompatImageView) this.K0.getValue();
    }

    private final AppCompatImageView getButtonVideoCallView() {
        return (AppCompatImageView) this.J0.getValue();
    }

    private final OneMeButton getButtonView() {
        return (OneMeButton) this.I0.getValue();
    }

    private final StateListDrawable getCheckboxDrawable() {
        return (StateListDrawable) this.L0.getValue();
    }

    private final TextView getMessageView() {
        return (TextView) this.G0.getValue();
    }

    private final RippleDrawable getRippleDrawable() {
        return (RippleDrawable) this.N0.getValue();
    }

    private final pj3 getSingleLineWithButtonConstraint() {
        return (pj3) this.T0.getValue();
    }

    private final pj3 getSingleLineWithoutAvatarConstraint() {
        return (pj3) this.U0.getValue();
    }

    private final pj3 getTwoLineWithButtonConstraint() {
        return (pj3) this.X0.getValue();
    }

    private final pj3 getTwoLineWithCallButtonConstraint() {
        return (pj3) this.R0.getValue();
    }

    private final pj3 getTwoLineWithoutAvatarConstraint() {
        return (pj3) this.Y0.getValue();
    }

    private final pj3 getWithRadioButtonConstraint() {
        return (pj3) this.Z0.getValue();
    }

    public final void U() {
        CharSequence text;
        boolean z = false;
        boolean z2 = this.E0.getVisibility() == 0;
        if (y7e.L(this.G0) && (text = getMessageView().getText()) != null && !StringsKt.isBlank(text)) {
            z = true;
        }
        boolean L = y7e.L(this.I0);
        ((y7e.L(this.J0) || y7e.L(this.K0)) ? getTwoLineWithCallButtonConstraint() : (z2 || z) ? !z2 ? getTwoLineWithoutAvatarConstraint() : (z || L) ? (z || !L) ? (!z || L || this.b1 == this.a1) ? (!z || L) ? getTwoLineWithButtonConstraint() : (pj3) this.V0.getValue() : (pj3) this.W0.getValue() : getSingleLineWithButtonConstraint() : (pj3) this.S0.getValue() : getSingleLineWithoutAvatarConstraint()).a(this);
    }

    public final boolean V(String str) {
        return (str == null || str.length() == 0 || getMessageView().getPaint().measureText(str) <= ((float) getMessageView().getMeasuredWidth())) ? false : true;
    }

    public final boolean W(String str) {
        if (str == null || str.length() == 0) {
            return false;
        }
        AppCompatTextView appCompatTextView = this.F0;
        return appCompatTextView.getPaint().measureText(str) > ((float) appCompatTextView.getMeasuredWidth());
    }

    public final void X() {
        if (y7e.L(this.I0)) {
            getButtonView().setOnClickListener((View.OnClickListener) null);
            getButtonView().setVisibility(8);
        }
        if (y7e.L(this.K0)) {
            getButtonAudioCallView().setOnClickListener((View.OnClickListener) null);
            getButtonAudioCallView().setVisibility(8);
        }
        if (y7e.L(this.J0)) {
            getButtonVideoCallView().setOnClickListener((View.OnClickListener) null);
            getButtonVideoCallView().setVisibility(8);
        }
        U();
    }

    public final void Y(long j, CharSequence charSequence, String str) {
        gd0 gd0 = new gd0(charSequence, j);
        OneMeAvatarView oneMeAvatarView = this.E0;
        oneMeAvatarView.f(gd0, true);
        oneMeAvatarView.setAvatarUrl(str);
    }

    public final void Z(CharSequence charSequence, Function0 function0) {
        OneMeButton buttonView = getButtonView();
        buttonView.setText(charSequence);
        ct.G(buttonView, 300, new e7(6, function0));
        buttonView.setVisibility(0);
        buttonView.setMode(zpa.o);
        buttonView.setAppearance(xpa.a);
        buttonView.setSize(aqa.b);
        U();
    }

    public final void a0(Integer num, zpa zpa, xpa xpa, Function0 function0) {
        if (num == null) {
            Lazy lazy = this.I0;
            if (lazy.isInitialized()) {
                ((OneMeButton) lazy.getValue()).setVisibility(8);
                return;
            }
            return;
        }
        OneMeButton buttonView = getButtonView();
        KProperty[] kPropertyArr = OneMeButton.z0;
        buttonView.d(num, true);
        ct.G(buttonView, 300, new e7(5, function0));
        buttonView.setVisibility(0);
        buttonView.setMode(zpa);
        buttonView.setAppearance(xpa);
        buttonView.setSize(aqa.b);
        U();
    }

    public final View getAnchorButton() {
        return getButtonView();
    }

    public final k2b getCustomTheme() {
        return (k2b) this.Q0.getValue(this, c1[2]);
    }

    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        onThemeChanged(fu4.k.e(getContext()).f());
    }

    public final void onMeasure(int i, int i2) {
        if (wgf.d(this.F0)) {
            setVerified(true);
        }
        super.onMeasure(i, i2);
    }

    public final void onThemeChanged(k2b k2b) {
        k2b customTheme = getCustomTheme();
        if (customTheme == null) {
            customTheme = k2b;
        }
        this.E0.onThemeChanged(customTheme);
        this.F0.setTextColor(customTheme.getText().e);
        Lazy lazy = this.G0;
        if (lazy.isInitialized()) {
            ((TextView) lazy.getValue()).setTextColor(customTheme.getText().f);
        }
        Lazy lazy2 = this.H0;
        if (lazy2.isInitialized()) {
            ((TextView) lazy2.getValue()).setTextColor(customTheme.getText().f);
        }
        getRippleDrawable().setColor(ColorStateList.valueOf(customTheme.b().a.f));
        Lazy lazy3 = this.J0;
        if (lazy3.isInitialized()) {
            ((AppCompatImageView) lazy3.getValue()).setImageTintList(ColorStateList.valueOf(k2b.getIcon().f));
        }
        Lazy lazy4 = this.K0;
        if (lazy4.isInitialized()) {
            ((AppCompatImageView) lazy4.getValue()).setImageTintList(ColorStateList.valueOf(k2b.getIcon().f));
        }
        Lazy lazy5 = this.M0;
        if (lazy5.isInitialized()) {
            AppCompatCheckBox appCompatCheckBox = (AppCompatCheckBox) lazy5.getValue();
            ev0.e(getCheckboxDrawable(), k2b);
        }
    }

    public final void setAlias(CharSequence charSequence) {
        CharSequence text;
        if ((charSequence != null && !StringsKt.isBlank(charSequence)) || getAliasView().getVisibility() == 0) {
            boolean L = y7e.L(this.G0);
            v9a v9a = v9a.x;
            if (!L || (text = getMessageView().getText()) == null || StringsKt.isBlank(text)) {
                this.S0.b = v9a;
            } else {
                this.V0.b = v9a;
            }
            getAliasView().setText(charSequence);
            TextView aliasView = getAliasView();
            int i = 0;
            if (!(!(charSequence == null || StringsKt.isBlank(charSequence)))) {
                i = 8;
            }
            aliasView.setVisibility(i);
            U();
        }
    }

    public final void setCallButtons(Function1<? super Boolean, Unit> function1) {
        ct.G(getButtonAudioCallView(), 300, new ll3(0, function1));
        ct.G(getButtonVideoCallView(), 300, new ll3(1, function1));
        getButtonAudioCallView().setVisibility(0);
        getButtonAudioCallView().setVisibility(0);
        U();
    }

    public final void setContactSelected(boolean z) {
        this.P0.setValue(this, c1[1], Boolean.valueOf(z));
    }

    public final void setCustomTheme(k2b k2b) {
        this.Q0.setValue(this, c1[2], k2b);
    }

    public void setEnabled(boolean z) {
        super.setEnabled(z);
        setAlpha(z ? 1.0f : 0.4f);
    }

    public final void setMessage(CharSequence charSequence) {
        if ((charSequence != null && !StringsKt.isBlank(charSequence)) || y7e.L(this.G0)) {
            getMessageView().setText(charSequence);
            TextView messageView = getMessageView();
            int i = 0;
            if (!(!(charSequence == null || StringsKt.isBlank(charSequence)))) {
                i = 8;
            }
            messageView.setVisibility(i);
            U();
        }
    }

    public final void setName(CharSequence charSequence) {
        this.F0.setText(charSequence);
        U();
    }

    public void setOnClickListener(View.OnClickListener onClickListener) {
        super.setOnClickListener(onClickListener);
        setBackground(onClickListener != null ? getRippleDrawable() : null);
    }

    public final void setOnline(boolean z) {
        this.E0.setOnlineBadgeVisibility(z);
    }

    public final void setSelectionEnabled(boolean z) {
        this.O0.setValue(this, c1[0], Boolean.valueOf(z));
    }

    public final void setVerified(boolean z) {
        AppCompatTextView appCompatTextView = this.F0;
        m2g S = m5a.S(wgf.f(appCompatTextView));
        l2g l2g = null;
        if (z) {
            l2g b = wgf.b(appCompatTextView);
            if ((b != null ? b.a : null) == S) {
                return;
            }
        }
        if (z) {
            l2g b2 = wgf.b(appCompatTextView);
            if ((b2 != null ? b2.a : null) != S) {
                l2g = new l2g(getContext(), S, new of3(1));
            }
        }
        wgf.e(appCompatTextView, l2g);
    }

    public final void setName(int i) {
        this.F0.setText(i);
        U();
    }
}
