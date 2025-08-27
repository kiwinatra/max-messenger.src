package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.util.AttributeSet;
import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;
import kotlin.properties.Delegates;
import kotlin.reflect.KProperty;
import one.me.sdk.uikit.common.button.OneMeButton;
import ru.ok.android.externcalls.analytics.internal.upload.MultiFileUploader;

/* renamed from: c1b  reason: default package */
public final class c1b extends ConstraintLayout implements phf {
    public static final /* synthetic */ KProperty[] L0;
    public final b1b E0 = new b1b(this, 0);
    public final b1b F0 = new b1b(this, 1);
    public final Lazy G0;
    public final Lazy H0;
    public final Lazy I0;
    public final AppCompatTextView J0;
    public final Lazy K0;

    static {
        Class<c1b> cls = c1b.class;
        L0 = new KProperty[]{rae.s(cls, "leftElement", "getLeftElement()Lone/me/sdk/snackbar/OneMeSnackbarModel$Left;", 0), rae.s(cls, "rightElement", "getRightElement()Lone/me/sdk/snackbar/OneMeSnackbarModel$Right;", 0)};
    }

    public c1b(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Delegates delegates = Delegates.INSTANCE;
        p35 p35 = new p35(context, 29);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.G0 = LazyKt.lazy(lazyThreadSafetyMode, p35);
        this.H0 = LazyKt.lazy(lazyThreadSafetyMode, new a1b(context, 0));
        this.I0 = LazyKt.lazy(lazyThreadSafetyMode, new a1b(context, 1));
        AppCompatTextView appCompatTextView = new AppCompatTextView(context, (AttributeSet) null);
        appCompatTextView.setId(cza.e);
        appCompatTextView.setLayoutParams(new fj3(MathKt.roundToInt(((float) 0) * vo4.c().getDisplayMetrics().density), -2));
        puf.k.b(appCompatTextView, uy4.b);
        js9 js9 = fu4.k;
        js9.e(appCompatTextView.getContext()).f().getText().getClass();
        appCompatTextView.setTextColor(-1);
        appCompatTextView.setMaxLines(2);
        this.J0 = appCompatTextView;
        this.K0 = LazyKt.lazy(lazyThreadSafetyMode, new a1b(context, 2));
        setId(cza.b);
        setLayoutParams(new fj3(-1, -2));
        setMinimumHeight(MathKt.roundToInt(((float) 56) * vo4.c().getDisplayMetrics().density));
        int roundToInt = MathKt.roundToInt(((float) 12) * vo4.c().getDisplayMetrics().density);
        setPadding(roundToInt, roundToInt, roundToInt, roundToInt);
        setOutlineProvider(new n04(vo4.c().getDisplayMetrics().density * 16.0f));
        setBackgroundColor(js9.e(getContext()).f().c().c);
    }

    /* access modifiers changed from: private */
    public final void setLeft(s0b s0b) {
        if (s0b instanceof o0b) {
            setupLeftContrastIcon(((o0b) s0b).a);
        } else if (s0b instanceof q0b) {
            setupLeftNegativeIcon(((q0b) s0b).a);
        } else if (s0b instanceof r0b) {
            q14 q14 = (q14) this.H0.getValue();
            q14.setId(cza.c);
            float f = (float) 28;
            q14.setLayoutParams(new fj3(MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f), MathKt.roundToInt(f * vo4.c().getDisplayMetrics().density)));
            q14.setMaxValue(MultiFileUploader.UPLOAD_NEXT_INTERVAL);
            f6e.c(this, q14, (Integer) null);
        } else if (s0b instanceof p0b) {
            Lazy lazy = this.G0;
            if (lazy.isInitialized()) {
                ((AppCompatImageView) lazy.getValue()).setVisibility(8);
            }
        } else {
            throw new NoWhenBranchMatchedException();
        }
    }

    /* access modifiers changed from: private */
    public final void setRight(y0b y0b) {
        boolean areEqual = Intrinsics.areEqual((Object) y0b, (Object) t0b.a);
        Lazy lazy = this.I0;
        if (areEqual) {
            OneMeButton oneMeButton = (OneMeButton) lazy.getValue();
            oneMeButton.setId(cza.d);
            oneMeButton.setText(dza.a);
            oneMeButton.setMode(zpa.o);
            f6e.c(this, oneMeButton, (Integer) null);
        } else if (Intrinsics.areEqual((Object) y0b, (Object) u0b.a)) {
            OneMeButton oneMeButton2 = (OneMeButton) lazy.getValue();
            oneMeButton2.setId(cza.d);
            oneMeButton2.d(Integer.valueOf(cad.J0), true);
            oneMeButton2.setMode(zpa.c);
            f6e.c(this, oneMeButton2, (Integer) null);
        } else if (Intrinsics.areEqual((Object) y0b, (Object) v0b.a)) {
            if (lazy.isInitialized()) {
                ((OneMeButton) lazy.getValue()).setVisibility(8);
            }
        } else if (y0b instanceof x0b) {
            setupRightTextButton(((x0b) y0b).a);
        } else {
            throw new NoWhenBranchMatchedException();
        }
    }

    private final void setupLeftContrastIcon(int i) {
        AppCompatImageView appCompatImageView = (AppCompatImageView) this.G0.getValue();
        appCompatImageView.setId(cza.c);
        appCompatImageView.setImageDrawable(ew3.b(appCompatImageView.getContext(), i));
        fu4.k.e(appCompatImageView.getContext()).f().getIcon().getClass();
        appCompatImageView.setImageTintList(ColorStateList.valueOf(-1));
        f6e.c(this, appCompatImageView, (Integer) null);
    }

    private final void setupLeftNegativeIcon(int i) {
        AppCompatImageView appCompatImageView = (AppCompatImageView) this.G0.getValue();
        appCompatImageView.setId(cza.c);
        appCompatImageView.setImageDrawable(ew3.b(appCompatImageView.getContext(), i));
        appCompatImageView.setImageTintList(ColorStateList.valueOf(fu4.k.e(appCompatImageView.getContext()).f().getIcon().c));
        f6e.c(this, appCompatImageView, (Integer) null);
    }

    private final void setupRightTextButton(ngf ngf) {
        OneMeButton oneMeButton = (OneMeButton) this.I0.getValue();
        oneMeButton.setId(cza.d);
        oneMeButton.setText(ngf.a(oneMeButton.getContext()));
        oneMeButton.setMode(zpa.o);
        f6e.c(this, oneMeButton, (Integer) null);
    }

    public final void N() {
        boolean z = y7e.L(this.G0) || y7e.L(this.H0);
        Lazy lazy = this.I0;
        boolean L = y7e.L(lazy);
        Lazy lazy2 = this.K0;
        boolean L2 = y7e.L(lazy2);
        pj3 h = ct.h(this);
        AppCompatTextView appCompatTextView = this.J0;
        ni0 ni0 = new ni0((Object) h, appCompatTextView.getId(), 4);
        if (z) {
            tr1.u((float) 12, vo4.c().getDisplayMetrics().density, ni0.O(cza.c));
        } else {
            ni0.P(0);
        }
        ni0.R(0);
        if (L) {
            tr1.u((float) 12, vo4.c().getDisplayMetrics().density, ni0.v(((OneMeButton) lazy.getValue()).getId()));
        } else {
            ni0.t(0);
        }
        if (L2) {
            ni0.d(((AppCompatTextView) lazy2.getValue()).getId());
        } else {
            ni0.b(0);
        }
        if (z) {
            ni0 ni02 = new ni0((Object) h, cza.c, 4);
            ni02.P(0);
            ni02.R(0);
            ni02.b(0);
        }
        if (L2) {
            ni0 ni03 = new ni0((Object) h, ((AppCompatTextView) lazy2.getValue()).getId(), 4);
            if (z) {
                tr1.u((float) 12, vo4.c().getDisplayMetrics().density, ni03.O(cza.c));
            } else {
                ni03.P(0);
            }
            if (L) {
                tr1.u((float) 12, vo4.c().getDisplayMetrics().density, ni03.v(((OneMeButton) lazy.getValue()).getId()));
            } else {
                ni03.t(0);
            }
            tr1.u((float) 2, vo4.c().getDisplayMetrics().density, ni03.Q(appCompatTextView.getId()));
        }
        if (L) {
            ni0 ni04 = new ni0((Object) h, ((OneMeButton) lazy.getValue()).getId(), 4);
            ni04.R(0);
            ni04.t(0);
            ni04.b(0);
        }
        h.a(this);
    }

    public final s0b getLeftElement() {
        return (s0b) this.E0.getValue(this, L0[0]);
    }

    public final y0b getRightElement() {
        return (y0b) this.F0.getValue(this, L0[1]);
    }

    public final void onThemeChanged(k2b k2b) {
        setBackgroundColor(k2b.c().c);
        AppCompatTextView appCompatTextView = this.J0;
        k2b.getText().getClass();
        Integer num = -1;
        appCompatTextView.setTextColor(-1);
        Lazy lazy = this.G0;
        if (lazy.isInitialized()) {
            AppCompatImageView appCompatImageView = (AppCompatImageView) lazy.getValue();
            s0b leftElement = getLeftElement();
            if (leftElement instanceof o0b) {
                k2b.getIcon().getClass();
            } else if (leftElement instanceof q0b) {
                num = Integer.valueOf(k2b.getIcon().c);
            } else if (leftElement instanceof r0b) {
                k2b.getIcon().getClass();
            } else if (Intrinsics.areEqual((Object) leftElement, (Object) p0b.a)) {
                num = null;
            } else {
                throw new NoWhenBranchMatchedException();
            }
            if (num != null) {
                appCompatImageView.setImageTintList(ColorStateList.valueOf(num.intValue()));
            }
        }
    }

    public final void setCaption(CharSequence charSequence) {
        AppCompatTextView appCompatTextView = (AppCompatTextView) this.K0.getValue();
        appCompatTextView.setId(cza.a);
        appCompatTextView.setText(charSequence);
        int i = 0;
        if (charSequence == null) {
            i = 8;
        }
        appCompatTextView.setVisibility(i);
        f6e.c(this, appCompatTextView, (Integer) null);
        N();
    }

    public final void setLeftElement(s0b s0b) {
        this.E0.setValue(this, L0[0], s0b);
    }

    public final void setRightBtnAction$snackbar_release(View.OnClickListener onClickListener) {
        Lazy lazy = this.I0;
        if (lazy.isInitialized()) {
            OneMeButton oneMeButton = (OneMeButton) lazy.getValue();
            if (onClickListener == null) {
                oneMeButton.setOnClickListener((View.OnClickListener) null);
            } else {
                ct.G(oneMeButton, 300, onClickListener);
            }
        }
    }

    public final void setRightElement(y0b y0b) {
        this.F0.setValue(this, L0[1], y0b);
    }

    public final void setTitle(CharSequence charSequence) {
        AppCompatTextView appCompatTextView = this.J0;
        appCompatTextView.setText(charSequence);
        f6e.c(this, appCompatTextView, (Integer) null);
        N();
    }

    public final void setTitle(int i) {
        setTitle((CharSequence) q8.p(i, getContext()));
    }

    public final void setCaption(int i) {
        setCaption((CharSequence) q8.p(i, getContext()));
    }
}
