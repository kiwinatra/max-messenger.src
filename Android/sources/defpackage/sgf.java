package defpackage;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.TextView;

/* renamed from: sgf  reason: default package */
public final class sgf extends kd8 implements TextWatcher {
    public final TextView b;
    public final cla c;

    public sgf(TextView textView, cla cla) {
        this.b = textView;
        this.c = cla;
    }

    public final void a() {
        this.b.removeTextChangedListener(this);
    }

    public final void afterTextChanged(Editable editable) {
        this.c.d(new rgf(this.b, editable));
    }

    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
