package defpackage;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import com.google.android.material.textfield.TextInputLayout;
import java.util.WeakHashMap;

/* renamed from: off  reason: default package */
public final class off implements TextWatcher {
    public int a;
    public final /* synthetic */ EditText b;
    public final /* synthetic */ TextInputLayout c;

    public off(TextInputLayout textInputLayout, EditText editText) {
        this.c = textInputLayout;
        this.b = editText;
        this.a = editText.getLineCount();
    }

    public final void afterTextChanged(Editable editable) {
        TextInputLayout textInputLayout = this.c;
        textInputLayout.u(!textInputLayout.J1, false);
        if (textInputLayout.w0) {
            textInputLayout.n(editable);
        }
        if (textInputLayout.E0) {
            textInputLayout.v(editable);
        }
        EditText editText = this.b;
        int lineCount = editText.getLineCount();
        int i = this.a;
        if (lineCount != i) {
            if (lineCount < i) {
                WeakHashMap weakHashMap = gag.a;
                int minimumHeight = editText.getMinimumHeight();
                int i2 = textInputLayout.C1;
                if (minimumHeight != i2) {
                    editText.setMinimumHeight(i2);
                }
            }
            this.a = lineCount;
        }
    }

    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
