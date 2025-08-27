package defpackage;

import android.animation.Animator;
import android.content.Context;
import android.text.Editable;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.appcompat.widget.AppCompatImageView;
import kotlin.Lazy;
import kotlin.NoWhenBranchMatchedException;

/* renamed from: oza  reason: default package */
public final class oza implements Animator.AnimatorListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ pza b;
    public final /* synthetic */ Context c;

    public /* synthetic */ oza(pza pza, Context context, int i) {
        this.a = i;
        this.b = pza;
        this.c = context;
    }

    private final void a(Animator animator) {
    }

    private final void b(Animator animator) {
    }

    private final void c(Animator animator) {
    }

    private final void d(Animator animator) {
    }

    public final void onAnimationCancel(Animator animator) {
        int i = this.a;
    }

    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                pza pza = this.b;
                ViewGroup.LayoutParams layoutParams = pza.getLayoutParams();
                if (layoutParams != null) {
                    layoutParams.width = -2;
                    layoutParams.height = -2;
                    int i = 0;
                    pza.setMinimumHeight(0);
                    pza.setLayoutParams(layoutParams);
                    int ordinal = pza.w.ordinal();
                    if (ordinal == 0) {
                        View view = (View) pza.C0.getValue();
                        if (!pza.getShouldShowSearchIcon()) {
                            i = 8;
                        }
                        view.setVisibility(i);
                    } else if (ordinal == 1) {
                        View view2 = (View) pza.B0.getValue();
                        if (!pza.getShouldShowSearchIcon()) {
                            i = 8;
                        }
                        view2.setVisibility(i);
                    } else {
                        throw new NoWhenBranchMatchedException();
                    }
                    ((View) pza.z0.getValue()).setVisibility(8);
                    ((View) pza.D0.getValue()).setVisibility(8);
                    ((View) pza.A0.getValue()).setVisibility(8);
                    ((AppCompatEditText) pza.A0.getValue()).setText((CharSequence) null);
                    pza.y0 = nza.a;
                    mza mza = pza.x;
                    if (mza != null) {
                        mza.L();
                        return;
                    }
                    return;
                }
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            default:
                pza pza2 = this.b;
                ((AppCompatEditText) pza2.A0.getValue()).setHint(pza2.v);
                ((AppCompatEditText) pza2.A0.getValue()).requestFocus();
                InputMethodManager inputMethodManager = (InputMethodManager) fw3.b(this.c, InputMethodManager.class);
                if (inputMethodManager != null) {
                    inputMethodManager.showSoftInput((View) pza2.A0.getValue(), 1);
                }
                pza2.y0 = nza.c;
                mza mza2 = pza2.x;
                if (mza2 != null) {
                    mza2.l();
                    return;
                }
                return;
        }
    }

    public final void onAnimationRepeat(Animator animator) {
        int i = this.a;
    }

    public final void onAnimationStart(Animator animator) {
        switch (this.a) {
            case 0:
                pza pza = this.b;
                ((AppCompatEditText) pza.A0.getValue()).setHint((CharSequence) null);
                InputMethodManager inputMethodManager = (InputMethodManager) fw3.b(this.c, InputMethodManager.class);
                if (inputMethodManager != null) {
                    inputMethodManager.hideSoftInputFromWindow(((AppCompatEditText) pza.A0.getValue()).getWindowToken(), 0);
                }
                pza.y0 = nza.b;
                return;
            default:
                pza pza2 = this.b;
                Lazy lazy = pza2.C0;
                int i = 8;
                if (lazy.isInitialized()) {
                    ((ImageView) lazy.getValue()).setVisibility(8);
                }
                Lazy lazy2 = pza2.B0;
                if (lazy2.isInitialized()) {
                    ((AppCompatImageView) lazy2.getValue()).setVisibility(8);
                }
                ((View) pza2.z0.getValue()).setVisibility(0);
                View view = (View) pza2.D0.getValue();
                Editable text = ((AppCompatEditText) pza2.A0.getValue()).getText();
                if (!(text == null || text.length() == 0)) {
                    i = 0;
                }
                view.setVisibility(i);
                ((View) pza2.A0.getValue()).setVisibility(0);
                pza2.y0 = nza.o;
                return;
        }
    }
}
