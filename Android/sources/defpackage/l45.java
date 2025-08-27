package defpackage;

import android.text.Editable;
import android.text.TextWatcher;

/* renamed from: l45  reason: default package */
public final class l45 implements TextWatcher {
    public boolean a;

    public final void afterTextChanged(Editable editable) {
        if (!this.a) {
            this.a = true;
            String obj = editable.toString();
            String[][] strArr = hsg.a;
            for (int i = 0; i < 66; i++) {
                String[] strArr2 = strArr[i];
                int indexOf = obj.indexOf(strArr2[0]);
                if (indexOf != -1) {
                    editable.replace(indexOf, strArr2[0].length() + indexOf, strArr2[1]);
                }
            }
            this.a = false;
        }
    }

    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
