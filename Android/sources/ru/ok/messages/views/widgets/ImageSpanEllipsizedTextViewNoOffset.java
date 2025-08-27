package ru.ok.messages.views.widgets;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatTextView;

public class ImageSpanEllipsizedTextViewNoOffset extends AppCompatTextView {
    public ImageSpanEllipsizedTextViewNoOffset(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        new Rect();
        new Rect();
    }

    public final void onMeasure(int i, int i2) {
        int i3;
        int i4;
        super.onMeasure(i, i2);
        Drawable[] compoundDrawables = getCompoundDrawables();
        int i5 = 0;
        Drawable drawable = compoundDrawables[0];
        if (drawable != null) {
            i4 = drawable.getIntrinsicWidth();
            i3 = getCompoundDrawablePadding();
        } else {
            i4 = 0;
            i3 = 0;
        }
        Drawable drawable2 = compoundDrawables[2];
        if (drawable2 != null) {
            i5 = drawable2.getIntrinsicWidth();
            i3 += getCompoundDrawablePadding();
        }
        setText(TextUtils.ellipsize(getText(), getPaint(), (float) (((((getMeasuredWidth() - getPaddingRight()) - getPaddingLeft()) - i4) - i5) - i3), TextUtils.TruncateAt.END));
    }
}
