package defpackage;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import java.util.Iterator;

/* renamed from: nee  reason: default package */
public final class nee implements TextWatcher {
    public final /* synthetic */ oee a;
    public final /* synthetic */ int b;

    public nee(oee oee, int i) {
        this.a = oee;
        this.b = i;
    }

    public final void afterTextChanged(Editable editable) {
    }

    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        hg3 hg3;
        lg7 J0;
        int length = charSequence != null ? charSequence.length() : 0;
        String obj = charSequence != null ? charSequence.subSequence(i, i3 + i).toString() : null;
        String str = "";
        if (obj == null) {
            obj = str;
        }
        int i4 = this.b;
        oee oee = this.a;
        if (length == 2 && obj.length() == 1) {
            lg3 lg3 = (lg3) oee.E0;
            if (lg3.K0(i4) && obj.length() == 1) {
                lg7 J02 = lg3.J0(i4);
                if (J02 != null) {
                    ((oee) J02).N(obj);
                }
                lg7 J03 = lg3.J0(i4 + 1);
                if (J03 != null) {
                    ((oee) J03).F0.requestFocus();
                }
            }
        } else if (length > 1) {
            ((lg3) oee.E0).L0(i4, String.valueOf(charSequence));
        } else {
            fg7 fg7 = oee.E0;
            String valueOf = String.valueOf(charSequence);
            lg3 lg32 = (lg3) fg7;
            if (lg32.K0(i4) && valueOf.length() == 1) {
                if (i4 < lg32.getCountCells() - 1 && (J0 = lg32.J0(i4 + 1)) != null) {
                    ((oee) J0).F0.requestFocus();
                }
                Iterator it = lg3.I0(lg32).iterator();
                while (it.hasNext()) {
                    str = tr1.j(str, ((oee) ((lg7) it.next())).M());
                }
                if (str.length() > 0 && str.length() == lg32.getCountCells() && TextUtils.isDigitsOnly(str) && (hg3 = lg32.U1) != null) {
                    hg3.c(str);
                }
            }
        }
    }
}
