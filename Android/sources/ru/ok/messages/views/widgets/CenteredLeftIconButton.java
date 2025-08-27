package ru.ok.messages.views.widgets;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatButton;

public class CenteredLeftIconButton extends AppCompatButton {
    public final Rect o = new Rect();
    public final Rect v = new Rect();

    public CenteredLeftIconButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 16842824);
    }

    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        CharSequence text = getText();
        boolean isEmpty = TextUtils.isEmpty(text);
        Rect rect = this.o;
        if (!isEmpty) {
            getPaint().getTextBounds(text.toString(), 0, text.length(), rect);
        } else {
            rect.setEmpty();
        }
        int width = getWidth() - (getPaddingRight() + getPaddingLeft());
        Drawable[] compoundDrawablesRelative = getCompoundDrawablesRelative();
        Drawable drawable = compoundDrawablesRelative[0];
        if (drawable != null) {
            Rect rect2 = this.v;
            drawable.copyBounds(rect2);
            boolean z2 = ct.z(this);
            int width2 = (((width - (rect2.width() + rect.width())) + (z2 ? getLeftPaddingOffset() : getRightPaddingOffset())) / 2) - getCompoundDrawablePadding();
            if (z2) {
                width2 = -width2;
            }
            rect2.set(width2, rect2.top, rect2.width() + width2, rect2.bottom);
            compoundDrawablesRelative[0].setBounds(rect2);
        }
    }
}
