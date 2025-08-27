package androidx.preference;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class DropDownPreference extends ListPreference {
    public final ArrayAdapter h1;
    public Spinner i1;
    public final bx4 j1 = new bx4(0, this);

    public DropDownPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, cdc.dropdownPreferenceStyle);
        ArrayAdapter arrayAdapter = new ArrayAdapter(context, 17367049);
        this.h1 = arrayAdapter;
        arrayAdapter.clear();
        CharSequence[] charSequenceArr = this.c1;
        if (charSequenceArr != null) {
            for (CharSequence charSequence : charSequenceArr) {
                arrayAdapter.add(charSequence.toString());
            }
        }
    }

    public final void h() {
        super.h();
        ArrayAdapter arrayAdapter = this.h1;
        if (arrayAdapter != null) {
            arrayAdapter.notifyDataSetChanged();
        }
    }

    public final void l(ftb ftb) {
        int i;
        CharSequence[] charSequenceArr;
        Spinner spinner = (Spinner) ftb.a.findViewById(vfc.spinner);
        this.i1 = spinner;
        spinner.setAdapter(this.h1);
        this.i1.setOnItemSelectedListener(this.j1);
        Spinner spinner2 = this.i1;
        String str = this.e1;
        if (str != null && (charSequenceArr = this.d1) != null) {
            i = charSequenceArr.length - 1;
            while (true) {
                if (i < 0) {
                    break;
                } else if (TextUtils.equals(charSequenceArr[i].toString(), str)) {
                    break;
                } else {
                    i--;
                }
            }
        }
        i = -1;
        spinner2.setSelection(i);
        super.l(ftb);
    }

    public final void m() {
        this.i1.performClick();
    }
}
