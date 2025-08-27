package androidx.preference;

import android.os.Bundle;
import android.os.SystemClock;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;

public class EditTextPreferenceDialogFragmentCompat extends PreferenceDialogFragmentCompat {
    public EditText J1;
    public CharSequence K1;
    public final cf L1 = new cf(19, this);
    public long M1 = -1;

    public final boolean a3() {
        return true;
    }

    public void b3(View view) {
        super.b3(view);
        EditText editText = (EditText) view.findViewById(16908291);
        this.J1 = editText;
        if (editText != null) {
            editText.requestFocus();
            this.J1.setText(this.K1);
            EditText editText2 = this.J1;
            editText2.setSelection(editText2.getText().length());
            ((EditTextPreference) Z2()).getClass();
            return;
        }
        throw new IllegalStateException("Dialog view must contain an EditText with id @android:id/edit");
    }

    public final void c3(boolean z) {
        if (z) {
            String obj = this.J1.getText().toString();
            EditTextPreference editTextPreference = (EditTextPreference) Z2();
            if (editTextPreference.a(obj)) {
                editTextPreference.A(obj);
            }
        }
    }

    public final void e3() {
        this.M1 = SystemClock.currentThreadTimeMillis();
        f3();
    }

    public final void f3() {
        long j = this.M1;
        if (j != -1 && j + 1000 > SystemClock.currentThreadTimeMillis()) {
            EditText editText = this.J1;
            if (editText == null || !editText.isFocused()) {
                this.M1 = -1;
            } else if (((InputMethodManager) this.J1.getContext().getSystemService("input_method")).showSoftInput(this.J1, 0)) {
                this.M1 = -1;
            } else {
                EditText editText2 = this.J1;
                cf cfVar = this.L1;
                editText2.removeCallbacks(cfVar);
                this.J1.postDelayed(cfVar, 50);
            }
        }
    }

    public final void i2(Bundle bundle) {
        super.i2(bundle);
        if (bundle == null) {
            this.K1 = ((EditTextPreference) Z2()).c1;
        } else {
            this.K1 = bundle.getCharSequence("EditTextPreferenceDialogFragment.text");
        }
    }

    public final void x2(Bundle bundle) {
        super.x2(bundle);
        bundle.putCharSequence("EditTextPreferenceDialogFragment.text", this.K1);
    }
}
