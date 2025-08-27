package defpackage;

import android.view.View;
import android.widget.EditText;
import com.google.android.material.textfield.TextInputLayout;

/* renamed from: n65  reason: default package */
public final class n65 {
    public final /* synthetic */ o65 a;

    public n65(o65 o65) {
        this.a = o65;
    }

    public final void a(TextInputLayout textInputLayout) {
        o65 o65 = this.a;
        if (o65.E0 != textInputLayout.getEditText()) {
            EditText editText = o65.E0;
            ojf ojf = o65.H0;
            if (editText != null) {
                editText.removeTextChangedListener(ojf);
                if (o65.E0.getOnFocusChangeListener() == o65.b().e()) {
                    o65.E0.setOnFocusChangeListener((View.OnFocusChangeListener) null);
                }
            }
            EditText editText2 = textInputLayout.getEditText();
            o65.E0 = editText2;
            if (editText2 != null) {
                editText2.addTextChangedListener(ojf);
            }
            o65.b().m(o65.E0);
            o65.j(o65.b());
        }
    }
}
