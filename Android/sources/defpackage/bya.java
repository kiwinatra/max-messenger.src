package defpackage;

import android.content.res.ColorStateList;
import androidx.appcompat.widget.AppCompatRadioButton;

/* renamed from: bya  reason: default package */
public final class bya extends AppCompatRadioButton implements phf {
    public final void b(boolean z, k2b k2b) {
        int i;
        if (z) {
            k2b.getIcon().getClass();
            i = -16745729;
        } else {
            i = k2b.h().j;
        }
        setButtonTintList(ColorStateList.valueOf(i));
    }

    public final void onThemeChanged(k2b k2b) {
        b(isChecked(), k2b);
    }

    public void setChecked(boolean z) {
        super.setChecked(z);
        b(z, fu4.k.e(getContext()).f());
    }
}
