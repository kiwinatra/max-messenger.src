package defpackage;

import android.view.View;
import android.widget.AdapterView;
import androidx.preference.DropDownPreference;

/* renamed from: bx4  reason: default package */
public final class bx4 implements AdapterView.OnItemSelectedListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ bx4(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    private final void a(AdapterView adapterView) {
    }

    private final void b(AdapterView adapterView) {
    }

    private final void c(AdapterView adapterView) {
    }

    public final void onItemSelected(AdapterView adapterView, View view, int i, long j) {
        ax4 ax4;
        switch (this.a) {
            case 0:
                if (i >= 0) {
                    DropDownPreference dropDownPreference = (DropDownPreference) this.b;
                    String charSequence = dropDownPreference.d1[i].toString();
                    if (!charSequence.equals(dropDownPreference.e1) && dropDownPreference.a(charSequence)) {
                        dropDownPreference.C(charSequence);
                        return;
                    }
                    return;
                }
                return;
            case 1:
                if (i != -1 && (ax4 = ((sz7) this.b).c) != null) {
                    ax4.setListSelectionHidden(false);
                    return;
                }
                return;
            default:
                ((gmd) this.b).onItemSelected(i);
                return;
        }
    }

    public final void onNothingSelected(AdapterView adapterView) {
        int i = this.a;
    }
}
