package defpackage;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.appcompat.widget.AppCompatImageView;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.NoWhenBranchMatchedException;
import kotlin.math.MathKt;

/* renamed from: pza  reason: default package */
public final class pza extends FrameLayout implements phf {
    public final Lazy A0;
    public final Lazy B0;
    public final Lazy C0;
    public final Lazy D0;
    public final ValueAnimator E0;
    public final ValueAnimator F0;
    public final int a = getResources().getDimensionPixelSize(lec.spacing_size_s);
    public final int b = getResources().getDimensionPixelSize(lec.spacing_size_l);
    public final int c = getResources().getDimensionPixelSize(lec.spacing_size_xl);
    public CharSequence o;
    public String v = getResources().getString(qmc.oneme_search_view_default_hint);
    public boolean v0 = true;
    public lza w = lza.a;
    public boolean w0 = true;
    public mza x;
    public boolean x0 = true;
    public boolean y = true;
    public nza y0 = nza.a;
    public boolean z = true;
    public final Lazy z0;

    public pza(Context context) {
        super(context, (AttributeSet) null);
        iza iza = new iza(context, (AttributeSet) null, this, 0);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.z0 = LazyKt.lazy(lazyThreadSafetyMode, iza);
        this.A0 = LazyKt.lazy(lazyThreadSafetyMode, new iza(context, (AttributeSet) null, this, 1));
        this.B0 = LazyKt.lazy(lazyThreadSafetyMode, new iza(context, (AttributeSet) null, this, 2));
        this.C0 = LazyKt.lazy(lazyThreadSafetyMode, new iza(context, (AttributeSet) null, this, 3));
        this.D0 = LazyKt.lazy(lazyThreadSafetyMode, new iza(context, (AttributeSet) null, this, 4));
        ValueAnimator duration = ValueAnimator.ofInt(new int[]{120}).setDuration(120);
        duration.addListener(new oza(this, context, 1));
        duration.addUpdateListener(new kza(this, 0));
        this.E0 = duration;
        ValueAnimator duration2 = ValueAnimator.ofInt(new int[]{120}).setDuration(120);
        duration2.addListener(new oza(this, context, 0));
        duration2.addUpdateListener(new kza(this, 1));
        this.F0 = duration2;
    }

    public static void a(Animator animator) {
        ArrayList arrayList = new ArrayList(animator.getListeners());
        animator.removeAllListeners();
        animator.cancel();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            animator.addListener((Animator.AnimatorListener) it.next());
        }
    }

    public final void b() {
        if (this.v0) {
            a(this.E0);
            float f = this.x0 ? c44.DEFAULT_ASPECT_RATIO : 1.0f;
            ValueAnimator valueAnimator = this.F0;
            valueAnimator.setCurrentFraction(f);
            valueAnimator.start();
        }
    }

    public final void c() {
        if (this.z) {
            a(this.F0);
            this.E0.setCurrentFraction(this.w0 ? c44.DEFAULT_ASPECT_RATIO : 1.0f);
            addOnLayoutChangeListener(new dr0(10, this));
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            if (layoutParams != null) {
                layoutParams.width = -1;
                layoutParams.height = -2;
                setMinimumHeight(MathKt.roundToInt(((float) 52) * vo4.c().getDisplayMetrics().density));
                setLayoutParams(layoutParams);
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
    }

    public final void d() {
        c();
        mza mza = this.x;
        if (mza != null) {
            mza.d();
        }
    }

    public final boolean getCollapseWithAnimation() {
        return this.x0;
    }

    public final boolean getExpandWithAnimation() {
        return this.w0;
    }

    public final boolean getShouldShowSearchIcon() {
        return this.y;
    }

    public final nza getState() {
        return this.y0;
    }

    public final void onThemeChanged(k2b k2b) {
        Lazy lazy = this.B0;
        if (lazy.isInitialized()) {
            ((AppCompatImageView) lazy.getValue()).setImageTintList(ColorStateList.valueOf(k2b.getIcon().f));
        }
        Lazy lazy2 = this.z0;
        if (lazy2.isInitialized()) {
            ((AppCompatImageView) lazy2.getValue()).setImageTintList(ColorStateList.valueOf(k2b.getIcon().f));
        }
        Lazy lazy3 = this.D0;
        if (lazy3.isInitialized()) {
            ((AppCompatImageView) lazy3.getValue()).setImageTintList(ColorStateList.valueOf(k2b.getIcon().i));
        }
        Lazy lazy4 = this.A0;
        if (lazy4.isInitialized()) {
            AppCompatEditText appCompatEditText = (AppCompatEditText) lazy4.getValue();
            Drawable textCursorDrawable = appCompatEditText.getTextCursorDrawable();
            if (textCursorDrawable != null) {
                k2b.getText().getClass();
                iq.a0(textCursorDrawable, -16745729);
            }
            appCompatEditText.setBackgroundColor(k2b.c().a.g);
            appCompatEditText.setHintTextColor(k2b.getText().f);
            appCompatEditText.setTextColor(k2b.getText().e);
        }
    }

    public final void setCollapseWithAnimation(boolean z2) {
        this.x0 = z2;
    }

    public final void setCollapsedStyle(lza lza) {
        this.w = lza;
        int ordinal = lza.ordinal();
        int i = 0;
        Lazy lazy = this.B0;
        Lazy lazy2 = this.C0;
        if (ordinal == 0) {
            if (lazy.isInitialized()) {
                ((AppCompatImageView) lazy.getValue()).setVisibility(8);
            }
            if (this.y0 == nza.a) {
                View view = (View) lazy2.getValue();
                if (!this.y) {
                    i = 8;
                }
                view.setVisibility(i);
            }
        } else if (ordinal == 1) {
            if (lazy2.isInitialized()) {
                ((ImageView) lazy2.getValue()).setVisibility(8);
            }
            if (this.y0 == nza.a) {
                View view2 = (View) lazy.getValue();
                if (!this.y) {
                    i = 8;
                }
                view2.setVisibility(i);
            }
        } else {
            throw new NoWhenBranchMatchedException();
        }
    }

    public final void setCollapsible(boolean z2) {
        this.v0 = z2;
    }

    public final void setExpandWithAnimation(boolean z2) {
        this.w0 = z2;
    }

    public final void setExpandable(boolean z2) {
        this.z = z2;
    }

    public final void setListener(mza mza) {
        this.x = mza;
    }

    public final void setSearchHint(String str) {
        this.v = str;
        Lazy lazy = this.A0;
        if (lazy.isInitialized()) {
            ((AppCompatEditText) lazy.getValue()).setHint(str);
        }
    }

    public final void setSearchText(CharSequence charSequence) {
        this.o = charSequence;
        Lazy lazy = this.A0;
        if (lazy.isInitialized()) {
            AppCompatEditText appCompatEditText = (AppCompatEditText) lazy.getValue();
            appCompatEditText.setText(charSequence);
            appCompatEditText.setSelection(appCompatEditText.length());
        }
    }

    public final void setShouldShowSearchIcon(boolean z2) {
        this.y = z2;
    }
}
