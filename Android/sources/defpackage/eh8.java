package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import androidx.appcompat.widget.AppCompatTextView;

/* renamed from: eh8  reason: default package */
public final class eh8 extends AppCompatTextView {
    public final void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        if (b59.U(edc.textAppearanceLineHeightEnabled, context, true)) {
            TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(i, tnc.MaterialTextAppearance);
            Context context2 = getContext();
            int[] iArr = {tnc.MaterialTextAppearance_android_lineHeight, tnc.MaterialTextAppearance_lineHeight};
            int i2 = -1;
            for (int i3 = 0; i3 < 2 && i2 < 0; i3++) {
                i2 = m5a.D(context2, obtainStyledAttributes, iArr[i3], -1);
            }
            obtainStyledAttributes.recycle();
            if (i2 >= 0) {
                setLineHeight(i2);
            }
        }
    }
}
