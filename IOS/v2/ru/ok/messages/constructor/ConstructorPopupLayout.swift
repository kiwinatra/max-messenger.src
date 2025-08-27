package ru.ok.messages.constructor;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;

public class ConstructorPopupLayout extends nrb {
    public l2a v0;
    public ik3 w0 = ik3.a;
    public View x;
    public View y;
    public i1a z;

    public ConstructorPopupLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setCallback(new hk3(this, 0));
    }

    public final void onRestoreInstanceState(Parcelable parcelable) {
        super.onRestoreInstanceState(parcelable);
        if (getScrollState() != 0) {
            setVisibility(0);
        }
    }

    public void setState(ik3 ik3) {
        getContext();
        ch d = ((qra) ym.e()).d();
        setVisibility(0);
        if (ik3 == ik3.a) {
            if (this.w0 == ik3 || this.y.getTop() != 0) {
                this.x.setVisibility(4);
            } else {
                this.y.offsetTopAndBottom(getMeasuredHeight());
                d.g(this.x).v(new gk3(this, 0));
            }
            this.y.setAlpha(1.0f);
            this.y.setVisibility(0);
            setBackground(new ColorDrawable(fw3.a(getContext(), lad.j)));
        } else {
            if (this.w0 == ik3 || this.x.getTop() != 0) {
                this.y.setVisibility(4);
            } else {
                this.x.offsetTopAndBottom(getMeasuredHeight());
                d.g(this.y).v(new gk3(this, 1));
            }
            this.x.setAlpha(1.0f);
            this.x.setVisibility(0);
            setBackground((Drawable) null);
        }
        this.w0 = ik3;
    }
}
