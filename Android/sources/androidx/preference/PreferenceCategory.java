package androidx.preference;

import android.content.Context;
import android.util.AttributeSet;

public class PreferenceCategory extends PreferenceGroup {
    public PreferenceCategory(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, b0h.s(cdc.preferenceCategoryStyle, 16842892, context));
    }

    public final boolean g() {
        return false;
    }

    public final void l(ftb ftb) {
        super.l(ftb);
        ftb.a.setAccessibilityHeading(true);
    }

    public final boolean w() {
        return !super.g();
    }
}
