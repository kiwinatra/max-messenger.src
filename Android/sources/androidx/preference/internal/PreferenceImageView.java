package androidx.preference.internal;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import kotlin.jvm.internal.IntCompanionObject;

@SuppressLint({"AppCompatCustomView"})
public class PreferenceImageView extends ImageView {
    public int a = IntCompanionObject.MAX_VALUE;
    public int b = IntCompanionObject.MAX_VALUE;

    public PreferenceImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, nnc.PreferenceImageView, 0, 0);
        setMaxWidth(obtainStyledAttributes.getDimensionPixelSize(nnc.PreferenceImageView_maxWidth, IntCompanionObject.MAX_VALUE));
        setMaxHeight(obtainStyledAttributes.getDimensionPixelSize(nnc.PreferenceImageView_maxHeight, IntCompanionObject.MAX_VALUE));
        obtainStyledAttributes.recycle();
    }

    public int getMaxHeight() {
        return this.b;
    }

    public int getMaxWidth() {
        return this.a;
    }

    public final void onMeasure(int i, int i2) {
        int mode = View.MeasureSpec.getMode(i);
        if (mode == Integer.MIN_VALUE || mode == 0) {
            int size = View.MeasureSpec.getSize(i);
            int maxWidth = getMaxWidth();
            if (maxWidth != Integer.MAX_VALUE && (maxWidth < size || mode == 0)) {
                i = View.MeasureSpec.makeMeasureSpec(maxWidth, IntCompanionObject.MIN_VALUE);
            }
        }
        int mode2 = View.MeasureSpec.getMode(i2);
        if (mode2 == Integer.MIN_VALUE || mode2 == 0) {
            int size2 = View.MeasureSpec.getSize(i2);
            int maxHeight = getMaxHeight();
            if (maxHeight != Integer.MAX_VALUE && (maxHeight < size2 || mode2 == 0)) {
                i2 = View.MeasureSpec.makeMeasureSpec(maxHeight, IntCompanionObject.MIN_VALUE);
            }
        }
        super.onMeasure(i, i2);
    }

    public void setMaxHeight(int i) {
        this.b = i;
        super.setMaxHeight(i);
    }

    public void setMaxWidth(int i) {
        this.a = i;
        super.setMaxWidth(i);
    }
}
