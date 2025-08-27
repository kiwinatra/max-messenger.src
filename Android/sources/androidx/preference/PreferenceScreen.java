package androidx.preference;

import android.content.Context;
import android.util.AttributeSet;
import androidx.fragment.app.a;

public final class PreferenceScreen extends PreferenceGroup {
    public final boolean e1 = true;

    public PreferenceScreen(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, b0h.s(cdc.preferenceScreenStyle, 16842891, context));
    }

    public final void m() {
        PreferenceFragmentCompat preferenceFragmentCompat;
        if (this.v0 == null && this.w0 == null && C() != 0 && (preferenceFragmentCompat = this.b.j) != null) {
            for (a aVar = preferenceFragmentCompat; aVar != null; aVar = aVar.G0) {
            }
            preferenceFragmentCompat.O1();
            preferenceFragmentCompat.M1();
        }
    }
}
