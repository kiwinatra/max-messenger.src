package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ViewTreeObserver;
import android.widget.ListAdapter;
import android.widget.SpinnerAdapter;

/* renamed from: xo  reason: default package */
public final class xo extends sz7 implements zo {
    public CharSequence J0;
    public ListAdapter K0;
    public final Rect L0 = new Rect();
    public int M0;
    public final /* synthetic */ ap N0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public xo(ap apVar, Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i, 0);
        this.N0 = apVar;
        this.x0 = apVar;
        this.H0 = true;
        this.I0.setFocusable(true);
        this.y0 = new vo(0, this);
    }

    public final CharSequence g() {
        return this.J0;
    }

    public final void h(CharSequence charSequence) {
        this.J0 = charSequence;
    }

    public final void l(int i) {
        this.M0 = i;
    }

    public final void m(int i, int i2) {
        ViewTreeObserver viewTreeObserver;
        mo moVar = this.I0;
        boolean isShowing = moVar.isShowing();
        s();
        this.I0.setInputMethodMode(2);
        b();
        ax4 ax4 = this.c;
        ax4.setChoiceMode(1);
        ax4.setTextDirection(i);
        ax4.setTextAlignment(i2);
        ap apVar = this.N0;
        int selectedItemPosition = apVar.getSelectedItemPosition();
        ax4 ax42 = this.c;
        if (moVar.isShowing() && ax42 != null) {
            ax42.setListSelectionHidden(false);
            ax42.setSelection(selectedItemPosition);
            if (ax42.getChoiceMode() != 0) {
                ax42.setItemChecked(selectedItemPosition, true);
            }
        }
        if (!isShowing && (viewTreeObserver = apVar.getViewTreeObserver()) != null) {
            ro roVar = new ro(1, this);
            viewTreeObserver.addOnGlobalLayoutListener(roVar);
            this.I0.setOnDismissListener(new wo(this, roVar));
        }
    }

    public final void p(ListAdapter listAdapter) {
        super.p(listAdapter);
        this.K0 = listAdapter;
    }

    public final void s() {
        int i;
        mo moVar = this.I0;
        Drawable background = moVar.getBackground();
        ap apVar = this.N0;
        if (background != null) {
            background.getPadding(apVar.y);
            int layoutDirection = apVar.getLayoutDirection();
            Rect rect = apVar.y;
            i = layoutDirection == 1 ? rect.right : -rect.left;
        } else {
            Rect rect2 = apVar.y;
            rect2.right = 0;
            rect2.left = 0;
            i = 0;
        }
        int paddingLeft = apVar.getPaddingLeft();
        int paddingRight = apVar.getPaddingRight();
        int width = apVar.getWidth();
        int i2 = apVar.x;
        if (i2 == -2) {
            int a = apVar.a((SpinnerAdapter) this.K0, moVar.getBackground());
            int i3 = apVar.getContext().getResources().getDisplayMetrics().widthPixels;
            Rect rect3 = apVar.y;
            int i4 = (i3 - rect3.left) - rect3.right;
            if (a > i4) {
                a = i4;
            }
            r(Math.max(a, (width - paddingLeft) - paddingRight));
        } else if (i2 == -1) {
            r((width - paddingLeft) - paddingRight);
        } else {
            r(i2);
        }
        this.w = apVar.getLayoutDirection() == 1 ? (((width - paddingRight) - this.v) - this.M0) + i : paddingLeft + this.M0 + i;
    }
}
