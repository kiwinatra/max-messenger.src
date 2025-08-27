package defpackage;

import android.graphics.Typeface;
import android.text.BoringLayout;
import android.text.Layout;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;

/* renamed from: eq5  reason: default package */
public final class eq5 extends TextView {
    public final boolean isSelected() {
        return getEllipsize() == TextUtils.TruncateAt.MARQUEE || super.isSelected();
    }

    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int compoundPaddingEnd = getCompoundPaddingEnd() + getCompoundPaddingStart();
        int measuredWidth = getMeasuredWidth();
        boolean z = false;
        if (!(getLayout() instanceof BoringLayout)) {
            Layout layout = getLayout();
            float spacingAdd = layout.getSpacingAdd() * ((float) 2);
            int lineCount = layout.getLineCount();
            int i3 = 0;
            for (int i4 = 0; i4 < lineCount; i4++) {
                int ceil = (int) ((float) Math.ceil((double) ((layout.getLineRight(i4) - layout.getLineLeft(i4)) + spacingAdd)));
                boolean z2 = layout.getEllipsisCount(i4) > 0;
                i3 = Math.max(i3, ceil);
                if (z2) {
                    break;
                }
            }
            measuredWidth = Math.min(i3, layout.getEllipsizedWidth()) + compoundPaddingEnd;
        }
        Typeface typeface = getTypeface();
        if (typeface != null) {
            z = typeface.isItalic();
        }
        if (z) {
            measuredWidth = g63.b((float) 1, vo4.c().getDisplayMetrics().density, measuredWidth);
        }
        if (measuredWidth != getMeasuredWidth()) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(measuredWidth, View.MeasureSpec.getMode(i)), i2);
        }
    }
}
