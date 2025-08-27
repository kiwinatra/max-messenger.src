package defpackage;

import android.text.Editable;
import android.text.TextUtils;
import com.google.android.material.timepicker.g;

/* renamed from: ojf  reason: default package */
public final class ojf extends chf {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ojf(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    public final void afterTextChanged(Editable editable) {
        switch (this.a) {
            case 0:
                try {
                    boolean isEmpty = TextUtils.isEmpty(editable);
                    g gVar = (g) this.b;
                    if (isEmpty) {
                        gVar.b.d(0);
                        return;
                    }
                    gVar.b.d(Integer.parseInt(editable.toString()));
                    return;
                } catch (NumberFormatException unused) {
                    return;
                }
            case 1:
                try {
                    boolean isEmpty2 = TextUtils.isEmpty(editable);
                    g gVar2 = (g) this.b;
                    if (isEmpty2) {
                        gVar2.b.c(0);
                        return;
                    }
                    gVar2.b.c(Integer.parseInt(editable.toString()));
                    return;
                } catch (NumberFormatException unused2) {
                    return;
                }
            default:
                ((o65) this.b).b().a();
                return;
        }
    }

    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        switch (this.a) {
            case 2:
                ((o65) this.b).b().b();
                return;
            default:
                return;
        }
    }
}
