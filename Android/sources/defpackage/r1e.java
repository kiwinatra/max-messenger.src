package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.Shape;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;
import kotlin.properties.Delegates;
import kotlin.reflect.KProperty;

/* renamed from: r1e  reason: default package */
public final class r1e extends ConstraintLayout implements phf, i5d {
    public static final /* synthetic */ KProperty[] W0;
    public final Lazy E0;
    public final AppCompatTextView F0;
    public final Lazy G0;
    public final AppCompatImageView H0;
    public final LinearLayout I0;
    public final LinearLayout J0;
    public final Lazy K0;
    public final Lazy L0;
    public final Lazy M0;
    public final Lazy N0;
    public final Lazy O0;
    public n1e P0;
    public final ShapeDrawable Q0;
    public final RippleDrawable R0;
    public h1e S0 = h1e.b;
    public final q1e T0;
    public final q1e U0;
    public boolean V0;

    static {
        Class<r1e> cls = r1e.class;
        W0 = new KProperty[]{rae.s(cls, "modelItem", "getModelItem()Lone/me/sdk/sections/SettingsItem;", 0), rae.s(cls, "themeDepended", "getThemeDepended()Lone/me/sdk/sections/ui/recyclerview/settingsitem/SettingsItemContent$Companion$ThemeDependedType;", 0)};
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public r1e(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Context context2 = context;
        l1e l1e = new l1e(context2, this, 0);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.E0 = LazyKt.lazy(lazyThreadSafetyMode, l1e);
        AppCompatTextView appCompatTextView = new AppCompatTextView(context2, (AttributeSet) null);
        appCompatTextView.setId(bza.f);
        appCompatTextView.setLayoutParams(new fj3(-2, -2));
        puf.i.b(appCompatTextView, uy4.b);
        appCompatTextView.setPadding(0, 0, 0, 0);
        appCompatTextView.setMaxLines(2);
        appCompatTextView.setEllipsize(TextUtils.TruncateAt.END);
        this.F0 = appCompatTextView;
        this.G0 = LazyKt.lazy(lazyThreadSafetyMode, new l1e(context2, this, 1));
        AppCompatImageView appCompatImageView = new AppCompatImageView(context2, (AttributeSet) null);
        appCompatImageView.setId(bza.e);
        float f = (float) 36;
        appCompatImageView.setLayoutParams(new fj3(MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f), MathKt.roundToInt(f * vo4.c().getDisplayMetrics().density)));
        int roundToInt = MathKt.roundToInt(((float) 6) * vo4.c().getDisplayMetrics().density);
        appCompatImageView.setPadding(roundToInt, roundToInt, roundToInt, roundToInt);
        this.H0 = appCompatImageView;
        LinearLayout linearLayout = new LinearLayout(context2);
        linearLayout.setId(bza.h);
        linearLayout.setLayoutParams(new fj3(MathKt.roundToInt(((float) 0) * vo4.c().getDisplayMetrics().density), -1));
        linearLayout.setOrientation(1);
        linearLayout.setGravity(8388627);
        this.I0 = linearLayout;
        LinearLayout linearLayout2 = new LinearLayout(context2);
        linearLayout2.setId(bza.c);
        linearLayout2.setLayoutParams(new fj3(-2, -2));
        linearLayout2.setOrientation(0);
        linearLayout2.setGravity(16);
        linearLayout2.setOnTouchListener(new pg6(new GestureDetector(context2, new q00(21, this)), 7));
        this.J0 = linearLayout2;
        this.K0 = LazyKt.lazy(lazyThreadSafetyMode, new l1e(context2, this, 2));
        this.L0 = LazyKt.lazy(lazyThreadSafetyMode, new l1e(context2, this, 3));
        this.M0 = LazyKt.lazy(lazyThreadSafetyMode, new l1e(context2, this, 4));
        this.N0 = LazyKt.lazy(lazyThreadSafetyMode, new l1e(context2, this, 5));
        this.O0 = LazyKt.lazy(lazyThreadSafetyMode, new l1e(context2, this, 6));
        ShapeDrawable shapeDrawable = new ShapeDrawable();
        this.Q0 = shapeDrawable;
        RippleDrawable rippleDrawable = new RippleDrawable(ColorStateList.valueOf(fu4.k.e(getContext()).f().b().a.f), (Drawable) null, shapeDrawable);
        this.R0 = rippleDrawable;
        Delegates delegates = Delegates.INSTANCE;
        i1e.b0.getClass();
        this.T0 = new q1e(x0e.b, this);
        m1e m1e = m1e.a;
        this.U0 = new q1e(this);
        setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        setMinHeight(MathKt.roundToInt(((float) 48) * vo4.c().getDisplayMetrics().density));
        setBackground(rippleDrawable);
        addView(appCompatImageView);
        addView(linearLayout);
        addView(linearLayout2);
        linearLayout.addView(appCompatTextView);
        pj3 h = ct.h(this);
        int id = appCompatImageView.getId();
        h.e(id, 6, 0, 6);
        float f2 = (float) 12;
        tr1.u(f2, vo4.c().getDisplayMetrics().density, new ila(h, 6, id, 4));
        h.e(id, 3, 0, 3);
        h.e(id, 4, 0, 4);
        int id2 = linearLayout.getId();
        h.e(id2, 6, appCompatImageView.getId(), 7);
        tr1.u(f2, vo4.c().getDisplayMetrics().density, new ila(h, 6, id2, 4));
        h.e(id2, 3, 0, 3);
        float f3 = (float) 10;
        tr1.u(f3, vo4.c().getDisplayMetrics().density, new ila(h, 3, id2, 4));
        h.e(id2, 4, 0, 4);
        new ila(h, 4, id2, 4).e(MathKt.roundToInt(f3 * vo4.c().getDisplayMetrics().density));
        h.e(id2, 7, linearLayout2.getId(), 6);
        new ila(h, 7, id2, 4).e(MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f2));
        int id3 = linearLayout2.getId();
        h.e(id3, 7, 0, 7);
        tr1.u(f2, vo4.c().getDisplayMetrics().density, new ila(h, 7, id3, 4));
        h.e(id3, 3, 0, 3);
        h.e(id3, 4, 0, 4);
        h.a(this);
    }

    public static AppCompatTextView L(Context context, r1e r1e) {
        int i;
        AppCompatTextView appCompatTextView = new AppCompatTextView(context, (AttributeSet) null);
        appCompatTextView.setId(bza.a);
        appCompatTextView.setLayoutParams(new fj3(-2, -2));
        puf.m.b(appCompatTextView, uy4.b);
        appCompatTextView.setMaxLines(2);
        int ordinal = r1e.S0.ordinal();
        if (ordinal != 0) {
            i = ordinal != 3 ? r1e.getCurrentTheme().getText().f : r1e.getCurrentTheme().b().c.h;
        } else {
            r1e.getCurrentTheme().getText().getClass();
            i = -16745729;
        }
        appCompatTextView.setTextColor(i);
        appCompatTextView.setPadding(0, MathKt.roundToInt(((float) 2) * vo4.c().getDisplayMetrics().density), 0, 0);
        r1e.I0.addView(appCompatTextView);
        return appCompatTextView;
    }

    public static AppCompatTextView M(Context context, r1e r1e) {
        AppCompatTextView appCompatTextView = new AppCompatTextView(context, (AttributeSet) null);
        appCompatTextView.setId(bza.g);
        appCompatTextView.setLayoutParams(new fj3(-2, -2));
        puf.o.b(appCompatTextView, uy4.b);
        appCompatTextView.setTextColor(r1e.getCurrentTheme().getText().f);
        r1e.I0.addView(appCompatTextView, 0);
        return appCompatTextView;
    }

    public static AppCompatImageView N(Context context, r1e r1e) {
        AppCompatImageView appCompatImageView = new AppCompatImageView(context, (AttributeSet) null);
        appCompatImageView.setId(bza.b);
        appCompatImageView.setImageDrawable(ew3.b(appCompatImageView.getContext(), cad.J0));
        appCompatImageView.setImageTintList(ColorStateList.valueOf(r1e.getCurrentTheme().getIcon().i));
        r1e.J0.addView(appCompatImageView);
        return appCompatImageView;
    }

    public static AppCompatTextView O(Context context, r1e r1e) {
        AppCompatTextView appCompatTextView = new AppCompatTextView(context, (AttributeSet) null);
        appCompatTextView.setId(bza.d);
        puf.l.b(appCompatTextView, uy4.b);
        appCompatTextView.setTextColor(o1e.$EnumSwitchMapping$0[r1e.S0.ordinal()] == 1 ? r1e.getCurrentTheme().b().c.h : r1e.getCurrentTheme().getText().f);
        LinearLayout linearLayout = r1e.J0;
        fj3 fj3 = new fj3(-2, -2);
        fj3.setMarginEnd(MathKt.roundToInt(((float) 6) * vo4.c().getDisplayMetrics().density));
        Unit unit = Unit.INSTANCE;
        linearLayout.addView(appCompatTextView, fj3);
        return appCompatTextView;
    }

    public static void Q(LinearLayout linearLayout, Lazy lazy) {
        if (!lazy.isInitialized()) {
            return;
        }
        if (((View) lazy.getValue()).getVisibility() == 0) {
            y7e.c(linearLayout, (View) lazy.getValue(), -1);
        } else {
            linearLayout.removeView((View) lazy.getValue());
        }
    }

    /* access modifiers changed from: private */
    public final k2b getCurrentTheme() {
        int ordinal = getThemeDepended().ordinal();
        if (ordinal == 0) {
            return fu4.k.e(getContext()).f();
        }
        if (ordinal == 1) {
            return l2b.a;
        }
        throw new NoWhenBranchMatchedException();
    }

    private final void setupCounter(z0e z0e) {
        boolean areEqual = Intrinsics.areEqual((Object) z0e, (Object) y0e.a);
        Lazy lazy = this.O0;
        if (areEqual) {
            wsa wsa = (wsa) lazy.getValue();
            wsa.setVisibility(0);
            wsa.setAppearance(qsa.o);
            wsa.h();
        } else if (z0e != null) {
            throw new NoWhenBranchMatchedException();
        } else if (lazy.isInitialized()) {
            ((wsa) lazy.getValue()).setVisibility(8);
        }
    }

    private final void setupDescription(CharSequence charSequence) {
        AppCompatTextView appCompatTextView = (AppCompatTextView) this.G0.getValue();
        int i = 0;
        if (!(charSequence != null)) {
            i = 8;
        }
        appCompatTextView.setVisibility(i);
        appCompatTextView.setText(charSequence);
        appCompatTextView.setPadding(appCompatTextView.getPaddingLeft(), MathKt.roundToInt(((float) 2) * vo4.c().getDisplayMetrics().density), appCompatTextView.getPaddingRight(), appCompatTextView.getPaddingBottom());
        y7e.c(this.I0, appCompatTextView, (Integer) null);
    }

    private final void setupEndText(CharSequence charSequence) {
        Lazy lazy = this.M0;
        if (lazy.isInitialized()) {
            ((z1b) lazy.getValue()).setVisibility(8);
        }
        Lazy lazy2 = this.L0;
        if (lazy2.isInitialized()) {
            ((AppCompatImageView) lazy2.getValue()).setVisibility(8);
        }
        Lazy lazy3 = this.N0;
        if (lazy3.isInitialized()) {
            ((bya) lazy3.getValue()).setVisibility(8);
        }
        AppCompatTextView appCompatTextView = (AppCompatTextView) this.K0.getValue();
        appCompatTextView.setId(bza.m);
        appCompatTextView.setText(charSequence);
        appCompatTextView.setVisibility(0);
        appCompatTextView.setCompoundDrawablesRelative((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
    }

    private final void setupUpperText(CharSequence charSequence) {
        AppCompatTextView appCompatTextView = (AppCompatTextView) this.E0.getValue();
        appCompatTextView.setVisibility(charSequence != null ? 0 : 8);
        appCompatTextView.setText(charSequence);
        appCompatTextView.setPadding(appCompatTextView.getPaddingLeft(), appCompatTextView.getPaddingTop(), appCompatTextView.getPaddingRight(), MathKt.roundToInt(((float) 2) * vo4.c().getDisplayMetrics().density));
        y7e.c(this.I0, appCompatTextView, 0);
    }

    public final i1e getModelItem() {
        return (i1e) this.T0.getValue(this, W0[0]);
    }

    public final m1e getThemeDepended() {
        return (m1e) this.U0.getValue(this, W0[1]);
    }

    public final void onThemeChanged(k2b k2b) {
        k2b currentTheme = getCurrentTheme();
        this.R0.setColor(ColorStateList.valueOf(currentTheme.b().a.f));
        Lazy lazy = this.M0;
        if (lazy.isInitialized()) {
            ((z1b) lazy.getValue()).onThemeChanged(currentTheme);
        }
        Lazy lazy2 = this.N0;
        if (lazy2.isInitialized()) {
            ((bya) lazy2.getValue()).onThemeChanged(currentTheme);
        }
        Lazy lazy3 = this.O0;
        if (lazy3.isInitialized()) {
            ((wsa) lazy3.getValue()).f(currentTheme);
        }
        Lazy lazy4 = this.K0;
        if (lazy4.isInitialized()) {
            AppCompatTextView appCompatTextView = (AppCompatTextView) lazy4.getValue();
            appCompatTextView.setTextColor(currentTheme.getText().f);
            tgf.f(appCompatTextView, ColorStateList.valueOf(currentTheme.getIcon().i));
        }
        Lazy lazy5 = this.L0;
        if (lazy5.isInitialized()) {
            ((AppCompatImageView) lazy5.getValue()).setImageTintList(ColorStateList.valueOf(currentTheme.getIcon().i));
        }
        Lazy lazy6 = this.E0;
        if (lazy6.isInitialized()) {
            ((AppCompatTextView) lazy6.getValue()).setTextColor(currentTheme.getText().f);
        }
        int ordinal = getModelItem().getType().ordinal();
        AppCompatTextView appCompatTextView2 = this.F0;
        AppCompatImageView appCompatImageView = this.H0;
        Lazy lazy7 = this.G0;
        if (ordinal == 0) {
            currentTheme.getText().getClass();
            appCompatTextView2.setTextColor(-16745729);
            if (lazy7.isInitialized()) {
                currentTheme.getText().getClass();
                ((AppCompatTextView) lazy7.getValue()).setTextColor(-16745729);
            }
            if (this.V0) {
                appCompatImageView.setImageTintList((ColorStateList) null);
                return;
            }
            currentTheme.getIcon().getClass();
            appCompatImageView.setImageTintList(ColorStateList.valueOf(-16745729));
        } else if (ordinal == 1) {
            appCompatTextView2.setTextColor(currentTheme.getText().e);
            if (lazy7.isInitialized()) {
                ((AppCompatTextView) lazy7.getValue()).setTextColor(currentTheme.getText().f);
            }
            if (this.V0) {
                appCompatImageView.setImageTintList((ColorStateList) null);
            } else {
                appCompatImageView.setImageTintList(ColorStateList.valueOf(currentTheme.getIcon().f));
            }
        } else if (ordinal == 2) {
            appCompatTextView2.setTextColor(currentTheme.getText().b);
            if (lazy7.isInitialized()) {
                ((AppCompatTextView) lazy7.getValue()).setTextColor(currentTheme.getText().f);
            }
            if (this.V0) {
                appCompatImageView.setImageTintList((ColorStateList) null);
            } else {
                appCompatImageView.setImageTintList(ColorStateList.valueOf(currentTheme.getIcon().c));
            }
        } else if (ordinal == 3) {
            appCompatTextView2.setTextColor(currentTheme.b().c.h);
            if (lazy7.isInitialized()) {
                ((AppCompatTextView) lazy7.getValue()).setTextColor(currentTheme.b().c.h);
            }
            if (this.V0) {
                appCompatImageView.setImageTintList((ColorStateList) null);
            } else {
                appCompatImageView.setImageTintList(ColorStateList.valueOf(currentTheme.b().b.f));
            }
        } else if (ordinal == 4) {
            appCompatTextView2.setTextColor(currentTheme.getText().e);
            if (lazy7.isInitialized()) {
                ((AppCompatTextView) lazy7.getValue()).setTextColor(currentTheme.getText().f);
            }
            appCompatImageView.setImageTintList((ColorStateList) null);
        } else {
            throw new NoWhenBranchMatchedException();
        }
    }

    public final void setCounter(z0e z0e) {
        setupCounter(z0e);
        requestLayout();
        invalidate();
    }

    public final void setDescription(ngf ngf) {
        setupDescription(ngf != null ? ngf.a(getContext()) : null);
        requestLayout();
        invalidate();
    }

    public final void setDisableStartIconText(boolean z) {
        this.V0 = z;
        AppCompatImageView appCompatImageView = this.H0;
        if (z) {
            appCompatImageView.setImageTintList((ColorStateList) null);
        } else {
            getCurrentTheme().getIcon().getClass();
            appCompatImageView.setImageTintList(ColorStateList.valueOf(-16745729));
        }
        requestLayout();
        invalidate();
    }

    public final void setEndView(f1e f1e) {
        Drawable drawable;
        boolean z = f1e instanceof d1e;
        Lazy lazy = this.L0;
        Lazy lazy2 = this.M0;
        Lazy lazy3 = this.N0;
        Lazy lazy4 = this.K0;
        if (z) {
            d1e d1e = (d1e) f1e;
            boolean z2 = d1e.a;
            boolean z3 = d1e.b;
            if (lazy4.isInitialized()) {
                ((AppCompatTextView) lazy4.getValue()).setVisibility(8);
            }
            if (lazy.isInitialized()) {
                ((AppCompatImageView) lazy.getValue()).setVisibility(8);
            }
            if (lazy3.isInitialized()) {
                ((bya) lazy3.getValue()).setVisibility(8);
            }
            z1b z1b = (z1b) lazy2.getValue();
            z1b.setId(bza.l);
            z1b.setVisibility(0);
            if (z1b.isChecked() != z2) {
                z1b.setChecked(z2);
            }
            z1b.setEnabled(z3);
            z1b.setClickable(z3);
        } else if (f1e instanceof a1e) {
            if (lazy2.isInitialized()) {
                ((z1b) lazy2.getValue()).setVisibility(8);
            }
            if (lazy4.isInitialized()) {
                ((AppCompatTextView) lazy4.getValue()).setVisibility(8);
            }
            if (lazy3.isInitialized()) {
                ((bya) lazy3.getValue()).setVisibility(8);
            }
            AppCompatImageView appCompatImageView = (AppCompatImageView) lazy.getValue();
            appCompatImageView.setId(bza.j);
            appCompatImageView.setVisibility(0);
        } else {
            CharSequence charSequence = "";
            if (f1e instanceof b1e) {
                b1e b1e = (b1e) f1e;
                CharSequence a = b1e.a.a(getContext());
                if (a != null) {
                    charSequence = a;
                }
                if (lazy2.isInitialized()) {
                    ((z1b) lazy2.getValue()).setVisibility(8);
                }
                if (lazy3.isInitialized()) {
                    ((bya) lazy3.getValue()).setVisibility(8);
                }
                AppCompatTextView appCompatTextView = (AppCompatTextView) lazy4.getValue();
                appCompatTextView.setId(bza.m);
                appCompatTextView.setText(charSequence);
                appCompatTextView.setVisibility(0);
                appCompatTextView.setCompoundDrawablePadding(6);
                tgf.f(appCompatTextView, ColorStateList.valueOf(getCurrentTheme().getIcon().i));
                Integer num = b1e.b;
                if (num == null || (drawable = ew3.b(appCompatTextView.getContext(), num.intValue())) == null) {
                    drawable = null;
                } else {
                    float f = (float) 16;
                    drawable.setBounds(0, 0, MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f), MathKt.roundToInt(f * vo4.c().getDisplayMetrics().density));
                    Unit unit = Unit.INSTANCE;
                }
                appCompatTextView.setCompoundDrawablesRelative((Drawable) null, (Drawable) null, drawable, (Drawable) null);
                AppCompatImageView appCompatImageView2 = (AppCompatImageView) lazy.getValue();
                appCompatImageView2.setId(bza.j);
                appCompatImageView2.setVisibility(0);
            } else if (f1e instanceof e1e) {
                CharSequence a2 = ((e1e) f1e).a.a(getContext());
                if (a2 != null) {
                    charSequence = a2;
                }
                setupEndText(charSequence);
            } else if (f1e instanceof c1e) {
                c1e c1e = (c1e) f1e;
                boolean z4 = c1e.a;
                boolean z5 = c1e.b;
                if (lazy4.isInitialized()) {
                    ((AppCompatTextView) lazy4.getValue()).setVisibility(8);
                }
                if (lazy.isInitialized()) {
                    ((AppCompatImageView) lazy.getValue()).setVisibility(8);
                }
                if (lazy2.isInitialized()) {
                    ((z1b) lazy2.getValue()).setVisibility(8);
                }
                bya bya = (bya) lazy3.getValue();
                bya.setId(bza.k);
                bya.setVisibility(0);
                bya.setChecked(z4);
                bya.setEnabled(z5);
                bya.setOnCheckedChangeListener(new zy2(5, this));
            } else {
                if (lazy2.isInitialized()) {
                    ((z1b) lazy2.getValue()).setVisibility(8);
                }
                if (lazy4.isInitialized()) {
                    ((AppCompatTextView) lazy4.getValue()).setVisibility(8);
                }
                if (lazy.isInitialized()) {
                    ((AppCompatImageView) lazy.getValue()).setVisibility(8);
                }
                if (lazy3.isInitialized()) {
                    ((bya) lazy3.getValue()).setVisibility(8);
                }
            }
        }
        Lazy lazy5 = this.O0;
        boolean isInitialized = lazy5.isInitialized();
        LinearLayout linearLayout = this.J0;
        if (isInitialized) {
            linearLayout.removeView((wsa) lazy5.getValue());
        }
        if (lazy4.isInitialized()) {
            linearLayout.removeView((AppCompatTextView) lazy4.getValue());
        }
        if (lazy.isInitialized()) {
            linearLayout.removeView((AppCompatImageView) lazy.getValue());
        }
        Q(linearLayout, lazy5);
        Q(linearLayout, lazy4);
        Q(linearLayout, lazy);
        Q(linearLayout, lazy2);
        Q(linearLayout, lazy3);
        linearLayout.requestLayout();
        linearLayout.invalidate();
    }

    public final void setItemId(long j) {
    }

    public final void setModelItem(i1e i1e) {
        this.T0.setValue(this, W0[0], i1e);
    }

    public final void setOnSwitchCheckedListener(Function2<? super Long, ? super Boolean, Unit> function2) {
        if (function2 != null) {
            setOnSwitchCheckedListener((n1e) new p1e((Object) function2));
        } else {
            setOnSwitchCheckedListener((n1e) null);
        }
    }

    public void setRippleMask(Shape shape) {
        this.Q0.setShape(shape);
    }

    public final void setStartIcon(int i) {
        AppCompatImageView appCompatImageView = this.H0;
        appCompatImageView.setImageDrawable(ew3.b(getContext(), i));
        appCompatImageView.setVisibility(0);
        requestLayout();
        invalidate();
    }

    public final void setStartIconPadding(int i) {
        this.H0.setPadding(i, i, i, i);
    }

    public final void setThemeDepended(m1e m1e) {
        this.U0.setValue(this, W0[1], m1e);
    }

    public final void setTitle(ngf ngf) {
        this.F0.setText(ngf != null ? ngf.a(getContext()) : null);
        requestLayout();
        invalidate();
    }

    public final void setType(h1e h1e) {
        if (this.S0 != h1e) {
            this.S0 = h1e;
            onThemeChanged(fu4.k.e(getContext()).f());
            requestLayout();
            invalidate();
        }
    }

    public final void setUpperText(ngf ngf) {
        setupUpperText(ngf != null ? ngf.a(getContext()) : null);
        requestLayout();
        invalidate();
    }

    public final void setOnSwitchCheckedListener(n1e n1e) {
        Lazy lazy = this.M0;
        if (lazy.isInitialized()) {
            this.P0 = n1e;
            if (n1e != null) {
                ((z1b) lazy.getValue()).setOnCheckedChangeListener((CompoundButton.OnCheckedChangeListener) null);
                ((z1b) lazy.getValue()).setOnCheckedChangeListener(new u0e(1, this, n1e));
                return;
            }
            ((z1b) lazy.getValue()).setOnCheckedChangeListener((CompoundButton.OnCheckedChangeListener) null);
        }
    }

    public final void setDescription(CharSequence charSequence) {
        setupDescription(charSequence);
        requestLayout();
        invalidate();
    }

    public final void setTitle(CharSequence charSequence) {
        this.F0.setText(charSequence);
        requestLayout();
        invalidate();
    }

    public final void setUpperText(CharSequence charSequence) {
        setupUpperText(charSequence);
        requestLayout();
        invalidate();
    }

    public final void setStartIcon(Drawable drawable) {
        AppCompatImageView appCompatImageView = this.H0;
        appCompatImageView.setImageDrawable(drawable);
        int i = 0;
        if (!(drawable != null)) {
            i = 8;
        }
        appCompatImageView.setVisibility(i);
        requestLayout();
        invalidate();
    }
}
