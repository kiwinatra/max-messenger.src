package ru.ok.tamtam.stickers.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;

public class SquareConstraintLayout extends ConstraintLayout {
    public SquareConstraintLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public final void onMeasure(int i, int i2) {
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824);
        super.onMeasure(makeMeasureSpec, makeMeasureSpec);
    }
}
