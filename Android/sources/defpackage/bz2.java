package defpackage;

import androidx.appcompat.widget.AppCompatCheckBox;

/* renamed from: bz2  reason: default package */
public final class bz2 extends AppCompatCheckBox {
    public int v;

    public int getCompoundPaddingLeft() {
        return super.getCompoundPaddingLeft() + this.v;
    }

    public final int getPaddingBetweenCheckbox() {
        return this.v;
    }

    public final void setPaddingBetweenCheckbox(int i) {
        this.v = i;
        invalidate();
        requestLayout();
    }
}
