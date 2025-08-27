package defpackage;

import androidx.preference.Preference;
import androidx.preference.PreferenceGroup;
import ru.ok.messages.views.dev.FrgPrefs;

/* renamed from: di6  reason: default package */
public final class di6 extends btb {
    public final /* synthetic */ FrgPrefs X;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public di6(FrgPrefs frgPrefs, PreferenceGroup preferenceGroup) {
        super(preferenceGroup);
        this.X = frgPrefs;
    }

    public final void I(Preference preference) {
        if (preference != null) {
            this.X.getClass();
            FrgPrefs.X2(preference);
        }
        super.I(preference);
    }
}
